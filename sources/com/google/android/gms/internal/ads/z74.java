package com.google.android.gms.internal.ads;

public final class z74 implements Comparable<z74> {

    /* renamed from: f */
    public final boolean f18088f;

    /* renamed from: g */
    private final String f18089g;

    /* renamed from: h */
    private final d84 f18090h;

    /* renamed from: i */
    private final boolean f18091i;

    /* renamed from: j */
    private final int f18092j;

    /* renamed from: k */
    private final int f18093k;

    /* renamed from: l */
    private final int f18094l;

    /* renamed from: m */
    private final int f18095m;

    /* renamed from: n */
    private final int f18096n;

    /* renamed from: o */
    private final boolean f18097o;

    /* renamed from: p */
    private final int f18098p;

    /* renamed from: q */
    private final int f18099q;

    /* renamed from: r */
    private final int f18100r;

    /* renamed from: s */
    private final int f18101s;

    public z74(C1574c0 c0Var, d84 d84, int i) {
        int i2;
        int i3;
        int i4;
        this.f18090h = d84;
        this.f18089g = k84.m12080k(c0Var.f5225c);
        int i5 = 0;
        this.f18091i = k84.m12081m(i, false);
        int i6 = 0;
        while (true) {
            i2 = Integer.MAX_VALUE;
            if (i6 >= d84.f11664m.size()) {
                i3 = 0;
                i6 = Integer.MAX_VALUE;
                break;
            }
            i3 = k84.m12077g(c0Var, d84.f11664m.get(i6), false);
            if (i3 > 0) {
                break;
            }
            i6++;
        }
        this.f18093k = i6;
        this.f18092j = i3;
        this.f18094l = Integer.bitCount(0);
        this.f18097o = 1 == (c0Var.f5226d & 1);
        this.f18098p = c0Var.f5247y;
        this.f18099q = c0Var.f5248z;
        this.f18100r = c0Var.f5230h;
        this.f18088f = true;
        String[] C = n13.m13598C();
        int i7 = 0;
        while (true) {
            if (i7 >= C.length) {
                i4 = 0;
                i7 = Integer.MAX_VALUE;
                break;
            }
            i4 = k84.m12077g(c0Var, C[i7], false);
            if (i4 > 0) {
                break;
            }
            i7++;
        }
        this.f18095m = i7;
        this.f18096n = i4;
        while (true) {
            if (i5 < d84.f11668q.size()) {
                String str = c0Var.f5234l;
                if (str != null && str.equals(d84.f11668q.get(i5))) {
                    i2 = i5;
                    break;
                }
                i5++;
            } else {
                break;
            }
        }
        this.f18101s = i2;
    }

    /* renamed from: b */
    public final int compareTo(z74 z74) {
        s83 i = this.f18091i ? k84.f9433f : k84.f9433f.mo5189a();
        t63 c = t63.m17119i().mo10250d(this.f18091i, z74.f18091i).mo10249c(Integer.valueOf(this.f18093k), Integer.valueOf(z74.f18093k), s83.m16651c().mo5189a()).mo10248b(this.f18092j, z74.f18092j).mo10248b(this.f18094l, z74.f18094l).mo10250d(true, true).mo10249c(Integer.valueOf(this.f18101s), Integer.valueOf(z74.f18101s), s83.m16651c().mo5189a());
        Integer valueOf = Integer.valueOf(this.f18100r);
        Integer valueOf2 = Integer.valueOf(z74.f18100r);
        boolean z = this.f18090h.f11672u;
        t63 c2 = c.mo10249c(valueOf, valueOf2, k84.f9434g).mo10250d(this.f18097o, z74.f18097o).mo10249c(Integer.valueOf(this.f18095m), Integer.valueOf(z74.f18095m), s83.m16651c().mo5189a()).mo10248b(this.f18096n, z74.f18096n).mo10249c(Integer.valueOf(this.f18098p), Integer.valueOf(z74.f18098p), i).mo10249c(Integer.valueOf(this.f18099q), Integer.valueOf(z74.f18099q), i);
        Integer valueOf3 = Integer.valueOf(this.f18100r);
        Integer valueOf4 = Integer.valueOf(z74.f18100r);
        if (!n13.m13643p(this.f18089g, z74.f18089g)) {
            i = k84.f9434g;
        }
        return c2.mo10249c(valueOf3, valueOf4, i).mo10247a();
    }
}
