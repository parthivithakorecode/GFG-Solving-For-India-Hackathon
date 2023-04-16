package com.google.android.gms.internal.ads;

import java.util.Objects;

public final class pe4 implements oc4 {

    /* renamed from: a */
    private final dr2 f12631a = new dr2(6);

    /* renamed from: b */
    private rc4 f12632b;

    /* renamed from: c */
    private int f12633c;

    /* renamed from: d */
    private int f12634d;

    /* renamed from: e */
    private int f12635e;

    /* renamed from: f */
    private long f12636f = -1;

    /* renamed from: g */
    private C1944m f12637g;

    /* renamed from: h */
    private pc4 f12638h;

    /* renamed from: i */
    private se4 f12639i;

    /* renamed from: j */
    private C1835j1 f12640j;

    /* renamed from: a */
    private final int m15034a(pc4 pc4) {
        this.f12631a.mo6577c(2);
        ((jc4) pc4).mo6917n(this.f12631a.mo6582h(), 0, 2, false);
        return this.f12631a.mo6597w();
    }

    /* renamed from: b */
    private final void m15035b() {
        m15036d(new b81[0]);
        rc4 rc4 = this.f12632b;
        Objects.requireNonNull(rc4);
        rc4.mo10268G();
        this.f12632b.mo10269p(new od4(-9223372036854775807L, 0));
        this.f12633c = 6;
    }

    /* renamed from: d */
    private final void m15036d(b81... b81Arr) {
        rc4 rc4 = this.f12632b;
        Objects.requireNonNull(rc4);
        td4 r = rc4.mo10270r(1024, 4);
        bf4 bf4 = new bf4();
        bf4.mo5831h0("image/jpeg");
        bf4.mo5836m(new c91(b81Arr));
        r.mo7873b(bf4.mo5848y());
    }

    /* renamed from: c */
    public final boolean mo5040c(pc4 pc4) {
        if (m15034a(pc4) != 65496) {
            return false;
        }
        int a = m15034a(pc4);
        this.f12634d = a;
        if (a == 65504) {
            this.f12631a.mo6577c(2);
            jc4 jc4 = (jc4) pc4;
            jc4.mo6917n(this.f12631a.mo6582h(), 0, 2, false);
            jc4.mo8446o(this.f12631a.mo6597w() - 2, false);
            a = m15034a(pc4);
            this.f12634d = a;
        }
        if (a == 65505) {
            jc4 jc42 = (jc4) pc4;
            jc42.mo8446o(2, false);
            this.f12631a.mo6577c(6);
            jc42.mo6917n(this.f12631a.mo6582h(), 0, 6, false);
            return this.f12631a.mo6567A() == 1165519206 && this.f12631a.mo6597w() == 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x0158  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo5042e(com.google.android.gms.internal.ads.pc4 r24, com.google.android.gms.internal.ads.md4 r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = r0.f12633c
            r4 = 4
            r5 = 2
            r6 = 1
            r7 = -1
            r9 = 0
            if (r3 == 0) goto L_0x0189
            if (r3 == r6) goto L_0x016b
            r10 = -1
            if (r3 == r5) goto L_0x00a8
            r5 = 5
            if (r3 == r4) goto L_0x004c
            if (r3 == r5) goto L_0x0024
            r1 = 6
            if (r3 != r1) goto L_0x001e
            return r10
        L_0x001e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0024:
            com.google.android.gms.internal.ads.se4 r3 = r0.f12639i
            if (r3 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.pc4 r3 = r0.f12638h
            if (r1 == r3) goto L_0x0037
        L_0x002c:
            r0.f12638h = r1
            com.google.android.gms.internal.ads.se4 r3 = new com.google.android.gms.internal.ads.se4
            long r4 = r0.f12636f
            r3.<init>(r1, r4)
            r0.f12639i = r3
        L_0x0037:
            com.google.android.gms.internal.ads.j1 r1 = r0.f12640j
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.internal.ads.se4 r3 = r0.f12639i
            int r1 = r1.mo5042e(r3, r2)
            if (r1 != r6) goto L_0x004b
            long r3 = r2.f10817a
            long r5 = r0.f12636f
            long r3 = r3 + r5
            r2.f10817a = r3
        L_0x004b:
            return r1
        L_0x004c:
            long r3 = r24.mo6908b()
            long r7 = r0.f12636f
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x00a5
            com.google.android.gms.internal.ads.dr2 r2 = r0.f12631a
            byte[] r2 = r2.mo6582h()
            boolean r2 = r1.mo6917n(r2, r9, r6, r6)
            if (r2 != 0) goto L_0x0066
        L_0x0062:
            r23.m15035b()
            goto L_0x00a4
        L_0x0066:
            r24.mo6914i()
            com.google.android.gms.internal.ads.j1 r2 = r0.f12640j
            if (r2 != 0) goto L_0x0074
            com.google.android.gms.internal.ads.j1 r2 = new com.google.android.gms.internal.ads.j1
            r2.<init>(r9)
            r0.f12640j = r2
        L_0x0074:
            com.google.android.gms.internal.ads.se4 r2 = new com.google.android.gms.internal.ads.se4
            long r3 = r0.f12636f
            r2.<init>(r1, r3)
            r0.f12639i = r2
            com.google.android.gms.internal.ads.j1 r1 = r0.f12640j
            boolean r1 = r1.mo5040c(r2)
            if (r1 == 0) goto L_0x0062
            com.google.android.gms.internal.ads.j1 r1 = r0.f12640j
            com.google.android.gms.internal.ads.ue4 r2 = new com.google.android.gms.internal.ads.ue4
            long r3 = r0.f12636f
            com.google.android.gms.internal.ads.rc4 r7 = r0.f12632b
            java.util.Objects.requireNonNull(r7)
            r2.<init>(r3, r7)
            r1.mo5044g(r2)
            com.google.android.gms.internal.ads.b81[] r1 = new com.google.android.gms.internal.ads.b81[r6]
            com.google.android.gms.internal.ads.m r2 = r0.f12637g
            java.util.Objects.requireNonNull(r2)
            r1[r9] = r2
            r0.m15036d(r1)
            r0.f12633c = r5
        L_0x00a4:
            return r9
        L_0x00a5:
            r2.f10817a = r7
            return r6
        L_0x00a8:
            int r2 = r0.f12634d
            r3 = 65505(0xffe1, float:9.1792E-41)
            if (r2 != r3) goto L_0x0160
            com.google.android.gms.internal.ads.dr2 r2 = new com.google.android.gms.internal.ads.dr2
            int r3 = r0.f12635e
            r2.<init>((int) r3)
            byte[] r3 = r2.mo6582h()
            int r4 = r0.f12635e
            r6 = r1
            com.google.android.gms.internal.ads.jc4 r6 = (com.google.android.gms.internal.ads.jc4) r6
            r6.mo6916m(r3, r9, r4, r9)
            com.google.android.gms.internal.ads.m r3 = r0.f12637g
            if (r3 != 0) goto L_0x015e
            java.lang.String r3 = r2.mo6570D(r9)
            java.lang.String r4 = "http://ns.adobe.com/xap/1.0/"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x015e
            java.lang.String r2 = r2.mo6570D(r9)
            if (r2 == 0) goto L_0x015e
            long r3 = r24.mo6909c()
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x00e3
        L_0x00e0:
            r6 = 0
            goto L_0x0154
        L_0x00e3:
            com.google.android.gms.internal.ads.re4 r1 = com.google.android.gms.internal.ads.ve4.m18515a(r2)
            if (r1 != 0) goto L_0x00ea
            goto L_0x00e0
        L_0x00ea:
            java.util.List<com.google.android.gms.internal.ads.qe4> r2 = r1.f13620b
            int r2 = r2.size()
            if (r2 >= r5) goto L_0x00f3
            goto L_0x00e0
        L_0x00f3:
            java.util.List<com.google.android.gms.internal.ads.qe4> r2 = r1.f13620b
            int r2 = r2.size()
            int r2 = r2 + r10
            r11 = r7
            r13 = r11
            r17 = r13
            r19 = r17
            r5 = r9
        L_0x0101:
            if (r2 < 0) goto L_0x013a
            java.util.List<com.google.android.gms.internal.ads.qe4> r10 = r1.f13620b
            java.lang.Object r10 = r10.get(r2)
            com.google.android.gms.internal.ads.qe4 r10 = (com.google.android.gms.internal.ads.qe4) r10
            java.lang.String r15 = r10.f13145a
            java.lang.String r6 = "video/mp4"
            boolean r6 = r6.equals(r15)
            r5 = r5 | r6
            if (r2 != 0) goto L_0x011c
            long r9 = r10.f13148d
            long r3 = r3 - r9
            r9 = 0
            goto L_0x0120
        L_0x011c:
            long r9 = r10.f13147c
            long r9 = r3 - r9
        L_0x0120:
            r21 = r3
            r3 = r9
            r9 = r21
            if (r5 == 0) goto L_0x0130
            int r6 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x0130
            long r19 = r9 - r3
            r17 = r3
            r5 = 0
        L_0x0130:
            if (r2 != 0) goto L_0x0133
            r13 = r9
        L_0x0133:
            if (r2 != 0) goto L_0x0136
            r11 = r3
        L_0x0136:
            int r2 = r2 + -1
            r9 = 0
            goto L_0x0101
        L_0x013a:
            int r2 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x00e0
            int r2 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x00e0
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x00e0
            int r2 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x014b
            goto L_0x00e0
        L_0x014b:
            com.google.android.gms.internal.ads.m r6 = new com.google.android.gms.internal.ads.m
            long r1 = r1.f13619a
            r10 = r6
            r15 = r1
            r10.<init>(r11, r13, r15, r17, r19)
        L_0x0154:
            r0.f12637g = r6
            if (r6 == 0) goto L_0x015c
            long r1 = r6.f10218i
            r0.f12636f = r1
        L_0x015c:
            r3 = 0
            goto L_0x0168
        L_0x015e:
            r3 = r9
            goto L_0x0168
        L_0x0160:
            int r2 = r0.f12635e
            com.google.android.gms.internal.ads.jc4 r1 = (com.google.android.gms.internal.ads.jc4) r1
            r3 = 0
            r1.mo8447p(r2, r3)
        L_0x0168:
            r0.f12633c = r3
            return r3
        L_0x016b:
            r3 = r9
            com.google.android.gms.internal.ads.dr2 r2 = r0.f12631a
            r2.mo6577c(r5)
            com.google.android.gms.internal.ads.dr2 r2 = r0.f12631a
            byte[] r2 = r2.mo6582h()
            com.google.android.gms.internal.ads.jc4 r1 = (com.google.android.gms.internal.ads.jc4) r1
            r1.mo6916m(r2, r3, r5, r3)
            com.google.android.gms.internal.ads.dr2 r1 = r0.f12631a
            int r1 = r1.mo6597w()
            int r1 = r1 + -2
            r0.f12635e = r1
            r0.f12633c = r5
            return r3
        L_0x0189:
            r3 = r9
            com.google.android.gms.internal.ads.dr2 r2 = r0.f12631a
            r2.mo6577c(r5)
            com.google.android.gms.internal.ads.dr2 r2 = r0.f12631a
            byte[] r2 = r2.mo6582h()
            com.google.android.gms.internal.ads.jc4 r1 = (com.google.android.gms.internal.ads.jc4) r1
            r1.mo6916m(r2, r3, r5, r3)
            com.google.android.gms.internal.ads.dr2 r1 = r0.f12631a
            int r1 = r1.mo6597w()
            r0.f12634d = r1
            r2 = 65498(0xffda, float:9.1782E-41)
            if (r1 != r2) goto L_0x01b4
            long r1 = r0.f12636f
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x01b0
            r0.f12633c = r4
            goto L_0x01c5
        L_0x01b0:
            r23.m15035b()
            goto L_0x01c5
        L_0x01b4:
            r2 = 65488(0xffd0, float:9.1768E-41)
            if (r1 < r2) goto L_0x01be
            r2 = 65497(0xffd9, float:9.1781E-41)
            if (r1 <= r2) goto L_0x01c5
        L_0x01be:
            r2 = 65281(0xff01, float:9.1478E-41)
            if (r1 == r2) goto L_0x01c5
            r0.f12633c = r6
        L_0x01c5:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pe4.mo5042e(com.google.android.gms.internal.ads.pc4, com.google.android.gms.internal.ads.md4):int");
    }

    /* renamed from: g */
    public final void mo5044g(rc4 rc4) {
        this.f12632b = rc4;
    }

    /* renamed from: h */
    public final void mo5045h(long j, long j2) {
        if (j == 0) {
            this.f12633c = 0;
            this.f12640j = null;
        } else if (this.f12633c == 5) {
            C1835j1 j1Var = this.f12640j;
            Objects.requireNonNull(j1Var);
            j1Var.mo5045h(j, j2);
        }
    }
}
