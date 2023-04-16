package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

public final class qo0 implements Parcelable.Creator<po0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 2) {
                str = C1299b.m5196f(parcel, o);
            } else if (l == 3) {
                i = C1299b.m5207q(parcel, o);
            } else if (l == 4) {
                i2 = C1299b.m5207q(parcel, o);
            } else if (l == 5) {
                z = C1299b.m5203m(parcel, o);
            } else if (l != 6) {
                C1299b.m5210t(parcel, o);
            } else {
                z2 = C1299b.m5203m(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new po0(str, i, i2, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new po0[i];
    }
}
