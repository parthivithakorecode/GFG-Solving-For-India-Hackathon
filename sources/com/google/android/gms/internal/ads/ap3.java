package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

final class ap3 extends cp3 {

    /* renamed from: f */
    private final InputStream f4288f;

    /* renamed from: g */
    private final byte[] f4289g;

    /* renamed from: h */
    private int f4290h;

    /* renamed from: i */
    private int f4291i;

    /* renamed from: j */
    private int f4292j;

    /* renamed from: k */
    private int f4293k;

    /* renamed from: l */
    private int f4294l;

    /* renamed from: m */
    private int f4295m = Integer.MAX_VALUE;

    /* synthetic */ ap3(InputStream inputStream, int i, zo3 zo3) {
        super((bp3) null);
        kq3.m12305f(inputStream, "input");
        this.f4288f = inputStream;
        this.f4289g = new byte[4096];
        this.f4290h = 0;
        this.f4292j = 0;
        this.f4294l = 0;
    }

    /* renamed from: C */
    private final List<byte[]> m6165C(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.f4288f.read(bArr, i2, min - i2);
                if (read != -1) {
                    this.f4294l += read;
                    i2 += read;
                } else {
                    throw mq3.m13459j();
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* renamed from: D */
    private final void m6166D() {
        int i = this.f4290h + this.f4291i;
        this.f4290h = i;
        int i2 = this.f4294l + i;
        int i3 = this.f4295m;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f4291i = i4;
            this.f4290h = i - i4;
            return;
        }
        this.f4291i = 0;
    }

    /* renamed from: E */
    private final void m6167E(int i) {
        if (m6168F(i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - this.f4294l) - this.f4292j) {
            throw mq3.m13458i();
        }
        throw mq3.m13459j();
    }

    /* renamed from: F */
    private final boolean m6168F(int i) {
        int i2 = this.f4292j;
        int i3 = this.f4290h;
        if (i2 + i > i3) {
            int i4 = this.f4294l;
            if (i > (Integer.MAX_VALUE - i4) - i2 || i4 + i2 + i > this.f4295m) {
                return false;
            }
            if (i2 > 0) {
                if (i3 > i2) {
                    byte[] bArr = this.f4289g;
                    System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
                }
                i4 = this.f4294l + i2;
                this.f4294l = i4;
                i3 = this.f4290h - i2;
                this.f4290h = i3;
                this.f4292j = 0;
            }
            try {
                int read = this.f4288f.read(this.f4289g, i3, Math.min(4096 - i3, (Integer.MAX_VALUE - i4) - i3));
                if (read == 0 || read < -1 || read > 4096) {
                    String valueOf = String.valueOf(this.f4288f.getClass());
                    StringBuilder sb = new StringBuilder(valueOf.length() + 91);
                    sb.append(valueOf);
                    sb.append("#read(byte[]) returned invalid result: ");
                    sb.append(read);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f4290h += read;
                    m6166D();
                    if (this.f4290h >= i) {
                        return true;
                    }
                    return m6168F(i);
                }
            } catch (mq3 e) {
                e.mo9352k();
                throw e;
            }
        } else {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: G */
    private final byte[] m6169G(int i, boolean z) {
        byte[] H = m6170H(i);
        if (H != null) {
            return H;
        }
        int i2 = this.f4292j;
        int i3 = this.f4290h;
        int i4 = i3 - i2;
        this.f4294l += i3;
        this.f4292j = 0;
        this.f4290h = 0;
        List<byte[]> C = m6165C(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f4289g, i2, bArr, 0, i4);
        for (byte[] next : C) {
            int length = next.length;
            System.arraycopy(next, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    /* renamed from: H */
    private final byte[] m6170H(int i) {
        if (i == 0) {
            return kq3.f9608d;
        }
        if (i >= 0) {
            int i2 = this.f4294l;
            int i3 = this.f4292j;
            int i4 = i2 + i3 + i;
            if (-2147483647 + i4 <= 0) {
                int i5 = this.f4295m;
                if (i4 <= i5) {
                    int i6 = this.f4290h - i3;
                    int i7 = i - i6;
                    if (i7 >= 4096) {
                        try {
                            if (i7 > this.f4288f.available()) {
                                return null;
                            }
                        } catch (mq3 e) {
                            e.mo9352k();
                            throw e;
                        }
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.f4289g, this.f4292j, bArr, 0, i6);
                    this.f4294l += this.f4290h;
                    this.f4292j = 0;
                    this.f4290h = 0;
                    while (i6 < i) {
                        try {
                            int read = this.f4288f.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.f4294l += read;
                                i6 += read;
                            } else {
                                throw mq3.m13459j();
                            }
                        } catch (mq3 e2) {
                            e2.mo9352k();
                            throw e2;
                        }
                    }
                    return bArr;
                }
                mo5358B((i5 - i2) - i3);
                throw mq3.m13459j();
            }
            throw mq3.m13458i();
        }
        throw mq3.m13456f();
    }

    /* renamed from: A */
    public final void mo5357A(int i) {
        if (this.f4293k != i) {
            throw mq3.m13452b();
        }
    }

    /* renamed from: B */
    public final void mo5358B(int i) {
        int i2 = this.f4290h;
        int i3 = this.f4292j;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f4292j = i3 + i;
        } else if (i >= 0) {
            int i5 = this.f4294l;
            int i6 = i5 + i3;
            int i7 = this.f4295m;
            if (i6 + i <= i7) {
                this.f4294l = i6;
                this.f4290h = 0;
                this.f4292j = 0;
                while (i4 < i) {
                    try {
                        long j = (long) (i - i4);
                        long skip = this.f4288f.skip(j);
                        int i8 = (skip > 0 ? 1 : (skip == 0 ? 0 : -1));
                        if (i8 < 0 || skip > j) {
                            String valueOf = String.valueOf(this.f4288f.getClass());
                            StringBuilder sb = new StringBuilder(valueOf.length() + 92);
                            sb.append(valueOf);
                            sb.append("#skip returned invalid result: ");
                            sb.append(skip);
                            sb.append("\nThe InputStream implementation is buggy.");
                            throw new IllegalStateException(sb.toString());
                        } else if (i8 == 0) {
                            break;
                        } else {
                            i4 += (int) skip;
                        }
                    } catch (mq3 e) {
                        e.mo9352k();
                        throw e;
                    } catch (Throwable th) {
                        this.f4294l += i4;
                        m6166D();
                        throw th;
                    }
                }
                this.f4294l += i4;
                m6166D();
                if (i4 < i) {
                    int i9 = this.f4290h;
                    int i10 = i9 - this.f4292j;
                    this.f4292j = i9;
                    while (true) {
                        m6167E(1);
                        int i11 = i - i10;
                        int i12 = this.f4290h;
                        if (i11 > i12) {
                            i10 += i12;
                            this.f4292j = i12;
                        } else {
                            this.f4292j = i11;
                            return;
                        }
                    }
                }
            } else {
                mo5358B((i7 - i5) - i3);
                throw mq3.m13459j();
            }
        } else {
            throw mq3.m13456f();
        }
    }

    /* renamed from: I */
    public final byte mo5359I() {
        if (this.f4292j == this.f4290h) {
            m6167E(1);
        }
        byte[] bArr = this.f4289g;
        int i = this.f4292j;
        this.f4292j = i + 1;
        return bArr[i];
    }

    /* renamed from: J */
    public final int mo5360J() {
        int i = this.f4292j;
        if (this.f4290h - i < 4) {
            m6167E(4);
            i = this.f4292j;
        }
        byte[] bArr = this.f4289g;
        this.f4292j = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r2[r3] >= 0) goto L_0x0069;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo5361K() {
        /*
            r5 = this;
            int r0 = r5.f4292j
            int r1 = r5.f4290h
            if (r1 != r0) goto L_0x0007
            goto L_0x006c
        L_0x0007:
            byte[] r2 = r5.f4289g
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.f4292j = r3
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006c
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0023
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0069
        L_0x0023:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0030
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002e:
            r1 = r3
            goto L_0x0069
        L_0x0030:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0069
        L_0x003e:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006c
        L_0x0069:
            r5.f4292j = r1
            return r0
        L_0x006c:
            long r0 = r5.mo5364N()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ap3.mo5361K():int");
    }

    /* renamed from: L */
    public final long mo5362L() {
        int i = this.f4292j;
        if (this.f4290h - i < 8) {
            m6167E(8);
            i = this.f4292j;
        }
        byte[] bArr = this.f4289g;
        this.f4292j = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: M */
    public final long mo5363M() {
        long j;
        long j2;
        long j3;
        long j4;
        byte b;
        int i = this.f4292j;
        int i2 = this.f4290h;
        if (i2 != i) {
            byte[] bArr = this.f4289g;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f4292j = i3;
                return (long) b2;
            } else if (i2 - i3 >= 9) {
                int i4 = i3 + 1;
                byte b3 = b2 ^ (bArr[i3] << 7);
                if (b3 < 0) {
                    b = b3 ^ Byte.MIN_VALUE;
                } else {
                    int i5 = i4 + 1;
                    byte b4 = b3 ^ (bArr[i4] << 14);
                    if (b4 >= 0) {
                        j2 = (long) (b4 ^ 16256);
                    } else {
                        i4 = i5 + 1;
                        byte b5 = b4 ^ (bArr[i5] << 21);
                        if (b5 < 0) {
                            b = b5 ^ -2080896;
                        } else {
                            i5 = i4 + 1;
                            long j5 = (((long) bArr[i4]) << 28) ^ ((long) b5);
                            if (j5 >= 0) {
                                j4 = 266354560;
                            } else {
                                int i6 = i5 + 1;
                                long j6 = j5 ^ (((long) bArr[i5]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i5 = i6 + 1;
                                    j5 = j6 ^ (((long) bArr[i6]) << 42);
                                    if (j5 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i6 = i5 + 1;
                                        j6 = j5 ^ (((long) bArr[i5]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i5 = i6 + 1;
                                            j2 = (j6 ^ (((long) bArr[i6]) << 56)) ^ 71499008037633920L;
                                            if (j2 < 0) {
                                                i6 = i5 + 1;
                                                if (((long) bArr[i5]) >= 0) {
                                                    j = j2;
                                                    i4 = i6;
                                                    this.f4292j = i4;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j3 ^ j6;
                                i4 = i6;
                                this.f4292j = i4;
                                return j;
                            }
                            j2 = j5 ^ j4;
                        }
                    }
                    i4 = i5;
                    j = j2;
                    this.f4292j = i4;
                    return j;
                }
                j = (long) b;
                this.f4292j = i4;
                return j;
            }
        }
        return mo5364N();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final long mo5364N() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte I = mo5359I();
            j |= ((long) (I & Byte.MAX_VALUE)) << i;
            if ((I & 128) == 0) {
                return j;
            }
        }
        throw mq3.m13455e();
    }

    /* renamed from: a */
    public final void mo5365a(int i) {
        this.f4295m = i;
        m6166D();
    }

    /* renamed from: b */
    public final boolean mo5366b() {
        return this.f4292j == this.f4290h && !m6168F(1);
    }

    /* renamed from: c */
    public final boolean mo5367c() {
        return mo5363M() != 0;
    }

    /* renamed from: d */
    public final boolean mo5368d(int i) {
        int q;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f4290h - this.f4292j >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.f4289g;
                    int i4 = this.f4292j;
                    this.f4292j = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw mq3.m13455e();
            }
            while (i3 < 10) {
                if (mo5359I() < 0) {
                    i3++;
                }
            }
            throw mq3.m13455e();
            return true;
        } else if (i2 == 1) {
            mo5358B(8);
            return true;
        } else if (i2 == 2) {
            mo5358B(mo5361K());
            return true;
        } else if (i2 == 3) {
            do {
                q = mo5378q();
                if (q == 0 || !mo5368d(q)) {
                    mo5357A(((i >>> 3) << 3) | 4);
                }
                q = mo5378q();
                break;
            } while (!mo5368d(q));
            mo5357A(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                mo5358B(4);
                return true;
            }
            throw mq3.m13451a();
        }
    }

    /* renamed from: h */
    public final double mo5369h() {
        return Double.longBitsToDouble(mo5362L());
    }

    /* renamed from: i */
    public final float mo5370i() {
        return Float.intBitsToFloat(mo5360J());
    }

    /* renamed from: j */
    public final int mo5371j() {
        return this.f4294l + this.f4292j;
    }

    /* renamed from: k */
    public final int mo5372k(int i) {
        if (i >= 0) {
            int i2 = i + this.f4294l + this.f4292j;
            int i3 = this.f4295m;
            if (i2 <= i3) {
                this.f4295m = i2;
                m6166D();
                return i3;
            }
            throw mq3.m13459j();
        }
        throw mq3.m13456f();
    }

    /* renamed from: l */
    public final int mo5373l() {
        return mo5361K();
    }

    /* renamed from: m */
    public final int mo5374m() {
        return mo5360J();
    }

    /* renamed from: n */
    public final int mo5375n() {
        return mo5361K();
    }

    /* renamed from: o */
    public final int mo5376o() {
        return mo5360J();
    }

    /* renamed from: p */
    public final int mo5377p() {
        return cp3.m7489e(mo5361K());
    }

    /* renamed from: q */
    public final int mo5378q() {
        if (mo5366b()) {
            this.f4293k = 0;
            return 0;
        }
        int K = mo5361K();
        this.f4293k = K;
        if ((K >>> 3) != 0) {
            return K;
        }
        throw mq3.m13453c();
    }

    /* renamed from: r */
    public final int mo5379r() {
        return mo5361K();
    }

    /* renamed from: s */
    public final long mo5380s() {
        return mo5362L();
    }

    /* renamed from: t */
    public final long mo5381t() {
        return mo5363M();
    }

    /* renamed from: u */
    public final long mo5382u() {
        return mo5362L();
    }

    /* renamed from: v */
    public final long mo5383v() {
        return cp3.m7490f(mo5363M());
    }

    /* renamed from: w */
    public final long mo5384w() {
        return mo5363M();
    }

    /* renamed from: x */
    public final uo3 mo5385x() {
        int K = mo5361K();
        int i = this.f4290h;
        int i2 = this.f4292j;
        if (K <= i - i2 && K > 0) {
            uo3 J = uo3.m17969J(this.f4289g, i2, K);
            this.f4292j += K;
            return J;
        } else if (K == 0) {
            return uo3.f15667g;
        } else {
            byte[] H = m6170H(K);
            if (H != null) {
                return uo3.m17968I(H);
            }
            int i3 = this.f4292j;
            int i4 = this.f4290h;
            int i5 = i4 - i3;
            this.f4294l += i4;
            this.f4292j = 0;
            this.f4290h = 0;
            List<byte[]> C = m6165C(K - i5);
            byte[] bArr = new byte[K];
            System.arraycopy(this.f4289g, i3, bArr, 0, i5);
            for (byte[] next : C) {
                int length = next.length;
                System.arraycopy(next, 0, bArr, i5, length);
                i5 += length;
            }
            return uo3.m17972M(bArr);
        }
    }

    /* renamed from: y */
    public final String mo5386y() {
        int K = mo5361K();
        if (K > 0) {
            int i = this.f4290h;
            int i2 = this.f4292j;
            if (K <= i - i2) {
                String str = new String(this.f4289g, i2, K, kq3.f9606b);
                this.f4292j += K;
                return str;
            }
        }
        if (K == 0) {
            return "";
        }
        if (K > this.f4290h) {
            return new String(m6169G(K, false), kq3.f9606b);
        }
        m6167E(K);
        String str2 = new String(this.f4289g, this.f4292j, K, kq3.f9606b);
        this.f4292j += K;
        return str2;
    }

    /* renamed from: z */
    public final String mo5387z() {
        byte[] bArr;
        int K = mo5361K();
        int i = this.f4292j;
        int i2 = this.f4290h;
        if (K <= i2 - i && K > 0) {
            bArr = this.f4289g;
            this.f4292j = i + K;
        } else if (K == 0) {
            return "";
        } else {
            if (K <= i2) {
                m6167E(K);
                bArr = this.f4289g;
                this.f4292j = K;
            } else {
                bArr = m6169G(K, false);
            }
            i = 0;
        }
        return lt3.m12870h(bArr, i, K);
    }
}
