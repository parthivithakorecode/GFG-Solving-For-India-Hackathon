package kotlinx.coroutines.internal;

import p016b5.C1332d0;
import p016b5.C1395r0;
import p016b5.C1398s0;
import p100n4.C3778g;

/* renamed from: kotlinx.coroutines.internal.n */
public final class C3403n extends C1332d0 implements Runnable, C1398s0 {

    /* renamed from: g */
    private final C1332d0 f20895g;

    /* renamed from: h */
    private final int f20896h;

    /* renamed from: i */
    private final /* synthetic */ C1398s0 f20897i;

    /* renamed from: j */
    private final C3412s<Runnable> f20898j;

    /* renamed from: k */
    private final Object f20899k;
    private volatile int runningWorkers;

    public C3403n(C1332d0 d0Var, int i) {
        this.f20895g = d0Var;
        this.f20896h = i;
        C1398s0 s0Var = d0Var instanceof C1398s0 ? (C1398s0) d0Var : null;
        this.f20897i = s0Var == null ? C1395r0.m5458a() : s0Var;
        this.f20898j = new C3412s<>(false);
        this.f20899k = new Object();
    }

    /* renamed from: R */
    private final boolean m24649R(Runnable runnable) {
        this.f20898j.mo14454a(runnable);
        return this.runningWorkers >= this.f20896h;
    }

    /* renamed from: S */
    private final boolean m24650S() {
        synchronized (this.f20899k) {
            if (this.runningWorkers >= this.f20896h) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    /* renamed from: O */
    public void mo4673O(C3778g gVar, Runnable runnable) {
        if (!m24649R(runnable) && m24650S()) {
            this.f20895g.mo4673O(this, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r1 = r4.f20899k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r4.f20898j.mo14456c() != 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.runningWorkers++;
        r2 = p079k4.C3330q.f20829a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L_0x0001:
            r1 = r0
        L_0x0002:
            kotlinx.coroutines.internal.s<java.lang.Runnable> r2 = r4.f20898j
            java.lang.Object r2 = r2.mo14457d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L_0x002a
            r2.run()     // Catch:{ all -> 0x0010 }
            goto L_0x0016
        L_0x0010:
            r2 = move-exception
            n4.h r3 = p100n4.C3784h.f21692f
            p016b5.C1347g0.m5338a(r3, r2)
        L_0x0016:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L_0x0002
            b5.d0 r2 = r4.f20895g
            boolean r2 = r2.mo4694P(r4)
            if (r2 == 0) goto L_0x0002
            b5.d0 r0 = r4.f20895g
            r0.mo4673O(r4, r4)
            return
        L_0x002a:
            java.lang.Object r1 = r4.f20899k
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0047 }
            int r2 = r2 + -1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0047 }
            kotlinx.coroutines.internal.s<java.lang.Runnable> r2 = r4.f20898j     // Catch:{ all -> 0x0047 }
            int r2 = r2.mo14456c()     // Catch:{ all -> 0x0047 }
            if (r2 != 0) goto L_0x003d
            monitor-exit(r1)
            return
        L_0x003d:
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0047 }
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0047 }
            k4.q r2 = p079k4.C3330q.f20829a     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            goto L_0x0001
        L_0x0047:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C3403n.run():void");
    }
}
