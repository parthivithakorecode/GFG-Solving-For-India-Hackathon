package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

public final class c40 implements Parcelable.Creator<b40> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        s00 s00 = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            switch (C1299b.m5202l(o)) {
                case 1:
                    i = C1299b.m5207q(parcel, o);
                    break;
                case 2:
                    z = C1299b.m5203m(parcel, o);
                    break;
                case 3:
                    i2 = C1299b.m5207q(parcel, o);
                    break;
                case 4:
                    z2 = C1299b.m5203m(parcel, o);
                    break;
                case 5:
                    i3 = C1299b.m5207q(parcel, o);
                    break;
                case 6:
                    s00 = (s00) C1299b.m5195e(parcel, o, s00.CREATOR);
                    break;
                case 7:
                    z3 = C1299b.m5203m(parcel, o);
                    break;
                case 8:
                    i4 = C1299b.m5207q(parcel, o);
                    break;
                default:
                    C1299b.m5210t(parcel, o);
                    break;
            }
        }
        C1299b.m5201k(parcel, u);
        return new b40(i, z, i2, z2, i3, s00, z3, i4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new b40[i];
    }
}
