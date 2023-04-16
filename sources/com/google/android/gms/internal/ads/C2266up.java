package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.up */
public final class C2266up extends C2440zd implements C2341wp {
    C2266up(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    /* renamed from: A1 */
    public final void mo9827A1(C2229tp tpVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, tpVar);
        mo12206C0(1, D);
    }

    /* renamed from: E */
    public final void mo9828E(int i) {
        Parcel D = mo12207D();
        D.writeInt(i);
        mo12206C0(2, D);
    }

    /* renamed from: x5 */
    public final void mo9829x5(C1605cv cvVar) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, cvVar);
        mo12206C0(3, D);
    }
}
