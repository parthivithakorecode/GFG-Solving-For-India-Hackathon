package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.google.android.gms.internal.ads.g3 */
public final class C1726g3 implements C2317w2 {

    /* renamed from: a */
    private final C2393y3 f7241a;

    /* renamed from: b */
    private final C1948m3 f7242b = new C1948m3(7, 128);

    /* renamed from: c */
    private final C1948m3 f7243c = new C1948m3(8, 128);

    /* renamed from: d */
    private final C1948m3 f7244d = new C1948m3(6, 128);

    /* renamed from: e */
    private long f7245e;

    /* renamed from: f */
    private final boolean[] f7246f = new boolean[3];

    /* renamed from: g */
    private String f7247g;

    /* renamed from: h */
    private td4 f7248h;

    /* renamed from: i */
    private C1651e3 f7249i;

    /* renamed from: j */
    private boolean f7250j;

    /* renamed from: k */
    private long f7251k = -9223372036854775807L;

    /* renamed from: l */
    private boolean f7252l;

    /* renamed from: m */
    private final dr2 f7253m = new dr2();

    public C1726g3(C2393y3 y3Var, boolean z, boolean z2) {
        this.f7241a = y3Var;
    }

    @RequiresNonNull({"sampleReader"})
    /* renamed from: f */
    private final void m9515f(byte[] bArr, int i, int i2) {
        if (!this.f7250j) {
            this.f7242b.mo9116a(bArr, i, i2);
            this.f7243c.mo9116a(bArr, i, i2);
        }
        this.f7244d.mo9116a(bArr, i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x017e A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5638a(com.google.android.gms.internal.ads.dr2 r20) {
        /*
            r19 = this;
            r0 = r19
            com.google.android.gms.internal.ads.td4 r1 = r0.f7248h
            com.google.android.gms.internal.ads.wu1.m19203b(r1)
            int r1 = com.google.android.gms.internal.ads.n13.f11236a
            int r1 = r20.mo6585k()
            int r2 = r20.mo6586l()
            byte[] r3 = r20.mo6582h()
            long r4 = r0.f7245e
            int r6 = r20.mo6583i()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f7245e = r4
            com.google.android.gms.internal.ads.td4 r4 = r0.f7248h
            int r5 = r20.mo6583i()
            r6 = r20
            com.google.android.gms.internal.ads.rd4.m16162b(r4, r6, r5)
        L_0x002a:
            boolean[] r4 = r0.f7246f
            int r4 = com.google.android.gms.internal.ads.th2.m17268a(r3, r1, r2, r4)
            if (r4 == r2) goto L_0x018e
            int r5 = r4 + 3
            byte r6 = r3[r5]
            r10 = r6 & 31
            int r6 = r4 - r1
            if (r6 <= 0) goto L_0x003f
            r0.m9515f(r3, r1, r4)
        L_0x003f:
            int r14 = r2 - r4
            long r7 = r0.f7245e
            long r11 = (long) r14
            long r8 = r7 - r11
            if (r6 >= 0) goto L_0x004a
            int r4 = -r6
            goto L_0x004b
        L_0x004a:
            r4 = 0
        L_0x004b:
            long r6 = r0.f7251k
            boolean r11 = r0.f7250j
            r12 = 4
            if (r11 == 0) goto L_0x0058
        L_0x0052:
            r18 = r2
            r17 = r5
            goto L_0x0134
        L_0x0058:
            com.google.android.gms.internal.ads.m3 r11 = r0.f7242b
            r11.mo9119d(r4)
            com.google.android.gms.internal.ads.m3 r11 = r0.f7243c
            r11.mo9119d(r4)
            boolean r11 = r0.f7250j
            if (r11 != 0) goto L_0x00f7
            com.google.android.gms.internal.ads.m3 r11 = r0.f7242b
            boolean r11 = r11.mo9120e()
            if (r11 == 0) goto L_0x0052
            com.google.android.gms.internal.ads.m3 r11 = r0.f7243c
            boolean r11 = r11.mo9120e()
            if (r11 == 0) goto L_0x0052
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            com.google.android.gms.internal.ads.m3 r13 = r0.f7242b
            byte[] r15 = r13.f10703d
            int r13 = r13.f10704e
            byte[] r13 = java.util.Arrays.copyOf(r15, r13)
            r11.add(r13)
            com.google.android.gms.internal.ads.m3 r13 = r0.f7243c
            byte[] r15 = r13.f10703d
            int r13 = r13.f10704e
            byte[] r13 = java.util.Arrays.copyOf(r15, r13)
            r11.add(r13)
            com.google.android.gms.internal.ads.m3 r13 = r0.f7242b
            byte[] r15 = r13.f10703d
            int r13 = r13.f10704e
            com.google.android.gms.internal.ads.sg2 r13 = com.google.android.gms.internal.ads.th2.m17271d(r15, r12, r13)
            com.google.android.gms.internal.ads.m3 r15 = r0.f7243c
            byte[] r1 = r15.f10703d
            int r15 = r15.f10704e
            com.google.android.gms.internal.ads.rf2 r1 = com.google.android.gms.internal.ads.th2.m17270c(r1, r12, r15)
            int r15 = r13.f14435a
            int r12 = r13.f14436b
            r17 = r5
            int r5 = r13.f14437c
            java.lang.String r5 = com.google.android.gms.internal.ads.zw1.m20865a(r15, r12, r5)
            com.google.android.gms.internal.ads.td4 r12 = r0.f7248h
            com.google.android.gms.internal.ads.bf4 r15 = new com.google.android.gms.internal.ads.bf4
            r15.<init>()
            r18 = r2
            java.lang.String r2 = r0.f7247g
            r15.mo5830h(r2)
            java.lang.String r2 = "video/avc"
            r15.mo5842s(r2)
            r15.mo5827f0(r5)
            int r2 = r13.f14439e
            r15.mo5847x(r2)
            int r2 = r13.f14440f
            r15.mo5826f(r2)
            float r2 = r13.f14441g
            r15.mo5839p(r2)
            r15.mo5832i(r11)
            com.google.android.gms.internal.ads.c0 r2 = r15.mo5848y()
            r12.mo7873b(r2)
            r2 = 1
            r0.f7250j = r2
            com.google.android.gms.internal.ads.e3 r2 = r0.f7249i
            r2.mo6780b(r13)
            com.google.android.gms.internal.ads.e3 r2 = r0.f7249i
            r2.mo6779a(r1)
            com.google.android.gms.internal.ads.m3 r1 = r0.f7242b
            r1.mo9117b()
            goto L_0x0131
        L_0x00f7:
            r18 = r2
            r17 = r5
            com.google.android.gms.internal.ads.m3 r1 = r0.f7242b
            boolean r1 = r1.mo9120e()
            if (r1 == 0) goto L_0x0119
            com.google.android.gms.internal.ads.m3 r1 = r0.f7242b
            byte[] r2 = r1.f10703d
            int r1 = r1.f10704e
            r5 = 4
            com.google.android.gms.internal.ads.sg2 r1 = com.google.android.gms.internal.ads.th2.m17271d(r2, r5, r1)
            com.google.android.gms.internal.ads.e3 r2 = r0.f7249i
            r2.mo6780b(r1)
            com.google.android.gms.internal.ads.m3 r1 = r0.f7242b
        L_0x0115:
            r1.mo9117b()
            goto L_0x0134
        L_0x0119:
            com.google.android.gms.internal.ads.m3 r1 = r0.f7243c
            boolean r1 = r1.mo9120e()
            if (r1 == 0) goto L_0x0134
            com.google.android.gms.internal.ads.m3 r1 = r0.f7243c
            byte[] r2 = r1.f10703d
            int r1 = r1.f10704e
            r5 = 4
            com.google.android.gms.internal.ads.rf2 r1 = com.google.android.gms.internal.ads.th2.m17270c(r2, r5, r1)
            com.google.android.gms.internal.ads.e3 r2 = r0.f7249i
            r2.mo6779a(r1)
        L_0x0131:
            com.google.android.gms.internal.ads.m3 r1 = r0.f7243c
            goto L_0x0115
        L_0x0134:
            com.google.android.gms.internal.ads.m3 r1 = r0.f7244d
            boolean r1 = r1.mo9119d(r4)
            if (r1 == 0) goto L_0x015c
            com.google.android.gms.internal.ads.m3 r1 = r0.f7244d
            byte[] r2 = r1.f10703d
            int r1 = r1.f10704e
            int r1 = com.google.android.gms.internal.ads.th2.m17269b(r2, r1)
            com.google.android.gms.internal.ads.dr2 r2 = r0.f7253m
            com.google.android.gms.internal.ads.m3 r4 = r0.f7244d
            byte[] r4 = r4.f10703d
            r2.mo6578d(r4, r1)
            com.google.android.gms.internal.ads.dr2 r1 = r0.f7253m
            r2 = 4
            r1.mo6580f(r2)
            com.google.android.gms.internal.ads.y3 r1 = r0.f7241a
            com.google.android.gms.internal.ads.dr2 r2 = r0.f7253m
            r1.mo11958a(r6, r2)
        L_0x015c:
            com.google.android.gms.internal.ads.e3 r11 = r0.f7249i
            boolean r15 = r0.f7250j
            boolean r1 = r0.f7252l
            r12 = r8
            r16 = r1
            boolean r1 = r11.mo6783e(r12, r14, r15, r16)
            if (r1 == 0) goto L_0x016e
            r1 = 0
            r0.f7252l = r1
        L_0x016e:
            long r11 = r0.f7251k
            boolean r1 = r0.f7250j
            if (r1 != 0) goto L_0x017e
            com.google.android.gms.internal.ads.m3 r1 = r0.f7242b
            r1.mo9118c(r10)
            com.google.android.gms.internal.ads.m3 r1 = r0.f7243c
            r1.mo9118c(r10)
        L_0x017e:
            com.google.android.gms.internal.ads.m3 r1 = r0.f7244d
            r1.mo9118c(r10)
            com.google.android.gms.internal.ads.e3 r7 = r0.f7249i
            r7.mo6782d(r8, r10, r11)
            r1 = r17
            r2 = r18
            goto L_0x002a
        L_0x018e:
            r0.m9515f(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1726g3.mo5638a(com.google.android.gms.internal.ads.dr2):void");
    }

    /* renamed from: b */
    public final void mo5639b() {
        this.f7245e = 0;
        this.f7252l = false;
        this.f7251k = -9223372036854775807L;
        th2.m17272e(this.f7246f);
        this.f7242b.mo9117b();
        this.f7243c.mo9117b();
        this.f7244d.mo9117b();
        C1651e3 e3Var = this.f7249i;
        if (e3Var != null) {
            e3Var.mo6781c();
        }
    }

    /* renamed from: c */
    public final void mo5640c() {
    }

    /* renamed from: d */
    public final void mo5641d(rc4 rc4, C1875k4 k4Var) {
        k4Var.mo8612c();
        this.f7247g = k4Var.mo8611b();
        td4 r = rc4.mo10270r(k4Var.mo8610a(), 2);
        this.f7248h = r;
        this.f7249i = new C1651e3(r, false, false);
        this.f7241a.mo11959b(rc4, k4Var);
    }

    /* renamed from: e */
    public final void mo5642e(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f7251k = j;
        }
        this.f7252l |= (i & 2) != 0;
    }
}
