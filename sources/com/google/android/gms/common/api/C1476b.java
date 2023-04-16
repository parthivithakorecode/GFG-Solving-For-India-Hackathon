package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;
import p160x1.C4280b;

/* renamed from: com.google.android.gms.common.api.b */
public final class C1476b implements Parcelable.Creator<Status> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        C4280b bVar = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 1) {
                i2 = C1299b.m5207q(parcel, o);
            } else if (l == 2) {
                str = C1299b.m5196f(parcel, o);
            } else if (l == 3) {
                pendingIntent = (PendingIntent) C1299b.m5195e(parcel, o, PendingIntent.CREATOR);
            } else if (l == 4) {
                bVar = (C4280b) C1299b.m5195e(parcel, o, C4280b.CREATOR);
            } else if (l != 1000) {
                C1299b.m5210t(parcel, o);
            } else {
                i = C1299b.m5207q(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new Status(i, i2, str, pendingIntent, bVar);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
