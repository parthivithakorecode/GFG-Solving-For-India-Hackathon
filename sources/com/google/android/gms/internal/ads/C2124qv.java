package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

/* renamed from: com.google.android.gms.internal.ads.qv */
public final class C2124qv implements Parcelable.Creator<C2087pv> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int u = C1299b.m5211u(parcel);
        String str = null;
        C2087pv[] pvVarArr = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            switch (C1299b.m5202l(o)) {
                case 2:
                    str = C1299b.m5196f(parcel2, o);
                    break;
                case 3:
                    i = C1299b.m5207q(parcel2, o);
                    break;
                case 4:
                    i2 = C1299b.m5207q(parcel2, o);
                    break;
                case 5:
                    z = C1299b.m5203m(parcel2, o);
                    break;
                case 6:
                    i3 = C1299b.m5207q(parcel2, o);
                    break;
                case 7:
                    i4 = C1299b.m5207q(parcel2, o);
                    break;
                case 8:
                    pvVarArr = (C2087pv[]) C1299b.m5199i(parcel2, o, C2087pv.CREATOR);
                    break;
                case 9:
                    z2 = C1299b.m5203m(parcel2, o);
                    break;
                case 10:
                    z3 = C1299b.m5203m(parcel2, o);
                    break;
                case 11:
                    z4 = C1299b.m5203m(parcel2, o);
                    break;
                case 12:
                    z5 = C1299b.m5203m(parcel2, o);
                    break;
                case 13:
                    z6 = C1299b.m5203m(parcel2, o);
                    break;
                case 14:
                    z7 = C1299b.m5203m(parcel2, o);
                    break;
                case 15:
                    z8 = C1299b.m5203m(parcel2, o);
                    break;
                case 16:
                    z9 = C1299b.m5203m(parcel2, o);
                    break;
                default:
                    C1299b.m5210t(parcel2, o);
                    break;
            }
        }
        C1299b.m5201k(parcel2, u);
        return new C2087pv(str, i, i2, z, i3, i4, pvVarArr, z2, z3, z4, z5, z6, z7, z8, z9);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2087pv[i];
    }
}
