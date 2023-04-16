package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1298a;
import p013b2.C1301c;

public final class u80 extends C1298a {
    public static final Parcelable.Creator<u80> CREATOR = new v80();

    /* renamed from: f */
    public final boolean f15447f;

    /* renamed from: g */
    public final String f15448g;

    /* renamed from: h */
    public final int f15449h;

    /* renamed from: i */
    public final byte[] f15450i;

    /* renamed from: j */
    public final String[] f15451j;

    /* renamed from: k */
    public final String[] f15452k;

    /* renamed from: l */
    public final boolean f15453l;

    /* renamed from: m */
    public final long f15454m;

    u80(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.f15447f = z;
        this.f15448g = str;
        this.f15449h = i;
        this.f15450i = bArr;
        this.f15451j = strArr;
        this.f15452k = strArr2;
        this.f15453l = z2;
        this.f15454m = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5215c(parcel, 1, this.f15447f);
        C1301c.m5225m(parcel, 2, this.f15448g, false);
        C1301c.m5220h(parcel, 3, this.f15449h);
        C1301c.m5217e(parcel, 4, this.f15450i, false);
        C1301c.m5226n(parcel, 5, this.f15451j, false);
        C1301c.m5226n(parcel, 6, this.f15452k, false);
        C1301c.m5215c(parcel, 7, this.f15453l);
        C1301c.m5223k(parcel, 8, this.f15454m);
        C1301c.m5214b(parcel, a);
    }
}
