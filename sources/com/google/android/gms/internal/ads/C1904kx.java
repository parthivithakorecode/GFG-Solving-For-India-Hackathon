package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import p048g2.C2635a;

/* renamed from: com.google.android.gms.internal.ads.kx */
public final class C1904kx extends C2440zd {
    C1904kx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    /* renamed from: b3 */
    public final IBinder mo8808b3(C2635a aVar, String str, dd0 dd0, int i) {
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
