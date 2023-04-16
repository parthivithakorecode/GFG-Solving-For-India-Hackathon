package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qk */
final class C2113qk {

    /* renamed from: a */
    private int f13199a = 1000;

    /* renamed from: b */
    private int[] f13200b = new int[1000];

    /* renamed from: c */
    private long[] f13201c = new long[1000];

    /* renamed from: d */
    private int[] f13202d = new int[1000];

    /* renamed from: e */
    private int[] f13203e = new int[1000];

    /* renamed from: f */
    private long[] f13204f = new long[1000];

    /* renamed from: g */
    private C1888kh[] f13205g = new C1888kh[1000];

    /* renamed from: h */
    private C2367xe[] f13206h = new C2367xe[1000];

    /* renamed from: i */
    private int f13207i;

    /* renamed from: j */
    private int f13208j;

    /* renamed from: k */
    private int f13209k;

    /* renamed from: l */
    private int f13210l;

    /* renamed from: m */
    private long f13211m = Long.MIN_VALUE;

    /* renamed from: n */
    private long f13212n = Long.MIN_VALUE;

    /* renamed from: o */
    private boolean f13213o = true;

    /* renamed from: p */
    private boolean f13214p = true;

    /* renamed from: q */
    private C2367xe f13215q;

    /* renamed from: a */
    public final int mo10303a() {
        return this.f13208j + this.f13207i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001f, code lost:
        return -3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo10304b(com.google.android.gms.internal.ads.C2404ye r5, com.google.android.gms.internal.ads.C2257ug r6, boolean r7, boolean r8, com.google.android.gms.internal.ads.C2367xe r9, com.google.android.gms.internal.ads.C2076pk r10) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.mo10314l()     // Catch:{ all -> 0x0092 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x0020
            if (r8 == 0) goto L_0x0012
            r5 = 4
            r6.mo9760c(r5)     // Catch:{ all -> 0x0092 }
            monitor-exit(r4)
            return r3
        L_0x0012:
            com.google.android.gms.internal.ads.xe r6 = r4.f13215q     // Catch:{ all -> 0x0092 }
            if (r6 == 0) goto L_0x001e
            if (r7 != 0) goto L_0x001a
            if (r6 == r9) goto L_0x001e
        L_0x001a:
            r5.f17688a = r6     // Catch:{ all -> 0x0092 }
            monitor-exit(r4)
            return r1
        L_0x001e:
            monitor-exit(r4)
            return r2
        L_0x0020:
            if (r7 != 0) goto L_0x0088
            com.google.android.gms.internal.ads.xe[] r7 = r4.f13206h     // Catch:{ all -> 0x0092 }
            int r8 = r4.f13209k     // Catch:{ all -> 0x0092 }
            r7 = r7[r8]     // Catch:{ all -> 0x0092 }
            if (r7 == r9) goto L_0x002b
            goto L_0x0088
        L_0x002b:
            java.nio.ByteBuffer r5 = r6.f15546c     // Catch:{ all -> 0x0092 }
            if (r5 == 0) goto L_0x0086
            long[] r5 = r4.f13204f     // Catch:{ all -> 0x0092 }
            r0 = r5[r8]     // Catch:{ all -> 0x0092 }
            r6.f15547d = r0     // Catch:{ all -> 0x0092 }
            int[] r5 = r4.f13203e     // Catch:{ all -> 0x0092 }
            r5 = r5[r8]     // Catch:{ all -> 0x0092 }
            r6.mo9760c(r5)     // Catch:{ all -> 0x0092 }
            int[] r5 = r4.f13202d     // Catch:{ all -> 0x0092 }
            int r7 = r4.f13209k     // Catch:{ all -> 0x0092 }
            r5 = r5[r7]     // Catch:{ all -> 0x0092 }
            r10.f12674a = r5     // Catch:{ all -> 0x0092 }
            long[] r5 = r4.f13201c     // Catch:{ all -> 0x0092 }
            r8 = r5[r7]     // Catch:{ all -> 0x0092 }
            r10.f12675b = r8     // Catch:{ all -> 0x0092 }
            com.google.android.gms.internal.ads.kh[] r5 = r4.f13205g     // Catch:{ all -> 0x0092 }
            r5 = r5[r7]     // Catch:{ all -> 0x0092 }
            r10.f12677d = r5     // Catch:{ all -> 0x0092 }
            long r7 = r4.f13211m     // Catch:{ all -> 0x0092 }
            long r5 = r6.f15547d     // Catch:{ all -> 0x0092 }
            long r5 = java.lang.Math.max(r7, r5)     // Catch:{ all -> 0x0092 }
            r4.f13211m = r5     // Catch:{ all -> 0x0092 }
            int r5 = r4.f13207i     // Catch:{ all -> 0x0092 }
            int r5 = r5 + -1
            r4.f13207i = r5     // Catch:{ all -> 0x0092 }
            int r6 = r4.f13209k     // Catch:{ all -> 0x0092 }
            int r6 = r6 + 1
            r4.f13209k = r6     // Catch:{ all -> 0x0092 }
            int r7 = r4.f13208j     // Catch:{ all -> 0x0092 }
            int r7 = r7 + 1
            r4.f13208j = r7     // Catch:{ all -> 0x0092 }
            int r7 = r4.f13199a     // Catch:{ all -> 0x0092 }
            r8 = 0
            if (r6 != r7) goto L_0x0074
            r4.f13209k = r8     // Catch:{ all -> 0x0092 }
            r6 = r8
        L_0x0074:
            if (r5 <= 0) goto L_0x007b
            long[] r5 = r4.f13201c     // Catch:{ all -> 0x0092 }
            r6 = r5[r6]     // Catch:{ all -> 0x0092 }
            goto L_0x0082
        L_0x007b:
            long r5 = r10.f12675b     // Catch:{ all -> 0x0092 }
            int r7 = r10.f12674a     // Catch:{ all -> 0x0092 }
            long r7 = (long) r7     // Catch:{ all -> 0x0092 }
            long r6 = r5 + r7
        L_0x0082:
            r10.f12676c = r6     // Catch:{ all -> 0x0092 }
            monitor-exit(r4)
            return r3
        L_0x0086:
            monitor-exit(r4)
            return r2
        L_0x0088:
            com.google.android.gms.internal.ads.xe[] r6 = r4.f13206h     // Catch:{ all -> 0x0092 }
            int r7 = r4.f13209k     // Catch:{ all -> 0x0092 }
            r6 = r6[r7]     // Catch:{ all -> 0x0092 }
            r5.f17688a = r6     // Catch:{ all -> 0x0092 }
            monitor-exit(r4)
            return r1
        L_0x0092:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2113qk.mo10304b(com.google.android.gms.internal.ads.ye, com.google.android.gms.internal.ads.ug, boolean, boolean, com.google.android.gms.internal.ads.xe, com.google.android.gms.internal.ads.pk):int");
    }

    /* renamed from: c */
    public final synchronized long mo10305c() {
        return Math.max(this.f13211m, this.f13212n);
    }

    /* renamed from: d */
    public final synchronized long mo10306d() {
        if (!mo10314l()) {
            return -1;
        }
        int i = this.f13209k;
        int i2 = this.f13207i;
        int i3 = i + i2;
        int i4 = this.f13199a;
        int i5 = (i3 - 1) % i4;
        this.f13209k = i3 % i4;
        this.f13208j += i2;
        this.f13207i = 0;
        return this.f13201c[i5] + ((long) this.f13202d[i5]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005d, code lost:
        return -1;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo10307e(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.mo10314l()     // Catch:{ all -> 0x005e }
            r1 = -1
            if (r0 == 0) goto L_0x005c
            long[] r0 = r8.f13204f     // Catch:{ all -> 0x005e }
            int r3 = r8.f13209k     // Catch:{ all -> 0x005e }
            r4 = r0[r3]     // Catch:{ all -> 0x005e }
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            goto L_0x005c
        L_0x0014:
            long r4 = r8.f13212n     // Catch:{ all -> 0x005e }
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            r4 = 0
            r5 = -1
            if (r0 <= 0) goto L_0x0021
            if (r11 == 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            monitor-exit(r8)
            return r1
        L_0x0021:
            r11 = r5
        L_0x0022:
            int r0 = r8.f13210l     // Catch:{ all -> 0x005e }
            if (r3 == r0) goto L_0x0040
            long[] r0 = r8.f13204f     // Catch:{ all -> 0x005e }
            r6 = r0[r3]     // Catch:{ all -> 0x005e }
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x002f
            goto L_0x0040
        L_0x002f:
            int[] r0 = r8.f13203e     // Catch:{ all -> 0x005e }
            r0 = r0[r3]     // Catch:{ all -> 0x005e }
            r6 = 1
            r0 = r0 & r6
            if (r6 != r0) goto L_0x0038
            r11 = r4
        L_0x0038:
            int r3 = r3 + 1
            int r0 = r8.f13199a     // Catch:{ all -> 0x005e }
            int r3 = r3 % r0
            int r4 = r4 + 1
            goto L_0x0022
        L_0x0040:
            if (r11 != r5) goto L_0x0044
            monitor-exit(r8)
            return r1
        L_0x0044:
            int r9 = r8.f13209k     // Catch:{ all -> 0x005e }
            int r9 = r9 + r11
            int r10 = r8.f13199a     // Catch:{ all -> 0x005e }
            int r9 = r9 % r10
            r8.f13209k = r9     // Catch:{ all -> 0x005e }
            int r10 = r8.f13208j     // Catch:{ all -> 0x005e }
            int r10 = r10 + r11
            r8.f13208j = r10     // Catch:{ all -> 0x005e }
            int r10 = r8.f13207i     // Catch:{ all -> 0x005e }
            int r10 = r10 - r11
            r8.f13207i = r10     // Catch:{ all -> 0x005e }
            long[] r10 = r8.f13201c     // Catch:{ all -> 0x005e }
            r9 = r10[r9]     // Catch:{ all -> 0x005e }
            monitor-exit(r8)
            return r9
        L_0x005c:
            monitor-exit(r8)
            return r1
        L_0x005e:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2113qk.mo10307e(long, boolean):long");
    }

    /* renamed from: f */
    public final synchronized C2367xe mo10308f() {
        if (this.f13214p) {
            return null;
        }
        return this.f13215q;
    }

    /* renamed from: g */
    public final void mo10309g() {
        this.f13208j = 0;
        this.f13209k = 0;
        this.f13210l = 0;
        this.f13207i = 0;
        this.f13213o = true;
    }

    /* renamed from: h */
    public final synchronized void mo10310h(long j, int i, long j2, int i2, C1888kh khVar) {
        if (this.f13213o) {
            if ((i & 1) != 0) {
                this.f13213o = false;
            } else {
                return;
            }
        }
        C1856jm.m11730e(!this.f13214p);
        mo10311i(j);
        long[] jArr = this.f13204f;
        int i3 = this.f13210l;
        jArr[i3] = j;
        long[] jArr2 = this.f13201c;
        jArr2[i3] = j2;
        this.f13202d[i3] = i2;
        this.f13203e[i3] = i;
        this.f13205g[i3] = khVar;
        this.f13206h[i3] = this.f13215q;
        this.f13200b[i3] = 0;
        int i4 = this.f13207i + 1;
        this.f13207i = i4;
        int i5 = this.f13199a;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            int[] iArr = new int[i6];
            long[] jArr3 = new long[i6];
            long[] jArr4 = new long[i6];
            int[] iArr2 = new int[i6];
            int[] iArr3 = new int[i6];
            C1888kh[] khVarArr = new C1888kh[i6];
            C2367xe[] xeVarArr = new C2367xe[i6];
            int i7 = this.f13209k;
            int i8 = i5 - i7;
            System.arraycopy(jArr2, i7, jArr3, 0, i8);
            System.arraycopy(this.f13204f, this.f13209k, jArr4, 0, i8);
            System.arraycopy(this.f13203e, this.f13209k, iArr2, 0, i8);
            System.arraycopy(this.f13202d, this.f13209k, iArr3, 0, i8);
            System.arraycopy(this.f13205g, this.f13209k, khVarArr, 0, i8);
            System.arraycopy(this.f13206h, this.f13209k, xeVarArr, 0, i8);
            System.arraycopy(this.f13200b, this.f13209k, iArr, 0, i8);
            int i9 = this.f13209k;
            System.arraycopy(this.f13201c, 0, jArr3, i8, i9);
            System.arraycopy(this.f13204f, 0, jArr4, i8, i9);
            System.arraycopy(this.f13203e, 0, iArr2, i8, i9);
            System.arraycopy(this.f13202d, 0, iArr3, i8, i9);
            System.arraycopy(this.f13205g, 0, khVarArr, i8, i9);
            System.arraycopy(this.f13206h, 0, xeVarArr, i8, i9);
            System.arraycopy(this.f13200b, 0, iArr, i8, i9);
            this.f13201c = jArr3;
            this.f13204f = jArr4;
            this.f13203e = iArr2;
            this.f13202d = iArr3;
            this.f13205g = khVarArr;
            this.f13206h = xeVarArr;
            this.f13200b = iArr;
            this.f13209k = 0;
            int i10 = this.f13199a;
            this.f13210l = i10;
            this.f13207i = i10;
            this.f13199a = i6;
            return;
        }
        int i11 = i3 + 1;
        this.f13210l = i11;
        if (i11 == i5) {
            this.f13210l = 0;
        }
    }

    /* renamed from: i */
    public final synchronized void mo10311i(long j) {
        this.f13212n = Math.max(this.f13212n, j);
    }

    /* renamed from: j */
    public final void mo10312j() {
        this.f13211m = Long.MIN_VALUE;
        this.f13212n = Long.MIN_VALUE;
    }

    /* renamed from: k */
    public final synchronized boolean mo10313k(C2367xe xeVar) {
        if (xeVar == null) {
            this.f13214p = true;
            return false;
        }
        this.f13214p = false;
        if (C2449zm.m20736o(xeVar, this.f13215q)) {
            return false;
        }
        this.f13215q = xeVar;
        return true;
    }

    /* renamed from: l */
    public final synchronized boolean mo10314l() {
        return this.f13207i != 0;
    }
}
