package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class n24 extends u14 {

    /* renamed from: i */
    private int f11265i;

    /* renamed from: j */
    private boolean f11266j;

    /* renamed from: k */
    private byte[] f11267k;

    /* renamed from: l */
    private byte[] f11268l;

    /* renamed from: m */
    private int f11269m;

    /* renamed from: n */
    private int f11270n;

    /* renamed from: o */
    private int f11271o;

    /* renamed from: p */
    private boolean f11272p;

    /* renamed from: q */
    private long f11273q;

    public n24() {
        byte[] bArr = n13.f11241f;
        this.f11267k = bArr;
        this.f11268l = bArr;
    }

    /* renamed from: q */
    private final int m13659q(long j) {
        return (int) ((j * ((long) this.f15333b.f15312a)) / 1000000);
    }

    /* renamed from: r */
    private final int m13660r(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.getShort(position)) > 1024) {
                int i = this.f11265i;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: s */
    private final void m13661s(byte[] bArr, int i) {
        mo11147j(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f11272p = true;
        }
    }

    /* renamed from: t */
    private final void m13662t(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f11271o);
        int i2 = this.f11271o - min;
        System.arraycopy(bArr, i - i2, this.f11268l, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f11268l, i2, min);
    }

    /* renamed from: e */
    public final boolean mo9402e() {
        return this.f11266j;
    }

    /* renamed from: h */
    public final void mo8062h(ByteBuffer byteBuffer) {
        int limit;
        int position;
        while (byteBuffer.hasRemaining() && !mo11148n()) {
            int i = this.f11269m;
            int i2 = 1;
            if (i == 0) {
                limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f11267k.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 >= byteBuffer.position()) {
                        if (Math.abs(byteBuffer.getShort(limit2)) > 1024) {
                            int i3 = this.f11265i;
                            position = ((limit2 / i3) * i3) + i3;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position != byteBuffer.position()) {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    mo11147j(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f11272p = true;
                    }
                }
                this.f11269m = i2;
            } else if (i != 1) {
                limit = byteBuffer.limit();
                int r = m13660r(byteBuffer);
                byteBuffer.limit(r);
                this.f11273q += (long) (byteBuffer.remaining() / this.f11265i);
                m13662t(byteBuffer, this.f11268l, this.f11271o);
                if (r < limit) {
                    m13661s(this.f11268l, this.f11271o);
                    this.f11269m = 0;
                }
            } else {
                limit = byteBuffer.limit();
                int r2 = m13660r(byteBuffer);
                int position2 = r2 - byteBuffer.position();
                byte[] bArr = this.f11267k;
                int length = bArr.length;
                int i4 = this.f11270n;
                int i5 = length - i4;
                if (r2 >= limit || position2 >= i5) {
                    int min = Math.min(position2, i5);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f11267k, this.f11270n, min);
                    int i6 = this.f11270n + min;
                    this.f11270n = i6;
                    byte[] bArr2 = this.f11267k;
                    if (i6 == bArr2.length) {
                        if (this.f11272p) {
                            m13661s(bArr2, this.f11271o);
                            long j = this.f11273q;
                            int i7 = this.f11270n;
                            int i8 = this.f11271o;
                            this.f11273q = j + ((long) ((i7 - (i8 + i8)) / this.f11265i));
                            i6 = i7;
                        } else {
                            this.f11273q += (long) ((i6 - this.f11271o) / this.f11265i);
                        }
                        m13662t(byteBuffer, this.f11267k, i6);
                        this.f11270n = 0;
                        i2 = 2;
                        this.f11269m = i2;
                    }
                } else {
                    m13661s(bArr, i4);
                    this.f11270n = 0;
                    this.f11269m = 0;
                }
            }
            byteBuffer.limit(limit);
        }
    }

    /* renamed from: i */
    public final u04 mo8063i(u04 u04) {
        if (u04.f15314c == 2) {
            return this.f11266j ? u04 : u04.f15311e;
        }
        throw new v04(u04);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo9403k() {
        if (this.f11266j) {
            this.f11265i = this.f15333b.f15315d;
            int q = m13659q(150000) * this.f11265i;
            if (this.f11267k.length != q) {
                this.f11267k = new byte[q];
            }
            int q2 = m13659q(20000) * this.f11265i;
            this.f11271o = q2;
            if (this.f11268l.length != q2) {
                this.f11268l = new byte[q2];
            }
        }
        this.f11269m = 0;
        this.f11273q = 0;
        this.f11270n = 0;
        this.f11272p = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo9404l() {
        int i = this.f11270n;
        if (i > 0) {
            m13661s(this.f11267k, i);
        }
        if (!this.f11272p) {
            this.f11273q += (long) (this.f11271o / this.f11265i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo9405m() {
        this.f11266j = false;
        this.f11271o = 0;
        byte[] bArr = n13.f11241f;
        this.f11267k = bArr;
        this.f11268l = bArr;
    }

    /* renamed from: o */
    public final long mo9406o() {
        return this.f11273q;
    }

    /* renamed from: p */
    public final void mo9407p(boolean z) {
        this.f11266j = z;
    }
}
