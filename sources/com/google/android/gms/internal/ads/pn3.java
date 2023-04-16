package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class pn3 implements xg3 {

    /* renamed from: a */
    private final SecretKey f12723a;

    /* renamed from: b */
    private final byte[] f12724b;

    /* renamed from: c */
    private final byte[] f12725c;

    public pn3(byte[] bArr) {
        wn3.m19069a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f12723a = secretKeySpec;
        Cipher b = m15171b();
        b.init(1, secretKeySpec);
        byte[] b2 = om3.m14528b(b.doFinal(new byte[16]));
        this.f12724b = b2;
        this.f12725c = om3.m14528b(b2);
    }

    /* renamed from: b */
    private static Cipher m15171b() {
        if (qf3.m15611a(1)) {
            return cn3.f5466e.mo6236a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    /* renamed from: a */
    public final byte[] mo10112a(byte[] bArr, int i) {
        if (i <= 16) {
            Cipher b = m15171b();
            b.init(1, this.f12723a);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
            byte[] d = max * 16 == length ? pm3.m15169d(bArr, (max - 1) * 16, this.f12724b, 0, 16) : pm3.m15168c(om3.m14527a(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.f12725c);
            byte[] bArr2 = new byte[16];
            for (int i2 = 0; i2 < max - 1; i2++) {
                bArr2 = b.doFinal(pm3.m15169d(bArr2, 0, bArr, i2 * 16, 16));
            }
            return Arrays.copyOf(b.doFinal(pm3.m15168c(d, bArr2)), i);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
