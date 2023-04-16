package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.google.android.gms.internal.ads.i3 */
public final class C1800i3 implements C2317w2 {

    /* renamed from: a */
    private final C2393y3 f8505a;

    /* renamed from: b */
    private String f8506b;

    /* renamed from: c */
    private td4 f8507c;

    /* renamed from: d */
    private C1763h3 f8508d;

    /* renamed from: e */
    private boolean f8509e;

    /* renamed from: f */
    private final boolean[] f8510f = new boolean[3];

    /* renamed from: g */
    private final C1948m3 f8511g = new C1948m3(32, 128);

    /* renamed from: h */
    private final C1948m3 f8512h = new C1948m3(33, 128);

    /* renamed from: i */
    private final C1948m3 f8513i = new C1948m3(34, 128);

    /* renamed from: j */
    private final C1948m3 f8514j = new C1948m3(39, 128);

    /* renamed from: k */
    private final C1948m3 f8515k = new C1948m3(40, 128);

    /* renamed from: l */
    private long f8516l;

    /* renamed from: m */
    private long f8517m = -9223372036854775807L;

    /* renamed from: n */
    private final dr2 f8518n = new dr2();

    public C1800i3(C2393y3 y3Var) {
        this.f8505a = y3Var;
    }

    @RequiresNonNull({"sampleReader"})
    /* renamed from: f */
    private final void m10889f(byte[] bArr, int i, int i2) {
        this.f8508d.mo7835b(bArr, i, i2);
        if (!this.f8509e) {
            this.f8511g.mo9116a(bArr, i, i2);
            this.f8512h.mo9116a(bArr, i, i2);
            this.f8513i.mo9116a(bArr, i, i2);
        }
        this.f8514j.mo9116a(bArr, i, i2);
        this.f8515k.mo9116a(bArr, i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:155:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03c1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5638a(com.google.android.gms.internal.ads.dr2 r37) {
        /*
            r36 = this;
            r0 = r36
            com.google.android.gms.internal.ads.td4 r1 = r0.f8507c
            com.google.android.gms.internal.ads.wu1.m19203b(r1)
            int r1 = com.google.android.gms.internal.ads.n13.f11236a
        L_0x0009:
            int r1 = r37.mo6583i()
            if (r1 <= 0) goto L_0x03da
            int r1 = r37.mo6585k()
            int r2 = r37.mo6586l()
            byte[] r3 = r37.mo6582h()
            long r4 = r0.f8516l
            int r6 = r37.mo6583i()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f8516l = r4
            com.google.android.gms.internal.ads.td4 r4 = r0.f8507c
            int r5 = r37.mo6583i()
            r6 = r37
            com.google.android.gms.internal.ads.rd4.m16162b(r4, r6, r5)
        L_0x0030:
            if (r1 >= r2) goto L_0x0009
            boolean[] r4 = r0.f8510f
            int r4 = com.google.android.gms.internal.ads.th2.m17268a(r3, r1, r2, r4)
            if (r4 == r2) goto L_0x03d7
            int r5 = r4 + 3
            byte r7 = r3[r5]
            r7 = r7 & 126(0x7e, float:1.77E-43)
            r8 = 1
            int r7 = r7 >> r8
            int r9 = r4 - r1
            if (r9 <= 0) goto L_0x0049
            r0.m10889f(r3, r1, r4)
        L_0x0049:
            int r12 = r2 - r4
            long r10 = r0.f8516l
            long r13 = (long) r12
            long r10 = r10 - r13
            if (r9 >= 0) goto L_0x0053
            int r4 = -r9
            goto L_0x0054
        L_0x0053:
            r4 = 0
        L_0x0054:
            long r13 = r0.f8517m
            com.google.android.gms.internal.ads.h3 r9 = r0.f8508d
            boolean r15 = r0.f8509e
            r9.mo7834a(r10, r12, r15)
            boolean r9 = r0.f8509e
            if (r9 != 0) goto L_0x0337
            com.google.android.gms.internal.ads.m3 r9 = r0.f8511g
            r9.mo9119d(r4)
            com.google.android.gms.internal.ads.m3 r9 = r0.f8512h
            r9.mo9119d(r4)
            com.google.android.gms.internal.ads.m3 r9 = r0.f8513i
            r9.mo9119d(r4)
            com.google.android.gms.internal.ads.m3 r9 = r0.f8511g
            boolean r9 = r9.mo9120e()
            if (r9 == 0) goto L_0x0337
            com.google.android.gms.internal.ads.m3 r9 = r0.f8512h
            boolean r9 = r9.mo9120e()
            if (r9 == 0) goto L_0x0337
            com.google.android.gms.internal.ads.m3 r9 = r0.f8513i
            boolean r9 = r9.mo9120e()
            if (r9 == 0) goto L_0x0337
            com.google.android.gms.internal.ads.td4 r9 = r0.f8507c
            java.lang.String r8 = r0.f8506b
            com.google.android.gms.internal.ads.m3 r15 = r0.f8511g
            com.google.android.gms.internal.ads.m3 r1 = r0.f8512h
            r18 = r5
            com.google.android.gms.internal.ads.m3 r5 = r0.f8513i
            int r6 = r15.f10704e
            r19 = r2
            int r2 = r1.f10704e
            int r2 = r2 + r6
            r20 = r3
            int r3 = r5.f10704e
            int r2 = r2 + r3
            byte[] r2 = new byte[r2]
            byte[] r3 = r15.f10703d
            r21 = r7
            r7 = 0
            java.lang.System.arraycopy(r3, r7, r2, r7, r6)
            byte[] r3 = r1.f10703d
            int r6 = r15.f10704e
            r17 = r12
            int r12 = r1.f10704e
            java.lang.System.arraycopy(r3, r7, r2, r6, r12)
            byte[] r3 = r5.f10703d
            int r6 = r15.f10704e
            int r12 = r1.f10704e
            int r6 = r6 + r12
            int r5 = r5.f10704e
            java.lang.System.arraycopy(r3, r7, r2, r6, r5)
            com.google.android.gms.internal.ads.es2 r3 = new com.google.android.gms.internal.ads.es2
            byte[] r5 = r1.f10703d
            int r1 = r1.f10704e
            r3.<init>(r5, r7, r1)
            r1 = 44
            r3.mo7059e(r1)
            r1 = 3
            int r5 = r3.mo7055a(r1)
            r3.mo7058d()
            r6 = 2
            int r22 = r3.mo7055a(r6)
            boolean r23 = r3.mo7060f()
            r12 = 5
            int r24 = r3.mo7055a(r12)
            r12 = r7
            r25 = r12
        L_0x00e8:
            r15 = 32
            if (r12 >= r15) goto L_0x00fa
            boolean r15 = r3.mo7060f()
            if (r15 == 0) goto L_0x00f7
            r15 = 1
            int r26 = r15 << r12
            r25 = r25 | r26
        L_0x00f7:
            int r12 = r12 + 1
            goto L_0x00e8
        L_0x00fa:
            r12 = 6
            int[] r15 = new int[r12]
        L_0x00fd:
            r6 = 8
            if (r7 >= r12) goto L_0x010a
            int r6 = r3.mo7055a(r6)
            r15[r7] = r6
            int r7 = r7 + 1
            goto L_0x00fd
        L_0x010a:
            int r7 = r3.mo7055a(r6)
            r6 = 0
            r12 = 0
        L_0x0110:
            if (r6 >= r5) goto L_0x0125
            boolean r29 = r3.mo7060f()
            if (r29 == 0) goto L_0x011a
            int r12 = r12 + 89
        L_0x011a:
            boolean r29 = r3.mo7060f()
            if (r29 == 0) goto L_0x0122
            int r12 = r12 + 8
        L_0x0122:
            int r6 = r6 + 1
            goto L_0x0110
        L_0x0125:
            r3.mo7059e(r12)
            if (r5 <= 0) goto L_0x0130
            int r6 = 8 - r5
            int r6 = r6 + r6
            r3.mo7059e(r6)
        L_0x0130:
            r3.mo7057c()
            int r6 = r3.mo7057c()
            if (r6 != r1) goto L_0x013d
            r3.mo7058d()
            r6 = r1
        L_0x013d:
            int r12 = r3.mo7057c()
            int r29 = r3.mo7057c()
            boolean r30 = r3.mo7060f()
            if (r30 == 0) goto L_0x017e
            int r30 = r3.mo7057c()
            int r31 = r3.mo7057c()
            int r32 = r3.mo7057c()
            int r33 = r3.mo7057c()
            r1 = 1
            if (r6 == r1) goto L_0x0169
            r1 = 2
            r34 = r10
            if (r6 != r1) goto L_0x0166
            r1 = 2
            r6 = 2
            goto L_0x0167
        L_0x0166:
            r1 = 1
        L_0x0167:
            r10 = 1
            goto L_0x016d
        L_0x0169:
            r34 = r10
            r10 = r1
            r1 = 2
        L_0x016d:
            if (r6 != r10) goto L_0x0171
            r6 = 2
            goto L_0x0172
        L_0x0171:
            r6 = 1
        L_0x0172:
            int r30 = r30 + r31
            int r1 = r1 * r30
            int r12 = r12 - r1
            int r32 = r32 + r33
            int r6 = r6 * r32
            int r29 = r29 - r6
            goto L_0x0180
        L_0x017e:
            r34 = r10
        L_0x0180:
            r3.mo7057c()
            r3.mo7057c()
            int r1 = r3.mo7057c()
            boolean r6 = r3.mo7060f()
            r10 = 1
            if (r10 == r6) goto L_0x0193
            r6 = r5
            goto L_0x0194
        L_0x0193:
            r6 = 0
        L_0x0194:
            r3.mo7057c()
            r3.mo7057c()
            r3.mo7057c()
            if (r6 > r5) goto L_0x01a2
            int r6 = r6 + 1
            goto L_0x0194
        L_0x01a2:
            r3.mo7057c()
            r3.mo7057c()
            r3.mo7057c()
            boolean r5 = r3.mo7060f()
            r6 = 4
            if (r5 == 0) goto L_0x01fa
            boolean r5 = r3.mo7060f()
            if (r5 == 0) goto L_0x01fa
            r5 = 0
        L_0x01b9:
            if (r5 >= r6) goto L_0x01fa
            r10 = 0
        L_0x01bc:
            r11 = 6
            if (r10 >= r11) goto L_0x01f3
            boolean r28 = r3.mo7060f()
            if (r28 != 0) goto L_0x01cc
            r3.mo7057c()
            r32 = r13
        L_0x01ca:
            r6 = 3
            goto L_0x01e9
        L_0x01cc:
            r11 = 64
            int r30 = r5 + r5
            int r30 = r30 + 4
            r32 = r13
            r6 = 1
            int r13 = r6 << r30
            int r11 = java.lang.Math.min(r11, r13)
            if (r5 <= r6) goto L_0x01e0
            r3.mo7056b()
        L_0x01e0:
            r6 = 0
        L_0x01e1:
            if (r6 >= r11) goto L_0x01ca
            r3.mo7056b()
            int r6 = r6 + 1
            goto L_0x01e1
        L_0x01e9:
            if (r5 != r6) goto L_0x01ed
            r11 = r6
            goto L_0x01ee
        L_0x01ed:
            r11 = 1
        L_0x01ee:
            int r10 = r10 + r11
            r13 = r32
            r6 = 4
            goto L_0x01bc
        L_0x01f3:
            r32 = r13
            r6 = 3
            int r5 = r5 + 1
            r6 = 4
            goto L_0x01b9
        L_0x01fa:
            r32 = r13
            r5 = 2
            r3.mo7059e(r5)
            boolean r5 = r3.mo7060f()
            if (r5 == 0) goto L_0x0214
            r5 = 8
            r3.mo7059e(r5)
            r3.mo7057c()
            r3.mo7057c()
            r3.mo7058d()
        L_0x0214:
            int r5 = r3.mo7057c()
            r6 = 0
            r10 = 0
            r11 = 0
        L_0x021b:
            if (r6 >= r5) goto L_0x0267
            if (r6 == 0) goto L_0x0223
            boolean r10 = r3.mo7060f()
        L_0x0223:
            if (r10 == 0) goto L_0x023d
            r3.mo7058d()
            r3.mo7057c()
            r13 = 0
        L_0x022c:
            if (r13 > r11) goto L_0x023a
            boolean r14 = r3.mo7060f()
            if (r14 == 0) goto L_0x0237
            r3.mo7058d()
        L_0x0237:
            int r13 = r13 + 1
            goto L_0x022c
        L_0x023a:
            r28 = r5
            goto L_0x0262
        L_0x023d:
            int r11 = r3.mo7057c()
            int r13 = r3.mo7057c()
            int r14 = r11 + r13
            r28 = r5
            r5 = 0
        L_0x024a:
            if (r5 >= r11) goto L_0x0255
            r3.mo7057c()
            r3.mo7058d()
            int r5 = r5 + 1
            goto L_0x024a
        L_0x0255:
            r5 = 0
        L_0x0256:
            if (r5 >= r13) goto L_0x0261
            r3.mo7057c()
            r3.mo7058d()
            int r5 = r5 + 1
            goto L_0x0256
        L_0x0261:
            r11 = r14
        L_0x0262:
            int r6 = r6 + 1
            r5 = r28
            goto L_0x021b
        L_0x0267:
            boolean r5 = r3.mo7060f()
            if (r5 == 0) goto L_0x027d
            r5 = 0
        L_0x026e:
            int r6 = r3.mo7057c()
            if (r5 >= r6) goto L_0x027d
            r6 = 5
            int r10 = r1 + 5
            r3.mo7059e(r10)
            int r5 = r5 + 1
            goto L_0x026e
        L_0x027d:
            r1 = 2
            r3.mo7059e(r1)
            boolean r1 = r3.mo7060f()
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x0302
            boolean r1 = r3.mo7060f()
            if (r1 == 0) goto L_0x02cd
            r1 = 8
            int r1 = r3.mo7055a(r1)
            r6 = 255(0xff, float:3.57E-43)
            if (r1 != r6) goto L_0x02ab
            r1 = 16
            int r6 = r3.mo7055a(r1)
            int r1 = r3.mo7055a(r1)
            if (r6 == 0) goto L_0x02cd
            if (r1 == 0) goto L_0x02cd
            float r5 = (float) r6
            float r1 = (float) r1
            float r5 = r5 / r1
            goto L_0x02cd
        L_0x02ab:
            r6 = 17
            if (r1 >= r6) goto L_0x02b5
            float[] r5 = com.google.android.gms.internal.ads.th2.f14861b
            r1 = r5[r1]
            r5 = r1
            goto L_0x02cd
        L_0x02b5:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r10 = 46
            r6.<init>(r10)
            java.lang.String r10 = "Unexpected aspect_ratio_idc value: "
            r6.append(r10)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.String r6 = "H265Reader"
            android.util.Log.w(r6, r1)
        L_0x02cd:
            boolean r1 = r3.mo7060f()
            if (r1 == 0) goto L_0x02d6
            r3.mo7058d()
        L_0x02d6:
            boolean r1 = r3.mo7060f()
            if (r1 == 0) goto L_0x02eb
            r1 = 4
            r3.mo7059e(r1)
            boolean r1 = r3.mo7060f()
            if (r1 == 0) goto L_0x02eb
            r1 = 24
            r3.mo7059e(r1)
        L_0x02eb:
            boolean r1 = r3.mo7060f()
            if (r1 == 0) goto L_0x02f7
            r3.mo7057c()
            r3.mo7057c()
        L_0x02f7:
            r3.mo7058d()
            boolean r1 = r3.mo7060f()
            if (r1 == 0) goto L_0x0302
            int r29 = r29 + r29
        L_0x0302:
            r1 = r29
            r26 = r15
            r27 = r7
            java.lang.String r3 = com.google.android.gms.internal.ads.zw1.m20866b(r22, r23, r24, r25, r26, r27)
            com.google.android.gms.internal.ads.bf4 r6 = new com.google.android.gms.internal.ads.bf4
            r6.<init>()
            r6.mo5830h(r8)
            java.lang.String r7 = "video/hevc"
            r6.mo5842s(r7)
            r6.mo5827f0(r3)
            r6.mo5847x(r12)
            r6.mo5826f(r1)
            r6.mo5839p(r5)
            java.util.List r1 = java.util.Collections.singletonList(r2)
            r6.mo5832i(r1)
            com.google.android.gms.internal.ads.c0 r1 = r6.mo5848y()
            r9.mo7873b(r1)
            r1 = 1
            r0.f8509e = r1
            goto L_0x0345
        L_0x0337:
            r19 = r2
            r20 = r3
            r18 = r5
            r21 = r7
            r34 = r10
            r17 = r12
            r32 = r13
        L_0x0345:
            com.google.android.gms.internal.ads.m3 r1 = r0.f8514j
            boolean r1 = r1.mo9119d(r4)
            if (r1 == 0) goto L_0x0370
            com.google.android.gms.internal.ads.m3 r1 = r0.f8514j
            byte[] r2 = r1.f10703d
            int r1 = r1.f10704e
            int r1 = com.google.android.gms.internal.ads.th2.m17269b(r2, r1)
            com.google.android.gms.internal.ads.dr2 r2 = r0.f8518n
            com.google.android.gms.internal.ads.m3 r3 = r0.f8514j
            byte[] r3 = r3.f10703d
            r2.mo6578d(r3, r1)
            com.google.android.gms.internal.ads.dr2 r1 = r0.f8518n
            r2 = 5
            r1.mo6581g(r2)
            com.google.android.gms.internal.ads.y3 r1 = r0.f8505a
            com.google.android.gms.internal.ads.dr2 r2 = r0.f8518n
            r5 = r32
            r1.mo11958a(r5, r2)
            goto L_0x0372
        L_0x0370:
            r5 = r32
        L_0x0372:
            com.google.android.gms.internal.ads.m3 r1 = r0.f8515k
            boolean r1 = r1.mo9119d(r4)
            if (r1 == 0) goto L_0x039a
            com.google.android.gms.internal.ads.m3 r1 = r0.f8515k
            byte[] r2 = r1.f10703d
            int r1 = r1.f10704e
            int r1 = com.google.android.gms.internal.ads.th2.m17269b(r2, r1)
            com.google.android.gms.internal.ads.dr2 r2 = r0.f8518n
            com.google.android.gms.internal.ads.m3 r3 = r0.f8515k
            byte[] r3 = r3.f10703d
            r2.mo6578d(r3, r1)
            com.google.android.gms.internal.ads.dr2 r1 = r0.f8518n
            r2 = 5
            r1.mo6581g(r2)
            com.google.android.gms.internal.ads.y3 r1 = r0.f8505a
            com.google.android.gms.internal.ads.dr2 r2 = r0.f8518n
            r1.mo11958a(r5, r2)
        L_0x039a:
            long r14 = r0.f8517m
            com.google.android.gms.internal.ads.h3 r9 = r0.f8508d
            boolean r1 = r0.f8509e
            r10 = r34
            r12 = r17
            r13 = r21
            r16 = r1
            r9.mo7837d(r10, r12, r13, r14, r16)
            boolean r1 = r0.f8509e
            if (r1 != 0) goto L_0x03c1
            com.google.android.gms.internal.ads.m3 r1 = r0.f8511g
            r2 = r21
            r1.mo9118c(r2)
            com.google.android.gms.internal.ads.m3 r1 = r0.f8512h
            r1.mo9118c(r2)
            com.google.android.gms.internal.ads.m3 r1 = r0.f8513i
            r1.mo9118c(r2)
            goto L_0x03c3
        L_0x03c1:
            r2 = r21
        L_0x03c3:
            com.google.android.gms.internal.ads.m3 r1 = r0.f8514j
            r1.mo9118c(r2)
            com.google.android.gms.internal.ads.m3 r1 = r0.f8515k
            r1.mo9118c(r2)
            r6 = r37
            r1 = r18
            r2 = r19
            r3 = r20
            goto L_0x0030
        L_0x03d7:
            r0.m10889f(r3, r1, r2)
        L_0x03da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1800i3.mo5638a(com.google.android.gms.internal.ads.dr2):void");
    }

    /* renamed from: b */
    public final void mo5639b() {
        this.f8516l = 0;
        this.f8517m = -9223372036854775807L;
        th2.m17272e(this.f8510f);
        this.f8511g.mo9117b();
        this.f8512h.mo9117b();
        this.f8513i.mo9117b();
        this.f8514j.mo9117b();
        this.f8515k.mo9117b();
        C1763h3 h3Var = this.f8508d;
        if (h3Var != null) {
            h3Var.mo7836c();
        }
    }

    /* renamed from: c */
    public final void mo5640c() {
    }

    /* renamed from: d */
    public final void mo5641d(rc4 rc4, C1875k4 k4Var) {
        k4Var.mo8612c();
        this.f8506b = k4Var.mo8611b();
        td4 r = rc4.mo10270r(k4Var.mo8610a(), 2);
        this.f8507c = r;
        this.f8508d = new C1763h3(r);
        this.f8505a.mo11959b(rc4, k4Var);
    }

    /* renamed from: e */
    public final void mo5642e(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f8517m = j;
        }
    }
}
