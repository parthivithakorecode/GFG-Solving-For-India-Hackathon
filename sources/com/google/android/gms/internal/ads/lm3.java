package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lm3 implements wc3 {

    /* renamed from: b */
    private static final ThreadLocal<Cipher> f10094b = new km3();

    /* renamed from: a */
    private final SecretKey f10095a;

    public lm3(byte[] bArr) {
        if (qf3.m15611a(2)) {
            wn3.m19069a(bArr.length);
            this.f10095a = new SecretKeySpec(bArr, "AES");
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: a */
    public final byte[] mo5895a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[(length + 28)];
            byte[] a = un3.m17961a(12);
            System.arraycopy(a, 0, bArr3, 0, 12);
            int length2 = a.length;
            AlgorithmParameterSpec gCMParameterSpec = (!vn3.m18611b() || vn3.m18610a() > 19) ? new GCMParameterSpec(128, a, 0, length2) : new IvParameterSpec(a, 0, length2);
            ThreadLocal<Cipher> threadLocal = f10094b;
            threadLocal.get().init(1, this.f10095a, gCMParameterSpec);
            int doFinal = threadLocal.get().doFinal(bArr, 0, length, bArr3, 12);
            if (doFinal == length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - length)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
