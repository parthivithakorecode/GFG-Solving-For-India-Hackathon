package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

public final class n23 implements Parcelable.Creator<m23> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                i = C1299b.m5207q(parcel, o);
            } else if (l == 2) {
                i2 = C1299b.m5207q(parcel, o);
            } else if (l == 3) {
                str = C1299b.m5196f(parcel, o);
            } else if (l == 4) {
                str2 = C1299b.m5196f(parcel, o);
            } else if (l != 5) {
                C1299b.m5210t(parcel, o);
            } else {
                i3 = C1299b.m5207q(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new m23(i, i2, i3, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new m23[i];
    }
}
