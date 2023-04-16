package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1298a;
import p013b2.C1301c;

/* renamed from: com.google.android.gms.internal.ads.vv */
public final class C2309vv extends C1298a {
    public static final Parcelable.Creator<C2309vv> CREATOR = new C2347wv();

    /* renamed from: f */
    public final int f16418f;

    public C2309vv(int i) {
        this.f16418f = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 2, this.f16418f);
        C1301c.m5214b(parcel, a);
    }
}
