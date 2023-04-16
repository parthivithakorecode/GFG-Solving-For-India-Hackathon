package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p002a1.C0037u;
import p013b2.C1298a;
import p013b2.C1301c;

public final class n00 extends C1298a {
    public static final Parcelable.Creator<n00> CREATOR = new o00();

    /* renamed from: f */
    public final int f11216f;

    /* renamed from: g */
    public final int f11217g;

    public n00(int i, int i2) {
        this.f11216f = i;
        this.f11217g = i2;
    }

    public n00(C0037u uVar) {
        this.f11216f = uVar.mo108b();
        this.f11217g = uVar.mo109c();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, this.f11216f);
        C1301c.m5220h(parcel, 2, this.f11217g);
        C1301c.m5214b(parcel, a);
    }
}
