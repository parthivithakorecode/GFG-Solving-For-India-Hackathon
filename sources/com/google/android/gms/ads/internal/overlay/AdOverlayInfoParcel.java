package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.C2420yu;
import com.google.android.gms.internal.ads.eu0;
import com.google.android.gms.internal.ads.jb1;
import com.google.android.gms.internal.ads.o42;
import com.google.android.gms.internal.ads.pi1;
import com.google.android.gms.internal.ads.po0;
import com.google.android.gms.internal.ads.s60;
import com.google.android.gms.internal.ads.u60;
import com.google.android.gms.internal.ads.wv1;
import com.google.android.gms.internal.ads.xw2;
import p013b2.C1298a;
import p013b2.C1301c;
import p048g2.C2635a;
import p048g2.C2637b;
import p054h1.C2684j;
import p061i1.C2807f;
import p061i1.C2818q;
import p061i1.C2826y;
import p069j1.C3219x0;

public final class AdOverlayInfoParcel extends C1298a implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new C1470a();
    @RecentlyNonNull

    /* renamed from: A */
    public final String f3710A;
    @RecentlyNonNull

    /* renamed from: B */
    public final String f3711B;

    /* renamed from: C */
    public final jb1 f3712C;

    /* renamed from: D */
    public final pi1 f3713D;

    /* renamed from: f */
    public final C2807f f3714f;

    /* renamed from: g */
    public final C2420yu f3715g;

    /* renamed from: h */
    public final C2818q f3716h;

    /* renamed from: i */
    public final eu0 f3717i;

    /* renamed from: j */
    public final u60 f3718j;
    @RecentlyNonNull

    /* renamed from: k */
    public final String f3719k;

    /* renamed from: l */
    public final boolean f3720l;
    @RecentlyNonNull

    /* renamed from: m */
    public final String f3721m;

    /* renamed from: n */
    public final C2826y f3722n;

    /* renamed from: o */
    public final int f3723o;

    /* renamed from: p */
    public final int f3724p;
    @RecentlyNonNull

    /* renamed from: q */
    public final String f3725q;

    /* renamed from: r */
    public final po0 f3726r;
    @RecentlyNonNull

    /* renamed from: s */
    public final String f3727s;

    /* renamed from: t */
    public final C2684j f3728t;

    /* renamed from: u */
    public final s60 f3729u;
    @RecentlyNonNull

    /* renamed from: v */
    public final String f3730v;

    /* renamed from: w */
    public final o42 f3731w;

    /* renamed from: x */
    public final wv1 f3732x;

    /* renamed from: y */
    public final xw2 f3733y;

    /* renamed from: z */
    public final C3219x0 f3734z;

    public AdOverlayInfoParcel(eu0 eu0, po0 po0, C3219x0 x0Var, o42 o42, wv1 wv1, xw2 xw2, String str, String str2, int i) {
        this.f3714f = null;
        this.f3715g = null;
        this.f3716h = null;
        this.f3717i = eu0;
        this.f3729u = null;
        this.f3718j = null;
        this.f3719k = null;
        this.f3720l = false;
        this.f3721m = null;
        this.f3722n = null;
        this.f3723o = i;
        this.f3724p = 5;
        this.f3725q = null;
        this.f3726r = po0;
        this.f3727s = null;
        this.f3728t = null;
        this.f3730v = str;
        this.f3710A = str2;
        this.f3731w = o42;
        this.f3732x = wv1;
        this.f3733y = xw2;
        this.f3734z = x0Var;
        this.f3711B = null;
        this.f3712C = null;
        this.f3713D = null;
    }

    public AdOverlayInfoParcel(C2420yu yuVar, C2818q qVar, s60 s60, u60 u60, C2826y yVar, eu0 eu0, boolean z, int i, String str, po0 po0, pi1 pi1) {
        this.f3714f = null;
        this.f3715g = yuVar;
        this.f3716h = qVar;
        this.f3717i = eu0;
        this.f3729u = s60;
        this.f3718j = u60;
        this.f3719k = null;
        this.f3720l = z;
        this.f3721m = null;
        this.f3722n = yVar;
        this.f3723o = i;
        this.f3724p = 3;
        this.f3725q = str;
        this.f3726r = po0;
        this.f3727s = null;
        this.f3728t = null;
        this.f3730v = null;
        this.f3710A = null;
        this.f3731w = null;
        this.f3732x = null;
        this.f3733y = null;
        this.f3734z = null;
        this.f3711B = null;
        this.f3712C = null;
        this.f3713D = pi1;
    }

    public AdOverlayInfoParcel(C2420yu yuVar, C2818q qVar, s60 s60, u60 u60, C2826y yVar, eu0 eu0, boolean z, int i, String str, String str2, po0 po0, pi1 pi1) {
        this.f3714f = null;
        this.f3715g = yuVar;
        this.f3716h = qVar;
        this.f3717i = eu0;
        this.f3729u = s60;
        this.f3718j = u60;
        this.f3719k = str2;
        this.f3720l = z;
        this.f3721m = str;
        this.f3722n = yVar;
        this.f3723o = i;
        this.f3724p = 3;
        this.f3725q = null;
        this.f3726r = po0;
        this.f3727s = null;
        this.f3728t = null;
        this.f3730v = null;
        this.f3710A = null;
        this.f3731w = null;
        this.f3732x = null;
        this.f3733y = null;
        this.f3734z = null;
        this.f3711B = null;
        this.f3712C = null;
        this.f3713D = pi1;
    }

    public AdOverlayInfoParcel(C2420yu yuVar, C2818q qVar, C2826y yVar, eu0 eu0, int i, po0 po0, String str, C2684j jVar, String str2, String str3, String str4, jb1 jb1) {
        this.f3714f = null;
        this.f3715g = null;
        this.f3716h = qVar;
        this.f3717i = eu0;
        this.f3729u = null;
        this.f3718j = null;
        this.f3719k = str2;
        this.f3720l = false;
        this.f3721m = str3;
        this.f3722n = null;
        this.f3723o = i;
        this.f3724p = 1;
        this.f3725q = null;
        this.f3726r = po0;
        this.f3727s = str;
        this.f3728t = jVar;
        this.f3730v = null;
        this.f3710A = null;
        this.f3731w = null;
        this.f3732x = null;
        this.f3733y = null;
        this.f3734z = null;
        this.f3711B = str4;
        this.f3712C = jb1;
        this.f3713D = null;
    }

    public AdOverlayInfoParcel(C2420yu yuVar, C2818q qVar, C2826y yVar, eu0 eu0, boolean z, int i, po0 po0, pi1 pi1) {
        this.f3714f = null;
        this.f3715g = yuVar;
        this.f3716h = qVar;
        this.f3717i = eu0;
        this.f3729u = null;
        this.f3718j = null;
        this.f3719k = null;
        this.f3720l = z;
        this.f3721m = null;
        this.f3722n = yVar;
        this.f3723o = i;
        this.f3724p = 2;
        this.f3725q = null;
        this.f3726r = po0;
        this.f3727s = null;
        this.f3728t = null;
        this.f3730v = null;
        this.f3710A = null;
        this.f3731w = null;
        this.f3732x = null;
        this.f3733y = null;
        this.f3734z = null;
        this.f3711B = null;
        this.f3712C = null;
        this.f3713D = pi1;
    }

    AdOverlayInfoParcel(C2807f fVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, po0 po0, String str4, C2684j jVar, IBinder iBinder6, String str5, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, IBinder iBinder10, String str6, String str7, IBinder iBinder11, IBinder iBinder12) {
        this.f3714f = fVar;
        this.f3715g = (C2420yu) C2637b.m21357C0(C2635a.C2636a.m21356n0(iBinder));
        this.f3716h = (C2818q) C2637b.m21357C0(C2635a.C2636a.m21356n0(iBinder2));
        this.f3717i = (eu0) C2637b.m21357C0(C2635a.C2636a.m21356n0(iBinder3));
        this.f3729u = (s60) C2637b.m21357C0(C2635a.C2636a.m21356n0(iBinder6));
        this.f3718j = (u60) C2637b.m21357C0(C2635a.C2636a.m21356n0(iBinder4));
        this.f3719k = str;
        this.f3720l = z;
        this.f3721m = str2;
        this.f3722n = (C2826y) C2637b.m21357C0(C2635a.C2636a.m21356n0(iBinder5));
        this.f3723o = i;
        this.f3724p = i2;
        this.f3725q = str3;
        this.f3726r = po0;
        this.f3727s = str4;
        this.f3728t = jVar;
        this.f3730v = str5;
        this.f3710A = str6;
        this.f3731w = (o42) C2637b.m21357C0(C2635a.C2636a.m21356n0(iBinder7));
        this.f3732x = (wv1) C2637b.m21357C0(C2635a.C2636a.m21356n0(iBinder8));
        this.f3733y = (xw2) C2637b.m21357C0(C2635a.C2636a.m21356n0(iBinder9));
        this.f3734z = (C3219x0) C2637b.m21357C0(C2635a.C2636a.m21356n0(iBinder10));
        this.f3711B = str7;
        this.f3712C = (jb1) C2637b.m21357C0(C2635a.C2636a.m21356n0(iBinder11));
        this.f3713D = (pi1) C2637b.m21357C0(C2635a.C2636a.m21356n0(iBinder12));
    }

    public AdOverlayInfoParcel(C2807f fVar, C2420yu yuVar, C2818q qVar, C2826y yVar, po0 po0, eu0 eu0, pi1 pi1) {
        this.f3714f = fVar;
        this.f3715g = yuVar;
        this.f3716h = qVar;
        this.f3717i = eu0;
        this.f3729u = null;
        this.f3718j = null;
        this.f3719k = null;
        this.f3720l = false;
        this.f3721m = null;
        this.f3722n = yVar;
        this.f3723o = -1;
        this.f3724p = 4;
        this.f3725q = null;
        this.f3726r = po0;
        this.f3727s = null;
        this.f3728t = null;
        this.f3730v = null;
        this.f3710A = null;
        this.f3731w = null;
        this.f3732x = null;
        this.f3733y = null;
        this.f3734z = null;
        this.f3711B = null;
        this.f3712C = null;
        this.f3713D = pi1;
    }

    public AdOverlayInfoParcel(C2818q qVar, eu0 eu0, int i, po0 po0) {
        this.f3716h = qVar;
        this.f3717i = eu0;
        this.f3723o = 1;
        this.f3726r = po0;
        this.f3714f = null;
        this.f3715g = null;
        this.f3729u = null;
        this.f3718j = null;
        this.f3719k = null;
        this.f3720l = false;
        this.f3721m = null;
        this.f3722n = null;
        this.f3724p = 1;
        this.f3725q = null;
        this.f3727s = null;
        this.f3728t = null;
        this.f3730v = null;
        this.f3710A = null;
        this.f3731w = null;
        this.f3732x = null;
        this.f3733y = null;
        this.f3734z = null;
        this.f3711B = null;
        this.f3712C = null;
        this.f3713D = null;
    }

    @RecentlyNonNull
    /* renamed from: c */
    public static AdOverlayInfoParcel m5691c(@RecentlyNonNull Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5224l(parcel, 2, this.f3714f, i, false);
        C1301c.m5219g(parcel, 3, C2637b.m21358Z2(this.f3715g).asBinder(), false);
        C1301c.m5219g(parcel, 4, C2637b.m21358Z2(this.f3716h).asBinder(), false);
        C1301c.m5219g(parcel, 5, C2637b.m21358Z2(this.f3717i).asBinder(), false);
        C1301c.m5219g(parcel, 6, C2637b.m21358Z2(this.f3718j).asBinder(), false);
        C1301c.m5225m(parcel, 7, this.f3719k, false);
        C1301c.m5215c(parcel, 8, this.f3720l);
        C1301c.m5225m(parcel, 9, this.f3721m, false);
        C1301c.m5219g(parcel, 10, C2637b.m21358Z2(this.f3722n).asBinder(), false);
        C1301c.m5220h(parcel, 11, this.f3723o);
        C1301c.m5220h(parcel, 12, this.f3724p);
        C1301c.m5225m(parcel, 13, this.f3725q, false);
        C1301c.m5224l(parcel, 14, this.f3726r, i, false);
        C1301c.m5225m(parcel, 16, this.f3727s, false);
        C1301c.m5224l(parcel, 17, this.f3728t, i, false);
        C1301c.m5219g(parcel, 18, C2637b.m21358Z2(this.f3729u).asBinder(), false);
        C1301c.m5225m(parcel, 19, this.f3730v, false);
        C1301c.m5219g(parcel, 20, C2637b.m21358Z2(this.f3731w).asBinder(), false);
        C1301c.m5219g(parcel, 21, C2637b.m21358Z2(this.f3732x).asBinder(), false);
        C1301c.m5219g(parcel, 22, C2637b.m21358Z2(this.f3733y).asBinder(), false);
        C1301c.m5219g(parcel, 23, C2637b.m21358Z2(this.f3734z).asBinder(), false);
        C1301c.m5225m(parcel, 24, this.f3710A, false);
        C1301c.m5225m(parcel, 25, this.f3711B, false);
        C1301c.m5219g(parcel, 26, C2637b.m21358Z2(this.f3712C).asBinder(), false);
        C1301c.m5219g(parcel, 27, C2637b.m21358Z2(this.f3713D).asBinder(), false);
        C1301c.m5214b(parcel, a);
    }
}
