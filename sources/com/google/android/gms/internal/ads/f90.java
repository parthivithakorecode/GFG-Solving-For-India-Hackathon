package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1298a;
import p013b2.C1301c;

public final class f90 extends C1298a {
    public static final Parcelable.Creator<f90> CREATOR = new g90();

    /* renamed from: f */
    public final String f6758f;

    /* renamed from: g */
    public final boolean f6759g;

    /* renamed from: h */
    public final int f6760h;

    /* renamed from: i */
    public final String f6761i;

    public f90(String str, boolean z, int i, String str2) {
        this.f6758f = str;
        this.f6759g = z;
        this.f6760h = i;
        this.f6761i = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5225m(parcel, 1, this.f6758f, false);
        C1301c.m5215c(parcel, 2, this.f6759g);
        C1301c.m5220h(parcel, 3, this.f6760h);
        C1301c.m5225m(parcel, 4, this.f6761i, false);
        C1301c.m5214b(parcel, a);
    }
}
