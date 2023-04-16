package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.r2 */
public final class C2132r2 implements oc4 {

    /* renamed from: j */
    public static final vc4 f13466j = C2095q2.f13025b;

    /* renamed from: a */
    private final C2169s2 f13467a = new C2169s2(true, (String) null);

    /* renamed from: b */
    private final dr2 f13468b = new dr2(2048);

    /* renamed from: c */
    private final dr2 f13469c;

    /* renamed from: d */
    private final cq2 f13470d;

    /* renamed from: e */
    private rc4 f13471e;

    /* renamed from: f */
    private long f13472f;

    /* renamed from: g */
    private long f13473g = -1;

    /* renamed from: h */
    private boolean f13474h;

    /* renamed from: i */
    private boolean f13475i;

    public C2132r2(int i) {
        dr2 dr2 = new dr2(10);
        this.f13469c = dr2;
        byte[] h = dr2.mo6582h();
        this.f13470d = new cq2(h, h.length);
    }

    /* renamed from: c */
    public final boolean mo5040c(pc4 pc4) {
        int i = 0;
        while (true) {
            jc4 jc4 = (jc4) pc4;
            jc4.mo6917n(this.f13469c.mo6582h(), 0, 10, false);
            this.f13469c.mo6580f(0);
            if (this.f13469c.mo6595u() != 4801587) {
                break;
            }
            this.f13469c.mo6581g(3);
            int r = this.f13469c.mo6592r();
            i += r + 10;
            jc4.mo8446o(r, false);
        }
        pc4.mo6914i();
        jc4 jc42 = (jc4) pc4;
        jc42.mo8446o(i, false);
        if (this.f13473g == -1) {
            this.f13473g = (long) i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            jc42.mo6917n(this.f13469c.mo6582h(), 0, 2, false);
            this.f13469c.mo6580f(0);
            if (C2169s2.m16572f(this.f13469c.mo6597w())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                jc42.mo6917n(this.f13469c.mo6582h(), 0, 4, false);
                this.f13470d.mo6267h(14);
                int c = this.f13470d.mo6262c(13);
                if (c > 6) {
                    jc42.mo8446o(c - 6, false);
                    i3 += c;
                }
            }
            i4++;
            pc4.mo6914i();
            jc42.mo8446o(i4, false);
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    /* renamed from: e */
    public final int mo5042e(pc4 pc4, md4 md4) {
        wu1.m19203b(this.f13471e);
        int a = pc4.mo5752a(this.f13468b.mo6582h(), 0, 2048);
        if (!this.f13475i) {
            this.f13471e.mo10269p(new od4(-9223372036854775807L, 0));
            this.f13475i = true;
        }
        if (a == -1) {
            return -1;
        }
        this.f13468b.mo6580f(0);
        this.f13468b.mo6579e(a);
        if (!this.f13474h) {
            this.f13467a.mo5642e(this.f13472f, 4);
            this.f13474h = true;
        }
        this.f13467a.mo5638a(this.f13468b);
        return 0;
    }

    /* renamed from: g */
    public final void mo5044g(rc4 rc4) {
        this.f13471e = rc4;
        this.f13467a.mo5641d(rc4, new C1875k4(Integer.MIN_VALUE, 0, 1));
        rc4.mo10268G();
    }

    /* renamed from: h */
    public final void mo5045h(long j, long j2) {
        this.f13474h = false;
        this.f13467a.mo5639b();
        this.f13472f = j2;
    }
}
