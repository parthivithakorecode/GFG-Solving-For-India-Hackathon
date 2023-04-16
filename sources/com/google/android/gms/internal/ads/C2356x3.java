package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.x3 */
public final class C2356x3 implements C1912l4 {

    /* renamed from: a */
    private final C2318w3 f17010a;

    /* renamed from: b */
    private final dr2 f17011b = new dr2(32);

    /* renamed from: c */
    private int f17012c;

    /* renamed from: d */
    private int f17013d;

    /* renamed from: e */
    private boolean f17014e;

    /* renamed from: f */
    private boolean f17015f;

    public C2356x3(C2318w3 w3Var) {
        this.f17010a = w3Var;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0100 A[SYNTHETIC] */
    /* renamed from: a */
    public final void mo8865a(com.google.android.gms.internal.ads.dr2 r7, int r8) {
        /*
            r6 = this;
            r0 = 1
            r8 = r8 & r0
            r1 = -1
            if (r8 == 0) goto L_0x000f
            int r2 = r7.mo6593s()
            int r3 = r7.mo6585k()
            int r3 = r3 + r2
            goto L_0x0010
        L_0x000f:
            r3 = r1
        L_0x0010:
            boolean r2 = r6.f17015f
            r4 = 0
            if (r2 != 0) goto L_0x0016
            goto L_0x0020
        L_0x0016:
            if (r8 != 0) goto L_0x0019
            return
        L_0x0019:
            r6.f17015f = r4
            r7.mo6580f(r3)
        L_0x001e:
            r6.f17013d = r4
        L_0x0020:
            int r8 = r7.mo6583i()
            if (r8 <= 0) goto L_0x0100
            int r8 = r6.f17013d
            r2 = 3
            if (r8 >= r2) goto L_0x00ad
            if (r8 != 0) goto L_0x0041
            int r8 = r7.mo6593s()
            int r3 = r7.mo6585k()
            int r3 = r3 + r1
            r7.mo6580f(r3)
            r3 = 255(0xff, float:3.57E-43)
            if (r8 == r3) goto L_0x003e
            goto L_0x0041
        L_0x003e:
            r6.f17015f = r0
            return
        L_0x0041:
            int r8 = r7.mo6583i()
            int r3 = r6.f17013d
            int r3 = 3 - r3
            int r8 = java.lang.Math.min(r8, r3)
            com.google.android.gms.internal.ads.dr2 r3 = r6.f17011b
            byte[] r3 = r3.mo6582h()
            int r5 = r6.f17013d
            r7.mo6576b(r3, r5, r8)
            int r3 = r6.f17013d
            int r3 = r3 + r8
            r6.f17013d = r3
            if (r3 != r2) goto L_0x0020
            com.google.android.gms.internal.ads.dr2 r8 = r6.f17011b
            r8.mo6580f(r4)
            com.google.android.gms.internal.ads.dr2 r8 = r6.f17011b
            r8.mo6579e(r2)
            com.google.android.gms.internal.ads.dr2 r8 = r6.f17011b
            r8.mo6581g(r0)
            com.google.android.gms.internal.ads.dr2 r8 = r6.f17011b
            int r8 = r8.mo6593s()
            com.google.android.gms.internal.ads.dr2 r3 = r6.f17011b
            int r3 = r3.mo6593s()
            r5 = r8 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x0080
            r5 = r0
            goto L_0x0081
        L_0x0080:
            r5 = r4
        L_0x0081:
            r6.f17014e = r5
            r8 = r8 & 15
            int r8 = r8 << 8
            r8 = r8 | r3
            int r8 = r8 + r2
            r6.f17012c = r8
            com.google.android.gms.internal.ads.dr2 r8 = r6.f17011b
            int r8 = r8.mo6584j()
            int r2 = r6.f17012c
            if (r8 >= r2) goto L_0x0020
            com.google.android.gms.internal.ads.dr2 r8 = r6.f17011b
            int r8 = r8.mo6584j()
            int r8 = r8 + r8
            int r8 = java.lang.Math.max(r2, r8)
            r2 = 4098(0x1002, float:5.743E-42)
            int r8 = java.lang.Math.min(r2, r8)
            com.google.android.gms.internal.ads.dr2 r2 = r6.f17011b
            r2.mo6574H(r8)
            goto L_0x0020
        L_0x00ad:
            int r8 = r7.mo6583i()
            int r2 = r6.f17012c
            int r3 = r6.f17013d
            int r2 = r2 - r3
            int r8 = java.lang.Math.min(r8, r2)
            com.google.android.gms.internal.ads.dr2 r2 = r6.f17011b
            byte[] r2 = r2.mo6582h()
            int r3 = r6.f17013d
            r7.mo6576b(r2, r3, r8)
            int r2 = r6.f17013d
            int r2 = r2 + r8
            r6.f17013d = r2
            int r8 = r6.f17012c
            if (r2 != r8) goto L_0x0020
            boolean r2 = r6.f17014e
            if (r2 == 0) goto L_0x00ed
            com.google.android.gms.internal.ads.dr2 r8 = r6.f17011b
            byte[] r8 = r8.mo6582h()
            int r2 = r6.f17012c
            int r8 = com.google.android.gms.internal.ads.n13.m13608M(r8, r4, r2, r1)
            if (r8 == 0) goto L_0x00e3
            r6.f17015f = r0
            return
        L_0x00e3:
            com.google.android.gms.internal.ads.dr2 r8 = r6.f17011b
            int r2 = r6.f17012c
            int r2 = r2 + -4
            r8.mo6579e(r2)
            goto L_0x00f2
        L_0x00ed:
            com.google.android.gms.internal.ads.dr2 r2 = r6.f17011b
            r2.mo6579e(r8)
        L_0x00f2:
            com.google.android.gms.internal.ads.dr2 r8 = r6.f17011b
            r8.mo6580f(r4)
            com.google.android.gms.internal.ads.w3 r8 = r6.f17010a
            com.google.android.gms.internal.ads.dr2 r2 = r6.f17011b
            r8.mo6379a(r2)
            goto L_0x001e
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2356x3.mo8865a(com.google.android.gms.internal.ads.dr2, int):void");
    }

    /* renamed from: b */
    public final void mo8866b(ky2 ky2, rc4 rc4, C1875k4 k4Var) {
        this.f17010a.mo6380b(ky2, rc4, k4Var);
        this.f17015f = true;
    }

    /* renamed from: c */
    public final void mo8867c() {
        this.f17015f = true;
    }
}
