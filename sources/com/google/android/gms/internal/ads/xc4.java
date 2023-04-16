package com.google.android.gms.internal.ads;

public final class xc4 {
    /* renamed from: a */
    public static int m19453a(dr2 dr2, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return dr2.mo6593s() + 1;
            case 7:
                return dr2.mo6597w() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    /* renamed from: b */
    public static long m19454b(pc4 pc4, dd4 dd4) {
        pc4.mo6914i();
        jc4 jc4 = (jc4) pc4;
        boolean z = true;
        jc4.mo8446o(1, false);
        byte[] bArr = new byte[1];
        jc4.mo6917n(bArr, 0, 1, false);
        byte b = bArr[0] & 1;
        jc4.mo8446o(2, false);
        int i = 1 != b ? 6 : 7;
        dr2 dr2 = new dr2(i);
        dr2.mo6579e(sc4.m16783a(pc4, dr2.mo6582h(), 0, i));
        pc4.mo6914i();
        wc4 wc4 = new wc4();
        if (1 != b) {
            z = false;
        }
        if (m19456d(dr2, dd4, z, wc4)) {
            return wc4.f16785a;
        }
        throw C1646dz.m8223a((String) null, (Throwable) null);
    }

    /* renamed from: c */
    public static boolean m19455c(dr2 dr2, dd4 dd4, int i, wc4 wc4) {
        int a;
        dr2 dr22 = dr2;
        dd4 dd42 = dd4;
        int k = dr2.mo6585k();
        long A = dr2.mo6567A();
        long j = A >>> 16;
        if (j != ((long) i)) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((A >> 12) & 15);
        int i3 = (int) ((A >> 8) & 15);
        int i4 = (int) (15 & (A >> 4));
        int i5 = (int) ((A >> 1) & 7);
        long j2 = A & 1;
        if (i4 <= 7) {
            if (i4 != dd42.f5768g - 1) {
                return false;
            }
        } else if (i4 > 10 || dd42.f5768g != 2) {
            return false;
        }
        if ((i5 != 0 && i5 != dd42.f5770i) || j2 == 1 || !m19456d(dr22, dd42, z, wc4) || (a = m19453a(dr22, i2)) == -1 || a > dd42.f5763b) {
            return false;
        }
        int i6 = dd42.f5766e;
        if (i3 != 0) {
            if (i3 <= 11) {
                if (i3 != dd42.f5767f) {
                    return false;
                }
            } else if (i3 == 12) {
                if (dr2.mo6593s() * 1000 != i6) {
                    return false;
                }
            } else if (i3 > 14) {
                return false;
            } else {
                int w = dr2.mo6597w();
                if (i3 == 14) {
                    w *= 10;
                }
                if (w != i6) {
                    return false;
                }
            }
        }
        return dr2.mo6593s() == n13.m13609N(dr2.mo6582h(), k, dr2.mo6585k() + -1, 0);
    }

    /* renamed from: d */
    private static boolean m19456d(dr2 dr2, dd4 dd4, boolean z, wc4 wc4) {
        try {
            long C = dr2.mo6569C();
            if (!z) {
                C *= (long) dd4.f5763b;
            }
            wc4.f16785a = C;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
