package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;

public final class p24 implements w04 {

    /* renamed from: b */
    private int f12465b;

    /* renamed from: c */
    private float f12466c = 1.0f;

    /* renamed from: d */
    private float f12467d = 1.0f;

    /* renamed from: e */
    private u04 f12468e;

    /* renamed from: f */
    private u04 f12469f;

    /* renamed from: g */
    private u04 f12470g;

    /* renamed from: h */
    private u04 f12471h;

    /* renamed from: i */
    private boolean f12472i;

    /* renamed from: j */
    private o24 f12473j;

    /* renamed from: k */
    private ByteBuffer f12474k;

    /* renamed from: l */
    private ShortBuffer f12475l;

    /* renamed from: m */
    private ByteBuffer f12476m;

    /* renamed from: n */
    private long f12477n;

    /* renamed from: o */
    private long f12478o;

    /* renamed from: p */
    private boolean f12479p;

    public p24() {
        u04 u04 = u04.f15311e;
        this.f12468e = u04;
        this.f12469f = u04;
        this.f12470g = u04;
        this.f12471h = u04;
        ByteBuffer byteBuffer = w04.f16648a;
        this.f12474k = byteBuffer;
        this.f12475l = byteBuffer.asShortBuffer();
        this.f12476m = byteBuffer;
        this.f12465b = -1;
    }

    /* renamed from: a */
    public final ByteBuffer mo9933a() {
        int a;
        o24 o24 = this.f12473j;
        if (o24 != null && (a = o24.mo9631a()) > 0) {
            if (this.f12474k.capacity() < a) {
                ByteBuffer order = ByteBuffer.allocateDirect(a).order(ByteOrder.nativeOrder());
                this.f12474k = order;
                this.f12475l = order.asShortBuffer();
            } else {
                this.f12474k.clear();
                this.f12475l.clear();
            }
            o24.mo9634d(this.f12475l);
            this.f12478o += (long) a;
            this.f12474k.limit(a);
            this.f12476m = this.f12474k;
        }
        ByteBuffer byteBuffer = this.f12476m;
        this.f12476m = w04.f16648a;
        return byteBuffer;
    }

    /* renamed from: b */
    public final u04 mo9934b(u04 u04) {
        if (u04.f15314c == 2) {
            int i = this.f12465b;
            if (i == -1) {
                i = u04.f15312a;
            }
            this.f12468e = u04;
            u04 u042 = new u04(i, u04.f15313b, 2);
            this.f12469f = u042;
            this.f12472i = true;
            return u042;
        }
        throw new v04(u04);
    }

    /* renamed from: c */
    public final void mo9935c() {
        if (mo9402e()) {
            u04 u04 = this.f12468e;
            this.f12470g = u04;
            u04 u042 = this.f12469f;
            this.f12471h = u042;
            if (this.f12472i) {
                this.f12473j = new o24(u04.f15312a, u04.f15313b, this.f12466c, this.f12467d, u042.f15312a);
            } else {
                o24 o24 = this.f12473j;
                if (o24 != null) {
                    o24.mo9633c();
                }
            }
        }
        this.f12476m = w04.f16648a;
        this.f12477n = 0;
        this.f12478o = 0;
        this.f12479p = false;
    }

    /* renamed from: d */
    public final void mo9936d() {
        this.f12466c = 1.0f;
        this.f12467d = 1.0f;
        u04 u04 = u04.f15311e;
        this.f12468e = u04;
        this.f12469f = u04;
        this.f12470g = u04;
        this.f12471h = u04;
        ByteBuffer byteBuffer = w04.f16648a;
        this.f12474k = byteBuffer;
        this.f12475l = byteBuffer.asShortBuffer();
        this.f12476m = byteBuffer;
        this.f12465b = -1;
        this.f12472i = false;
        this.f12473j = null;
        this.f12477n = 0;
        this.f12478o = 0;
        this.f12479p = false;
    }

    /* renamed from: e */
    public final boolean mo9402e() {
        if (this.f12469f.f15312a == -1) {
            return false;
        }
        if (Math.abs(this.f12466c - 4.0f) >= 1.0E-4f || Math.abs(this.f12467d - 4.0f) >= 1.0E-4f) {
            return true;
        }
        return this.f12469f.f15312a != this.f12468e.f15312a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.f12473j;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo9937f() {
        /*
            r3 = this;
            boolean r0 = r3.f12479p
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0012
            com.google.android.gms.internal.ads.o24 r0 = r3.f12473j
            if (r0 == 0) goto L_0x0013
            int r0 = r0.mo9631a()
            if (r0 == 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return r1
        L_0x0012:
            r1 = r2
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p24.mo9937f():boolean");
    }

    /* renamed from: g */
    public final void mo9938g() {
        o24 o24 = this.f12473j;
        if (o24 != null) {
            o24.mo9635e();
        }
        this.f12479p = true;
    }

    /* renamed from: h */
    public final void mo8062h(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            o24 o24 = this.f12473j;
            Objects.requireNonNull(o24);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f12477n += (long) remaining;
            o24.mo9636f(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    /* renamed from: i */
    public final long mo9939i(long j) {
        if (this.f12478o < 1024) {
            return (long) (((double) this.f12466c) * ((double) j));
        }
        long j2 = this.f12477n;
        o24 o24 = this.f12473j;
        Objects.requireNonNull(o24);
        long b = j2 - ((long) o24.mo9632b());
        int i = this.f12471h.f15312a;
        int i2 = this.f12470g.f15312a;
        if (i == i2) {
            return n13.m13621Z(j, b, this.f12478o);
        }
        return n13.m13621Z(j, b * ((long) i), this.f12478o * ((long) i2));
    }

    /* renamed from: j */
    public final void mo9940j(float f) {
        if (this.f12467d != f) {
            this.f12467d = f;
            this.f12472i = true;
        }
    }

    /* renamed from: k */
    public final void mo9941k(float f) {
        if (this.f12466c != f) {
            this.f12466c = f;
            this.f12472i = true;
        }
    }
}
