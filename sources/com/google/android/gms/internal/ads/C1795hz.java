package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1298a;
import p013b2.C1301c;

/* renamed from: com.google.android.gms.internal.ads.hz */
public final class C1795hz extends C1298a {
    public static final Parcelable.Creator<C1795hz> CREATOR = new C1832iz();

    /* renamed from: f */
    public final int f8468f;

    public C1795hz(int i) {
        this.f8468f = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 2, this.f8468f);
        C1301c.m5214b(parcel, a);
    }
}
