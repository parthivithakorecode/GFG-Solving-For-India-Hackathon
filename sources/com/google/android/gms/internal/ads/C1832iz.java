package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

/* renamed from: com.google.android.gms.internal.ads.iz */
public final class C1832iz implements Parcelable.Creator<C1795hz> {
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
        return new C1795hz(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C1795hz[i];
    }
}
