package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.Log;
import java.util.Objects;

public final class h74 implements td4 {

    /* renamed from: A */
    private C1574c0 f8076A;

    /* renamed from: B */
    private boolean f8077B;

    /* renamed from: C */
    private boolean f8078C;

    /* renamed from: D */
    private c34 f8079D;

    /* renamed from: a */
    private final b74 f8080a;

    /* renamed from: b */
    private final d74 f8081b = new d74();

    /* renamed from: c */
    private final n74<f74> f8082c = new n74<>(c74.f5332a);

    /* renamed from: d */
    private final b34 f8083d;

    /* renamed from: e */
    private final v24 f8084e;

    /* renamed from: f */
    private final Looper f8085f;

    /* renamed from: g */
    private g74 f8086g;

    /* renamed from: h */
    private C1574c0 f8087h;

    /* renamed from: i */
    private int f8088i = 1000;

    /* renamed from: j */
    private int[] f8089j = new int[1000];

    /* renamed from: k */
    private long[] f8090k = new long[1000];

    /* renamed from: l */
    private int[] f8091l = new int[1000];

    /* renamed from: m */
    private int[] f8092m = new int[1000];

    /* renamed from: n */
    private long[] f8093n = new long[1000];

    /* renamed from: o */
    private sd4[] f8094o = new sd4[1000];

    /* renamed from: p */
    private int f8095p;

    /* renamed from: q */
    private int f8096q;

    /* renamed from: r */
    private int f8097r;

    /* renamed from: s */
    private int f8098s;

    /* renamed from: t */
    private long f8099t = Long.MIN_VALUE;

    /* renamed from: u */
    private long f8100u = Long.MIN_VALUE;

    /* renamed from: v */
    private long f8101v = Long.MIN_VALUE;

    /* renamed from: w */
    private boolean f8102w;

    /* renamed from: x */
    private boolean f8103x = true;

    /* renamed from: y */
    private boolean f8104y = true;

    /* renamed from: z */
    private C1574c0 f8105z;

    protected h74(g94 g94, Looper looper, b34 b34, v24 v24, byte[] bArr) {
        this.f8085f = looper;
        this.f8083d = b34;
        this.f8084e = v24;
        this.f8080a = new b74(g94, (byte[]) null);
    }

    /* renamed from: A */
    static /* synthetic */ void m10352A(f74 f74) {
        a34 a34 = f74.f6739b;
        int i = z24.f17996a;
    }

    /* renamed from: L */
    private final int m10353L(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = (this.f8093n[i] > j ? 1 : (this.f8093n[i] == j ? 0 : -1));
            if (i5 > 0) {
                break;
            }
            if (!z || (this.f8092m[i] & 1) != 0) {
                i3 = i4;
                if (i5 == 0) {
                    break;
                }
            }
            i++;
            if (i == this.f8088i) {
                i = 0;
            }
        }
        return i3;
    }

    /* renamed from: g */
    private final int m10354g(int i) {
        int i2 = this.f8097r + i;
        int i3 = this.f8088i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
        return -3;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized int m10355h(com.google.android.gms.internal.ads.cx3 r6, com.google.android.gms.internal.ads.z51 r7, boolean r8, boolean r9, com.google.android.gms.internal.ads.d74 r10) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r7.f18034d = r0     // Catch:{ all -> 0x0083 }
            boolean r0 = r5.m10363p()     // Catch:{ all -> 0x0083 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x002b
            if (r9 != 0) goto L_0x0025
            boolean r9 = r5.f8102w     // Catch:{ all -> 0x0083 }
            if (r9 == 0) goto L_0x0014
            goto L_0x0025
        L_0x0014:
            com.google.android.gms.internal.ads.c0 r7 = r5.f8076A     // Catch:{ all -> 0x0083 }
            if (r7 == 0) goto L_0x0023
            if (r8 != 0) goto L_0x001e
            com.google.android.gms.internal.ads.c0 r8 = r5.f8087h     // Catch:{ all -> 0x0083 }
            if (r7 == r8) goto L_0x0023
        L_0x001e:
            r5.m10360m(r7, r6)     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r1
        L_0x0023:
            monitor-exit(r5)
            return r2
        L_0x0025:
            r6 = 4
            r7.mo10911c(r6)     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r3
        L_0x002b:
            com.google.android.gms.internal.ads.n74<com.google.android.gms.internal.ads.f74> r9 = r5.f8082c     // Catch:{ all -> 0x0083 }
            int r0 = r5.f8096q     // Catch:{ all -> 0x0083 }
            int r4 = r5.f8098s     // Catch:{ all -> 0x0083 }
            int r0 = r0 + r4
            java.lang.Object r9 = r9.mo9460a(r0)     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.f74 r9 = (com.google.android.gms.internal.ads.f74) r9     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.c0 r9 = r9.f6738a     // Catch:{ all -> 0x0083 }
            if (r8 != 0) goto L_0x007e
            com.google.android.gms.internal.ads.c0 r8 = r5.f8087h     // Catch:{ all -> 0x0083 }
            if (r9 == r8) goto L_0x0041
            goto L_0x007e
        L_0x0041:
            int r6 = r5.f8098s     // Catch:{ all -> 0x0083 }
            int r6 = r5.m10354g(r6)     // Catch:{ all -> 0x0083 }
            boolean r8 = r5.m10364q(r6)     // Catch:{ all -> 0x0083 }
            if (r8 != 0) goto L_0x0052
            r6 = 1
            r7.f18034d = r6     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r2
        L_0x0052:
            int[] r8 = r5.f8092m     // Catch:{ all -> 0x0083 }
            r8 = r8[r6]     // Catch:{ all -> 0x0083 }
            r7.mo10911c(r8)     // Catch:{ all -> 0x0083 }
            long[] r8 = r5.f8093n     // Catch:{ all -> 0x0083 }
            r0 = r8[r6]     // Catch:{ all -> 0x0083 }
            r7.f18035e = r0     // Catch:{ all -> 0x0083 }
            long r8 = r5.f8099t     // Catch:{ all -> 0x0083 }
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x006a
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r7.mo10910a(r8)     // Catch:{ all -> 0x0083 }
        L_0x006a:
            int[] r7 = r5.f8091l     // Catch:{ all -> 0x0083 }
            r7 = r7[r6]     // Catch:{ all -> 0x0083 }
            r10.f5680a = r7     // Catch:{ all -> 0x0083 }
            long[] r7 = r5.f8090k     // Catch:{ all -> 0x0083 }
            r8 = r7[r6]     // Catch:{ all -> 0x0083 }
            r10.f5681b = r8     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.sd4[] r7 = r5.f8094o     // Catch:{ all -> 0x0083 }
            r6 = r7[r6]     // Catch:{ all -> 0x0083 }
            r10.f5682c = r6     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r3
        L_0x007e:
            r5.m10360m(r9, r6)     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r1
        L_0x0083:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h74.m10355h(com.google.android.gms.internal.ads.cx3, com.google.android.gms.internal.ads.z51, boolean, boolean, com.google.android.gms.internal.ads.d74):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        return -1;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized long m10356i(long r10, boolean r12, boolean r13) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r12 = r9.f8095p     // Catch:{ all -> 0x002f }
            r0 = -1
            if (r12 == 0) goto L_0x002d
            long[] r2 = r9.f8093n     // Catch:{ all -> 0x002f }
            int r4 = r9.f8097r     // Catch:{ all -> 0x002f }
            r5 = r2[r4]     // Catch:{ all -> 0x002f }
            int r2 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0012
            goto L_0x002d
        L_0x0012:
            if (r13 == 0) goto L_0x001a
            int r13 = r9.f8098s     // Catch:{ all -> 0x002f }
            if (r13 == r12) goto L_0x001a
            int r12 = r13 + 1
        L_0x001a:
            r5 = r12
            r8 = 0
            r3 = r9
            r6 = r10
            int r10 = r3.m10353L(r4, r5, r6, r8)     // Catch:{ all -> 0x002f }
            r11 = -1
            if (r10 != r11) goto L_0x0027
            monitor-exit(r9)
            return r0
        L_0x0027:
            long r10 = r9.m10358k(r10)     // Catch:{ all -> 0x002f }
            monitor-exit(r9)
            return r10
        L_0x002d:
            monitor-exit(r9)
            return r0
        L_0x002f:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h74.m10356i(long, boolean, boolean):long");
    }

    /* renamed from: j */
    private final synchronized long m10357j() {
        int i = this.f8095p;
        if (i == 0) {
            return -1;
        }
        return m10358k(i);
    }

    /* renamed from: k */
    private final long m10358k(int i) {
        long j = this.f8100u;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int g = m10354g(i - 1);
            for (int i2 = 0; i2 < i; i2++) {
                j2 = Math.max(j2, this.f8093n[g]);
                if ((this.f8092m[g] & 1) != 0) {
                    break;
                }
                g--;
                if (g == -1) {
                    g = this.f8088i - 1;
                }
            }
        }
        this.f8100u = Math.max(j, j2);
        this.f8095p -= i;
        int i3 = this.f8096q + i;
        this.f8096q = i3;
        int i4 = this.f8097r + i;
        this.f8097r = i4;
        int i5 = this.f8088i;
        if (i4 >= i5) {
            this.f8097r = i4 - i5;
        }
        int i6 = this.f8098s - i;
        this.f8098s = i6;
        if (i6 < 0) {
            this.f8098s = 0;
        }
        this.f8082c.mo9464e(i3);
        if (this.f8095p != 0) {
            return this.f8090k[this.f8097r];
        }
        int i7 = this.f8097r;
        if (i7 == 0) {
            i7 = this.f8088i;
        }
        int i8 = i7 - 1;
        return this.f8090k[i8] + ((long) this.f8091l[i8]);
    }

    /* renamed from: l */
    private final synchronized void m10359l(long j, int i, long j2, int i2, sd4 sd4) {
        int i3 = this.f8095p;
        if (i3 > 0) {
            int g = m10354g(i3 - 1);
            wu1.m19205d(this.f8090k[g] + ((long) this.f8091l[g]) <= j2);
        }
        this.f8102w = (536870912 & i) != 0;
        this.f8101v = Math.max(this.f8101v, j);
        int g2 = m10354g(this.f8095p);
        this.f8093n[g2] = j;
        this.f8090k[g2] = j2;
        this.f8091l[g2] = i2;
        this.f8092m[g2] = i;
        this.f8094o[g2] = sd4;
        this.f8089j[g2] = 0;
        if (this.f8082c.mo9465f() || !this.f8082c.mo9461b().f6738a.equals(this.f8076A)) {
            a34 a34 = a34.f3929a;
            n74<f74> n74 = this.f8082c;
            int i4 = this.f8096q + this.f8095p;
            C1574c0 c0Var = this.f8076A;
            Objects.requireNonNull(c0Var);
            n74.mo9462c(i4, new f74(c0Var, a34, (e74) null));
        }
        int i5 = this.f8095p + 1;
        this.f8095p = i5;
        int i6 = this.f8088i;
        if (i5 == i6) {
            int i7 = i6 + 1000;
            int[] iArr = new int[i7];
            long[] jArr = new long[i7];
            long[] jArr2 = new long[i7];
            int[] iArr2 = new int[i7];
            int[] iArr3 = new int[i7];
            sd4[] sd4Arr = new sd4[i7];
            int i8 = this.f8097r;
            int i9 = i6 - i8;
            System.arraycopy(this.f8090k, i8, jArr, 0, i9);
            System.arraycopy(this.f8093n, this.f8097r, jArr2, 0, i9);
            System.arraycopy(this.f8092m, this.f8097r, iArr2, 0, i9);
            System.arraycopy(this.f8091l, this.f8097r, iArr3, 0, i9);
            System.arraycopy(this.f8094o, this.f8097r, sd4Arr, 0, i9);
            System.arraycopy(this.f8089j, this.f8097r, iArr, 0, i9);
            int i10 = this.f8097r;
            System.arraycopy(this.f8090k, 0, jArr, i9, i10);
            System.arraycopy(this.f8093n, 0, jArr2, i9, i10);
            System.arraycopy(this.f8092m, 0, iArr2, i9, i10);
            System.arraycopy(this.f8091l, 0, iArr3, i9, i10);
            System.arraycopy(this.f8094o, 0, sd4Arr, i9, i10);
            System.arraycopy(this.f8089j, 0, iArr, i9, i10);
            this.f8090k = jArr;
            this.f8093n = jArr2;
            this.f8092m = iArr2;
            this.f8091l = iArr3;
            this.f8094o = sd4Arr;
            this.f8089j = iArr;
            this.f8097r = 0;
            this.f8088i = i7;
        }
    }

    /* renamed from: m */
    private final void m10360m(C1574c0 c0Var, cx3 cx3) {
        C1574c0 c0Var2 = this.f8087h;
        c34 c34 = null;
        u74 u74 = c0Var2 == null ? null : c0Var2.f5237o;
        this.f8087h = c0Var;
        u74 u742 = c0Var.f5237o;
        cx3.f5555a = c0Var.mo6005c(this.f8083d.mo5663a(c0Var));
        cx3.f5556b = this.f8079D;
        if (c0Var2 == null || !n13.m13643p(u74, u742)) {
            if (c0Var.f5237o != null) {
                c34 = new c34(new t24(new e34(1), 6001));
            }
            this.f8079D = c34;
            cx3.f5556b = c34;
        }
    }

    /* renamed from: n */
    private final void m10361n() {
        if (this.f8079D != null) {
            this.f8079D = null;
            this.f8087h = null;
        }
    }

    /* renamed from: o */
    private final synchronized void m10362o() {
        this.f8098s = 0;
        this.f8080a.mo5738g();
    }

    /* renamed from: p */
    private final boolean m10363p() {
        return this.f8098s != this.f8095p;
    }

    /* renamed from: q */
    private final boolean m10364q(int i) {
        if (this.f8079D != null) {
            return (this.f8092m[i] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    /* renamed from: r */
    private final synchronized boolean m10365r(C1574c0 c0Var) {
        this.f8104y = false;
        if (n13.m13643p(c0Var, this.f8076A)) {
            return false;
        }
        if (!this.f8082c.mo9465f() && this.f8082c.mo9461b().f6738a.equals(c0Var)) {
            c0Var = this.f8082c.mo9461b().f6738a;
        }
        this.f8076A = c0Var;
        C1574c0 c0Var2 = this.f8076A;
        this.f8077B = C1645dy.m8169f(c0Var2.f5234l, c0Var2.f5231i);
        this.f8078C = false;
        return true;
    }

    /* renamed from: B */
    public final void mo7862B() {
        c34 c34 = this.f8079D;
        if (c34 != null) {
            throw c34.mo6039a();
        }
    }

    /* renamed from: C */
    public final void mo7863C() {
        mo7885z();
        m10361n();
    }

    /* renamed from: D */
    public final void mo7864D() {
        mo7865E(true);
        m10361n();
    }

    /* renamed from: E */
    public final void mo7865E(boolean z) {
        this.f8080a.mo5737f();
        this.f8095p = 0;
        this.f8096q = 0;
        this.f8097r = 0;
        this.f8098s = 0;
        this.f8103x = true;
        this.f8099t = Long.MIN_VALUE;
        this.f8100u = Long.MIN_VALUE;
        this.f8101v = Long.MIN_VALUE;
        this.f8102w = false;
        this.f8082c.mo9463d();
        if (z) {
            this.f8105z = null;
            this.f8076A = null;
            this.f8104y = true;
        }
    }

    /* renamed from: F */
    public final void mo7866F(long j) {
        this.f8099t = j;
    }

    /* renamed from: G */
    public final void mo7867G(g74 g74) {
        this.f8086g = g74;
    }

    /* renamed from: H */
    public final synchronized void mo7868H(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.f8098s + i <= this.f8095p) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        wu1.m19205d(z);
        this.f8098s += i;
    }

    /* renamed from: I */
    public final synchronized boolean mo7869I() {
        return this.f8102w;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001c, code lost:
        return r1;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo7870J(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.m10363p()     // Catch:{ all -> 0x003e }
            r1 = 1
            if (r0 != 0) goto L_0x001d
            r0 = 0
            if (r4 != 0) goto L_0x001b
            boolean r4 = r3.f8102w     // Catch:{ all -> 0x003e }
            if (r4 != 0) goto L_0x001b
            com.google.android.gms.internal.ads.c0 r4 = r3.f8076A     // Catch:{ all -> 0x003e }
            if (r4 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.c0 r2 = r3.f8087h     // Catch:{ all -> 0x003e }
            if (r4 == r2) goto L_0x0018
            goto L_0x001b
        L_0x0018:
            monitor-exit(r3)
            return r0
        L_0x001a:
            r1 = r0
        L_0x001b:
            monitor-exit(r3)
            return r1
        L_0x001d:
            com.google.android.gms.internal.ads.n74<com.google.android.gms.internal.ads.f74> r4 = r3.f8082c     // Catch:{ all -> 0x003e }
            int r0 = r3.f8096q     // Catch:{ all -> 0x003e }
            int r2 = r3.f8098s     // Catch:{ all -> 0x003e }
            int r0 = r0 + r2
            java.lang.Object r4 = r4.mo9460a(r0)     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.f74 r4 = (com.google.android.gms.internal.ads.f74) r4     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.c0 r4 = r4.f6738a     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.c0 r0 = r3.f8087h     // Catch:{ all -> 0x003e }
            if (r4 == r0) goto L_0x0032
            monitor-exit(r3)
            return r1
        L_0x0032:
            int r4 = r3.f8098s     // Catch:{ all -> 0x003e }
            int r4 = r3.m10354g(r4)     // Catch:{ all -> 0x003e }
            boolean r4 = r3.m10364q(r4)     // Catch:{ all -> 0x003e }
            monitor-exit(r3)
            return r4
        L_0x003e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h74.mo7870J(boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        return false;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo7871K(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.m10362o()     // Catch:{ all -> 0x003f }
            int r0 = r8.f8098s     // Catch:{ all -> 0x003f }
            int r2 = r8.m10354g(r0)     // Catch:{ all -> 0x003f }
            boolean r0 = r8.m10363p()     // Catch:{ all -> 0x003f }
            r7 = 0
            if (r0 == 0) goto L_0x003d
            long[] r0 = r8.f8093n     // Catch:{ all -> 0x003f }
            r3 = r0[r2]     // Catch:{ all -> 0x003f }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x003d
            long r0 = r8.f8101v     // Catch:{ all -> 0x003f }
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0021
            if (r11 == 0) goto L_0x003d
        L_0x0021:
            int r11 = r8.f8095p     // Catch:{ all -> 0x003f }
            int r0 = r8.f8098s     // Catch:{ all -> 0x003f }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r11 = r1.m10353L(r2, r3, r4, r6)     // Catch:{ all -> 0x003f }
            r0 = -1
            if (r11 != r0) goto L_0x0033
            monitor-exit(r8)
            return r7
        L_0x0033:
            r8.f8099t = r9     // Catch:{ all -> 0x003f }
            int r9 = r8.f8098s     // Catch:{ all -> 0x003f }
            int r9 = r9 + r11
            r8.f8098s = r9     // Catch:{ all -> 0x003f }
            r9 = 1
            monitor-exit(r8)
            return r9
        L_0x003d:
            monitor-exit(r8)
            return r7
        L_0x003f:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h74.mo7871K(long, boolean):boolean");
    }

    /* renamed from: a */
    public final void mo7872a(long j, int i, int i2, int i3, sd4 sd4) {
        int i4 = i & 1;
        if (this.f8103x) {
            if (i4 != 0) {
                this.f8103x = false;
            } else {
                return;
            }
        }
        if (this.f8077B) {
            if (j >= this.f8099t) {
                if (i4 == 0) {
                    if (!this.f8078C) {
                        Log.w("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.f8076A)));
                        this.f8078C = true;
                    }
                    i |= 1;
                }
            } else {
                return;
            }
        }
        m10359l(j, i, (this.f8080a.mo5733b() - ((long) i2)) - ((long) i3), i2, sd4);
    }

    /* renamed from: b */
    public final void mo7873b(C1574c0 c0Var) {
        this.f8105z = c0Var;
        boolean r = m10365r(c0Var);
        g74 g74 = this.f8086g;
        if (g74 != null && r) {
            g74.mo7526q(c0Var);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ int mo7874c(fc1 fc1, int i, boolean z) {
        return rd4.m16161a(this, fc1, i, true);
    }

    /* renamed from: d */
    public final int mo7875d(fc1 fc1, int i, boolean z, int i2) {
        return this.f8080a.mo5732a(fc1, i, z);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo7876e(dr2 dr2, int i) {
        rd4.m16162b(this, dr2, i);
    }

    /* renamed from: f */
    public final void mo7877f(dr2 dr2, int i, int i2) {
        this.f8080a.mo5739h(dr2, i);
    }

    /* renamed from: s */
    public final int mo7878s() {
        return this.f8096q + this.f8098s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r9 != -1) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        return 0;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo7879t(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f8098s     // Catch:{ all -> 0x003c }
            int r2 = r8.m10354g(r0)     // Catch:{ all -> 0x003c }
            boolean r0 = r8.m10363p()     // Catch:{ all -> 0x003c }
            r7 = 0
            if (r0 == 0) goto L_0x003a
            long[] r0 = r8.f8093n     // Catch:{ all -> 0x003c }
            r3 = r0[r2]     // Catch:{ all -> 0x003c }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            goto L_0x003a
        L_0x0017:
            long r0 = r8.f8101v     // Catch:{ all -> 0x003c }
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0027
            if (r11 != 0) goto L_0x0020
            goto L_0x0027
        L_0x0020:
            int r9 = r8.f8095p     // Catch:{ all -> 0x003c }
            int r10 = r8.f8098s     // Catch:{ all -> 0x003c }
            int r9 = r9 - r10
            monitor-exit(r8)
            return r9
        L_0x0027:
            int r11 = r8.f8095p     // Catch:{ all -> 0x003c }
            int r0 = r8.f8098s     // Catch:{ all -> 0x003c }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.m10353L(r2, r3, r4, r6)     // Catch:{ all -> 0x003c }
            r10 = -1
            monitor-exit(r8)
            if (r9 != r10) goto L_0x0039
            return r7
        L_0x0039:
            return r9
        L_0x003a:
            monitor-exit(r8)
            return r7
        L_0x003c:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h74.mo7879t(long, boolean):int");
    }

    /* renamed from: u */
    public final int mo7880u() {
        return this.f8096q + this.f8095p;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r9 != 0) goto L_0x003d;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo7881v(com.google.android.gms.internal.ads.cx3 r9, com.google.android.gms.internal.ads.z51 r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L_0x0007
            r5 = r1
            goto L_0x0009
        L_0x0007:
            r0 = 0
            r5 = r0
        L_0x0009:
            com.google.android.gms.internal.ads.d74 r7 = r8.f8081b
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.m10355h(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L_0x003e
            boolean r9 = r10.mo10915g()
            if (r9 != 0) goto L_0x003d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L_0x0034
            if (r9 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.b74 r9 = r8.f8080a
            com.google.android.gms.internal.ads.d74 r11 = r8.f8081b
            r9.mo5735d(r10, r11)
            goto L_0x003d
        L_0x002c:
            com.google.android.gms.internal.ads.b74 r9 = r8.f8080a
            com.google.android.gms.internal.ads.d74 r11 = r8.f8081b
            r9.mo5736e(r10, r11)
            goto L_0x0037
        L_0x0034:
            if (r9 == 0) goto L_0x0037
            goto L_0x003d
        L_0x0037:
            int r9 = r8.f8098s
            int r9 = r9 + r1
            r8.f8098s = r9
            return r12
        L_0x003d:
            r9 = r12
        L_0x003e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h74.mo7881v(com.google.android.gms.internal.ads.cx3, com.google.android.gms.internal.ads.z51, int, boolean):int");
    }

    /* renamed from: w */
    public final synchronized long mo7882w() {
        return this.f8101v;
    }

    /* renamed from: x */
    public final synchronized C1574c0 mo7883x() {
        if (this.f8104y) {
            return null;
        }
        return this.f8076A;
    }

    /* renamed from: y */
    public final void mo7884y(long j, boolean z, boolean z2) {
        this.f8080a.mo5734c(m10356i(j, false, z2));
    }

    /* renamed from: z */
    public final void mo7885z() {
        this.f8080a.mo5734c(m10357j());
    }
}
