package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.po0;
import p013b2.C1299b;
import p038f.C2591j;
import p054h1.C2684j;
import p061i1.C2807f;

/* renamed from: com.google.android.gms.ads.internal.overlay.a */
public final class C1470a implements Parcelable.Creator<AdOverlayInfoParcel> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int u = C1299b.m5211u(parcel);
        boolean z = false;
        int i = 0;
        int i2 = 0;
        C2807f fVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        po0 po0 = null;
        String str4 = null;
        C2684j jVar = null;
        IBinder iBinder6 = null;
        String str5 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        IBinder iBinder9 = null;
        IBinder iBinder10 = null;
        String str6 = null;
        String str7 = null;
        IBinder iBinder11 = null;
        IBinder iBinder12 = null;
        while (parcel.dataPosition() < u) {
            int o = C1299b.m5205o(parcel);
            switch (C1299b.m5202l(o)) {
                case 2:
                    fVar = (C2807f) C1299b.m5195e(parcel2, o, C2807f.CREATOR);
                    break;
                case 3:
                    iBinder = C1299b.m5206p(parcel2, o);
                    break;
                case 4:
                    iBinder2 = C1299b.m5206p(parcel2, o);
                    break;
                case 5:
                    iBinder3 = C1299b.m5206p(parcel2, o);
                    break;
                case 6:
                    iBinder4 = C1299b.m5206p(parcel2, o);
                    break;
                case 7:
                    str = C1299b.m5196f(parcel2, o);
                    break;
                case 8:
                    z = C1299b.m5203m(parcel2, o);
                    break;
                case 9:
                    str2 = C1299b.m5196f(parcel2, o);
                    break;
                case 10:
                    iBinder5 = C1299b.m5206p(parcel2, o);
                    break;
                case 11:
                    i = C1299b.m5207q(parcel2, o);
                    break;
                case 12:
                    i2 = C1299b.m5207q(parcel2, o);
                    break;
                case 13:
                    str3 = C1299b.m5196f(parcel2, o);
                    break;
                case 14:
                    po0 = (po0) C1299b.m5195e(parcel2, o, po0.CREATOR);
                    break;
                case 16:
                    str4 = C1299b.m5196f(parcel2, o);
                    break;
                case 17:
                    jVar = (C2684j) C1299b.m5195e(parcel2, o, C2684j.CREATOR);
                    break;
                case 18:
                    iBinder6 = C1299b.m5206p(parcel2, o);
                    break;
                case 19:
                    str5 = C1299b.m5196f(parcel2, o);
                    break;
                case 20:
                    iBinder7 = C1299b.m5206p(parcel2, o);
                    break;
                case 21:
                    iBinder8 = C1299b.m5206p(parcel2, o);
                    break;
                case 22:
                    iBinder9 = C1299b.m5206p(parcel2, o);
                    break;
                case C2591j.f18882o3 /*23*/:
                    iBinder10 = C1299b.m5206p(parcel2, o);
                    break;
                case C2591j.f18887p3 /*24*/:
                    str6 = C1299b.m5196f(parcel2, o);
                    break;
                case 25:
                    str7 = C1299b.m5196f(parcel2, o);
                    break;
                case 26:
                    iBinder11 = C1299b.m5206p(parcel2, o);
                    break;
                case 27:
                    iBinder12 = C1299b.m5206p(parcel2, o);
                    break;
                default:
                    C1299b.m5210t(parcel2, o);
                    break;
            }
        }
        C1299b.m5201k(parcel2, u);
        return new AdOverlayInfoParcel(fVar, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i, i2, str3, po0, str4, jVar, iBinder6, str5, iBinder7, iBinder8, iBinder9, iBinder10, str6, str7, iBinder11, iBinder12);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
