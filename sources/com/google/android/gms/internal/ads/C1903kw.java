package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p048g2.C2637b;

/* renamed from: com.google.android.gms.internal.ads.kw */
final class C1903kw extends C2088pw<C1867jx> {

    /* renamed from: b */
    final /* synthetic */ Context f9691b;

    /* renamed from: c */
    final /* synthetic */ String f9692c;

    /* renamed from: d */
    final /* synthetic */ dd0 f9693d;

    /* renamed from: e */
    final /* synthetic */ C2051ow f9694e;

    C1903kw(C2051ow owVar, Context context, String str, dd0 dd0) {
        this.f9694e = owVar;
        this.f9691b = context;
        this.f9692c = str;
        this.f9693d = dd0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5977a() {
        C2051ow.m14660n(this.f9691b, "native_ad");
        return new d00();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo5978b(C2386xx xxVar) {
        return xxVar.mo4942O0(C2637b.m21358Z2(this.f9691b), this.f9692c, this.f9693d, 214106000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo5979c() {
        m10.m13007c(this.f9691b);
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10512h7)).booleanValue()) {
            return this.f9694e.f12218b.mo8021c(this.f9691b, this.f9692c, this.f9693d);
        }
        try {
            IBinder b3 = ((C1904kx) no0.m14004b(this.f9691b, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", C1866jw.f9275a)).mo8808b3(C2637b.m21358Z2(this.f9691b), this.f9692c, this.f9693d, 214106000);
            if (b3 == null) {
                return null;
            }
            IInterface queryLocalInterface = b3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof C1867jx ? (C1867jx) queryLocalInterface : new C1793hx(b3);
        } catch (RemoteException | mo0 | NullPointerException e) {
            this.f9694e.f12224h = xh0.m19512c(this.f9691b);
            this.f9694e.f12224h.mo11846a(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
