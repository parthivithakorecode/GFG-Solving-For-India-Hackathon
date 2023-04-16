package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class ye0 extends C1514ae implements ze0 {
    public ye0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            mo6095e();
        } else if (i == 3) {
            mo6096u(parcel.readString());
        } else if (i != 4) {
            return false;
        } else {
            mo6097w((C1605cv) C1551be.m6816a(parcel, C1605cv.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
