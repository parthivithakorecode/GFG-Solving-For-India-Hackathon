package com.google.android.gms.internal.ads;

final class ht3 {
    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m10775a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m10781g(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m10781g(b3) || m10781g(b4)) {
            throw mq3.m13454d();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m10776b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m10781g(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!m10781g(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw mq3.m13454d();
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ void m10777c(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m10781g(b2)) {
            throw mq3.m13454d();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: d */
    static /* bridge */ /* synthetic */ boolean m10778d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ boolean m10779e(byte b) {
        return b < -16;
    }

    /* renamed from: f */
    static /* bridge */ /* synthetic */ boolean m10780f(byte b) {
        return b < -32;
    }

    /* renamed from: g */
    private static boolean m10781g(byte b) {
        return b > -65;
    }
}
