package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p013b2.C1298a;
import p013b2.C1301c;

/* renamed from: com.google.android.gms.internal.ads.mq */
public final class C1971mq extends C1298a {
    public static final Parcelable.Creator<C1971mq> CREATOR = new C2008nq();

    /* renamed from: f */
    public final String f10993f;

    /* renamed from: g */
    public final long f10994g;

    /* renamed from: h */
    public final String f10995h;

    /* renamed from: i */
    public final String f10996i;

    /* renamed from: j */
    public final String f10997j;

    /* renamed from: k */
    public final Bundle f10998k;

    /* renamed from: l */
    public final boolean f10999l;

    /* renamed from: m */
    public long f11000m;

    /* renamed from: n */
    public String f11001n;

    /* renamed from: o */
    public int f11002o;

    C1971mq(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2, String str5, int i) {
        this.f10993f = str;
        this.f10994g = j;
        this.f10995h = str2 == null ? "" : str2;
        this.f10996i = str3 == null ? "" : str3;
        this.f10997j = str4 == null ? "" : str4;
        this.f10998k = bundle == null ? new Bundle() : bundle;
        this.f10999l = z;
        this.f11000m = j2;
        this.f11001n = str5;
        this.f11002o = i;
    }

    /* renamed from: c */
    public static C1971mq m13448c(Uri uri) {
        Uri uri2 = uri;
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                io0.m11131g(sb.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri2.getQueryParameter("url");
            boolean equals = "1".equals(uri2.getQueryParameter("read_only"));
            String queryParameter2 = uri2.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0 : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String next : uri.getQueryParameterNames()) {
                if (next.startsWith("tag.")) {
                    bundle.putString(next.substring(4), uri2.getQueryParameter(next));
                }
            }
            return new C1971mq(queryParameter, parseLong, host, str, str2, bundle, equals, 0, "", 0);
        } catch (NullPointerException | NumberFormatException e) {
            io0.m11132h("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5225m(parcel, 2, this.f10993f, false);
        C1301c.m5223k(parcel, 3, this.f10994g);
        C1301c.m5225m(parcel, 4, this.f10995h, false);
        C1301c.m5225m(parcel, 5, this.f10996i, false);
        C1301c.m5225m(parcel, 6, this.f10997j, false);
        C1301c.m5216d(parcel, 7, this.f10998k, false);
        C1301c.m5215c(parcel, 8, this.f10999l);
        C1301c.m5223k(parcel, 9, this.f11000m);
        C1301c.m5225m(parcel, 10, this.f11001n, false);
        C1301c.m5220h(parcel, 11, this.f11002o);
        C1301c.m5214b(parcel, a);
    }
}
