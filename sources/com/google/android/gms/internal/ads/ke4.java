package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class ke4 implements oc4 {

    /* renamed from: q */
    public static final vc4 f9498q = je4.f9119b;

    /* renamed from: a */
    private final dr2 f9499a = new dr2(4);

    /* renamed from: b */
    private final dr2 f9500b = new dr2(9);

    /* renamed from: c */
    private final dr2 f9501c = new dr2(11);

    /* renamed from: d */
    private final dr2 f9502d = new dr2();

    /* renamed from: e */
    private final le4 f9503e = new le4();

    /* renamed from: f */
    private rc4 f9504f;

    /* renamed from: g */
    private int f9505g = 1;

    /* renamed from: h */
    private boolean f9506h;

    /* renamed from: i */
    private long f9507i;

    /* renamed from: j */
    private int f9508j;

    /* renamed from: k */
    private int f9509k;

    /* renamed from: l */
    private int f9510l;

    /* renamed from: m */
    private long f9511m;

    /* renamed from: n */
    private boolean f9512n;

    /* renamed from: o */
    private ie4 f9513o;

    /* renamed from: p */
    private oe4 f9514p;

    /* renamed from: a */
    private final dr2 m12141a(pc4 pc4) {
        if (this.f9510l > this.f9502d.mo6584j()) {
            dr2 dr2 = this.f9502d;
            int j = dr2.mo6584j();
            dr2.mo6578d(new byte[Math.max(j + j, this.f9510l)], 0);
        } else {
            this.f9502d.mo6580f(0);
        }
        this.f9502d.mo6579e(this.f9510l);
        ((jc4) pc4).mo6916m(this.f9502d.mo6582h(), 0, this.f9510l, false);
        return this.f9502d;
    }

    @RequiresNonNull({"extractorOutput"})
    /* renamed from: b */
    private final void m12142b() {
        if (!this.f9512n) {
            this.f9504f.mo10269p(new od4(-9223372036854775807L, 0));
            this.f9512n = true;
        }
    }

    /* renamed from: c */
    public final boolean mo5040c(pc4 pc4) {
        jc4 jc4 = (jc4) pc4;
        jc4.mo6917n(this.f9499a.mo6582h(), 0, 3, false);
        this.f9499a.mo6580f(0);
        if (this.f9499a.mo6595u() != 4607062) {
            return false;
        }
        jc4.mo6917n(this.f9499a.mo6582h(), 0, 2, false);
        this.f9499a.mo6580f(0);
        if ((this.f9499a.mo6597w() & 250) != 0) {
            return false;
        }
        jc4.mo6917n(this.f9499a.mo6582h(), 0, 4, false);
        this.f9499a.mo6580f(0);
        int m = this.f9499a.mo6587m();
        pc4.mo6914i();
        jc4 jc42 = (jc4) pc4;
        jc42.mo8446o(m, false);
        jc42.mo6917n(this.f9499a.mo6582h(), 0, 4, false);
        this.f9499a.mo6580f(0);
        return this.f9499a.mo6587m() == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00be A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0009 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo5042e(com.google.android.gms.internal.ads.pc4 r17, com.google.android.gms.internal.ads.md4 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.gms.internal.ads.rc4 r2 = r0.f9504f
            com.google.android.gms.internal.ads.wu1.m19203b(r2)
        L_0x0009:
            int r2 = r0.f9505g
            r3 = -1
            r4 = 8
            r5 = 9
            r6 = 2
            r7 = 4
            r8 = 0
            r9 = 1
            if (r2 == r9) goto L_0x011a
            r10 = 3
            if (r2 == r6) goto L_0x010c
            if (r2 == r10) goto L_0x00c5
            if (r2 != r7) goto L_0x00bf
            boolean r2 = r0.f9506h
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x002c
            long r2 = r0.f9507i
            long r14 = r0.f9511m
            long r2 = r2 + r14
            goto L_0x003b
        L_0x002c:
            com.google.android.gms.internal.ads.le4 r2 = r0.f9503e
            long r2 = r2.mo8936d()
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0039
            r2 = 0
            goto L_0x003b
        L_0x0039:
            long r2 = r0.f9511m
        L_0x003b:
            int r14 = r0.f9509k
            if (r14 != r4) goto L_0x0052
            com.google.android.gms.internal.ads.ie4 r14 = r0.f9513o
            if (r14 == 0) goto L_0x0053
            r16.m12142b()
            com.google.android.gms.internal.ads.ie4 r4 = r0.f9513o
        L_0x0048:
            com.google.android.gms.internal.ads.dr2 r5 = r16.m12141a(r17)
            boolean r2 = r4.mo9517c(r5, r2)
        L_0x0050:
            r3 = r9
            goto L_0x009e
        L_0x0052:
            r4 = r14
        L_0x0053:
            if (r4 != r5) goto L_0x005f
            com.google.android.gms.internal.ads.oe4 r4 = r0.f9514p
            if (r4 == 0) goto L_0x0094
            r16.m12142b()
            com.google.android.gms.internal.ads.oe4 r4 = r0.f9514p
            goto L_0x0048
        L_0x005f:
            r5 = 18
            if (r4 != r5) goto L_0x0094
            boolean r4 = r0.f9512n
            if (r4 != 0) goto L_0x0094
            com.google.android.gms.internal.ads.le4 r4 = r0.f9503e
            com.google.android.gms.internal.ads.dr2 r5 = r16.m12141a(r17)
            boolean r2 = r4.mo9517c(r5, r2)
            com.google.android.gms.internal.ads.le4 r3 = r0.f9503e
            long r3 = r3.mo8936d()
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x0050
            com.google.android.gms.internal.ads.rc4 r5 = r0.f9504f
            com.google.android.gms.internal.ads.id4 r14 = new com.google.android.gms.internal.ads.id4
            com.google.android.gms.internal.ads.le4 r15 = r0.f9503e
            long[] r15 = r15.mo8937e()
            com.google.android.gms.internal.ads.le4 r10 = r0.f9503e
            long[] r10 = r10.mo8938f()
            r14.<init>(r15, r10, r3)
            r5.mo10269p(r14)
            r0.f9512n = r9
            goto L_0x0050
        L_0x0094:
            int r2 = r0.f9510l
            r3 = r1
            com.google.android.gms.internal.ads.jc4 r3 = (com.google.android.gms.internal.ads.jc4) r3
            r3.mo8447p(r2, r8)
            r2 = r8
            r3 = r2
        L_0x009e:
            boolean r4 = r0.f9506h
            if (r4 != 0) goto L_0x00b8
            if (r2 == 0) goto L_0x00b8
            r0.f9506h = r9
            com.google.android.gms.internal.ads.le4 r2 = r0.f9503e
            long r4 = r2.mo8936d()
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x00b4
            long r4 = r0.f9511m
            long r10 = -r4
            goto L_0x00b6
        L_0x00b4:
            r10 = 0
        L_0x00b6:
            r0.f9507i = r10
        L_0x00b8:
            r0.f9508j = r7
            r0.f9505g = r6
            if (r3 == 0) goto L_0x0009
            return r8
        L_0x00bf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00c5:
            com.google.android.gms.internal.ads.dr2 r2 = r0.f9501c
            byte[] r2 = r2.mo6582h()
            r4 = 11
            boolean r2 = r1.mo6916m(r2, r8, r4, r9)
            if (r2 != 0) goto L_0x00d4
            return r3
        L_0x00d4:
            com.google.android.gms.internal.ads.dr2 r2 = r0.f9501c
            r2.mo6580f(r8)
            com.google.android.gms.internal.ads.dr2 r2 = r0.f9501c
            int r2 = r2.mo6593s()
            r0.f9509k = r2
            com.google.android.gms.internal.ads.dr2 r2 = r0.f9501c
            int r2 = r2.mo6595u()
            r0.f9510l = r2
            com.google.android.gms.internal.ads.dr2 r2 = r0.f9501c
            int r2 = r2.mo6595u()
            long r2 = (long) r2
            r0.f9511m = r2
            com.google.android.gms.internal.ads.dr2 r2 = r0.f9501c
            int r2 = r2.mo6593s()
            int r2 = r2 << 24
            long r2 = (long) r2
            long r4 = r0.f9511m
            long r2 = r2 | r4
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r0.f9511m = r2
            com.google.android.gms.internal.ads.dr2 r2 = r0.f9501c
            r2.mo6581g(r10)
            r0.f9505g = r7
            goto L_0x0009
        L_0x010c:
            int r2 = r0.f9508j
            r3 = r1
            com.google.android.gms.internal.ads.jc4 r3 = (com.google.android.gms.internal.ads.jc4) r3
            r3.mo8447p(r2, r8)
            r0.f9508j = r8
            r0.f9505g = r10
            goto L_0x0009
        L_0x011a:
            com.google.android.gms.internal.ads.dr2 r2 = r0.f9500b
            byte[] r2 = r2.mo6582h()
            boolean r2 = r1.mo6916m(r2, r8, r5, r9)
            if (r2 != 0) goto L_0x0127
            return r3
        L_0x0127:
            com.google.android.gms.internal.ads.dr2 r2 = r0.f9500b
            r2.mo6580f(r8)
            com.google.android.gms.internal.ads.dr2 r2 = r0.f9500b
            r2.mo6581g(r7)
            com.google.android.gms.internal.ads.dr2 r2 = r0.f9500b
            int r2 = r2.mo6593s()
            r3 = r2 & 1
            r2 = r2 & r7
            if (r2 == 0) goto L_0x014d
            com.google.android.gms.internal.ads.ie4 r2 = r0.f9513o
            if (r2 != 0) goto L_0x014d
            com.google.android.gms.internal.ads.ie4 r2 = new com.google.android.gms.internal.ads.ie4
            com.google.android.gms.internal.ads.rc4 r7 = r0.f9504f
            com.google.android.gms.internal.ads.td4 r4 = r7.mo10270r(r4, r9)
            r2.<init>(r4)
            r0.f9513o = r2
        L_0x014d:
            if (r3 == 0) goto L_0x0160
            com.google.android.gms.internal.ads.oe4 r2 = r0.f9514p
            if (r2 != 0) goto L_0x0160
            com.google.android.gms.internal.ads.oe4 r2 = new com.google.android.gms.internal.ads.oe4
            com.google.android.gms.internal.ads.rc4 r3 = r0.f9504f
            com.google.android.gms.internal.ads.td4 r3 = r3.mo10270r(r5, r6)
            r2.<init>(r3)
            r0.f9514p = r2
        L_0x0160:
            com.google.android.gms.internal.ads.rc4 r2 = r0.f9504f
            r2.mo10268G()
            com.google.android.gms.internal.ads.dr2 r2 = r0.f9500b
            int r2 = r2.mo6587m()
            int r2 = r2 + -5
            r0.f9508j = r2
            r0.f9505g = r6
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ke4.mo5042e(com.google.android.gms.internal.ads.pc4, com.google.android.gms.internal.ads.md4):int");
    }

    /* renamed from: g */
    public final void mo5044g(rc4 rc4) {
        this.f9504f = rc4;
    }

    /* renamed from: h */
    public final void mo5045h(long j, long j2) {
        if (j == 0) {
            this.f9505g = 1;
            this.f9506h = false;
        } else {
            this.f9505g = 3;
        }
        this.f9508j = 0;
    }
}
