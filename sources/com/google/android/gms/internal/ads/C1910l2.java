package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l2 */
public final class C1910l2 implements oc4 {

    /* renamed from: d */
    public static final vc4 f9838d = C1873k2.f9347b;

    /* renamed from: a */
    private final C1947m2 f9839a = new C1947m2((String) null);

    /* renamed from: b */
    private final dr2 f9840b = new dr2(2786);

    /* renamed from: c */
    private boolean f9841c;

    /* renamed from: c */
    public final boolean mo5040c(pc4 pc4) {
        dr2 dr2 = new dr2(10);
        int i = 0;
        while (true) {
            jc4 jc4 = (jc4) pc4;
            jc4.mo6917n(dr2.mo6582h(), 0, 10, false);
            dr2.mo6580f(0);
            if (dr2.mo6595u() != 4801587) {
                break;
            }
            dr2.mo6581g(3);
            int r = dr2.mo6592r();
            i += r + 10;
            jc4.mo8446o(r, false);
        }
        pc4.mo6914i();
        jc4 jc42 = (jc4) pc4;
        jc42.mo8446o(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            jc42.mo6917n(dr2.mo6582h(), 0, 6, false);
            dr2.mo6580f(0);
            if (dr2.mo6597w() != 2935) {
                pc4.mo6914i();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                jc42.mo8446o(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int a = tb4.m17203a(dr2.mo6582h());
                if (a == -1) {
                    return false;
                }
                jc42.mo8446o(a - 6, false);
            }
        }
    }

    /* renamed from: e */
    public final int mo5042e(pc4 pc4, md4 md4) {
        int a = pc4.mo5752a(this.f9840b.mo6582h(), 0, 2786);
        if (a == -1) {
            return -1;
        }
        this.f9840b.mo6580f(0);
        this.f9840b.mo6579e(a);
        if (!this.f9841c) {
            this.f9839a.mo5642e(0, 4);
            this.f9841c = true;
        }
        this.f9839a.mo5638a(this.f9840b);
        return 0;
    }

    /* renamed from: g */
    public final void mo5044g(rc4 rc4) {
        this.f9839a.mo5641d(rc4, new C1875k4(Integer.MIN_VALUE, 0, 1));
        rc4.mo10268G();
        rc4.mo10269p(new od4(-9223372036854775807L, 0));
    }

    /* renamed from: h */
    public final void mo5045h(long j, long j2) {
        this.f9841c = false;
        this.f9839a.mo5639b();
    }
}
