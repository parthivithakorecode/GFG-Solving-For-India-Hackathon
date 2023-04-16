package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.v2 */
public final class C2280v2 implements C2317w2 {

    /* renamed from: a */
    private final List<C1764h4> f15856a;

    /* renamed from: b */
    private final td4[] f15857b;

    /* renamed from: c */
    private boolean f15858c;

    /* renamed from: d */
    private int f15859d;

    /* renamed from: e */
    private int f15860e;

    /* renamed from: f */
    private long f15861f = -9223372036854775807L;

    public C2280v2(List<C1764h4> list) {
        this.f15856a = list;
        this.f15857b = new td4[list.size()];
    }

    /* renamed from: f */
    private final boolean m18302f(dr2 dr2, int i) {
        if (dr2.mo6583i() == 0) {
            return false;
        }
        if (dr2.mo6593s() != i) {
            this.f15858c = false;
        }
        this.f15859d--;
        return this.f15858c;
    }

    /* renamed from: a */
    public final void mo5638a(dr2 dr2) {
        if (!this.f15858c) {
            return;
        }
        if (this.f15859d != 2 || m18302f(dr2, 32)) {
            if (this.f15859d != 1 || m18302f(dr2, 0)) {
                int k = dr2.mo6585k();
                int i = dr2.mo6583i();
                for (td4 e : this.f15857b) {
                    dr2.mo6580f(k);
                    e.mo7876e(dr2, i);
                }
                this.f15860e += i;
            }
        }
    }

    /* renamed from: b */
    public final void mo5639b() {
        this.f15858c = false;
        this.f15861f = -9223372036854775807L;
    }

    /* renamed from: c */
    public final void mo5640c() {
        if (this.f15858c) {
            if (this.f15861f != -9223372036854775807L) {
                for (td4 a : this.f15857b) {
                    a.mo7872a(this.f15861f, 1, this.f15860e, 0, (sd4) null);
                }
            }
            this.f15858c = false;
        }
    }

    /* renamed from: d */
    public final void mo5641d(rc4 rc4, C1875k4 k4Var) {
        for (int i = 0; i < this.f15857b.length; i++) {
            C1764h4 h4Var = this.f15856a.get(i);
            k4Var.mo8612c();
            td4 r = rc4.mo10270r(k4Var.mo8610a(), 3);
            bf4 bf4 = new bf4();
            bf4.mo5830h(k4Var.mo8611b());
            bf4.mo5842s("application/dvbsubs");
            bf4.mo5832i(Collections.singletonList(h4Var.f8039b));
            bf4.mo5834k(h4Var.f8038a);
            r.mo7873b(bf4.mo5848y());
            this.f15857b[i] = r;
        }
    }

    /* renamed from: e */
    public final void mo5642e(long j, int i) {
        if ((i & 4) != 0) {
            this.f15858c = true;
            if (j != -9223372036854775807L) {
                this.f15861f = j;
            }
            this.f15860e = 0;
            this.f15859d = 2;
        }
    }
}
