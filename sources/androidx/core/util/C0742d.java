package androidx.core.util;

/* renamed from: androidx.core.util.d */
public class C0742d<F, S> {

    /* renamed from: a */
    public final F f2120a;

    /* renamed from: b */
    public final S f2121b;

    public C0742d(F f, S s) {
        this.f2120a = f;
        this.f2121b = s;
    }

    /* renamed from: a */
    public static <A, B> C0742d<A, B> m2952a(A a, B b) {
        return new C0742d<>(a, b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0742d)) {
            return false;
        }
        C0742d dVar = (C0742d) obj;
        return C0740c.m2946a(dVar.f2120a, this.f2120a) && C0740c.m2946a(dVar.f2121b, this.f2121b);
    }

    public int hashCode() {
        F f = this.f2120a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f2121b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + this.f2120a + " " + this.f2121b + "}";
    }
}
