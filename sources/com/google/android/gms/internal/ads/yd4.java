package com.google.android.gms.internal.ads;

public final class yd4 {
    /* renamed from: a */
    public static int m19980a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: b */
    public static vd4 m19981b(dr2 dr2, boolean z, boolean z2) {
        if (z) {
            m19982c(3, dr2, false);
        }
        String F = dr2.mo6572F((int) dr2.mo6599y(), c43.f5304c);
        long y = dr2.mo6599y();
        String[] strArr = new String[((int) y)];
        int length = F.length() + 15;
        for (int i = 0; ((long) i) < y; i++) {
            String F2 = dr2.mo6572F((int) dr2.mo6599y(), c43.f5304c);
            strArr[i] = F2;
            length = length + 4 + F2.length();
        }
        if (!z2 || (dr2.mo6593s() & 1) != 0) {
            return new vd4(F, strArr, length + 1);
        }
        throw C1646dz.m8223a("framing bit expected to be set", (Throwable) null);
    }

    /* renamed from: c */
    public static boolean m19982c(int i, dr2 dr2, boolean z) {
        if (dr2.mo6583i() < 7) {
            if (z) {
                return false;
            }
            int i2 = dr2.mo6583i();
            StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(i2);
            throw C1646dz.m8223a(sb.toString(), (Throwable) null);
        } else if (dr2.mo6593s() != i) {
            if (z) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i));
            throw C1646dz.m8223a(valueOf.length() != 0 ? "expected header type ".concat(valueOf) : new String("expected header type "), (Throwable) null);
        } else if (dr2.mo6593s() == 118 && dr2.mo6593s() == 111 && dr2.mo6593s() == 114 && dr2.mo6593s() == 98 && dr2.mo6593s() == 105 && dr2.mo6593s() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw C1646dz.m8223a("expected characters 'vorbis'", (Throwable) null);
        }
    }
}
