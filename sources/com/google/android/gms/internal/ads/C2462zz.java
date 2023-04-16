package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p048g2.C2637b;
import p048g2.C2638c;

/* renamed from: com.google.android.gms.internal.ads.zz */
public final class C2462zz extends C2638c<C1757gy> {
    public C2462zz() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo8020a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof C1757gy ? (C1757gy) queryLocalInterface : new C1757gy(iBinder);
    }

    /* renamed from: c */
    public final C1720fy mo12285c(Context context) {
        try {
            IBinder b3 = ((C1757gy) mo12521b(context)).mo7732b3(C2637b.m21358Z2(context), 214106000);
            if (b3 == null) {
                return null;
            }
            IInterface queryLocalInterface = b3.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof C1720fy ? (C1720fy) queryLocalInterface : new C1608cy(b3);
        } catch (RemoteException | C2638c.C2639a e) {
            io0.m11132h("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
