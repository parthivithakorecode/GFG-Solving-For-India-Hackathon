package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.C0639b;
import androidx.core.util.C0740c;
import androidx.core.util.C0743e;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: androidx.core.view.i0 */
public class C0796i0 {

    /* renamed from: b */
    public static final C0796i0 f2217b = (Build.VERSION.SDK_INT >= 30 ? C0807k.f2247q : C0808l.f2248b);

    /* renamed from: a */
    private final C0808l f2218a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: androidx.core.view.i0$a */
    static class C0797a {

        /* renamed from: a */
        private static Field f2219a;

        /* renamed from: b */
        private static Field f2220b;

        /* renamed from: c */
        private static Field f2221c;

        /* renamed from: d */
        private static boolean f2222d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f2219a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f2220b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f2221c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }

        /* renamed from: a */
        public static C0796i0 m3177a(View view) {
            if (f2222d && view.isAttachedToWindow()) {
                try {
                    Object obj = f2219a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f2220b.get(obj);
                        Rect rect2 = (Rect) f2221c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            C0796i0 a = new C0798b().mo2892b(C0639b.m2621c(rect)).mo2893c(C0639b.m2621c(rect2)).mo2891a();
                            a.mo2888r(a);
                            a.mo2873d(view.getRootView());
                            return a;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }
    }

    /* renamed from: androidx.core.view.i0$b */
    public static final class C0798b {

        /* renamed from: a */
        private final C0802f f2223a;

        public C0798b() {
            int i = Build.VERSION.SDK_INT;
            this.f2223a = i >= 30 ? new C0801e() : i >= 29 ? new C0800d() : i >= 20 ? new C0799c() : new C0802f();
        }

        public C0798b(C0796i0 i0Var) {
            int i = Build.VERSION.SDK_INT;
            this.f2223a = i >= 30 ? new C0801e(i0Var) : i >= 29 ? new C0800d(i0Var) : i >= 20 ? new C0799c(i0Var) : new C0802f(i0Var);
        }

        /* renamed from: a */
        public C0796i0 mo2891a() {
            return this.f2223a.mo2894b();
        }

        @Deprecated
        /* renamed from: b */
        public C0798b mo2892b(C0639b bVar) {
            this.f2223a.mo2895d(bVar);
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public C0798b mo2893c(C0639b bVar) {
            this.f2223a.mo2896f(bVar);
            return this;
        }
    }

    /* renamed from: androidx.core.view.i0$c */
    private static class C0799c extends C0802f {

        /* renamed from: e */
        private static Field f2224e = null;

        /* renamed from: f */
        private static boolean f2225f = false;

        /* renamed from: g */
        private static Constructor<WindowInsets> f2226g = null;

        /* renamed from: h */
        private static boolean f2227h = false;

        /* renamed from: c */
        private WindowInsets f2228c;

        /* renamed from: d */
        private C0639b f2229d;

        C0799c() {
            this.f2228c = m3181h();
        }

        C0799c(C0796i0 i0Var) {
            super(i0Var);
            this.f2228c = i0Var.mo2890t();
        }

        /* renamed from: h */
        private static WindowInsets m3181h() {
            if (!f2225f) {
                try {
                    f2224e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f2225f = true;
            }
            Field field = f2224e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f2227h) {
                try {
                    f2226g = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f2227h = true;
            }
            Constructor<WindowInsets> constructor = f2226g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0796i0 mo2894b() {
            mo2900a();
            C0796i0 u = C0796i0.m3156u(this.f2228c);
            u.mo2886p(this.f2232b);
            u.mo2889s(this.f2229d);
            return u;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo2895d(C0639b bVar) {
            this.f2229d = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo2896f(C0639b bVar) {
            WindowInsets windowInsets = this.f2228c;
            if (windowInsets != null) {
                this.f2228c = windowInsets.replaceSystemWindowInsets(bVar.f1948a, bVar.f1949b, bVar.f1950c, bVar.f1951d);
            }
        }
    }

    /* renamed from: androidx.core.view.i0$d */
    private static class C0800d extends C0802f {

        /* renamed from: c */
        final WindowInsets.Builder f2230c;

        C0800d() {
            this.f2230c = new WindowInsets.Builder();
        }

        C0800d(C0796i0 i0Var) {
            super(i0Var);
            WindowInsets.Builder builder;
            WindowInsets t = i0Var.mo2890t();
            if (t == null) {
                builder = new WindowInsets.Builder();
            }
            this.f2230c = builder;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0796i0 mo2894b() {
            mo2900a();
            C0796i0 u = C0796i0.m3156u(this.f2230c.build());
            u.mo2886p(this.f2232b);
            return u;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo2897c(C0639b bVar) {
            this.f2230c.setMandatorySystemGestureInsets(bVar.mo2590e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo2895d(C0639b bVar) {
            this.f2230c.setStableInsets(bVar.mo2590e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo2898e(C0639b bVar) {
            this.f2230c.setSystemGestureInsets(bVar.mo2590e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo2896f(C0639b bVar) {
            this.f2230c.setSystemWindowInsets(bVar.mo2590e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo2899g(C0639b bVar) {
            this.f2230c.setTappableElementInsets(bVar.mo2590e());
        }
    }

    /* renamed from: androidx.core.view.i0$e */
    private static class C0801e extends C0800d {
        C0801e() {
        }

        C0801e(C0796i0 i0Var) {
            super(i0Var);
        }
    }

    /* renamed from: androidx.core.view.i0$f */
    private static class C0802f {

        /* renamed from: a */
        private final C0796i0 f2231a;

        /* renamed from: b */
        C0639b[] f2232b;

        C0802f() {
            this(new C0796i0((C0796i0) null));
        }

        C0802f(C0796i0 i0Var) {
            this.f2231a = i0Var;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo2900a() {
            C0639b[] bVarArr = this.f2232b;
            if (bVarArr != null) {
                C0639b bVar = bVarArr[C0809m.m3245a(1)];
                C0639b bVar2 = this.f2232b[C0809m.m3245a(2)];
                if (bVar2 == null) {
                    bVar2 = this.f2231a.mo2876f(2);
                }
                if (bVar == null) {
                    bVar = this.f2231a.mo2876f(1);
                }
                mo2896f(C0639b.m2619a(bVar, bVar2));
                C0639b bVar3 = this.f2232b[C0809m.m3245a(16)];
                if (bVar3 != null) {
                    mo2898e(bVar3);
                }
                C0639b bVar4 = this.f2232b[C0809m.m3245a(32)];
                if (bVar4 != null) {
                    mo2897c(bVar4);
                }
                C0639b bVar5 = this.f2232b[C0809m.m3245a(64)];
                if (bVar5 != null) {
                    mo2899g(bVar5);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0796i0 mo2894b() {
            mo2900a();
            return this.f2231a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo2897c(C0639b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo2895d(C0639b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo2898e(C0639b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo2896f(C0639b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo2899g(C0639b bVar) {
        }
    }

    /* renamed from: androidx.core.view.i0$g */
    private static class C0803g extends C0808l {

        /* renamed from: h */
        private static boolean f2233h = false;

        /* renamed from: i */
        private static Method f2234i;

        /* renamed from: j */
        private static Class<?> f2235j;

        /* renamed from: k */
        private static Field f2236k;

        /* renamed from: l */
        private static Field f2237l;

        /* renamed from: c */
        final WindowInsets f2238c;

        /* renamed from: d */
        private C0639b[] f2239d;

        /* renamed from: e */
        private C0639b f2240e;

        /* renamed from: f */
        private C0796i0 f2241f;

        /* renamed from: g */
        C0639b f2242g;

        C0803g(C0796i0 i0Var, WindowInsets windowInsets) {
            super(i0Var);
            this.f2240e = null;
            this.f2238c = windowInsets;
        }

        C0803g(C0796i0 i0Var, C0803g gVar) {
            this(i0Var, new WindowInsets(gVar.f2238c));
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: t */
        private C0639b m3198t(int i, boolean z) {
            C0639b bVar = C0639b.f1947e;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    bVar = C0639b.m2619a(bVar, mo2911u(i2, z));
                }
            }
            return bVar;
        }

        /* renamed from: v */
        private C0639b m3199v() {
            C0796i0 i0Var = this.f2241f;
            return i0Var != null ? i0Var.mo2877g() : C0639b.f1947e;
        }

        /* renamed from: w */
        private C0639b m3200w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f2233h) {
                    m3201x();
                }
                Method method = f2234i;
                if (!(method == null || f2235j == null || f2236k == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f2236k.get(f2237l.get(invoke));
                        if (rect != null) {
                            return C0639b.m2621c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: x */
        private static void m3201x() {
            try {
                f2234i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f2235j = cls;
                f2236k = cls.getDeclaredField("mVisibleInsets");
                f2237l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f2236k.setAccessible(true);
                f2237l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            f2233h = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo2901d(View view) {
            C0639b w = m3200w(view);
            if (w == null) {
                w = C0639b.f1947e;
            }
            mo2909q(w);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo2902e(C0796i0 i0Var) {
            i0Var.mo2888r(this.f2241f);
            i0Var.mo2887q(this.f2242g);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f2242g, ((C0803g) obj).f2242g);
        }

        /* renamed from: g */
        public C0639b mo2904g(int i) {
            return m3198t(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public final C0639b mo2905k() {
            if (this.f2240e == null) {
                this.f2240e = C0639b.m2620b(this.f2238c.getSystemWindowInsetLeft(), this.f2238c.getSystemWindowInsetTop(), this.f2238c.getSystemWindowInsetRight(), this.f2238c.getSystemWindowInsetBottom());
            }
            return this.f2240e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C0796i0 mo2906m(int i, int i2, int i3, int i4) {
            C0798b bVar = new C0798b(C0796i0.m3156u(this.f2238c));
            bVar.mo2893c(C0796i0.m3155m(mo2905k(), i, i2, i3, i4));
            bVar.mo2892b(C0796i0.m3155m(mo2914i(), i, i2, i3, i4));
            return bVar.mo2891a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public boolean mo2907o() {
            return this.f2238c.isRound();
        }

        /* renamed from: p */
        public void mo2908p(C0639b[] bVarArr) {
            this.f2239d = bVarArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo2909q(C0639b bVar) {
            this.f2242g = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo2910r(C0796i0 i0Var) {
            this.f2241f = i0Var;
        }

        /* access modifiers changed from: protected */
        /* renamed from: u */
        public C0639b mo2911u(int i, boolean z) {
            int i2;
            if (i == 1) {
                return z ? C0639b.m2620b(0, Math.max(m3199v().f1949b, mo2905k().f1949b), 0, 0) : C0639b.m2620b(0, mo2905k().f1949b, 0, 0);
            }
            C0639b bVar = null;
            if (i != 2) {
                if (i == 8) {
                    C0639b[] bVarArr = this.f2239d;
                    if (bVarArr != null) {
                        bVar = bVarArr[C0809m.m3245a(8)];
                    }
                    if (bVar != null) {
                        return bVar;
                    }
                    C0639b k = mo2905k();
                    C0639b v = m3199v();
                    int i3 = k.f1951d;
                    if (i3 > v.f1951d) {
                        return C0639b.m2620b(0, 0, 0, i3);
                    }
                    C0639b bVar2 = this.f2242g;
                    return (bVar2 == null || bVar2.equals(C0639b.f1947e) || (i2 = this.f2242g.f1951d) <= v.f1951d) ? C0639b.f1947e : C0639b.m2620b(0, 0, 0, i2);
                } else if (i == 16) {
                    return mo2921j();
                } else {
                    if (i == 32) {
                        return mo2920h();
                    }
                    if (i == 64) {
                        return mo2922l();
                    }
                    if (i != 128) {
                        return C0639b.f1947e;
                    }
                    C0796i0 i0Var = this.f2241f;
                    C0779d e = i0Var != null ? i0Var.mo2874e() : mo2918f();
                    return e != null ? C0639b.m2620b(e.mo2846b(), e.mo2848d(), e.mo2847c(), e.mo2845a()) : C0639b.f1947e;
                }
            } else if (z) {
                C0639b v2 = m3199v();
                C0639b i4 = mo2914i();
                return C0639b.m2620b(Math.max(v2.f1948a, i4.f1948a), 0, Math.max(v2.f1950c, i4.f1950c), Math.max(v2.f1951d, i4.f1951d));
            } else {
                C0639b k2 = mo2905k();
                C0796i0 i0Var2 = this.f2241f;
                if (i0Var2 != null) {
                    bVar = i0Var2.mo2877g();
                }
                int i5 = k2.f1951d;
                if (bVar != null) {
                    i5 = Math.min(i5, bVar.f1951d);
                }
                return C0639b.m2620b(k2.f1948a, 0, k2.f1950c, i5);
            }
        }
    }

    /* renamed from: androidx.core.view.i0$h */
    private static class C0804h extends C0803g {

        /* renamed from: m */
        private C0639b f2243m = null;

        C0804h(C0796i0 i0Var, WindowInsets windowInsets) {
            super(i0Var, windowInsets);
        }

        C0804h(C0796i0 i0Var, C0804h hVar) {
            super(i0Var, (C0803g) hVar);
            this.f2243m = hVar.f2243m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0796i0 mo2912b() {
            return C0796i0.m3156u(this.f2238c.consumeStableInsets());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0796i0 mo2913c() {
            return C0796i0.m3156u(this.f2238c.consumeSystemWindowInsets());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public final C0639b mo2914i() {
            if (this.f2243m == null) {
                this.f2243m = C0639b.m2620b(this.f2238c.getStableInsetLeft(), this.f2238c.getStableInsetTop(), this.f2238c.getStableInsetRight(), this.f2238c.getStableInsetBottom());
            }
            return this.f2243m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo2915n() {
            return this.f2238c.isConsumed();
        }

        /* renamed from: s */
        public void mo2916s(C0639b bVar) {
            this.f2243m = bVar;
        }
    }

    /* renamed from: androidx.core.view.i0$i */
    private static class C0805i extends C0804h {
        C0805i(C0796i0 i0Var, WindowInsets windowInsets) {
            super(i0Var, windowInsets);
        }

        C0805i(C0796i0 i0Var, C0805i iVar) {
            super(i0Var, (C0804h) iVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0796i0 mo2917a() {
            return C0796i0.m3156u(this.f2238c.consumeDisplayCutout());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0805i)) {
                return false;
            }
            C0805i iVar = (C0805i) obj;
            return Objects.equals(this.f2238c, iVar.f2238c) && Objects.equals(this.f2242g, iVar.f2242g);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C0779d mo2918f() {
            return C0779d.m3097e(this.f2238c.getDisplayCutout());
        }

        public int hashCode() {
            return this.f2238c.hashCode();
        }
    }

    /* renamed from: androidx.core.view.i0$j */
    private static class C0806j extends C0805i {

        /* renamed from: n */
        private C0639b f2244n = null;

        /* renamed from: o */
        private C0639b f2245o = null;

        /* renamed from: p */
        private C0639b f2246p = null;

        C0806j(C0796i0 i0Var, WindowInsets windowInsets) {
            super(i0Var, windowInsets);
        }

        C0806j(C0796i0 i0Var, C0806j jVar) {
            super(i0Var, (C0805i) jVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C0639b mo2920h() {
            if (this.f2245o == null) {
                this.f2245o = C0639b.m2622d(this.f2238c.getMandatorySystemGestureInsets());
            }
            return this.f2245o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C0639b mo2921j() {
            if (this.f2244n == null) {
                this.f2244n = C0639b.m2622d(this.f2238c.getSystemGestureInsets());
            }
            return this.f2244n;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public C0639b mo2922l() {
            if (this.f2246p == null) {
                this.f2246p = C0639b.m2622d(this.f2238c.getTappableElementInsets());
            }
            return this.f2246p;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C0796i0 mo2906m(int i, int i2, int i3, int i4) {
            return C0796i0.m3156u(this.f2238c.inset(i, i2, i3, i4));
        }

        /* renamed from: s */
        public void mo2916s(C0639b bVar) {
        }
    }

    /* renamed from: androidx.core.view.i0$k */
    private static class C0807k extends C0806j {

        /* renamed from: q */
        static final C0796i0 f2247q = C0796i0.m3156u(WindowInsets.CONSUMED);

        C0807k(C0796i0 i0Var, WindowInsets windowInsets) {
            super(i0Var, windowInsets);
        }

        C0807k(C0796i0 i0Var, C0807k kVar) {
            super(i0Var, (C0806j) kVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo2901d(View view) {
        }

        /* renamed from: g */
        public C0639b mo2904g(int i) {
            return C0639b.m2622d(this.f2238c.getInsets(C0810n.m3246a(i)));
        }
    }

    /* renamed from: androidx.core.view.i0$l */
    private static class C0808l {

        /* renamed from: b */
        static final C0796i0 f2248b = new C0798b().mo2891a().mo2870a().mo2871b().mo2872c();

        /* renamed from: a */
        final C0796i0 f2249a;

        C0808l(C0796i0 i0Var) {
            this.f2249a = i0Var;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0796i0 mo2917a() {
            return this.f2249a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0796i0 mo2912b() {
            return this.f2249a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0796i0 mo2913c() {
            return this.f2249a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo2901d(View view) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo2902e(C0796i0 i0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0808l)) {
                return false;
            }
            C0808l lVar = (C0808l) obj;
            return mo2907o() == lVar.mo2907o() && mo2915n() == lVar.mo2915n() && C0740c.m2946a(mo2905k(), lVar.mo2905k()) && C0740c.m2946a(mo2914i(), lVar.mo2914i()) && C0740c.m2946a(mo2918f(), lVar.mo2918f());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C0779d mo2918f() {
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C0639b mo2904g(int i) {
            return C0639b.f1947e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C0639b mo2920h() {
            return mo2905k();
        }

        public int hashCode() {
            return C0740c.m2947b(Boolean.valueOf(mo2907o()), Boolean.valueOf(mo2915n()), mo2905k(), mo2914i(), mo2918f());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C0639b mo2914i() {
            return C0639b.f1947e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C0639b mo2921j() {
            return mo2905k();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public C0639b mo2905k() {
            return C0639b.f1947e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public C0639b mo2922l() {
            return mo2905k();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C0796i0 mo2906m(int i, int i2, int i3, int i4) {
            return f2248b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo2915n() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public boolean mo2907o() {
            return false;
        }

        /* renamed from: p */
        public void mo2908p(C0639b[] bVarArr) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo2909q(C0639b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo2910r(C0796i0 i0Var) {
        }

        /* renamed from: s */
        public void mo2916s(C0639b bVar) {
        }
    }

    /* renamed from: androidx.core.view.i0$m */
    public static final class C0809m {
        /* renamed from: a */
        static int m3245a(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
        }
    }

    /* renamed from: androidx.core.view.i0$n */
    private static final class C0810n {
        /* renamed from: a */
        static int m3246a(int i) {
            int i2;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i & i4) != 0) {
                    if (i4 == 1) {
                        i2 = WindowInsets.Type.statusBars();
                    } else if (i4 == 2) {
                        i2 = WindowInsets.Type.navigationBars();
                    } else if (i4 == 4) {
                        i2 = WindowInsets.Type.captionBar();
                    } else if (i4 == 8) {
                        i2 = WindowInsets.Type.ime();
                    } else if (i4 == 16) {
                        i2 = WindowInsets.Type.systemGestures();
                    } else if (i4 == 32) {
                        i2 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        i2 = WindowInsets.Type.tappableElement();
                    } else if (i4 == 128) {
                        i2 = WindowInsets.Type.displayCutout();
                    }
                    i3 |= i2;
                }
            }
            return i3;
        }
    }

    private C0796i0(WindowInsets windowInsets) {
        C0808l gVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            gVar = new C0807k(this, windowInsets);
        } else if (i >= 29) {
            gVar = new C0806j(this, windowInsets);
        } else if (i >= 28) {
            gVar = new C0805i(this, windowInsets);
        } else if (i >= 21) {
            gVar = new C0804h(this, windowInsets);
        } else if (i >= 20) {
            gVar = new C0803g(this, windowInsets);
        } else {
            this.f2218a = new C0808l(this);
            return;
        }
        this.f2218a = gVar;
    }

    public C0796i0(C0796i0 i0Var) {
        if (i0Var != null) {
            C0808l lVar = i0Var.f2218a;
            int i = Build.VERSION.SDK_INT;
            this.f2218a = (i < 30 || !(lVar instanceof C0807k)) ? (i < 29 || !(lVar instanceof C0806j)) ? (i < 28 || !(lVar instanceof C0805i)) ? (i < 21 || !(lVar instanceof C0804h)) ? (i < 20 || !(lVar instanceof C0803g)) ? new C0808l(this) : new C0803g(this, (C0803g) lVar) : new C0804h(this, (C0804h) lVar) : new C0805i(this, (C0805i) lVar) : new C0806j(this, (C0806j) lVar) : new C0807k(this, (C0807k) lVar);
            lVar.mo2902e(this);
            return;
        }
        this.f2218a = new C0808l(this);
    }

    /* renamed from: m */
    static C0639b m3155m(C0639b bVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, bVar.f1948a - i);
        int max2 = Math.max(0, bVar.f1949b - i2);
        int max3 = Math.max(0, bVar.f1950c - i3);
        int max4 = Math.max(0, bVar.f1951d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? bVar : C0639b.m2620b(max, max2, max3, max4);
    }

    /* renamed from: u */
    public static C0796i0 m3156u(WindowInsets windowInsets) {
        return m3157v(windowInsets, (View) null);
    }

    /* renamed from: v */
    public static C0796i0 m3157v(WindowInsets windowInsets, View view) {
        C0796i0 i0Var = new C0796i0((WindowInsets) C0743e.m2958f(windowInsets));
        if (view != null && C0833y.m3316A(view)) {
            i0Var.mo2888r(C0833y.m3365u(view));
            i0Var.mo2873d(view.getRootView());
        }
        return i0Var;
    }

    @Deprecated
    /* renamed from: a */
    public C0796i0 mo2870a() {
        return this.f2218a.mo2917a();
    }

    @Deprecated
    /* renamed from: b */
    public C0796i0 mo2871b() {
        return this.f2218a.mo2912b();
    }

    @Deprecated
    /* renamed from: c */
    public C0796i0 mo2872c() {
        return this.f2218a.mo2913c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2873d(View view) {
        this.f2218a.mo2901d(view);
    }

    /* renamed from: e */
    public C0779d mo2874e() {
        return this.f2218a.mo2918f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0796i0)) {
            return false;
        }
        return C0740c.m2946a(this.f2218a, ((C0796i0) obj).f2218a);
    }

    /* renamed from: f */
    public C0639b mo2876f(int i) {
        return this.f2218a.mo2904g(i);
    }

    @Deprecated
    /* renamed from: g */
    public C0639b mo2877g() {
        return this.f2218a.mo2914i();
    }

    @Deprecated
    /* renamed from: h */
    public int mo2878h() {
        return this.f2218a.mo2905k().f1951d;
    }

    public int hashCode() {
        C0808l lVar = this.f2218a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public int mo2880i() {
        return this.f2218a.mo2905k().f1948a;
    }

    @Deprecated
    /* renamed from: j */
    public int mo2881j() {
        return this.f2218a.mo2905k().f1950c;
    }

    @Deprecated
    /* renamed from: k */
    public int mo2882k() {
        return this.f2218a.mo2905k().f1949b;
    }

    /* renamed from: l */
    public C0796i0 mo2883l(int i, int i2, int i3, int i4) {
        return this.f2218a.mo2906m(i, i2, i3, i4);
    }

    /* renamed from: n */
    public boolean mo2884n() {
        return this.f2218a.mo2915n();
    }

    @Deprecated
    /* renamed from: o */
    public C0796i0 mo2885o(int i, int i2, int i3, int i4) {
        return new C0798b(this).mo2893c(C0639b.m2620b(i, i2, i3, i4)).mo2891a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo2886p(C0639b[] bVarArr) {
        this.f2218a.mo2908p(bVarArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo2887q(C0639b bVar) {
        this.f2218a.mo2909q(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo2888r(C0796i0 i0Var) {
        this.f2218a.mo2910r(i0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo2889s(C0639b bVar) {
        this.f2218a.mo2916s(bVar);
    }

    /* renamed from: t */
    public WindowInsets mo2890t() {
        C0808l lVar = this.f2218a;
        if (lVar instanceof C0803g) {
            return ((C0803g) lVar).f2238c;
        }
        return null;
    }
}
