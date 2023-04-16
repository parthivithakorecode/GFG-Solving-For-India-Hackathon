package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.b3 */
public final class C1540b3 implements C2317w2 {

    /* renamed from: l */
    private static final float[] f4647l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a */
    private final C1986n4 f4648a;

    /* renamed from: b */
    private final dr2 f4649b = new dr2();

    /* renamed from: c */
    private final boolean[] f4650c = new boolean[4];

    /* renamed from: d */
    private final C2429z2 f4651d = new C2429z2(128);

    /* renamed from: e */
    private final C1948m3 f4652e = new C1948m3(178, 128);

    /* renamed from: f */
    private C1503a3 f4653f;

    /* renamed from: g */
    private long f4654g;

    /* renamed from: h */
    private String f4655h;

    /* renamed from: i */
    private td4 f4656i;

    /* renamed from: j */
    private boolean f4657j;

    /* renamed from: k */
    private long f4658k = -9223372036854775807L;

    C1540b3(C1986n4 n4Var) {
        this.f4648a = n4Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01ca A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5638a(com.google.android.gms.internal.ads.dr2 r19) {
        /*
            r18 = this;
            r0 = r18
            com.google.android.gms.internal.ads.a3 r1 = r0.f4653f
            com.google.android.gms.internal.ads.wu1.m19203b(r1)
            com.google.android.gms.internal.ads.td4 r1 = r0.f4656i
            com.google.android.gms.internal.ads.wu1.m19203b(r1)
            int r1 = r19.mo6585k()
            int r2 = r19.mo6586l()
            byte[] r3 = r19.mo6582h()
            long r4 = r0.f4654g
            int r6 = r19.mo6583i()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f4654g = r4
            com.google.android.gms.internal.ads.td4 r4 = r0.f4656i
            int r5 = r19.mo6583i()
            r6 = r19
            com.google.android.gms.internal.ads.rd4.m16162b(r4, r6, r5)
        L_0x002d:
            boolean[] r4 = r0.f4650c
            int r4 = com.google.android.gms.internal.ads.th2.m17268a(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0049
            boolean r4 = r0.f4657j
            if (r4 != 0) goto L_0x003e
            com.google.android.gms.internal.ads.z2 r4 = r0.f4651d
            r4.mo12131a(r3, r1, r2)
        L_0x003e:
            com.google.android.gms.internal.ads.a3 r4 = r0.f4653f
            r4.mo5076a(r3, r1, r2)
            com.google.android.gms.internal.ads.m3 r4 = r0.f4652e
            r4.mo9116a(r3, r1, r2)
            return
        L_0x0049:
            int r5 = r4 + 3
            byte[] r7 = r19.mo6582h()
            byte r7 = r7[r5]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.f4657j
            if (r9 != 0) goto L_0x017e
            if (r8 <= 0) goto L_0x0060
            com.google.android.gms.internal.ads.z2 r9 = r0.f4651d
            r9.mo12131a(r3, r1, r4)
        L_0x0060:
            if (r8 >= 0) goto L_0x0064
            int r9 = -r8
            goto L_0x0065
        L_0x0064:
            r9 = 0
        L_0x0065:
            com.google.android.gms.internal.ads.z2 r12 = r0.f4651d
            boolean r9 = r12.mo12133c(r7, r9)
            if (r9 == 0) goto L_0x017e
            com.google.android.gms.internal.ads.td4 r9 = r0.f4656i
            com.google.android.gms.internal.ads.z2 r12 = r0.f4651d
            int r13 = r12.f17979d
            java.lang.String r14 = r0.f4655h
            java.util.Objects.requireNonNull(r14)
            byte[] r15 = r12.f17980e
            int r12 = r12.f17978c
            byte[] r12 = java.util.Arrays.copyOf(r15, r12)
            com.google.android.gms.internal.ads.cq2 r15 = new com.google.android.gms.internal.ads.cq2
            int r10 = r12.length
            r15.<init>(r12, r10)
            r15.mo6270k(r13)
            r10 = 4
            r15.mo6270k(r10)
            r15.mo6268i()
            r13 = 8
            r15.mo6269j(r13)
            boolean r16 = r15.mo6271l()
            r11 = 3
            if (r16 == 0) goto L_0x00a2
            r15.mo6269j(r10)
            r15.mo6269j(r11)
        L_0x00a2:
            int r10 = r15.mo6262c(r10)
            r16 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r11 = "Invalid aspect ratio"
            java.lang.String r13 = "H263Reader"
            r17 = r5
            r5 = 15
            if (r10 != r5) goto L_0x00c4
            r5 = 8
            int r10 = r15.mo6262c(r5)
            int r5 = r15.mo6262c(r5)
            if (r5 != 0) goto L_0x00bf
            goto L_0x00cc
        L_0x00bf:
            float r10 = (float) r10
            float r5 = (float) r5
            float r16 = r10 / r5
            goto L_0x00cf
        L_0x00c4:
            r5 = 7
            if (r10 >= r5) goto L_0x00cc
            float[] r5 = f4647l
            r16 = r5[r10]
            goto L_0x00cf
        L_0x00cc:
            android.util.Log.w(r13, r11)
        L_0x00cf:
            r5 = r16
            boolean r10 = r15.mo6271l()
            r11 = 2
            if (r10 == 0) goto L_0x010d
            r15.mo6269j(r11)
            r10 = 1
            r15.mo6269j(r10)
            boolean r10 = r15.mo6271l()
            if (r10 == 0) goto L_0x010d
            r10 = 15
            r15.mo6269j(r10)
            r15.mo6268i()
            r15.mo6269j(r10)
            r15.mo6268i()
            r15.mo6269j(r10)
            r15.mo6268i()
            r11 = 3
            r15.mo6269j(r11)
            r11 = 11
            r15.mo6269j(r11)
            r15.mo6268i()
            r15.mo6269j(r10)
            r15.mo6268i()
            r10 = 2
            goto L_0x010e
        L_0x010d:
            r10 = r11
        L_0x010e:
            int r10 = r15.mo6262c(r10)
            if (r10 == 0) goto L_0x0119
            java.lang.String r10 = "Unhandled video object layer shape"
            android.util.Log.w(r13, r10)
        L_0x0119:
            r15.mo6268i()
            r10 = 16
            int r10 = r15.mo6262c(r10)
            r15.mo6268i()
            boolean r11 = r15.mo6271l()
            if (r11 == 0) goto L_0x0140
            if (r10 != 0) goto L_0x0133
            java.lang.String r10 = "Invalid vop_increment_time_resolution"
            android.util.Log.w(r13, r10)
            goto L_0x0140
        L_0x0133:
            int r10 = r10 + -1
            r11 = 0
        L_0x0136:
            if (r10 <= 0) goto L_0x013d
            int r11 = r11 + 1
            int r10 = r10 >> 1
            goto L_0x0136
        L_0x013d:
            r15.mo6269j(r11)
        L_0x0140:
            r15.mo6268i()
            r10 = 13
            int r11 = r15.mo6262c(r10)
            r15.mo6268i()
            int r10 = r15.mo6262c(r10)
            r15.mo6268i()
            r15.mo6268i()
            com.google.android.gms.internal.ads.bf4 r13 = new com.google.android.gms.internal.ads.bf4
            r13.<init>()
            r13.mo5830h(r14)
            java.lang.String r14 = "video/mp4v-es"
            r13.mo5842s(r14)
            r13.mo5847x(r11)
            r13.mo5826f(r10)
            r13.mo5839p(r5)
            java.util.List r5 = java.util.Collections.singletonList(r12)
            r13.mo5832i(r5)
            com.google.android.gms.internal.ads.c0 r5 = r13.mo5848y()
            r9.mo7873b(r5)
            r5 = 1
            r0.f4657j = r5
            goto L_0x0180
        L_0x017e:
            r17 = r5
        L_0x0180:
            com.google.android.gms.internal.ads.a3 r5 = r0.f4653f
            r5.mo5076a(r3, r1, r4)
            com.google.android.gms.internal.ads.m3 r5 = r0.f4652e
            if (r8 <= 0) goto L_0x018e
            r5.mo9116a(r3, r1, r4)
            r10 = 0
            goto L_0x018f
        L_0x018e:
            int r10 = -r8
        L_0x018f:
            com.google.android.gms.internal.ads.m3 r1 = r0.f4652e
            boolean r1 = r1.mo9119d(r10)
            if (r1 == 0) goto L_0x01b5
            com.google.android.gms.internal.ads.m3 r1 = r0.f4652e
            byte[] r5 = r1.f10703d
            int r1 = r1.f10704e
            int r1 = com.google.android.gms.internal.ads.th2.m17269b(r5, r1)
            com.google.android.gms.internal.ads.dr2 r5 = r0.f4649b
            int r8 = com.google.android.gms.internal.ads.n13.f11236a
            com.google.android.gms.internal.ads.m3 r8 = r0.f4652e
            byte[] r8 = r8.f10703d
            r5.mo6578d(r8, r1)
            com.google.android.gms.internal.ads.n4 r1 = r0.f4648a
            long r8 = r0.f4658k
            com.google.android.gms.internal.ads.dr2 r5 = r0.f4649b
            r1.mo9420a(r8, r5)
        L_0x01b5:
            r1 = 178(0xb2, float:2.5E-43)
            if (r7 != r1) goto L_0x01ca
            byte[] r5 = r19.mo6582h()
            int r7 = r4 + 2
            byte r5 = r5[r7]
            r7 = 1
            if (r5 != r7) goto L_0x01c9
            com.google.android.gms.internal.ads.m3 r5 = r0.f4652e
            r5.mo9118c(r1)
        L_0x01c9:
            r7 = r1
        L_0x01ca:
            int r1 = r2 - r4
            long r4 = r0.f4654g
            com.google.android.gms.internal.ads.a3 r8 = r0.f4653f
            long r9 = (long) r1
            long r4 = r4 - r9
            boolean r9 = r0.f4657j
            r8.mo5077b(r4, r1, r9)
            com.google.android.gms.internal.ads.a3 r1 = r0.f4653f
            long r4 = r0.f4658k
            r1.mo5078c(r7, r4)
            r1 = r17
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1540b3.mo5638a(com.google.android.gms.internal.ads.dr2):void");
    }

    /* renamed from: b */
    public final void mo5639b() {
        th2.m17272e(this.f4650c);
        this.f4651d.mo12132b();
        C1503a3 a3Var = this.f4653f;
        if (a3Var != null) {
            a3Var.mo5079d();
        }
        this.f4652e.mo9117b();
        this.f4654g = 0;
        this.f4658k = -9223372036854775807L;
    }

    /* renamed from: c */
    public final void mo5640c() {
    }

    /* renamed from: d */
    public final void mo5641d(rc4 rc4, C1875k4 k4Var) {
        k4Var.mo8612c();
        this.f4655h = k4Var.mo8611b();
        td4 r = rc4.mo10270r(k4Var.mo8610a(), 2);
        this.f4656i = r;
        this.f4653f = new C1503a3(r);
        this.f4648a.mo9421b(rc4, k4Var);
    }

    /* renamed from: e */
    public final void mo5642e(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f4658k = j;
        }
    }
}
