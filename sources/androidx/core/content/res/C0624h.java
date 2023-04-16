package androidx.core.content.res;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.util.C0740c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: androidx.core.content.res.h */
public final class C0624h {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1920a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<C0629e, SparseArray<C0628d>> f1921b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f1922c = new Object();

    /* renamed from: androidx.core.content.res.h$a */
    static class C0625a {
        /* renamed from: a */
        static Drawable m2573a(Resources resources, int i, int i2) {
            return resources.getDrawableForDensity(i, i2);
        }
    }

    /* renamed from: androidx.core.content.res.h$b */
    static class C0626b {
        /* renamed from: a */
        static Drawable m2574a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        /* renamed from: b */
        static Drawable m2575b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    /* renamed from: androidx.core.content.res.h$c */
    static class C0627c {
        /* renamed from: a */
        static int m2576a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        /* renamed from: b */
        static ColorStateList m2577b(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* renamed from: androidx.core.content.res.h$d */
    private static class C0628d {

        /* renamed from: a */
        final ColorStateList f1923a;

        /* renamed from: b */
        final Configuration f1924b;

        /* renamed from: c */
        final int f1925c;

        C0628d(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f1923a = colorStateList;
            this.f1924b = configuration;
            this.f1925c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* renamed from: androidx.core.content.res.h$e */
    private static final class C0629e {

        /* renamed from: a */
        final Resources f1926a;

        /* renamed from: b */
        final Resources.Theme f1927b;

        C0629e(Resources resources, Resources.Theme theme) {
            this.f1926a = resources;
            this.f1927b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0629e.class != obj.getClass()) {
                return false;
            }
            C0629e eVar = (C0629e) obj;
            return this.f1926a.equals(eVar.f1926a) && C0740c.m2946a(this.f1927b, eVar.f1927b);
        }

        public int hashCode() {
            return C0740c.m2947b(this.f1926a, this.f1927b);
        }
    }

    /* renamed from: androidx.core.content.res.h$f */
    public static abstract class C0630f {
        /* renamed from: e */
        public static Handler m2580e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* renamed from: c */
        public final void mo2576c(int i, Handler handler) {
            m2580e(handler).post(new C0634i(this, i));
        }

        /* renamed from: d */
        public final void mo2577d(Typeface typeface, Handler handler) {
            m2580e(handler).post(new C0635j(this, typeface));
        }

        /* renamed from: h */
        public abstract void m2581f(int i);

        /* renamed from: i */
        public abstract void m2582g(Typeface typeface);
    }

    /* renamed from: androidx.core.content.res.h$g */
    public static final class C0631g {

        /* renamed from: androidx.core.content.res.h$g$a */
        static class C0632a {

            /* renamed from: a */
            private static final Object f1928a = new Object();

            /* renamed from: b */
            private static Method f1929b;

            /* renamed from: c */
            private static boolean f1930c;

            @SuppressLint({"BanUncheckedReflection"})
            /* renamed from: a */
            static void m2588a(Resources.Theme theme) {
                synchronized (f1928a) {
                    if (!f1930c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f1929b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                        }
                        f1930c = true;
                    }
                    Method method = f1929b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                            f1929b = null;
                        }
                    }
                }
            }
        }

        /* renamed from: androidx.core.content.res.h$g$b */
        static class C0633b {
            /* renamed from: a */
            static void m2589a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m2587a(Resources.Theme theme) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                C0633b.m2589a(theme);
            } else if (i >= 23) {
                C0632a.m2588a(theme);
            }
        }
    }

    /* renamed from: a */
    private static void m2562a(C0629e eVar, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f1922c) {
            WeakHashMap<C0629e, SparseArray<C0628d>> weakHashMap = f1921b;
            SparseArray sparseArray = weakHashMap.get(eVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(eVar, sparseArray);
            }
            sparseArray.append(i, new C0628d(colorStateList, eVar.f1926a.getConfiguration(), theme));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m2563b(androidx.core.content.res.C0624h.C0629e r5, int r6) {
        /*
            java.lang.Object r0 = f1922c
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.res.h$e, android.util.SparseArray<androidx.core.content.res.h$d>> r1 = f1921b     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0045 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0042
            int r2 = r1.size()     // Catch:{ all -> 0x0045 }
            if (r2 <= 0) goto L_0x0042
            java.lang.Object r2 = r1.get(r6)     // Catch:{ all -> 0x0045 }
            androidx.core.content.res.h$d r2 = (androidx.core.content.res.C0624h.C0628d) r2     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0042
            android.content.res.Configuration r3 = r2.f1924b     // Catch:{ all -> 0x0045 }
            android.content.res.Resources r4 = r5.f1926a     // Catch:{ all -> 0x0045 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0045 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x003f
            android.content.res.Resources$Theme r5 = r5.f1927b     // Catch:{ all -> 0x0045 }
            if (r5 != 0) goto L_0x0031
            int r3 = r2.f1925c     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x003b
        L_0x0031:
            if (r5 == 0) goto L_0x003f
            int r3 = r2.f1925c     // Catch:{ all -> 0x0045 }
            int r5 = r5.hashCode()     // Catch:{ all -> 0x0045 }
            if (r3 != r5) goto L_0x003f
        L_0x003b:
            android.content.res.ColorStateList r5 = r2.f1923a     // Catch:{ all -> 0x0045 }
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return r5
        L_0x003f:
            r1.remove(r6)     // Catch:{ all -> 0x0045 }
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            r5 = 0
            return r5
        L_0x0045:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0624h.m2563b(androidx.core.content.res.h$e, int):android.content.res.ColorStateList");
    }

    /* renamed from: c */
    public static ColorStateList m2564c(Resources resources, int i, Resources.Theme theme) {
        C0629e eVar = new C0629e(resources, theme);
        ColorStateList b = m2563b(eVar, i);
        if (b != null) {
            return b;
        }
        ColorStateList h = m2569h(resources, i, theme);
        if (h == null) {
            return Build.VERSION.SDK_INT >= 23 ? C0627c.m2577b(resources, i, theme) : resources.getColorStateList(i);
        }
        m2562a(eVar, i, h, theme);
        return h;
    }

    /* renamed from: d */
    public static Drawable m2565d(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? C0626b.m2574a(resources, i, theme) : resources.getDrawable(i);
    }

    /* renamed from: e */
    public static Drawable m2566e(Resources resources, int i, int i2, Resources.Theme theme) {
        int i3 = Build.VERSION.SDK_INT;
        return i3 >= 21 ? C0626b.m2575b(resources, i, i2, theme) : i3 >= 15 ? C0625a.m2573a(resources, i, i2) : resources.getDrawable(i);
    }

    /* renamed from: f */
    public static Typeface m2567f(Context context, int i, TypedValue typedValue, int i2, C0630f fVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m2571j(context, i, typedValue, i2, fVar, (Handler) null, true, false);
    }

    /* renamed from: g */
    private static TypedValue m2568g() {
        ThreadLocal<TypedValue> threadLocal = f1920a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: h */
    private static ColorStateList m2569h(Resources resources, int i, Resources.Theme theme) {
        if (m2570i(resources, i)) {
            return null;
        }
        try {
            return C0613c.m2515a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: i */
    private static boolean m2570i(Resources resources, int i) {
        TypedValue g = m2568g();
        resources.getValue(i, g, true);
        int i2 = g.type;
        return i2 >= 28 && i2 <= 31;
    }

    /* renamed from: j */
    private static Typeface m2571j(Context context, int i, TypedValue typedValue, int i2, C0630f fVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        int i3 = i;
        resources.getValue(i, typedValue, true);
        Typeface k = m2572k(context, resources, typedValue, i, i2, fVar, handler, z, z2);
        if (k != null || fVar != null || z2) {
            return k;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00aa  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface m2572k(android.content.Context r17, android.content.res.Resources r18, android.util.TypedValue r19, int r20, int r21, androidx.core.content.res.C0624h.C0630f r22, android.os.Handler r23, boolean r24, boolean r25) {
        /*
            r0 = r18
            r1 = r19
            r4 = r20
            r11 = r22
            r12 = r23
            java.lang.String r13 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x00ae
            java.lang.String r14 = r2.toString()
            java.lang.String r2 = "res/"
            boolean r2 = r14.startsWith(r2)
            r15 = -3
            r16 = 0
            if (r2 != 0) goto L_0x0025
            if (r11 == 0) goto L_0x0024
            r11.mo2576c(r15, r12)
        L_0x0024:
            return r16
        L_0x0025:
            int r2 = r1.assetCookie
            r7 = r21
            android.graphics.Typeface r2 = androidx.core.graphics.C0659e.m2732f(r0, r4, r14, r2, r7)
            if (r2 == 0) goto L_0x0035
            if (r11 == 0) goto L_0x0034
            r11.mo2577d(r2, r12)
        L_0x0034:
            return r2
        L_0x0035:
            if (r25 == 0) goto L_0x0038
            return r16
        L_0x0038:
            java.lang.String r2 = r14.toLowerCase()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            java.lang.String r3 = ".xml"
            boolean r2 = r2.endsWith(r3)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            if (r2 == 0) goto L_0x006f
            android.content.res.XmlResourceParser r2 = r0.getXml(r4)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            androidx.core.content.res.e$b r2 = androidx.core.content.res.C0615e.m2536b(r2, r0)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            if (r2 != 0) goto L_0x0059
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r13, r0)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            if (r11 == 0) goto L_0x0058
            r11.mo2576c(r15, r12)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
        L_0x0058:
            return r16
        L_0x0059:
            int r6 = r1.assetCookie     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            r1 = r17
            r3 = r18
            r4 = r20
            r5 = r14
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            android.graphics.Typeface r0 = androidx.core.graphics.C0659e.m2729c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            return r0
        L_0x006f:
            int r5 = r1.assetCookie     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            r1 = r17
            r2 = r18
            r3 = r20
            r4 = r14
            r6 = r21
            android.graphics.Typeface r0 = androidx.core.graphics.C0659e.m2730d(r1, r2, r3, r4, r5, r6)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            if (r11 == 0) goto L_0x0089
            if (r0 == 0) goto L_0x0086
            r11.mo2577d(r0, r12)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
            goto L_0x0089
        L_0x0086:
            r11.mo2576c(r15, r12)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x008a }
        L_0x0089:
            return r0
        L_0x008a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            goto L_0x009b
        L_0x0093:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
        L_0x009b:
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
            if (r11 == 0) goto L_0x00ad
            r11.mo2576c(r15, r12)
        L_0x00ad:
            return r16
        L_0x00ae:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r20)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0624h.m2572k(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.h$f, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
