package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

public final class t90 implements Parcelable.Creator<r90> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        int i3 = 0;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                i3 = C1299b.m5207q(parcel, o);
            } else if (l == 2) {
                str = C1299b.m5196f(parcel, o);
            } else if (l == 3) {
                i2 = C1299b.m5207q(parcel, o);
            } else if (l != 1000) {
                C1299b.m5210t(parcel, o);
            } else {
                i = C1299b.m5207q(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new r90(i, i3, str, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new r90[i];
    }
}
