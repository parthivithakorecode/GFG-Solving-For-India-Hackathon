package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p013b2.C1299b;

public final class ki0 implements Parcelable.Creator<ji0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        boolean z = false;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            int l = C1299b.m5202l(o);
            if (l == 2) {
                z = C1299b.m5203m(parcel, o);
            } else if (l != 3) {
                C1299b.m5210t(parcel, o);
            } else {
                arrayList = C1299b.m5198h(parcel, o);
            }
        }
        C1299b.m5201k(parcel, u);
        return new ji0(z, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ji0[i];
    }
}
