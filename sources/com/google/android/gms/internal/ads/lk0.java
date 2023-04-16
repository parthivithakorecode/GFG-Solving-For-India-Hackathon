package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class lk0 extends C2440zd implements nk0 {
    lk0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    /* renamed from: C */
    public final void mo8968C(int i) {
        Parcel D = mo12207D();
        D.writeInt(i);
        mo12206C0(2, D);
    }

    /* renamed from: e */
    public final void mo8969e() {
        mo12206C0(1, mo12207D());
    }

    /* renamed from: w */
    public final void mo8970w(C1605cv cvVar) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, cvVar);
        mo12206C0(3, D);
    }
}
