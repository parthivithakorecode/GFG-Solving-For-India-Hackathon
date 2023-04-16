package p084l2;

/* renamed from: l2.q1 */
public final class C3537q1<T> implements C3545s1<T> {

    /* renamed from: a */
    private C3556v1<T> f21186a;

    /* renamed from: a */
    public static <T> void m24938a(C3556v1<T> v1Var, C3556v1<T> v1Var2) {
        C3559w1.m24965a(v1Var2);
        C3537q1 q1Var = (C3537q1) v1Var;
        if (q1Var.f21186a == null) {
            q1Var.f21186a = v1Var2;
            return;
        }
        throw new IllegalStateException();
    }

    public final T zza() {
        C3556v1<T> v1Var = this.f21186a;
        if (v1Var != null) {
            return v1Var.zza();
        }
        throw new IllegalStateException();
    }
}
