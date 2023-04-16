package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.v0 */
final class C2278v0 implements C2167s0 {

    /* renamed from: a */
    private final dr2 f15837a;

    /* renamed from: b */
    private final int f15838b;

    /* renamed from: c */
    private final int f15839c;

    /* renamed from: d */
    private int f15840d;

    /* renamed from: e */
    private int f15841e;

    public C2278v0(C2056p0 p0Var) {
        dr2 dr2 = p0Var.f12391b;
        this.f15837a = dr2;
        dr2.mo6580f(12);
        this.f15839c = dr2.mo6596v() & 255;
        this.f15838b = dr2.mo6596v();
    }

    /* renamed from: a */
    public final int mo10695a() {
        return this.f15838b;
    }

    /* renamed from: c */
    public final int mo10696c() {
        int i = this.f15839c;
        if (i == 8) {
            return this.f15837a.mo6593s();
        }
        if (i == 16) {
            return this.f15837a.mo6597w();
        }
        int i2 = this.f15840d;
        this.f15840d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f15841e & 15;
        }
        int s = this.f15837a.mo6593s();
        this.f15841e = s;
        return (s & 240) >> 4;
    }

    public final int zza() {
        return -1;
    }
}
