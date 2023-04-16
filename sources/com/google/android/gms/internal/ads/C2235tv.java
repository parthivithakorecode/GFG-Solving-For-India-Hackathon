package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1298a;
import p013b2.C1301c;

/* renamed from: com.google.android.gms.internal.ads.tv */
public final class C2235tv extends C1298a {
    public static final Parcelable.Creator<C2235tv> CREATOR = new C2272uv();

    /* renamed from: f */
    public final String f15052f;

    /* renamed from: g */
    public long f15053g;

    /* renamed from: h */
    public C1605cv f15054h;

    /* renamed from: i */
    public final Bundle f15055i;

    public C2235tv(String str, long j, C1605cv cvVar, Bundle bundle) {
        this.f15052f = str;
        this.f15053g = j;
        this.f15054h = cvVar;
        this.f15055i = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5225m(parcel, 1, this.f15052f, false);
        C1301c.m5223k(parcel, 2, this.f15053g);
        C1301c.m5224l(parcel, 3, this.f15054h, i, false);
        C1301c.m5216d(parcel, 4, this.f15055i, false);
        C1301c.m5214b(parcel, a);
    }
}
