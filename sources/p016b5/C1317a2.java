package p016b5;

/* renamed from: b5.a2 */
public abstract class C1317a2 extends C1332d0 {
    /* renamed from: R */
    public abstract C1317a2 mo4656R();

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public final String mo4657S() {
        C1317a2 a2Var;
        C1317a2 c = C1419y0.m5579c();
        if (this == c) {
            return "Dispatchers.Main";
        }
        try {
            a2Var = c.mo4656R();
        } catch (UnsupportedOperationException unused) {
            a2Var = null;
        }
        if (this == a2Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public String toString() {
        String S = mo4657S();
        if (S != null) {
            return S;
        }
        return C1387p0.m5431a(this) + '@' + C1387p0.m5432b(this);
    }
}
