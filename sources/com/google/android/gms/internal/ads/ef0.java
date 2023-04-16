package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class ef0 extends C1514ae implements ff0 {
    public ef0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo7325u(parcel.readString());
        } else if (i == 2) {
            mo7326z(parcel.readString());
        } else if (i != 3) {
            return false;
        } else {
            mo7324i5((C1605cv) C1551be.m6816a(parcel, C1605cv.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
