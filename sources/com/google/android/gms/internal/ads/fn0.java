package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import javax.annotation.ParametersAreNonnullByDefault;
import p013b2.C1298a;
import p013b2.C1301c;

@ParametersAreNonnullByDefault
public final class fn0 extends C1298a {
    public static final Parcelable.Creator<fn0> CREATOR = new gn0();
    @Deprecated

    /* renamed from: f */
    public final String f6872f;

    /* renamed from: g */
    public final String f6873g;
    @Deprecated

    /* renamed from: h */
    public final C2087pv f6874h;

    /* renamed from: i */
    public final C1902kv f6875i;

    public fn0(String str, String str2, C2087pv pvVar, C1902kv kvVar) {
        this.f6872f = str;
        this.f6873g = str2;
        this.f6874h = pvVar;
        this.f6875i = kvVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5225m(parcel, 1, this.f6872f, false);
        C1301c.m5225m(parcel, 2, this.f6873g, false);
        C1301c.m5224l(parcel, 3, this.f6874h, i, false);
        C1301c.m5224l(parcel, 4, this.f6875i, i, false);
        C1301c.m5214b(parcel, a);
    }
}
