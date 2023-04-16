package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* renamed from: androidx.core.widget.e */
public final class C0872e {

    /* renamed from: androidx.core.widget.e$a */
    static class C0873a {
        /* renamed from: a */
        static void m3611a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* renamed from: androidx.core.widget.e$b */
    private static class C0874b {
        /* renamed from: a */
        public static EdgeEffect m3612a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* renamed from: b */
        public static float m3613b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        /* renamed from: c */
        public static float m3614c(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    /* renamed from: a */
    public static EdgeEffect m3607a(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? C0874b.m3612a(context, attributeSet) : new EdgeEffect(context);
    }

    /* renamed from: b */
    public static float m3608b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C0874b.m3613b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static void m3609c(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0873a.m3611a(edgeEffect, f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }

    /* renamed from: d */
    public static float m3610d(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C0874b.m3614c(edgeEffect, f, f2);
        }
        m3609c(edgeEffect, f, f2);
        return f;
    }
}
