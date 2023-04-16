package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

/* renamed from: com.google.android.gms.internal.ads.uv */
public final class C2272uv implements Parcelable.Creator<C2235tv> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        String str = null;
        C1605cv cvVar = null;
        Bundle bundle = null;
        long j = 0;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                str = C1299b.m5196f(parcel, o);
            } else if (l == 2) {
                j = C1299b.m5208r(parcel, o);
            } else if (l == 3) {
                cvVar = (C1605cv) C1299b.m5195e(parcel, o, C1605cv.CREATOR);
            } else if (l != 4) {
                C1299b.m5210t(parcel, o);
            } else {
                bundle = C1299b.m5191a(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new C2235tv(str, j, cvVar, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2235tv[i];
    }
}
