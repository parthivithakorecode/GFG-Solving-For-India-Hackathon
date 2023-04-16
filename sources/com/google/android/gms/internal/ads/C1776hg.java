package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.hg */
final class C1776hg implements C1960mf {

    /* renamed from: b */
    private int f8206b = -1;

    /* renamed from: c */
    private int f8207c = -1;

    /* renamed from: d */
    private int[] f8208d;

    /* renamed from: e */
    private boolean f8209e;

    /* renamed from: f */
    private int[] f8210f;

    /* renamed from: g */
    private ByteBuffer f8211g;

    /* renamed from: h */
    private ByteBuffer f8212h;

    /* renamed from: i */
    private boolean f8213i;

    public C1776hg() {
        ByteBuffer byteBuffer = C1960mf.f10824a;
        this.f8211g = byteBuffer;
        this.f8212h = byteBuffer;
    }

    /* renamed from: a */
    public final int mo7927a() {
        return 2;
    }

    /* renamed from: b */
    public final void mo7928b() {
        this.f8213i = true;
    }

    /* renamed from: c */
    public final ByteBuffer mo7929c() {
        ByteBuffer byteBuffer = this.f8212h;
        this.f8212h = C1960mf.f10824a;
        return byteBuffer;
    }

    /* renamed from: d */
    public final void mo7930d(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = this.f8206b;
        int length = ((limit - position) / (i + i)) * this.f8210f.length;
        int i2 = length + length;
        if (this.f8211g.capacity() < i2) {
            this.f8211g = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.f8211g.clear();
        }
        while (position < limit) {
            for (int i3 : this.f8210f) {
                this.f8211g.putShort(byteBuffer.getShort(i3 + i3 + position));
            }
            int i4 = this.f8206b;
            position += i4 + i4;
        }
        byteBuffer.position(limit);
        this.f8211g.flip();
        this.f8212h = this.f8211g;
    }

    /* renamed from: e */
    public final void mo7931e() {
        mo7933g();
        this.f8211g = C1960mf.f10824a;
        this.f8206b = -1;
        this.f8207c = -1;
        this.f8210f = null;
        this.f8209e = false;
    }

    /* renamed from: f */
    public final boolean mo7932f(int i, int i2, int i3) {
        boolean z = !Arrays.equals(this.f8208d, this.f8210f);
        int[] iArr = this.f8208d;
        this.f8210f = iArr;
        if (iArr == null) {
            this.f8209e = false;
            return z;
        } else if (i3 != 2) {
            throw new C1923lf(i, i2, i3);
        } else if (!z && this.f8207c == i && this.f8206b == i2) {
            return false;
        } else {
            this.f8207c = i;
            this.f8206b = i2;
            this.f8209e = i2 != iArr.length;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f8210f;
                if (i4 >= iArr2.length) {
                    return true;
                }
                int i5 = iArr2[i4];
                if (i5 < i2) {
                    this.f8209e = (i5 != i4) | this.f8209e;
                    i4++;
                } else {
                    throw new C1923lf(i, i2, 2);
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo7933g() {
        this.f8212h = C1960mf.f10824a;
        this.f8213i = false;
    }

    /* renamed from: h */
    public final boolean mo7934h() {
        return this.f8209e;
    }

    /* renamed from: i */
    public final boolean mo7935i() {
        return this.f8213i && this.f8212h == C1960mf.f10824a;
    }

    /* renamed from: j */
    public final void mo7936j(int[] iArr) {
        this.f8208d = iArr;
    }

    public final int zza() {
        int[] iArr = this.f8210f;
        return iArr == null ? this.f8206b : iArr.length;
    }
}
