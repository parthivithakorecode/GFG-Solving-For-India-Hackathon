package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p013b2.C1299b;
import p038f.C2591j;

public final class ii0 implements Parcelable.Creator<hi0> {
    /* renamed from: a */
    public static final hi0 m11036a(Parcel parcel) {
        Parcel parcel2 = parcel;
        int u = C1299b.m5211u(parcel);
        long j = 0;
        long j2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        int i7 = 0;
        boolean z5 = false;
        boolean z6 = false;
        int i8 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        Bundle bundle = null;
        C1902kv kvVar = null;
        C2087pv pvVar = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        po0 po0 = null;
        Bundle bundle2 = null;
        ArrayList<String> arrayList = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        ArrayList<String> arrayList2 = null;
        String str7 = null;
        b40 b40 = null;
        ArrayList<String> arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        C1795hz hzVar = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList<Integer> arrayList4 = null;
        String str15 = null;
        ArrayList<String> arrayList5 = null;
        ArrayList<String> arrayList6 = null;
        String str16 = null;
        r90 r90 = null;
        String str17 = null;
        Bundle bundle6 = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            switch (C1299b.m5202l(o)) {
                case 1:
                    i = C1299b.m5207q(parcel2, o);
                    break;
                case 2:
                    bundle = C1299b.m5191a(parcel2, o);
                    break;
                case 3:
                    kvVar = (C1902kv) C1299b.m5195e(parcel2, o, C1902kv.CREATOR);
                    break;
                case 4:
                    pvVar = (C2087pv) C1299b.m5195e(parcel2, o, C2087pv.CREATOR);
                    break;
                case 5:
                    str = C1299b.m5196f(parcel2, o);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) C1299b.m5195e(parcel2, o, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) C1299b.m5195e(parcel2, o, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = C1299b.m5196f(parcel2, o);
                    break;
                case 9:
                    str3 = C1299b.m5196f(parcel2, o);
                    break;
                case 10:
                    str4 = C1299b.m5196f(parcel2, o);
                    break;
                case 11:
                    po0 = (po0) C1299b.m5195e(parcel2, o, po0.CREATOR);
                    break;
                case 12:
                    bundle2 = C1299b.m5191a(parcel2, o);
                    break;
                case 13:
                    i2 = C1299b.m5207q(parcel2, o);
                    break;
                case 14:
                    arrayList = C1299b.m5198h(parcel2, o);
                    break;
                case 15:
                    bundle3 = C1299b.m5191a(parcel2, o);
                    break;
                case 16:
                    z = C1299b.m5203m(parcel2, o);
                    break;
                case 18:
                    i3 = C1299b.m5207q(parcel2, o);
                    break;
                case 19:
                    i4 = C1299b.m5207q(parcel2, o);
                    break;
                case 20:
                    f = C1299b.m5204n(parcel2, o);
                    break;
                case 21:
                    str5 = C1299b.m5196f(parcel2, o);
                    break;
                case 25:
                    j = C1299b.m5208r(parcel2, o);
                    break;
                case 26:
                    str6 = C1299b.m5196f(parcel2, o);
                    break;
                case 27:
                    arrayList2 = C1299b.m5198h(parcel2, o);
                    break;
                case 28:
                    str7 = C1299b.m5196f(parcel2, o);
                    break;
                case C2591j.f18912u3 /*29*/:
                    b40 = (b40) C1299b.m5195e(parcel2, o, b40.CREATOR);
                    break;
                case 30:
                    arrayList3 = C1299b.m5198h(parcel2, o);
                    break;
                case 31:
                    j2 = C1299b.m5208r(parcel2, o);
                    break;
                case 33:
                    str8 = C1299b.m5196f(parcel2, o);
                    break;
                case 34:
                    f2 = C1299b.m5204n(parcel2, o);
                    break;
                case 35:
                    i5 = C1299b.m5207q(parcel2, o);
                    break;
                case 36:
                    i6 = C1299b.m5207q(parcel2, o);
                    break;
                case 37:
                    z3 = C1299b.m5203m(parcel2, o);
                    break;
                case 39:
                    str9 = C1299b.m5196f(parcel2, o);
                    break;
                case 40:
                    z2 = C1299b.m5203m(parcel2, o);
                    break;
                case 41:
                    str10 = C1299b.m5196f(parcel2, o);
                    break;
                case 42:
                    z4 = C1299b.m5203m(parcel2, o);
                    break;
                case 43:
                    i7 = C1299b.m5207q(parcel2, o);
                    break;
                case 44:
                    bundle4 = C1299b.m5191a(parcel2, o);
                    break;
                case 45:
                    str11 = C1299b.m5196f(parcel2, o);
                    break;
                case 46:
                    hzVar = (C1795hz) C1299b.m5195e(parcel2, o, C1795hz.CREATOR);
                    break;
                case 47:
                    z5 = C1299b.m5203m(parcel2, o);
                    break;
                case 48:
                    bundle5 = C1299b.m5191a(parcel2, o);
                    break;
                case 49:
                    str12 = C1299b.m5196f(parcel2, o);
                    break;
                case 50:
                    str13 = C1299b.m5196f(parcel2, o);
                    break;
                case 51:
                    str14 = C1299b.m5196f(parcel2, o);
                    break;
                case 52:
                    z6 = C1299b.m5203m(parcel2, o);
                    break;
                case 53:
                    arrayList4 = C1299b.m5194d(parcel2, o);
                    break;
                case 54:
                    str15 = C1299b.m5196f(parcel2, o);
                    break;
                case 55:
                    arrayList5 = C1299b.m5198h(parcel2, o);
                    break;
                case 56:
                    i8 = C1299b.m5207q(parcel2, o);
                    break;
                case 57:
                    z7 = C1299b.m5203m(parcel2, o);
                    break;
                case 58:
                    z8 = C1299b.m5203m(parcel2, o);
                    break;
                case 59:
                    z9 = C1299b.m5203m(parcel2, o);
                    break;
                case 60:
                    arrayList6 = C1299b.m5198h(parcel2, o);
                    break;
                case 61:
                    str16 = C1299b.m5196f(parcel2, o);
                    break;
                case 63:
                    r90 = (r90) C1299b.m5195e(parcel2, o, r90.CREATOR);
                    break;
                case 64:
                    str17 = C1299b.m5196f(parcel2, o);
                    break;
                case 65:
                    bundle6 = C1299b.m5191a(parcel2, o);
                    break;
                default:
                    C1299b.m5210t(parcel2, o);
                    break;
            }
        }
        C1299b.m5201k(parcel2, u);
        return new hi0(i, bundle, kvVar, pvVar, str, applicationInfo, packageInfo, str2, str3, str4, po0, bundle2, i2, arrayList, bundle3, z, i3, i4, f, str5, j, str6, arrayList2, str7, b40, arrayList3, j2, str8, f2, z2, i5, i6, z3, str9, str10, z4, i7, bundle4, str11, hzVar, z5, bundle5, str12, str13, str14, z6, arrayList4, str15, arrayList5, i8, z7, z8, z9, arrayList6, str16, r90, str17, bundle6);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m11036a(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new hi0[i];
    }
}
