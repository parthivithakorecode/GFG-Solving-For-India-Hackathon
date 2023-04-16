package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.p2 */
public final class C2058p2 implements C2317w2 {

    /* renamed from: a */
    private final cq2 f12428a;

    /* renamed from: b */
    private final dr2 f12429b;

    /* renamed from: c */
    private final String f12430c;

    /* renamed from: d */
    private String f12431d;

    /* renamed from: e */
    private td4 f12432e;

    /* renamed from: f */
    private int f12433f = 0;

    /* renamed from: g */
    private int f12434g = 0;

    /* renamed from: h */
    private boolean f12435h = false;

    /* renamed from: i */
    private boolean f12436i = false;

    /* renamed from: j */
    private long f12437j;

    /* renamed from: k */
    private C1574c0 f12438k;

    /* renamed from: l */
    private int f12439l;

    /* renamed from: m */
    private long f12440m = -9223372036854775807L;

    public C2058p2(String str) {
        cq2 cq2 = new cq2(new byte[16], 16);
        this.f12428a = cq2;
        this.f12429b = new dr2(cq2.f5494a);
        this.f12430c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0107, code lost:
        r0 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5638a(com.google.android.gms.internal.ads.dr2 r11) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.td4 r0 = r10.f12432e
            com.google.android.gms.internal.ads.wu1.m19203b(r0)
        L_0x0005:
            int r0 = r11.mo6583i()
            if (r0 <= 0) goto L_0x0128
            int r0 = r10.f12433f
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x00d7
            if (r0 == r3) goto L_0x004c
            int r0 = r11.mo6583i()
            int r1 = r10.f12439l
            int r3 = r10.f12434g
            int r1 = r1 - r3
            int r0 = java.lang.Math.min(r0, r1)
            com.google.android.gms.internal.ads.td4 r1 = r10.f12432e
            com.google.android.gms.internal.ads.rd4.m16162b(r1, r11, r0)
            int r1 = r10.f12434g
            int r1 = r1 + r0
            r10.f12434g = r1
            int r7 = r10.f12439l
            if (r1 != r7) goto L_0x0005
            long r4 = r10.f12440m
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0049
            com.google.android.gms.internal.ads.td4 r3 = r10.f12432e
            r6 = 1
            r8 = 0
            r9 = 0
            r3.mo7872a(r4, r6, r7, r8, r9)
            long r0 = r10.f12440m
            long r3 = r10.f12437j
            long r0 = r0 + r3
            r10.f12440m = r0
        L_0x0049:
            r10.f12433f = r2
            goto L_0x0005
        L_0x004c:
            com.google.android.gms.internal.ads.dr2 r0 = r10.f12429b
            byte[] r0 = r0.mo6582h()
            int r3 = r11.mo6583i()
            int r4 = r10.f12434g
            r5 = 16
            int r4 = 16 - r4
            int r3 = java.lang.Math.min(r3, r4)
            int r4 = r10.f12434g
            r11.mo6576b(r0, r4, r3)
            int r0 = r10.f12434g
            int r0 = r0 + r3
            r10.f12434g = r0
            if (r0 != r5) goto L_0x0005
            com.google.android.gms.internal.ads.cq2 r0 = r10.f12428a
            r0.mo6267h(r2)
            com.google.android.gms.internal.ads.cq2 r0 = r10.f12428a
            com.google.android.gms.internal.ads.vb4 r0 = com.google.android.gms.internal.ads.wb4.m18953a(r0)
            com.google.android.gms.internal.ads.c0 r3 = r10.f12438k
            java.lang.String r4 = "audio/ac4"
            if (r3 == 0) goto L_0x008f
            int r6 = r3.f5247y
            if (r6 != r1) goto L_0x008f
            int r6 = r0.f16158a
            int r7 = r3.f5248z
            if (r6 != r7) goto L_0x008f
            java.lang.String r3 = r3.f5234l
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x00b4
        L_0x008f:
            com.google.android.gms.internal.ads.bf4 r3 = new com.google.android.gms.internal.ads.bf4
            r3.<init>()
            java.lang.String r6 = r10.f12431d
            r3.mo5830h(r6)
            r3.mo5842s(r4)
            r3.mo5825e0(r1)
            int r4 = r0.f16158a
            r3.mo5843t(r4)
            java.lang.String r4 = r10.f12430c
            r3.mo5834k(r4)
            com.google.android.gms.internal.ads.c0 r3 = r3.mo5848y()
            r10.f12438k = r3
            com.google.android.gms.internal.ads.td4 r4 = r10.f12432e
            r4.mo7873b(r3)
        L_0x00b4:
            int r3 = r0.f16159b
            r10.f12439l = r3
            int r0 = r0.f16160c
            long r3 = (long) r0
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r6
            com.google.android.gms.internal.ads.c0 r0 = r10.f12438k
            int r0 = r0.f5248z
            long r6 = (long) r0
            long r3 = r3 / r6
            r10.f12437j = r3
            com.google.android.gms.internal.ads.dr2 r0 = r10.f12429b
            r0.mo6580f(r2)
            com.google.android.gms.internal.ads.td4 r0 = r10.f12432e
            com.google.android.gms.internal.ads.dr2 r2 = r10.f12429b
            com.google.android.gms.internal.ads.rd4.m16162b(r0, r2, r5)
            r10.f12433f = r1
            goto L_0x0005
        L_0x00d7:
            int r0 = r11.mo6583i()
            if (r0 <= 0) goto L_0x0005
            boolean r0 = r10.f12435h
            r4 = 172(0xac, float:2.41E-43)
            if (r0 != 0) goto L_0x00ef
            int r0 = r11.mo6593s()
            if (r0 != r4) goto L_0x00eb
            r0 = r3
            goto L_0x00ec
        L_0x00eb:
            r0 = r2
        L_0x00ec:
            r10.f12435h = r0
            goto L_0x00d7
        L_0x00ef:
            int r0 = r11.mo6593s()
            if (r0 != r4) goto L_0x00f7
            r4 = r3
            goto L_0x00f8
        L_0x00f7:
            r4 = r2
        L_0x00f8:
            r10.f12435h = r4
            r4 = 64
            r5 = 65
            if (r0 == r4) goto L_0x0103
            if (r0 != r5) goto L_0x00d7
            goto L_0x0107
        L_0x0103:
            if (r0 == r5) goto L_0x0107
            r0 = r2
            goto L_0x0108
        L_0x0107:
            r0 = r3
        L_0x0108:
            r10.f12436i = r0
            r10.f12433f = r3
            com.google.android.gms.internal.ads.dr2 r0 = r10.f12429b
            byte[] r0 = r0.mo6582h()
            r6 = -84
            r0[r2] = r6
            com.google.android.gms.internal.ads.dr2 r0 = r10.f12429b
            byte[] r0 = r0.mo6582h()
            boolean r2 = r10.f12436i
            if (r3 == r2) goto L_0x0121
            goto L_0x0122
        L_0x0121:
            r4 = r5
        L_0x0122:
            r0[r3] = r4
            r10.f12434g = r1
            goto L_0x0005
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2058p2.mo5638a(com.google.android.gms.internal.ads.dr2):void");
    }

    /* renamed from: b */
    public final void mo5639b() {
        this.f12433f = 0;
        this.f12434g = 0;
        this.f12435h = false;
        this.f12436i = false;
        this.f12440m = -9223372036854775807L;
    }

    /* renamed from: c */
    public final void mo5640c() {
    }

    /* renamed from: d */
    public final void mo5641d(rc4 rc4, C1875k4 k4Var) {
        k4Var.mo8612c();
        this.f12431d = k4Var.mo8611b();
        this.f12432e = rc4.mo10270r(k4Var.mo8610a(), 1);
    }

    /* renamed from: e */
    public final void mo5642e(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f12440m = j;
        }
    }
}
