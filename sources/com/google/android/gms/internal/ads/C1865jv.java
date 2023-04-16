package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p048g2.C2637b;
import p048g2.C2638c;

/* renamed from: com.google.android.gms.internal.ads.jv */
public final class C1865jv extends C2638c<C2052ox> {

    /* renamed from: c */
    private zh0 f9269c;

    public C1865jv() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo8020a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof C2052ox ? (C2052ox) queryLocalInterface : new C2052ox(iBinder);
    }

    /* renamed from: c */
    public final C2015nx mo8542c(Context context, C2087pv pvVar, String str, dd0 dd0, int i) {
        m10.m13007c(context);
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10512h7)).booleanValue()) {
            try {
                IBinder b3 = ((C2052ox) no0.m14004b(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", C1828iv.f8806a)).mo9878b3(C2637b.m21358Z2(context), pvVar, str, dd0, 214106000, i);
                if (b3 == null) {
                    return null;
                }
                IInterface queryLocalInterface = b3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof C2015nx ? (C2015nx) queryLocalInterface : new C1941lx(b3);
            } catch (RemoteException | mo0 | NullPointerException e) {
                zh0 c = xh0.m19512c(context);
                this.f9269c = c;
                c.mo11846a(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
                io0.m11133i("#007 Could not call remote method.", e);
                return null;
            }
        } else {
            try {
                IBinder b32 = ((C2052ox) mo12521b(context)).mo9878b3(C2637b.m21358Z2(context), pvVar, str, dd0, 214106000, i);
                if (b32 == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = b32.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface2 instanceof C2015nx ? (C2015nx) queryLocalInterface2 : new C1941lx(b32);
            } catch (RemoteException | C2638c.C2639a e2) {
                io0.m11127c("Could not create remote AdManager.", e2);
                return null;
            }
        }
    }
}
