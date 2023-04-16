package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.core.graphics.drawable.a */
public final class C0650a {

    /* renamed from: a */
    private static Method f1968a;

    /* renamed from: b */
    private static boolean f1969b;

    /* renamed from: c */
    private static Method f1970c;

    /* renamed from: d */
    private static boolean f1971d;

    /* renamed from: androidx.core.graphics.drawable.a$a */
    static class C0651a {
        /* renamed from: a */
        static int m2700a(Drawable drawable) {
            return drawable.getAlpha();
        }

        /* renamed from: b */
        static Drawable m2701b(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
            return drawableContainerState.getChild(i);
        }

        /* renamed from: c */
        static Drawable m2702c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        /* renamed from: d */
        static boolean m2703d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        /* renamed from: e */
        static void m2704e(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: androidx.core.graphics.drawable.a$b */
    static class C0652b {
        /* renamed from: a */
        static void m2705a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        /* renamed from: b */
        static boolean m2706b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        /* renamed from: c */
        static ColorFilter m2707c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        /* renamed from: d */
        static void m2708d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        /* renamed from: e */
        static void m2709e(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        /* renamed from: f */
        static void m2710f(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        /* renamed from: g */
        static void m2711g(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        /* renamed from: h */
        static void m2712h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        /* renamed from: i */
        static void m2713i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* renamed from: androidx.core.graphics.drawable.a$c */
    static class C0653c {
        /* renamed from: a */
        static int m2714a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        /* renamed from: b */
        static boolean m2715b(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    /* renamed from: a */
    public static void m2684a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0652b.m2705a(drawable, theme);
        }
    }

    /* renamed from: b */
    public static boolean m2685b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0652b.m2706b(drawable);
        }
        return false;
    }

    /* renamed from: c */
    public static int m2686c(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0651a.m2700a(drawable);
        }
        return 0;
    }

    /* renamed from: d */
    public static ColorFilter m2687d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0652b.m2707c(drawable);
        }
        return null;
    }

    /* renamed from: e */
    public static int m2688e(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return C0653c.m2714a(drawable);
        }
        if (i >= 17) {
            if (!f1971d) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    f1970c = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
                }
                f1971d = true;
            }
            Method method = f1970c;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e2) {
                    Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                    f1970c = null;
                }
            }
        }
        return 0;
    }

    /* renamed from: f */
    public static void m2689f(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0652b.m2708d(drawable, resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    /* renamed from: g */
    public static boolean m2690g(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0651a.m2703d(drawable);
        }
        return false;
    }

    @Deprecated
    /* renamed from: h */
    public static void m2691h(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: i */
    public static void m2692i(Drawable drawable, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            C0651a.m2704e(drawable, z);
        }
    }

    /* renamed from: j */
    public static void m2693j(Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0652b.m2709e(drawable, f, f2);
        }
    }

    /* renamed from: k */
    public static void m2694k(Drawable drawable, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0652b.m2710f(drawable, i, i2, i3, i4);
        }
    }

    /* renamed from: l */
    public static boolean m2695l(Drawable drawable, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return C0653c.m2715b(drawable, i);
        }
        if (i2 >= 17) {
            if (!f1969b) {
                Class<Drawable> cls = Drawable.class;
                try {
                    Method declaredMethod = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                    f1968a = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
                }
                f1969b = true;
            }
            Method method = f1968a;
            if (method != null) {
                try {
                    method.invoke(drawable, new Object[]{Integer.valueOf(i)});
                    return true;
                } catch (Exception e2) {
                    Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                    f1968a = null;
                }
            }
        }
        return false;
    }

    /* renamed from: m */
    public static void m2696m(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0652b.m2711g(drawable, i);
        } else if (drawable instanceof C0654b) {
            ((C0654b) drawable).setTint(i);
        }
    }

    /* renamed from: n */
    public static void m2697n(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0652b.m2712h(drawable, colorStateList);
        } else if (drawable instanceof C0654b) {
            ((C0654b) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: o */
    public static void m2698o(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0652b.m2713i(drawable, mode);
        } else if (drawable instanceof C0654b) {
            ((C0654b) drawable).setTintMode(mode);
        }
    }

    /* renamed from: p */
    public static Drawable m2699p(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return i >= 23 ? drawable : i >= 21 ? !(drawable instanceof C0654b) ? new C0657e(drawable) : drawable : !(drawable instanceof C0654b) ? new C0656d(drawable) : drawable;
    }
}
