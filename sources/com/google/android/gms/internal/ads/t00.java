package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

public final class t00 implements Parcelable.Creator<s00> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 2) {
                z = C1299b.m5203m(parcel, o);
            } else if (l == 3) {
                z2 = C1299b.m5203m(parcel, o);
            } else if (l != 4) {
                C1299b.m5210t(parcel, o);
            } else {
                z3 = C1299b.m5203m(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new s00(z, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new s00[i];
    }
}
