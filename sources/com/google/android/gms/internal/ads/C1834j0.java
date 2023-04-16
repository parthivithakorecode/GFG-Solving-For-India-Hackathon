package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* renamed from: com.google.android.gms.internal.ads.j0 */
public final class C1834j0 implements oc4 {

    /* renamed from: q */
    public static final vc4 f8889q = C1760h0.f7937b;

    /* renamed from: r */
    private static final tf4 f8890r = C1797i0.f8478a;

    /* renamed from: a */
    private final dr2 f8891a;

    /* renamed from: b */
    private final jd4 f8892b;

    /* renamed from: c */
    private final fd4 f8893c;

    /* renamed from: d */
    private final hd4 f8894d;

    /* renamed from: e */
    private final td4 f8895e;

    /* renamed from: f */
    private rc4 f8896f;

    /* renamed from: g */
    private td4 f8897g;

    /* renamed from: h */
    private td4 f8898h;

    /* renamed from: i */
    private int f8899i;

    /* renamed from: j */
    private c91 f8900j;

    /* renamed from: k */
    private long f8901k;

    /* renamed from: l */
    private long f8902l;

    /* renamed from: m */
    private long f8903m;

    /* renamed from: n */
    private int f8904n;

    /* renamed from: o */
    private C1908l0 f8905o;

    /* renamed from: p */
    private boolean f8906p;

    public C1834j0() {
        this(0);
    }

    public C1834j0(int i) {
        this.f8891a = new dr2(10);
        this.f8892b = new jd4();
        this.f8893c = new fd4();
        this.f8901k = -9223372036854775807L;
        this.f8894d = new hd4();
        nc4 nc4 = new nc4();
        this.f8895e = nc4;
        this.f8898h = nc4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0159  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m11370b(com.google.android.gms.internal.ads.pc4 r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.f8899i
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x000f
            r0.m11375k(r1, r4)     // Catch:{ EOFException -> 0x000e }
            goto L_0x000f
        L_0x000e:
            return r3
        L_0x000f:
            com.google.android.gms.internal.ads.l0 r2 = r0.f8905o
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 1
            if (r2 != 0) goto L_0x01b3
            com.google.android.gms.internal.ads.dr2 r14 = new com.google.android.gms.internal.ads.dr2
            com.google.android.gms.internal.ads.jd4 r2 = r0.f8892b
            int r2 = r2.f9110c
            r14.<init>((int) r2)
            byte[] r2 = r14.mo6582h()
            com.google.android.gms.internal.ads.jd4 r9 = r0.f8892b
            int r9 = r9.f9110c
            r10 = r1
            com.google.android.gms.internal.ads.jc4 r10 = (com.google.android.gms.internal.ads.jc4) r10
            r10.mo6917n(r2, r4, r9, r4)
            com.google.android.gms.internal.ads.jd4 r2 = r0.f8892b
            int r9 = r2.f9108a
            r9 = r9 & r8
            r10 = 36
            r11 = 21
            int r2 = r2.f9112e
            if (r9 == 0) goto L_0x0041
            if (r2 == r8) goto L_0x0046
            r2 = r10
            goto L_0x0047
        L_0x0041:
            if (r2 == r8) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r11 = 13
        L_0x0046:
            r2 = r11
        L_0x0047:
            int r9 = r14.mo6586l()
            int r11 = r2 + 4
            r12 = 1483304551(0x58696e67, float:1.02664153E15)
            r13 = 1447187017(0x56425249, float:5.3414667E13)
            r15 = 1231971951(0x496e666f, float:976486.94)
            if (r9 < r11) goto L_0x0067
            r14.mo6580f(r2)
            int r9 = r14.mo6587m()
            if (r9 == r12) goto L_0x0065
            if (r9 != r15) goto L_0x0067
            r11 = r15
            goto L_0x007b
        L_0x0065:
            r11 = r9
            goto L_0x007b
        L_0x0067:
            int r9 = r14.mo6586l()
            r11 = 40
            if (r9 < r11) goto L_0x007a
            r14.mo6580f(r10)
            int r9 = r14.mo6587m()
            if (r9 != r13) goto L_0x007a
            r11 = r13
            goto L_0x007b
        L_0x007a:
            r11 = r4
        L_0x007b:
            if (r11 == r12) goto L_0x00a0
            if (r11 != r15) goto L_0x0080
            goto L_0x00a0
        L_0x0080:
            if (r11 != r13) goto L_0x009b
            long r9 = r17.mo6909c()
            long r11 = r17.mo6908b()
            com.google.android.gms.internal.ads.jd4 r13 = r0.f8892b
            com.google.android.gms.internal.ads.m0 r2 = com.google.android.gms.internal.ads.C1945m0.m12996c(r9, r11, r13, r14)
            com.google.android.gms.internal.ads.jd4 r9 = r0.f8892b
            int r9 = r9.f9110c
            r10 = r1
            com.google.android.gms.internal.ads.jc4 r10 = (com.google.android.gms.internal.ads.jc4) r10
            r10.mo8447p(r9, r4)
            goto L_0x0103
        L_0x009b:
            r17.mo6914i()
            r2 = 0
            goto L_0x0103
        L_0x00a0:
            long r9 = r17.mo6909c()
            long r12 = r17.mo6908b()
            com.google.android.gms.internal.ads.jd4 r8 = r0.f8892b
            r7 = r11
            r11 = r12
            r13 = r8
            com.google.android.gms.internal.ads.n0 r8 = com.google.android.gms.internal.ads.C1982n0.m13560c(r9, r11, r13, r14)
            if (r8 == 0) goto L_0x00e9
            com.google.android.gms.internal.ads.fd4 r9 = r0.f8893c
            boolean r9 = r9.mo7301a()
            if (r9 != 0) goto L_0x00e9
            r17.mo6914i()
            r9 = r1
            com.google.android.gms.internal.ads.jc4 r9 = (com.google.android.gms.internal.ads.jc4) r9
            int r2 = r2 + 141
            r9.mo8446o(r2, r4)
            com.google.android.gms.internal.ads.dr2 r2 = r0.f8891a
            byte[] r2 = r2.mo6582h()
            r10 = 3
            r9.mo6917n(r2, r4, r10, r4)
            com.google.android.gms.internal.ads.dr2 r2 = r0.f8891a
            r2.mo6580f(r4)
            com.google.android.gms.internal.ads.fd4 r2 = r0.f8893c
            com.google.android.gms.internal.ads.dr2 r9 = r0.f8891a
            int r9 = r9.mo6595u()
            int r10 = r9 >> 12
            r9 = r9 & 4095(0xfff, float:5.738E-42)
            if (r10 > 0) goto L_0x00e5
            if (r9 <= 0) goto L_0x00e9
        L_0x00e5:
            r2.f6805a = r10
            r2.f6806b = r9
        L_0x00e9:
            com.google.android.gms.internal.ads.jd4 r2 = r0.f8892b
            int r2 = r2.f9110c
            r9 = r1
            com.google.android.gms.internal.ads.jc4 r9 = (com.google.android.gms.internal.ads.jc4) r9
            r9.mo8447p(r2, r4)
            if (r8 == 0) goto L_0x0102
            boolean r2 = r8.mo5812f()
            if (r2 != 0) goto L_0x0102
            if (r7 != r15) goto L_0x0102
            com.google.android.gms.internal.ads.l0 r2 = r0.m11372f(r1, r4)
            goto L_0x0103
        L_0x0102:
            r2 = r8
        L_0x0103:
            com.google.android.gms.internal.ads.c91 r7 = r0.f8900j
            long r8 = r17.mo6908b()
            if (r7 == 0) goto L_0x014e
            int r10 = r7.mo6086b()
            r11 = r4
        L_0x0110:
            if (r11 >= r10) goto L_0x014e
            com.google.android.gms.internal.ads.b81 r12 = r7.mo6087c(r11)
            boolean r13 = r12 instanceof com.google.android.gms.internal.ads.ag4
            if (r13 == 0) goto L_0x014b
            com.google.android.gms.internal.ads.ag4 r12 = (com.google.android.gms.internal.ads.ag4) r12
            int r10 = r7.mo6086b()
            r11 = r4
        L_0x0121:
            if (r11 >= r10) goto L_0x0145
            com.google.android.gms.internal.ads.b81 r13 = r7.mo6087c(r11)
            boolean r14 = r13 instanceof com.google.android.gms.internal.ads.C1647e
            if (r14 == 0) goto L_0x0142
            com.google.android.gms.internal.ads.e r13 = (com.google.android.gms.internal.ads.C1647e) r13
            java.lang.String r14 = r13.f16810f
            java.lang.String r15 = "TLEN"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0142
            java.lang.String r7 = r13.f5999h
            long r10 = java.lang.Long.parseLong(r7)
            long r10 = com.google.android.gms.internal.ads.nz3.m14195c(r10)
            goto L_0x0146
        L_0x0142:
            int r11 = r11 + 1
            goto L_0x0121
        L_0x0145:
            r10 = r5
        L_0x0146:
            com.google.android.gms.internal.ads.g0 r7 = com.google.android.gms.internal.ads.C1723g0.m9443c(r8, r12, r10)
            goto L_0x014f
        L_0x014b:
            int r11 = r11 + 1
            goto L_0x0110
        L_0x014e:
            r7 = 0
        L_0x014f:
            boolean r8 = r0.f8906p
            if (r8 == 0) goto L_0x0159
            com.google.android.gms.internal.ads.k0 r2 = new com.google.android.gms.internal.ads.k0
            r2.<init>()
            goto L_0x016a
        L_0x0159:
            if (r7 == 0) goto L_0x015d
            r2 = r7
            goto L_0x0160
        L_0x015d:
            if (r2 != 0) goto L_0x0160
            r2 = 0
        L_0x0160:
            if (r2 == 0) goto L_0x0166
            r2.mo5812f()
            goto L_0x016a
        L_0x0166:
            com.google.android.gms.internal.ads.l0 r2 = r0.m11372f(r1, r4)
        L_0x016a:
            r0.f8905o = r2
            com.google.android.gms.internal.ads.rc4 r7 = r0.f8896f
            r7.mo10269p(r2)
            com.google.android.gms.internal.ads.td4 r2 = r0.f8898h
            com.google.android.gms.internal.ads.bf4 r7 = new com.google.android.gms.internal.ads.bf4
            r7.<init>()
            com.google.android.gms.internal.ads.jd4 r8 = r0.f8892b
            java.lang.String r8 = r8.f9109b
            r7.mo5842s(r8)
            r8 = 4096(0x1000, float:5.74E-42)
            r7.mo5835l(r8)
            com.google.android.gms.internal.ads.jd4 r8 = r0.f8892b
            int r8 = r8.f9112e
            r7.mo5825e0(r8)
            com.google.android.gms.internal.ads.jd4 r8 = r0.f8892b
            int r8 = r8.f9111d
            r7.mo5843t(r8)
            com.google.android.gms.internal.ads.fd4 r8 = r0.f8893c
            int r8 = r8.f6805a
            r7.mo5820c(r8)
            com.google.android.gms.internal.ads.fd4 r8 = r0.f8893c
            int r8 = r8.f6806b
            r7.mo5822d(r8)
            com.google.android.gms.internal.ads.c91 r8 = r0.f8900j
            r7.mo5836m(r8)
            com.google.android.gms.internal.ads.c0 r7 = r7.mo5848y()
            r2.mo7873b(r7)
            long r7 = r17.mo6908b()
            r0.f8903m = r7
            goto L_0x01cd
        L_0x01b3:
            long r7 = r0.f8903m
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x01cd
            long r7 = r17.mo6908b()
            long r9 = r0.f8903m
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x01cd
            r2 = r1
            com.google.android.gms.internal.ads.jc4 r2 = (com.google.android.gms.internal.ads.jc4) r2
            long r9 = r9 - r7
            int r7 = (int) r9
            r2.mo8447p(r7, r4)
        L_0x01cd:
            int r2 = r0.f8904n
            if (r2 != 0) goto L_0x0231
            r17.mo6914i()
            boolean r2 = r16.m11374j(r17)
            if (r2 == 0) goto L_0x01db
            goto L_0x0243
        L_0x01db:
            com.google.android.gms.internal.ads.dr2 r2 = r0.f8891a
            r2.mo6580f(r4)
            com.google.android.gms.internal.ads.dr2 r2 = r0.f8891a
            int r2 = r2.mo6587m()
            int r7 = r0.f8899i
            long r7 = (long) r7
            boolean r7 = m11373i(r2, r7)
            if (r7 == 0) goto L_0x0228
            int r7 = com.google.android.gms.internal.ads.kd4.m12122b(r2)
            if (r7 != r3) goto L_0x01f6
            goto L_0x0228
        L_0x01f6:
            com.google.android.gms.internal.ads.jd4 r7 = r0.f8892b
            r7.mo8451a(r2)
            long r7 = r0.f8901k
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x020d
            com.google.android.gms.internal.ads.l0 r2 = r0.f8905o
            long r5 = r17.mo6908b()
            long r5 = r2.mo6764i(r5)
            r0.f8901k = r5
        L_0x020d:
            com.google.android.gms.internal.ads.jd4 r2 = r0.f8892b
            int r5 = r2.f9110c
            r0.f8904n = r5
            com.google.android.gms.internal.ads.l0 r6 = r0.f8905o
            boolean r7 = r6 instanceof com.google.android.gms.internal.ads.C1686f0
            if (r7 != 0) goto L_0x021b
            r2 = r5
            goto L_0x0231
        L_0x021b:
            com.google.android.gms.internal.ads.f0 r6 = (com.google.android.gms.internal.ads.C1686f0) r6
            long r3 = r0.f8902l
            int r1 = r2.f9114g
            long r1 = (long) r1
            long r3 = r3 + r1
            r0.m11371d(r3)
            r1 = 0
            throw r1
        L_0x0228:
            com.google.android.gms.internal.ads.jc4 r1 = (com.google.android.gms.internal.ads.jc4) r1
            r5 = 1
            r1.mo8447p(r5, r4)
            r0.f8899i = r4
            goto L_0x0242
        L_0x0231:
            r5 = 1
            com.google.android.gms.internal.ads.td4 r6 = r0.f8898h
            int r1 = r6.mo7874c(r1, r2, r5)
            if (r1 != r3) goto L_0x023b
            goto L_0x0243
        L_0x023b:
            int r2 = r0.f8904n
            int r2 = r2 - r1
            r0.f8904n = r2
            if (r2 <= 0) goto L_0x0244
        L_0x0242:
            r3 = r4
        L_0x0243:
            return r3
        L_0x0244:
            com.google.android.gms.internal.ads.td4 r5 = r0.f8898h
            long r1 = r0.f8902l
            long r6 = r0.m11371d(r1)
            r8 = 1
            com.google.android.gms.internal.ads.jd4 r1 = r0.f8892b
            int r9 = r1.f9110c
            r10 = 0
            r11 = 0
            r5.mo7872a(r6, r8, r9, r10, r11)
            long r1 = r0.f8902l
            com.google.android.gms.internal.ads.jd4 r3 = r0.f8892b
            int r3 = r3.f9114g
            long r5 = (long) r3
            long r1 = r1 + r5
            r0.f8902l = r1
            r0.f8904n = r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1834j0.m11370b(com.google.android.gms.internal.ads.pc4):int");
    }

    /* renamed from: d */
    private final long m11371d(long j) {
        return this.f8901k + ((j * 1000000) / ((long) this.f8892b.f9111d));
    }

    /* renamed from: f */
    private final C1908l0 m11372f(pc4 pc4, boolean z) {
        ((jc4) pc4).mo6917n(this.f8891a.mo6582h(), 0, 4, false);
        this.f8891a.mo6580f(0);
        this.f8892b.mo8451a(this.f8891a.mo6587m());
        return new C1648e0(pc4.mo6909c(), pc4.mo6908b(), this.f8892b, false);
    }

    /* renamed from: i */
    private static boolean m11373i(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    /* renamed from: j */
    private final boolean m11374j(pc4 pc4) {
        C1908l0 l0Var = this.f8905o;
        if (l0Var != null) {
            long a = l0Var.mo6763a();
            if (a != -1 && pc4.mo6913g() > a - 4) {
                return true;
            }
        }
        try {
            return !pc4.mo6917n(this.f8891a.mo6582h(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* renamed from: k */
    private final boolean m11375k(pc4 pc4, boolean z) {
        int i;
        int i2;
        int b;
        int i3 = true != z ? 131072 : 32768;
        pc4.mo6914i();
        if (pc4.mo6908b() == 0) {
            c91 a = this.f8894d.mo7917a(pc4, (tf4) null);
            this.f8900j = a;
            if (a != null) {
                this.f8893c.mo7302b(a);
            }
            i2 = (int) pc4.mo6913g();
            if (!z) {
                ((jc4) pc4).mo8447p(i2, false);
            }
            i = 0;
        } else {
            i2 = 0;
            i = 0;
        }
        int i4 = i;
        int i5 = i4;
        while (true) {
            if (!m11374j(pc4)) {
                this.f8891a.mo6580f(0);
                int m = this.f8891a.mo6587m();
                if ((i == 0 || m11373i(m, (long) i)) && (b = kd4.m12122b(m)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.f8892b.mo8451a(m);
                        i = m;
                    }
                    ((jc4) pc4).mo8446o(b - 4, false);
                } else {
                    int i6 = i5 + 1;
                    if (i5 != i3) {
                        if (z) {
                            pc4.mo6914i();
                            ((jc4) pc4).mo8446o(i2 + i6, false);
                        } else {
                            ((jc4) pc4).mo8447p(1, false);
                        }
                        i4 = 0;
                        i5 = i6;
                        i = 0;
                    } else if (z) {
                        return false;
                    } else {
                        throw C1646dz.m8223a("Searched too many bytes.", (Throwable) null);
                    }
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((jc4) pc4).mo8447p(i2 + i5, false);
        } else {
            pc4.mo6914i();
        }
        this.f8899i = i;
        return true;
    }

    /* renamed from: a */
    public final void mo8320a() {
        this.f8906p = true;
    }

    /* renamed from: c */
    public final boolean mo5040c(pc4 pc4) {
        return m11375k(pc4, true);
    }

    /* renamed from: e */
    public final int mo5042e(pc4 pc4, md4 md4) {
        wu1.m19203b(this.f8897g);
        int i = n13.f11236a;
        int b = m11370b(pc4);
        if (b == -1 && (this.f8905o instanceof C1686f0)) {
            if (this.f8905o.mo5810b() != m11371d(this.f8902l)) {
                C1686f0 f0Var = (C1686f0) this.f8905o;
                throw null;
            }
        }
        return b;
    }

    /* renamed from: g */
    public final void mo5044g(rc4 rc4) {
        this.f8896f = rc4;
        td4 r = rc4.mo10270r(0, 1);
        this.f8897g = r;
        this.f8898h = r;
        this.f8896f.mo10268G();
    }

    /* renamed from: h */
    public final void mo5045h(long j, long j2) {
        this.f8899i = 0;
        this.f8901k = -9223372036854775807L;
        this.f8902l = 0;
        this.f8904n = 0;
        C1908l0 l0Var = this.f8905o;
        if (l0Var instanceof C1686f0) {
            C1686f0 f0Var = (C1686f0) l0Var;
            throw null;
        }
    }
}
