package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

public final class s82 {

    /* renamed from: a */
    private final ws2 f14329a;

    /* renamed from: b */
    private final ot1 f14330b;

    /* renamed from: c */
    private final wv1 f14331c;

    /* renamed from: d */
    private final xw2 f14332d;

    public s82(ws2 ws2, ot1 ot1, wv1 wv1, xw2 xw2) {
        this.f14329a = ws2;
        this.f14330b = ot1;
        this.f14331c = wv1;
        this.f14332d = xw2;
    }

    /* renamed from: a */
    public final void mo10748a(ur2 ur2, rr2 rr2, int i, @Nullable e52 e52, long j) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10592q6)).booleanValue()) {
            ww2 b = ww2.m19233b("adapter_status");
            b.mo11746g(ur2);
            b.mo11745f(rr2);
            b.mo11742a("adapter_l", String.valueOf(j));
            b.mo11742a("sc", Integer.toString(i));
            if (e52 != null) {
                b.mo11742a("arec", Integer.toString(e52.mo6829b().f5529f));
                String a = this.f14329a.mo11702a(e52.getMessage());
                if (a != null) {
                    b.mo11742a("areec", a);
                }
            }
            nt1 b2 = this.f14330b.mo9865b(rr2.f13915u);
            if (b2 != null) {
                b.mo11742a("ancn", b2.f11686a);
                qf0 qf0 = b2.f11687b;
                if (qf0 != null) {
                    b.mo11742a("adapter_v", qf0.toString());
                }
                qf0 qf02 = b2.f11688c;
                if (qf02 != null) {
                    b.mo11742a("adapter_sv", qf02.toString());
                }
            }
            this.f14332d.mo5981a(b);
            return;
        }
        vv1 a2 = this.f14331c.mo11740a();
        a2.mo11535d(ur2);
        a2.mo11534c(rr2);
        a2.mo11533b("action", "adapter_status");
        a2.mo11533b("adapter_l", String.valueOf(j));
        a2.mo11533b("sc", Integer.toString(i));
        if (e52 != null) {
            a2.mo11533b("arec", Integer.toString(e52.mo6829b().f5529f));
            String a3 = this.f14329a.mo11702a(e52.getMessage());
            if (a3 != null) {
                a2.mo11533b("areec", a3);
            }
        }
        nt1 b3 = this.f14330b.mo9865b(rr2.f13915u);
        if (b3 != null) {
            a2.mo11533b("ancn", b3.f11686a);
            qf0 qf03 = b3.f11687b;
            if (qf03 != null) {
                a2.mo11533b("adapter_v", qf03.toString());
            }
            qf0 qf04 = b3.f11688c;
            if (qf04 != null) {
                a2.mo11533b("adapter_sv", qf04.toString());
            }
        }
        a2.mo11537f();
    }
}
