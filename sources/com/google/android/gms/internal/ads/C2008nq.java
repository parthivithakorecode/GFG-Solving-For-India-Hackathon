package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

/* renamed from: com.google.android.gms.internal.ads.nq */
public final class C2008nq implements Parcelable.Creator<C1971mq> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int u = C1299b.m5211u(parcel);
        boolean z = false;
        int i = 0;
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        String str5 = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            switch (C1299b.m5202l(o)) {
                case 2:
                    str = C1299b.m5196f(parcel2, o);
                    break;
                case 3:
                    j = C1299b.m5208r(parcel2, o);
                    break;
                case 4:
                    str2 = C1299b.m5196f(parcel2, o);
                    break;
                case 5:
                    str3 = C1299b.m5196f(parcel2, o);
                    break;
                case 6:
                    str4 = C1299b.m5196f(parcel2, o);
                    break;
                case 7:
                    bundle = C1299b.m5191a(parcel2, o);
                    break;
                case 8:
                    z = C1299b.m5203m(parcel2, o);
                    break;
                case 9:
                    j2 = C1299b.m5208r(parcel2, o);
                    break;
                case 10:
                    str5 = C1299b.m5196f(parcel2, o);
                    break;
                case 11:
                    i = C1299b.m5207q(parcel2, o);
                    break;
                default:
                    C1299b.m5210t(parcel2, o);
                    break;
            }
        }
        C1299b.m5201k(parcel2, u);
        return new C1971mq(str, j, str2, str3, str4, bundle, z, j2, str5, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C1971mq[i];
    }
}
