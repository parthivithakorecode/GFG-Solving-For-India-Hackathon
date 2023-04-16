package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import p048g2.C2635a;

/* renamed from: com.google.android.gms.internal.ads.gy */
public final class C1757gy extends C2440zd {
    C1757gy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    /* renamed from: b3 */
    public final IBinder mo7732b3(C2635a aVar, int i) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        D.writeInt(214106000);
        Parcel n0 = mo12210n0(1, D);
        IBinder readStrongBinder = n0.readStrongBinder();
        n0.recycle();
        return readStrongBinder;
    }
}
