package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import p013b2.C1299b;

/* renamed from: com.google.android.gms.internal.ads.kq */
public final class C1897kq implements Parcelable.Creator<C1860jq> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        ParcelFileDescriptor parcelFileDescriptor = null;
        long j = 0;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) C1299b.m5195e(parcel, o, ParcelFileDescriptor.CREATOR);
            } else if (l == 3) {
                z = C1299b.m5203m(parcel, o);
            } else if (l == 4) {
                z2 = C1299b.m5203m(parcel, o);
            } else if (l == 5) {
                j = C1299b.m5208r(parcel, o);
            } else if (l != 6) {
                C1299b.m5210t(parcel, o);
            } else {
                z3 = C1299b.m5203m(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new C1860jq(parcelFileDescriptor, z, z2, j, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C1860jq[i];
    }
}
