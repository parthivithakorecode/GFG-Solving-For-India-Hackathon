package p016b5;

/* renamed from: b5.h2 */
public final class C1355h2 {

    /* renamed from: a */
    public static final C1355h2 f3555a = new C1355h2();

    /* renamed from: b */
    private static final ThreadLocal<C1320b1> f3556b = new ThreadLocal<>();

    private C1355h2() {
    }

    /* renamed from: a */
    public final C1320b1 mo4709a() {
        ThreadLocal<C1320b1> threadLocal = f3556b;
        C1320b1 b1Var = threadLocal.get();
        if (b1Var != null) {
            return b1Var;
        }
        C1320b1 a = C1340e1.m5329a();
        threadLocal.set(a);
        return a;
    }

    /* renamed from: b */
    public final void mo4710b() {
        f3556b.set((Object) null);
    }

    /* renamed from: c */
    public final void mo4711c(C1320b1 b1Var) {
        f3556b.set(b1Var);
    }
}
