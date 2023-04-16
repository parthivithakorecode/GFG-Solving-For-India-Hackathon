package androidx.core.content.res;

/* renamed from: androidx.core.content.res.l */
final class C0637l {

    /* renamed from: k */
    static final C0637l f1935k = m2602k(C0612b.f1901c, (float) ((((double) C0612b.m2514h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a */
    private final float f1936a;

    /* renamed from: b */
    private final float f1937b;

    /* renamed from: c */
    private final float f1938c;

    /* renamed from: d */
    private final float f1939d;

    /* renamed from: e */
    private final float f1940e;

    /* renamed from: f */
    private final float f1941f;

    /* renamed from: g */
    private final float[] f1942g;

    /* renamed from: h */
    private final float f1943h;

    /* renamed from: i */
    private final float f1944i;

    /* renamed from: j */
    private final float f1945j;

    private C0637l(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f1941f = f;
        this.f1936a = f2;
        this.f1937b = f3;
        this.f1938c = f4;
        this.f1939d = f5;
        this.f1940e = f6;
        this.f1942g = fArr;
        this.f1943h = f7;
        this.f1944i = f8;
        this.f1945j = f9;
    }

    /* renamed from: k */
    static C0637l m2602k(float[] fArr, float f, float f2, float f3, boolean z) {
        float f4 = f;
        float[][] fArr2 = C0612b.f1899a;
        float f5 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f6 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f7 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f8 = (f3 / 10.0f) + 0.8f;
        float d = ((double) f8) >= 0.9d ? C0612b.m2510d(0.59f, 0.69f, (f8 - 0.9f) * 10.0f) : C0612b.m2510d(0.525f, 0.59f, (f8 - 0.8f) * 10.0f);
        float exp = z ? 1.0f : (1.0f - (((float) Math.exp((double) (((-f4) - 42.0f) / 92.0f))) * 0.2777778f)) * f8;
        double d2 = (double) exp;
        if (d2 > 1.0d) {
            exp = 1.0f;
        } else if (d2 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f5) * exp) + 1.0f) - exp, (((100.0f / f6) * exp) + 1.0f) - exp, (((100.0f / f7) * exp) + 1.0f) - exp};
        float f9 = 1.0f / ((5.0f * f4) + 1.0f);
        float f10 = f9 * f9 * f9 * f9;
        float f11 = 1.0f - f10;
        float cbrt = (f10 * f4) + (0.1f * f11 * f11 * ((float) Math.cbrt(((double) f4) * 5.0d)));
        float h = C0612b.m2514h(f2) / fArr[1];
        double d3 = (double) h;
        float sqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float[] fArr4 = {(float) Math.pow(((double) ((fArr3[0] * cbrt) * f5)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[1] * cbrt) * f6)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[2] * cbrt) * f7)) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new C0637l(h, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * pow, pow, pow, d, f8, fArr3, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo2580a() {
        return this.f1936a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo2581b() {
        return this.f1939d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo2582c() {
        return this.f1943h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo2583d() {
        return this.f1944i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo2584e() {
        return this.f1941f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public float mo2585f() {
        return this.f1937b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo2586g() {
        return this.f1940e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public float mo2587h() {
        return this.f1938c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public float[] mo2588i() {
        return this.f1942g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo2589j() {
        return this.f1945j;
    }
}
