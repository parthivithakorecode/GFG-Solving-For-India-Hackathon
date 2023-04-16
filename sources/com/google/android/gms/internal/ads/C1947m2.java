package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.m2 */
public final class C1947m2 implements C2317w2 {

    /* renamed from: a */
    private final cq2 f10668a;

    /* renamed from: b */
    private final dr2 f10669b;

    /* renamed from: c */
    private final String f10670c;

    /* renamed from: d */
    private String f10671d;

    /* renamed from: e */
    private td4 f10672e;

    /* renamed from: f */
    private int f10673f = 0;

    /* renamed from: g */
    private int f10674g;

    /* renamed from: h */
    private boolean f10675h;

    /* renamed from: i */
    private long f10676i;

    /* renamed from: j */
    private C1574c0 f10677j;

    /* renamed from: k */
    private int f10678k;

    /* renamed from: l */
    private long f10679l = -9223372036854775807L;

    public C1947m2(String str) {
        cq2 cq2 = new cq2(new byte[128], 128);
        this.f10668a = cq2;
        this.f10669b = new dr2(cq2.f5494a);
        this.f10670c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ed, code lost:
        if (r12.mo6593s() == 11) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f1, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0115, code lost:
        if (r0 == 11) goto L_0x00ef;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5638a(com.google.android.gms.internal.ads.dr2 r12) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.td4 r0 = r11.f10672e
            com.google.android.gms.internal.ads.wu1.m19203b(r0)
        L_0x0005:
            int r0 = r12.mo6583i()
            if (r0 <= 0) goto L_0x0118
            int r0 = r11.f10673f
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x00dd
            if (r0 == r2) goto L_0x004c
            int r0 = r12.mo6583i()
            int r1 = r11.f10678k
            int r2 = r11.f10674g
            int r1 = r1 - r2
            int r0 = java.lang.Math.min(r0, r1)
            com.google.android.gms.internal.ads.td4 r1 = r11.f10672e
            com.google.android.gms.internal.ads.rd4.m16162b(r1, r12, r0)
            int r1 = r11.f10674g
            int r1 = r1 + r0
            r11.f10674g = r1
            int r8 = r11.f10678k
            if (r1 != r8) goto L_0x0005
            long r5 = r11.f10679l
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0049
            com.google.android.gms.internal.ads.td4 r4 = r11.f10672e
            r7 = 1
            r9 = 0
            r10 = 0
            r4.mo7872a(r5, r7, r8, r9, r10)
            long r0 = r11.f10679l
            long r4 = r11.f10676i
            long r0 = r0 + r4
            r11.f10679l = r0
        L_0x0049:
            r11.f10673f = r3
            goto L_0x0005
        L_0x004c:
            com.google.android.gms.internal.ads.dr2 r0 = r11.f10669b
            byte[] r0 = r0.mo6582h()
            int r2 = r12.mo6583i()
            int r4 = r11.f10674g
            r5 = 128(0x80, float:1.794E-43)
            int r4 = 128 - r4
            int r2 = java.lang.Math.min(r2, r4)
            int r4 = r11.f10674g
            r12.mo6576b(r0, r4, r2)
            int r0 = r11.f10674g
            int r0 = r0 + r2
            r11.f10674g = r0
            if (r0 != r5) goto L_0x0005
            com.google.android.gms.internal.ads.cq2 r0 = r11.f10668a
            r0.mo6267h(r3)
            com.google.android.gms.internal.ads.cq2 r0 = r11.f10668a
            com.google.android.gms.internal.ads.sb4 r0 = com.google.android.gms.internal.ads.tb4.m17206d(r0)
            com.google.android.gms.internal.ads.c0 r2 = r11.f10677j
            if (r2 == 0) goto L_0x0091
            int r4 = r0.f14399c
            int r6 = r2.f5247y
            if (r4 != r6) goto L_0x0091
            int r4 = r0.f14398b
            int r6 = r2.f5248z
            if (r4 != r6) goto L_0x0091
            java.lang.String r4 = r0.f14397a
            java.lang.String r2 = r2.f5234l
            boolean r2 = com.google.android.gms.internal.ads.n13.m13643p(r4, r2)
            if (r2 != 0) goto L_0x00ba
        L_0x0091:
            com.google.android.gms.internal.ads.bf4 r2 = new com.google.android.gms.internal.ads.bf4
            r2.<init>()
            java.lang.String r4 = r11.f10671d
            r2.mo5830h(r4)
            java.lang.String r4 = r0.f14397a
            r2.mo5842s(r4)
            int r4 = r0.f14399c
            r2.mo5825e0(r4)
            int r4 = r0.f14398b
            r2.mo5843t(r4)
            java.lang.String r4 = r11.f10670c
            r2.mo5834k(r4)
            com.google.android.gms.internal.ads.c0 r2 = r2.mo5848y()
            r11.f10677j = r2
            com.google.android.gms.internal.ads.td4 r4 = r11.f10672e
            r4.mo7873b(r2)
        L_0x00ba:
            int r2 = r0.f14400d
            r11.f10678k = r2
            int r0 = r0.f14401e
            long r6 = (long) r0
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 * r8
            com.google.android.gms.internal.ads.c0 r0 = r11.f10677j
            int r0 = r0.f5248z
            long r8 = (long) r0
            long r6 = r6 / r8
            r11.f10676i = r6
            com.google.android.gms.internal.ads.dr2 r0 = r11.f10669b
            r0.mo6580f(r3)
            com.google.android.gms.internal.ads.td4 r0 = r11.f10672e
            com.google.android.gms.internal.ads.dr2 r2 = r11.f10669b
            com.google.android.gms.internal.ads.rd4.m16162b(r0, r2, r5)
            r11.f10673f = r1
            goto L_0x0005
        L_0x00dd:
            int r0 = r12.mo6583i()
            if (r0 <= 0) goto L_0x0005
            boolean r0 = r11.f10675h
            r4 = 11
            if (r0 != 0) goto L_0x00f5
            int r0 = r12.mo6593s()
            if (r0 != r4) goto L_0x00f1
        L_0x00ef:
            r0 = r2
            goto L_0x00f2
        L_0x00f1:
            r0 = r3
        L_0x00f2:
            r11.f10675h = r0
            goto L_0x00dd
        L_0x00f5:
            int r0 = r12.mo6593s()
            r5 = 119(0x77, float:1.67E-43)
            if (r0 != r5) goto L_0x0115
            r11.f10675h = r3
            r11.f10673f = r2
            com.google.android.gms.internal.ads.dr2 r0 = r11.f10669b
            byte[] r0 = r0.mo6582h()
            r0[r3] = r4
            com.google.android.gms.internal.ads.dr2 r0 = r11.f10669b
            byte[] r0 = r0.mo6582h()
            r0[r2] = r5
            r11.f10674g = r1
            goto L_0x0005
        L_0x0115:
            if (r0 != r4) goto L_0x00f1
            goto L_0x00ef
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1947m2.mo5638a(com.google.android.gms.internal.ads.dr2):void");
    }

    /* renamed from: b */
    public final void mo5639b() {
        this.f10673f = 0;
        this.f10674g = 0;
        this.f10675h = false;
        this.f10679l = -9223372036854775807L;
    }

    /* renamed from: c */
    public final void mo5640c() {
    }

    /* renamed from: d */
    public final void mo5641d(rc4 rc4, C1875k4 k4Var) {
        k4Var.mo8612c();
        this.f10671d = k4Var.mo8611b();
        this.f10672e = rc4.mo10270r(k4Var.mo8610a(), 1);
    }

    /* renamed from: e */
    public final void mo5642e(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f10679l = j;
        }
    }
}
