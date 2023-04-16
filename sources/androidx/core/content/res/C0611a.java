package androidx.core.content.res;

import androidx.core.graphics.C0638a;

/* renamed from: androidx.core.content.res.a */
class C0611a {

    /* renamed from: a */
    private final float f1890a;

    /* renamed from: b */
    private final float f1891b;

    /* renamed from: c */
    private final float f1892c;

    /* renamed from: d */
    private final float f1893d;

    /* renamed from: e */
    private final float f1894e;

    /* renamed from: f */
    private final float f1895f;

    /* renamed from: g */
    private final float f1896g;

    /* renamed from: h */
    private final float f1897h;

    /* renamed from: i */
    private final float f1898i;

    C0611a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f1890a = f;
        this.f1891b = f2;
        this.f1892c = f3;
        this.f1893d = f4;
        this.f1894e = f5;
        this.f1895f = f6;
        this.f1896g = f7;
        this.f1897h = f8;
        this.f1898i = f9;
    }

    /* renamed from: b */
    private static C0611a m2491b(float f, float f2, float f3) {
        float f4 = 1000.0f;
        float f5 = 0.0f;
        C0611a aVar = null;
        float f6 = 100.0f;
        float f7 = 1000.0f;
        while (Math.abs(f5 - f6) > 0.01f) {
            float f8 = ((f6 - f5) / 2.0f) + f5;
            int p = m2494e(f8, f2, f).mo2555p();
            float b = C0612b.m2508b(p);
            float abs = Math.abs(f3 - b);
            if (abs < 0.2f) {
                C0611a c = m2492c(p);
                float a = c.mo2547a(m2494e(c.mo2552k(), c.mo2550i(), f));
                if (a <= 1.0f) {
                    aVar = c;
                    f4 = abs;
                    f7 = a;
                }
            }
            if (f4 == 0.0f && f7 == 0.0f) {
                break;
            } else if (b < f3) {
                f5 = f8;
            } else {
                f6 = f8;
            }
        }
        return aVar;
    }

    /* renamed from: c */
    static C0611a m2492c(int i) {
        return m2493d(i, C0637l.f1935k);
    }

    /* renamed from: d */
    static C0611a m2493d(int i, C0637l lVar) {
        float[] f = C0612b.m2512f(i);
        float[][] fArr = C0612b.f1899a;
        float f2 = (f[0] * fArr[0][0]) + (f[1] * fArr[0][1]) + (f[2] * fArr[0][2]);
        float f3 = (f[0] * fArr[1][0]) + (f[1] * fArr[1][1]) + (f[2] * fArr[1][2]);
        float f4 = (f[0] * fArr[2][0]) + (f[1] * fArr[2][1]) + (f[2] * fArr[2][2]);
        float f5 = lVar.mo2588i()[0] * f2;
        float f6 = lVar.mo2588i()[1] * f3;
        float f7 = lVar.mo2588i()[2] * f4;
        float pow = (float) Math.pow(((double) (lVar.mo2582c() * Math.abs(f5))) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (lVar.mo2582c() * Math.abs(f6))) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (lVar.mo2582c() * Math.abs(f7))) / 100.0d, 0.42d);
        float signum = ((Math.signum(f5) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f6) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f7) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = (double) signum3;
        float f8 = ((float) (((((double) signum) * 11.0d) + (((double) signum2) * -12.0d)) + d)) / 11.0f;
        float f9 = ((float) (((double) (signum + signum2)) - (d * 2.0d))) / 9.0f;
        float f10 = signum2 * 20.0f;
        float f11 = (((signum * 20.0f) + f10) + (21.0f * signum3)) / 20.0f;
        float f12 = (((signum * 40.0f) + f10) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f9, (double) f8)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f13 = atan2;
        float f14 = (3.1415927f * f13) / 180.0f;
        float pow4 = ((float) Math.pow((double) ((f12 * lVar.mo2585f()) / lVar.mo2580a()), (double) (lVar.mo2581b() * lVar.mo2589j()))) * 100.0f;
        float d2 = lVar.mo2583d() * (4.0f / lVar.mo2581b()) * ((float) Math.sqrt((double) (pow4 / 100.0f))) * (lVar.mo2580a() + 4.0f);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) lVar.mo2584e()), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) (((double) f13) < 20.14d ? 360.0f + f13 : f13)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.mo2586g()) * lVar.mo2587h()) * ((float) Math.sqrt((double) ((f8 * f8) + (f9 * f9))))) / (f11 + 0.305f)), 0.9d));
        float sqrt = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        float d3 = sqrt * lVar.mo2583d();
        float sqrt2 = ((float) Math.sqrt((double) ((pow5 * lVar.mo2581b()) / (lVar.mo2580a() + 4.0f)))) * 50.0f;
        float f15 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((0.0228f * d3) + 1.0f))) * 43.85965f;
        double d4 = (double) f14;
        return new C0611a(f13, sqrt, pow4, d2, d3, sqrt2, f15, log * ((float) Math.cos(d4)), log * ((float) Math.sin(d4)));
    }

    /* renamed from: e */
    private static C0611a m2494e(float f, float f2, float f3) {
        return m2495f(f, f2, f3, C0637l.f1935k);
    }

    /* renamed from: f */
    private static C0611a m2495f(float f, float f2, float f3, C0637l lVar) {
        float f4 = f;
        double d = ((double) f4) / 100.0d;
        float b = (4.0f / lVar.mo2581b()) * ((float) Math.sqrt(d)) * (lVar.mo2580a() + 4.0f) * lVar.mo2583d();
        float d2 = f2 * lVar.mo2583d();
        float sqrt = ((float) Math.sqrt((double) (((f2 / ((float) Math.sqrt(d))) * lVar.mo2581b()) / (lVar.mo2580a() + 4.0f)))) * 50.0f;
        float f5 = (1.7f * f4) / ((0.007f * f4) + 1.0f);
        float log = ((float) Math.log((((double) d2) * 0.0228d) + 1.0d)) * 43.85965f;
        double d3 = (double) ((3.1415927f * f3) / 180.0f);
        return new C0611a(f3, f2, f4, b, d2, sqrt, f5, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    /* renamed from: m */
    static int m2496m(float f, float f2, float f3) {
        return m2497n(f, f2, f3, C0637l.f1935k);
    }

    /* renamed from: n */
    static int m2497n(float f, float f2, float f3, C0637l lVar) {
        if (((double) f2) < 1.0d || ((double) Math.round(f3)) <= 0.0d || ((double) Math.round(f3)) >= 100.0d) {
            return C0612b.m2507a(f3);
        }
        float min = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        C0611a aVar = null;
        boolean z = true;
        float f4 = 0.0f;
        float f5 = f2;
        while (Math.abs(f4 - f2) >= 0.4f) {
            C0611a b = m2491b(min, f5, f3);
            if (z) {
                if (b != null) {
                    return b.mo2554o(lVar);
                }
                z = false;
            } else if (b == null) {
                f2 = f5;
            } else {
                f4 = f5;
                aVar = b;
            }
            f5 = ((f2 - f4) / 2.0f) + f4;
        }
        return aVar == null ? C0612b.m2507a(f3) : aVar.mo2554o(lVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo2547a(C0611a aVar) {
        float l = mo2553l() - aVar.mo2553l();
        float g = mo2548g() - aVar.mo2548g();
        float h = mo2549h() - aVar.mo2549h();
        return (float) (Math.pow(Math.sqrt((double) ((l * l) + (g * g) + (h * h))), 0.63d) * 1.41d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo2548g() {
        return this.f1897h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public float mo2549h() {
        return this.f1898i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public float mo2550i() {
        return this.f1891b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo2551j() {
        return this.f1890a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public float mo2552k() {
        return this.f1892c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public float mo2553l() {
        return this.f1896g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo2554o(C0637l lVar) {
        float pow = (float) Math.pow(((double) ((((double) mo2550i()) == 0.0d || ((double) mo2552k()) == 0.0d) ? 0.0f : mo2550i() / ((float) Math.sqrt(((double) mo2552k()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, (double) lVar.mo2584e()), 0.73d), 1.1111111111111112d);
        double j = (double) ((mo2551j() * 3.1415927f) / 180.0f);
        float a = lVar.mo2580a() * ((float) Math.pow(((double) mo2552k()) / 100.0d, (1.0d / ((double) lVar.mo2581b())) / ((double) lVar.mo2589j())));
        float cos = ((float) (Math.cos(2.0d + j) + 3.8d)) * 0.25f * 3846.1538f * lVar.mo2586g() * lVar.mo2587h();
        float f = a / lVar.mo2585f();
        float sin = (float) Math.sin(j);
        float cos2 = (float) Math.cos(j);
        float f2 = (((0.305f + f) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f3 = cos2 * f2;
        float f4 = f2 * sin;
        float f5 = f * 460.0f;
        float f6 = (((451.0f * f3) + f5) + (288.0f * f4)) / 1403.0f;
        float f7 = ((f5 - (891.0f * f3)) - (261.0f * f4)) / 1403.0f;
        float f8 = ((f5 - (f3 * 220.0f)) - (f4 * 6300.0f)) / 1403.0f;
        float signum = Math.signum(f6) * (100.0f / lVar.mo2582c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f6)) * 27.13d) / (400.0d - ((double) Math.abs(f6))))), 2.380952380952381d));
        float signum2 = Math.signum(f7) * (100.0f / lVar.mo2582c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f7)) * 27.13d) / (400.0d - ((double) Math.abs(f7))))), 2.380952380952381d));
        float signum3 = Math.signum(f8) * (100.0f / lVar.mo2582c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f8)) * 27.13d) / (400.0d - ((double) Math.abs(f8))))), 2.380952380952381d));
        float f9 = signum / lVar.mo2588i()[0];
        float f10 = signum2 / lVar.mo2588i()[1];
        float f11 = signum3 / lVar.mo2588i()[2];
        float[][] fArr = C0612b.f1900b;
        return C0638a.m2613a((double) ((fArr[0][0] * f9) + (fArr[0][1] * f10) + (fArr[0][2] * f11)), (double) ((fArr[1][0] * f9) + (fArr[1][1] * f10) + (fArr[1][2] * f11)), (double) ((f9 * fArr[2][0]) + (f10 * fArr[2][1]) + (f11 * fArr[2][2])));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo2555p() {
        return mo2554o(C0637l.f1935k);
    }
}
