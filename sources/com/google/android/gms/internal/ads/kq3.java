package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

public final class kq3 {

    /* renamed from: a */
    static final Charset f9605a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f9606b = Charset.forName("UTF-8");

    /* renamed from: c */
    static final Charset f9607c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f9608d;

    /* renamed from: e */
    public static final ByteBuffer f9609e;

    /* renamed from: f */
    public static final cp3 f9610f;

    static {
        byte[] bArr = new byte[0];
        f9608d = bArr;
        f9609e = ByteBuffer.wrap(bArr);
        int i = cp3.f5487e;
        f9610f = cp3.m7491g(bArr, 0, 0, false);
    }

    /* renamed from: a */
    public static int m12300a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m12301b(byte[] bArr) {
        int length = bArr.length;
        int d = m12303d(length, bArr, 0, length);
        if (d == 0) {
            return 1;
        }
        return d;
    }

    /* renamed from: c */
    public static int m12302c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    static int m12303d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    static <T> T m12304e(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: f */
    static <T> T m12305f(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: g */
    static Object m12306g(Object obj, Object obj2) {
        return ((kr3) obj).mo5394g().mo5349k((kr3) obj2).mo8525i();
    }

    /* renamed from: h */
    public static String m12307h(byte[] bArr) {
        return new String(bArr, f9606b);
    }

    /* renamed from: i */
    public static boolean m12308i(byte[] bArr) {
        return lt3.m12871i(bArr);
    }
}
