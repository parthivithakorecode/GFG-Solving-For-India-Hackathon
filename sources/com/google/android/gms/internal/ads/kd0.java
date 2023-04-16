package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import p048g2.C2635a;

public final class kd0 extends C2440zd implements md0 {
    kd0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    /* renamed from: b */
    public final C2635a mo6460b() {
        Parcel n0 = mo12210n0(1, mo12207D());
        C2635a n02 = C2635a.C2636a.m21356n0(n0.readStrongBinder());
        n0.recycle();
        return n02;
    }

    /* renamed from: d */
    public final boolean mo6461d() {
        Parcel n0 = mo12210n0(2, mo12207D());
        boolean g = C1551be.m6822g(n0);
        n0.recycle();
        return g;
    }
}
