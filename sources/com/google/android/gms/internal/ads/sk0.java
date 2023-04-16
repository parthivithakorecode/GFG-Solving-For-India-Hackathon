package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p048g2.C2637b;

public final class sk0 {
    /* renamed from: a */
    public static final fk0 m16881a(Context context, String str, dd0 dd0) {
        try {
            IBinder b3 = ((kk0) no0.m14004b(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", rk0.f13667a)).mo8685b3(C2637b.m21358Z2(context), str, dd0, 214106000);
            if (b3 == null) {
                return null;
            }
            IInterface queryLocalInterface = b3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof fk0 ? (fk0) queryLocalInterface : new dk0(b3);
        } catch (RemoteException | mo0 e) {
            io0.m11133i("#007 Could not call remote method.", e);
            return null;
        }
    }
}
