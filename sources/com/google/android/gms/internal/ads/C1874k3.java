package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.k3 */
public final class C1874k3 implements C2317w2 {

    /* renamed from: a */
    private final String f9354a;

    /* renamed from: b */
    private final dr2 f9355b;

    /* renamed from: c */
    private final cq2 f9356c;

    /* renamed from: d */
    private td4 f9357d;

    /* renamed from: e */
    private String f9358e;

    /* renamed from: f */
    private C1574c0 f9359f;

    /* renamed from: g */
    private int f9360g;

    /* renamed from: h */
    private int f9361h;

    /* renamed from: i */
    private int f9362i;

    /* renamed from: j */
    private int f9363j;

    /* renamed from: k */
    private long f9364k = -9223372036854775807L;

    /* renamed from: l */
    private boolean f9365l;

    /* renamed from: m */
    private int f9366m;

    /* renamed from: n */
    private int f9367n;

    /* renamed from: o */
    private int f9368o;

    /* renamed from: p */
    private boolean f9369p;

    /* renamed from: q */
    private long f9370q;

    /* renamed from: r */
    private int f9371r;

    /* renamed from: s */
    private long f9372s;

    /* renamed from: t */
    private int f9373t;

    /* renamed from: u */
    private String f9374u;

    public C1874k3(String str) {
        this.f9354a = str;
        dr2 dr2 = new dr2(1024);
        this.f9355b = dr2;
        byte[] h = dr2.mo6582h();
        this.f9356c = new cq2(h, h.length);
    }

    /* renamed from: f */
    private final int m11976f(cq2 cq2) {
        int a = cq2.mo6260a();
        pb4 b = qb4.m15555b(cq2, true);
        this.f9374u = b.f12599c;
        this.f9371r = b.f12597a;
        this.f9373t = b.f12598b;
        return a - cq2.mo6260a();
    }

    /* renamed from: g */
    private static long m11977g(cq2 cq2) {
        return (long) cq2.mo6262c((cq2.mo6262c(2) + 1) * 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0154, code lost:
        if (r14.f9365l == false) goto L_0x020c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5638a(com.google.android.gms.internal.ads.dr2 r15) {
        /*
            r14 = this;
            com.google.android.gms.internal.ads.td4 r0 = r14.f9357d
            com.google.android.gms.internal.ads.wu1.m19203b(r0)
        L_0x0005:
            int r0 = r15.mo6583i()
            if (r0 <= 0) goto L_0x021a
            int r0 = r14.f9360g
            r1 = 86
            r2 = 1
            if (r0 == 0) goto L_0x0210
            r3 = 2
            r4 = 0
            if (r0 == r2) goto L_0x01fa
            r1 = 3
            r5 = 8
            if (r0 == r3) goto L_0x01cc
            int r0 = r15.mo6583i()
            int r3 = r14.f9362i
            int r6 = r14.f9361h
            int r3 = r3 - r6
            int r0 = java.lang.Math.min(r0, r3)
            com.google.android.gms.internal.ads.cq2 r3 = r14.f9356c
            byte[] r3 = r3.f5494a
            int r6 = r14.f9361h
            r15.mo6576b(r3, r6, r0)
            int r3 = r14.f9361h
            int r3 = r3 + r0
            r14.f9361h = r3
            int r0 = r14.f9362i
            if (r3 != r0) goto L_0x0005
            com.google.android.gms.internal.ads.cq2 r0 = r14.f9356c
            r0.mo6267h(r4)
            com.google.android.gms.internal.ads.cq2 r0 = r14.f9356c
            boolean r3 = r0.mo6271l()
            r6 = 0
            if (r3 != 0) goto L_0x0152
            r14.f9365l = r2
            int r3 = r0.mo6262c(r2)
            if (r3 != r2) goto L_0x0056
            int r3 = r0.mo6262c(r2)
            r7 = r2
            goto L_0x0058
        L_0x0056:
            r7 = r3
            r3 = r4
        L_0x0058:
            r14.f9366m = r3
            if (r3 != 0) goto L_0x014d
            if (r7 != r2) goto L_0x0062
            m11977g(r0)
            r7 = r2
        L_0x0062:
            boolean r3 = r0.mo6271l()
            if (r3 == 0) goto L_0x0148
            r3 = 6
            int r8 = r0.mo6262c(r3)
            r14.f9367n = r8
            r8 = 4
            int r9 = r0.mo6262c(r8)
            int r10 = r0.mo6262c(r1)
            if (r9 != 0) goto L_0x0143
            if (r10 != 0) goto L_0x0143
            if (r7 != 0) goto L_0x00d8
            int r9 = r0.mo6261b()
            int r10 = r14.m11976f(r0)
            r0.mo6267h(r9)
            int r9 = r10 + 7
            int r9 = r9 / r5
            byte[] r9 = new byte[r9]
            r0.mo6265f(r9, r4, r10)
            com.google.android.gms.internal.ads.bf4 r10 = new com.google.android.gms.internal.ads.bf4
            r10.<init>()
            java.lang.String r11 = r14.f9358e
            r10.mo5830h(r11)
            java.lang.String r11 = "audio/mp4a-latm"
            r10.mo5842s(r11)
            java.lang.String r11 = r14.f9374u
            r10.mo5827f0(r11)
            int r11 = r14.f9373t
            r10.mo5825e0(r11)
            int r11 = r14.f9371r
            r10.mo5843t(r11)
            java.util.List r9 = java.util.Collections.singletonList(r9)
            r10.mo5832i(r9)
            java.lang.String r9 = r14.f9354a
            r10.mo5834k(r9)
            com.google.android.gms.internal.ads.c0 r9 = r10.mo5848y()
            com.google.android.gms.internal.ads.c0 r10 = r14.f9359f
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L_0x00e5
            r14.f9359f = r9
            r10 = 1024000000(0x3d090000, double:5.059232213E-315)
            int r12 = r9.f5248z
            long r12 = (long) r12
            long r10 = r10 / r12
            r14.f9372s = r10
            com.google.android.gms.internal.ads.td4 r10 = r14.f9357d
            r10.mo7873b(r9)
            goto L_0x00e5
        L_0x00d8:
            long r9 = m11977g(r0)
            int r9 = (int) r9
            int r10 = r14.m11976f(r0)
            int r9 = r9 - r10
            r0.mo6269j(r9)
        L_0x00e5:
            int r9 = r0.mo6262c(r1)
            r14.f9368o = r9
            if (r9 == 0) goto L_0x0110
            if (r9 == r2) goto L_0x010a
            if (r9 == r1) goto L_0x0106
            if (r9 == r8) goto L_0x0106
            r1 = 5
            if (r9 == r1) goto L_0x0106
            if (r9 == r3) goto L_0x0102
            r1 = 7
            if (r9 != r1) goto L_0x00fc
            goto L_0x0102
        L_0x00fc:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>()
            throw r15
        L_0x0102:
            r0.mo6269j(r2)
            goto L_0x0113
        L_0x0106:
            r0.mo6269j(r3)
            goto L_0x0113
        L_0x010a:
            r1 = 9
            r0.mo6269j(r1)
            goto L_0x0113
        L_0x0110:
            r0.mo6269j(r5)
        L_0x0113:
            boolean r1 = r0.mo6271l()
            r14.f9369p = r1
            r8 = 0
            r14.f9370q = r8
            if (r1 == 0) goto L_0x0139
            if (r7 == r2) goto L_0x0133
        L_0x0121:
            boolean r1 = r0.mo6271l()
            long r2 = r14.f9370q
            long r2 = r2 << r5
            int r7 = r0.mo6262c(r5)
            long r7 = (long) r7
            long r2 = r2 + r7
            r14.f9370q = r2
            if (r1 != 0) goto L_0x0121
            goto L_0x0139
        L_0x0133:
            long r1 = m11977g(r0)
            r14.f9370q = r1
        L_0x0139:
            boolean r1 = r0.mo6271l()
            if (r1 == 0) goto L_0x0158
            r0.mo6269j(r5)
            goto L_0x0158
        L_0x0143:
            com.google.android.gms.internal.ads.dz r15 = com.google.android.gms.internal.ads.C1646dz.m8223a(r6, r6)
            throw r15
        L_0x0148:
            com.google.android.gms.internal.ads.dz r15 = com.google.android.gms.internal.ads.C1646dz.m8223a(r6, r6)
            throw r15
        L_0x014d:
            com.google.android.gms.internal.ads.dz r15 = com.google.android.gms.internal.ads.C1646dz.m8223a(r6, r6)
            throw r15
        L_0x0152:
            boolean r1 = r14.f9365l
            if (r1 != 0) goto L_0x0158
            goto L_0x020c
        L_0x0158:
            int r1 = r14.f9366m
            if (r1 != 0) goto L_0x01c7
            int r1 = r14.f9367n
            if (r1 != 0) goto L_0x01c2
            int r1 = r14.f9368o
            if (r1 != 0) goto L_0x01bd
            r1 = r4
        L_0x0165:
            int r2 = r0.mo6262c(r5)
            int r10 = r1 + r2
            r1 = 255(0xff, float:3.57E-43)
            if (r2 == r1) goto L_0x01bb
            int r1 = r0.mo6261b()
            r2 = r1 & 7
            if (r2 != 0) goto L_0x017f
            com.google.android.gms.internal.ads.dr2 r2 = r14.f9355b
            int r1 = r1 >> 3
            r2.mo6580f(r1)
            goto L_0x018f
        L_0x017f:
            com.google.android.gms.internal.ads.dr2 r1 = r14.f9355b
            byte[] r1 = r1.mo6582h()
            int r2 = r10 * 8
            r0.mo6265f(r1, r4, r2)
            com.google.android.gms.internal.ads.dr2 r1 = r14.f9355b
            r1.mo6580f(r4)
        L_0x018f:
            com.google.android.gms.internal.ads.td4 r1 = r14.f9357d
            com.google.android.gms.internal.ads.dr2 r2 = r14.f9355b
            com.google.android.gms.internal.ads.rd4.m16162b(r1, r2, r10)
            long r7 = r14.f9364k
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x01b0
            com.google.android.gms.internal.ads.td4 r6 = r14.f9357d
            r9 = 1
            r11 = 0
            r12 = 0
            r6.mo7872a(r7, r9, r10, r11, r12)
            long r1 = r14.f9364k
            long r5 = r14.f9372s
            long r1 = r1 + r5
            r14.f9364k = r1
        L_0x01b0:
            boolean r1 = r14.f9369p
            if (r1 == 0) goto L_0x020c
            long r1 = r14.f9370q
            int r1 = (int) r1
            r0.mo6269j(r1)
            goto L_0x020c
        L_0x01bb:
            r1 = r10
            goto L_0x0165
        L_0x01bd:
            com.google.android.gms.internal.ads.dz r15 = com.google.android.gms.internal.ads.C1646dz.m8223a(r6, r6)
            throw r15
        L_0x01c2:
            com.google.android.gms.internal.ads.dz r15 = com.google.android.gms.internal.ads.C1646dz.m8223a(r6, r6)
            throw r15
        L_0x01c7:
            com.google.android.gms.internal.ads.dz r15 = com.google.android.gms.internal.ads.C1646dz.m8223a(r6, r6)
            throw r15
        L_0x01cc:
            int r0 = r14.f9363j
            r0 = r0 & -225(0xffffffffffffff1f, float:NaN)
            int r0 = r0 << r5
            int r2 = r15.mo6593s()
            r0 = r0 | r2
            r14.f9362i = r0
            com.google.android.gms.internal.ads.dr2 r2 = r14.f9355b
            byte[] r2 = r2.mo6582h()
            int r2 = r2.length
            if (r0 <= r2) goto L_0x01f4
            int r0 = r14.f9362i
            com.google.android.gms.internal.ads.dr2 r2 = r14.f9355b
            r2.mo6577c(r0)
            com.google.android.gms.internal.ads.cq2 r0 = r14.f9356c
            com.google.android.gms.internal.ads.dr2 r2 = r14.f9355b
            byte[] r2 = r2.mo6582h()
            int r3 = r2.length
            r0.mo6266g(r2, r3)
        L_0x01f4:
            r14.f9361h = r4
            r14.f9360g = r1
            goto L_0x0005
        L_0x01fa:
            int r0 = r15.mo6593s()
            r2 = r0 & 224(0xe0, float:3.14E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r2 != r5) goto L_0x020a
            r14.f9363j = r0
            r14.f9360g = r3
            goto L_0x0005
        L_0x020a:
            if (r0 == r1) goto L_0x0005
        L_0x020c:
            r14.f9360g = r4
            goto L_0x0005
        L_0x0210:
            int r0 = r15.mo6593s()
            if (r0 != r1) goto L_0x0005
            r14.f9360g = r2
            goto L_0x0005
        L_0x021a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1874k3.mo5638a(com.google.android.gms.internal.ads.dr2):void");
    }

    /* renamed from: b */
    public final void mo5639b() {
        this.f9360g = 0;
        this.f9364k = -9223372036854775807L;
        this.f9365l = false;
    }

    /* renamed from: c */
    public final void mo5640c() {
    }

    /* renamed from: d */
    public final void mo5641d(rc4 rc4, C1875k4 k4Var) {
        k4Var.mo8612c();
        this.f9357d = rc4.mo10270r(k4Var.mo8610a(), 1);
        this.f9358e = k4Var.mo8611b();
    }

    /* renamed from: e */
    public final void mo5642e(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f9364k = j;
        }
    }
}
