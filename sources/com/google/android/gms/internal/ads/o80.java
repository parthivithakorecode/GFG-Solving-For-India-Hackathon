package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class o80 extends C1514ae implements p80 {
    public o80() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo7417z(parcel.readString());
        } else if (i != 2) {
            return false;
        } else {
            mo7416b();
        }
        parcel2.writeNoException();
        return true;
    }
}
