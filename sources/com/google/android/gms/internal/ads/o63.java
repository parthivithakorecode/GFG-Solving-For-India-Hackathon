package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

final class o63 {
    /* renamed from: a */
    static int m14326a(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* renamed from: b */
    static int m14327b(@CheckForNull Object obj, @CheckForNull Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, @CheckForNull Object[] objArr2) {
        int i2;
        int i3;
        int b = w63.m18896b(obj);
        int i4 = b & i;
        int c = m14328c(obj3, i4);
        if (c != 0) {
            int i5 = ~i;
            int i6 = b & i5;
            int i7 = -1;
            while (true) {
                i2 = c - 1;
                i3 = iArr[i2];
                if ((i3 & i5) != i6 || !m43.m13055a(obj, objArr[i2]) || (objArr2 != null && !m43.m13055a(obj2, objArr2[i2]))) {
                    int i8 = i3 & i;
                    if (i8 == 0) {
                        break;
                    }
                    int i9 = i8;
                    i7 = i2;
                    c = i9;
                }
            }
            int i10 = i3 & i;
            if (i7 == -1) {
                m14330e(obj3, i4, i10);
            } else {
                iArr[i7] = (i10 & i) | (iArr[i7] & i5);
            }
            return i2;
        }
        return -1;
    }

    /* renamed from: c */
    static int m14328c(Object obj, int i) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    /* renamed from: d */
    static Object m14329d(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    static void m14330e(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
