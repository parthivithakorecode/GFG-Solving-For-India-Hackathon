package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class nj0 extends C2440zd {
    nj0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    /* renamed from: b3 */
    public final void mo9534b3(mj0 mj0, String str, String str2) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, mj0);
        D.writeString(str);
        D.writeString(str2);
        mo12206C0(2, D);
    }
}
