package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import javax.annotation.ParametersAreNonnullByDefault;
import p013b2.C1298a;
import p013b2.C1301c;

@ParametersAreNonnullByDefault
public final class r90 extends C1298a {
    public static final Parcelable.Creator<r90> CREATOR = new t90();

    /* renamed from: f */
    public final int f13552f;

    /* renamed from: g */
    public final int f13553g;

    /* renamed from: h */
    public final String f13554h;

    /* renamed from: i */
    public final int f13555i;

    public r90(int i, int i2, String str, int i3) {
        this.f13552f = i;
        this.f13553g = i2;
        this.f13554h = str;
        this.f13555i = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, this.f13553g);
        C1301c.m5225m(parcel, 2, this.f13554h, false);
        C1301c.m5220h(parcel, 3, this.f13555i);
        C1301c.m5220h(parcel, 1000, this.f13552f);
        C1301c.m5214b(parcel, a);
    }
}
