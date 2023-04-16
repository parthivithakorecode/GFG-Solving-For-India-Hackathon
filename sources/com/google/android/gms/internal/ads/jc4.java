package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

public final class jc4 implements pc4 {

    /* renamed from: a */
    private final byte[] f9092a = new byte[4096];

    /* renamed from: b */
    private final fc1 f9093b;

    /* renamed from: c */
    private final long f9094c;

    /* renamed from: d */
    private long f9095d;

    /* renamed from: e */
    private byte[] f9096e = new byte[65536];

    /* renamed from: f */
    private int f9097f;

    /* renamed from: g */
    private int f9098g;

    public jc4(fc1 fc1, long j, long j2) {
        this.f9093b = fc1;
        this.f9095d = j;
        this.f9094c = j2;
    }

    /* renamed from: q */
    private final int m11566q(byte[] bArr, int i, int i2) {
        int i3 = this.f9098g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f9096e, 0, bArr, i, min);
        m11571v(min);
        return min;
    }

    /* renamed from: r */
    private final int m11567r(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int a = this.f9093b.mo5752a(bArr, i + i3, i2 - i3);
            if (a != -1) {
                return i3 + a;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    /* renamed from: s */
    private final int m11568s(int i) {
        int min = Math.min(this.f9098g, i);
        m11571v(min);
        return min;
    }

    /* renamed from: t */
    private final void m11569t(int i) {
        if (i != -1) {
            this.f9095d += (long) i;
        }
    }

    /* renamed from: u */
    private final void m11570u(int i) {
        int i2 = this.f9097f + i;
        int length = this.f9096e.length;
        if (i2 > length) {
            this.f9096e = Arrays.copyOf(this.f9096e, n13.m13607L(length + length, 65536 + i2, i2 + 524288));
        }
    }

    /* renamed from: v */
    private final void m11571v(int i) {
        int i2 = this.f9098g - i;
        this.f9098g = i2;
        this.f9097f = 0;
        byte[] bArr = this.f9096e;
        byte[] bArr2 = i2 < bArr.length + -524288 ? new byte[(65536 + i2)] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f9096e = bArr2;
    }

    /* renamed from: D */
    public final void mo6906D(int i) {
        mo8446o(i, false);
    }

    /* renamed from: E */
    public final int mo6907E(int i) {
        int s = m11568s(1);
        if (s == 0) {
            s = m11567r(this.f9092a, 0, Math.min(1, 4096), 0, true);
        }
        m11569t(s);
        return s;
    }

    /* renamed from: a */
    public final int mo5752a(byte[] bArr, int i, int i2) {
        int q = m11566q(bArr, i, i2);
        if (q == 0) {
            q = m11567r(bArr, i, i2, 0, true);
        }
        m11569t(q);
        return q;
    }

    /* renamed from: b */
    public final long mo6908b() {
        return this.f9095d;
    }

    /* renamed from: c */
    public final long mo6909c() {
        return this.f9094c;
    }

    /* renamed from: d */
    public final int mo6910d(byte[] bArr, int i, int i2) {
        int i3;
        m11570u(i2);
        int i4 = this.f9098g;
        int i5 = this.f9097f;
        int i6 = i4 - i5;
        if (i6 == 0) {
            i3 = m11567r(this.f9096e, i5, i2, 0, true);
            if (i3 == -1) {
                return -1;
            }
            this.f9098g += i3;
        } else {
            i3 = Math.min(i2, i6);
        }
        System.arraycopy(this.f9096e, this.f9097f, bArr, i, i3);
        this.f9097f += i3;
        return i3;
    }

    /* renamed from: e */
    public final void mo6911e(byte[] bArr, int i, int i2) {
        mo6916m(bArr, i, i2, false);
    }

    /* renamed from: f */
    public final void mo6912f(byte[] bArr, int i, int i2) {
        mo6917n(bArr, i, i2, false);
    }

    /* renamed from: g */
    public final long mo6913g() {
        return this.f9095d + ((long) this.f9097f);
    }

    /* renamed from: i */
    public final void mo6914i() {
        this.f9097f = 0;
    }

    /* renamed from: l */
    public final void mo6915l(int i) {
        mo8447p(i, false);
    }

    /* renamed from: m */
    public final boolean mo6916m(byte[] bArr, int i, int i2, boolean z) {
        int q = m11566q(bArr, i, i2);
        while (q < i2 && q != -1) {
            q = m11567r(bArr, i, i2, q, z);
        }
        m11569t(q);
        return q != -1;
    }

    /* renamed from: n */
    public final boolean mo6917n(byte[] bArr, int i, int i2, boolean z) {
        if (!mo8446o(i2, z)) {
            return false;
        }
        System.arraycopy(this.f9096e, this.f9097f - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: o */
    public final boolean mo8446o(int i, boolean z) {
        m11570u(i);
        int i2 = this.f9098g - this.f9097f;
        while (i2 < i) {
            i2 = m11567r(this.f9096e, this.f9097f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f9098g = this.f9097f + i2;
        }
        this.f9097f += i;
        return true;
    }

    /* renamed from: p */
    public final boolean mo8447p(int i, boolean z) {
        int s = m11568s(i);
        while (s < i && s != -1) {
            s = m11567r(this.f9092a, -s, Math.min(i, s + 4096), s, false);
        }
        m11569t(s);
        return s != -1;
    }
}
