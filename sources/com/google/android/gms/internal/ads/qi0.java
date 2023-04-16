package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import p069j1.C3157f0;

public abstract class qi0 extends C1514ae implements ri0 {
    public qi0() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo10062H0((ParcelFileDescriptor) C1551be.m6816a(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo10063m3((C3157f0) C1551be.m6816a(parcel, C3157f0.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
