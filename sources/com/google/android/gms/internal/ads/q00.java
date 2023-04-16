package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

public final class q00 implements Parcelable.Creator<p00> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        String str = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            if (C1299b.m5202l(o) != 15) {
                C1299b.m5210t(parcel, o);
            } else {
                str = C1299b.m5196f(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new p00(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new p00[i];
    }
}
