package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import p069j1.C3138a1;

public final class z72 implements j52<mm1, at2, y62> {

    /* renamed from: a */
    private final Context f18085a;

    /* renamed from: b */
    private final dl1 f18086b;

    /* renamed from: c */
    private final Executor f18087c;

    public z72(Context context, dl1 dl1, Executor executor) {
        this.f18085a = context;
        this.f18086b = dl1;
        this.f18087c = executor;
    }

    /* renamed from: c */
    private static final boolean m20520c(ds2 ds2, int i) {
        return ds2.f5903a.f4336a.f9642g.contains(Integer.toString(i));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6411a(ds2 ds2, rr2 rr2, d52 d52) {
        rm1 rm1;
        od0 b = ((at2) d52.f5647b).mo5495b();
        pd0 c = ((at2) d52.f5647b).mo5496c();
        sd0 g = ((at2) d52.f5647b).mo5500g();
        if (g != null && m20520c(ds2, 6)) {
            rm1 = rm1.m16278a0(g);
        } else if (b != null && m20520c(ds2, 6)) {
            rm1 = rm1.m16273E(b);
        } else if (b != null && m20520c(ds2, 2)) {
            rm1 = rm1.m16271C(b);
        } else if (c != null && m20520c(ds2, 6)) {
            rm1 = rm1.m16274F(c);
        } else if (c == null || !m20520c(ds2, 1)) {
            throw new u82(1, "No native ad mappers");
        } else {
            rm1 = rm1.m16272D(c);
        }
        if (ds2.f5903a.f4336a.f9642g.contains(Integer.toString(rm1.mo10557K()))) {
            tm1 d = this.f18086b.mo6499d(new l71(ds2, rr2, d52.f5646a), new dn1(rm1), new so1(c, b, g, (byte[]) null));
            ((y62) d52.f5648c).mo11973A5(d.mo5580g());
            d.mo5577c().mo8945B0(new g21((at2) d52.f5647b), this.f18087c);
            return d.mo10195h();
        }
        throw new u82(1, "No corresponding native ad listener");
    }

    /* renamed from: b */
    public final void mo6412b(ds2 ds2, rr2 rr2, d52<at2, y62> d52) {
        ks2 ks2 = ds2.f5903a.f4336a;
        ((at2) d52.f5647b).mo5511r(this.f18085a, ds2.f5903a.f4336a.f9639d, rr2.f13917w.toString(), C3138a1.m23830l(rr2.f13914t), (jd0) d52.f5648c, ks2.f9644i, ks2.f9642g);
    }
}
