package p069j1;

import p003a2.C0089n;

/* renamed from: j1.i0 */
public final class C3169i0 {

    /* renamed from: a */
    public final String f20480a;

    /* renamed from: b */
    public final double f20481b;

    /* renamed from: c */
    public final double f20482c;

    /* renamed from: d */
    public final double f20483d;

    /* renamed from: e */
    public final int f20484e;

    public C3169i0(String str, double d, double d2, double d3, int i) {
        this.f20480a = str;
        this.f20482c = d;
        this.f20481b = d2;
        this.f20483d = d3;
        this.f20484e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3169i0)) {
            return false;
        }
        C3169i0 i0Var = (C3169i0) obj;
        return C0089n.m301a(this.f20480a, i0Var.f20480a) && this.f20481b == i0Var.f20481b && this.f20482c == i0Var.f20482c && this.f20484e == i0Var.f20484e && Double.compare(this.f20483d, i0Var.f20483d) == 0;
    }

    public final int hashCode() {
        return C0089n.m302b(this.f20480a, Double.valueOf(this.f20481b), Double.valueOf(this.f20482c), Double.valueOf(this.f20483d), Integer.valueOf(this.f20484e));
    }

    public final String toString() {
        return C0089n.m303c(this).mo260a("name", this.f20480a).mo260a("minBound", Double.valueOf(this.f20482c)).mo260a("maxBound", Double.valueOf(this.f20481b)).mo260a("percent", Double.valueOf(this.f20483d)).mo260a("count", Integer.valueOf(this.f20484e)).toString();
    }
}
