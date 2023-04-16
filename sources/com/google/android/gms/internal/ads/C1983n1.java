package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.n1 */
final class C1983n1 {

    /* renamed from: a */
    private static final int[] f11233a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: a */
    public static boolean m13588a(pc4 pc4) {
        return m13590c(pc4, true, false);
    }

    /* renamed from: b */
    public static boolean m13589b(pc4 pc4, boolean z) {
        return m13590c(pc4, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00fa, code lost:
        r2 = false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m13590c(com.google.android.gms.internal.ads.pc4 r21, boolean r22, boolean r23) {
        /*
            r0 = r21
            long r1 = r21.mo6909c()
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 4096(0x1000, double:2.0237E-320)
            if (r5 == 0) goto L_0x0014
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r6 = r1
        L_0x0014:
            int r6 = (int) r6
            com.google.android.gms.internal.ads.dr2 r7 = new com.google.android.gms.internal.ads.dr2
            r8 = 64
            r7.<init>((int) r8)
            r8 = 0
            r9 = r8
            r10 = r9
        L_0x001f:
            r11 = 1
            if (r9 >= r6) goto L_0x00fa
            r12 = 8
            r7.mo6577c(r12)
            byte[] r13 = r7.mo6582h()
            boolean r13 = r0.mo6917n(r13, r8, r12, r11)
            if (r13 != 0) goto L_0x0034
            r2 = r8
            goto L_0x00fb
        L_0x0034:
            long r13 = r7.mo6567A()
            int r15 = r7.mo6587m()
            r16 = 1
            int r16 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            r11 = 16
            if (r16 != 0) goto L_0x0053
            byte[] r13 = r7.mo6582h()
            r0.mo6912f(r13, r12, r12)
            r7.mo6579e(r11)
            long r13 = r7.mo6600z()
            goto L_0x006c
        L_0x0053:
            r16 = 0
            int r11 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r11 != 0) goto L_0x006b
            long r16 = r21.mo6909c()
            int r11 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r11 == 0) goto L_0x006b
            long r13 = r21.mo6913g()
            long r16 = r16 - r13
            r13 = 8
            long r13 = r16 + r13
        L_0x006b:
            r11 = r12
        L_0x006c:
            long r3 = (long) r11
            int r18 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r18 >= 0) goto L_0x0072
            return r8
        L_0x0072:
            int r9 = r9 + r11
            r11 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r15 != r11) goto L_0x0085
            int r3 = (int) r13
            int r6 = r6 + r3
            if (r5 == 0) goto L_0x0082
            long r3 = (long) r6
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0082
            int r6 = (int) r1
        L_0x0082:
            r3 = -1
            goto L_0x001f
        L_0x0085:
            r11 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r15 == r11) goto L_0x00f8
            r11 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r15 != r11) goto L_0x0091
            goto L_0x00f8
        L_0x0091:
            r18 = r1
            long r1 = (long) r9
            long r1 = r1 + r13
            long r1 = r1 - r3
            r20 = r9
            long r8 = (long) r6
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x009e
            goto L_0x00fa
        L_0x009e:
            long r13 = r13 - r3
            int r1 = (int) r13
            int r9 = r20 + r1
            r2 = 1718909296(0x66747970, float:2.8862439E23)
            if (r15 != r2) goto L_0x00ec
            r2 = 0
            if (r1 >= r12) goto L_0x00ab
            return r2
        L_0x00ab:
            r7.mo6577c(r1)
            byte[] r3 = r7.mo6582h()
            r0.mo6912f(r3, r2, r1)
            int r1 = r1 >> 2
            r2 = 0
        L_0x00b8:
            if (r2 >= r1) goto L_0x00e7
            r3 = 1
            if (r2 != r3) goto L_0x00c2
            r3 = 4
            r7.mo6581g(r3)
            goto L_0x00e4
        L_0x00c2:
            int r3 = r7.mo6587m()
            int r4 = r3 >>> 8
            r8 = 3368816(0x336770, float:4.720717E-39)
            if (r4 != r8) goto L_0x00cf
        L_0x00cd:
            r10 = 1
            goto L_0x00e7
        L_0x00cf:
            r4 = 1751476579(0x68656963, float:4.333464E24)
            if (r3 != r4) goto L_0x00d5
            r3 = r4
        L_0x00d5:
            int[] r4 = f11233a
            r8 = 0
        L_0x00d8:
            r12 = 29
            if (r8 >= r12) goto L_0x00e4
            r12 = r4[r8]
            if (r12 != r3) goto L_0x00e1
            goto L_0x00cd
        L_0x00e1:
            int r8 = r8 + 1
            goto L_0x00d8
        L_0x00e4:
            int r2 = r2 + 1
            goto L_0x00b8
        L_0x00e7:
            if (r10 == 0) goto L_0x00ea
            goto L_0x00f1
        L_0x00ea:
            r1 = 0
            return r1
        L_0x00ec:
            if (r1 == 0) goto L_0x00f1
            r0.mo6906D(r1)
        L_0x00f1:
            r1 = r18
            r3 = -1
            r8 = 0
            goto L_0x001f
        L_0x00f8:
            r2 = 1
            goto L_0x00fb
        L_0x00fa:
            r2 = 0
        L_0x00fb:
            if (r10 == 0) goto L_0x0103
            r0 = r22
            if (r0 != r2) goto L_0x0103
            r0 = 1
            return r0
        L_0x0103:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1983n1.m13590c(com.google.android.gms.internal.ads.pc4, boolean, boolean):boolean");
    }
}
