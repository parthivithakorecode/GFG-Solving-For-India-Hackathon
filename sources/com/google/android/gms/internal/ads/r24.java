package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

final class r24 extends u14 {

    /* renamed from: i */
    private int f13481i;

    /* renamed from: j */
    private int f13482j;

    /* renamed from: k */
    private boolean f13483k;

    /* renamed from: l */
    private int f13484l;

    /* renamed from: m */
    private byte[] f13485m = n13.f11241f;

    /* renamed from: n */
    private int f13486n;

    /* renamed from: o */
    private long f13487o;

    /* renamed from: a */
    public final ByteBuffer mo9933a() {
        int i;
        if (super.mo9937f() && (i = this.f13486n) > 0) {
            mo11147j(i).put(this.f13485m, 0, this.f13486n).flip();
            this.f13486n = 0;
        }
        return super.mo9933a();
    }

    /* renamed from: f */
    public final boolean mo9937f() {
        return super.mo9937f() && this.f13486n == 0;
    }

    /* renamed from: h */
    public final void mo8062h(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.f13484l);
            this.f13487o += (long) (min / this.f15333b.f15315d);
            this.f13484l -= min;
            byteBuffer.position(position + min);
            if (this.f13484l <= 0) {
                int i2 = i - min;
                int length = (this.f13486n + i2) - this.f13485m.length;
                ByteBuffer j = mo11147j(length);
                int L = n13.m13607L(length, 0, this.f13486n);
                j.put(this.f13485m, 0, L);
                int L2 = n13.m13607L(length - L, 0, i2);
                byteBuffer.limit(byteBuffer.position() + L2);
                j.put(byteBuffer);
                byteBuffer.limit(limit);
                int i3 = i2 - L2;
                int i4 = this.f13486n - L;
                this.f13486n = i4;
                byte[] bArr = this.f13485m;
                System.arraycopy(bArr, L, bArr, 0, i4);
                byteBuffer.get(this.f13485m, this.f13486n, i3);
                this.f13486n += i3;
                j.flip();
            }
        }
    }

    /* renamed from: i */
    public final u04 mo8063i(u04 u04) {
        if (u04.f15314c == 2) {
            this.f13483k = true;
            return (this.f13481i == 0 && this.f13482j == 0) ? u04.f15311e : u04;
        }
        throw new v04(u04);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo9403k() {
        if (this.f13483k) {
            this.f13483k = false;
            int i = this.f13482j;
            int i2 = this.f15333b.f15315d;
            this.f13485m = new byte[(i * i2)];
            this.f13484l = this.f13481i * i2;
        }
        this.f13486n = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo9404l() {
        if (this.f13483k) {
            int i = this.f13486n;
            if (i > 0) {
                this.f13487o += (long) (i / this.f15333b.f15315d);
            }
            this.f13486n = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo9405m() {
        this.f13485m = n13.f11241f;
    }

    /* renamed from: o */
    public final long mo10465o() {
        return this.f13487o;
    }

    /* renamed from: p */
    public final void mo10466p() {
        this.f13487o = 0;
    }

    /* renamed from: q */
    public final void mo10467q(int i, int i2) {
        this.f13481i = i;
        this.f13482j = i2;
    }
}
