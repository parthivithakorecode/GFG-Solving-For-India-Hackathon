package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class gm3 implements mn3 {

    /* renamed from: d */
    private static final ThreadLocal<Cipher> f7527d = new fm3();

    /* renamed from: a */
    private final SecretKeySpec f7528a;

    /* renamed from: b */
    private final int f7529b;

    /* renamed from: c */
    private final int f7530c;

    public gm3(byte[] bArr, int i) {
        if (qf3.m15611a(2)) {
            wn3.m19069a(bArr.length);
            this.f7528a = new SecretKeySpec(bArr, "AES");
            int blockSize = f7527d.get().getBlockSize();
            this.f7530c = blockSize;
            if (i < 12 || i > blockSize) {
                throw new GeneralSecurityException("invalid IV size");
            }
            this.f7529b = i;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: a */
    public final byte[] mo7661a(byte[] bArr) {
        int length = bArr.length;
        int i = this.f7529b;
        int i2 = Integer.MAX_VALUE - i;
        if (length <= i2) {
            byte[] bArr2 = new byte[(i + length)];
            byte[] a = un3.m17961a(i);
            System.arraycopy(a, 0, bArr2, 0, this.f7529b);
            int i3 = this.f7529b;
            Cipher cipher = f7527d.get();
            byte[] bArr3 = new byte[this.f7530c];
            System.arraycopy(a, 0, bArr3, 0, this.f7529b);
            cipher.init(1, this.f7528a, new IvParameterSpec(bArr3));
            if (cipher.doFinal(bArr, 0, length, bArr2, i3) == length) {
                return bArr2;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("plaintext length can not exceed ");
        sb.append(i2);
        throw new GeneralSecurityException(sb.toString());
    }
}
