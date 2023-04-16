package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import p048g2.C2635a;

public final class ah0 extends C2440zd implements ch0 {
    ah0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    public final IBinder zze(C2635a aVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        Parcel n0 = mo12210n0(1, D);
        IBinder readStrongBinder = n0.readStrongBinder();
        n0.recycle();
        return readStrongBinder;
    }
}
