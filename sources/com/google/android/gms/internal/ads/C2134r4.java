package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.r4 */
final class C2134r4 implements C2097q4 {

    /* renamed from: a */
    private final rc4 f13505a;

    /* renamed from: b */
    private final td4 f13506b;

    /* renamed from: c */
    private final C2208t4 f13507c;

    /* renamed from: d */
    private final C1574c0 f13508d;

    /* renamed from: e */
    private final int f13509e;

    /* renamed from: f */
    private long f13510f;

    /* renamed from: g */
    private int f13511g;

    /* renamed from: h */
    private long f13512h;

    public C2134r4(rc4 rc4, td4 td4, C2208t4 t4Var, String str, int i) {
        this.f13505a = rc4;
        this.f13506b = td4;
        this.f13507c = t4Var;
        int i2 = (t4Var.f14697b * t4Var.f14700e) / 8;
        int i3 = t4Var.f14699d;
        if (i3 == i2) {
            int i4 = t4Var.f14698c * i2;
            int i5 = i4 * 8;
            int max = Math.max(i2, i4 / 10);
            this.f13509e = max;
            bf4 bf4 = new bf4();
            bf4.mo5842s(str);
            bf4.mo5823d0(i5);
            bf4.mo5838o(i5);
            bf4.mo5835l(max);
            bf4.mo5825e0(t4Var.f14697b);
            bf4.mo5843t(t4Var.f14698c);
            bf4.mo5837n(i);
            this.f13508d = bf4.mo5848y();
            return;
        }
        StringBuilder sb = new StringBuilder(50);
        sb.append("Expected block size: ");
        sb.append(i2);
        sb.append("; got: ");
        sb.append(i3);
        throw C1646dz.m8223a(sb.toString(), (Throwable) null);
    }

    /* renamed from: a */
    public final void mo9959a(long j) {
        this.f13510f = j;
        this.f13511g = 0;
        this.f13512h = 0;
    }

    /* renamed from: b */
    public final void mo9960b(int i, long j) {
        this.f13505a.mo10269p(new C2319w4(this.f13507c, 1, (long) i, j));
        this.f13506b.mo7873b(this.f13508d);
    }

    /* renamed from: c */
    public final boolean mo9961c(pc4 pc4, long j) {
        int i;
        int i2;
        int i3;
        long j2 = j;
        while (true) {
            i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i <= 0 || (i2 = this.f13511g) >= (i3 = this.f13509e)) {
                C2208t4 t4Var = this.f13507c;
                int i4 = t4Var.f14699d;
                int i5 = this.f13511g / i4;
            } else {
                int a = rd4.m16161a(this.f13506b, pc4, (int) Math.min((long) (i3 - i2), j2), true);
                if (a == -1) {
                    j2 = 0;
                } else {
                    this.f13511g += a;
                    j2 -= (long) a;
                }
            }
        }
        C2208t4 t4Var2 = this.f13507c;
        int i42 = t4Var2.f14699d;
        int i52 = this.f13511g / i42;
        if (i52 > 0) {
            long j3 = this.f13510f;
            long Z = n13.m13621Z(this.f13512h, 1000000, (long) t4Var2.f14698c);
            int i6 = i52 * i42;
            int i7 = this.f13511g - i6;
            this.f13506b.mo7872a(j3 + Z, 1, i6, i7, (sd4) null);
            this.f13512h += (long) i52;
            this.f13511g = i7;
        }
        return i <= 0;
    }
}
