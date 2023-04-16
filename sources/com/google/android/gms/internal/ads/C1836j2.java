package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.j2 */
final class C1836j2 extends C1762h2 {

    /* renamed from: n */
    private C1799i2 f8946n;

    /* renamed from: o */
    private int f8947o;

    /* renamed from: p */
    private boolean f8948p;

    /* renamed from: q */
    private xd4 f8949q;

    /* renamed from: r */
    private vd4 f8950r;

    C1836j2() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo6028a(dr2 dr2) {
        int i = 0;
        if ((dr2.mo6582h()[0] & 1) == 1) {
            return -1;
        }
        byte b = dr2.mo6582h()[0];
        C1799i2 i2Var = this.f8946n;
        wu1.m19203b(i2Var);
        int i2 = !i2Var.f8496d[(b >> 1) & (255 >>> (8 - i2Var.f8497e))].f16793a ? i2Var.f8493a.f17149e : i2Var.f8493a.f17150f;
        if (this.f8948p) {
            i = (this.f8947o + i2) / 4;
        }
        long j = (long) i;
        if (dr2.mo6584j() < dr2.mo6586l() + 4) {
            byte[] copyOf = Arrays.copyOf(dr2.mo6582h(), dr2.mo6586l() + 4);
            dr2.mo6578d(copyOf, copyOf.length);
        } else {
            dr2.mo6579e(dr2.mo6586l() + 4);
        }
        byte[] h = dr2.mo6582h();
        h[dr2.mo6586l() - 4] = (byte) ((int) (j & 255));
        h[dr2.mo6586l() - 3] = (byte) ((int) ((j >>> 8) & 255));
        h[dr2.mo6586l() - 2] = (byte) ((int) ((j >>> 16) & 255));
        h[dr2.mo6586l() - 1] = (byte) ((int) ((j >>> 24) & 255));
        this.f8948p = true;
        this.f8947o = i2;
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo6029b(boolean z) {
        super.mo6029b(z);
        if (z) {
            this.f8946n = null;
            this.f8949q = null;
            this.f8950r = null;
        }
        this.f8947o = 0;
        this.f8948p = false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0404 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0406  */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6030c(com.google.android.gms.internal.ads.dr2 r26, long r27, com.google.android.gms.internal.ads.C1613d2 r29) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r29
            com.google.android.gms.internal.ads.i2 r3 = r0.f8946n
            r4 = 0
            if (r3 == 0) goto L_0x0011
            com.google.android.gms.internal.ads.c0 r1 = r2.f5621a
            java.util.Objects.requireNonNull(r1)
            return r4
        L_0x0011:
            com.google.android.gms.internal.ads.xd4 r6 = r0.f8949q
            r5 = 4
            r11 = 1
            if (r6 != 0) goto L_0x0084
            com.google.android.gms.internal.ads.yd4.m19982c(r11, r1, r4)
            int r13 = r26.mo6590p()
            int r14 = r26.mo6593s()
            int r15 = r26.mo6590p()
            int r6 = r26.mo6589o()
            if (r6 > 0) goto L_0x002f
            r16 = -1
            goto L_0x0031
        L_0x002f:
            r16 = r6
        L_0x0031:
            int r6 = r26.mo6589o()
            if (r6 > 0) goto L_0x003a
            r17 = -1
            goto L_0x003c
        L_0x003a:
            r17 = r6
        L_0x003c:
            int r6 = r26.mo6589o()
            if (r6 > 0) goto L_0x0045
            r18 = -1
            goto L_0x0047
        L_0x0045:
            r18 = r6
        L_0x0047:
            int r3 = r26.mo6593s()
            r6 = r3 & 15
            double r8 = (double) r6
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r8 = java.lang.Math.pow(r11, r8)
            int r6 = (int) r8
            r3 = r3 & 240(0xf0, float:3.36E-43)
            int r3 = r3 >> r5
            double r8 = (double) r3
            double r8 = java.lang.Math.pow(r11, r8)
            int r3 = (int) r8
            int r5 = r26.mo6593s()
            byte[] r8 = r26.mo6582h()
            int r1 = r26.mo6586l()
            byte[] r22 = java.util.Arrays.copyOf(r8, r1)
            com.google.android.gms.internal.ads.xd4 r1 = new com.google.android.gms.internal.ads.xd4
            r8 = 1
            r5 = r5 & r8
            if (r8 == r5) goto L_0x0077
            r21 = r4
            goto L_0x0079
        L_0x0077:
            r21 = 1
        L_0x0079:
            r12 = r1
            r19 = r6
            r20 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0.f8949q = r1
            goto L_0x008f
        L_0x0084:
            com.google.android.gms.internal.ads.vd4 r8 = r0.f8950r
            if (r8 != 0) goto L_0x0092
            r9 = 1
            com.google.android.gms.internal.ads.vd4 r1 = com.google.android.gms.internal.ads.yd4.m19981b(r1, r9, r9)
            r0.f8950r = r1
        L_0x008f:
            r7 = 0
            goto L_0x0400
        L_0x0092:
            int r9 = r26.mo6586l()
            byte[] r9 = new byte[r9]
            byte[] r10 = r26.mo6582h()
            int r11 = r26.mo6586l()
            java.lang.System.arraycopy(r10, r4, r9, r4, r11)
            int r10 = r6.f17145a
            r11 = 5
            com.google.android.gms.internal.ads.yd4.m19982c(r11, r1, r4)
            int r12 = r26.mo6593s()
            r13 = 1
            int r12 = r12 + r13
            com.google.android.gms.internal.ads.ud4 r13 = new com.google.android.gms.internal.ads.ud4
            byte[] r14 = r26.mo6582h()
            r13.<init>(r14)
            int r1 = r26.mo6585k()
            r14 = 8
            int r1 = r1 * r14
            r13.mo11210c(r1)
            r1 = r4
        L_0x00c3:
            r15 = 24
            r3 = 16
            if (r1 >= r12) goto L_0x01e2
            int r14 = r13.mo11209b(r15)
            r7 = 5653314(0x564342, float:7.92198E-39)
            if (r14 != r7) goto L_0x01c5
            int r3 = r13.mo11209b(r3)
            int r7 = r13.mo11209b(r15)
            long[] r14 = new long[r7]
            boolean r15 = r13.mo11211d()
            r18 = 0
            if (r15 != 0) goto L_0x0121
            boolean r15 = r13.mo11211d()
            r4 = 0
        L_0x00e9:
            if (r4 >= r7) goto L_0x011e
            if (r15 == 0) goto L_0x0109
            boolean r21 = r13.mo11211d()
            if (r21 == 0) goto L_0x0101
            int r21 = r13.mo11209b(r11)
            r22 = 1
            int r5 = r21 + 1
            r23 = r12
            long r11 = (long) r5
            r14[r4] = r11
            goto L_0x0107
        L_0x0101:
            r23 = r12
            r22 = 1
            r14[r4] = r18
        L_0x0107:
            r5 = 5
            goto L_0x0117
        L_0x0109:
            r5 = r11
            r23 = r12
            r22 = 1
            int r11 = r13.mo11209b(r5)
            int r11 = r11 + 1
            long r11 = (long) r11
            r14[r4] = r11
        L_0x0117:
            int r4 = r4 + 1
            r11 = r5
            r12 = r23
            r5 = 4
            goto L_0x00e9
        L_0x011e:
            r23 = r12
            goto L_0x0159
        L_0x0121:
            r5 = r11
            r23 = r12
            r22 = 1
            int r4 = r13.mo11209b(r5)
            int r4 = r4 + 1
            r5 = 0
        L_0x012d:
            if (r5 >= r7) goto L_0x0159
            int r11 = r7 - r5
            int r11 = com.google.android.gms.internal.ads.yd4.m19980a(r11)
            int r11 = r13.mo11209b(r11)
            r12 = 0
        L_0x013a:
            if (r12 >= r11) goto L_0x014e
            if (r5 >= r7) goto L_0x014e
            r22 = r8
            r24 = r9
            long r8 = (long) r4
            r14[r5] = r8
            int r5 = r5 + 1
            int r12 = r12 + 1
            r8 = r22
            r9 = r24
            goto L_0x013a
        L_0x014e:
            r22 = r8
            r24 = r9
            int r4 = r4 + 1
            r8 = r22
            r9 = r24
            goto L_0x012d
        L_0x0159:
            r22 = r8
            r24 = r9
            r4 = 4
            int r5 = r13.mo11209b(r4)
            r8 = 2
            if (r5 > r8) goto L_0x01ac
            r9 = 1
            if (r5 == r9) goto L_0x016b
            if (r5 != r8) goto L_0x019d
            r5 = 2
        L_0x016b:
            r8 = 32
            r13.mo11210c(r8)
            r13.mo11210c(r8)
            int r8 = r13.mo11209b(r4)
            int r8 = r8 + r9
            r13.mo11210c(r9)
            if (r5 != r9) goto L_0x0192
            if (r3 == 0) goto L_0x0196
            long r4 = (long) r7
            double r4 = (double) r4
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r14 = (long) r3
            double r14 = (double) r14
            double r11 = r11 / r14
            double r3 = java.lang.Math.pow(r4, r11)
            double r3 = java.lang.Math.floor(r3)
            long r3 = (long) r3
            r18 = r3
            goto L_0x0196
        L_0x0192:
            long r4 = (long) r7
            long r11 = (long) r3
            long r18 = r4 * r11
        L_0x0196:
            long r3 = (long) r8
            long r3 = r3 * r18
            int r3 = (int) r3
            r13.mo11210c(r3)
        L_0x019d:
            int r1 = r1 + 1
            r8 = r22
            r12 = r23
            r9 = r24
            r4 = 0
            r5 = 4
            r11 = 5
            r14 = 8
            goto L_0x00c3
        L_0x01ac:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 53
            r1.<init>(r2)
            java.lang.String r2 = "lookup type greater than 2 not decodable: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r2 = 0
            com.google.android.gms.internal.ads.dz r1 = com.google.android.gms.internal.ads.C1646dz.m8223a(r1, r2)
            throw r1
        L_0x01c5:
            r2 = 0
            int r1 = r13.mo11208a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 66
            r3.<init>(r4)
            java.lang.String r4 = "expected code book to start with [0x56, 0x43, 0x42] at "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.internal.ads.dz r1 = com.google.android.gms.internal.ads.C1646dz.m8223a(r1, r2)
            throw r1
        L_0x01e2:
            r22 = r8
            r24 = r9
            r1 = 6
            int r4 = r13.mo11209b(r1)
            r5 = 1
            int r4 = r4 + r5
            r5 = 0
        L_0x01ee:
            if (r5 >= r4) goto L_0x0201
            int r7 = r13.mo11209b(r3)
            if (r7 != 0) goto L_0x01f9
            int r5 = r5 + 1
            goto L_0x01ee
        L_0x01f9:
            java.lang.String r1 = "placeholder of time domain transforms not zeroed out"
            r2 = 0
            com.google.android.gms.internal.ads.dz r1 = com.google.android.gms.internal.ads.C1646dz.m8223a(r1, r2)
            throw r1
        L_0x0201:
            int r4 = r13.mo11209b(r1)
            r5 = 1
            int r4 = r4 + r5
            r7 = 0
        L_0x0208:
            r8 = 3
            r9 = 52
            if (r7 >= r4) goto L_0x02c1
            int r11 = r13.mo11209b(r3)
            if (r11 == 0) goto L_0x0295
            if (r11 != r5) goto L_0x027e
            r5 = 5
            int r9 = r13.mo11209b(r5)
            int[] r5 = new int[r9]
            r11 = 0
            r12 = -1
        L_0x021e:
            if (r11 >= r9) goto L_0x022f
            r14 = 4
            int r15 = r13.mo11209b(r14)
            r5[r11] = r15
            if (r15 <= r12) goto L_0x022a
            r12 = r15
        L_0x022a:
            int r11 = r11 + 1
            r15 = 24
            goto L_0x021e
        L_0x022f:
            int r12 = r12 + 1
            int[] r11 = new int[r12]
            r14 = 0
        L_0x0234:
            if (r14 >= r12) goto L_0x0260
            int r15 = r13.mo11209b(r8)
            r19 = 1
            int r15 = r15 + 1
            r11[r14] = r15
            r15 = 2
            int r23 = r13.mo11209b(r15)
            r15 = 8
            if (r23 <= 0) goto L_0x024c
            r13.mo11210c(r15)
        L_0x024c:
            r8 = 0
        L_0x024d:
            int r1 = r19 << r23
            if (r8 >= r1) goto L_0x025b
            r13.mo11210c(r15)
            int r8 = r8 + 1
            r15 = 8
            r19 = 1
            goto L_0x024d
        L_0x025b:
            int r14 = r14 + 1
            r1 = 6
            r8 = 3
            goto L_0x0234
        L_0x0260:
            r1 = 2
            r13.mo11210c(r1)
            r1 = 4
            int r8 = r13.mo11209b(r1)
            r1 = 0
            r12 = 0
            r14 = 0
        L_0x026c:
            if (r1 >= r9) goto L_0x02b9
            r15 = r5[r1]
            r15 = r11[r15]
            int r12 = r12 + r15
        L_0x0273:
            if (r14 >= r12) goto L_0x027b
            r13.mo11210c(r8)
            int r14 = r14 + 1
            goto L_0x0273
        L_0x027b:
            int r1 = r1 + 1
            goto L_0x026c
        L_0x027e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r9)
            java.lang.String r2 = "floor type greater than 1 not decodable: "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r2 = 0
            com.google.android.gms.internal.ads.dz r1 = com.google.android.gms.internal.ads.C1646dz.m8223a(r1, r2)
            throw r1
        L_0x0295:
            r1 = 8
            r13.mo11210c(r1)
            r13.mo11210c(r3)
            r13.mo11210c(r3)
            r5 = 6
            r13.mo11210c(r5)
            r13.mo11210c(r1)
            r5 = 4
            int r8 = r13.mo11209b(r5)
            r5 = 1
            int r8 = r8 + r5
            r5 = 0
        L_0x02af:
            if (r5 >= r8) goto L_0x02b9
            r13.mo11210c(r1)
            int r5 = r5 + 1
            r1 = 8
            goto L_0x02af
        L_0x02b9:
            int r7 = r7 + 1
            r1 = 6
            r5 = 1
            r15 = 24
            goto L_0x0208
        L_0x02c1:
            int r4 = r13.mo11209b(r1)
            r5 = 1
            int r4 = r4 + r5
            r7 = 0
        L_0x02c8:
            if (r7 >= r4) goto L_0x0335
            int r8 = r13.mo11209b(r3)
            r11 = 2
            if (r8 > r11) goto L_0x032d
            r8 = 24
            r13.mo11210c(r8)
            r13.mo11210c(r8)
            r13.mo11210c(r8)
            int r11 = r13.mo11209b(r1)
            int r11 = r11 + r5
            r1 = 8
            r13.mo11210c(r1)
            int[] r5 = new int[r11]
            r12 = 0
        L_0x02e9:
            if (r12 >= r11) goto L_0x0309
            r14 = 3
            int r15 = r13.mo11209b(r14)
            boolean r18 = r13.mo11211d()
            r8 = 5
            if (r18 == 0) goto L_0x02fc
            int r19 = r13.mo11209b(r8)
            goto L_0x02fe
        L_0x02fc:
            r19 = 0
        L_0x02fe:
            int r19 = r19 * 8
            int r19 = r19 + r15
            r5[r12] = r19
            int r12 = r12 + 1
            r8 = 24
            goto L_0x02e9
        L_0x0309:
            r8 = 5
            r14 = 3
            r12 = 0
        L_0x030c:
            if (r12 >= r11) goto L_0x0328
            r15 = 0
        L_0x030f:
            if (r15 >= r1) goto L_0x0323
            r19 = r5[r12]
            r21 = 1
            int r23 = r21 << r15
            r19 = r19 & r23
            if (r19 == 0) goto L_0x031e
            r13.mo11210c(r1)
        L_0x031e:
            int r15 = r15 + 1
            r1 = 8
            goto L_0x030f
        L_0x0323:
            int r12 = r12 + 1
            r1 = 8
            goto L_0x030c
        L_0x0328:
            int r7 = r7 + 1
            r1 = 6
            r5 = 1
            goto L_0x02c8
        L_0x032d:
            java.lang.String r1 = "residueType greater than 2 is not decodable"
            r2 = 0
            com.google.android.gms.internal.ads.dz r1 = com.google.android.gms.internal.ads.C1646dz.m8223a(r1, r2)
            throw r1
        L_0x0335:
            int r4 = r13.mo11209b(r1)
            r1 = 1
            int r4 = r4 + r1
            r1 = 0
        L_0x033c:
            if (r1 >= r4) goto L_0x03c1
            int r5 = r13.mo11209b(r3)
            if (r5 == 0) goto L_0x035d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r9)
            java.lang.String r8 = "mapping type other than 0 not supported: "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.lang.String r7 = "VorbisUtil"
            android.util.Log.e(r7, r5)
            r5 = 2
            r11 = 4
            goto L_0x03b6
        L_0x035d:
            boolean r5 = r13.mo11211d()
            if (r5 == 0) goto L_0x036b
            r5 = 4
            int r7 = r13.mo11209b(r5)
            r5 = 1
            int r7 = r7 + r5
            goto L_0x036d
        L_0x036b:
            r5 = 1
            r7 = r5
        L_0x036d:
            boolean r8 = r13.mo11211d()
            if (r8 == 0) goto L_0x0390
            r8 = 8
            int r11 = r13.mo11209b(r8)
            int r11 = r11 + r5
            r5 = 0
        L_0x037b:
            if (r5 >= r11) goto L_0x0390
            int r8 = r10 + -1
            int r12 = com.google.android.gms.internal.ads.yd4.m19980a(r8)
            r13.mo11210c(r12)
            int r8 = com.google.android.gms.internal.ads.yd4.m19980a(r8)
            r13.mo11210c(r8)
            int r5 = r5 + 1
            goto L_0x037b
        L_0x0390:
            r5 = 2
            int r8 = r13.mo11209b(r5)
            if (r8 != 0) goto L_0x03b9
            r8 = 1
            if (r7 <= r8) goto L_0x03a4
            r8 = 0
        L_0x039b:
            if (r8 >= r10) goto L_0x03a4
            r11 = 4
            r13.mo11210c(r11)
            int r8 = r8 + 1
            goto L_0x039b
        L_0x03a4:
            r11 = 4
            r8 = 0
        L_0x03a6:
            if (r8 >= r7) goto L_0x03b6
            r12 = 8
            r13.mo11210c(r12)
            r13.mo11210c(r12)
            r13.mo11210c(r12)
            int r8 = r8 + 1
            goto L_0x03a6
        L_0x03b6:
            int r1 = r1 + 1
            goto L_0x033c
        L_0x03b9:
            java.lang.String r1 = "to reserved bits must be zero after mapping coupling steps"
            r2 = 0
            com.google.android.gms.internal.ads.dz r1 = com.google.android.gms.internal.ads.C1646dz.m8223a(r1, r2)
            throw r1
        L_0x03c1:
            r1 = 6
            int r1 = r13.mo11209b(r1)
            r4 = 1
            int r1 = r1 + r4
            com.google.android.gms.internal.ads.wd4[] r9 = new com.google.android.gms.internal.ads.wd4[r1]
            r4 = 0
        L_0x03cb:
            if (r4 >= r1) goto L_0x03e9
            boolean r5 = r13.mo11211d()
            int r7 = r13.mo11209b(r3)
            int r8 = r13.mo11209b(r3)
            r10 = 8
            int r11 = r13.mo11209b(r10)
            com.google.android.gms.internal.ads.wd4 r12 = new com.google.android.gms.internal.ads.wd4
            r12.<init>(r5, r7, r8, r11)
            r9[r4] = r12
            int r4 = r4 + 1
            goto L_0x03cb
        L_0x03e9:
            boolean r3 = r13.mo11211d()
            if (r3 == 0) goto L_0x0440
            com.google.android.gms.internal.ads.i2 r3 = new com.google.android.gms.internal.ads.i2
            r4 = -1
            int r1 = r1 + r4
            int r10 = com.google.android.gms.internal.ads.yd4.m19980a(r1)
            r5 = r3
            r7 = r22
            r8 = r24
            r5.<init>(r6, r7, r8, r9, r10)
            r7 = r3
        L_0x0400:
            r0.f8946n = r7
            if (r7 != 0) goto L_0x0406
            r1 = 1
            return r1
        L_0x0406:
            com.google.android.gms.internal.ads.xd4 r1 = r7.f8493a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            byte[] r4 = r1.f17151g
            r3.add(r4)
            byte[] r4 = r7.f8495c
            r3.add(r4)
            com.google.android.gms.internal.ads.bf4 r4 = new com.google.android.gms.internal.ads.bf4
            r4.<init>()
            java.lang.String r5 = "audio/vorbis"
            r4.mo5842s(r5)
            int r5 = r1.f17148d
            r4.mo5823d0(r5)
            int r5 = r1.f17147c
            r4.mo5838o(r5)
            int r5 = r1.f17145a
            r4.mo5825e0(r5)
            int r1 = r1.f17146b
            r4.mo5843t(r1)
            r4.mo5832i(r3)
            com.google.android.gms.internal.ads.c0 r1 = r4.mo5848y()
            r2.f5621a = r1
            r1 = 1
            return r1
        L_0x0440:
            java.lang.String r1 = "framing bit after modes not set as expected"
            r2 = 0
            com.google.android.gms.internal.ads.dz r1 = com.google.android.gms.internal.ads.C1646dz.m8223a(r1, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1836j2.mo6030c(com.google.android.gms.internal.ads.dr2, long, com.google.android.gms.internal.ads.d2):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo7806h(long j) {
        super.mo7806h(j);
        int i = 0;
        this.f8948p = j != 0;
        xd4 xd4 = this.f8949q;
        if (xd4 != null) {
            i = xd4.f17149e;
        }
        this.f8947o = i;
    }
}
