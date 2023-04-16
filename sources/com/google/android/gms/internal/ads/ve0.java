package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class ve0 extends C1514ae implements we0 {
    public ve0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo6080Y2(rd0.m16152z5(parcel.readStrongBinder()));
        } else if (i == 2) {
            mo6081u(parcel.readString());
        } else if (i != 3) {
            return false;
        } else {
            mo6082w((C1605cv) C1551be.m6816a(parcel, C1605cv.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
