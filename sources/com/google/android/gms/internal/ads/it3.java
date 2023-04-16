package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

abstract class it3 {
    it3() {
    }

    /* renamed from: d */
    static final String m11287d(ByteBuffer byteBuffer, int i, int i2) {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (r11 < i3) {
                byte b = byteBuffer.get(r11);
                if (!ht3.m10778d(b)) {
                    break;
                }
                i = r11 + 1;
                cArr[i4] = (char) b;
                i4++;
            }
            int i5 = i4;
            while (r11 < i3) {
                int i6 = r11 + 1;
                byte b2 = byteBuffer.get(r11);
                if (ht3.m10778d(b2)) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) b2;
                    r11 = i6;
                    while (true) {
                        i5 = i7;
                        if (r11 >= i3) {
                            break;
                        }
                        byte b3 = byteBuffer.get(r11);
                        if (!ht3.m10778d(b3)) {
                            break;
                        }
                        r11++;
                        i7 = i5 + 1;
                        cArr[i5] = (char) b3;
                    }
                } else if (ht3.m10780f(b2)) {
                    if (i6 < i3) {
                        ht3.m10777c(b2, byteBuffer.get(i6), cArr, i5);
                        r11 = i6 + 1;
                        i5++;
                    } else {
                        throw mq3.m13454d();
                    }
                } else if (ht3.m10779e(b2)) {
                    if (i6 < i3 - 1) {
                        int i8 = i6 + 1;
                        ht3.m10776b(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                        r11 = i8 + 1;
                        i5++;
                    } else {
                        throw mq3.m13454d();
                    }
                } else if (i6 < i3 - 2) {
                    int i9 = i6 + 1;
                    int i10 = i9 + 1;
                    ht3.m10775a(b2, byteBuffer.get(i6), byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                    i5 += 2;
                    r11 = i10 + 1;
                } else {
                    throw mq3.m13454d();
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo8277a(int i, byte[] bArr, int i2, int i3);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract String mo8278b(byte[] bArr, int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo8279c(byte[] bArr, int i, int i2) {
        return mo8277a(0, bArr, i, i2) == 0;
    }
}
