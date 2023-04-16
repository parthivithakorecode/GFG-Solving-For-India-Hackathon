package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import p013b2.C1298a;
import p013b2.C1301c;

@ParametersAreNonnullByDefault
public final class au2 extends C1298a {
    public static final Parcelable.Creator<au2> CREATOR = new bu2();

    /* renamed from: f */
    private final xt2[] f4350f;
    @Nullable

    /* renamed from: g */
    public final Context f4351g;

    /* renamed from: h */
    private final int f4352h;

    /* renamed from: i */
    public final xt2 f4353i;

    /* renamed from: j */
    public final int f4354j;

    /* renamed from: k */
    public final int f4355k;

    /* renamed from: l */
    public final int f4356l;

    /* renamed from: m */
    public final String f4357m;

    /* renamed from: n */
    private final int f4358n;

    /* renamed from: o */
    private final int f4359o;

    /* renamed from: p */
    private final int[] f4360p;

    /* renamed from: q */
    private final int[] f4361q;

    /* renamed from: r */
    public final int f4362r;

    public au2(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        xt2[] values = xt2.values();
        this.f4350f = values;
        int[] a = yt2.m20206a();
        this.f4360p = a;
        int[] a2 = zt2.m20836a();
        this.f4361q = a2;
        this.f4351g = null;
        this.f4352h = i;
        this.f4353i = values[i];
        this.f4354j = i2;
        this.f4355k = i3;
        this.f4356l = i4;
        this.f4357m = str;
        this.f4358n = i5;
        this.f4362r = a[i5];
        this.f4359o = i6;
        int i7 = a2[i6];
    }

    private au2(@Nullable Context context, xt2 xt2, int i, int i2, int i3, String str, String str2, String str3) {
        this.f4350f = xt2.values();
        this.f4360p = yt2.m20206a();
        this.f4361q = zt2.m20836a();
        this.f4351g = context;
        this.f4352h = xt2.ordinal();
        this.f4353i = xt2;
        this.f4354j = i;
        this.f4355k = i2;
        this.f4356l = i3;
        this.f4357m = str;
        int i4 = 2;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i4 = 3;
        }
        this.f4362r = i4;
        this.f4358n = i4 - 1;
        "onAdClosed".equals(str3);
        this.f4359o = 0;
    }

    /* renamed from: c */
    public static au2 m6357c(xt2 xt2, Context context) {
        if (xt2 == xt2.Rewarded) {
            return new au2(context, xt2, ((Integer) C2199sw.m17001c().mo8579b(m10.f10350O4)).intValue(), ((Integer) C2199sw.m17001c().mo8579b(m10.f10398U4)).intValue(), ((Integer) C2199sw.m17001c().mo8579b(m10.f10414W4)).intValue(), (String) C2199sw.m17001c().mo8579b(m10.f10430Y4), (String) C2199sw.m17001c().mo8579b(m10.f10366Q4), (String) C2199sw.m17001c().mo8579b(m10.f10382S4));
        } else if (xt2 == xt2.Interstitial) {
            return new au2(context, xt2, ((Integer) C2199sw.m17001c().mo8579b(m10.f10358P4)).intValue(), ((Integer) C2199sw.m17001c().mo8579b(m10.f10406V4)).intValue(), ((Integer) C2199sw.m17001c().mo8579b(m10.f10422X4)).intValue(), (String) C2199sw.m17001c().mo8579b(m10.f10438Z4), (String) C2199sw.m17001c().mo8579b(m10.f10374R4), (String) C2199sw.m17001c().mo8579b(m10.f10390T4));
        } else if (xt2 != xt2.AppOpen) {
            return null;
        } else {
            return new au2(context, xt2, ((Integer) C2199sw.m17001c().mo8579b(m10.f10465c5)).intValue(), ((Integer) C2199sw.m17001c().mo8579b(m10.f10483e5)).intValue(), ((Integer) C2199sw.m17001c().mo8579b(m10.f10492f5)).intValue(), (String) C2199sw.m17001c().mo8579b(m10.f10447a5), (String) C2199sw.m17001c().mo8579b(m10.f10456b5), (String) C2199sw.m17001c().mo8579b(m10.f10474d5));
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, this.f4352h);
        C1301c.m5220h(parcel, 2, this.f4354j);
        C1301c.m5220h(parcel, 3, this.f4355k);
        C1301c.m5220h(parcel, 4, this.f4356l);
        C1301c.m5225m(parcel, 5, this.f4357m, false);
        C1301c.m5220h(parcel, 6, this.f4358n);
        C1301c.m5220h(parcel, 7, this.f4359o);
        C1301c.m5214b(parcel, a);
    }
}
