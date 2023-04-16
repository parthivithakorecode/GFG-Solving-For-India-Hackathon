package p016b5;

import androidx.work.impl.utils.futures.C1282b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C3357i;
import kotlinx.coroutines.internal.C3396j0;
import kotlinx.coroutines.internal.C3398k0;
import kotlinx.coroutines.internal.C3413t;
import p100n4.C3778g;

/* renamed from: b5.c1 */
public abstract class C1327c1 extends C1335d1 implements C1398s0 {

    /* renamed from: j */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3537j;

    /* renamed from: k */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3538k;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;
    private volatile /* synthetic */ Object _queue = null;

    /* renamed from: b5.c1$a */
    public static abstract class C1328a implements Runnable, Comparable<C1328a>, C1422z0, C3398k0 {

        /* renamed from: f */
        public long f3539f;

        /* renamed from: g */
        private Object f3540g;

        /* renamed from: h */
        private int f3541h;

        /* renamed from: b */
        public final synchronized void mo4679b() {
            Object obj = this.f3540g;
            if (obj != C1344f1.f3551a) {
                C1329b bVar = obj instanceof C1329b ? (C1329b) obj : null;
                if (bVar != null) {
                    bVar.mo14433g(this);
                }
                this.f3540g = C1344f1.f3551a;
            }
        }

        /* renamed from: d */
        public void mo4681d(int i) {
            this.f3541h = i;
        }

        /* renamed from: e */
        public void mo4682e(C3396j0<?> j0Var) {
            if (this.f3540g != C1344f1.f3551a) {
                this.f3540g = j0Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: f */
        public int mo4683f() {
            return this.f3541h;
        }

        /* renamed from: h */
        public C3396j0<?> mo4684h() {
            Object obj = this.f3540g;
            if (obj instanceof C3396j0) {
                return (C3396j0) obj;
            }
            return null;
        }

        /* renamed from: i */
        public int compareTo(C1328a aVar) {
            int i = ((this.f3539f - aVar.f3539f) > 0 ? 1 : ((this.f3539f - aVar.f3539f) == 0 ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0046, code lost:
            r8 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
            return r8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0040  */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized int mo4686j(long r8, p016b5.C1327c1.C1329b r10, p016b5.C1327c1 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7.f3540g     // Catch:{ all -> 0x004b }
                kotlinx.coroutines.internal.e0 r1 = p016b5.C1344f1.f3551a     // Catch:{ all -> 0x004b }
                if (r0 != r1) goto L_0x000c
                r8 = 2
            L_0x000a:
                monitor-exit(r7)
                return r8
            L_0x000c:
                monitor-enter(r10)     // Catch:{ all -> 0x004b }
                kotlinx.coroutines.internal.k0 r0 = r10.mo14429b()     // Catch:{ all -> 0x0048 }
                b5.c1$a r0 = (p016b5.C1327c1.C1328a) r0     // Catch:{ all -> 0x0048 }
                boolean r11 = r11.m5298i0()     // Catch:{ all -> 0x0048 }
                if (r11 == 0) goto L_0x001d
                r8 = 1
                monitor-exit(r10)     // Catch:{ all -> 0x004b }
                monitor-exit(r7)
                return r8
            L_0x001d:
                r1 = 0
                if (r0 != 0) goto L_0x0024
            L_0x0021:
                r10.f3542b = r8     // Catch:{ all -> 0x0048 }
                goto L_0x0037
            L_0x0024:
                long r3 = r0.f3539f     // Catch:{ all -> 0x0048 }
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L_0x002d
                goto L_0x002e
            L_0x002d:
                r8 = r3
            L_0x002e:
                long r3 = r10.f3542b     // Catch:{ all -> 0x0048 }
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L_0x0037
                goto L_0x0021
            L_0x0037:
                long r8 = r7.f3539f     // Catch:{ all -> 0x0048 }
                long r3 = r10.f3542b     // Catch:{ all -> 0x0048 }
                long r8 = r8 - r3
                int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r8 >= 0) goto L_0x0042
                r7.f3539f = r3     // Catch:{ all -> 0x0048 }
            L_0x0042:
                r10.mo14428a(r7)     // Catch:{ all -> 0x0048 }
                monitor-exit(r10)     // Catch:{ all -> 0x004b }
                r8 = 0
                goto L_0x000a
            L_0x0048:
                r8 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x004b }
                throw r8     // Catch:{ all -> 0x004b }
            L_0x004b:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p016b5.C1327c1.C1328a.mo4686j(long, b5.c1$b, b5.c1):int");
        }

        /* renamed from: k */
        public final boolean mo4687k(long j) {
            return j - this.f3539f >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f3539f + ']';
        }
    }

    /* renamed from: b5.c1$b */
    public static final class C1329b extends C3396j0<C1328a> {

        /* renamed from: b */
        public long f3542b;

        public C1329b(long j) {
            this.f3542b = j;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C1327c1> cls2 = C1327c1.class;
        f3537j = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f3538k = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    /* renamed from: e0 */
    private final void m5295e0() {
        if (!C1384o0.m5425a() || m5298i0()) {
            while (true) {
                Object obj = this._queue;
                if (obj == null) {
                    if (C1282b.m5160a(f3537j, this, (Object) null, C1344f1.f3552b)) {
                        return;
                    }
                } else if (obj instanceof C3413t) {
                    ((C3413t) obj).mo14459d();
                    return;
                } else if (obj != C1344f1.f3552b) {
                    C3413t tVar = new C3413t(8, true);
                    tVar.mo14458a((Runnable) obj);
                    if (C1282b.m5160a(f3537j, this, obj, tVar)) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: f0 */
    private final Runnable m5296f0() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof C3413t) {
                C3413t tVar = (C3413t) obj;
                Object j = tVar.mo14463j();
                if (j != C3413t.f20914h) {
                    return (Runnable) j;
                }
                C1282b.m5160a(f3537j, this, obj, tVar.mo14462i());
            } else if (obj == C1344f1.f3552b) {
                return null;
            } else {
                if (C1282b.m5160a(f3537j, this, obj, (Object) null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    /* renamed from: h0 */
    private final boolean m5297h0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (m5298i0()) {
                return false;
            }
            if (obj == null) {
                if (C1282b.m5160a(f3537j, this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C3413t) {
                C3413t tVar = (C3413t) obj;
                int a = tVar.mo14458a(runnable);
                if (a == 0) {
                    return true;
                }
                if (a == 1) {
                    C1282b.m5160a(f3537j, this, obj, tVar.mo14462i());
                } else if (a == 2) {
                    return false;
                }
            } else if (obj == C1344f1.f3552b) {
                return false;
            } else {
                C3413t tVar2 = new C3413t(8, true);
                tVar2.mo14458a((Runnable) obj);
                tVar2.mo14458a(runnable);
                if (C1282b.m5160a(f3537j, this, obj, tVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public final boolean m5298i0() {
        return this._isCompleted;
    }

    /* renamed from: l0 */
    private final void m5299l0() {
        C1322c.m5284a();
        long nanoTime = System.nanoTime();
        while (true) {
            C1329b bVar = (C1329b) this._delayed;
            C1328a aVar = bVar == null ? null : (C1328a) bVar.mo14435i();
            if (aVar != null) {
                mo4701b0(nanoTime, aVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: o0 */
    private final int m5300o0(long j, C1328a aVar) {
        if (m5298i0()) {
            return 1;
        }
        C1329b bVar = (C1329b) this._delayed;
        if (bVar == null) {
            C1282b.m5160a(f3538k, this, (Object) null, new C1329b(j));
            Object obj = this._delayed;
            C3357i.m24505b(obj);
            bVar = (C1329b) obj;
        }
        return aVar.mo4686j(j, bVar, this);
    }

    /* renamed from: p0 */
    private final void m5301p0(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    /* renamed from: q0 */
    private final boolean m5302q0(C1328a aVar) {
        C1329b bVar = (C1329b) this._delayed;
        return (bVar == null ? null : (C1328a) bVar.mo14432e()) == aVar;
    }

    /* renamed from: O */
    public final void mo4673O(C3778g gVar, Runnable runnable) {
        mo4674g0(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public long mo4662U() {
        if (super.mo4662U() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof C3413t)) {
                return obj == C1344f1.f3552b ? Long.MAX_VALUE : 0;
            }
            if (!((C3413t) obj).mo14461g()) {
                return 0;
            }
        }
        C1329b bVar = (C1329b) this._delayed;
        C1328a aVar = bVar == null ? null : (C1328a) bVar.mo14432e();
        if (aVar == null) {
            return Long.MAX_VALUE;
        }
        long j = aVar.f3539f;
        C1322c.m5284a();
        return C4357f.m26994b(j - System.nanoTime(), 0);
    }

    /* renamed from: g0 */
    public void mo4674g0(Runnable runnable) {
        if (m5297h0(runnable)) {
            mo4702c0();
        } else {
            C1390q0.f3591l.mo4674g0(runnable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public boolean mo4675j0() {
        if (!mo4665Y()) {
            return false;
        }
        C1329b bVar = (C1329b) this._delayed;
        if (bVar != null && !bVar.mo14431d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C3413t) {
                return ((C3413t) obj).mo14461g();
            }
            if (obj != C1344f1.f3552b) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004f  */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo4676k0() {
        /*
            r9 = this;
            boolean r0 = r9.mo4666Z()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r9._delayed
            b5.c1$b r0 = (p016b5.C1327c1.C1329b) r0
            if (r0 == 0) goto L_0x0045
            boolean r3 = r0.mo14431d()
            if (r3 != 0) goto L_0x0045
            p016b5.C1322c.m5284a()
            long r3 = java.lang.System.nanoTime()
        L_0x001c:
            monitor-enter(r0)
            kotlinx.coroutines.internal.k0 r5 = r0.mo14429b()     // Catch:{ all -> 0x0042 }
            r6 = 0
            if (r5 != 0) goto L_0x0026
        L_0x0024:
            monitor-exit(r0)
            goto L_0x003d
        L_0x0026:
            b5.c1$a r5 = (p016b5.C1327c1.C1328a) r5     // Catch:{ all -> 0x0042 }
            boolean r7 = r5.mo4687k(r3)     // Catch:{ all -> 0x0042 }
            r8 = 0
            if (r7 == 0) goto L_0x0034
            boolean r5 = r9.m5297h0(r5)     // Catch:{ all -> 0x0042 }
            goto L_0x0035
        L_0x0034:
            r5 = r8
        L_0x0035:
            if (r5 == 0) goto L_0x0024
            kotlinx.coroutines.internal.k0 r5 = r0.mo14434h(r8)     // Catch:{ all -> 0x0042 }
            r6 = r5
            goto L_0x0024
        L_0x003d:
            b5.c1$a r6 = (p016b5.C1327c1.C1328a) r6
            if (r6 != 0) goto L_0x001c
            goto L_0x0045
        L_0x0042:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0045:
            java.lang.Runnable r0 = r9.m5296f0()
            if (r0 == 0) goto L_0x004f
            r0.run()
            return r1
        L_0x004f:
            long r0 = r9.mo4662U()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p016b5.C1327c1.mo4676k0():long");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public final void mo4677m0() {
        this._queue = null;
        this._delayed = null;
    }

    /* renamed from: n0 */
    public final void mo4678n0(long j, C1328a aVar) {
        int o0 = m5300o0(j, aVar);
        if (o0 != 0) {
            if (o0 == 1) {
                mo4701b0(j, aVar);
            } else if (o0 != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (m5302q0(aVar)) {
            mo4702c0();
        }
    }

    public void shutdown() {
        C1355h2.f3555a.mo4710b();
        m5301p0(true);
        m5295e0();
        do {
        } while (mo4676k0() <= 0);
        m5299l0();
    }
}
