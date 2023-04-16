package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p048g2.C2637b;

public final class o72 implements j52<ij1, cf0, y62> {

    /* renamed from: a */
    private final Context f11933a;

    /* renamed from: b */
    private final gk1 f11934b;

    public o72(Context context, gk1 gk1) {
        this.f11933a = context;
        this.f11934b = gk1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6411a(ds2 ds2, rr2 rr2, d52 d52) {
        h72 h72 = new h72(rr2, (cf0) d52.f5647b, false);
        jj1 c = this.f11934b.mo7198c(new l71(ds2, rr2, d52.f5646a), new nj1(h72, (eu0) null));
        h72.mo7858b(c.mo5576b());
        ((y62) d52.f5648c).mo11973A5(c.mo5579f());
        return c.mo5582i();
    }

    /* renamed from: b */
    public final void mo6412b(ds2 ds2, rr2 rr2, d52<cf0, y62> d52) {
        try {
            ((cf0) d52.f5647b).mo5259c0(rr2.f13880W);
            ((cf0) d52.f5647b).mo5255L1(rr2.f13875R, rr2.f13917w.toString(), ds2.f5903a.f4336a.f9639d, C2637b.m21358Z2(this.f11933a), new n72(this, d52, (m72) null), (jd0) d52.f5648c);
        } catch (RemoteException e) {
            throw new ps2(e);
        }
    }
}
