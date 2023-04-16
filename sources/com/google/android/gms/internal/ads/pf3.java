package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class pf3 implements wc3 {

    /* renamed from: b */
    private static final ThreadLocal<Cipher> f12656b = new of3();

    /* renamed from: a */
    private final SecretKey f12657a;

    public pf3(byte[] bArr) {
        wn3.m19069a(bArr.length);
        this.f12657a = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: a */
    public final byte[] mo5895a(byte[] bArr, byte[] bArr2) {
        AlgorithmParameterSpec algorithmParameterSpec;
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[(length + 28)];
            byte[] a = un3.m17961a(12);
            System.arraycopy(a, 0, bArr3, 0, 12);
            int length2 = a.length;
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                algorithmParameterSpec = new GCMParameterSpec(128, a, 0, length2);
            } catch (ClassNotFoundException unused) {
                if (vn3.m18611b()) {
                    algorithmParameterSpec = new IvParameterSpec(a, 0, length2);
                } else {
                    throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
                }
            }
            ThreadLocal<Cipher> threadLocal = f12656b;
            threadLocal.get().init(1, this.f12657a, algorithmParameterSpec);
            int doFinal = threadLocal.get().doFinal(bArr, 0, length, bArr3, 12);
            if (doFinal == length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - length)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
