package com.google.android.gms.internal.ads;

import android.os.Parcel;
import p048g2.C2635a;

public abstract class t40 extends C1514ae implements u40 {
    public t40() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo8700R4(C2635a.C2636a.m21356n0(parcel.readStrongBinder()));
        } else if (i == 2) {
            mo8704g();
        } else if (i != 3) {
            return false;
        } else {
            mo8718s0(C2635a.C2636a.m21356n0(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
