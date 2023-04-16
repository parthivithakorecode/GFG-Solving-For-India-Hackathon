package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1298a;
import p013b2.C1301c;

public final class m23 extends C1298a {
    public static final Parcelable.Creator<m23> CREATOR = new n23();

    /* renamed from: f */
    public final int f10695f;

    /* renamed from: g */
    public final int f10696g;

    /* renamed from: h */
    public final String f10697h;

    /* renamed from: i */
    public final String f10698i;

    /* renamed from: j */
    public final int f10699j;

    m23(int i, int i2, int i3, String str, String str2) {
        this.f10695f = i;
        this.f10696g = i2;
        this.f10697h = str;
        this.f10698i = str2;
        this.f10699j = i3;
    }

    public m23(int i, int i2, String str, String str2) {
        this(1, 1, i2 - 1, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, this.f10695f);
        C1301c.m5220h(parcel, 2, this.f10696g);
        C1301c.m5225m(parcel, 3, this.f10697h, false);
        C1301c.m5225m(parcel, 4, this.f10698i, false);
        C1301c.m5220h(parcel, 5, this.f10699j);
        C1301c.m5214b(parcel, a);
    }
}
