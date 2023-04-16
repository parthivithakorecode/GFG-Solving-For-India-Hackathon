package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.concurrent.ExecutionException;
import p048g2.C2637b;

public final class n62 implements j52<t41, cf0, y62> {

    /* renamed from: a */
    private final Context f11322a;

    /* renamed from: b */
    private final r51 f11323b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public View f11324c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public md0 f11325d;

    public n62(Context context, r51 r51) {
        this.f11322a = context;
        this.f11323b = r51;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6411a(ds2 ds2, rr2 rr2, d52 d52) {
        View view;
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10303I5)).booleanValue() || !rr2.f13893e0) {
            view = this.f11324c;
        } else {
            try {
                view = (View) C2637b.m21357C0(this.f11325d.mo6460b());
                boolean d = this.f11325d.mo6461d();
                if (view == null) {
                    throw new ps2(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                } else if (d) {
                    try {
                        view = (View) rb3.m16136n(rb3.m16131i(null), new k62(this, view, rr2), wo0.f16890e).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new ps2(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new ps2(e2);
            }
        }
        u41 a = this.f11323b.mo7440a(new l71(ds2, rr2, d52.f5646a), new b51(view, (eu0) null, new j62(d52), rr2.f13916v.get(0)));
        a.mo5989i().mo8466S0(view);
        ((y62) d52.f5648c).mo11973A5(a.mo5579f());
        return a.mo5988h();
    }

    /* renamed from: b */
    public final void mo6412b(ds2 ds2, rr2 rr2, d52<cf0, y62> d52) {
        try {
            ((cf0) d52.f5647b).mo5259c0(rr2.f13880W);
            if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10303I5)).booleanValue() || !rr2.f13893e0) {
                ((cf0) d52.f5647b).mo5257S4(rr2.f13875R, rr2.f13917w.toString(), ds2.f5903a.f4336a.f9639d, C2637b.m21358Z2(this.f11322a), new m62(this, d52, (l62) null), (jd0) d52.f5648c, ds2.f5903a.f4336a.f9640e);
            } else {
                ((cf0) d52.f5647b).mo5254J3(rr2.f13875R, rr2.f13917w.toString(), ds2.f5903a.f4336a.f9639d, C2637b.m21358Z2(this.f11322a), new m62(this, d52, (l62) null), (jd0) d52.f5648c, ds2.f5903a.f4336a.f9640e);
            }
        } catch (RemoteException e) {
            throw new ps2(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ cc3 mo9434c(View view, rr2 rr2, Object obj) {
        return rb3.m16131i(k61.m12027a(this.f11322a, view, rr2));
    }
}
