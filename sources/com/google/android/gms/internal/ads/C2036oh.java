package com.google.android.gms.internal.ads;

import java.util.Stack;

/* renamed from: com.google.android.gms.internal.ads.oh */
final class C2036oh {

    /* renamed from: a */
    private final byte[] f12042a = new byte[8];

    /* renamed from: b */
    private final Stack<C1999nh> f12043b = new Stack<>();

    /* renamed from: c */
    private final C2370xh f12044c = new C2370xh();

    /* renamed from: d */
    private int f12045d;

    /* renamed from: e */
    private int f12046e;

    /* renamed from: f */
    private long f12047f;

    /* renamed from: g */
    private C2147rh f12048g;

    C2036oh() {
    }

    /* renamed from: d */
    private final long m14485d(C1554bh bhVar, int i) {
        bhVar.mo5861h(this.f12042a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f12042a[i2] & 255));
        }
        return j;
    }

    /* renamed from: a */
    public final void mo9784a() {
        this.f12045d = 0;
        this.f12043b.clear();
        this.f12044c.mo11844d();
    }

    /* renamed from: b */
    public final void mo9785b(C2147rh rhVar) {
        this.f12048g = rhVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        if (r0 == 1) goto L_0x008d;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo9786c(com.google.android.gms.internal.ads.C1554bh r12) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.rh r0 = r11.f12048g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0008
            r0 = r1
            goto L_0x0009
        L_0x0008:
            r0 = r2
        L_0x0009:
            com.google.android.gms.internal.ads.C1856jm.m11730e(r0)
        L_0x000c:
            java.util.Stack<com.google.android.gms.internal.ads.nh> r0 = r11.f12043b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x003d
            long r3 = r12.mo5857d()
            java.util.Stack<com.google.android.gms.internal.ads.nh> r0 = r11.f12043b
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.nh r0 = (com.google.android.gms.internal.ads.C1999nh) r0
            long r5 = r0.f11464b
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0029
            goto L_0x003d
        L_0x0029:
            com.google.android.gms.internal.ads.rh r12 = r11.f12048g
            java.util.Stack<com.google.android.gms.internal.ads.nh> r0 = r11.f12043b
            java.lang.Object r0 = r0.pop()
            com.google.android.gms.internal.ads.nh r0 = (com.google.android.gms.internal.ads.C1999nh) r0
            int r0 = r0.f11463a
            com.google.android.gms.internal.ads.vh r12 = r12.f13641a
            r12.mo11469c(r0)
            return r1
        L_0x003d:
            int r0 = r11.f12045d
            r3 = 2
            r4 = 4
            if (r0 != 0) goto L_0x008b
            com.google.android.gms.internal.ads.xh r0 = r11.f12044c
            long r5 = r0.mo11845e(r12, r1, r2, r4)
            r7 = -2
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x007e
            r12.mo5858e()
        L_0x0052:
            byte[] r0 = r11.f12042a
            r12.mo5860g(r0, r2, r4, r2)
            byte[] r0 = r11.f12042a
            byte r0 = r0[r2]
            int r0 = com.google.android.gms.internal.ads.C2370xh.m19507b(r0)
            r5 = -1
            if (r0 == r5) goto L_0x007a
            if (r0 > r4) goto L_0x007a
            byte[] r5 = r11.f12042a
            long r5 = com.google.android.gms.internal.ads.C2370xh.m19508c(r5, r0, r2)
            int r5 = (int) r5
            com.google.android.gms.internal.ads.rh r6 = r11.f12048g
            com.google.android.gms.internal.ads.vh r6 = r6.f13641a
            boolean r6 = com.google.android.gms.internal.ads.C2295vh.m18537m(r5)
            if (r6 == 0) goto L_0x007a
            r12.mo5862i(r0, r2)
            long r5 = (long) r5
            goto L_0x007e
        L_0x007a:
            r12.mo5862i(r1, r2)
            goto L_0x0052
        L_0x007e:
            r7 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0085
            return r2
        L_0x0085:
            int r0 = (int) r5
            r11.f12046e = r0
            r11.f12045d = r1
            goto L_0x008d
        L_0x008b:
            if (r0 != r1) goto L_0x0099
        L_0x008d:
            com.google.android.gms.internal.ads.xh r0 = r11.f12044c
            r5 = 8
            long r5 = r0.mo11845e(r12, r2, r1, r5)
            r11.f12047f = r5
            r11.f12045d = r3
        L_0x0099:
            com.google.android.gms.internal.ads.rh r0 = r11.f12048g
            int r5 = r11.f12046e
            com.google.android.gms.internal.ads.vh r0 = r0.f13641a
            int r0 = com.google.android.gms.internal.ads.C2295vh.m18536l(r5)
            if (r0 == 0) goto L_0x0193
            if (r0 == r1) goto L_0x0171
            r5 = 8
            if (r0 == r3) goto L_0x0141
            r3 = 3
            if (r0 == r3) goto L_0x0103
            if (r0 == r4) goto L_0x00f4
            long r7 = r11.f12047f
            r9 = 4
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x00d6
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x00bd
            goto L_0x00d6
        L_0x00bd:
            com.google.android.gms.internal.ads.af r12 = new com.google.android.gms.internal.ads.af
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 40
            r0.<init>(r1)
            java.lang.String r1 = "Invalid float size: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        L_0x00d6:
            com.google.android.gms.internal.ads.rh r0 = r11.f12048g
            int r3 = r11.f12046e
            int r5 = (int) r7
            long r6 = r11.m14485d(r12, r5)
            if (r5 != r4) goto L_0x00e8
            int r12 = (int) r6
            float r12 = java.lang.Float.intBitsToFloat(r12)
            double r4 = (double) r12
            goto L_0x00ec
        L_0x00e8:
            double r4 = java.lang.Double.longBitsToDouble(r6)
        L_0x00ec:
            com.google.android.gms.internal.ads.vh r12 = r0.f13641a
            r12.mo11470g(r3, r4)
            r11.f12045d = r2
            return r1
        L_0x00f4:
            com.google.android.gms.internal.ads.rh r0 = r11.f12048g
            int r3 = r11.f12046e
            long r4 = r11.f12047f
            com.google.android.gms.internal.ads.vh r0 = r0.f13641a
            int r4 = (int) r4
            r0.mo11474k(r3, r4, r12)
            r11.f12045d = r2
            return r1
        L_0x0103:
            long r3 = r11.f12047f
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0128
            com.google.android.gms.internal.ads.rh r0 = r11.f12048g
            int r5 = r11.f12046e
            int r3 = (int) r3
            if (r3 != 0) goto L_0x0116
            java.lang.String r12 = ""
            goto L_0x0120
        L_0x0116:
            byte[] r4 = new byte[r3]
            r12.mo5861h(r4, r2, r3, r2)
            java.lang.String r12 = new java.lang.String
            r12.<init>(r4)
        L_0x0120:
            com.google.android.gms.internal.ads.vh r0 = r0.f13641a
            r0.mo11473j(r5, r12)
            r11.f12045d = r2
            return r1
        L_0x0128:
            com.google.android.gms.internal.ads.af r12 = new com.google.android.gms.internal.ads.af
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 41
            r0.<init>(r1)
            java.lang.String r1 = "String element size: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        L_0x0141:
            long r3 = r11.f12047f
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0158
            com.google.android.gms.internal.ads.rh r0 = r11.f12048g
            int r5 = r11.f12046e
            int r3 = (int) r3
            long r3 = r11.m14485d(r12, r3)
            com.google.android.gms.internal.ads.vh r12 = r0.f13641a
            r12.mo11471h(r5, r3)
            r11.f12045d = r2
            return r1
        L_0x0158:
            com.google.android.gms.internal.ads.af r12 = new com.google.android.gms.internal.ads.af
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 42
            r0.<init>(r1)
            java.lang.String r1 = "Invalid integer size: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        L_0x0171:
            long r5 = r12.mo5857d()
            long r3 = r11.f12047f
            java.util.Stack<com.google.android.gms.internal.ads.nh> r12 = r11.f12043b
            com.google.android.gms.internal.ads.nh r0 = new com.google.android.gms.internal.ads.nh
            int r7 = r11.f12046e
            long r3 = r3 + r5
            r8 = 0
            r0.<init>(r7, r3, r8)
            r12.add(r0)
            com.google.android.gms.internal.ads.rh r12 = r11.f12048g
            int r4 = r11.f12046e
            long r7 = r11.f12047f
            com.google.android.gms.internal.ads.vh r3 = r12.f13641a
            r3.mo11472i(r4, r5, r7)
            r11.f12045d = r2
            return r1
        L_0x0193:
            long r3 = r11.f12047f
            int r0 = (int) r3
            r12.mo5862i(r0, r2)
            r11.f12045d = r2
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2036oh.mo9786c(com.google.android.gms.internal.ads.bh):boolean");
    }
}
