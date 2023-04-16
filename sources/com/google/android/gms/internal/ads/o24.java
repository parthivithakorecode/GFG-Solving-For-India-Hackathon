package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

final class o24 {

    /* renamed from: a */
    private final int f11833a;

    /* renamed from: b */
    private final int f11834b;

    /* renamed from: c */
    private final float f11835c;

    /* renamed from: d */
    private final float f11836d;

    /* renamed from: e */
    private final float f11837e;

    /* renamed from: f */
    private final int f11838f;

    /* renamed from: g */
    private final int f11839g;

    /* renamed from: h */
    private final int f11840h;

    /* renamed from: i */
    private final short[] f11841i;

    /* renamed from: j */
    private short[] f11842j;

    /* renamed from: k */
    private int f11843k;

    /* renamed from: l */
    private short[] f11844l;

    /* renamed from: m */
    private int f11845m;

    /* renamed from: n */
    private short[] f11846n;

    /* renamed from: o */
    private int f11847o;

    /* renamed from: p */
    private int f11848p;

    /* renamed from: q */
    private int f11849q;

    /* renamed from: r */
    private int f11850r;

    /* renamed from: s */
    private int f11851s;

    /* renamed from: t */
    private int f11852t;

    /* renamed from: u */
    private int f11853u;

    /* renamed from: v */
    private int f11854v;

    public o24(int i, int i2, float f, float f2, int i3) {
        this.f11833a = i;
        this.f11834b = i2;
        this.f11835c = f;
        this.f11836d = f2;
        this.f11837e = ((float) i) / ((float) i3);
        this.f11838f = i / 400;
        int i4 = i / 65;
        this.f11839g = i4;
        int i5 = i4 + i4;
        this.f11840h = i5;
        this.f11841i = new short[i5];
        int i6 = i5 * i2;
        this.f11842j = new short[i6];
        this.f11844l = new short[i6];
        this.f11846n = new short[i6];
    }

    /* renamed from: g */
    private final int m14248g(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f11834b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            int i11 = i9 * i7;
            int i12 = i5 * i2;
            if (i11 < i12) {
                i5 = i9;
            }
            if (i11 < i12) {
                i7 = i2;
            }
            int i13 = i9 * i6;
            int i14 = i8 * i2;
            if (i13 > i14) {
                i8 = i9;
            }
            if (i13 > i14) {
                i6 = i2;
            }
            i2++;
        }
        this.f11853u = i5 / i7;
        this.f11854v = i8 / i6;
        return i7;
    }

    /* renamed from: h */
    private final void m14249h(short[] sArr, int i, int i2) {
        short[] l = m14253l(this.f11844l, this.f11845m, i2);
        this.f11844l = l;
        int i3 = this.f11834b;
        System.arraycopy(sArr, i * i3, l, this.f11845m * i3, i3 * i2);
        this.f11845m += i2;
    }

    /* renamed from: i */
    private final void m14250i(short[] sArr, int i, int i2) {
        int i3 = this.f11840h / i2;
        int i4 = this.f11834b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f11841i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: j */
    private static void m14251j(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* renamed from: k */
    private final void m14252k() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.f11845m;
        float f = this.f11835c;
        float f2 = this.f11836d;
        float f3 = f / f2;
        float f4 = this.f11837e * f2;
        double d = (double) f3;
        float f5 = 1.0f;
        int i10 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i11 = this.f11843k;
            if (i11 >= this.f11840h) {
                int i12 = 0;
                while (true) {
                    int i13 = this.f11850r;
                    if (i13 > 0) {
                        int min = Math.min(this.f11840h, i13);
                        m14249h(this.f11842j, i12, min);
                        this.f11850r -= min;
                        i12 += min;
                    } else {
                        short[] sArr = this.f11842j;
                        int i14 = this.f11833a;
                        int i15 = i14 > 4000 ? i14 / 4000 : i10;
                        if (this.f11834b == i10 && i15 == i10) {
                            i5 = m14248g(sArr, i12, this.f11838f, this.f11839g);
                        } else {
                            m14250i(sArr, i12, i15);
                            int g = m14248g(this.f11841i, 0, this.f11838f / i15, this.f11839g / i15);
                            if (i15 != i10) {
                                int i16 = g * i15;
                                int i17 = i15 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                int i20 = this.f11838f;
                                if (i18 < i20) {
                                    i18 = i20;
                                }
                                int i21 = this.f11839g;
                                if (i19 > i21) {
                                    i19 = i21;
                                }
                                if (this.f11834b == i10) {
                                    i5 = m14248g(sArr, i12, i18, i19);
                                } else {
                                    m14250i(sArr, i12, i10);
                                    i5 = m14248g(this.f11841i, 0, i18, i19);
                                }
                            } else {
                                i5 = g;
                            }
                        }
                        int i22 = this.f11853u;
                        int i23 = (i22 == 0 || (i8 = this.f11851s) == 0 || this.f11854v > i22 * 3 || i22 + i22 <= this.f11852t * 3) ? i5 : i8;
                        this.f11852t = i22;
                        this.f11851s = i5;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f11842j;
                            if (f3 >= 2.0f) {
                                i7 = (int) (((float) i23) / (-1.0f + f3));
                            } else {
                                this.f11850r = (int) ((((float) i23) * (2.0f - f3)) / (-1.0f + f3));
                                i7 = i23;
                            }
                            short[] l = m14253l(this.f11844l, this.f11845m, i7);
                            this.f11844l = l;
                            int i24 = i7;
                            short[] sArr3 = sArr2;
                            m14251j(i7, this.f11834b, l, this.f11845m, sArr3, i12, sArr3, i12 + i23);
                            this.f11845m += i24;
                            i12 += i23 + i24;
                        } else {
                            int i25 = i23;
                            short[] sArr4 = this.f11842j;
                            if (f3 < 0.5f) {
                                i6 = (int) ((((float) i25) * f3) / (f5 - f3));
                            } else {
                                this.f11850r = (int) ((((float) i25) * ((f3 + f3) - 4.0f)) / (f5 - f3));
                                i6 = i25;
                            }
                            int i26 = i25 + i6;
                            short[] l2 = m14253l(this.f11844l, this.f11845m, i26);
                            this.f11844l = l2;
                            int i27 = this.f11834b;
                            System.arraycopy(sArr4, i12 * i27, l2, this.f11845m * i27, i27 * i25);
                            m14251j(i6, this.f11834b, this.f11844l, this.f11845m + i25, sArr4, i12 + i25, sArr4, i12);
                            this.f11845m += i26;
                            i12 += i6;
                        }
                    }
                    if (this.f11840h + i12 > i11) {
                        break;
                    }
                    f5 = 1.0f;
                    i10 = 1;
                }
                int i28 = this.f11843k - i12;
                short[] sArr5 = this.f11842j;
                int i29 = this.f11834b;
                System.arraycopy(sArr5, i12 * i29, sArr5, 0, i29 * i28);
                this.f11843k = i28;
                f5 = 1.0f;
            }
        } else {
            m14249h(this.f11842j, 0, this.f11843k);
            this.f11843k = 0;
        }
        if (f4 != f5 && this.f11845m != i9) {
            int i30 = this.f11833a;
            int i31 = (int) (((float) i30) / f4);
            while (true) {
                if (i31 <= 16384 && i30 <= 16384) {
                    break;
                }
                i31 /= 2;
                i30 /= 2;
            }
            int i32 = this.f11845m - i9;
            short[] l3 = m14253l(this.f11846n, this.f11847o, i32);
            this.f11846n = l3;
            short[] sArr6 = this.f11844l;
            int i33 = this.f11834b;
            System.arraycopy(sArr6, i9 * i33, l3, this.f11847o * i33, i33 * i32);
            this.f11845m = i9;
            this.f11847o += i32;
            int i34 = 0;
            while (true) {
                i = this.f11847o;
                i2 = i - 1;
                if (i34 >= i2) {
                    break;
                }
                while (true) {
                    i3 = this.f11848p + 1;
                    i4 = this.f11849q;
                    if (i3 * i31 <= i4 * i30) {
                        break;
                    }
                    this.f11844l = m14253l(this.f11844l, this.f11845m, 1);
                    int i35 = 0;
                    while (true) {
                        int i36 = this.f11834b;
                        if (i35 >= i36) {
                            break;
                        }
                        short[] sArr7 = this.f11844l;
                        int i37 = this.f11845m;
                        short[] sArr8 = this.f11846n;
                        int i38 = (i34 * i36) + i35;
                        short s = sArr8[i38];
                        short s2 = sArr8[i38 + i36];
                        int i39 = this.f11849q;
                        int i40 = this.f11848p;
                        int i41 = (i40 + 1) * i31;
                        int i42 = i41 - (i39 * i30);
                        int i43 = i41 - (i40 * i31);
                        sArr7[(i37 * i36) + i35] = (short) (((s * i42) + ((i43 - i42) * s2)) / i43);
                        i35++;
                    }
                    this.f11849q++;
                    this.f11845m++;
                }
                this.f11848p = i3;
                if (i3 == i30) {
                    this.f11848p = 0;
                    wu1.m19207f(i4 == i31);
                    this.f11849q = 0;
                }
                i34++;
            }
            if (i2 != 0) {
                short[] sArr9 = this.f11846n;
                int i44 = this.f11834b;
                System.arraycopy(sArr9, i2 * i44, sArr9, 0, (i - i2) * i44);
                this.f11847o -= i2;
            }
        }
    }

    /* renamed from: l */
    private final short[] m14253l(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f11834b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: a */
    public final int mo9631a() {
        int i = this.f11845m * this.f11834b;
        return i + i;
    }

    /* renamed from: b */
    public final int mo9632b() {
        int i = this.f11843k * this.f11834b;
        return i + i;
    }

    /* renamed from: c */
    public final void mo9633c() {
        this.f11843k = 0;
        this.f11845m = 0;
        this.f11847o = 0;
        this.f11848p = 0;
        this.f11849q = 0;
        this.f11850r = 0;
        this.f11851s = 0;
        this.f11852t = 0;
        this.f11853u = 0;
        this.f11854v = 0;
    }

    /* renamed from: d */
    public final void mo9634d(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f11834b, this.f11845m);
        shortBuffer.put(this.f11844l, 0, this.f11834b * min);
        int i = this.f11845m - min;
        this.f11845m = i;
        short[] sArr = this.f11844l;
        int i2 = this.f11834b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    /* renamed from: e */
    public final void mo9635e() {
        int i;
        int i2 = this.f11843k;
        float f = this.f11835c;
        float f2 = this.f11836d;
        int i3 = this.f11845m + ((int) ((((((float) i2) / (f / f2)) + ((float) this.f11847o)) / (this.f11837e * f2)) + 0.5f));
        short[] sArr = this.f11842j;
        int i4 = this.f11840h;
        this.f11842j = m14253l(sArr, i2, i4 + i4 + i2);
        int i5 = 0;
        while (true) {
            int i6 = this.f11840h;
            i = i6 + i6;
            int i7 = this.f11834b;
            if (i5 >= i * i7) {
                break;
            }
            this.f11842j[(i7 * i2) + i5] = 0;
            i5++;
        }
        this.f11843k += i;
        m14252k();
        if (this.f11845m > i3) {
            this.f11845m = i3;
        }
        this.f11843k = 0;
        this.f11850r = 0;
        this.f11847o = 0;
    }

    /* renamed from: f */
    public final void mo9636f(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f11834b;
        int i2 = remaining / i;
        int i3 = i * i2;
        short[] l = m14253l(this.f11842j, this.f11843k, i2);
        this.f11842j = l;
        shortBuffer.get(l, this.f11843k * this.f11834b, (i3 + i3) / 2);
        this.f11843k += i2;
        m14252k();
    }
}
