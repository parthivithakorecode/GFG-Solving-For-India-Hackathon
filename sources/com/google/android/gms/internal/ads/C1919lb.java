package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.lb */
public final class C1919lb {

    /* renamed from: a */
    private static Cipher f9976a;

    /* renamed from: b */
    private static final Object f9977b = new Object();

    /* renamed from: c */
    private static final Object f9978c = new Object();

    public C1919lb(SecureRandom secureRandom) {
    }

    /* renamed from: c */
    private static final Cipher m12651c() {
        Cipher cipher;
        synchronized (f9978c) {
            if (f9976a == null) {
                f9976a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f9976a;
        }
        return cipher;
    }

    /* renamed from: a */
    public final String mo8912a(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f9977b) {
                m12651c().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = m12651c().doFinal(bArr2);
                iv = m12651c().getIV();
            }
            int length2 = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return C2102q9.m15534a(bArr3, false);
        } catch (NoSuchAlgorithmException e) {
            throw new C1882kb(this, e);
        } catch (InvalidKeyException e2) {
            throw new C1882kb(this, e2);
        } catch (IllegalBlockSizeException e3) {
            throw new C1882kb(this, e3);
        } catch (NoSuchPaddingException e4) {
            throw new C1882kb(this, e4);
        } catch (BadPaddingException e5) {
            throw new C1882kb(this, e5);
        }
    }

    /* renamed from: b */
    public final byte[] mo8913b(byte[] bArr, String str) {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] b = C2102q9.m15535b(str, false);
            int length2 = b.length;
            if (length2 > 16) {
                ByteBuffer allocate = ByteBuffer.allocate(length2);
                allocate.put(b);
                allocate.flip();
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[(length2 - 16)];
                allocate.get(bArr2);
                allocate.get(bArr3);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (f9977b) {
                    m12651c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                    doFinal = m12651c().doFinal(bArr3);
                }
                return doFinal;
            }
            throw new C1882kb(this);
        } catch (NoSuchAlgorithmException e) {
            throw new C1882kb(this, e);
        } catch (InvalidKeyException e2) {
            throw new C1882kb(this, e2);
        } catch (IllegalBlockSizeException e3) {
            throw new C1882kb(this, e3);
        } catch (NoSuchPaddingException e4) {
            throw new C1882kb(this, e4);
        } catch (BadPaddingException e5) {
            throw new C1882kb(this, e5);
        } catch (InvalidAlgorithmParameterException e6) {
            throw new C1882kb(this, e6);
        } catch (IllegalArgumentException e7) {
            throw new C1882kb(this, e7);
        }
    }
}
