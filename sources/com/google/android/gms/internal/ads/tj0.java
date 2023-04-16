package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1298a;
import p013b2.C1301c;

public final class tj0 extends C1298a {
    public static final Parcelable.Creator<tj0> CREATOR = new uj0();

    /* renamed from: f */
    public final C1902kv f14877f;

    /* renamed from: g */
    public final String f14878g;

    public tj0(C1902kv kvVar, String str) {
        this.f14877f = kvVar;
        this.f14878g = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5224l(parcel, 2, this.f14877f, i, false);
        C1301c.m5225m(parcel, 3, this.f14878g, false);
        C1301c.m5214b(parcel, a);
    }
}
