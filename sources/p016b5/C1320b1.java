package p016b5;

import kotlinx.coroutines.internal.C3367a;

/* renamed from: b5.b1 */
public abstract class C1320b1 extends C1332d0 {

    /* renamed from: g */
    private long f3529g;

    /* renamed from: h */
    private boolean f3530h;

    /* renamed from: i */
    private C3367a<C1407v0<?>> f3531i;

    /* renamed from: S */
    private final long m5272S(boolean z) {
        return z ? 4294967296L : 1;
    }

    /* renamed from: W */
    public static /* synthetic */ void m5273W(C1320b1 b1Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            b1Var.mo4663V(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    /* renamed from: R */
    public final void mo4660R(boolean z) {
        long S = this.f3529g - m5272S(z);
        this.f3529g = S;
        if (S <= 0) {
            if (C1384o0.m5425a()) {
                if (!(this.f3529g == 0)) {
                    throw new AssertionError();
                }
            }
            if (this.f3530h) {
                shutdown();
            }
        }
    }

    /* renamed from: T */
    public final void mo4661T(C1407v0<?> v0Var) {
        C3367a<C1407v0<?>> aVar = this.f3531i;
        if (aVar == null) {
            aVar = new C3367a<>();
            this.f3531i = aVar;
        }
        aVar.mo14396a(v0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public long mo4662U() {
        C3367a<C1407v0<?>> aVar = this.f3531i;
        return (aVar != null && !aVar.mo14397c()) ? 0 : Long.MAX_VALUE;
    }

    /* renamed from: V */
    public final void mo4663V(boolean z) {
        this.f3529g += m5272S(z);
        if (!z) {
            this.f3530h = true;
        }
    }

    /* renamed from: X */
    public final boolean mo4664X() {
        return this.f3529g >= m5272S(true);
    }

    /* renamed from: Y */
    public final boolean mo4665Y() {
        C3367a<C1407v0<?>> aVar = this.f3531i;
        if (aVar == null) {
            return true;
        }
        return aVar.mo14397c();
    }

    /* renamed from: Z */
    public final boolean mo4666Z() {
        C1407v0 d;
        C3367a<C1407v0<?>> aVar = this.f3531i;
        if (aVar == null || (d = aVar.mo14398d()) == null) {
            return false;
        }
        d.run();
        return true;
    }

    public void shutdown() {
    }
}
