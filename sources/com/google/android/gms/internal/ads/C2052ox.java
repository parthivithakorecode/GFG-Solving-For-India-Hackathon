package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import p048g2.C2635a;

/* renamed from: com.google.android.gms.internal.ads.ox */
public final class C2052ox extends C2440zd {
    C2052ox(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    /* renamed from: b3 */
    public final IBinder mo9878b3(C2635a aVar, C2087pv pvVar, String str, dd0 dd0, int i, int i2) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        C1551be.m6819d(D, pvVar);
        D.writeString(str);
        C1551be.m6821f(D, dd0);
        D.writeInt(214106000);
        D.writeInt(i2);
        Parcel n0 = mo12210n0(2, D);
        IBinder readStrongBinder = n0.readStrongBinder();
        n0.recycle();
        return readStrongBinder;
    }
}
