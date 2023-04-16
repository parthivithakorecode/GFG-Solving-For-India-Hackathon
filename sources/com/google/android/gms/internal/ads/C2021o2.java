package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.o2 */
public final class C2021o2 implements oc4 {

    /* renamed from: d */
    public static final vc4 f11822d = C1984n2.f11253b;

    /* renamed from: a */
    private final C2058p2 f11823a = new C2058p2((String) null);

    /* renamed from: b */
    private final dr2 f11824b = new dr2(16384);

    /* renamed from: c */
    private boolean f11825c;

    /* renamed from: c */
    public final boolean mo5040c(pc4 pc4) {
        int i;
        dr2 dr2 = new dr2(10);
        int i2 = 0;
        while (true) {
            jc4 jc4 = (jc4) pc4;
            jc4.mo6917n(dr2.mo6582h(), 0, 10, false);
            dr2.mo6580f(0);
            if (dr2.mo6595u() != 4801587) {
                break;
            }
            dr2.mo6581g(3);
            int r = dr2.mo6592r();
            i2 += r + 10;
            jc4.mo8446o(r, false);
        }
        pc4.mo6914i();
        jc4 jc42 = (jc4) pc4;
        jc42.mo8446o(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            jc42.mo6917n(dr2.mo6582h(), 0, 7, false);
            dr2.mo6580f(0);
            int w = dr2.mo6597w();
            if (w == 44096 || w == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] h = dr2.mo6582h();
                int i6 = wb4.f16781b;
                if (h.length < 7) {
                    i = -1;
                } else {
                    byte b = ((h[2] & 255) << 8) | (h[3] & 255);
                    if (b == 65535) {
                        b = ((h[4] & 255) << 16) | ((h[5] & 255) << 8) | (h[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (w == 44097) {
                        i5 += 2;
                    }
                    i = b + i5;
                }
                if (i == -1) {
                    return false;
                }
                jc42.mo8446o(i - 7, false);
            } else {
                pc4.mo6914i();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                jc42.mo8446o(i4, false);
                i3 = 0;
            }
        }
    }

    /* renamed from: e */
    public final int mo5042e(pc4 pc4, md4 md4) {
        int a = pc4.mo5752a(this.f11824b.mo6582h(), 0, 16384);
        if (a == -1) {
            return -1;
        }
        this.f11824b.mo6580f(0);
        this.f11824b.mo6579e(a);
        if (!this.f11825c) {
            this.f11823a.mo5642e(0, 4);
            this.f11825c = true;
        }
        this.f11823a.mo5638a(this.f11824b);
        return 0;
    }

    /* renamed from: g */
    public final void mo5044g(rc4 rc4) {
        this.f11823a.mo5641d(rc4, new C1875k4(Integer.MIN_VALUE, 0, 1));
        rc4.mo10268G();
        rc4.mo10269p(new od4(-9223372036854775807L, 0));
    }

    /* renamed from: h */
    public final void mo5045h(long j, long j2) {
        this.f11825c = false;
        this.f11823a.mo5639b();
    }
}
