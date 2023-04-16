package kotlinx.coroutines.scheduling;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3357i;
import kotlinx.coroutines.internal.C3370b0;
import kotlinx.coroutines.internal.C3377e0;
import p016b5.C1322c;
import p016b5.C1384o0;
import p016b5.C1387p0;
import p079k4.C3330q;
import p151v4.C4241c;

/* renamed from: kotlinx.coroutines.scheduling.a */
public final class C3423a implements Executor, Closeable {

    /* renamed from: m */
    public static final C3424a f20929m = new C3424a((C3353e) null);

    /* renamed from: n */
    private static final /* synthetic */ AtomicLongFieldUpdater f20930n = AtomicLongFieldUpdater.newUpdater(C3423a.class, "parkedWorkersStack");

    /* renamed from: o */
    static final /* synthetic */ AtomicLongFieldUpdater f20931o = AtomicLongFieldUpdater.newUpdater(C3423a.class, "controlState");

    /* renamed from: p */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f20932p = AtomicIntegerFieldUpdater.newUpdater(C3423a.class, "_isTerminated");

    /* renamed from: q */
    public static final C3377e0 f20933q = new C3377e0("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;

    /* renamed from: f */
    public final int f20934f;

    /* renamed from: g */
    public final int f20935g;

    /* renamed from: h */
    public final long f20936h;

    /* renamed from: i */
    public final String f20937i;

    /* renamed from: j */
    public final C3430d f20938j;

    /* renamed from: k */
    public final C3430d f20939k;

    /* renamed from: l */
    public final C3370b0<C3426c> f20940l;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: kotlinx.coroutines.scheduling.a$a */
    public static final class C3424a {
        private C3424a() {
        }

        public /* synthetic */ C3424a(C3353e eVar) {
            this();
        }
    }

    /* renamed from: kotlinx.coroutines.scheduling.a$b */
    public /* synthetic */ class C3425b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20941a;

        static {
            int[] iArr = new int[C3427d.values().length];
            iArr[C3427d.PARKING.ordinal()] = 1;
            iArr[C3427d.BLOCKING.ordinal()] = 2;
            iArr[C3427d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[C3427d.DORMANT.ordinal()] = 4;
            iArr[C3427d.TERMINATED.ordinal()] = 5;
            f20941a = iArr;
        }
    }

    /* renamed from: kotlinx.coroutines.scheduling.a$c */
    public final class C3426c extends Thread {

        /* renamed from: m */
        static final /* synthetic */ AtomicIntegerFieldUpdater f20942m = AtomicIntegerFieldUpdater.newUpdater(C3426c.class, "workerCtl");

        /* renamed from: f */
        public final C3440n f20943f;

        /* renamed from: g */
        public C3427d f20944g;

        /* renamed from: h */
        private long f20945h;

        /* renamed from: i */
        private long f20946i;
        private volatile int indexInArray;

        /* renamed from: j */
        private int f20947j;

        /* renamed from: k */
        public boolean f20948k;
        private volatile Object nextParkedWorker;
        volatile /* synthetic */ int workerCtl;

        private C3426c() {
            setDaemon(true);
            this.f20943f = new C3440n();
            this.f20944g = C3427d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = C3423a.f20933q;
            this.f20947j = C4241c.f22516f.mo15784b();
        }

        public C3426c(int i) {
            this();
            mo14487o(i);
        }

        /* renamed from: b */
        private final void m24732b(int i) {
            if (i != 0) {
                C3423a.f20931o.addAndGet(C3423a.this, -2097152);
                C3427d dVar = this.f20944g;
                if (dVar != C3427d.TERMINATED) {
                    if (C1384o0.m5425a()) {
                        if (!(dVar == C3427d.BLOCKING)) {
                            throw new AssertionError();
                        }
                    }
                    this.f20944g = C3427d.DORMANT;
                }
            }
        }

        /* renamed from: c */
        private final void m24733c(int i) {
            if (i != 0 && mo14490s(C3427d.BLOCKING)) {
                C3423a.this.mo14476O();
            }
        }

        /* renamed from: d */
        private final void m24734d(C3434h hVar) {
            int b = hVar.f20966g.mo14497b();
            m24736i(b);
            m24733c(b);
            C3423a.this.mo14474G(hVar);
            m24732b(b);
        }

        /* renamed from: e */
        private final C3434h m24735e(boolean z) {
            C3434h m;
            C3434h m2;
            if (z) {
                boolean z2 = mo14486k(C3423a.this.f20934f * 2) == 0;
                if (z2 && (m2 = m24739m()) != null) {
                    return m2;
                }
                C3434h h = this.f20943f.mo14504h();
                if (h != null) {
                    return h;
                }
                if (!z2 && (m = m24739m()) != null) {
                    return m;
                }
            } else {
                C3434h m3 = m24739m();
                if (m3 != null) {
                    return m3;
                }
            }
            return m24743t(false);
        }

        /* renamed from: i */
        private final void m24736i(int i) {
            this.f20945h = 0;
            if (this.f20944g == C3427d.PARKING) {
                if (C1384o0.m5425a()) {
                    boolean z = true;
                    if (i != 1) {
                        z = false;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
                this.f20944g = C3427d.BLOCKING;
            }
        }

        /* renamed from: j */
        private final boolean m24737j() {
            return this.nextParkedWorker != C3423a.f20933q;
        }

        /* renamed from: l */
        private final void m24738l() {
            if (this.f20945h == 0) {
                this.f20945h = System.nanoTime() + C3423a.this.f20936h;
            }
            LockSupport.parkNanos(C3423a.this.f20936h);
            if (System.nanoTime() - this.f20945h >= 0) {
                this.f20945h = 0;
                m24744u();
            }
        }

        /* renamed from: m */
        private final C3434h m24739m() {
            C3430d dVar;
            if (mo14486k(2) == 0) {
                C3434h hVar = (C3434h) C3423a.this.f20938j.mo14457d();
                if (hVar != null) {
                    return hVar;
                }
                dVar = C3423a.this.f20939k;
            } else {
                C3434h hVar2 = (C3434h) C3423a.this.f20939k.mo14457d();
                if (hVar2 != null) {
                    return hVar2;
                }
                dVar = C3423a.this.f20938j;
            }
            return (C3434h) dVar.mo14457d();
        }

        /* renamed from: n */
        private final void m24740n() {
            loop0:
            while (true) {
                boolean z = false;
                while (!C3423a.this.isTerminated() && this.f20944g != C3427d.TERMINATED) {
                    C3434h f = mo14483f(this.f20948k);
                    if (f != null) {
                        this.f20946i = 0;
                        m24734d(f);
                    } else {
                        this.f20948k = false;
                        if (this.f20946i == 0) {
                            m24742r();
                        } else if (!z) {
                            z = true;
                        } else {
                            mo14490s(C3427d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f20946i);
                            this.f20946i = 0;
                        }
                    }
                }
            }
            mo14490s(C3427d.TERMINATED);
        }

        /* renamed from: q */
        private final boolean m24741q() {
            boolean z;
            if (this.f20944g != C3427d.CPU_ACQUIRED) {
                C3423a aVar = C3423a.this;
                while (true) {
                    long j = aVar.controlState;
                    if (((int) ((9223367638808264704L & j) >> 42)) != 0) {
                        if (C3423a.f20931o.compareAndSet(aVar, j, j - 4398046511104L)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
                this.f20944g = C3427d.CPU_ACQUIRED;
            }
            return true;
        }

        /* renamed from: r */
        private final void m24742r() {
            if (!m24737j()) {
                C3423a.this.mo14472B(this);
                return;
            }
            if (C1384o0.m5425a()) {
                if (!(this.f20943f.mo14502f() == 0)) {
                    throw new AssertionError();
                }
            }
            this.workerCtl = -1;
            while (m24737j() && this.workerCtl == -1 && !C3423a.this.isTerminated() && this.f20944g != C3427d.TERMINATED) {
                mo14490s(C3427d.PARKING);
                Thread.interrupted();
                m24738l();
            }
        }

        /* renamed from: t */
        private final C3434h m24743t(boolean z) {
            if (C1384o0.m5425a()) {
                if (!(this.f20943f.mo14502f() == 0)) {
                    throw new AssertionError();
                }
            }
            int i = (int) (C3423a.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int k = mo14486k(i);
            C3423a aVar = C3423a.this;
            int i2 = 0;
            long j = Long.MAX_VALUE;
            while (i2 < i) {
                i2++;
                k++;
                if (k > i) {
                    k = 1;
                }
                C3426c b = aVar.f20940l.mo14401b(k);
                if (!(b == null || b == this)) {
                    if (C1384o0.m5425a()) {
                        if (!(this.f20943f.mo14502f() == 0)) {
                            throw new AssertionError();
                        }
                    }
                    C3440n nVar = this.f20943f;
                    C3440n nVar2 = b.f20943f;
                    long k2 = z ? nVar.mo14505k(nVar2) : nVar.mo14506l(nVar2);
                    if (k2 == -1) {
                        return this.f20943f.mo14504h();
                    }
                    if (k2 > 0) {
                        j = Math.min(j, k2);
                    }
                }
            }
            if (j == Long.MAX_VALUE) {
                j = 0;
            }
            this.f20946i = j;
            return null;
        }

        /* renamed from: u */
        private final void m24744u() {
            C3423a aVar = C3423a.this;
            synchronized (aVar.f20940l) {
                if (!aVar.isTerminated()) {
                    if (((int) (aVar.controlState & 2097151)) > aVar.f20934f) {
                        if (f20942m.compareAndSet(this, -1, 1)) {
                            int g = mo14484g();
                            mo14487o(0);
                            aVar.mo14473F(this, g, 0);
                            int andDecrement = (int) (C3423a.f20931o.getAndDecrement(aVar) & 2097151);
                            if (andDecrement != g) {
                                C3426c b = aVar.f20940l.mo14401b(andDecrement);
                                C3357i.m24505b(b);
                                C3426c cVar = b;
                                aVar.f20940l.mo14402c(g, cVar);
                                cVar.mo14487o(g);
                                aVar.mo14473F(cVar, andDecrement, g);
                            }
                            aVar.f20940l.mo14402c(andDecrement, null);
                            C3330q qVar = C3330q.f20829a;
                            this.f20944g = C3427d.TERMINATED;
                        }
                    }
                }
            }
        }

        /* renamed from: f */
        public final C3434h mo14483f(boolean z) {
            C3434h hVar;
            if (m24741q()) {
                return m24735e(z);
            }
            if (!z || (hVar = this.f20943f.mo14504h()) == null) {
                hVar = (C3434h) C3423a.this.f20939k.mo14457d();
            }
            return hVar == null ? m24743t(true) : hVar;
        }

        /* renamed from: g */
        public final int mo14484g() {
            return this.indexInArray;
        }

        /* renamed from: h */
        public final Object mo14485h() {
            return this.nextParkedWorker;
        }

        /* renamed from: k */
        public final int mo14486k(int i) {
            int i2 = this.f20947j;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f20947j = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        /* renamed from: o */
        public final void mo14487o(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(C3423a.this.f20937i);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: p */
        public final void mo14488p(Object obj) {
            this.nextParkedWorker = obj;
        }

        public void run() {
            m24740n();
        }

        /* renamed from: s */
        public final boolean mo14490s(C3427d dVar) {
            C3427d dVar2 = this.f20944g;
            boolean z = dVar2 == C3427d.CPU_ACQUIRED;
            if (z) {
                C3423a.f20931o.addAndGet(C3423a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f20944g = dVar;
            }
            return z;
        }
    }

    /* renamed from: kotlinx.coroutines.scheduling.a$d */
    public enum C3427d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public C3423a(int i, int i2, long j, String str) {
        this.f20934f = i;
        this.f20935g = i2;
        this.f20936h = j;
        this.f20937i = str;
        boolean z = true;
        if (i >= 1) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j <= 0 ? false : z) {
                        this.f20938j = new C3430d();
                        this.f20939k = new C3430d();
                        this.parkedWorkersStack = 0;
                        this.f20940l = new C3370b0<>(i + 1);
                        this.controlState = ((long) i) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
    }

    /* renamed from: N */
    private final void m24713N(boolean z) {
        long addAndGet = f20931o.addAndGet(this, 2097152);
        if (!z && !m24717S() && !m24715Q(addAndGet)) {
            m24717S();
        }
    }

    /* renamed from: P */
    private final C3434h m24714P(C3426c cVar, C3434h hVar, boolean z) {
        if (cVar == null || cVar.f20944g == C3427d.TERMINATED) {
            return hVar;
        }
        if (hVar.f20966g.mo14497b() == 0 && cVar.f20944g == C3427d.BLOCKING) {
            return hVar;
        }
        cVar.f20948k = true;
        return cVar.f20943f.mo14500a(hVar, z);
    }

    /* renamed from: Q */
    private final boolean m24715Q(long j) {
        if (C4357f.m26993a(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.f20934f) {
            int h = m24719h();
            if (h == 1 && this.f20934f > 1) {
                m24719h();
            }
            if (h > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: R */
    static /* synthetic */ boolean m24716R(C3423a aVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = aVar.controlState;
        }
        return aVar.m24715Q(j);
    }

    /* renamed from: S */
    private final boolean m24717S() {
        C3426c z;
        do {
            z = m24723z();
            if (z == null) {
                return false;
            }
        } while (!C3426c.f20942m.compareAndSet(z, -1, 0));
        LockSupport.unpark(z);
        return true;
    }

    /* renamed from: d */
    private final boolean m24718d(C3434h hVar) {
        boolean z = true;
        if (hVar.f20966g.mo14497b() != 1) {
            z = false;
        }
        return (z ? this.f20939k : this.f20938j).mo14454a(hVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        return r1;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m24719h() {
        /*
            r10 = this;
            kotlinx.coroutines.internal.b0<kotlinx.coroutines.scheduling.a$c> r0 = r10.f20940l
            monitor-enter(r0)
            boolean r1 = r10.isTerminated()     // Catch:{ all -> 0x007a }
            if (r1 == 0) goto L_0x000c
            r1 = -1
        L_0x000a:
            monitor-exit(r0)
            return r1
        L_0x000c:
            long r1 = r10.controlState     // Catch:{ all -> 0x007a }
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r1 & r3
            int r5 = (int) r5     // Catch:{ all -> 0x007a }
            r6 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r6
            r6 = 21
            long r1 = r1 >> r6
            int r1 = (int) r1     // Catch:{ all -> 0x007a }
            int r1 = r5 - r1
            r2 = 0
            int r1 = p163x4.C4357f.m26993a(r1, r2)     // Catch:{ all -> 0x007a }
            int r6 = r10.f20934f     // Catch:{ all -> 0x007a }
            if (r1 < r6) goto L_0x002b
            monitor-exit(r0)
            return r2
        L_0x002b:
            int r6 = r10.f20935g     // Catch:{ all -> 0x007a }
            if (r5 < r6) goto L_0x0031
            monitor-exit(r0)
            return r2
        L_0x0031:
            long r5 = r10.controlState     // Catch:{ all -> 0x007a }
            long r5 = r5 & r3
            int r5 = (int) r5     // Catch:{ all -> 0x007a }
            r6 = 1
            int r5 = r5 + r6
            if (r5 <= 0) goto L_0x0043
            kotlinx.coroutines.internal.b0<kotlinx.coroutines.scheduling.a$c> r7 = r10.f20940l     // Catch:{ all -> 0x007a }
            java.lang.Object r7 = r7.mo14401b(r5)     // Catch:{ all -> 0x007a }
            if (r7 != 0) goto L_0x0043
            r7 = r6
            goto L_0x0044
        L_0x0043:
            r7 = r2
        L_0x0044:
            if (r7 == 0) goto L_0x006e
            kotlinx.coroutines.scheduling.a$c r7 = new kotlinx.coroutines.scheduling.a$c     // Catch:{ all -> 0x007a }
            r7.<init>(r5)     // Catch:{ all -> 0x007a }
            kotlinx.coroutines.internal.b0<kotlinx.coroutines.scheduling.a$c> r8 = r10.f20940l     // Catch:{ all -> 0x007a }
            r8.mo14402c(r5, r7)     // Catch:{ all -> 0x007a }
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = f20931o     // Catch:{ all -> 0x007a }
            long r8 = r8.incrementAndGet(r10)     // Catch:{ all -> 0x007a }
            long r3 = r3 & r8
            int r3 = (int) r3     // Catch:{ all -> 0x007a }
            if (r5 != r3) goto L_0x005b
            r2 = r6
        L_0x005b:
            if (r2 == 0) goto L_0x0062
            r7.start()     // Catch:{ all -> 0x007a }
            int r1 = r1 + r6
            goto L_0x000a
        L_0x0062:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007a }
            r2.<init>(r1)     // Catch:{ all -> 0x007a }
            throw r2     // Catch:{ all -> 0x007a }
        L_0x006e:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007a }
            r2.<init>(r1)     // Catch:{ all -> 0x007a }
            throw r2     // Catch:{ all -> 0x007a }
        L_0x007a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.C3423a.m24719h():int");
    }

    /* renamed from: n */
    private final C3426c m24720n() {
        Thread currentThread = Thread.currentThread();
        C3426c cVar = currentThread instanceof C3426c ? (C3426c) currentThread : null;
        if (cVar != null && C3357i.m24504a(C3423a.this, this)) {
            return cVar;
        }
        return null;
    }

    /* renamed from: v */
    public static /* synthetic */ void m24721v(C3423a aVar, Runnable runnable, C3435i iVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            iVar = C3438l.f20974f;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        aVar.mo14482u(runnable, iVar, z);
    }

    /* renamed from: w */
    private final int m24722w(C3426c cVar) {
        int g;
        do {
            Object h = cVar.mo14485h();
            if (h == f20933q) {
                return -1;
            }
            if (h == null) {
                return 0;
            }
            cVar = (C3426c) h;
            g = cVar.mo14484g();
        } while (g == 0);
        return g;
    }

    /* renamed from: z */
    private final C3426c m24723z() {
        while (true) {
            long j = this.parkedWorkersStack;
            C3426c b = this.f20940l.mo14401b((int) (2097151 & j));
            if (b == null) {
                return null;
            }
            long j2 = (2097152 + j) & -2097152;
            int w = m24722w(b);
            if (w >= 0) {
                if (f20930n.compareAndSet(this, j, ((long) w) | j2)) {
                    b.mo14488p(f20933q);
                    return b;
                }
            }
        }
    }

    /* renamed from: B */
    public final boolean mo14472B(C3426c cVar) {
        long j;
        long j2;
        int g;
        if (cVar.mo14485h() != f20933q) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            int i = (int) (2097151 & j);
            j2 = (2097152 + j) & -2097152;
            g = cVar.mo14484g();
            if (C1384o0.m5425a()) {
                if (!(g != 0)) {
                    throw new AssertionError();
                }
            }
            cVar.mo14488p(this.f20940l.mo14401b(i));
        } while (!f20930n.compareAndSet(this, j, ((long) g) | j2));
        return true;
    }

    /* renamed from: F */
    public final void mo14473F(C3426c cVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                i3 = i2 == 0 ? m24722w(cVar) : i2;
            }
            if (i3 >= 0) {
                if (f20930n.compareAndSet(this, j, j2 | ((long) i3))) {
                    return;
                }
            }
        }
    }

    /* renamed from: G */
    public final void mo14474G(C3434h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            C1322c.m5284a();
            throw th;
        }
        C1322c.m5284a();
    }

    /* renamed from: H */
    public final void mo14475H(long j) {
        int i;
        boolean z = false;
        if (f20932p.compareAndSet(this, 0, 1)) {
            C3426c n = m24720n();
            synchronized (this.f20940l) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    int i3 = i2 + 1;
                    C3426c b = this.f20940l.mo14401b(i2);
                    C3357i.m24505b(b);
                    C3426c cVar = b;
                    if (cVar != n) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j);
                        }
                        C3427d dVar = cVar.f20944g;
                        if (C1384o0.m5425a()) {
                            if (!(dVar == C3427d.TERMINATED)) {
                                throw new AssertionError();
                            }
                        }
                        cVar.f20943f.mo14503g(this.f20939k);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2 = i3;
                }
            }
            this.f20939k.mo14455b();
            this.f20938j.mo14455b();
            while (true) {
                C3434h f = n == null ? null : n.mo14483f(true);
                if (f == null && (f = (C3434h) this.f20938j.mo14457d()) == null && (f = (C3434h) this.f20939k.mo14457d()) == null) {
                    break;
                }
                mo14474G(f);
            }
            if (n != null) {
                n.mo14490s(C3427d.TERMINATED);
            }
            if (C1384o0.m5425a()) {
                if (((int) ((this.controlState & 9223367638808264704L) >> 42)) == this.f20934f) {
                    z = true;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            this.parkedWorkersStack = 0;
            this.controlState = 0;
        }
    }

    /* renamed from: O */
    public final void mo14476O() {
        if (!m24717S() && !m24716R(this, 0, 1, (Object) null)) {
            m24717S();
        }
    }

    public void close() {
        mo14475H(10000);
    }

    public void execute(Runnable runnable) {
        m24721v(this, runnable, (C3435i) null, false, 6, (Object) null);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* renamed from: m */
    public final C3434h mo14480m(Runnable runnable, C3435i iVar) {
        long a = C3438l.f20973e.mo14494a();
        if (!(runnable instanceof C3434h)) {
            return new C3437k(runnable, a, iVar);
        }
        C3434h hVar = (C3434h) runnable;
        hVar.f20965f = a;
        hVar.f20966g = iVar;
        return hVar;
    }

    public String toString() {
        char c;
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        int a = this.f20940l.mo14400a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i6 < a) {
            int i7 = i6 + 1;
            C3426c b = this.f20940l.mo14401b(i6);
            if (b != null) {
                int f = b.f20943f.mo14502f();
                int i8 = C3425b.f20941a[b.f20944g.ordinal()];
                if (i8 != 1) {
                    if (i8 == 2) {
                        i2++;
                        sb = new StringBuilder();
                        sb.append(f);
                        c = 'b';
                    } else if (i8 == 3) {
                        i++;
                        sb = new StringBuilder();
                        sb.append(f);
                        c = 'c';
                    } else if (i8 == 4) {
                        i4++;
                        if (f > 0) {
                            sb = new StringBuilder();
                            sb.append(f);
                            c = 'd';
                        }
                    } else if (i8 == 5) {
                        i5++;
                    }
                    sb.append(c);
                    arrayList.add(sb.toString());
                } else {
                    i3++;
                }
            }
            i6 = i7;
        }
        long j = this.controlState;
        return this.f20937i + '@' + C1387p0.m5432b(this) + "[Pool Size {core = " + this.f20934f + ", max = " + this.f20935g + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f20938j.mo14456c() + ", global blocking queue size = " + this.f20939k.mo14456c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.f20934f - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    /* renamed from: u */
    public final void mo14482u(Runnable runnable, C3435i iVar, boolean z) {
        C1322c.m5284a();
        C3434h m = mo14480m(runnable, iVar);
        C3426c n = m24720n();
        C3434h P = m24714P(n, m, z);
        if (P == null || m24718d(P)) {
            boolean z2 = z && n != null;
            if (m.f20966g.mo14497b() != 0) {
                m24713N(z2);
            } else if (!z2) {
                mo14476O();
            }
        } else {
            throw new RejectedExecutionException(C3357i.m24513j(this.f20937i, " was terminated"));
        }
    }
}
