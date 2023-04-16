package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1299b;

public final class v80 implements Parcelable.Creator<u80> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int u = C1299b.m5211u(parcel);
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j = 0;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            switch (C1299b.m5202l(o)) {
                case 1:
                    z = C1299b.m5203m(parcel2, o);
                    break;
                case 2:
                    str = C1299b.m5196f(parcel2, o);
                    break;
                case 3:
                    i = C1299b.m5207q(parcel2, o);
                    break;
                case 4:
                    bArr = C1299b.m5192b(parcel2, o);
                    break;
                case 5:
                    strArr = C1299b.m5197g(parcel2, o);
                    break;
                case 6:
                    strArr2 = C1299b.m5197g(parcel2, o);
                    break;
                case 7:
                    z2 = C1299b.m5203m(parcel2, o);
                    break;
                case 8:
                    j = C1299b.m5208r(parcel2, o);
                    break;
                default:
                    C1299b.m5210t(parcel2, o);
                    break;
            }
        }
        C1299b.m5201k(parcel2, u);
        return new u80(z, str, i, bArr, strArr, strArr2, z2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new u80[i];
    }
}
