package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import p048g2.C2637b;

/* renamed from: com.google.android.gms.internal.ads.zv */
final class C2458zv extends C2088pw<zg0> {

    /* renamed from: b */
    final /* synthetic */ Activity f18369b;

    /* renamed from: c */
    final /* synthetic */ C2051ow f18370c;

    C2458zv(C2051ow owVar, Activity activity) {
        this.f18370c = owVar;
        this.f18369b = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5977a() {
        C2051ow.m14660n(this.f18369b, "ad_overlay");
        return null;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo5978b(C2386xx xxVar) {
        return xxVar.mo4944b0(C2637b.m21358Z2(this.f18369b));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo5979c() {
        m10.m13007c(this.f18369b);
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10512h7)).booleanValue()) {
            return this.f18370c.f12222f.mo11651c(this.f18369b);
        }
        try {
            return yg0.m20013z5(((ch0) no0.m14004b(this.f18369b, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", C2421yv.f17910a)).zze(C2637b.m21358Z2(this.f18369b)));
        } catch (RemoteException | mo0 | NullPointerException e) {
            this.f18370c.f12224h = xh0.m19512c(this.f18369b.getApplicationContext());
            this.f18370c.f12224h.mo11846a(e, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
