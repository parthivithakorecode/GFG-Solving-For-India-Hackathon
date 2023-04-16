package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

final class kg3 {
    /* renamed from: a */
    public static void m12207a(qj3 qj3) {
        an3.m6137e(m12209c(qj3.mo10301J().mo12232K()));
        m12208b(qj3.mo10301J().mo12233L());
        if (qj3.mo10302M() != 2) {
            ee3.m8519c(qj3.mo10300F().mo8684I());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    /* renamed from: b */
    public static String m12208b(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return "HmacSha1";
        }
        if (i2 == 2) {
            return "HmacSha384";
        }
        if (i2 == 3) {
            return "HmacSha256";
        }
        if (i2 == 4) {
            return "HmacSha512";
        }
        if (i2 == 5) {
            return "HmacSha224";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(dk3.m7907a(i))));
    }

    /* renamed from: c */
    public static int m12209c(int i) {
        int i2 = i - 2;
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4) {
            return 3;
        }
        throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(bk3.m6951a(i))));
    }

    /* renamed from: d */
    public static int m12210d(int i) {
        int i2 = i - 2;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                if (i2 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(gj3.m9805a(i))));
            }
        }
        return i3;
    }
}
