package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.mg */
final class C1961mg {

    /* renamed from: a */
    private final int f10832a;

    /* renamed from: b */
    private final int f10833b;

    /* renamed from: c */
    private final int f10834c;

    /* renamed from: d */
    private final int f10835d;

    /* renamed from: e */
    private final int f10836e;

    /* renamed from: f */
    private final short[] f10837f;

    /* renamed from: g */
    private int f10838g;

    /* renamed from: h */
    private short[] f10839h;

    /* renamed from: i */
    private int f10840i;

    /* renamed from: j */
    private short[] f10841j;

    /* renamed from: k */
    private int f10842k;

    /* renamed from: l */
    private short[] f10843l;

    /* renamed from: m */
    private int f10844m = 0;

    /* renamed from: n */
    private int f10845n = 0;

    /* renamed from: o */
    private float f10846o = 1.0f;

    /* renamed from: p */
    private float f10847p = 1.0f;

    /* renamed from: q */
    private int f10848q;

    /* renamed from: r */
    private int f10849r;

    /* renamed from: s */
    private int f10850s;

    /* renamed from: t */
    private int f10851t;

    /* renamed from: u */
    private int f10852u = 0;

    /* renamed from: v */
    private int f10853v;

    /* renamed from: w */
    private int f10854w;

    /* renamed from: x */
    private int f10855x;

    public C1961mg(int i, int i2) {
        this.f10832a = i;
        this.f10833b = i2;
        this.f10834c = i / 400;
        int i3 = i / 65;
        this.f10835d = i3;
        int i4 = i3 + i3;
        this.f10836e = i4;
        this.f10837f = new short[i4];
        this.f10838g = i4;
        int i5 = i2 * i4;
        this.f10839h = new short[i5];
        this.f10840i = i4;
        this.f10841j = new short[i5];
        this.f10842k = i4;
        this.f10843l = new short[i5];
    }

    /* renamed from: g */
    private final int m13254g(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f10833b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
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
        this.f10854w = i5 / i7;
        this.f10855x = i8 / i6;
        return i7;
    }

    /* renamed from: h */
    private final void m13255h(short[] sArr, int i, int i2) {
        m13258k(i2);
        int i3 = this.f10833b;
        System.arraycopy(sArr, i * i3, this.f10841j, this.f10849r * i3, i3 * i2);
        this.f10849r += i2;
    }

    /* renamed from: i */
    private final void m13256i(short[] sArr, int i, int i2) {
        int i3 = this.f10836e / i2;
        int i4 = this.f10833b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f10837f[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: j */
    private final void m13257j(int i) {
        int i2 = this.f10848q;
        int i3 = this.f10838g;
        if (i2 + i > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.f10838g = i4;
            this.f10839h = Arrays.copyOf(this.f10839h, i4 * this.f10833b);
        }
    }

    /* renamed from: k */
    private final void m13258k(int i) {
        int i2 = this.f10849r;
        int i3 = this.f10840i;
        if (i2 + i > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.f10840i = i4;
            this.f10841j = Arrays.copyOf(this.f10841j, i4 * this.f10833b);
        }
    }

    /* renamed from: l */
    private static void m13259l(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
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

    /* renamed from: m */
    private final void m13260m() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.f10849r;
        float f = this.f10846o / this.f10847p;
        double d = (double) f;
        int i10 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i11 = this.f10848q;
            if (i11 >= this.f10836e) {
                int i12 = 0;
                while (true) {
                    int i13 = this.f10851t;
                    if (i13 > 0) {
                        int min = Math.min(this.f10836e, i13);
                        m13255h(this.f10839h, i12, min);
                        this.f10851t -= min;
                        i12 += min;
                    } else {
                        short[] sArr = this.f10839h;
                        int i14 = this.f10832a;
                        int i15 = i14 > 4000 ? i14 / 4000 : i10;
                        if (this.f10833b == i10 && i15 == i10) {
                            i5 = m13254g(sArr, i12, this.f10834c, this.f10835d);
                        } else {
                            m13256i(sArr, i12, i15);
                            int g = m13254g(this.f10837f, 0, this.f10834c / i15, this.f10835d / i15);
                            if (i15 != i10) {
                                int i16 = g * i15;
                                int i17 = i15 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                int i20 = this.f10834c;
                                if (i18 < i20) {
                                    i18 = i20;
                                }
                                int i21 = this.f10835d;
                                if (i19 > i21) {
                                    i19 = i21;
                                }
                                if (this.f10833b == i10) {
                                    i5 = m13254g(sArr, i12, i18, i19);
                                } else {
                                    m13256i(sArr, i12, i10);
                                    i5 = m13254g(this.f10837f, 0, i18, i19);
                                }
                            } else {
                                i5 = g;
                            }
                        }
                        int i22 = this.f10854w;
                        int i23 = (i22 == 0 || (i8 = this.f10852u) == 0 || this.f10855x > i22 * 3 || i22 + i22 <= this.f10853v * 3) ? i5 : i8;
                        this.f10853v = i22;
                        this.f10852u = i5;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f10839h;
                            if (f >= 2.0f) {
                                i7 = (int) (((float) i23) / (-1.0f + f));
                            } else {
                                this.f10851t = (int) ((((float) i23) * (2.0f - f)) / (-1.0f + f));
                                i7 = i23;
                            }
                            m13258k(i7);
                            int i24 = i7;
                            m13259l(i7, this.f10833b, this.f10841j, this.f10849r, sArr2, i12, sArr2, i12 + i23);
                            this.f10849r += i24;
                            i12 += i23 + i24;
                        } else {
                            int i25 = i23;
                            short[] sArr3 = this.f10839h;
                            if (f < 0.5f) {
                                i6 = (int) ((((float) i25) * f) / (1.0f - f));
                            } else {
                                this.f10851t = (int) ((((float) i25) * ((f + f) - 4.0f)) / (1.0f - f));
                                i6 = i25;
                            }
                            int i26 = i25 + i6;
                            m13258k(i26);
                            int i27 = this.f10833b;
                            System.arraycopy(sArr3, i12 * i27, this.f10841j, this.f10849r * i27, i27 * i25);
                            m13259l(i6, this.f10833b, this.f10841j, this.f10849r + i25, sArr3, i25 + i12, sArr3, i12);
                            this.f10849r += i26;
                            i12 += i6;
                        }
                    }
                    if (this.f10836e + i12 > i11) {
                        break;
                    }
                    i10 = 1;
                }
                int i28 = this.f10848q - i12;
                short[] sArr4 = this.f10839h;
                int i29 = this.f10833b;
                System.arraycopy(sArr4, i12 * i29, sArr4, 0, i29 * i28);
                this.f10848q = i28;
            }
        } else {
            m13255h(this.f10839h, 0, this.f10848q);
            this.f10848q = 0;
        }
        float f2 = this.f10847p;
        if (f2 != 1.0f && this.f10849r != i9) {
            int i30 = this.f10832a;
            int i31 = (int) (((float) i30) / f2);
            while (true) {
                if (i31 <= 16384 && i30 <= 16384) {
                    break;
                }
                i31 /= 2;
                i30 /= 2;
            }
            int i32 = this.f10849r - i9;
            int i33 = this.f10850s;
            int i34 = this.f10842k;
            if (i33 + i32 > i34) {
                int i35 = i34 + (i34 / 2) + i32;
                this.f10842k = i35;
                this.f10843l = Arrays.copyOf(this.f10843l, i35 * this.f10833b);
            }
            short[] sArr5 = this.f10841j;
            int i36 = this.f10833b;
            System.arraycopy(sArr5, i9 * i36, this.f10843l, this.f10850s * i36, i36 * i32);
            this.f10849r = i9;
            this.f10850s += i32;
            int i37 = 0;
            while (true) {
                i = this.f10850s;
                i2 = i - 1;
                if (i37 >= i2) {
                    break;
                }
                while (true) {
                    i3 = this.f10844m + 1;
                    i4 = this.f10845n;
                    if (i3 * i31 <= i4 * i30) {
                        break;
                    }
                    m13258k(1);
                    int i38 = 0;
                    while (true) {
                        int i39 = this.f10833b;
                        if (i38 >= i39) {
                            break;
                        }
                        short[] sArr6 = this.f10841j;
                        int i40 = this.f10849r;
                        short[] sArr7 = this.f10843l;
                        int i41 = (i37 * i39) + i38;
                        short s = sArr7[i41];
                        short s2 = sArr7[i41 + i39];
                        int i42 = this.f10845n;
                        int i43 = this.f10844m;
                        int i44 = (i43 + 1) * i31;
                        int i45 = i44 - (i42 * i30);
                        int i46 = i44 - (i43 * i31);
                        sArr6[(i40 * i39) + i38] = (short) (((s * i45) + ((i46 - i45) * s2)) / i46);
                        i38++;
                    }
                    this.f10845n++;
                    this.f10849r++;
                }
                this.f10844m = i3;
                if (i3 == i30) {
                    this.f10844m = 0;
                    C1856jm.m11730e(i4 == i31);
                    this.f10845n = 0;
                }
                i37++;
            }
            if (i2 != 0) {
                short[] sArr8 = this.f10843l;
                int i47 = this.f10833b;
                System.arraycopy(sArr8, i2 * i47, sArr8, 0, (i - i2) * i47);
                this.f10850s -= i2;
            }
        }
    }

    /* renamed from: a */
    public final int mo9233a() {
        return this.f10849r;
    }

    /* renamed from: b */
    public final void mo9234b(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f10833b, this.f10849r);
        shortBuffer.put(this.f10841j, 0, this.f10833b * min);
        int i = this.f10849r - min;
        this.f10849r = i;
        short[] sArr = this.f10841j;
        int i2 = this.f10833b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    /* renamed from: c */
    public final void mo9235c() {
        int i;
        int i2 = this.f10848q;
        float f = this.f10846o;
        float f2 = this.f10847p;
        int i3 = this.f10849r + ((int) ((((((float) i2) / (f / f2)) + ((float) this.f10850s)) / f2) + 0.5f));
        int i4 = this.f10836e;
        m13257j(i4 + i4 + i2);
        int i5 = 0;
        while (true) {
            int i6 = this.f10836e;
            i = i6 + i6;
            int i7 = this.f10833b;
            if (i5 >= i * i7) {
                break;
            }
            this.f10839h[(i7 * i2) + i5] = 0;
            i5++;
        }
        this.f10848q += i;
        m13260m();
        if (this.f10849r > i3) {
            this.f10849r = i3;
        }
        this.f10848q = 0;
        this.f10851t = 0;
        this.f10850s = 0;
    }

    /* renamed from: d */
    public final void mo9236d(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f10833b;
        int i2 = remaining / i;
        int i3 = i * i2;
        m13257j(i2);
        shortBuffer.get(this.f10839h, this.f10848q * this.f10833b, (i3 + i3) / 2);
        this.f10848q += i2;
        m13260m();
    }

    /* renamed from: e */
    public final void mo9237e(float f) {
        this.f10847p = f;
    }

    /* renamed from: f */
    public final void mo9238f(float f) {
        this.f10846o = f;
    }
}
