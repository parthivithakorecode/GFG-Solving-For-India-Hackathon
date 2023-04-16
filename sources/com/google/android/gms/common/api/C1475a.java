package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

/* renamed from: com.google.android.gms.common.api.a */
public final class C1475a implements Parcelable.Creator<Scope> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                i = C1299b.m5207q(parcel, o);
            } else if (l != 2) {
                C1299b.m5210t(parcel, o);
            } else {
                str = C1299b.m5196f(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new Scope(i, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Scope[i];
    }
}
