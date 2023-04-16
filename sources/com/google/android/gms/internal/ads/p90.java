package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1298a;
import p013b2.C1301c;

public final class p90 extends C1298a {
    public static final Parcelable.Creator<p90> CREATOR = new q90();

    /* renamed from: f */
    public final String f12552f;

    /* renamed from: g */
    public final Bundle f12553g;

    public p90(String str, Bundle bundle) {
        this.f12552f = str;
        this.f12553g = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5225m(parcel, 1, this.f12552f, false);
        C1301c.m5216d(parcel, 2, this.f12553g, false);
        C1301c.m5214b(parcel, a);
    }
}
