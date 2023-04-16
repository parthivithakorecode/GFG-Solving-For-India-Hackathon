package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

/* renamed from: com.google.android.gms.internal.ads.wv */
public final class C2347wv implements Parcelable.Creator<C2309vv> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        int i = 0;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            if (C1299b.m5202l(o) != 2) {
                C1299b.m5210t(parcel, o);
            } else {
                i = C1299b.m5207q(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new C2309vv(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2309vv[i];
    }
}
