package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1298a;
import p013b2.C1301c;

public final class s80 extends C1298a {
    public static final Parcelable.Creator<s80> CREATOR = new t80();

    /* renamed from: f */
    public final String f14318f;

    /* renamed from: g */
    public final String[] f14319g;

    /* renamed from: h */
    public final String[] f14320h;

    s80(String str, String[] strArr, String[] strArr2) {
        this.f14318f = str;
        this.f14319g = strArr;
        this.f14320h = strArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5225m(parcel, 1, this.f14318f, false);
        C1301c.m5226n(parcel, 2, this.f14319g, false);
        C1301c.m5226n(parcel, 3, this.f14320h, false);
        C1301c.m5214b(parcel, a);
    }
}
