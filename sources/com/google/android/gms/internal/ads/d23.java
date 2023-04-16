package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1298a;
import p013b2.C1301c;

public final class d23 extends C1298a {
    public static final Parcelable.Creator<d23> CREATOR = new e23();

    /* renamed from: f */
    public final int f5627f;

    /* renamed from: g */
    public final String f5628g;

    /* renamed from: h */
    public final String f5629h;

    d23(int i, String str, String str2) {
        this.f5627f = i;
        this.f5628g = str;
        this.f5629h = str2;
    }

    public d23(String str, String str2) {
        this(1, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, this.f5627f);
        C1301c.m5225m(parcel, 2, this.f5628g, false);
        C1301c.m5225m(parcel, 3, this.f5629h, false);
        C1301c.m5214b(parcel, a);
    }
}
