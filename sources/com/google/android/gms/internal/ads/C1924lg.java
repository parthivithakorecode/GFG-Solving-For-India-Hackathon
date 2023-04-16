package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.lg */
final class C1924lg implements C1960mf {

    /* renamed from: b */
    private int f10033b = -1;

    /* renamed from: c */
    private int f10034c = -1;

    /* renamed from: d */
    private int f10035d = 0;

    /* renamed from: e */
    private ByteBuffer f10036e;

    /* renamed from: f */
    private ByteBuffer f10037f;

    /* renamed from: g */
    private boolean f10038g;

    public C1924lg() {
        ByteBuffer byteBuffer = C1960mf.f10824a;
        this.f10036e = byteBuffer;
        this.f10037f = byteBuffer;
    }

    /* renamed from: a */
    public final int mo7927a() {
        return 2;
    }

    /* renamed from: b */
    public final void mo7928b() {
        this.f10038g = true;
    }

    /* renamed from: c */
    public final ByteBuffer mo7929c() {
        ByteBuffer byteBuffer = this.f10037f;
        this.f10037f = C1960mf.f10824a;
        return byteBuffer;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0080 A[LOOP:2: B:23:0x0080->B:24:0x0082, LOOP_START, PHI: r0 
      PHI: (r0v2 int) = (r0v0 int), (r0v3 int) binds: [B:14:0x0040, B:24:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7930d(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f10035d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L_0x0020
            if (r3 == r6) goto L_0x0021
            if (r3 != r4) goto L_0x001a
            int r2 = r2 / 2
            goto L_0x0022
        L_0x001a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0020:
            int r2 = r2 / r6
        L_0x0021:
            int r2 = r2 + r2
        L_0x0022:
            java.nio.ByteBuffer r3 = r7.f10036e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L_0x0039
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f10036e = r2
            goto L_0x003e
        L_0x0039:
            java.nio.ByteBuffer r2 = r7.f10036e
            r2.clear()
        L_0x003e:
            int r2 = r7.f10035d
            if (r2 == r5) goto L_0x0080
            if (r2 == r6) goto L_0x0067
            if (r2 != r4) goto L_0x0061
        L_0x0046:
            if (r0 >= r1) goto L_0x009b
            java.nio.ByteBuffer r2 = r7.f10036e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f10036e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L_0x0046
        L_0x0061:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0067:
            if (r0 >= r1) goto L_0x009b
            java.nio.ByteBuffer r2 = r7.f10036e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f10036e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + -128
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L_0x0067
        L_0x0080:
            if (r0 >= r1) goto L_0x009b
            java.nio.ByteBuffer r2 = r7.f10036e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f10036e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L_0x0080
        L_0x009b:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.f10036e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.f10036e
            r7.f10037f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1924lg.mo7930d(java.nio.ByteBuffer):void");
    }

    /* renamed from: e */
    public final void mo7931e() {
        mo7933g();
        this.f10036e = C1960mf.f10824a;
        this.f10033b = -1;
        this.f10034c = -1;
        this.f10035d = 0;
    }

    /* renamed from: f */
    public final boolean mo7932f(int i, int i2, int i3) {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new C1923lf(i, i2, i3);
        } else if (this.f10033b == i && this.f10034c == i2 && this.f10035d == i3) {
            return false;
        } else {
            this.f10033b = i;
            this.f10034c = i2;
            this.f10035d = i3;
            if (i3 != 2) {
                return true;
            }
            this.f10036e = C1960mf.f10824a;
            return true;
        }
    }

    /* renamed from: g */
    public final void mo7933g() {
        this.f10037f = C1960mf.f10824a;
        this.f10038g = false;
    }

    /* renamed from: h */
    public final boolean mo7934h() {
        int i = this.f10035d;
        return (i == 0 || i == 2) ? false : true;
    }

    /* renamed from: i */
    public final boolean mo7935i() {
        return this.f10038g && this.f10037f == C1960mf.f10824a;
    }

    public final int zza() {
        return this.f10034c;
    }
}
