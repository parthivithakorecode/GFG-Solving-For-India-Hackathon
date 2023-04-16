package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class mk0 extends C1514ae implements nk0 {
    public mk0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo8969e();
        } else if (i == 2) {
            mo8968C(parcel.readInt());
        } else if (i != 3) {
            return false;
        } else {
            mo8970w((C1605cv) C1551be.m6816a(parcel, C1605cv.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
