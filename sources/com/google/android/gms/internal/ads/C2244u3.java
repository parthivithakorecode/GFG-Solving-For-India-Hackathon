package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.u3 */
final class C2244u3 {

    /* renamed from: a */
    private final C2317w2 f15376a;

    /* renamed from: b */
    private final ky2 f15377b;

    /* renamed from: c */
    private final cq2 f15378c = new cq2(new byte[64], 64);

    /* renamed from: d */
    private boolean f15379d;

    /* renamed from: e */
    private boolean f15380e;

    /* renamed from: f */
    private boolean f15381f;

    public C2244u3(C2317w2 w2Var, ky2 ky2) {
        this.f15376a = w2Var;
        this.f15377b = ky2;
    }

    /* renamed from: a */
    public final void mo11152a(dr2 dr2) {
        long j;
        dr2.mo6576b(this.f15378c.f5494a, 0, 3);
        this.f15378c.mo6267h(0);
        this.f15378c.mo6269j(8);
        this.f15379d = this.f15378c.mo6271l();
        this.f15380e = this.f15378c.mo6271l();
        this.f15378c.mo6269j(6);
        dr2.mo6576b(this.f15378c.f5494a, 0, this.f15378c.mo6262c(8));
        this.f15378c.mo6267h(0);
        if (this.f15379d) {
            this.f15378c.mo6269j(4);
            int c = this.f15378c.mo6262c(3);
            this.f15378c.mo6269j(1);
            int c2 = this.f15378c.mo6262c(15);
            this.f15378c.mo6269j(1);
            long c3 = (((long) c) << 30) | ((long) (c2 << 15)) | ((long) this.f15378c.mo6262c(15));
            this.f15378c.mo6269j(1);
            if (!this.f15381f && this.f15380e) {
                this.f15378c.mo6269j(4);
                int c4 = this.f15378c.mo6262c(3);
                this.f15378c.mo6269j(1);
                int c5 = this.f15378c.mo6262c(15);
                this.f15378c.mo6269j(1);
                int c6 = this.f15378c.mo6262c(15);
                this.f15378c.mo6269j(1);
                this.f15377b.mo8817b(((long) (c5 << 15)) | (((long) c4) << 30) | ((long) c6));
                this.f15381f = true;
            }
            j = this.f15377b.mo8817b(c3);
        } else {
            j = 0;
        }
        this.f15376a.mo5642e(j, 4);
        this.f15376a.mo5638a(dr2);
        this.f15376a.mo5640c();
    }

    /* renamed from: b */
    public final void mo11153b() {
        this.f15381f = false;
        this.f15376a.mo5639b();
    }
}
