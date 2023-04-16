package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.n4 */
final class C1986n4 {

    /* renamed from: a */
    private final List<C1574c0> f11301a;

    /* renamed from: b */
    private final td4[] f11302b;

    public C1986n4(List<C1574c0> list) {
        this.f11301a = list;
        this.f11302b = new td4[list.size()];
    }

    /* renamed from: a */
    public final void mo9420a(long j, dr2 dr2) {
        if (dr2.mo6583i() >= 9) {
            int m = dr2.mo6587m();
            int m2 = dr2.mo6587m();
            int s = dr2.mo6593s();
            if (m == 434 && m2 == 1195456820 && s == 3) {
                gc4.m9654b(j, dr2, this.f11302b);
            }
        }
    }

    /* renamed from: b */
    public final void mo9421b(rc4 rc4, C1875k4 k4Var) {
        for (int i = 0; i < this.f11302b.length; i++) {
            k4Var.mo8612c();
            td4 r = rc4.mo10270r(k4Var.mo8610a(), 3);
            C1574c0 c0Var = this.f11301a.get(i);
            String str = c0Var.f5234l;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            String valueOf = String.valueOf(str);
            wu1.m19206e(z, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            bf4 bf4 = new bf4();
            bf4.mo5830h(k4Var.mo8611b());
            bf4.mo5842s(str);
            bf4.mo5844u(c0Var.f5226d);
            bf4.mo5834k(c0Var.f5225c);
            bf4.mo5821c0(c0Var.f5220D);
            bf4.mo5832i(c0Var.f5236n);
            r.mo7873b(bf4.mo5848y());
            this.f11302b[i] = r;
        }
    }
}
