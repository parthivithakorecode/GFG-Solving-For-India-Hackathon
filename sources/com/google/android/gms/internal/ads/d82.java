package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p048g2.C2637b;

public final class d82 implements j52<mm1, cf0, y62> {

    /* renamed from: a */
    private final Context f5690a;

    /* renamed from: b */
    private final dl1 f5691b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public sd0 f5692c;

    /* renamed from: d */
    private final po0 f5693d;

    public d82(Context context, dl1 dl1, po0 po0) {
        this.f5690a = context;
        this.f5691b = dl1;
        this.f5693d = po0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6411a(ds2 ds2, rr2 rr2, d52 d52) {
        if (ds2.f5903a.f4336a.f9642g.contains(Integer.toString(6))) {
            rm1 a0 = rm1.m16278a0(this.f5692c);
            if (ds2.f5903a.f4336a.f9642g.contains(Integer.toString(a0.mo10557K()))) {
                tm1 d = this.f5691b.mo6499d(new l71(ds2, rr2, d52.f5646a), new dn1(a0), new so1((pd0) null, (od0) null, this.f5692c, (byte[]) null));
                ((y62) d52.f5648c).mo11973A5(d.mo5579f());
                return d.mo10195h();
            }
            throw new u82(1, "No corresponding native ad listener");
        }
        throw new u82(2, "Unified must be used for RTB.");
    }

    /* renamed from: b */
    public final void mo6412b(ds2 ds2, rr2 rr2, d52<cf0, y62> d52) {
        try {
            ((cf0) d52.f5647b).mo5259c0(rr2.f13880W);
            if (this.f5693d.f12731h < ((Integer) C2199sw.m17001c().mo8579b(m10.f10524j1)).intValue()) {
                ((cf0) d52.f5647b).mo5266w1(rr2.f13875R, rr2.f13917w.toString(), ds2.f5903a.f4336a.f9639d, C2637b.m21358Z2(this.f5690a), new c82(this, d52, (b82) null), (jd0) d52.f5648c);
            } else {
                ((cf0) d52.f5647b).mo5265u3(rr2.f13875R, rr2.f13917w.toString(), ds2.f5903a.f4336a.f9639d, C2637b.m21358Z2(this.f5690a), new c82(this, d52, (b82) null), (jd0) d52.f5648c, ds2.f5903a.f4336a.f9644i);
            }
        } catch (RemoteException e) {
            throw new ps2(e);
        }
    }
}
