package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

/* renamed from: com.google.android.gms.internal.ads.sv */
public final class C2198sv implements Parcelable.Creator<C2161rv> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        long j = 0;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                i = C1299b.m5207q(parcel, o);
            } else if (l == 2) {
                i2 = C1299b.m5207q(parcel, o);
            } else if (l == 3) {
                str = C1299b.m5196f(parcel, o);
            } else if (l != 4) {
                C1299b.m5210t(parcel, o);
            } else {
                j = C1299b.m5208r(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new C2161rv(i, i2, str, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2161rv[i];
    }
}
