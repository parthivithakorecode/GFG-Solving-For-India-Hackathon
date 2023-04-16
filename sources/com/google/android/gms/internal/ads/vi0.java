package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import p013b2.C1298a;
import p013b2.C1301c;

@ParametersAreNonnullByDefault
public final class vi0 extends C1298a {
    public static final Parcelable.Creator<vi0> CREATOR = new wi0();

    /* renamed from: f */
    public final Bundle f16310f;

    /* renamed from: g */
    public final po0 f16311g;

    /* renamed from: h */
    public final ApplicationInfo f16312h;

    /* renamed from: i */
    public final String f16313i;

    /* renamed from: j */
    public final List<String> f16314j;

    /* renamed from: k */
    public final PackageInfo f16315k;

    /* renamed from: l */
    public final String f16316l;

    /* renamed from: m */
    public final String f16317m;

    /* renamed from: n */
    public au2 f16318n;

    /* renamed from: o */
    public String f16319o;

    public vi0(Bundle bundle, po0 po0, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2, String str3, au2 au2, String str4) {
        this.f16310f = bundle;
        this.f16311g = po0;
        this.f16313i = str;
        this.f16312h = applicationInfo;
        this.f16314j = list;
        this.f16315k = packageInfo;
        this.f16316l = str2;
        this.f16317m = str3;
        this.f16318n = au2;
        this.f16319o = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5216d(parcel, 1, this.f16310f, false);
        C1301c.m5224l(parcel, 2, this.f16311g, i, false);
        C1301c.m5224l(parcel, 3, this.f16312h, i, false);
        C1301c.m5225m(parcel, 4, this.f16313i, false);
        C1301c.m5227o(parcel, 5, this.f16314j, false);
        C1301c.m5224l(parcel, 6, this.f16315k, i, false);
        C1301c.m5225m(parcel, 7, this.f16316l, false);
        C1301c.m5225m(parcel, 9, this.f16317m, false);
        C1301c.m5224l(parcel, 10, this.f16318n, i, false);
        C1301c.m5225m(parcel, 11, this.f16319o, false);
        C1301c.m5214b(parcel, a);
    }
}
