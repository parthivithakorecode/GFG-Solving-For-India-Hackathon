package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p013b2.C1299b;

public final class kl0 implements Parcelable.Creator<jl0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            switch (C1299b.m5202l(o)) {
                case 2:
                    str = C1299b.m5196f(parcel, o);
                    break;
                case 3:
                    str2 = C1299b.m5196f(parcel, o);
                    break;
                case 4:
                    z = C1299b.m5203m(parcel, o);
                    break;
                case 5:
                    z2 = C1299b.m5203m(parcel, o);
                    break;
                case 6:
                    arrayList = C1299b.m5198h(parcel, o);
                    break;
                case 7:
                    z3 = C1299b.m5203m(parcel, o);
                    break;
                case 8:
                    z4 = C1299b.m5203m(parcel, o);
                    break;
                case 9:
                    arrayList2 = C1299b.m5198h(parcel, o);
                    break;
                default:
                    C1299b.m5210t(parcel, o);
                    break;
            }
        }
        C1299b.m5201k(parcel, u);
        return new jl0(str, str2, z, z2, arrayList, z3, z4, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new jl0[i];
    }
}
