package com.google.android.gms.internal.ads;

import p038f.C2591j;

/* renamed from: com.google.android.gms.internal.ads.p4 */
final class C2060p4 implements C2097q4 {

    /* renamed from: m */
    private static final int[] f12504m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n */
    private static final int[] f12505n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, C2591j.f18719E0, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a */
    private final rc4 f12506a;

    /* renamed from: b */
    private final td4 f12507b;

    /* renamed from: c */
    private final C2208t4 f12508c;

    /* renamed from: d */
    private final int f12509d;

    /* renamed from: e */
    private final byte[] f12510e;

    /* renamed from: f */
    private final dr2 f12511f;

    /* renamed from: g */
    private final int f12512g;

    /* renamed from: h */
    private final C1574c0 f12513h;

    /* renamed from: i */
    private int f12514i;

    /* renamed from: j */
    private long f12515j;

    /* renamed from: k */
    private int f12516k;

    /* renamed from: l */
    private long f12517l;

    public C2060p4(rc4 rc4, td4 td4, C2208t4 t4Var) {
        this.f12506a = rc4;
        this.f12507b = td4;
        this.f12508c = t4Var;
        int max = Math.max(1, t4Var.f14698c / 10);
        this.f12512g = max;
        dr2 dr2 = new dr2(t4Var.f14701f);
        dr2.mo6591q();
        int q = dr2.mo6591q();
        this.f12509d = q;
        int i = t4Var.f14697b;
        int i2 = (((t4Var.f14699d - (i * 4)) * 8) / (t4Var.f14700e * i)) + 1;
        if (q == i2) {
            int K = n13.m13606K(max, q);
            this.f12510e = new byte[(t4Var.f14699d * K)];
            this.f12511f = new dr2(K * (q + q) * i);
            int i3 = ((t4Var.f14698c * t4Var.f14699d) * 8) / q;
            bf4 bf4 = new bf4();
            bf4.mo5842s("audio/raw");
            bf4.mo5823d0(i3);
            bf4.mo5838o(i3);
            bf4.mo5835l((max + max) * i);
            bf4.mo5825e0(t4Var.f14697b);
            bf4.mo5843t(t4Var.f14698c);
            bf4.mo5837n(2);
            this.f12513h = bf4.mo5848y();
            return;
        }
        StringBuilder sb = new StringBuilder(56);
        sb.append("Expected frames per block: ");
        sb.append(i2);
        sb.append("; got: ");
        sb.append(q);
        throw C1646dz.m8223a(sb.toString(), (Throwable) null);
    }

    /* renamed from: d */
    private final int m14826d(int i) {
        int i2 = this.f12508c.f14697b;
        return i / (i2 + i2);
    }

    /* renamed from: e */
    private final int m14827e(int i) {
        return (i + i) * this.f12508c.f14697b;
    }

    /* renamed from: f */
    private final void m14828f(int i) {
        long j = this.f12515j;
        long Z = n13.m13621Z(this.f12517l, 1000000, (long) this.f12508c.f14698c);
        int e = m14827e(i);
        this.f12507b.mo7872a(j + Z, 1, e, this.f12516k - e, (sd4) null);
        this.f12517l += (long) i;
        this.f12516k -= e;
    }

    /* renamed from: a */
    public final void mo9959a(long j) {
        this.f12514i = 0;
        this.f12515j = j;
        this.f12516k = 0;
        this.f12517l = 0;
    }

    /* renamed from: b */
    public final void mo9960b(int i, long j) {
        this.f12506a.mo10269p(new C2319w4(this.f12508c, this.f12509d, (long) i, j));
        this.f12507b.mo7873b(this.f12513h);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0043 A[EDGE_INSN: B:38:0x0043->B:10:0x0043 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0023  */
    /* renamed from: c */
    public final boolean mo9961c(com.google.android.gms.internal.ads.pc4 r20, long r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            int r3 = r0.f12512g
            int r4 = r0.f12516k
            int r4 = r0.m14826d(r4)
            int r3 = r3 - r4
            int r4 = r0.f12509d
            int r3 = com.google.android.gms.internal.ads.n13.m13606K(r3, r4)
            com.google.android.gms.internal.ads.t4 r4 = r0.f12508c
            int r4 = r4.f14699d
            int r3 = r3 * r4
            r4 = 0
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0020
        L_0x001e:
            r4 = 1
            goto L_0x0021
        L_0x0020:
            r4 = 0
        L_0x0021:
            if (r4 != 0) goto L_0x0043
            int r7 = r0.f12514i
            if (r7 >= r3) goto L_0x0043
            int r7 = r3 - r7
            long r7 = (long) r7
            long r7 = java.lang.Math.min(r7, r1)
            byte[] r9 = r0.f12510e
            int r10 = r0.f12514i
            int r7 = (int) r7
            r8 = r20
            int r7 = r8.mo5752a(r9, r10, r7)
            r9 = -1
            if (r7 != r9) goto L_0x003d
            goto L_0x001e
        L_0x003d:
            int r9 = r0.f12514i
            int r9 = r9 + r7
            r0.f12514i = r9
            goto L_0x0021
        L_0x0043:
            int r1 = r0.f12514i
            com.google.android.gms.internal.ads.t4 r2 = r0.f12508c
            int r2 = r2.f14699d
            int r1 = r1 / r2
            if (r1 <= 0) goto L_0x0148
            byte[] r2 = r0.f12510e
            com.google.android.gms.internal.ads.dr2 r3 = r0.f12511f
            r7 = 0
        L_0x0051:
            if (r7 >= r1) goto L_0x0113
            r8 = 0
        L_0x0054:
            com.google.android.gms.internal.ads.t4 r9 = r0.f12508c
            int r9 = r9.f14697b
            if (r8 >= r9) goto L_0x010b
            byte[] r9 = r3.mo6582h()
            com.google.android.gms.internal.ads.t4 r10 = r0.f12508c
            int r11 = r10.f14699d
            int r10 = r10.f14697b
            int r12 = r7 * r11
            int r13 = r8 * 4
            int r12 = r12 + r13
            int r13 = r10 * 4
            int r13 = r13 + r12
            int r11 = r11 / r10
            int r11 = r11 + -4
            int r14 = r12 + 1
            byte r14 = r2[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << 8
            byte r15 = r2[r12]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r14 = r14 | r15
            short r14 = (short) r14
            int r12 = r12 + 2
            byte r12 = r2[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r15 = 88
            int r12 = java.lang.Math.min(r12, r15)
            int[] r16 = f12505n
            r16 = r16[r12]
            int r5 = r0.f12509d
            int r5 = r5 * r7
            int r5 = r5 * r10
            int r5 = r5 + r8
            int r5 = r5 + r5
            r15 = r14 & 255(0xff, float:3.57E-43)
            byte r15 = (byte) r15
            r9[r5] = r15
            int r15 = r5 + 1
            int r6 = r14 >> 8
            byte r6 = (byte) r6
            r9[r15] = r6
            r6 = 0
        L_0x00a0:
            int r15 = r11 + r11
            if (r6 >= r15) goto L_0x0103
            int r15 = r6 / 8
            int r15 = r15 * r10
            int r15 = r15 * 4
            int r15 = r15 + r13
            int r18 = r6 / 2
            int r18 = r18 % 4
            int r15 = r15 + r18
            byte r15 = r2[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r18 = r6 % 2
            if (r18 != 0) goto L_0x00bb
            r15 = r15 & 15
            goto L_0x00bd
        L_0x00bb:
            int r15 = r15 >> 4
        L_0x00bd:
            r18 = r15 & 7
            int r18 = r18 + r18
            r17 = 1
            int r18 = r18 + 1
            int r18 = r18 * r16
            r16 = r2
            int r2 = r18 >> 3
            r18 = r15 & 8
            if (r18 == 0) goto L_0x00d0
            int r2 = -r2
        L_0x00d0:
            int r14 = r14 + r2
            r2 = -32768(0xffffffffffff8000, float:NaN)
            r21 = r11
            r11 = 32767(0x7fff, float:4.5916E-41)
            int r14 = com.google.android.gms.internal.ads.n13.m13607L(r14, r2, r11)
            int r2 = r10 + r10
            int r5 = r5 + r2
            r2 = r14 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r9[r5] = r2
            int r2 = r5 + 1
            int r11 = r14 >> 8
            byte r11 = (byte) r11
            r9[r2] = r11
            int[] r2 = f12504m
            r2 = r2[r15]
            int r12 = r12 + r2
            r2 = 88
            r11 = 0
            int r12 = com.google.android.gms.internal.ads.n13.m13607L(r12, r11, r2)
            int[] r11 = f12505n
            r11 = r11[r12]
            int r6 = r6 + 1
            r2 = r16
            r16 = r11
            r11 = r21
            goto L_0x00a0
        L_0x0103:
            r16 = r2
            r17 = 1
            int r8 = r8 + 1
            goto L_0x0054
        L_0x010b:
            r16 = r2
            r17 = 1
            int r7 = r7 + 1
            goto L_0x0051
        L_0x0113:
            int r2 = r0.f12509d
            int r2 = r2 * r1
            int r2 = r0.m14827e(r2)
            r5 = 0
            r3.mo6580f(r5)
            r3.mo6579e(r2)
            int r2 = r0.f12514i
            com.google.android.gms.internal.ads.t4 r3 = r0.f12508c
            int r3 = r3.f14699d
            int r1 = r1 * r3
            int r2 = r2 - r1
            r0.f12514i = r2
            com.google.android.gms.internal.ads.dr2 r1 = r0.f12511f
            int r1 = r1.mo6586l()
            com.google.android.gms.internal.ads.td4 r2 = r0.f12507b
            com.google.android.gms.internal.ads.dr2 r3 = r0.f12511f
            com.google.android.gms.internal.ads.rd4.m16162b(r2, r3, r1)
            int r2 = r0.f12516k
            int r2 = r2 + r1
            r0.f12516k = r2
            int r1 = r0.m14826d(r2)
            int r2 = r0.f12512g
            if (r1 < r2) goto L_0x0148
            r0.m14828f(r2)
        L_0x0148:
            if (r4 == 0) goto L_0x0155
            int r1 = r0.f12516k
            int r1 = r0.m14826d(r1)
            if (r1 <= 0) goto L_0x0155
            r0.m14828f(r1)
        L_0x0155:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2060p4.mo9961c(com.google.android.gms.internal.ads.pc4, long):boolean");
    }
}
