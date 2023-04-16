package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import p069j1.C3157f0;

public final class pi0 extends C2440zd implements ri0 {
    pi0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    /* renamed from: H0 */
    public final void mo10062H0(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, parcelFileDescriptor);
        mo12206C0(1, D);
    }

    /* renamed from: m3 */
    public final void mo10063m3(C3157f0 f0Var) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, f0Var);
        mo12206C0(2, D);
    }
}
