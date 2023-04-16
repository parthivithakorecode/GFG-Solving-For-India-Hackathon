package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p002a1.C0042x;
import p013b2.C1298a;
import p013b2.C1301c;

public final class s00 extends C1298a {
    public static final Parcelable.Creator<s00> CREATOR = new t00();

    /* renamed from: f */
    public final boolean f14191f;

    /* renamed from: g */
    public final boolean f14192g;

    /* renamed from: h */
    public final boolean f14193h;

    public s00(C0042x xVar) {
        this(xVar.mo132c(), xVar.mo131b(), xVar.mo130a());
    }

    public s00(boolean z, boolean z2, boolean z3) {
        this.f14191f = z;
        this.f14192g = z2;
        this.f14193h = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5215c(parcel, 2, this.f14191f);
        C1301c.m5215c(parcel, 3, this.f14192g);
        C1301c.m5215c(parcel, 4, this.f14193h);
        C1301c.m5214b(parcel, a);
    }
}
