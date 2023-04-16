package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p013b2.C1299b;

public final class wi0 implements Parcelable.Creator<vi0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = C1299b.m5211u(parcel);
        Bundle bundle = null;
        po0 po0 = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList<String> arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        au2 au2 = null;
        String str4 = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            switch (C1299b.m5202l(o)) {
                case 1:
                    bundle = C1299b.m5191a(parcel, o);
                    break;
                case 2:
                    po0 = (po0) C1299b.m5195e(parcel, o, po0.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) C1299b.m5195e(parcel, o, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = C1299b.m5196f(parcel, o);
                    break;
                case 5:
                    arrayList = C1299b.m5198h(parcel, o);
                    break;
                case 6:
                    packageInfo = (PackageInfo) C1299b.m5195e(parcel, o, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = C1299b.m5196f(parcel, o);
                    break;
                case 9:
                    str3 = C1299b.m5196f(parcel, o);
                    break;
                case 10:
                    au2 = (au2) C1299b.m5195e(parcel, o, au2.CREATOR);
                    break;
                case 11:
                    str4 = C1299b.m5196f(parcel, o);
                    break;
                default:
                    C1299b.m5210t(parcel, o);
                    break;
            }
        }
        C1299b.m5201k(parcel, u);
        return new vi0(bundle, po0, applicationInfo, str, arrayList, packageInfo, str2, str3, au2, str4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new vi0[i];
    }
}
