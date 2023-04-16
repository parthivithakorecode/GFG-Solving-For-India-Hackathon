package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

public abstract class xm0 extends C1514ae implements ym0 {
    public xm0() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
        } else if (i == 2) {
            mo10284s(parcel.readString());
        } else if (i != 3) {
            return false;
        } else {
            mo10283E2(parcel.readString(), parcel.readString(), (Bundle) C1551be.m6816a(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
