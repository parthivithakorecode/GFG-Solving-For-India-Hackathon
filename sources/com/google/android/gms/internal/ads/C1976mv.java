package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p013b2.C1299b;
import p038f.C2591j;

/* renamed from: com.google.android.gms.internal.ads.mv */
public final class C1976mv implements Parcelable.Creator<C1902kv> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int u = C1299b.m5211u(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        Bundle bundle = null;
        ArrayList<String> arrayList = null;
        String str = null;
        p00 p00 = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        String str4 = null;
        C1531av avVar = null;
        String str5 = null;
        ArrayList<String> arrayList3 = null;
        String str6 = null;
        long j = 0;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            switch (C1299b.m5202l(o)) {
                case 1:
                    i = C1299b.m5207q(parcel2, o);
                    break;
                case 2:
                    j = C1299b.m5208r(parcel2, o);
                    break;
                case 3:
                    bundle = C1299b.m5191a(parcel2, o);
                    break;
                case 4:
                    i2 = C1299b.m5207q(parcel2, o);
                    break;
                case 5:
                    arrayList = C1299b.m5198h(parcel2, o);
                    break;
                case 6:
                    z = C1299b.m5203m(parcel2, o);
                    break;
                case 7:
                    i3 = C1299b.m5207q(parcel2, o);
                    break;
                case 8:
                    z2 = C1299b.m5203m(parcel2, o);
                    break;
                case 9:
                    str = C1299b.m5196f(parcel2, o);
                    break;
                case 10:
                    p00 = (p00) C1299b.m5195e(parcel2, o, p00.CREATOR);
                    break;
                case 11:
                    location = (Location) C1299b.m5195e(parcel2, o, Location.CREATOR);
                    break;
                case 12:
                    str2 = C1299b.m5196f(parcel2, o);
                    break;
                case 13:
                    bundle2 = C1299b.m5191a(parcel2, o);
                    break;
                case 14:
                    bundle3 = C1299b.m5191a(parcel2, o);
                    break;
                case 15:
                    arrayList2 = C1299b.m5198h(parcel2, o);
                    break;
                case 16:
                    str3 = C1299b.m5196f(parcel2, o);
                    break;
                case 17:
                    str4 = C1299b.m5196f(parcel2, o);
                    break;
                case 18:
                    z3 = C1299b.m5203m(parcel2, o);
                    break;
                case 19:
                    avVar = (C1531av) C1299b.m5195e(parcel2, o, C1531av.CREATOR);
                    break;
                case 20:
                    i4 = C1299b.m5207q(parcel2, o);
                    break;
                case 21:
                    str5 = C1299b.m5196f(parcel2, o);
                    break;
                case 22:
                    arrayList3 = C1299b.m5198h(parcel2, o);
                    break;
                case C2591j.f18882o3 /*23*/:
                    i5 = C1299b.m5207q(parcel2, o);
                    break;
                case C2591j.f18887p3 /*24*/:
                    str6 = C1299b.m5196f(parcel2, o);
                    break;
                default:
                    C1299b.m5210t(parcel2, o);
                    break;
            }
        }
        C1299b.m5201k(parcel2, u);
        return new C1902kv(i, j, bundle, i2, arrayList, z, i3, z2, str, p00, location, str2, bundle2, bundle3, arrayList2, str3, str4, z3, avVar, i4, str5, arrayList3, i5, str6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C1902kv[i];
    }
}
