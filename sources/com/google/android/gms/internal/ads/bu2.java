package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

public final class bu2 implements Parcelable.Creator<au2> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        String str = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            switch (C1299b.m5202l(o)) {
                case 1:
                    i = C1299b.m5207q(parcel, o);
                    break;
                case 2:
                    i2 = C1299b.m5207q(parcel, o);
                    break;
                case 3:
                    i3 = C1299b.m5207q(parcel, o);
                    break;
                case 4:
                    i4 = C1299b.m5207q(parcel, o);
                    break;
                case 5:
                    str = C1299b.m5196f(parcel, o);
                    break;
                case 6:
                    i5 = C1299b.m5207q(parcel, o);
                    break;
                case 7:
                    i6 = C1299b.m5207q(parcel, o);
                    break;
                default:
                    C1299b.m5210t(parcel, o);
                    break;
            }
        }
        C1299b.m5201k(parcel, u);
        return new au2(i, i2, i3, i4, str, i5, i6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new au2[i];
    }
}
