package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p048g2.C2637b;

/* renamed from: com.google.android.gms.internal.ads.mw */
final class C1977mw extends C2088pw<C1720fy> {

    /* renamed from: b */
    final /* synthetic */ Context f11056b;

    /* renamed from: c */
    final /* synthetic */ C2051ow f11057c;

    C1977mw(C2051ow owVar, Context context) {
        this.f11057c = owVar;
        this.f11056b = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5977a() {
        C2051ow.m14660n(this.f11056b, "mobile_ads_settings");
        return new i00();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo5978b(C2386xx xxVar) {
        return xxVar.mo4938E0(C2637b.m21358Z2(this.f11056b), 214106000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo5979c() {
        m10.m13007c(this.f11056b);
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10512h7)).booleanValue()) {
            return this.f11057c.f12219c.mo12285c(this.f11056b);
        }
        try {
            IBinder b3 = ((C1757gy) no0.m14004b(this.f11056b, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", C1940lw.f10193a)).mo7732b3(C2637b.m21358Z2(this.f11056b), 214106000);
            if (b3 == null) {
                return null;
            }
            IInterface queryLocalInterface = b3.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof C1720fy ? (C1720fy) queryLocalInterface : new C1608cy(b3);
        } catch (RemoteException | mo0 | NullPointerException e) {
            this.f11057c.f12224h = xh0.m19512c(this.f11056b);
            this.f11057c.f12224h.mo11846a(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
