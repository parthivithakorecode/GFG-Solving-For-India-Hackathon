package com.google.android.gms.internal.ads;

public final class i84 implements Comparable<i84> {

    /* renamed from: f */
    public final boolean f8569f;

    /* renamed from: g */
    private final boolean f8570g;

    /* renamed from: h */
    private final boolean f8571h;

    /* renamed from: i */
    private final boolean f8572i;

    /* renamed from: j */
    private final int f8573j;

    /* renamed from: k */
    private final int f8574k;

    /* renamed from: l */
    private final int f8575l;

    /* renamed from: m */
    private final int f8576m;

    /* renamed from: n */
    private final boolean f8577n;

    public i84(C1574c0 c0Var, d84 d84, int i, String str) {
        int i2;
        boolean z = false;
        this.f8570g = k84.m12081m(i, false);
        int i3 = c0Var.f5226d;
        int i4 = d84.f5697B;
        this.f8571h = 1 == (i3 & 1);
        this.f8572i = (i3 & 2) != 0;
        e73<String> w = d84.f11669r.isEmpty() ? e73.m8348w("") : d84.f11669r;
        int i5 = 0;
        while (true) {
            if (i5 >= w.size()) {
                i5 = Integer.MAX_VALUE;
                i2 = 0;
                break;
            }
            i2 = k84.m12077g(c0Var, w.get(i5), false);
            if (i2 > 0) {
                break;
            }
            i5++;
        }
        this.f8573j = i5;
        this.f8574k = i2;
        int bitCount = Integer.bitCount(0);
        this.f8575l = bitCount;
        this.f8577n = false;
        int g = k84.m12077g(c0Var, str, k84.m12080k(str) == null);
        this.f8576m = g;
        if (i2 > 0 || ((d84.f11669r.isEmpty() && bitCount > 0) || this.f8571h || (this.f8572i && g > 0))) {
            z = true;
        }
        this.f8569f = z;
    }

    /* renamed from: b */
    public final int compareTo(i84 i84) {
        t63 b = t63.m17119i().mo10250d(this.f8570g, i84.f8570g).mo10249c(Integer.valueOf(this.f8573j), Integer.valueOf(i84.f8573j), s83.m16651c().mo5189a()).mo10248b(this.f8574k, i84.f8574k).mo10248b(this.f8575l, i84.f8575l).mo10250d(this.f8571h, i84.f8571h).mo10249c(Boolean.valueOf(this.f8572i), Boolean.valueOf(i84.f8572i), this.f8574k == 0 ? s83.m16651c() : s83.m16651c().mo5189a()).mo10248b(this.f8576m, i84.f8576m);
        if (this.f8575l == 0) {
            b = b.mo10251e(false, false);
        }
        return b.mo10247a();
    }
}
