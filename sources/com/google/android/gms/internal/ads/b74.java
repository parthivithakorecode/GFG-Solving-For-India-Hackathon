package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

final class b74 {

    /* renamed from: a */
    private final dr2 f4785a = new dr2(32);

    /* renamed from: b */
    private a74 f4786b;

    /* renamed from: c */
    private a74 f4787c;

    /* renamed from: d */
    private a74 f4788d;

    /* renamed from: e */
    private long f4789e;

    /* renamed from: f */
    private final g94 f4790f;

    public b74(g94 g94, byte[] bArr) {
        this.f4790f = g94;
        a74 a74 = new a74(0, 65536);
        this.f4786b = a74;
        this.f4787c = a74;
        this.f4788d = a74;
    }

    /* renamed from: i */
    private final int m6702i(int i) {
        a74 a74 = this.f4788d;
        if (!a74.f4002c) {
            s84 b = this.f4790f.mo7537b();
            a74 a742 = new a74(this.f4788d.f4001b, 65536);
            a74.f4003d = b;
            a74.f4004e = a742;
            a74.f4002c = true;
        }
        return Math.min(i, (int) (this.f4788d.f4001b - this.f4789e));
    }

    /* renamed from: j */
    private static a74 m6703j(a74 a74, long j) {
        while (j >= a74.f4001b) {
            a74 = a74.f4004e;
        }
        return a74;
    }

    /* renamed from: k */
    private static a74 m6704k(a74 a74, long j, ByteBuffer byteBuffer, int i) {
        a74 j2 = m6703j(a74, j);
        while (i > 0) {
            int min = Math.min(i, (int) (j2.f4001b - j));
            byteBuffer.put(j2.f4003d.f14333a, j2.mo5157a(j), min);
            i -= min;
            j += (long) min;
            if (j == j2.f4001b) {
                j2 = j2.f4004e;
            }
        }
        return j2;
    }

    /* renamed from: l */
    private static a74 m6705l(a74 a74, long j, byte[] bArr, int i) {
        a74 j2 = m6703j(a74, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (j2.f4001b - j));
            System.arraycopy(j2.f4003d.f14333a, j2.mo5157a(j), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == j2.f4001b) {
                j2 = j2.f4004e;
            }
        }
        return j2;
    }

    /* renamed from: m */
    private static a74 m6706m(a74 a74, z51 z51, d74 d74, dr2 dr2) {
        a74 a742;
        z51 z512 = z51;
        d74 d742 = d74;
        dr2 dr22 = dr2;
        if (z51.mo12150k()) {
            long j = d742.f5681b;
            int i = 1;
            dr22.mo6577c(1);
            a74 l = m6705l(a74, j, dr2.mo6582h(), 1);
            long j2 = j + 1;
            byte b = dr2.mo6582h()[0];
            byte b2 = b & 128;
            byte b3 = b & Byte.MAX_VALUE;
            v21 v21 = z512.f18032b;
            byte[] bArr = v21.f15864a;
            if (bArr == null) {
                v21.f15864a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            a742 = m6705l(l, j2, v21.f15864a, b3);
            long j3 = j2 + ((long) b3);
            if (b2 != 0) {
                dr22.mo6577c(2);
                a742 = m6705l(a742, j3, dr2.mo6582h(), 2);
                j3 += 2;
                i = dr2.mo6597w();
            }
            int i2 = i;
            int[] iArr = v21.f15867d;
            if (iArr == null || iArr.length < i2) {
                iArr = new int[i2];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = v21.f15868e;
            if (iArr3 == null || iArr3.length < i2) {
                iArr3 = new int[i2];
            }
            int[] iArr4 = iArr3;
            if (b2 != 0) {
                int i3 = i2 * 6;
                dr22.mo6577c(i3);
                a742 = m6705l(a742, j3, dr2.mo6582h(), i3);
                j3 += (long) i3;
                dr22.mo6580f(0);
                for (int i4 = 0; i4 < i2; i4++) {
                    iArr2[i4] = dr2.mo6597w();
                    iArr4[i4] = dr2.mo6596v();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = d742.f5680a - ((int) (j3 - d742.f5681b));
            }
            sd4 sd4 = d742.f5682c;
            int i5 = n13.f11236a;
            v21.mo11370c(i2, iArr2, iArr4, sd4.f14410b, v21.f15864a, sd4.f14409a, sd4.f14411c, sd4.f14412d);
            long j4 = d742.f5681b;
            int i6 = (int) (j3 - j4);
            d742.f5681b = j4 + ((long) i6);
            d742.f5680a -= i6;
        } else {
            a742 = a74;
        }
        if (z51.mo10913e()) {
            dr22.mo6577c(4);
            a74 l2 = m6705l(a742, d742.f5681b, dr2.mo6582h(), 4);
            int v = dr2.mo6596v();
            d742.f5681b += 4;
            d742.f5680a -= 4;
            z512.mo12148i(v);
            a74 k = m6704k(l2, d742.f5681b, z512.f18033c, v);
            d742.f5681b += (long) v;
            int i7 = d742.f5680a - v;
            d742.f5680a = i7;
            ByteBuffer byteBuffer = z512.f18036f;
            if (byteBuffer == null || byteBuffer.capacity() < i7) {
                z512.f18036f = ByteBuffer.allocate(i7);
            } else {
                z512.f18036f.clear();
            }
            return m6704k(k, d742.f5681b, z512.f18036f, d742.f5680a);
        }
        z512.mo12148i(d742.f5680a);
        return m6704k(a742, d742.f5681b, z512.f18033c, d742.f5680a);
    }

    /* renamed from: n */
    private final void m6707n(int i) {
        long j = this.f4789e + ((long) i);
        this.f4789e = j;
        a74 a74 = this.f4788d;
        if (j == a74.f4001b) {
            this.f4788d = a74.f4004e;
        }
    }

    /* renamed from: a */
    public final int mo5732a(fc1 fc1, int i, boolean z) {
        int i2 = m6702i(i);
        a74 a74 = this.f4788d;
        int a = fc1.mo5752a(a74.f4003d.f14333a, a74.mo5157a(this.f4789e), i2);
        if (a != -1) {
            m6707n(a);
            return a;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: b */
    public final long mo5733b() {
        return this.f4789e;
    }

    /* renamed from: c */
    public final void mo5734c(long j) {
        a74 a74;
        if (j != -1) {
            while (true) {
                a74 = this.f4786b;
                if (j < a74.f4001b) {
                    break;
                }
                this.f4790f.mo7538c(a74.f4003d);
                this.f4786b = this.f4786b.mo5158b();
            }
            if (this.f4787c.f4000a < a74.f4000a) {
                this.f4787c = a74;
            }
        }
    }

    /* renamed from: d */
    public final void mo5735d(z51 z51, d74 d74) {
        m6706m(this.f4787c, z51, d74, this.f4785a);
    }

    /* renamed from: e */
    public final void mo5736e(z51 z51, d74 d74) {
        this.f4787c = m6706m(this.f4787c, z51, d74, this.f4785a);
    }

    /* renamed from: f */
    public final void mo5737f() {
        a74 a74 = this.f4786b;
        if (a74.f4002c) {
            a74 a742 = this.f4788d;
            int i = (a742.f4002c ? 1 : 0) + (((int) (a742.f4000a - a74.f4000a)) / 65536);
            s84[] s84Arr = new s84[i];
            for (int i2 = 0; i2 < i; i2++) {
                s84Arr[i2] = a74.f4003d;
                a74 = a74.mo5158b();
            }
            this.f4790f.mo7539d(s84Arr);
        }
        a74 a743 = new a74(0, 65536);
        this.f4786b = a743;
        this.f4787c = a743;
        this.f4788d = a743;
        this.f4789e = 0;
        this.f4790f.mo7542g();
    }

    /* renamed from: g */
    public final void mo5738g() {
        this.f4787c = this.f4786b;
    }

    /* renamed from: h */
    public final void mo5739h(dr2 dr2, int i) {
        while (i > 0) {
            int i2 = m6702i(i);
            a74 a74 = this.f4788d;
            dr2.mo6576b(a74.f4003d.f14333a, a74.mo5157a(this.f4789e), i2);
            i -= i2;
            m6707n(i2);
        }
    }
}
