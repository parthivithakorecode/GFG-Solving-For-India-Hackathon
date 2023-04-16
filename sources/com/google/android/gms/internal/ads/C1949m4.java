package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.m4 */
public final class C1949m4 {
    /* renamed from: a */
    public static int m13046a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    /* renamed from: b */
    public static long m13047b(dr2 dr2, int i, int i2) {
        dr2.mo6580f(i);
        if (dr2.mo6583i() < 5) {
            return -9223372036854775807L;
        }
        int m = dr2.mo6587m();
        if ((8388608 & m) != 0 || ((m >> 8) & 8191) != i2 || (m & 32) == 0 || dr2.mo6593s() < 7 || dr2.mo6583i() < 7 || (dr2.mo6593s() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        dr2.mo6576b(bArr, 0, 6);
        byte b = bArr[0];
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        long j = ((long) bArr[3]) & 255;
        return ((((long) b2) & 255) << 17) | ((((long) b) & 255) << 25) | ((((long) b3) & 255) << 9) | (j + j) | ((((long) bArr[4]) & 255) >> 7);
    }
}
