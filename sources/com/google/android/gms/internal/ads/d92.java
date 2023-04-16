package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p048g2.C2637b;
import p069j1.C3202r1;

public final class d92 implements j52<hs1, cf0, y62> {

    /* renamed from: a */
    private final Context f5713a;

    /* renamed from: b */
    private final ms1 f5714b;

    public d92(Context context, ms1 ms1) {
        this.f5713a = context;
        this.f5714b = ms1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6411a(ds2 ds2, rr2 rr2, d52 d52) {
        h72 h72 = new h72(rr2, (cf0) d52.f5647b, true);
        is1 f = this.f5714b.mo9362f(new l71(ds2, rr2, d52.f5646a), new js1(h72));
        h72.mo7858b(f.mo5576b());
        ((y62) d52.f5648c).mo11973A5(f.mo8248n());
        return f.mo8245k();
    }

    /* renamed from: b */
    public final void mo6412b(ds2 ds2, rr2 rr2, d52<cf0, y62> d52) {
        try {
            ((cf0) d52.f5647b).mo5259c0(rr2.f13880W);
            if (ds2.f5903a.f4336a.f9650o.f18341a == 3) {
                ((cf0) d52.f5647b).mo5267w2(rr2.f13875R, rr2.f13917w.toString(), ds2.f5903a.f4336a.f9639d, C2637b.m21358Z2(this.f5713a), new c92(this, d52, (b92) null), (jd0) d52.f5648c);
            } else {
                ((cf0) d52.f5647b).mo5256N3(rr2.f13875R, rr2.f13917w.toString(), ds2.f5903a.f4336a.f9639d, C2637b.m21358Z2(this.f5713a), new c92(this, d52, (b92) null), (jd0) d52.f5648c);
            }
        } catch (RemoteException e) {
            C3202r1.m24016l("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
