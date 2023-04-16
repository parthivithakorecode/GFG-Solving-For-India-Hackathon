package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class z90 extends C2440zd implements ba0 {
    z90(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    /* renamed from: C */
    public final void mo5756C(int i) {
        Parcel D = mo12207D();
        D.writeInt(i);
        mo12206C0(2, D);
    }

    /* renamed from: m1 */
    public final void mo5757m1(v90 v90) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, v90);
        mo12206C0(1, D);
    }

    /* renamed from: w */
    public final void mo5758w(C1605cv cvVar) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, cvVar);
        mo12206C0(3, D);
    }
}
