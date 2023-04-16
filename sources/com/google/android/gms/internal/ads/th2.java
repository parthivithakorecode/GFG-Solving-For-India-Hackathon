package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class th2 {

    /* renamed from: a */
    public static final byte[] f14860a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f14861b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    private static final Object f14862c = new Object();

    /* renamed from: d */
    private static int[] f14863d = new int[10];

    /* renamed from: a */
    public static int m17268a(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        boolean z = false;
        wu1.m19207f(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m17272e(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m17272e(zArr);
            return i - 2;
        } else if (i3 <= 2 || !zArr[2] || bArr[i] != 0 || bArr[i + 1] != 1) {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                byte b = bArr[i5];
                if ((b & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                        m17272e(zArr);
                        return i6;
                    }
                    i5 = i6;
                }
                i5 += 3;
            }
            zArr[0] = i3 <= 2 ? !(i3 != 2 ? !zArr[1] || bArr[i4] != 1 : !(zArr[2] && bArr[i2 + -2] == 0 && bArr[i4] == 1)) : bArr[i2 + -3] == 0 && bArr[i2 + -2] == 0 && bArr[i4] == 1;
            zArr[1] = i3 <= 1 ? !(!zArr[2] || bArr[i4] != 0) : bArr[i2 + -2] == 0 && bArr[i4] == 0;
            if (bArr[i4] == 0) {
                z = true;
            }
            zArr[2] = z;
            return i2;
        } else {
            m17272e(zArr);
            return i - 1;
        }
    }

    /* renamed from: b */
    public static int m17269b(byte[] bArr, int i) {
        int i2;
        synchronized (f14862c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = f14863d;
                    if (iArr.length <= i4) {
                        int length = iArr.length;
                        f14863d = Arrays.copyOf(iArr, length + length);
                    }
                    f14863d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f14863d[i7] - i5;
                System.arraycopy(bArr, i5, bArr, i6, i8);
                int i9 = i6 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i6 = i10 + 1;
                bArr[i10] = 0;
                i5 += i8 + 3;
            }
            System.arraycopy(bArr, i5, bArr, i6, i2 - i6);
        }
        return i2;
    }

    /* renamed from: c */
    public static rf2 m17270c(byte[] bArr, int i, int i2) {
        es2 es2 = new es2(bArr, 4, i2);
        int c = es2.mo7057c();
        int c2 = es2.mo7057c();
        es2.mo7058d();
        return new rf2(c, c2, es2.mo7060f());
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0160  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.sg2 m17271d(byte[] r22, int r23, int r24) {
        /*
            com.google.android.gms.internal.ads.es2 r0 = new com.google.android.gms.internal.ads.es2
            r1 = r22
            r2 = r23
            r3 = r24
            r0.<init>(r1, r2, r3)
            r1 = 8
            int r2 = r0.mo7055a(r1)
            int r5 = r0.mo7055a(r1)
            int r6 = r0.mo7055a(r1)
            int r7 = r0.mo7057c()
            r3 = 138(0x8a, float:1.93E-43)
            r4 = 3
            r8 = 16
            r10 = 1
            r11 = 100
            if (r2 == r11) goto L_0x004e
            r11 = 110(0x6e, float:1.54E-43)
            if (r2 == r11) goto L_0x004e
            r11 = 122(0x7a, float:1.71E-43)
            if (r2 == r11) goto L_0x004e
            r11 = 244(0xf4, float:3.42E-43)
            if (r2 == r11) goto L_0x004e
            r11 = 44
            if (r2 == r11) goto L_0x004e
            r11 = 83
            if (r2 == r11) goto L_0x004e
            r11 = 86
            if (r2 == r11) goto L_0x004e
            r11 = 118(0x76, float:1.65E-43)
            if (r2 == r11) goto L_0x004e
            r11 = 128(0x80, float:1.794E-43)
            if (r2 == r11) goto L_0x004e
            if (r2 != r3) goto L_0x004b
            r2 = r3
            goto L_0x004e
        L_0x004b:
            r3 = r10
            r11 = 0
            goto L_0x00a0
        L_0x004e:
            int r3 = r0.mo7057c()
            if (r3 != r4) goto L_0x005a
            boolean r11 = r0.mo7060f()
            r12 = r4
            goto L_0x005c
        L_0x005a:
            r12 = r3
            r11 = 0
        L_0x005c:
            r0.mo7057c()
            r0.mo7057c()
            r0.mo7058d()
            boolean r13 = r0.mo7060f()
            if (r13 == 0) goto L_0x00a0
            if (r12 == r4) goto L_0x006f
            r12 = r1
            goto L_0x0071
        L_0x006f:
            r12 = 12
        L_0x0071:
            r13 = 0
        L_0x0072:
            if (r13 >= r12) goto L_0x00a0
            boolean r14 = r0.mo7060f()
            if (r14 == 0) goto L_0x009d
            r14 = 6
            if (r13 >= r14) goto L_0x007f
            r14 = r8
            goto L_0x0081
        L_0x007f:
            r14 = 64
        L_0x0081:
            r16 = r1
            r17 = r16
            r15 = 0
        L_0x0086:
            if (r15 >= r14) goto L_0x009d
            if (r16 == 0) goto L_0x0096
            int r16 = r0.mo7056b()
            int r9 = r17 + r16
            int r9 = r9 + 256
            int r9 = r9 % 256
            r16 = r9
        L_0x0096:
            if (r16 == 0) goto L_0x009a
            r17 = r16
        L_0x009a:
            int r15 = r15 + 1
            goto L_0x0086
        L_0x009d:
            int r13 = r13 + 1
            goto L_0x0072
        L_0x00a0:
            int r9 = r0.mo7057c()
            int r13 = r9 + 4
            int r9 = r0.mo7057c()
            if (r9 != 0) goto L_0x00b9
            int r12 = r0.mo7057c()
            int r12 = r12 + 4
            r24 = r2
            r14 = r9
            r15 = r12
        L_0x00b6:
            r16 = 0
            goto L_0x00e2
        L_0x00b9:
            if (r9 != r10) goto L_0x00dd
            boolean r9 = r0.mo7060f()
            r0.mo7056b()
            r0.mo7056b()
            int r12 = r0.mo7057c()
            long r14 = (long) r12
            r24 = r2
            r12 = 0
        L_0x00cd:
            long r1 = (long) r12
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 >= 0) goto L_0x00d8
            r0.mo7057c()
            int r12 = r12 + 1
            goto L_0x00cd
        L_0x00d8:
            r16 = r9
            r14 = r10
            r15 = 0
            goto L_0x00e2
        L_0x00dd:
            r24 = r2
            r14 = r9
            r15 = 0
            goto L_0x00b6
        L_0x00e2:
            r0.mo7057c()
            r0.mo7058d()
            int r1 = r0.mo7057c()
            int r1 = r1 + r10
            int r2 = r0.mo7057c()
            boolean r12 = r0.mo7060f()
            int r9 = 2 - r12
            int r2 = r2 + r10
            int r2 = r2 * r9
            if (r12 != 0) goto L_0x00fe
            r0.mo7058d()
        L_0x00fe:
            r0.mo7058d()
            int r1 = r1 * r8
            int r2 = r2 * r8
            boolean r17 = r0.mo7060f()
            if (r17 == 0) goto L_0x0136
            int r17 = r0.mo7057c()
            int r18 = r0.mo7057c()
            int r19 = r0.mo7057c()
            int r20 = r0.mo7057c()
            if (r3 != 0) goto L_0x011c
            goto L_0x012a
        L_0x011c:
            r21 = 2
            if (r3 != r4) goto L_0x0122
            r4 = r10
            goto L_0x0124
        L_0x0122:
            r4 = r21
        L_0x0124:
            if (r3 != r10) goto L_0x0128
            r10 = r21
        L_0x0128:
            int r9 = r9 * r10
            r10 = r4
        L_0x012a:
            int r17 = r17 + r18
            int r17 = r17 * r10
            int r1 = r1 - r17
            int r19 = r19 + r20
            int r19 = r19 * r9
            int r2 = r2 - r19
        L_0x0136:
            r9 = r2
            boolean r2 = r0.mo7060f()
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x0182
            boolean r2 = r0.mo7060f()
            if (r2 == 0) goto L_0x0182
            r2 = 8
            int r2 = r0.mo7055a(r2)
            r4 = 255(0xff, float:3.57E-43)
            if (r2 != r4) goto L_0x0160
            int r2 = r0.mo7055a(r8)
            int r0 = r0.mo7055a(r8)
            if (r2 == 0) goto L_0x0182
            if (r0 == 0) goto L_0x0182
            float r2 = (float) r2
            float r0 = (float) r0
            float r2 = r2 / r0
            r10 = r2
            goto L_0x0183
        L_0x0160:
            r0 = 17
            if (r2 >= r0) goto L_0x016a
            float[] r0 = f14861b
            r0 = r0[r2]
            r10 = r0
            goto L_0x0183
        L_0x016a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r4 = 46
            r0.<init>(r4)
            java.lang.String r4 = "Unexpected aspect_ratio_idc value: "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "NalUnitUtil"
            android.util.Log.w(r2, r0)
        L_0x0182:
            r10 = r3
        L_0x0183:
            com.google.android.gms.internal.ads.sg2 r0 = new com.google.android.gms.internal.ads.sg2
            r3 = r0
            r4 = r24
            r8 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.th2.m17271d(byte[], int, int):com.google.android.gms.internal.ads.sg2");
    }

    /* renamed from: e */
    public static void m17272e(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
