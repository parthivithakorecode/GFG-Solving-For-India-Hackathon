package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import p013b2.C1298a;
import p013b2.C1301c;

@ParametersAreNonnullByDefault
public final class hi0 extends C1298a {
    public static final Parcelable.Creator<hi0> CREATOR = new ii0();

    /* renamed from: A */
    public final String f8257A;

    /* renamed from: B */
    public final List<String> f8258B;

    /* renamed from: C */
    public final String f8259C;

    /* renamed from: D */
    public final b40 f8260D;

    /* renamed from: E */
    public final List<String> f8261E;

    /* renamed from: F */
    public final long f8262F;

    /* renamed from: G */
    public final String f8263G;

    /* renamed from: H */
    public final float f8264H;

    /* renamed from: I */
    public final int f8265I;

    /* renamed from: J */
    public final int f8266J;

    /* renamed from: K */
    public final boolean f8267K;

    /* renamed from: L */
    public final String f8268L;

    /* renamed from: M */
    public final boolean f8269M;

    /* renamed from: N */
    public final String f8270N;

    /* renamed from: O */
    public final boolean f8271O;

    /* renamed from: P */
    public final int f8272P;

    /* renamed from: Q */
    public final Bundle f8273Q;

    /* renamed from: R */
    public final String f8274R;

    /* renamed from: S */
    public final C1795hz f8275S;

    /* renamed from: T */
    public final boolean f8276T;

    /* renamed from: U */
    public final Bundle f8277U;

    /* renamed from: V */
    public final String f8278V;

    /* renamed from: W */
    public final String f8279W;

    /* renamed from: X */
    public final String f8280X;

    /* renamed from: Y */
    public final boolean f8281Y;

    /* renamed from: Z */
    public final List<Integer> f8282Z;

    /* renamed from: a0 */
    public final String f8283a0;

    /* renamed from: b0 */
    public final List<String> f8284b0;

    /* renamed from: c0 */
    public final int f8285c0;

    /* renamed from: d0 */
    public final boolean f8286d0;

    /* renamed from: e0 */
    public final boolean f8287e0;

    /* renamed from: f */
    public final int f8288f;

    /* renamed from: f0 */
    public final boolean f8289f0;

    /* renamed from: g */
    public final Bundle f8290g;

    /* renamed from: g0 */
    public final ArrayList<String> f8291g0;

    /* renamed from: h */
    public final C1902kv f8292h;

    /* renamed from: h0 */
    public final String f8293h0;

    /* renamed from: i */
    public final C2087pv f8294i;

    /* renamed from: i0 */
    public final r90 f8295i0;

    /* renamed from: j */
    public final String f8296j;

    /* renamed from: j0 */
    public final String f8297j0;

    /* renamed from: k */
    public final ApplicationInfo f8298k;

    /* renamed from: k0 */
    public final Bundle f8299k0;

    /* renamed from: l */
    public final PackageInfo f8300l;

    /* renamed from: m */
    public final String f8301m;

    /* renamed from: n */
    public final String f8302n;

    /* renamed from: o */
    public final String f8303o;

    /* renamed from: p */
    public final po0 f8304p;

    /* renamed from: q */
    public final Bundle f8305q;

    /* renamed from: r */
    public final int f8306r;

    /* renamed from: s */
    public final List<String> f8307s;

    /* renamed from: t */
    public final Bundle f8308t;

    /* renamed from: u */
    public final boolean f8309u;

    /* renamed from: v */
    public final int f8310v;

    /* renamed from: w */
    public final int f8311w;

    /* renamed from: x */
    public final float f8312x;

    /* renamed from: y */
    public final String f8313y;

    /* renamed from: z */
    public final long f8314z;

    hi0(int i, Bundle bundle, C1902kv kvVar, C2087pv pvVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, po0 po0, Bundle bundle2, int i2, List<String> list, Bundle bundle3, boolean z, int i3, int i4, float f, String str5, long j, String str6, List<String> list2, String str7, b40 b40, List<String> list3, long j2, String str8, float f2, boolean z2, int i5, int i6, boolean z3, String str9, String str10, boolean z4, int i7, Bundle bundle4, String str11, C1795hz hzVar, boolean z5, Bundle bundle5, String str12, String str13, String str14, boolean z6, List<Integer> list4, String str15, List<String> list5, int i8, boolean z7, boolean z8, boolean z9, ArrayList<String> arrayList, String str16, r90 r90, String str17, Bundle bundle6) {
        this.f8288f = i;
        this.f8290g = bundle;
        this.f8292h = kvVar;
        this.f8294i = pvVar;
        this.f8296j = str;
        this.f8298k = applicationInfo;
        this.f8300l = packageInfo;
        this.f8301m = str2;
        this.f8302n = str3;
        this.f8303o = str4;
        this.f8304p = po0;
        this.f8305q = bundle2;
        this.f8306r = i2;
        this.f8307s = list;
        this.f8261E = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.f8308t = bundle3;
        this.f8309u = z;
        this.f8310v = i3;
        this.f8311w = i4;
        this.f8312x = f;
        this.f8313y = str5;
        this.f8314z = j;
        this.f8257A = str6;
        this.f8258B = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f8259C = str7;
        this.f8260D = b40;
        this.f8262F = j2;
        this.f8263G = str8;
        this.f8264H = f2;
        this.f8269M = z2;
        this.f8265I = i5;
        this.f8266J = i6;
        this.f8267K = z3;
        this.f8268L = str9;
        this.f8270N = str10;
        this.f8271O = z4;
        this.f8272P = i7;
        this.f8273Q = bundle4;
        this.f8274R = str11;
        this.f8275S = hzVar;
        this.f8276T = z5;
        this.f8277U = bundle5;
        this.f8278V = str12;
        this.f8279W = str13;
        this.f8280X = str14;
        this.f8281Y = z6;
        this.f8282Z = list4;
        this.f8283a0 = str15;
        this.f8284b0 = list5;
        this.f8285c0 = i8;
        this.f8286d0 = z7;
        this.f8287e0 = z8;
        this.f8289f0 = z9;
        this.f8291g0 = arrayList;
        this.f8293h0 = str16;
        this.f8295i0 = r90;
        this.f8297j0 = str17;
        this.f8299k0 = bundle6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, this.f8288f);
        C1301c.m5216d(parcel, 2, this.f8290g, false);
        C1301c.m5224l(parcel, 3, this.f8292h, i, false);
        C1301c.m5224l(parcel, 4, this.f8294i, i, false);
        C1301c.m5225m(parcel, 5, this.f8296j, false);
        C1301c.m5224l(parcel, 6, this.f8298k, i, false);
        C1301c.m5224l(parcel, 7, this.f8300l, i, false);
        C1301c.m5225m(parcel, 8, this.f8301m, false);
        C1301c.m5225m(parcel, 9, this.f8302n, false);
        C1301c.m5225m(parcel, 10, this.f8303o, false);
        C1301c.m5224l(parcel, 11, this.f8304p, i, false);
        C1301c.m5216d(parcel, 12, this.f8305q, false);
        C1301c.m5220h(parcel, 13, this.f8306r);
        C1301c.m5227o(parcel, 14, this.f8307s, false);
        C1301c.m5216d(parcel, 15, this.f8308t, false);
        C1301c.m5215c(parcel, 16, this.f8309u);
        C1301c.m5220h(parcel, 18, this.f8310v);
        C1301c.m5220h(parcel, 19, this.f8311w);
        C1301c.m5218f(parcel, 20, this.f8312x);
        C1301c.m5225m(parcel, 21, this.f8313y, false);
        C1301c.m5223k(parcel, 25, this.f8314z);
        C1301c.m5225m(parcel, 26, this.f8257A, false);
        C1301c.m5227o(parcel, 27, this.f8258B, false);
        C1301c.m5225m(parcel, 28, this.f8259C, false);
        C1301c.m5224l(parcel, 29, this.f8260D, i, false);
        C1301c.m5227o(parcel, 30, this.f8261E, false);
        C1301c.m5223k(parcel, 31, this.f8262F);
        C1301c.m5225m(parcel, 33, this.f8263G, false);
        C1301c.m5218f(parcel, 34, this.f8264H);
        C1301c.m5220h(parcel, 35, this.f8265I);
        C1301c.m5220h(parcel, 36, this.f8266J);
        C1301c.m5215c(parcel, 37, this.f8267K);
        C1301c.m5225m(parcel, 39, this.f8268L, false);
        C1301c.m5215c(parcel, 40, this.f8269M);
        C1301c.m5225m(parcel, 41, this.f8270N, false);
        C1301c.m5215c(parcel, 42, this.f8271O);
        C1301c.m5220h(parcel, 43, this.f8272P);
        C1301c.m5216d(parcel, 44, this.f8273Q, false);
        C1301c.m5225m(parcel, 45, this.f8274R, false);
        C1301c.m5224l(parcel, 46, this.f8275S, i, false);
        C1301c.m5215c(parcel, 47, this.f8276T);
        C1301c.m5216d(parcel, 48, this.f8277U, false);
        C1301c.m5225m(parcel, 49, this.f8278V, false);
        C1301c.m5225m(parcel, 50, this.f8279W, false);
        C1301c.m5225m(parcel, 51, this.f8280X, false);
        C1301c.m5215c(parcel, 52, this.f8281Y);
        C1301c.m5222j(parcel, 53, this.f8282Z, false);
        C1301c.m5225m(parcel, 54, this.f8283a0, false);
        C1301c.m5227o(parcel, 55, this.f8284b0, false);
        C1301c.m5220h(parcel, 56, this.f8285c0);
        C1301c.m5215c(parcel, 57, this.f8286d0);
        C1301c.m5215c(parcel, 58, this.f8287e0);
        C1301c.m5215c(parcel, 59, this.f8289f0);
        C1301c.m5227o(parcel, 60, this.f8291g0, false);
        C1301c.m5225m(parcel, 61, this.f8293h0, false);
        C1301c.m5224l(parcel, 63, this.f8295i0, i, false);
        C1301c.m5225m(parcel, 64, this.f8297j0, false);
        C1301c.m5216d(parcel, 65, this.f8299k0, false);
        C1301c.m5214b(parcel, a);
    }
}
