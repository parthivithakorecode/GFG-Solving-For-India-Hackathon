package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

final class fe3 {

    /* renamed from: a */
    public static final Charset f6810a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static gl3 m9146a(bl3 bl3) {
        dl3 F = gl3.m9834F();
        F.mo6501s(bl3.mo5880G());
        for (al3 next : bl3.mo5881J()) {
            el3 F2 = fl3.m9226F();
            F2.mo6997s(next.mo5314G().mo10319J());
            F2.mo6999u(next.mo5316J());
            F2.mo6998t(next.mo5317K());
            F2.mo6996r(next.mo5313F());
            F.mo6500r((fl3) F2.mo11894o());
        }
        return (gl3) F.mo11894o();
    }

    /* renamed from: b */
    public static void m9147b(bl3 bl3) {
        int G = bl3.mo5880G();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (al3 next : bl3.mo5881J()) {
            if (next.mo5316J() == 3) {
                if (!next.mo5315I()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(next.mo5313F())}));
                } else if (next.mo5317K() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(next.mo5313F())}));
                } else if (next.mo5316J() != 2) {
                    if (next.mo5313F() == G) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    z2 &= next.mo5314G().mo10320M() == 5;
                    i++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(next.mo5313F())}));
                }
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
