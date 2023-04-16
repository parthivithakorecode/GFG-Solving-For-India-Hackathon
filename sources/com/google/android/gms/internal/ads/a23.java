package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1298a;
import p013b2.C1301c;

public final class a23 extends C1298a {
    public static final Parcelable.Creator<a23> CREATOR = new b23();

    /* renamed from: f */
    public final int f3897f;

    /* renamed from: g */
    public final byte[] f3898g;

    a23(int i, byte[] bArr) {
        this.f3897f = i;
        this.f3898g = bArr;
    }

    public a23(byte[] bArr) {
        this(1, bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, this.f3897f);
        C1301c.m5217e(parcel, 2, this.f3898g, false);
        C1301c.m5214b(parcel, a);
    }
}
