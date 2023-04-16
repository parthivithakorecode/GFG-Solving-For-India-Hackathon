package androidx.core.graphics;

import android.graphics.Color;

/* renamed from: androidx.core.graphics.a */
public final class C0638a {

    /* renamed from: a */
    private static final ThreadLocal<double[]> f1946a = new ThreadLocal<>();

    /* renamed from: a */
    public static int m2613a(double d, double d2, double d3) {
        double d4 = (((3.2406d * d) + (-1.5372d * d2)) + (-0.4986d * d3)) / 100.0d;
        double d5 = (((-0.9689d * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d6 = (((0.0557d * d) + (-0.204d * d2)) + (1.057d * d3)) / 100.0d;
        return Color.rgb(m2617e((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d), 0, 255), m2617e((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d), 0, 255), m2617e((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d), 0, 255));
    }

    /* renamed from: b */
    private static int m2614b(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    /* renamed from: c */
    public static int m2615c(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int b = m2614b(alpha2, alpha);
        return Color.argb(b, m2616d(Color.red(i), alpha2, Color.red(i2), alpha, b), m2616d(Color.green(i), alpha2, Color.green(i2), alpha, b), m2616d(Color.blue(i), alpha2, Color.blue(i2), alpha, b));
    }

    /* renamed from: d */
    private static int m2616d(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    /* renamed from: e */
    private static int m2617e(int i, int i2, int i3) {
        return i < i2 ? i2 : Math.min(i, i3);
    }

    /* renamed from: f */
    public static int m2618f(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
