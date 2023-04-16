package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import p048g2.C2635a;

public final class kk0 extends C2440zd {
    kk0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    /* renamed from: b3 */
    public final IBinder mo8685b3(C2635a aVar, String str, dd0 dd0, int i) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        D.writeString(str);
        C1551be.m6821f(D, dd0);
        D.writeInt(214106000);
        Parcel n0 = mo12210n0(1, D);
        IBinder readStrongBinder = n0.readStrongBinder();
        n0.recycle();
        return readStrongBinder;
    }
}
