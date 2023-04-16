package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

public final class th0 implements Parcelable.Creator<sh0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                iBinder = C1299b.m5206p(parcel, o);
            } else if (l != 2) {
                C1299b.m5210t(parcel, o);
            } else {
                iBinder2 = C1299b.m5206p(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new sh0(iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new sh0[i];
    }
}
