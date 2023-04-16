package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

public final class t80 implements Parcelable.Creator<s80> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                str = C1299b.m5196f(parcel, o);
            } else if (l == 2) {
                strArr = C1299b.m5197g(parcel, o);
            } else if (l != 3) {
                C1299b.m5210t(parcel, o);
            } else {
                strArr2 = C1299b.m5197g(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new s80(str, strArr, strArr2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new s80[i];
    }
}
