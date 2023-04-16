package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import p013b2.C1299b;

public final class ui0 implements Parcelable.Creator<ti0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            if (C1299b.m5202l(o) != 2) {
                C1299b.m5210t(parcel, o);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) C1299b.m5195e(parcel, o, ParcelFileDescriptor.CREATOR);
            }
        }
        C1299b.m5201k(parcel, u);
        return new ti0(parcelFileDescriptor);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ti0[i];
    }
}
