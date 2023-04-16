package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class li1 {

    /* renamed from: a */
    public final Uri f10058a;

    /* renamed from: b */
    public final int f10059b;

    /* renamed from: c */
    public final byte[] f10060c;

    /* renamed from: d */
    public final Map<String, String> f10061d;
    @Deprecated

    /* renamed from: e */
    public final long f10062e;

    /* renamed from: f */
    public final long f10063f;

    /* renamed from: g */
    public final long f10064g;

    /* renamed from: h */
    public final String f10065h;

    /* renamed from: i */
    public final int f10066i;

    private li1(Uri uri, long j, int i, byte[] bArr, Map<String, String> map, long j2, long j3, String str, int i2, Object obj) {
        long j4 = j + j2;
        boolean z = false;
        wu1.m19205d(j4 >= 0);
        wu1.m19205d(j2 >= 0);
        wu1.m19205d((j3 > 0 || j3 == -1) ? true : z);
        this.f10058a = uri;
        this.f10059b = 1;
        this.f10060c = null;
        this.f10061d = Collections.unmodifiableMap(new HashMap(map));
        this.f10063f = j2;
        this.f10062e = j4;
        this.f10064g = j3;
        this.f10065h = null;
        this.f10066i = i2;
    }

    /* synthetic */ li1(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj, kh1 kh1) {
        this(uri, 0, 1, (byte[]) null, map, j2, -1, (String) null, i2, (Object) null);
    }

    @Deprecated
    public li1(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        this(uri, j - j2, 1, (byte[]) null, Collections.emptyMap(), j2, j3, (String) null, i, (Object) null);
    }

    /* renamed from: a */
    public static String m12757a(int i) {
        return "GET";
    }

    /* renamed from: b */
    public final boolean mo8963b(int i) {
        return (this.f10066i & i) == i;
    }

    public final String toString() {
        String a = m12757a(1);
        String valueOf = String.valueOf(this.f10058a);
        long j = this.f10063f;
        long j2 = this.f10064g;
        int i = this.f10066i;
        StringBuilder sb = new StringBuilder(a.length() + 70 + valueOf.length() + 4);
        sb.append("DataSpec[");
        sb.append(a);
        sb.append(" ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", null, ");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }
}
