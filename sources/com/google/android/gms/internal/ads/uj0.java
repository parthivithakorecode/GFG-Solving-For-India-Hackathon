package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

public final class uj0 implements Parcelable.Creator<tj0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        C1902kv kvVar = null;
        String str = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 2) {
                kvVar = (C1902kv) C1299b.m5195e(parcel, o, C1902kv.CREATOR);
            } else if (l != 3) {
                C1299b.m5210t(parcel, o);
            } else {
                str = C1299b.m5196f(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new tj0(kvVar, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new tj0[i];
    }
}
