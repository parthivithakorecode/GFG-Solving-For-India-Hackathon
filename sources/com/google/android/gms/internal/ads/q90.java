package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

public final class q90 implements Parcelable.Creator<p90> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        String str = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                str = C1299b.m5196f(parcel, o);
            } else if (l != 2) {
                C1299b.m5210t(parcel, o);
            } else {
                bundle = C1299b.m5191a(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new p90(str, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new p90[i];
    }
}
