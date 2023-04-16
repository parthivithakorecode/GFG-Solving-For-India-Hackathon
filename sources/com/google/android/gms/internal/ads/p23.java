package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p013b2.C1298a;
import p013b2.C1301c;

public final class p23 extends C1298a {
    public static final Parcelable.Creator<p23> CREATOR = new q23();

    /* renamed from: f */
    public final int f12462f;

    /* renamed from: g */
    public final byte[] f12463g;

    /* renamed from: h */
    public final int f12464h;

    p23(int i, byte[] bArr, int i2) {
        this.f12462f = i;
        this.f12463g = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f12464h = i2;
    }

    public p23(byte[] bArr, int i) {
        this(1, (byte[]) null, 1);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, this.f12462f);
        C1301c.m5217e(parcel, 2, this.f12463g, false);
        C1301c.m5220h(parcel, 3, this.f12464h);
        C1301c.m5214b(parcel, a);
    }
}
