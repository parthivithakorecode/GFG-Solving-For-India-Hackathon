package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import p048g2.C2635a;

public final class zm0 extends C2440zd implements bn0 {
    zm0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    /* renamed from: K1 */
    public final void mo5890K1(C2635a aVar, fn0 fn0, ym0 ym0) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        C1551be.m6819d(D, fn0);
        C1551be.m6821f(D, ym0);
        mo12206C0(1, D);
    }
}
