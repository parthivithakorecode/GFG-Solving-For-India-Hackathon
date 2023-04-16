package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p003a2.C0089n;
import p013b2.C1298a;
import p013b2.C1301c;

/* renamed from: com.google.android.gms.internal.ads.kv */
public final class C1902kv extends C1298a {
    public static final Parcelable.Creator<C1902kv> CREATOR = new C1976mv();

    /* renamed from: A */
    public final List<String> f9664A;

    /* renamed from: B */
    public final int f9665B;

    /* renamed from: C */
    public final String f9666C;

    /* renamed from: f */
    public final int f9667f;
    @Deprecated

    /* renamed from: g */
    public final long f9668g;

    /* renamed from: h */
    public final Bundle f9669h;
    @Deprecated

    /* renamed from: i */
    public final int f9670i;

    /* renamed from: j */
    public final List<String> f9671j;

    /* renamed from: k */
    public final boolean f9672k;

    /* renamed from: l */
    public final int f9673l;

    /* renamed from: m */
    public final boolean f9674m;

    /* renamed from: n */
    public final String f9675n;

    /* renamed from: o */
    public final p00 f9676o;

    /* renamed from: p */
    public final Location f9677p;

    /* renamed from: q */
    public final String f9678q;

    /* renamed from: r */
    public final Bundle f9679r;

    /* renamed from: s */
    public final Bundle f9680s;

    /* renamed from: t */
    public final List<String> f9681t;

    /* renamed from: u */
    public final String f9682u;

    /* renamed from: v */
    public final String f9683v;
    @Deprecated

    /* renamed from: w */
    public final boolean f9684w;

    /* renamed from: x */
    public final C1531av f9685x;

    /* renamed from: y */
    public final int f9686y;

    /* renamed from: z */
    public final String f9687z;

    public C1902kv(int i, long j, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, p00 p00, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3, C1531av avVar, int i4, String str5, List<String> list3, int i5, String str6) {
        this.f9667f = i;
        this.f9668g = j;
        this.f9669h = bundle == null ? new Bundle() : bundle;
        this.f9670i = i2;
        this.f9671j = list;
        this.f9672k = z;
        this.f9673l = i3;
        this.f9674m = z2;
        this.f9675n = str;
        this.f9676o = p00;
        this.f9677p = location;
        this.f9678q = str2;
        this.f9679r = bundle2 == null ? new Bundle() : bundle2;
        this.f9680s = bundle3;
        this.f9681t = list2;
        this.f9682u = str3;
        this.f9683v = str4;
        this.f9684w = z3;
        this.f9685x = avVar;
        this.f9686y = i4;
        this.f9687z = str5;
        this.f9664A = list3 == null ? new ArrayList<>() : list3;
        this.f9665B = i5;
        this.f9666C = str6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1902kv)) {
            return false;
        }
        C1902kv kvVar = (C1902kv) obj;
        return this.f9667f == kvVar.f9667f && this.f9668g == kvVar.f9668g && ko0.m12274a(this.f9669h, kvVar.f9669h) && this.f9670i == kvVar.f9670i && C0089n.m301a(this.f9671j, kvVar.f9671j) && this.f9672k == kvVar.f9672k && this.f9673l == kvVar.f9673l && this.f9674m == kvVar.f9674m && C0089n.m301a(this.f9675n, kvVar.f9675n) && C0089n.m301a(this.f9676o, kvVar.f9676o) && C0089n.m301a(this.f9677p, kvVar.f9677p) && C0089n.m301a(this.f9678q, kvVar.f9678q) && ko0.m12274a(this.f9679r, kvVar.f9679r) && ko0.m12274a(this.f9680s, kvVar.f9680s) && C0089n.m301a(this.f9681t, kvVar.f9681t) && C0089n.m301a(this.f9682u, kvVar.f9682u) && C0089n.m301a(this.f9683v, kvVar.f9683v) && this.f9684w == kvVar.f9684w && this.f9686y == kvVar.f9686y && C0089n.m301a(this.f9687z, kvVar.f9687z) && C0089n.m301a(this.f9664A, kvVar.f9664A) && this.f9665B == kvVar.f9665B && C0089n.m301a(this.f9666C, kvVar.f9666C);
    }

    public final int hashCode() {
        return C0089n.m302b(Integer.valueOf(this.f9667f), Long.valueOf(this.f9668g), this.f9669h, Integer.valueOf(this.f9670i), this.f9671j, Boolean.valueOf(this.f9672k), Integer.valueOf(this.f9673l), Boolean.valueOf(this.f9674m), this.f9675n, this.f9676o, this.f9677p, this.f9678q, this.f9679r, this.f9680s, this.f9681t, this.f9682u, this.f9683v, Boolean.valueOf(this.f9684w), Integer.valueOf(this.f9686y), this.f9687z, this.f9664A, Integer.valueOf(this.f9665B), this.f9666C);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, this.f9667f);
        C1301c.m5223k(parcel, 2, this.f9668g);
        C1301c.m5216d(parcel, 3, this.f9669h, false);
        C1301c.m5220h(parcel, 4, this.f9670i);
        C1301c.m5227o(parcel, 5, this.f9671j, false);
        C1301c.m5215c(parcel, 6, this.f9672k);
        C1301c.m5220h(parcel, 7, this.f9673l);
        C1301c.m5215c(parcel, 8, this.f9674m);
        C1301c.m5225m(parcel, 9, this.f9675n, false);
        C1301c.m5224l(parcel, 10, this.f9676o, i, false);
        C1301c.m5224l(parcel, 11, this.f9677p, i, false);
        C1301c.m5225m(parcel, 12, this.f9678q, false);
        C1301c.m5216d(parcel, 13, this.f9679r, false);
        C1301c.m5216d(parcel, 14, this.f9680s, false);
        C1301c.m5227o(parcel, 15, this.f9681t, false);
        C1301c.m5225m(parcel, 16, this.f9682u, false);
        C1301c.m5225m(parcel, 17, this.f9683v, false);
        C1301c.m5215c(parcel, 18, this.f9684w);
        C1301c.m5224l(parcel, 19, this.f9685x, i, false);
        C1301c.m5220h(parcel, 20, this.f9686y);
        C1301c.m5225m(parcel, 21, this.f9687z, false);
        C1301c.m5227o(parcel, 22, this.f9664A, false);
        C1301c.m5220h(parcel, 23, this.f9665B);
        C1301c.m5225m(parcel, 24, this.f9666C, false);
        C1301c.m5214b(parcel, a);
    }
}
