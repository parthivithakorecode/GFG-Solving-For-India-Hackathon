package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.google.android.gms.internal.ads.y1 */
public final class C2391y1 implements oc4 {

    /* renamed from: d */
    public static final vc4 f17537d = C2354x1.f16977b;

    /* renamed from: a */
    private rc4 f17538a;

    /* renamed from: b */
    private C1762h2 f17539b;

    /* renamed from: c */
    private boolean f17540c;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    /* renamed from: a */
    private final boolean m19793a(pc4 pc4) {
        C1762h2 c2Var;
        C1502a2 a2Var = new C1502a2();
        if (a2Var.mo5069b(pc4, true) && (a2Var.f3886a & 2) == 2) {
            int min = Math.min(a2Var.f3890e, 8);
            dr2 dr2 = new dr2(min);
            ((jc4) pc4).mo6917n(dr2.mo6582h(), 0, min, false);
            dr2.mo6580f(0);
            if (dr2.mo6583i() >= 5 && dr2.mo6593s() == 127 && dr2.mo6567A() == 1179402563) {
                c2Var = new C2316w1();
            } else {
                dr2.mo6580f(0);
                try {
                    if (yd4.m19982c(1, dr2, true)) {
                        c2Var = new C1836j2();
                    }
                } catch (C1646dz unused) {
                }
                dr2.mo6580f(0);
                if (C1576c2.m7186j(dr2)) {
                    c2Var = new C1576c2();
                }
            }
            this.f17539b = c2Var;
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo5040c(pc4 pc4) {
        try {
            return m19793a(pc4);
        } catch (C1646dz unused) {
            return false;
        }
    }

    /* renamed from: e */
    public final int mo5042e(pc4 pc4, md4 md4) {
        wu1.m19203b(this.f17538a);
        if (this.f17539b == null) {
            if (m19793a(pc4)) {
                pc4.mo6914i();
            } else {
                throw C1646dz.m8223a("Failed to determine bitstream type", (Throwable) null);
            }
        }
        if (!this.f17540c) {
            td4 r = this.f17538a.mo10270r(0, 1);
            this.f17538a.mo10268G();
            this.f17539b.mo7805g(this.f17538a, r);
            this.f17540c = true;
        }
        return this.f17539b.mo7802d(pc4, md4);
    }

    /* renamed from: g */
    public final void mo5044g(rc4 rc4) {
        this.f17538a = rc4;
    }

    /* renamed from: h */
    public final void mo5045h(long j, long j2) {
        C1762h2 h2Var = this.f17539b;
        if (h2Var != null) {
            h2Var.mo7807i(j, j2);
        }
    }
}
