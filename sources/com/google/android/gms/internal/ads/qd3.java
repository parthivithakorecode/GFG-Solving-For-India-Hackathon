package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

@Deprecated
public final class qd3 {
    @Deprecated
    /* renamed from: a */
    public static final md3 m15600a(byte[] bArr) {
        try {
            bl3 I = bl3.m6957I(bArr, mp3.m13445a());
            for (al3 next : I.mo5881J()) {
                if (next.mo5314G().mo10320M() == 2 || next.mo5314G().mo10320M() == 3 || next.mo5314G().mo10320M() == 4) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return md3.m13185a(I);
        } catch (mq3 unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
