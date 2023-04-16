package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class se0 extends C1514ae implements te0 {
    public se0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            mo9457e();
        } else if (i == 3) {
            mo9458u(parcel.readString());
        } else if (i != 4) {
            return false;
        } else {
            mo9459w((C1605cv) C1551be.m6816a(parcel, C1605cv.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
