package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class rj0 extends C1514ae implements sj0 {
    /* renamed from: z5 */
    public static sj0 m16197z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return queryLocalInterface instanceof sj0 ? (sj0) queryLocalInterface : new qj0(iBinder);
    }
}
