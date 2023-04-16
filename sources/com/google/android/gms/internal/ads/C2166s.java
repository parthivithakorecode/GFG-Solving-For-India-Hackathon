package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* renamed from: com.google.android.gms.internal.ads.s */
final class C2166s {

    /* renamed from: a */
    private final byte[] f14184a = new byte[8];

    /* renamed from: b */
    private final ArrayDeque<C2129r> f14185b = new ArrayDeque<>();

    /* renamed from: c */
    private final C1611d0 f14186c = new C1611d0();

    /* renamed from: d */
    private C2203t f14187d;

    /* renamed from: e */
    private int f14188e;

    /* renamed from: f */
    private int f14189f;

    /* renamed from: g */
    private long f14190g;

    /* renamed from: d */
    private final long m16547d(pc4 pc4, int i) {
        ((jc4) pc4).mo6916m(this.f14184a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f14184a[i2] & 255));
        }
        return j;
    }

    /* renamed from: a */
    public final void mo10692a(C2203t tVar) {
        this.f14187d = tVar;
    }

    /* renamed from: b */
    public final void mo10693b() {
        this.f14188e = 0;
        this.f14185b.clear();
        this.f14186c.mo6357e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0087, code lost:
        if (r0 == 1) goto L_0x0089;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo10694c(com.google.android.gms.internal.ads.pc4 r13) {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.t r0 = r12.f14187d
            com.google.android.gms.internal.ads.wu1.m19203b(r0)
        L_0x0005:
            java.util.ArrayDeque<com.google.android.gms.internal.ads.r> r0 = r12.f14185b
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.r r0 = (com.google.android.gms.internal.ads.C2129r) r0
            r1 = 1
            if (r0 == 0) goto L_0x0033
            long r2 = r13.mo6908b()
            long r4 = r0.f13417b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x001d
            goto L_0x0033
        L_0x001d:
            com.google.android.gms.internal.ads.t r13 = r12.f14187d
            java.util.ArrayDeque<com.google.android.gms.internal.ads.r> r0 = r12.f14185b
            java.lang.Object r0 = r0.pop()
            com.google.android.gms.internal.ads.r r0 = (com.google.android.gms.internal.ads.C2129r) r0
            int r0 = r0.f13416a
            com.google.android.gms.internal.ads.w r13 = (com.google.android.gms.internal.ads.C2314w) r13
            com.google.android.gms.internal.ads.a0 r13 = r13.f16644a
            r13.mo5043f(r0)
            return r1
        L_0x0033:
            int r0 = r12.f14188e
            r2 = 2
            r3 = 4
            r4 = 0
            if (r0 != 0) goto L_0x0087
            com.google.android.gms.internal.ads.d0 r0 = r12.f14186c
            long r5 = r0.mo6356d(r13, r1, r4, r3)
            r7 = -2
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x007a
            r13.mo6914i()
        L_0x0049:
            byte[] r0 = r12.f14184a
            r5 = r13
            com.google.android.gms.internal.ads.jc4 r5 = (com.google.android.gms.internal.ads.jc4) r5
            r5.mo6917n(r0, r4, r3, r4)
            byte[] r0 = r12.f14184a
            byte r0 = r0[r4]
            int r0 = com.google.android.gms.internal.ads.C1611d0.m7676b(r0)
            r6 = -1
            if (r0 == r6) goto L_0x0076
            if (r0 > r3) goto L_0x0076
            byte[] r6 = r12.f14184a
            long r6 = com.google.android.gms.internal.ads.C1611d0.m7677c(r6, r0, r4)
            int r6 = (int) r6
            com.google.android.gms.internal.ads.t r7 = r12.f14187d
            com.google.android.gms.internal.ads.w r7 = (com.google.android.gms.internal.ads.C2314w) r7
            com.google.android.gms.internal.ads.a0 r7 = r7.f16644a
            boolean r7 = com.google.android.gms.internal.ads.C1500a0.m5763o(r6)
            if (r7 == 0) goto L_0x0076
            r5.mo8447p(r0, r4)
            long r5 = (long) r6
            goto L_0x007a
        L_0x0076:
            r5.mo8447p(r1, r4)
            goto L_0x0049
        L_0x007a:
            r7 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0081
            return r4
        L_0x0081:
            int r0 = (int) r5
            r12.f14189f = r0
            r12.f14188e = r1
            goto L_0x0089
        L_0x0087:
            if (r0 != r1) goto L_0x0095
        L_0x0089:
            com.google.android.gms.internal.ads.d0 r0 = r12.f14186c
            r5 = 8
            long r5 = r0.mo6356d(r13, r4, r1, r5)
            r12.f14190g = r5
            r12.f14188e = r2
        L_0x0095:
            com.google.android.gms.internal.ads.t r0 = r12.f14187d
            int r5 = r12.f14189f
            com.google.android.gms.internal.ads.w r0 = (com.google.android.gms.internal.ads.C2314w) r0
            com.google.android.gms.internal.ads.a0 r0 = r0.f16644a
            int r0 = com.google.android.gms.internal.ads.C1500a0.m5762n(r5)
            if (r0 == 0) goto L_0x01a4
            r5 = 0
            if (r0 == r1) goto L_0x0181
            r6 = 8
            if (r0 == r2) goto L_0x0150
            r2 = 3
            if (r0 == r2) goto L_0x0105
            if (r0 == r3) goto L_0x00f4
            long r8 = r12.f14190g
            r10 = 4
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00d4
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00bc
            goto L_0x00d4
        L_0x00bc:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r0 = 40
            r13.<init>(r0)
            java.lang.String r0 = "Invalid float size: "
            r13.append(r0)
            r13.append(r8)
            java.lang.String r13 = r13.toString()
            com.google.android.gms.internal.ads.dz r13 = com.google.android.gms.internal.ads.C1646dz.m8223a(r13, r5)
            throw r13
        L_0x00d4:
            com.google.android.gms.internal.ads.t r0 = r12.f14187d
            int r2 = r12.f14189f
            int r5 = (int) r8
            long r6 = r12.m16547d(r13, r5)
            if (r5 != r3) goto L_0x00e6
            int r13 = (int) r6
            float r13 = java.lang.Float.intBitsToFloat(r13)
            double r5 = (double) r13
            goto L_0x00ea
        L_0x00e6:
            double r5 = java.lang.Double.longBitsToDouble(r6)
        L_0x00ea:
            com.google.android.gms.internal.ads.w r0 = (com.google.android.gms.internal.ads.C2314w) r0
            com.google.android.gms.internal.ads.a0 r13 = r0.f16644a
            r13.mo5046i(r2, r5)
            r12.f14188e = r4
            return r1
        L_0x00f4:
            com.google.android.gms.internal.ads.t r0 = r12.f14187d
            int r2 = r12.f14189f
            long r5 = r12.f14190g
            com.google.android.gms.internal.ads.w r0 = (com.google.android.gms.internal.ads.C2314w) r0
            com.google.android.gms.internal.ads.a0 r0 = r0.f16644a
            int r3 = (int) r5
            r0.mo5041d(r2, r3, r13)
            r12.f14188e = r4
            return r1
        L_0x0105:
            long r2 = r12.f14190g
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0138
            com.google.android.gms.internal.ads.t r0 = r12.f14187d
            int r5 = r12.f14189f
            int r2 = (int) r2
            if (r2 != 0) goto L_0x0118
            java.lang.String r13 = ""
            goto L_0x012e
        L_0x0118:
            byte[] r3 = new byte[r2]
            com.google.android.gms.internal.ads.jc4 r13 = (com.google.android.gms.internal.ads.jc4) r13
            r13.mo6916m(r3, r4, r2, r4)
        L_0x011f:
            if (r2 <= 0) goto L_0x0129
            int r13 = r2 + -1
            byte r6 = r3[r13]
            if (r6 != 0) goto L_0x0129
            r2 = r13
            goto L_0x011f
        L_0x0129:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r3, r4, r2)
        L_0x012e:
            com.google.android.gms.internal.ads.w r0 = (com.google.android.gms.internal.ads.C2314w) r0
            com.google.android.gms.internal.ads.a0 r0 = r0.f16644a
            r0.mo5049l(r5, r13)
            r12.f14188e = r4
            return r1
        L_0x0138:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r0 = 41
            r13.<init>(r0)
            java.lang.String r0 = "String element size: "
            r13.append(r0)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            com.google.android.gms.internal.ads.dz r13 = com.google.android.gms.internal.ads.C1646dz.m8223a(r13, r5)
            throw r13
        L_0x0150:
            long r2 = r12.f14190g
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0169
            com.google.android.gms.internal.ads.t r0 = r12.f14187d
            int r5 = r12.f14189f
            int r2 = (int) r2
            long r2 = r12.m16547d(r13, r2)
            com.google.android.gms.internal.ads.w r0 = (com.google.android.gms.internal.ads.C2314w) r0
            com.google.android.gms.internal.ads.a0 r13 = r0.f16644a
            r13.mo5047j(r5, r2)
            r12.f14188e = r4
            return r1
        L_0x0169:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r0 = 42
            r13.<init>(r0)
            java.lang.String r0 = "Invalid integer size: "
            r13.append(r0)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            com.google.android.gms.internal.ads.dz r13 = com.google.android.gms.internal.ads.C1646dz.m8223a(r13, r5)
            throw r13
        L_0x0181:
            long r7 = r13.mo6908b()
            long r2 = r12.f14190g
            java.util.ArrayDeque<com.google.android.gms.internal.ads.r> r13 = r12.f14185b
            com.google.android.gms.internal.ads.r r0 = new com.google.android.gms.internal.ads.r
            int r6 = r12.f14189f
            long r2 = r2 + r7
            r0.<init>(r6, r2, r5)
            r13.push(r0)
            com.google.android.gms.internal.ads.t r13 = r12.f14187d
            int r6 = r12.f14189f
            long r9 = r12.f14190g
            com.google.android.gms.internal.ads.w r13 = (com.google.android.gms.internal.ads.C2314w) r13
            com.google.android.gms.internal.ads.a0 r5 = r13.f16644a
            r5.mo5048k(r6, r7, r9)
            r12.f14188e = r4
            return r1
        L_0x01a4:
            long r0 = r12.f14190g
            r2 = r13
            com.google.android.gms.internal.ads.jc4 r2 = (com.google.android.gms.internal.ads.jc4) r2
            int r0 = (int) r0
            r2.mo8447p(r0, r4)
            r12.f14188e = r4
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2166s.mo10694c(com.google.android.gms.internal.ads.pc4):boolean");
    }
}
