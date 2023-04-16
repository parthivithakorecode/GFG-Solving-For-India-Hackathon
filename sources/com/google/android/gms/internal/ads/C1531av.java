package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1298a;
import p013b2.C1301c;

/* renamed from: com.google.android.gms.internal.ads.av */
public final class C1531av extends C1298a {
    public static final Parcelable.Creator<C1531av> CREATOR = new C1568bv();

    /* renamed from: f */
    public final String f4363f;

    /* renamed from: g */
    public final String f4364g;

    public C1531av(String str, String str2) {
        this.f4363f = str;
        this.f4364g = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5225m(parcel, 1, this.f4363f, false);
        C1301c.m5225m(parcel, 2, this.f4364g, false);
        C1301c.m5214b(parcel, a);
    }
}
