package com.google.android.gms.internal.ads;

import java.util.Objects;

public final class z44 implements r54, q54 {

    /* renamed from: f */
    public final r54 f18027f;

    /* renamed from: g */
    private q54 f18028g;

    /* renamed from: h */
    private y44[] f18029h = new y44[0];

    /* renamed from: i */
    private long f18030i = 0;

    /* renamed from: j */
    long f18031j;

    public z44(r54 r54, boolean z, long j, long j2) {
        this.f18027f = r54;
        this.f18031j = j2;
    }

    /* renamed from: a */
    public final long mo6836a() {
        long a = this.f18027f.mo6836a();
        if (a != Long.MIN_VALUE) {
            long j = this.f18031j;
            if (j == Long.MIN_VALUE || a < j) {
                return a;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r0 > r3) goto L_0x0036;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo7243b(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f18030i = r0
            com.google.android.gms.internal.ads.y44[] r0 = r7.f18029h
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.mo11963d()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            com.google.android.gms.internal.ads.r54 r0 = r7.f18027f
            long r0 = r0.mo7243b(r8)
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r9 = 1
            if (r8 == 0) goto L_0x0035
            r3 = 0
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 < 0) goto L_0x0036
            long r3 = r7.f18031j
            r5 = -9223372036854775808
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x0035
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 > 0) goto L_0x0036
        L_0x0035:
            r2 = r9
        L_0x0036:
            com.google.android.gms.internal.ads.wu1.m19207f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z44.mo7243b(long):long");
    }

    /* renamed from: c */
    public final long mo6837c() {
        long c = this.f18027f.mo6837c();
        if (c != Long.MIN_VALUE) {
            long j = this.f18031j;
            if (j == Long.MIN_VALUE || c < j) {
                return c;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: d */
    public final hm0 mo7244d() {
        return this.f18027f.mo7244d();
    }

    /* renamed from: e */
    public final boolean mo6838e(long j) {
        return this.f18027f.mo6838e(j);
    }

    /* renamed from: f */
    public final void mo6839f(long j) {
        this.f18027f.mo6839f(j);
    }

    /* renamed from: g */
    public final long mo7245g() {
        if (mo12147p()) {
            long j = this.f18030i;
            this.f18030i = -9223372036854775807L;
            long g = mo7245g();
            return g != -9223372036854775807L ? g : j;
        }
        long g2 = this.f18027f.mo7245g();
        if (g2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = false;
        wu1.m19207f(g2 >= 0);
        long j2 = this.f18031j;
        if (j2 == Long.MIN_VALUE || g2 <= j2) {
            z = true;
        }
        wu1.m19207f(z);
        return g2;
    }

    /* renamed from: h */
    public final void mo5559h(r54 r54) {
        q54 q54 = this.f18028g;
        Objects.requireNonNull(q54);
        q54.mo5559h(this);
    }

    /* renamed from: i */
    public final void mo7246i() {
        this.f18027f.mo7246i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r4 > r8) goto L_0x004e;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo7247j(com.google.android.gms.internal.ads.w74[] r15, boolean[] r16, com.google.android.gms.internal.ads.i74[] r17, boolean[] r18, long r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r17
            int r2 = r1.length
            com.google.android.gms.internal.ads.y44[] r3 = new com.google.android.gms.internal.ads.y44[r2]
            r0.f18029h = r3
            com.google.android.gms.internal.ads.i74[] r2 = new com.google.android.gms.internal.ads.i74[r2]
            r3 = 0
            r4 = r3
        L_0x000c:
            int r5 = r1.length
            r11 = 0
            if (r4 >= r5) goto L_0x0021
            com.google.android.gms.internal.ads.y44[] r5 = r0.f18029h
            r6 = r1[r4]
            com.google.android.gms.internal.ads.y44 r6 = (com.google.android.gms.internal.ads.y44) r6
            r5[r4] = r6
            if (r6 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.i74 r11 = r6.f17602a
        L_0x001c:
            r2[r4] = r11
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0021:
            com.google.android.gms.internal.ads.r54 r4 = r0.f18027f
            r5 = r15
            r6 = r16
            r7 = r2
            r8 = r18
            r9 = r19
            long r4 = r4.mo7247j(r5, r6, r7, r8, r9)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f18030i = r6
            int r6 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            r7 = 1
            if (r6 == 0) goto L_0x004f
            r8 = 0
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x004e
            long r8 = r0.f18031j
            r12 = -9223372036854775808
            int r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x004f
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r7 = r3
        L_0x004f:
            com.google.android.gms.internal.ads.wu1.m19207f(r7)
        L_0x0052:
            int r6 = r1.length
            if (r3 >= r6) goto L_0x0078
            r6 = r2[r3]
            if (r6 != 0) goto L_0x005e
            com.google.android.gms.internal.ads.y44[] r6 = r0.f18029h
            r6[r3] = r11
            goto L_0x006f
        L_0x005e:
            com.google.android.gms.internal.ads.y44[] r7 = r0.f18029h
            r8 = r7[r3]
            if (r8 == 0) goto L_0x0068
            com.google.android.gms.internal.ads.i74 r8 = r8.f17602a
            if (r8 == r6) goto L_0x006f
        L_0x0068:
            com.google.android.gms.internal.ads.y44 r8 = new com.google.android.gms.internal.ads.y44
            r8.<init>(r14, r6)
            r7[r3] = r8
        L_0x006f:
            com.google.android.gms.internal.ads.y44[] r6 = r0.f18029h
            r6 = r6[r3]
            r1[r3] = r6
            int r3 = r3 + 1
            goto L_0x0052
        L_0x0078:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z44.mo7247j(com.google.android.gms.internal.ads.w74[], boolean[], com.google.android.gms.internal.ads.i74[], boolean[], long):long");
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo5562k(k74 k74) {
        r54 r54 = (r54) k74;
        q54 q54 = this.f18028g;
        Objects.requireNonNull(q54);
        q54.mo5562k(this);
    }

    /* renamed from: l */
    public final long mo7248l(long j, ay3 ay3) {
        if (j == 0) {
            return 0;
        }
        long U = n13.m13616U(ay3.f4434a, 0, j);
        long j2 = ay3.f4435b;
        long j3 = this.f18031j;
        long U2 = n13.m13616U(j2, 0, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (!(U == ay3.f4434a && U2 == ay3.f4435b)) {
            ay3 = new ay3(U, U2);
        }
        return this.f18027f.mo7248l(j, ay3);
    }

    /* renamed from: m */
    public final void mo12146m(long j, long j2) {
        this.f18031j = j2;
    }

    /* renamed from: n */
    public final boolean mo6840n() {
        return this.f18027f.mo6840n();
    }

    /* renamed from: o */
    public final void mo7249o(q54 q54, long j) {
        this.f18028g = q54;
        this.f18027f.mo7249o(this, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final boolean mo12147p() {
        return this.f18030i != -9223372036854775807L;
    }

    /* renamed from: s */
    public final void mo7250s(long j, boolean z) {
        this.f18027f.mo7250s(j, false);
    }
}
