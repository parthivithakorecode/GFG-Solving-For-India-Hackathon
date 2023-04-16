package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.u1 */
final class C2242u1 implements C1539b2 {

    /* renamed from: a */
    private final C1502a2 f15316a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f15317b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final long f15318c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1762h2 f15319d;

    /* renamed from: e */
    private int f15320e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f15321f;

    /* renamed from: g */
    private long f15322g;

    /* renamed from: h */
    private long f15323h;

    /* renamed from: i */
    private long f15324i;

    /* renamed from: j */
    private long f15325j;

    /* renamed from: k */
    private long f15326k;

    /* renamed from: l */
    private long f15327l;

    public C2242u1(C1762h2 h2Var, long j, long j2, long j3, long j4, boolean z) {
        wu1.m19205d(j >= 0 && j2 > j);
        this.f15319d = h2Var;
        this.f15317b = j;
        this.f15318c = j2;
        if (j3 == j2 - j || z) {
            this.f15321f = j4;
            this.f15320e = 4;
        } else {
            this.f15320e = 0;
        }
        this.f15316a = new C1502a2();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ pd4 mo5625b() {
        if (this.f15321f != 0) {
            return new C2205t1(this, (C2168s1) null);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b7  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo5626c(com.google.android.gms.internal.ads.pc4 r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            int r2 = r0.f15320e
            r3 = 1
            r5 = 0
            r6 = -1
            if (r2 == 0) goto L_0x00f8
            if (r2 == r3) goto L_0x010b
            r3 = 2
            r10 = 3
            if (r2 == r3) goto L_0x0018
            if (r2 == r10) goto L_0x0015
            return r6
        L_0x0015:
            r2 = r6
            goto L_0x00b9
        L_0x0018:
            long r2 = r0.f15324i
            long r11 = r0.f15325j
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0024
        L_0x0020:
            r2 = r6
            r11 = r2
            goto L_0x00b2
        L_0x0024:
            long r2 = r24.mo6908b()
            com.google.android.gms.internal.ads.a2 r11 = r0.f15316a
            long r12 = r0.f15325j
            boolean r11 = r11.mo5070c(r1, r12)
            if (r11 != 0) goto L_0x0043
            long r11 = r0.f15324i
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x003b
            r2 = r6
            goto L_0x00b2
        L_0x003b:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "No ogg page can be found."
            r1.<init>(r2)
            throw r1
        L_0x0043:
            com.google.android.gms.internal.ads.a2 r11 = r0.f15316a
            r11.mo5069b(r1, r5)
            r24.mo6914i()
            long r11 = r0.f15323h
            com.google.android.gms.internal.ads.a2 r13 = r0.f15316a
            long r14 = r13.f3887b
            long r11 = r11 - r14
            int r8 = r13.f3889d
            int r9 = r13.f3890e
            int r8 = r8 + r9
            r16 = 0
            int r9 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r9 < 0) goto L_0x0065
            r16 = 72000(0x11940, double:3.55727E-319)
            int r13 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r13 >= 0) goto L_0x0065
            goto L_0x0020
        L_0x0065:
            if (r9 >= 0) goto L_0x006c
            r0.f15325j = r2
            r0.f15327l = r14
            goto L_0x007a
        L_0x006c:
            long r2 = r24.mo6908b()
            long r13 = (long) r8
            long r2 = r2 + r13
            r0.f15324i = r2
            com.google.android.gms.internal.ads.a2 r2 = r0.f15316a
            long r2 = r2.f3887b
            r0.f15326k = r2
        L_0x007a:
            long r2 = r0.f15325j
            long r13 = r0.f15324i
            long r2 = r2 - r13
            r16 = 100000(0x186a0, double:4.94066E-319)
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 >= 0) goto L_0x008b
            r0.f15325j = r13
            r2 = r6
            r11 = r13
            goto L_0x00b2
        L_0x008b:
            long r2 = (long) r8
            if (r9 > 0) goto L_0x0091
            r8 = 2
            goto L_0x0093
        L_0x0091:
            r8 = 1
        L_0x0093:
            long r13 = r24.mo6908b()
            long r4 = r0.f15325j
            long r6 = r0.f15324i
            long r2 = r2 * r8
            long r13 = r13 - r2
            long r2 = r4 - r6
            long r11 = r11 * r2
            long r2 = r0.f15327l
            long r8 = r0.f15326k
            long r2 = r2 - r8
            long r11 = r11 / r2
            long r17 = r13 + r11
            r2 = -1
            long r21 = r4 + r2
            r19 = r6
            long r11 = com.google.android.gms.internal.ads.n13.m13616U(r17, r19, r21)
        L_0x00b2:
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00b7
            return r11
        L_0x00b7:
            r0.f15320e = r10
        L_0x00b9:
            com.google.android.gms.internal.ads.a2 r4 = r0.f15316a
            r4.mo5070c(r1, r2)
            com.google.android.gms.internal.ads.a2 r2 = r0.f15316a
            r3 = 0
            r2.mo5069b(r1, r3)
            com.google.android.gms.internal.ads.a2 r2 = r0.f15316a
            long r3 = r2.f3887b
            long r5 = r0.f15323h
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00db
            r24.mo6914i()
            r1 = 4
            r0.f15320e = r1
            long r1 = r0.f15326k
            r4 = 2
            long r1 = r1 + r4
            long r1 = -r1
            return r1
        L_0x00db:
            r4 = 2
            int r3 = r2.f3889d
            int r2 = r2.f3890e
            r6 = r1
            com.google.android.gms.internal.ads.jc4 r6 = (com.google.android.gms.internal.ads.jc4) r6
            int r3 = r3 + r2
            r2 = 0
            r6.mo8447p(r3, r2)
            long r2 = r24.mo6908b()
            r0.f15324i = r2
            com.google.android.gms.internal.ads.a2 r2 = r0.f15316a
            long r2 = r2.f3887b
            r0.f15326k = r2
            r2 = -1
            goto L_0x00b9
        L_0x00f8:
            long r4 = r24.mo6908b()
            r0.f15322g = r4
            r0.f15320e = r3
            long r6 = r0.f15318c
            r8 = -65307(0xffffffffffff00e5, double:NaN)
            long r6 = r6 + r8
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x010b
            return r6
        L_0x010b:
            com.google.android.gms.internal.ads.a2 r2 = r0.f15316a
            r2.mo5068a()
            com.google.android.gms.internal.ads.a2 r2 = r0.f15316a
            r4 = -1
            boolean r2 = r2.mo5070c(r1, r4)
            if (r2 == 0) goto L_0x0168
            com.google.android.gms.internal.ads.a2 r2 = r0.f15316a
            r4 = 0
            r2.mo5069b(r1, r4)
            com.google.android.gms.internal.ads.a2 r2 = r0.f15316a
            int r5 = r2.f3889d
            int r2 = r2.f3890e
            r6 = r1
            com.google.android.gms.internal.ads.jc4 r6 = (com.google.android.gms.internal.ads.jc4) r6
            int r5 = r5 + r2
            r6.mo8447p(r5, r4)
        L_0x012d:
            com.google.android.gms.internal.ads.a2 r2 = r0.f15316a
            long r4 = r2.f3887b
            com.google.android.gms.internal.ads.a2 r2 = r0.f15316a
            int r6 = r2.f3886a
            r7 = 4
            r6 = r6 & r7
            if (r6 == r7) goto L_0x0160
            r6 = -1
            boolean r2 = r2.mo5070c(r1, r6)
            if (r2 == 0) goto L_0x0160
            long r8 = r24.mo6908b()
            long r10 = r0.f15318c
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x0160
            com.google.android.gms.internal.ads.a2 r2 = r0.f15316a
            boolean r2 = r2.mo5069b(r1, r3)
            if (r2 == 0) goto L_0x0160
            com.google.android.gms.internal.ads.a2 r2 = r0.f15316a
            int r8 = r2.f3889d
            int r2 = r2.f3890e
            int r8 = r8 + r2
            boolean r2 = com.google.android.gms.internal.ads.sc4.m16787e(r1, r8)
            if (r2 != 0) goto L_0x012d
        L_0x0160:
            r0.f15321f = r4
            r1 = 4
            r0.f15320e = r1
            long r1 = r0.f15322g
            return r1
        L_0x0168:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2242u1.mo5626c(com.google.android.gms.internal.ads.pc4):long");
    }

    /* renamed from: d */
    public final void mo5627d(long j) {
        this.f15323h = n13.m13616U(j, 0, this.f15321f - 1);
        this.f15320e = 2;
        this.f15324i = this.f15317b;
        this.f15325j = this.f15318c;
        this.f15326k = 0;
        this.f15327l = this.f15321f;
    }
}
