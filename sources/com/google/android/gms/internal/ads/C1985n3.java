package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.n3 */
public final class C1985n3 implements C2318w3 {

    /* renamed from: a */
    private C1574c0 f11274a;

    /* renamed from: b */
    private ky2 f11275b;

    /* renamed from: c */
    private td4 f11276c;

    public C1985n3(String str) {
        bf4 bf4 = new bf4();
        bf4.mo5842s(str);
        this.f11274a = bf4.mo5848y();
    }

    /* renamed from: a */
    public final void mo6379a(dr2 dr2) {
        wu1.m19203b(this.f11275b);
        int i = n13.f11236a;
        long d = this.f11275b.mo8819d();
        long e = this.f11275b.mo8820e();
        if (d != -9223372036854775807L && e != -9223372036854775807L) {
            C1574c0 c0Var = this.f11274a;
            if (e != c0Var.f5238p) {
                bf4 b = c0Var.mo6004b();
                b.mo5846w(e);
                C1574c0 y = b.mo5848y();
                this.f11274a = y;
                this.f11276c.mo7873b(y);
            }
            int i2 = dr2.mo6583i();
            rd4.m16162b(this.f11276c, dr2, i2);
            this.f11276c.mo7872a(d, 1, i2, 0, (sd4) null);
        }
    }

    /* renamed from: b */
    public final void mo6380b(ky2 ky2, rc4 rc4, C1875k4 k4Var) {
        this.f11275b = ky2;
        k4Var.mo8612c();
        td4 r = rc4.mo10270r(k4Var.mo8610a(), 5);
        this.f11276c = r;
        r.mo7873b(this.f11274a);
    }
}
