package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

public final class g90 implements Parcelable.Creator<f90> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        boolean z = false;
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                str = C1299b.m5196f(parcel, o);
            } else if (l == 2) {
                z = C1299b.m5203m(parcel, o);
            } else if (l == 3) {
                i = C1299b.m5207q(parcel, o);
            } else if (l != 4) {
                C1299b.m5210t(parcel, o);
            } else {
                str2 = C1299b.m5196f(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new f90(str, z, i, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new f90[i];
    }
}
