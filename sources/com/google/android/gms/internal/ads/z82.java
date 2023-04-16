package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class z82 implements j52<hs1, at2, y62> {

    /* renamed from: a */
    private final Context f18105a;

    /* renamed from: b */
    private final Executor f18106b;

    /* renamed from: c */
    private final ms1 f18107c;

    public z82(Context context, Executor executor, ms1 ms1) {
        this.f18105a = context;
        this.f18106b = executor;
        this.f18107c = ms1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6411a(ds2 ds2, rr2 rr2, d52 d52) {
        is1 f = this.f18107c.mo9362f(new l71(ds2, rr2, d52.f5646a), new js1(new y82(d52)));
        f.mo5577c().mo8945B0(new g21((at2) d52.f5647b), this.f18106b);
        ((y62) d52.f5648c).mo11973A5(f.mo8247m());
        return f.mo8245k();
    }

    /* renamed from: b */
    public final void mo6412b(ds2 ds2, rr2 rr2, d52<at2, y62> d52) {
        try {
            ks2 ks2 = ds2.f5903a.f4336a;
            if (ks2.f9650o.f18341a == 3) {
                ((at2) d52.f5647b).mo5513t(this.f18105a, ks2.f9639d, rr2.f13917w.toString(), (jd0) d52.f5648c);
            } else {
                ((at2) d52.f5647b).mo5512s(this.f18105a, ks2.f9639d, rr2.f13917w.toString(), (jd0) d52.f5648c);
            }
        } catch (Exception e) {
            String valueOf = String.valueOf(d52.f5646a);
            io0.m11132h(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e);
        }
    }
}
