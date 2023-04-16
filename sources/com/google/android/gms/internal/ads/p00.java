package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1298a;
import p013b2.C1301c;

public final class p00 extends C1298a {
    public static final Parcelable.Creator<p00> CREATOR = new q00();

    /* renamed from: f */
    public final String f12392f;

    p00(String str) {
        this.f12392f = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5225m(parcel, 15, this.f12392f, false);
        C1301c.m5214b(parcel, a);
    }
}
