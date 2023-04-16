package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

/* renamed from: com.google.android.gms.internal.ads.dv */
public final class C1642dv implements Parcelable.Creator<C1605cv> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        String str = null;
        String str2 = null;
        C1605cv cvVar = null;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                i = C1299b.m5207q(parcel, o);
            } else if (l == 2) {
                str = C1299b.m5196f(parcel, o);
            } else if (l == 3) {
                str2 = C1299b.m5196f(parcel, o);
            } else if (l == 4) {
                cvVar = (C1605cv) C1299b.m5195e(parcel, o, C1605cv.CREATOR);
            } else if (l != 5) {
                C1299b.m5210t(parcel, o);
            } else {
                iBinder = C1299b.m5206p(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new C1605cv(i, str, str2, cvVar, iBinder);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C1605cv[i];
    }
}
