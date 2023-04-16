package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Iterator;

final class yo3 extends cp3 {

    /* renamed from: f */
    private final Iterable<ByteBuffer> f17825f;

    /* renamed from: g */
    private final Iterator<ByteBuffer> f17826g;

    /* renamed from: h */
    private ByteBuffer f17827h;

    /* renamed from: i */
    private int f17828i;

    /* renamed from: j */
    private int f17829j;

    /* renamed from: k */
    private int f17830k = Integer.MAX_VALUE;

    /* renamed from: l */
    private int f17831l;

    /* renamed from: m */
    private int f17832m;

    /* renamed from: n */
    private long f17833n;

    /* renamed from: o */
    private long f17834o;

    /* renamed from: p */
    private long f17835p;

    /* synthetic */ yo3(Iterable iterable, int i, boolean z, xo3 xo3) {
        super((bp3) null);
        this.f17828i = i;
        this.f17825f = iterable;
        this.f17826g = iterable.iterator();
        this.f17832m = 0;
        if (i == 0) {
            this.f17827h = kq3.f9609e;
            this.f17833n = 0;
            this.f17834o = 0;
            this.f17835p = 0;
            return;
        }
        m20106G();
    }

    /* renamed from: C */
    private final int m20102C() {
        return (int) ((((long) (this.f17828i - this.f17832m)) - this.f17833n) + this.f17834o);
    }

    /* renamed from: D */
    private final void m20103D() {
        if (this.f17826g.hasNext()) {
            m20106G();
            return;
        }
        throw mq3.m13459j();
    }

    /* renamed from: E */
    private final void m20104E(byte[] bArr, int i, int i2) {
        if (i2 <= m20102C()) {
            int i3 = i2;
            while (i3 > 0) {
                if (this.f17835p - this.f17833n == 0) {
                    m20103D();
                }
                int min = Math.min(i3, (int) (this.f17835p - this.f17833n));
                long j = (long) min;
                gt3.m9998w(this.f17833n, bArr, (long) (i2 - i3), j);
                i3 -= min;
                this.f17833n += j;
            }
        } else if (i2 > 0) {
            throw mq3.m13459j();
        }
    }

    /* renamed from: F */
    private final void m20105F() {
        int i = this.f17828i + this.f17829j;
        this.f17828i = i;
        int i2 = this.f17830k;
        if (i > i2) {
            int i3 = i - i2;
            this.f17829j = i3;
            this.f17828i = i - i3;
            return;
        }
        this.f17829j = 0;
    }

    /* renamed from: G */
    private final void m20106G() {
        ByteBuffer next = this.f17826g.next();
        this.f17827h = next;
        this.f17832m += (int) (this.f17833n - this.f17834o);
        long position = (long) next.position();
        this.f17833n = position;
        this.f17834o = position;
        this.f17835p = (long) this.f17827h.limit();
        long m = gt3.m9988m(this.f17827h);
        this.f17833n += m;
        this.f17834o += m;
        this.f17835p += m;
    }

    /* renamed from: A */
    public final void mo5357A(int i) {
        if (this.f17831l != i) {
            throw mq3.m13452b();
        }
    }

    /* renamed from: B */
    public final void mo12064B(int i) {
        if (i >= 0 && ((long) i) <= (((long) (this.f17828i - this.f17832m)) - this.f17833n) + this.f17834o) {
            while (i > 0) {
                if (this.f17835p - this.f17833n == 0) {
                    m20103D();
                }
                int min = Math.min(i, (int) (this.f17835p - this.f17833n));
                i -= min;
                this.f17833n += (long) min;
            }
        } else if (i < 0) {
            throw mq3.m13456f();
        } else {
            throw mq3.m13459j();
        }
    }

    /* renamed from: H */
    public final byte mo12065H() {
        if (this.f17835p - this.f17833n == 0) {
            m20103D();
        }
        long j = this.f17833n;
        this.f17833n = 1 + j;
        return gt3.m9984i(j);
    }

    /* renamed from: I */
    public final int mo12066I() {
        byte H;
        byte H2;
        long j = this.f17835p;
        long j2 = this.f17833n;
        if (j - j2 >= 4) {
            this.f17833n = 4 + j2;
            H = (gt3.m9984i(j2) & 255) | ((gt3.m9984i(1 + j2) & 255) << 8) | ((gt3.m9984i(2 + j2) & 255) << 16);
            H2 = gt3.m9984i(j2 + 3);
        } else {
            H = (mo12065H() & 255) | ((mo12065H() & 255) << 8) | ((mo12065H() & 255) << 16);
            H2 = mo12065H();
        }
        return H | ((H2 & 255) << 24);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        if (com.google.android.gms.internal.ads.gt3.m9984i(r4) >= 0) goto L_0x0089;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo12067J() {
        /*
            r10 = this;
            long r0 = r10.f17833n
            long r2 = r10.f17835p
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x000a
            goto L_0x008c
        L_0x000a:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.gt3.m9984i(r0)
            if (r0 < 0) goto L_0x001a
            long r4 = r10.f17833n
            long r4 = r4 + r2
            r10.f17833n = r4
            return r0
        L_0x001a:
            long r6 = r10.f17835p
            long r8 = r10.f17833n
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x008c
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.gt3.m9984i(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L_0x0033
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0089
        L_0x0033:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.gt3.m9984i(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0042
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x0040:
            r6 = r4
            goto L_0x0089
        L_0x0042:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.gt3.m9984i(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L_0x0052
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L_0x0089
        L_0x0052:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.gt3.m9984i(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L_0x0040
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.gt3.m9984i(r4)
            if (r1 >= 0) goto L_0x0089
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.gt3.m9984i(r6)
            if (r1 >= 0) goto L_0x0040
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.gt3.m9984i(r4)
            if (r1 >= 0) goto L_0x0089
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.gt3.m9984i(r6)
            if (r1 >= 0) goto L_0x0040
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.gt3.m9984i(r4)
            if (r1 < 0) goto L_0x008c
        L_0x0089:
            r10.f17833n = r6
            return r0
        L_0x008c:
            long r0 = r10.mo12070M()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yo3.mo12067J():int");
    }

    /* renamed from: K */
    public final long mo12068K() {
        long j = this.f17835p;
        long j2 = this.f17833n;
        if (j - j2 >= 8) {
            this.f17833n = 8 + j2;
            return ((((long) gt3.m9984i(j2 + 7)) & 255) << 56) | (((long) gt3.m9984i(j2)) & 255) | ((((long) gt3.m9984i(1 + j2)) & 255) << 8) | ((((long) gt3.m9984i(2 + j2)) & 255) << 16) | ((((long) gt3.m9984i(3 + j2)) & 255) << 24) | ((((long) gt3.m9984i(4 + j2)) & 255) << 32) | ((((long) gt3.m9984i(5 + j2)) & 255) << 40) | ((((long) gt3.m9984i(6 + j2)) & 255) << 48);
        }
        return ((((long) mo12065H()) & 255) << 56) | (((long) mo12065H()) & 255) | ((((long) mo12065H()) & 255) << 8) | ((((long) mo12065H()) & 255) << 16) | ((((long) mo12065H()) & 255) << 24) | ((((long) mo12065H()) & 255) << 32) | ((((long) mo12065H()) & 255) << 40) | ((((long) mo12065H()) & 255) << 48);
    }

    /* renamed from: L */
    public final long mo12069L() {
        long j;
        long j2;
        long j3;
        byte b;
        long j4 = this.f17833n;
        if (this.f17835p != j4) {
            long j5 = j4 + 1;
            byte i = gt3.m9984i(j4);
            if (i >= 0) {
                this.f17833n++;
                return (long) i;
            } else if (this.f17835p - this.f17833n >= 10) {
                long j6 = j5 + 1;
                byte i2 = i ^ (gt3.m9984i(j5) << 7);
                if (i2 < 0) {
                    b = i2 ^ Byte.MIN_VALUE;
                } else {
                    long j7 = j6 + 1;
                    byte i3 = i2 ^ (gt3.m9984i(j6) << 14);
                    if (i3 >= 0) {
                        j = (long) (i3 ^ 16256);
                    } else {
                        j6 = j7 + 1;
                        byte i4 = i3 ^ (gt3.m9984i(j7) << 21);
                        if (i4 < 0) {
                            b = i4 ^ -2080896;
                        } else {
                            j7 = j6 + 1;
                            long i5 = ((long) i4) ^ (((long) gt3.m9984i(j6)) << 28);
                            if (i5 >= 0) {
                                j3 = 266354560;
                            } else {
                                long j8 = j7 + 1;
                                long i6 = i5 ^ (((long) gt3.m9984i(j7)) << 35);
                                if (i6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j7 = j8 + 1;
                                    i5 = i6 ^ (((long) gt3.m9984i(j8)) << 42);
                                    if (i5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j8 = j7 + 1;
                                        i6 = i5 ^ (((long) gt3.m9984i(j7)) << 49);
                                        if (i6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j7 = j8 + 1;
                                            j = (i6 ^ (((long) gt3.m9984i(j8)) << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                long j9 = 1 + j7;
                                                if (((long) gt3.m9984i(j7)) >= 0) {
                                                    j6 = j9;
                                                    this.f17833n = j6;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = i6 ^ j2;
                                j6 = j8;
                                this.f17833n = j6;
                                return j;
                            }
                            j = i5 ^ j3;
                        }
                    }
                    j6 = j7;
                    this.f17833n = j6;
                    return j;
                }
                j = (long) b;
                this.f17833n = j6;
                return j;
            }
        }
        return mo12070M();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final long mo12070M() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte H = mo12065H();
            j |= ((long) (H & Byte.MAX_VALUE)) << i;
            if ((H & 128) == 0) {
                return j;
            }
        }
        throw mq3.m13455e();
    }

    /* renamed from: a */
    public final void mo5365a(int i) {
        this.f17830k = i;
        m20105F();
    }

    /* renamed from: b */
    public final boolean mo5366b() {
        return (((long) this.f17832m) + this.f17833n) - this.f17834o == ((long) this.f17828i);
    }

    /* renamed from: c */
    public final boolean mo5367c() {
        return mo12069L() != 0;
    }

    /* renamed from: d */
    public final boolean mo5368d(int i) {
        int q;
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (mo12065H() >= 0) {
                    return true;
                }
            }
            throw mq3.m13455e();
        } else if (i2 == 1) {
            mo12064B(8);
            return true;
        } else if (i2 == 2) {
            mo12064B(mo12067J());
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
                mo12064B(4);
                return true;
            }
            throw mq3.m13451a();
        }
    }

    /* renamed from: h */
    public final double mo5369h() {
        return Double.longBitsToDouble(mo12068K());
    }

    /* renamed from: i */
    public final float mo5370i() {
        return Float.intBitsToFloat(mo12066I());
    }

    /* renamed from: j */
    public final int mo5371j() {
        return (int) ((((long) this.f17832m) + this.f17833n) - this.f17834o);
    }

    /* renamed from: k */
    public final int mo5372k(int i) {
        if (i >= 0) {
            int j = i + mo5371j();
            int i2 = this.f17830k;
            if (j <= i2) {
                this.f17830k = j;
                m20105F();
                return i2;
            }
            throw mq3.m13459j();
        }
        throw mq3.m13456f();
    }

    /* renamed from: l */
    public final int mo5373l() {
        return mo12067J();
    }

    /* renamed from: m */
    public final int mo5374m() {
        return mo12066I();
    }

    /* renamed from: n */
    public final int mo5375n() {
        return mo12067J();
    }

    /* renamed from: o */
    public final int mo5376o() {
        return mo12066I();
    }

    /* renamed from: p */
    public final int mo5377p() {
        return cp3.m7489e(mo12067J());
    }

    /* renamed from: q */
    public final int mo5378q() {
        if (mo5366b()) {
            this.f17831l = 0;
            return 0;
        }
        int J = mo12067J();
        this.f17831l = J;
        if ((J >>> 3) != 0) {
            return J;
        }
        throw mq3.m13453c();
    }

    /* renamed from: r */
    public final int mo5379r() {
        return mo12067J();
    }

    /* renamed from: s */
    public final long mo5380s() {
        return mo12068K();
    }

    /* renamed from: t */
    public final long mo5381t() {
        return mo12069L();
    }

    /* renamed from: u */
    public final long mo5382u() {
        return mo12068K();
    }

    /* renamed from: v */
    public final long mo5383v() {
        return cp3.m7490f(mo12069L());
    }

    /* renamed from: w */
    public final long mo5384w() {
        return mo12069L();
    }

    /* renamed from: x */
    public final uo3 mo5385x() {
        int J = mo12067J();
        if (J > 0) {
            long j = (long) J;
            long j2 = this.f17835p;
            long j3 = this.f17833n;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[J];
                gt3.m9998w(j3, bArr, 0, j);
                this.f17833n += j;
                return uo3.m17972M(bArr);
            }
        }
        if (J > 0 && J <= m20102C()) {
            byte[] bArr2 = new byte[J];
            m20104E(bArr2, 0, J);
            return uo3.m17972M(bArr2);
        } else if (J == 0) {
            return uo3.f15667g;
        } else {
            if (J < 0) {
                throw mq3.m13456f();
            }
            throw mq3.m13459j();
        }
    }

    /* renamed from: y */
    public final String mo5386y() {
        int J = mo12067J();
        if (J > 0) {
            long j = (long) J;
            long j2 = this.f17835p;
            long j3 = this.f17833n;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[J];
                gt3.m9998w(j3, bArr, 0, j);
                String str = new String(bArr, kq3.f9606b);
                this.f17833n += j;
                return str;
            }
        }
        if (J > 0 && J <= m20102C()) {
            byte[] bArr2 = new byte[J];
            m20104E(bArr2, 0, J);
            return new String(bArr2, kq3.f9606b);
        } else if (J == 0) {
            return "";
        } else {
            if (J < 0) {
                throw mq3.m13456f();
            }
            throw mq3.m13459j();
        }
    }

    /* renamed from: z */
    public final String mo5387z() {
        int J = mo12067J();
        if (J > 0) {
            long j = (long) J;
            long j2 = this.f17835p;
            long j3 = this.f17833n;
            if (j <= j2 - j3) {
                String g = lt3.m12869g(this.f17827h, (int) (j3 - this.f17834o), J);
                this.f17833n += j;
                return g;
            }
        }
        if (J >= 0 && J <= m20102C()) {
            byte[] bArr = new byte[J];
            m20104E(bArr, 0, J);
            return lt3.m12870h(bArr, 0, J);
        } else if (J == 0) {
            return "";
        } else {
            if (J <= 0) {
                throw mq3.m13456f();
            }
            throw mq3.m13459j();
        }
    }
}
