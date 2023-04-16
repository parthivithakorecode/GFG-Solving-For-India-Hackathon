package com.google.android.gms.internal.ads;

import java.io.EOFException;
import org.checkerframework.dataflow.qual.Pure;

public final class sc4 {
    /* renamed from: a */
    public static int m16783a(pc4 pc4, byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int d = pc4.mo6910d(bArr, i + i3, i2 - i3);
            if (d == -1) {
                break;
            }
            i3 += d;
        }
        return i3;
    }

    @Pure
    /* renamed from: b */
    public static void m16784b(boolean z, String str) {
        if (!z) {
            throw C1646dz.m8223a(str, (Throwable) null);
        }
    }

    /* renamed from: c */
    public static boolean m16785c(pc4 pc4, byte[] bArr, int i, int i2, boolean z) {
        try {
            return pc4.mo6917n(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    /* renamed from: d */
    public static boolean m16786d(pc4 pc4, byte[] bArr, int i, int i2) {
        try {
            ((jc4) pc4).mo6916m(bArr, i, i2, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m16787e(pc4 pc4, int i) {
        try {
            ((jc4) pc4).mo8447p(i, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
