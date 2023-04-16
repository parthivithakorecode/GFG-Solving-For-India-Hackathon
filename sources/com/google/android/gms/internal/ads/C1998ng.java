package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.google.android.gms.internal.ads.ng */
public final class C1998ng implements C1960mf {

    /* renamed from: b */
    private int f11451b = -1;

    /* renamed from: c */
    private int f11452c = -1;

    /* renamed from: d */
    private C1961mg f11453d;

    /* renamed from: e */
    private float f11454e = 1.0f;

    /* renamed from: f */
    private float f11455f = 1.0f;

    /* renamed from: g */
    private ByteBuffer f11456g;

    /* renamed from: h */
    private ShortBuffer f11457h;

    /* renamed from: i */
    private ByteBuffer f11458i;

    /* renamed from: j */
    private long f11459j;

    /* renamed from: k */
    private long f11460k;

    /* renamed from: l */
    private boolean f11461l;

    public C1998ng() {
        ByteBuffer byteBuffer = C1960mf.f10824a;
        this.f11456g = byteBuffer;
        this.f11457h = byteBuffer.asShortBuffer();
        this.f11458i = byteBuffer;
    }

    /* renamed from: a */
    public final int mo7927a() {
        return 2;
    }

    /* renamed from: b */
    public final void mo7928b() {
        this.f11453d.mo9235c();
        this.f11461l = true;
    }

    /* renamed from: c */
    public final ByteBuffer mo7929c() {
        ByteBuffer byteBuffer = this.f11458i;
        this.f11458i = C1960mf.f10824a;
        return byteBuffer;
    }

    /* renamed from: d */
    public final void mo7930d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f11459j += (long) remaining;
            this.f11453d.mo9236d(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int a = this.f11453d.mo9233a() * this.f11451b;
        int i = a + a;
        if (i > 0) {
            if (this.f11456g.capacity() < i) {
                ByteBuffer order = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                this.f11456g = order;
                this.f11457h = order.asShortBuffer();
            } else {
                this.f11456g.clear();
                this.f11457h.clear();
            }
            this.f11453d.mo9234b(this.f11457h);
            this.f11460k += (long) i;
            this.f11456g.limit(i);
            this.f11458i = this.f11456g;
        }
    }

    /* renamed from: e */
    public final void mo7931e() {
        this.f11453d = null;
        ByteBuffer byteBuffer = C1960mf.f10824a;
        this.f11456g = byteBuffer;
        this.f11457h = byteBuffer.asShortBuffer();
        this.f11458i = byteBuffer;
        this.f11451b = -1;
        this.f11452c = -1;
        this.f11459j = 0;
        this.f11460k = 0;
        this.f11461l = false;
    }

    /* renamed from: f */
    public final boolean mo7932f(int i, int i2, int i3) {
        if (i3 != 2) {
            throw new C1923lf(i, i2, i3);
        } else if (this.f11452c == i && this.f11451b == i2) {
            return false;
        } else {
            this.f11452c = i;
            this.f11451b = i2;
            return true;
        }
    }

    /* renamed from: g */
    public final void mo7933g() {
        C1961mg mgVar = new C1961mg(this.f11452c, this.f11451b);
        this.f11453d = mgVar;
        mgVar.mo9238f(this.f11454e);
        this.f11453d.mo9237e(this.f11455f);
        this.f11458i = C1960mf.f10824a;
        this.f11459j = 0;
        this.f11460k = 0;
        this.f11461l = false;
    }

    /* renamed from: h */
    public final boolean mo7934h() {
        return Math.abs(this.f11454e + -1.0f) >= 0.01f || Math.abs(this.f11455f + -1.0f) >= 0.01f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.f11453d;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo7935i() {
        /*
            r3 = this;
            boolean r0 = r3.f11461l
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0012
            com.google.android.gms.internal.ads.mg r0 = r3.f11453d
            if (r0 == 0) goto L_0x0013
            int r0 = r0.mo9233a()
            if (r0 == 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return r1
        L_0x0012:
            r1 = r2
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1998ng.mo7935i():boolean");
    }

    /* renamed from: j */
    public final float mo9522j(float f) {
        this.f11455f = C2449zm.m20722a(1.0f, 0.1f, 8.0f);
        return 1.0f;
    }

    /* renamed from: k */
    public final float mo9523k(float f) {
        float a = C2449zm.m20722a(f, 0.1f, 8.0f);
        this.f11454e = a;
        return a;
    }

    /* renamed from: l */
    public final long mo9524l() {
        return this.f11459j;
    }

    /* renamed from: m */
    public final long mo9525m() {
        return this.f11460k;
    }

    public final int zza() {
        return this.f11451b;
    }
}
