package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class jm3 implements wc3 {

    /* renamed from: e */
    private static final ThreadLocal<Cipher> f9191e = new hm3();

    /* renamed from: f */
    private static final ThreadLocal<Cipher> f9192f = new im3();

    /* renamed from: a */
    private final byte[] f9193a;

    /* renamed from: b */
    private final byte[] f9194b;

    /* renamed from: c */
    private final SecretKeySpec f9195c;

    /* renamed from: d */
    private final int f9196d;

    public jm3(byte[] bArr, int i) {
        if (!qf3.m15611a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        } else if (i == 12 || i == 16) {
            this.f9196d = i;
            wn3.m19069a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f9195c = secretKeySpec;
            Cipher cipher = f9191e.get();
            cipher.init(1, secretKeySpec);
            byte[] b = m11736b(cipher.doFinal(new byte[16]));
            this.f9193a = b;
            this.f9194b = m11736b(b);
        } else {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
    }

    /* renamed from: b */
    private static byte[] m11736b(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr2[i] = (byte) (((b + b) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        byte b2 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b2 + b2));
        return bArr2;
    }

    /* renamed from: c */
    private final byte[] m11737c(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        byte[] bArr2;
        int length;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(m11738d(bArr3, this.f9193a));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i4 = 0;
        int i5 = 0;
        while (i3 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                doFinal[i6] = (byte) (doFinal[i6] ^ bArr[(i2 + i5) + i6]);
            }
            doFinal = cipher.doFinal(doFinal);
            i5 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i5 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            bArr2 = m11738d(copyOfRange, this.f9193a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f9194b, 16);
            while (true) {
                length = copyOfRange.length;
                if (i4 >= length) {
                    break;
                }
                copyOf[i4] = (byte) (copyOf[i4] ^ copyOfRange[i4]);
                i4++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(m11738d(doFinal, bArr2));
    }

    /* renamed from: d */
    private static byte[] m11738d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    /* renamed from: a */
    public final byte[] mo5895a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f9196d;
        if (length <= (Integer.MAX_VALUE - i) - 16) {
            byte[] bArr3 = new byte[(i + length + 16)];
            byte[] a = un3.m17961a(i);
            System.arraycopy(a, 0, bArr3, 0, this.f9196d);
            Cipher cipher = f9191e.get();
            cipher.init(1, this.f9195c);
            Cipher cipher2 = cipher;
            byte[] c = m11737c(cipher2, 0, a, 0, a.length);
            byte[] c2 = m11737c(cipher2, 1, bArr2, 0, 0);
            Cipher cipher3 = f9192f.get();
            cipher3.init(1, this.f9195c, new IvParameterSpec(c));
            cipher3.doFinal(bArr, 0, length, bArr3, this.f9196d);
            byte[] c3 = m11737c(cipher, 2, bArr3, this.f9196d, length);
            int i2 = length + this.f9196d;
            for (int i3 = 0; i3 < 16; i3++) {
                bArr3[i2 + i3] = (byte) ((c2[i3] ^ c[i3]) ^ c3[i3]);
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
