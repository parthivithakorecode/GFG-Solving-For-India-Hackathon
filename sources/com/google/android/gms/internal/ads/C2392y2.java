package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.y2 */
public final class C2392y2 implements C2317w2 {

    /* renamed from: q */
    private static final double[] f17549q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    private String f17550a;

    /* renamed from: b */
    private td4 f17551b;

    /* renamed from: c */
    private final C1986n4 f17552c;

    /* renamed from: d */
    private final dr2 f17553d;

    /* renamed from: e */
    private final C1948m3 f17554e;

    /* renamed from: f */
    private final boolean[] f17555f = new boolean[4];

    /* renamed from: g */
    private final C2355x2 f17556g = new C2355x2(128);

    /* renamed from: h */
    private long f17557h;

    /* renamed from: i */
    private boolean f17558i;

    /* renamed from: j */
    private boolean f17559j;

    /* renamed from: k */
    private long f17560k;

    /* renamed from: l */
    private long f17561l;

    /* renamed from: m */
    private long f17562m;

    /* renamed from: n */
    private long f17563n;

    /* renamed from: o */
    private boolean f17564o;

    /* renamed from: p */
    private boolean f17565p;

    C2392y2(C1986n4 n4Var) {
        dr2 dr2;
        this.f17552c = n4Var;
        if (n4Var != null) {
            this.f17554e = new C1948m3(178, 128);
            dr2 = new dr2();
        } else {
            dr2 = null;
            this.f17554e = null;
        }
        this.f17553d = dr2;
        this.f17561l = -9223372036854775807L;
        this.f17563n = -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0187  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5638a(com.google.android.gms.internal.ads.dr2 r20) {
        /*
            r19 = this;
            r0 = r19
            com.google.android.gms.internal.ads.td4 r1 = r0.f17551b
            com.google.android.gms.internal.ads.wu1.m19203b(r1)
            int r1 = r20.mo6585k()
            int r2 = r20.mo6586l()
            byte[] r3 = r20.mo6582h()
            long r4 = r0.f17557h
            int r6 = r20.mo6583i()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f17557h = r4
            com.google.android.gms.internal.ads.td4 r4 = r0.f17551b
            int r5 = r20.mo6583i()
            r6 = r20
            com.google.android.gms.internal.ads.rd4.m16162b(r4, r6, r5)
        L_0x0028:
            boolean[] r4 = r0.f17555f
            int r4 = com.google.android.gms.internal.ads.th2.m17268a(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0041
            boolean r4 = r0.f17559j
            if (r4 != 0) goto L_0x0039
            com.google.android.gms.internal.ads.x2 r4 = r0.f17556g
            r4.mo11760a(r3, r1, r2)
        L_0x0039:
            com.google.android.gms.internal.ads.m3 r4 = r0.f17554e
            if (r4 == 0) goto L_0x0040
            r4.mo9116a(r3, r1, r2)
        L_0x0040:
            return
        L_0x0041:
            int r5 = r4 + 3
            byte[] r7 = r20.mo6582h()
            byte r7 = r7[r5]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.f17559j
            if (r9 != 0) goto L_0x012f
            if (r8 <= 0) goto L_0x0058
            com.google.android.gms.internal.ads.x2 r9 = r0.f17556g
            r9.mo11760a(r3, r1, r4)
        L_0x0058:
            if (r8 >= 0) goto L_0x005c
            int r9 = -r8
            goto L_0x005d
        L_0x005c:
            r9 = 0
        L_0x005d:
            com.google.android.gms.internal.ads.x2 r12 = r0.f17556g
            boolean r9 = r12.mo11762c(r7, r9)
            if (r9 == 0) goto L_0x012f
            com.google.android.gms.internal.ads.x2 r9 = r0.f17556g
            java.lang.String r12 = r0.f17550a
            java.util.Objects.requireNonNull(r12)
            byte[] r13 = r9.f16996d
            int r14 = r9.f16994b
            byte[] r13 = java.util.Arrays.copyOf(r13, r14)
            r14 = 4
            byte r15 = r13[r14]
            r16 = 5
            byte r10 = r13[r16]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r15 = r15 << r14
            int r17 = r10 >> 4
            r15 = r15 | r17
            r10 = r10 & 15
            r11 = 8
            int r10 = r10 << r11
            r18 = 6
            byte r11 = r13[r18]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r10 = r10 | r11
            r11 = 7
            byte r14 = r13[r11]
            r14 = r14 & 240(0xf0, float:3.36E-43)
            r11 = 4
            int r14 = r14 >> r11
            r11 = 2
            if (r14 == r11) goto L_0x00af
            r11 = 3
            if (r14 == r11) goto L_0x00a9
            r11 = 4
            if (r14 == r11) goto L_0x00a3
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00b6
        L_0x00a3:
            int r11 = r10 * 121
            float r11 = (float) r11
            int r14 = r15 * 100
            goto L_0x00b4
        L_0x00a9:
            int r11 = r10 * 16
            float r11 = (float) r11
            int r14 = r15 * 9
            goto L_0x00b4
        L_0x00af:
            int r11 = r10 * 4
            float r11 = (float) r11
            int r14 = r15 * 3
        L_0x00b4:
            float r14 = (float) r14
            float r11 = r11 / r14
        L_0x00b6:
            com.google.android.gms.internal.ads.bf4 r14 = new com.google.android.gms.internal.ads.bf4
            r14.<init>()
            r14.mo5830h(r12)
            java.lang.String r12 = "video/mpeg2"
            r14.mo5842s(r12)
            r14.mo5847x(r15)
            r14.mo5826f(r10)
            r14.mo5839p(r11)
            java.util.List r10 = java.util.Collections.singletonList(r13)
            r14.mo5832i(r10)
            com.google.android.gms.internal.ads.c0 r10 = r14.mo5848y()
            r11 = 7
            byte r11 = r13[r11]
            r11 = r11 & 15
            int r11 = r11 + -1
            r14 = 0
            if (r11 < 0) goto L_0x010e
            r12 = 8
            if (r11 >= r12) goto L_0x010e
            double[] r12 = f17549q
            r11 = r12[r11]
            int r9 = r9.f16995c
            int r9 = r9 + 9
            byte r9 = r13[r9]
            r13 = r9 & 96
            int r13 = r13 >> 5
            r9 = r9 & 31
            if (r13 == r9) goto L_0x0104
            double r13 = (double) r13
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r13 = r13 + r15
            int r9 = r9 + 1
            r16 = r5
            double r5 = (double) r9
            double r13 = r13 / r5
            double r11 = r11 * r13
            goto L_0x0106
        L_0x0104:
            r16 = r5
        L_0x0106:
            r5 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r5 = r5 / r11
            long r14 = (long) r5
            goto L_0x0110
        L_0x010e:
            r16 = r5
        L_0x0110:
            java.lang.Long r5 = java.lang.Long.valueOf(r14)
            android.util.Pair r5 = android.util.Pair.create(r10, r5)
            com.google.android.gms.internal.ads.td4 r6 = r0.f17551b
            java.lang.Object r9 = r5.first
            com.google.android.gms.internal.ads.c0 r9 = (com.google.android.gms.internal.ads.C1574c0) r9
            r6.mo7873b(r9)
            java.lang.Object r5 = r5.second
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r0.f17560k = r5
            r5 = 1
            r0.f17559j = r5
            goto L_0x0131
        L_0x012f:
            r16 = r5
        L_0x0131:
            com.google.android.gms.internal.ads.m3 r5 = r0.f17554e
            r6 = 178(0xb2, float:2.5E-43)
            if (r5 == 0) goto L_0x0178
            if (r8 <= 0) goto L_0x013e
            r5.mo9116a(r3, r1, r4)
            r1 = 0
            goto L_0x013f
        L_0x013e:
            int r1 = -r8
        L_0x013f:
            com.google.android.gms.internal.ads.m3 r5 = r0.f17554e
            boolean r1 = r5.mo9119d(r1)
            if (r1 == 0) goto L_0x0165
            com.google.android.gms.internal.ads.m3 r1 = r0.f17554e
            byte[] r5 = r1.f10703d
            int r1 = r1.f10704e
            int r1 = com.google.android.gms.internal.ads.th2.m17269b(r5, r1)
            com.google.android.gms.internal.ads.dr2 r5 = r0.f17553d
            int r8 = com.google.android.gms.internal.ads.n13.f11236a
            com.google.android.gms.internal.ads.m3 r8 = r0.f17554e
            byte[] r8 = r8.f10703d
            r5.mo6578d(r8, r1)
            com.google.android.gms.internal.ads.n4 r1 = r0.f17552c
            long r8 = r0.f17563n
            com.google.android.gms.internal.ads.dr2 r5 = r0.f17553d
            r1.mo9420a(r8, r5)
        L_0x0165:
            if (r7 != r6) goto L_0x0178
            byte[] r1 = r20.mo6582h()
            int r5 = r4 + 2
            byte r1 = r1[r5]
            r5 = 1
            if (r1 != r5) goto L_0x0177
            com.google.android.gms.internal.ads.m3 r1 = r0.f17554e
            r1.mo9118c(r6)
        L_0x0177:
            r7 = r6
        L_0x0178:
            if (r7 == 0) goto L_0x0187
            r1 = 179(0xb3, float:2.51E-43)
            if (r7 != r1) goto L_0x017f
            goto L_0x0187
        L_0x017f:
            r1 = 184(0xb8, float:2.58E-43)
            if (r7 != r1) goto L_0x01e2
            r1 = 1
            r0.f17564o = r1
            goto L_0x01e2
        L_0x0187:
            int r1 = r2 - r4
            boolean r4 = r0.f17565p
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x01ad
            boolean r4 = r0.f17559j
            if (r4 == 0) goto L_0x01ad
            long r9 = r0.f17563n
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x01ad
            boolean r11 = r0.f17564o
            long r12 = r0.f17557h
            long r14 = r0.f17562m
            com.google.android.gms.internal.ads.td4 r8 = r0.f17551b
            long r12 = r12 - r14
            int r4 = (int) r12
            int r12 = r4 - r1
            r14 = 0
            r13 = r1
            r8.mo7872a(r9, r11, r12, r13, r14)
        L_0x01ad:
            boolean r4 = r0.f17558i
            if (r4 == 0) goto L_0x01b9
            boolean r4 = r0.f17565p
            if (r4 == 0) goto L_0x01b6
            goto L_0x01b9
        L_0x01b6:
            r1 = 0
            r4 = 1
            goto L_0x01db
        L_0x01b9:
            long r8 = r0.f17557h
            long r10 = (long) r1
            long r8 = r8 - r10
            r0.f17562m = r8
            long r8 = r0.f17561l
            int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x01c6
            goto L_0x01d1
        L_0x01c6:
            long r8 = r0.f17563n
            int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x01d0
            long r10 = r0.f17560k
            long r8 = r8 + r10
            goto L_0x01d1
        L_0x01d0:
            r8 = r5
        L_0x01d1:
            r0.f17563n = r8
            r1 = 0
            r0.f17564o = r1
            r0.f17561l = r5
            r4 = 1
            r0.f17558i = r4
        L_0x01db:
            if (r7 != 0) goto L_0x01df
            r10 = r4
            goto L_0x01e0
        L_0x01df:
            r10 = r1
        L_0x01e0:
            r0.f17565p = r10
        L_0x01e2:
            r6 = r20
            r1 = r16
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2392y2.mo5638a(com.google.android.gms.internal.ads.dr2):void");
    }

    /* renamed from: b */
    public final void mo5639b() {
        th2.m17272e(this.f17555f);
        this.f17556g.mo11761b();
        C1948m3 m3Var = this.f17554e;
        if (m3Var != null) {
            m3Var.mo9117b();
        }
        this.f17557h = 0;
        this.f17558i = false;
        this.f17561l = -9223372036854775807L;
        this.f17563n = -9223372036854775807L;
    }

    /* renamed from: c */
    public final void mo5640c() {
    }

    /* renamed from: d */
    public final void mo5641d(rc4 rc4, C1875k4 k4Var) {
        k4Var.mo8612c();
        this.f17550a = k4Var.mo8611b();
        this.f17551b = rc4.mo10270r(k4Var.mo8610a(), 2);
        C1986n4 n4Var = this.f17552c;
        if (n4Var != null) {
            n4Var.mo9421b(rc4, k4Var);
        }
    }

    /* renamed from: e */
    public final void mo5642e(long j, int i) {
        this.f17561l = j;
    }
}
