package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l3 */
public final class C1911l3 implements C2317w2 {

    /* renamed from: a */
    private final dr2 f9864a;

    /* renamed from: b */
    private final jd4 f9865b;

    /* renamed from: c */
    private final String f9866c;

    /* renamed from: d */
    private td4 f9867d;

    /* renamed from: e */
    private String f9868e;

    /* renamed from: f */
    private int f9869f = 0;

    /* renamed from: g */
    private int f9870g;

    /* renamed from: h */
    private boolean f9871h;

    /* renamed from: i */
    private boolean f9872i;

    /* renamed from: j */
    private long f9873j;

    /* renamed from: k */
    private int f9874k;

    /* renamed from: l */
    private long f9875l;

    public C1911l3(String str) {
        dr2 dr2 = new dr2(4);
        this.f9864a = dr2;
        dr2.mo6582h()[0] = -1;
        this.f9865b = new jd4();
        this.f9875l = -9223372036854775807L;
        this.f9866c = str;
    }

    /* renamed from: a */
    public final void mo5638a(dr2 dr2) {
        wu1.m19203b(this.f9867d);
        while (dr2.mo6583i() > 0) {
            int i = this.f9869f;
            if (i == 0) {
                byte[] h = dr2.mo6582h();
                int k = dr2.mo6585k();
                int l = dr2.mo6586l();
                while (k < l) {
                    byte b = h[k];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.f9872i && (b & 224) == 224;
                    this.f9872i = z;
                    if (z2) {
                        dr2.mo6580f(k + 1);
                        this.f9872i = false;
                        this.f9864a.mo6582h()[1] = h[k];
                        this.f9870g = 2;
                    } else {
                        k++;
                    }
                }
                dr2.mo6580f(l);
            } else if (i != 1) {
                int min = Math.min(dr2.mo6583i(), this.f9874k - this.f9870g);
                rd4.m16162b(this.f9867d, dr2, min);
                int i2 = this.f9870g + min;
                this.f9870g = i2;
                int i3 = this.f9874k;
                if (i2 >= i3) {
                    long j = this.f9875l;
                    if (j != -9223372036854775807L) {
                        this.f9867d.mo7872a(j, 1, i3, 0, (sd4) null);
                        this.f9875l += this.f9873j;
                    }
                    this.f9870g = 0;
                    this.f9869f = 0;
                }
            } else {
                int min2 = Math.min(dr2.mo6583i(), 4 - this.f9870g);
                dr2.mo6576b(this.f9864a.mo6582h(), this.f9870g, min2);
                int i4 = this.f9870g + min2;
                this.f9870g = i4;
                if (i4 >= 4) {
                    this.f9864a.mo6580f(0);
                    if (!this.f9865b.mo8451a(this.f9864a.mo6587m())) {
                        this.f9870g = 0;
                    } else {
                        jd4 jd4 = this.f9865b;
                        this.f9874k = jd4.f9110c;
                        if (!this.f9871h) {
                            this.f9873j = (((long) jd4.f9114g) * 1000000) / ((long) jd4.f9111d);
                            bf4 bf4 = new bf4();
                            bf4.mo5830h(this.f9868e);
                            bf4.mo5842s(this.f9865b.f9109b);
                            bf4.mo5835l(4096);
                            bf4.mo5825e0(this.f9865b.f9112e);
                            bf4.mo5843t(this.f9865b.f9111d);
                            bf4.mo5834k(this.f9866c);
                            this.f9867d.mo7873b(bf4.mo5848y());
                            this.f9871h = true;
                        }
                        this.f9864a.mo6580f(0);
                        rd4.m16162b(this.f9867d, this.f9864a, 4);
                        this.f9869f = 2;
                    }
                }
            }
            this.f9869f = 1;
        }
    }

    /* renamed from: b */
    public final void mo5639b() {
        this.f9869f = 0;
        this.f9870g = 0;
        this.f9872i = false;
        this.f9875l = -9223372036854775807L;
    }

    /* renamed from: c */
    public final void mo5640c() {
    }

    /* renamed from: d */
    public final void mo5641d(rc4 rc4, C1875k4 k4Var) {
        k4Var.mo8612c();
        this.f9868e = k4Var.mo8611b();
        this.f9867d = rc4.mo10270r(k4Var.mo8610a(), 1);
    }

    /* renamed from: e */
    public final void mo5642e(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f9875l = j;
        }
    }
}
