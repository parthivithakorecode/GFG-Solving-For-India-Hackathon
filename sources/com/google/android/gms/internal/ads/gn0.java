package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

public final class gn0 implements Parcelable.Creator<fn0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        String str = null;
        String str2 = null;
        C2087pv pvVar = null;
        C1902kv kvVar = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                str = C1299b.m5196f(parcel, o);
            } else if (l == 2) {
                str2 = C1299b.m5196f(parcel, o);
            } else if (l == 3) {
                pvVar = (C2087pv) C1299b.m5195e(parcel, o, C2087pv.CREATOR);
            } else if (l != 4) {
                C1299b.m5210t(parcel, o);
            } else {
                kvVar = (C1902kv) C1299b.m5195e(parcel, o, C1902kv.CREATOR);
            }
        }
        C1299b.m5201k(parcel, u);
        return new fn0(str, str2, pvVar, kvVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new fn0[i];
    }
}
