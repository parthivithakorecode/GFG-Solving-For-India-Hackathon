package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

public final class q23 implements Parcelable.Creator<p23> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        int i = 0;
        byte[] bArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                i = C1299b.m5207q(parcel, o);
            } else if (l == 2) {
                bArr = C1299b.m5192b(parcel, o);
            } else if (l != 3) {
                C1299b.m5210t(parcel, o);
            } else {
                i2 = C1299b.m5207q(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new p23(i, bArr, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new p23[i];
    }
}
