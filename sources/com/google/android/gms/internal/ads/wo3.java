package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class wo3 extends cp3 {

    /* renamed from: f */
    private final byte[] f16894f;

    /* renamed from: g */
    private int f16895g;

    /* renamed from: h */
    private int f16896h;

    /* renamed from: i */
    private int f16897i;

    /* renamed from: j */
    private final int f16898j;

    /* renamed from: k */
    private int f16899k;

    /* renamed from: l */
    private int f16900l = Integer.MAX_VALUE;

    /* synthetic */ wo3(byte[] bArr, int i, int i2, boolean z, vo3 vo3) {
        super((bp3) null);
        this.f16894f = bArr;
        this.f16895g = i2 + i;
        this.f16897i = i;
        this.f16898j = i;
    }

    /* renamed from: C */
    private final void m19073C() {
        int i = this.f16895g + this.f16896h;
        this.f16895g = i;
        int i2 = i - this.f16898j;
        int i3 = this.f16900l;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f16896h = i4;
            this.f16895g = i - i4;
            return;
        }
        this.f16896h = 0;
    }

    /* renamed from: A */
    public final void mo5357A(int i) {
        if (this.f16899k != i) {
            throw mq3.m13452b();
        }
    }

    /* renamed from: B */
    public final void mo11693B(int i) {
        if (i >= 0) {
            int i2 = this.f16895g;
            int i3 = this.f16897i;
            if (i <= i2 - i3) {
                this.f16897i = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw mq3.m13456f();
        }
        throw mq3.m13459j();
    }

    /* renamed from: D */
    public final byte mo11694D() {
        int i = this.f16897i;
        if (i != this.f16895g) {
            byte[] bArr = this.f16894f;
            this.f16897i = i + 1;
            return bArr[i];
        }
        throw mq3.m13459j();
    }

    /* renamed from: E */
    public final int mo11695E() {
        int i = this.f16897i;
        if (this.f16895g - i >= 4) {
            byte[] bArr = this.f16894f;
            this.f16897i = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw mq3.m13459j();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r2[r3] >= 0) goto L_0x0069;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo11696F() {
        /*
            r5 = this;
            int r0 = r5.f16897i
            int r1 = r5.f16895g
            if (r1 != r0) goto L_0x0007
            goto L_0x006c
        L_0x0007:
            byte[] r2 = r5.f16894f
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.f16897i = r3
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
            r5.f16897i = r1
            return r0
        L_0x006c:
            long r0 = r5.mo11699I()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wo3.mo11696F():int");
    }

    /* renamed from: G */
    public final long mo11697G() {
        int i = this.f16897i;
        if (this.f16895g - i >= 8) {
            byte[] bArr = this.f16894f;
            this.f16897i = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw mq3.m13459j();
    }

    /* renamed from: H */
    public final long mo11698H() {
        long j;
        long j2;
        long j3;
        long j4;
        byte b;
        int i = this.f16897i;
        int i2 = this.f16895g;
        if (i2 != i) {
            byte[] bArr = this.f16894f;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f16897i = i3;
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
                                                    this.f16897i = i4;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j3 ^ j6;
                                i4 = i6;
                                this.f16897i = i4;
                                return j;
                            }
                            j2 = j5 ^ j4;
                        }
                    }
                    i4 = i5;
                    j = j2;
                    this.f16897i = i4;
                    return j;
                }
                j = (long) b;
                this.f16897i = i4;
                return j;
            }
        }
        return mo11699I();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final long mo11699I() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte D = mo11694D();
            j |= ((long) (D & Byte.MAX_VALUE)) << i;
            if ((D & 128) == 0) {
                return j;
            }
        }
        throw mq3.m13455e();
    }

    /* renamed from: a */
    public final void mo5365a(int i) {
        this.f16900l = i;
        m19073C();
    }

    /* renamed from: b */
    public final boolean mo5366b() {
        return this.f16897i == this.f16895g;
    }

    /* renamed from: c */
    public final boolean mo5367c() {
        return mo11698H() != 0;
    }

    /* renamed from: d */
    public final boolean mo5368d(int i) {
        int q;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f16895g - this.f16897i >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.f16894f;
                    int i4 = this.f16897i;
                    this.f16897i = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw mq3.m13455e();
            }
            while (i3 < 10) {
                if (mo11694D() < 0) {
                    i3++;
                }
            }
            throw mq3.m13455e();
            return true;
        } else if (i2 == 1) {
            mo11693B(8);
            return true;
        } else if (i2 == 2) {
            mo11693B(mo11696F());
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
                mo11693B(4);
                return true;
            }
            throw mq3.m13451a();
        }
    }

    /* renamed from: h */
    public final double mo5369h() {
        return Double.longBitsToDouble(mo11697G());
    }

    /* renamed from: i */
    public final float mo5370i() {
        return Float.intBitsToFloat(mo11695E());
    }

    /* renamed from: j */
    public final int mo5371j() {
        return this.f16897i - this.f16898j;
    }

    /* renamed from: k */
    public final int mo5372k(int i) {
        if (i >= 0) {
            int i2 = i + (this.f16897i - this.f16898j);
            if (i2 >= 0) {
                int i3 = this.f16900l;
                if (i2 <= i3) {
                    this.f16900l = i2;
                    m19073C();
                    return i3;
                }
                throw mq3.m13459j();
            }
            throw mq3.m13457g();
        }
        throw mq3.m13456f();
    }

    /* renamed from: l */
    public final int mo5373l() {
        return mo11696F();
    }

    /* renamed from: m */
    public final int mo5374m() {
        return mo11695E();
    }

    /* renamed from: n */
    public final int mo5375n() {
        return mo11696F();
    }

    /* renamed from: o */
    public final int mo5376o() {
        return mo11695E();
    }

    /* renamed from: p */
    public final int mo5377p() {
        return cp3.m7489e(mo11696F());
    }

    /* renamed from: q */
    public final int mo5378q() {
        if (mo5366b()) {
            this.f16899k = 0;
            return 0;
        }
        int F = mo11696F();
        this.f16899k = F;
        if ((F >>> 3) != 0) {
            return F;
        }
        throw mq3.m13453c();
    }

    /* renamed from: r */
    public final int mo5379r() {
        return mo11696F();
    }

    /* renamed from: s */
    public final long mo5380s() {
        return mo11697G();
    }

    /* renamed from: t */
    public final long mo5381t() {
        return mo11698H();
    }

    /* renamed from: u */
    public final long mo5382u() {
        return mo11697G();
    }

    /* renamed from: v */
    public final long mo5383v() {
        return cp3.m7490f(mo11698H());
    }

    /* renamed from: w */
    public final long mo5384w() {
        return mo11698H();
    }

    /* renamed from: x */
    public final uo3 mo5385x() {
        int F = mo11696F();
        if (F > 0) {
            int i = this.f16895g;
            int i2 = this.f16897i;
            if (F <= i - i2) {
                uo3 J = uo3.m17969J(this.f16894f, i2, F);
                this.f16897i += F;
                return J;
            }
        }
        if (F == 0) {
            return uo3.f15667g;
        }
        if (F > 0) {
            int i3 = this.f16895g;
            int i4 = this.f16897i;
            if (F <= i3 - i4) {
                int i5 = F + i4;
                this.f16897i = i5;
                return uo3.m17972M(Arrays.copyOfRange(this.f16894f, i4, i5));
            }
        }
        if (F <= 0) {
            throw mq3.m13456f();
        }
        throw mq3.m13459j();
    }

    /* renamed from: y */
    public final String mo5386y() {
        int F = mo11696F();
        if (F > 0) {
            int i = this.f16895g;
            int i2 = this.f16897i;
            if (F <= i - i2) {
                String str = new String(this.f16894f, i2, F, kq3.f9606b);
                this.f16897i += F;
                return str;
            }
        }
        if (F == 0) {
            return "";
        }
        if (F < 0) {
            throw mq3.m13456f();
        }
        throw mq3.m13459j();
    }

    /* renamed from: z */
    public final String mo5387z() {
        int F = mo11696F();
        if (F > 0) {
            int i = this.f16895g;
            int i2 = this.f16897i;
            if (F <= i - i2) {
                String h = lt3.m12870h(this.f16894f, i2, F);
                this.f16897i += F;
                return h;
            }
        }
        if (F == 0) {
            return "";
        }
        if (F <= 0) {
            throw mq3.m13456f();
        }
        throw mq3.m13459j();
    }
}
