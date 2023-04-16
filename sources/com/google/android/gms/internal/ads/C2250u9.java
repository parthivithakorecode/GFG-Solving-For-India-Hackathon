package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.u9 */
final class C2250u9 {

    /* renamed from: a */
    static boolean f15464a = false;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static MessageDigest f15465b;

    /* renamed from: c */
    private static final Object f15466c = new Object();

    /* renamed from: d */
    private static final Object f15467d = new Object();

    /* renamed from: e */
    static final CountDownLatch f15468e = new CountDownLatch(1);

    /* renamed from: a */
    static String m17750a(C1509a9 a9Var, String str) {
        byte[] bArr;
        aq3 o;
        byte[] b = a9Var.mo5901b();
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10419X1)).booleanValue()) {
            Vector<byte[]> b2 = m17751b(b, 255);
            if (b2 == null || b2.size() == 0) {
                bArr = m17756g(m17755f(4096).mo5901b(), str, true);
                return C2102q9.m15534a(bArr, true);
            }
            C1991n9 F = C2028o9.m14365F();
            int size = b2.size();
            for (int i = 0; i < size; i++) {
                F.mo9470r(uo3.m17968I(m17756g(b2.get(i), str, false)));
            }
            F.mo9471s(uo3.m17968I(m17754e(b)));
            o = F.mo11894o();
        } else if (C1772hc.f8154a != null) {
            byte[] a = C1772hc.f8154a.mo5809a(b, str != null ? str.getBytes() : new byte[0]);
            C1991n9 F2 = C2028o9.m14365F();
            F2.mo9470r(uo3.m17968I(a));
            F2.mo9472t(3);
            o = F2.mo11894o();
        } else {
            throw new GeneralSecurityException();
        }
        bArr = ((C2028o9) o).mo5901b();
        return C2102q9.m15534a(bArr, true);
    }

    /* renamed from: b */
    static Vector<byte[]> m17751b(byte[] bArr, int i) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i2 = (length + 254) / 255;
        Vector<byte[]> vector = new Vector<>();
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i4, length2));
                i3++;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    /* renamed from: d */
    static void m17753d() {
        synchronized (f15467d) {
            if (!f15464a) {
                f15464a = true;
                new Thread(new C2213t9((C2176s9) null)).start();
            }
        }
    }

    /* renamed from: e */
    public static byte[] m17754e(byte[] bArr) {
        byte[] digest;
        synchronized (f15466c) {
            m17753d();
            MessageDigest messageDigest = null;
            try {
                if (f15468e.await(2, TimeUnit.SECONDS)) {
                    MessageDigest messageDigest2 = f15465b;
                    if (messageDigest2 != null) {
                        messageDigest = messageDigest2;
                    }
                }
            } catch (InterruptedException unused) {
            }
            if (messageDigest != null) {
                messageDigest.reset();
                messageDigest.update(bArr);
                digest = f15465b.digest();
            } else {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
        }
        return digest;
    }

    /* renamed from: f */
    static C1509a9 m17755f(int i) {
        C1842j8 f0 = C1509a9.m5946f0();
        f0.mo8411r0(4096);
        return (C1509a9) f0.mo11894o();
    }

    /* renamed from: g */
    private static byte[] m17756g(byte[] bArr, String str, boolean z) {
        ByteBuffer byteBuffer;
        int i = true != z ? 255 : 239;
        if (bArr.length > i) {
            bArr = m17755f(4096).mo5901b();
        }
        int length = bArr.length;
        if (length < i) {
            byte[] bArr2 = new byte[(i - length)];
            new SecureRandom().nextBytes(bArr2);
            byteBuffer = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).put(bArr2);
        } else {
            byteBuffer = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr);
        }
        byte[] array = byteBuffer.array();
        if (z) {
            array = ByteBuffer.allocate(256).put(m17754e(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        C2287v9[] v9VarArr = new C2288va().f15986G2;
        int length2 = v9VarArr.length;
        for (int i2 = 0; i2 < 12; i2++) {
            v9VarArr[i2].mo5194a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zn3(str.getBytes("UTF-8")).mo12248a(bArr3);
        }
        return bArr3;
    }
}
