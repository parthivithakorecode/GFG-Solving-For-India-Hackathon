package androidx.work.impl.utils.futures;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p143u2.C4136a;

/* renamed from: androidx.work.impl.utils.futures.a */
public abstract class C1271a<V> implements C4136a<V> {

    /* renamed from: i */
    static final boolean f3470i = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: j */
    private static final Logger f3471j = Logger.getLogger(C1271a.class.getName());

    /* renamed from: k */
    static final C1273b f3472k;

    /* renamed from: l */
    private static final Object f3473l = new Object();

    /* renamed from: f */
    volatile Object f3474f;

    /* renamed from: g */
    volatile C1277e f3475g;

    /* renamed from: h */
    volatile C1281i f3476h;

    /* renamed from: androidx.work.impl.utils.futures.a$b */
    private static abstract class C1273b {
        private C1273b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo4587a(C1271a<?> aVar, C1277e eVar, C1277e eVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract boolean mo4588b(C1271a<?> aVar, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract boolean mo4589c(C1271a<?> aVar, C1281i iVar, C1281i iVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo4590d(C1281i iVar, C1281i iVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract void mo4591e(C1281i iVar, Thread thread);
    }

    /* renamed from: androidx.work.impl.utils.futures.a$c */
    private static final class C1274c {

        /* renamed from: c */
        static final C1274c f3477c;

        /* renamed from: d */
        static final C1274c f3478d;

        /* renamed from: a */
        final boolean f3479a;

        /* renamed from: b */
        final Throwable f3480b;

        static {
            if (C1271a.f3470i) {
                f3478d = null;
                f3477c = null;
                return;
            }
            f3478d = new C1274c(false, (Throwable) null);
            f3477c = new C1274c(true, (Throwable) null);
        }

        C1274c(boolean z, Throwable th) {
            this.f3479a = z;
            this.f3480b = th;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$d */
    private static final class C1275d {

        /* renamed from: b */
        static final C1275d f3481b = new C1275d(new C1276a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        final Throwable f3482a;

        /* renamed from: androidx.work.impl.utils.futures.a$d$a */
        class C1276a extends Throwable {
            C1276a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        C1275d(Throwable th) {
            this.f3482a = (Throwable) C1271a.m5126f(th);
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$e */
    private static final class C1277e {

        /* renamed from: d */
        static final C1277e f3483d = new C1277e((Runnable) null, (Executor) null);

        /* renamed from: a */
        final Runnable f3484a;

        /* renamed from: b */
        final Executor f3485b;

        /* renamed from: c */
        C1277e f3486c;

        C1277e(Runnable runnable, Executor executor) {
            this.f3484a = runnable;
            this.f3485b = executor;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$f */
    private static final class C1278f extends C1273b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<C1281i, Thread> f3487a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<C1281i, C1281i> f3488b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<C1271a, C1281i> f3489c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<C1271a, C1277e> f3490d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<C1271a, Object> f3491e;

        C1278f(AtomicReferenceFieldUpdater<C1281i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C1281i, C1281i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<C1271a, C1281i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<C1271a, C1277e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<C1271a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f3487a = atomicReferenceFieldUpdater;
            this.f3488b = atomicReferenceFieldUpdater2;
            this.f3489c = atomicReferenceFieldUpdater3;
            this.f3490d = atomicReferenceFieldUpdater4;
            this.f3491e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4587a(C1271a<?> aVar, C1277e eVar, C1277e eVar2) {
            return C1282b.m5160a(this.f3490d, aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo4588b(C1271a<?> aVar, Object obj, Object obj2) {
            return C1282b.m5160a(this.f3491e, aVar, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo4589c(C1271a<?> aVar, C1281i iVar, C1281i iVar2) {
            return C1282b.m5160a(this.f3489c, aVar, iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4590d(C1281i iVar, C1281i iVar2) {
            this.f3488b.lazySet(iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4591e(C1281i iVar, Thread thread) {
            this.f3487a.lazySet(iVar, thread);
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$g */
    private static final class C1279g<V> implements Runnable {

        /* renamed from: f */
        final C1271a<V> f3492f;

        /* renamed from: g */
        final C4136a<? extends V> f3493g;

        C1279g(C1271a<V> aVar, C4136a<? extends V> aVar2) {
            this.f3492f = aVar;
            this.f3493g = aVar2;
        }

        public void run() {
            if (this.f3492f.f3474f == this) {
                if (C1271a.f3472k.mo4588b(this.f3492f, this, C1271a.m5131k(this.f3493g))) {
                    C1271a.m5128h(this.f3492f);
                }
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$h */
    private static final class C1280h extends C1273b {
        C1280h() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4587a(C1271a<?> aVar, C1277e eVar, C1277e eVar2) {
            synchronized (aVar) {
                if (aVar.f3475g != eVar) {
                    return false;
                }
                aVar.f3475g = eVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo4588b(C1271a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f3474f != obj) {
                    return false;
                }
                aVar.f3474f = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo4589c(C1271a<?> aVar, C1281i iVar, C1281i iVar2) {
            synchronized (aVar) {
                if (aVar.f3476h != iVar) {
                    return false;
                }
                aVar.f3476h = iVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4590d(C1281i iVar, C1281i iVar2) {
            iVar.f3496b = iVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4591e(C1281i iVar, Thread thread) {
            iVar.f3495a = thread;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$i */
    private static final class C1281i {

        /* renamed from: c */
        static final C1281i f3494c = new C1281i(false);

        /* renamed from: a */
        volatile Thread f3495a;

        /* renamed from: b */
        volatile C1281i f3496b;

        C1281i() {
            C1271a.f3472k.mo4591e(this, Thread.currentThread());
        }

        C1281i(boolean z) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4594a(C1281i iVar) {
            C1271a.f3472k.mo4590d(this, iVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4595b() {
            Thread thread = this.f3495a;
            if (thread != null) {
                this.f3495a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.work.impl.utils.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.work.impl.utils.futures.a$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: androidx.work.impl.utils.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.work.impl.utils.futures.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.work.impl.utils.futures.a$i> r0 = androidx.work.impl.utils.futures.C1271a.C1281i.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f3470i = r1
            java.lang.Class<androidx.work.impl.utils.futures.a> r1 = androidx.work.impl.utils.futures.C1271a.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f3471j = r1
            androidx.work.impl.utils.futures.a$f r1 = new androidx.work.impl.utils.futures.a$f     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.a> r2 = androidx.work.impl.utils.futures.C1271a.class
            java.lang.String r5 = "h"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.a> r0 = androidx.work.impl.utils.futures.C1271a.class
            java.lang.Class<androidx.work.impl.utils.futures.a$e> r2 = androidx.work.impl.utils.futures.C1271a.C1277e.class
            java.lang.String r6 = "g"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.a> r0 = androidx.work.impl.utils.futures.C1271a.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "f"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            androidx.work.impl.utils.futures.a$h r1 = new androidx.work.impl.utils.futures.a$h
            r1.<init>()
        L_0x0054:
            f3472k = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f3471j
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f3473l = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.C1271a.<clinit>():void");
    }

    protected C1271a() {
    }

    /* renamed from: a */
    private void m5124a(StringBuilder sb) {
        String str = "]";
        try {
            Object l = m5132l(this);
            sb.append("SUCCESS, result=[");
            sb.append(m5135t(l));
            sb.append(str);
            return;
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
        } catch (CancellationException unused) {
            str = "CANCELLED";
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            str = " thrown from get()]";
        }
        sb.append(str);
    }

    /* renamed from: e */
    private static CancellationException m5125e(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: f */
    static <T> T m5126f(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: g */
    private C1277e m5127g(C1277e eVar) {
        C1277e eVar2;
        do {
            eVar2 = this.f3475g;
        } while (!f3472k.mo4587a(this, eVar2, C1277e.f3483d));
        C1277e eVar3 = eVar2;
        C1277e eVar4 = eVar;
        C1277e eVar5 = eVar3;
        while (eVar5 != null) {
            C1277e eVar6 = eVar5.f3486c;
            eVar5.f3486c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    /* renamed from: h */
    static void m5128h(C1271a<?> aVar) {
        C1277e eVar = null;
        C1271a<V> aVar2 = aVar;
        while (true) {
            aVar2.m5133o();
            aVar2.mo4574c();
            C1277e g = aVar2.m5127g(eVar);
            while (true) {
                if (g != null) {
                    eVar = g.f3486c;
                    Runnable runnable = g.f3484a;
                    if (runnable instanceof C1279g) {
                        C1279g gVar = (C1279g) runnable;
                        C1271a<V> aVar3 = gVar.f3492f;
                        if (aVar3.f3474f == gVar) {
                            if (f3472k.mo4588b(aVar3, gVar, m5131k(gVar.f3493g))) {
                                aVar2 = aVar3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m5129i(runnable, g.f3485b);
                    }
                    g = eVar;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: i */
    private static void m5129i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f3471j;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* renamed from: j */
    private V m5130j(Object obj) {
        if (obj instanceof C1274c) {
            throw m5125e("Task was cancelled.", ((C1274c) obj).f3480b);
        } else if (obj instanceof C1275d) {
            throw new ExecutionException(((C1275d) obj).f3482a);
        } else if (obj == f3473l) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: k */
    static Object m5131k(C4136a<?> aVar) {
        if (aVar instanceof C1271a) {
            Object obj = ((C1271a) aVar).f3474f;
            if (!(obj instanceof C1274c)) {
                return obj;
            }
            C1274c cVar = (C1274c) obj;
            return cVar.f3479a ? cVar.f3480b != null ? new C1274c(false, cVar.f3480b) : C1274c.f3478d : obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f3470i) && isCancelled) {
            return C1274c.f3478d;
        }
        try {
            Object l = m5132l(aVar);
            return l == null ? f3473l : l;
        } catch (ExecutionException e) {
            return new C1275d(e.getCause());
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new C1274c(false, e2);
            }
            return new C1275d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e2));
        } catch (Throwable th) {
            return new C1275d(th);
        }
    }

    /* renamed from: l */
    private static <V> V m5132l(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* renamed from: o */
    private void m5133o() {
        C1281i iVar;
        do {
            iVar = this.f3476h;
        } while (!f3472k.mo4589c(this, iVar, C1281i.f3494c));
        while (iVar != null) {
            iVar.mo4595b();
            iVar = iVar.f3496b;
        }
    }

    /* renamed from: p */
    private void m5134p(C1281i iVar) {
        iVar.f3495a = null;
        while (true) {
            C1281i iVar2 = this.f3476h;
            if (iVar2 != C1281i.f3494c) {
                C1281i iVar3 = null;
                while (iVar2 != null) {
                    C1281i iVar4 = iVar2.f3496b;
                    if (iVar2.f3495a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f3496b = iVar4;
                        if (iVar3.f3495a == null) {
                        }
                    } else if (!f3472k.mo4589c(this, iVar2, iVar4)) {
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: t */
    private String m5135t(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo4574c() {
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, u2.a<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f3474f
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r2
        L_0x0009:
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.C1271a.C1279g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f3470i
            if (r3 == 0) goto L_0x001f
            androidx.work.impl.utils.futures.a$c r3 = new androidx.work.impl.utils.futures.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.work.impl.utils.futures.a$c r3 = androidx.work.impl.utils.futures.C1271a.C1274c.f3477c
            goto L_0x0026
        L_0x0024:
            androidx.work.impl.utils.futures.a$c r3 = androidx.work.impl.utils.futures.C1271a.C1274c.f3478d
        L_0x0026:
            r4 = r7
            r5 = r2
        L_0x0028:
            androidx.work.impl.utils.futures.a$b r6 = f3472k
            boolean r6 = r6.mo4588b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.mo4581m()
        L_0x0035:
            m5128h(r4)
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.C1271a.C1279g
            if (r4 == 0) goto L_0x0062
            androidx.work.impl.utils.futures.a$g r0 = (androidx.work.impl.utils.futures.C1271a.C1279g) r0
            u2.a<? extends V> r0 = r0.f3493g
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.C1271a
            if (r4 == 0) goto L_0x0055
            r4 = r0
            androidx.work.impl.utils.futures.a r4 = (androidx.work.impl.utils.futures.C1271a) r4
            java.lang.Object r0 = r4.f3474f
            if (r0 != 0) goto L_0x004d
            r5 = r1
            goto L_0x004e
        L_0x004d:
            r5 = r2
        L_0x004e:
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.C1271a.C1279g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = r1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f3474f
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.C1271a.C1279g
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = r2
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.C1271a.cancel(boolean):boolean");
    }

    /* renamed from: d */
    public final void mo4576d(Runnable runnable, Executor executor) {
        m5126f(runnable);
        m5126f(executor);
        C1277e eVar = this.f3475g;
        if (eVar != C1277e.f3483d) {
            C1277e eVar2 = new C1277e(runnable, executor);
            do {
                eVar2.f3486c = eVar;
                if (!f3472k.mo4587a(this, eVar, eVar2)) {
                    eVar = this.f3475g;
                } else {
                    return;
                }
            } while (eVar != C1277e.f3483d);
        }
        m5129i(runnable, executor);
    }

    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f3474f;
            if ((obj2 != null) && (!(obj2 instanceof C1279g))) {
                return m5130j(obj2);
            }
            C1281i iVar = this.f3476h;
            if (iVar != C1281i.f3494c) {
                C1281i iVar2 = new C1281i();
                do {
                    iVar2.mo4594a(iVar);
                    if (f3472k.mo4589c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3474f;
                            } else {
                                m5134p(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C1279g))));
                        return m5130j(obj);
                    }
                    iVar = this.f3476h;
                } while (iVar != C1281i.f3494c);
            }
            return m5130j(this.f3474f);
        }
        throw new InterruptedException();
    }

    public final V get(long j, TimeUnit timeUnit) {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f3474f;
            if ((obj != null) && (!(obj instanceof C1279g))) {
                return m5130j(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C1281i iVar = this.f3476h;
                if (iVar != C1281i.f3494c) {
                    C1281i iVar2 = new C1281i();
                    do {
                        iVar2.mo4594a(iVar);
                        if (f3472k.mo4589c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f3474f;
                                    if ((obj2 != null) && (!(obj2 instanceof C1279g))) {
                                        return m5130j(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m5134p(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m5134p(iVar2);
                        } else {
                            iVar = this.f3476h;
                        }
                    } while (iVar != C1281i.f3494c);
                }
                return m5130j(this.f3474f);
            }
            while (nanos > 0) {
                Object obj3 = this.f3474f;
                if ((obj3 != null) && (!(obj3 instanceof C1279g))) {
                    return m5130j(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String timeUnit3 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit3.toLowerCase(locale);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z = i == 0 || nanos2 > 1000;
                if (i > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f3474f instanceof C1274c;
    }

    public final boolean isDone() {
        Object obj = this.f3474f;
        return (!(obj instanceof C1279g)) & (obj != null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo4581m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public String mo4582n() {
        Object obj = this.f3474f;
        if (obj instanceof C1279g) {
            return "setFuture=[" + m5135t(((C1279g) obj).f3493g) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo4583q(V v) {
        if (v == null) {
            v = f3473l;
        }
        if (!f3472k.mo4588b(this, (Object) null, v)) {
            return false;
        }
        m5128h(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo4584r(Throwable th) {
        if (!f3472k.mo4588b(this, (Object) null, new C1275d((Throwable) m5126f(th)))) {
            return false;
        }
        m5128h(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo4585s(C4136a<? extends V> aVar) {
        C1279g gVar;
        C1275d dVar;
        m5126f(aVar);
        Object obj = this.f3474f;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!f3472k.mo4588b(this, (Object) null, m5131k(aVar))) {
                    return false;
                }
                m5128h(this);
                return true;
            }
            gVar = new C1279g(this, aVar);
            if (f3472k.mo4588b(this, (Object) null, gVar)) {
                try {
                    aVar.mo4576d(gVar, C1283c.INSTANCE);
                } catch (Throwable unused) {
                    dVar = C1275d.f3481b;
                }
                return true;
            }
            obj = this.f3474f;
        }
        if (obj instanceof C1274c) {
            aVar.cancel(((C1274c) obj).f3479a);
        }
        return false;
        f3472k.mo4588b(this, gVar, dVar);
        return true;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            str2 = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    str = mo4582n();
                } catch (RuntimeException e) {
                    str = "Exception thrown from implementation: " + e.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                } else if (!isDone()) {
                    str2 = "PENDING";
                }
            }
            m5124a(sb);
            sb.append("]");
            return sb.toString();
        }
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
