package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.content.C0597a;
import androidx.core.graphics.drawable.C0650a;
import androidx.vectordrawable.graphics.drawable.C1189b;
import androidx.vectordrawable.graphics.drawable.C1199h;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p052h.C2649a;
import p059i.C2788c;
import p059i.C2789d;
import p102o.C3806d;
import p102o.C3807e;
import p102o.C3814g;
import p102o.C3815h;

/* renamed from: androidx.appcompat.widget.q0 */
public final class C0504q0 {

    /* renamed from: h */
    private static final PorterDuff.Mode f1600h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i */
    private static C0504q0 f1601i;

    /* renamed from: j */
    private static final C0507c f1602j = new C0507c(6);

    /* renamed from: a */
    private WeakHashMap<Context, C3815h<ColorStateList>> f1603a;

    /* renamed from: b */
    private C3814g<String, C0509e> f1604b;

    /* renamed from: c */
    private C3815h<String> f1605c;

    /* renamed from: d */
    private final WeakHashMap<Context, C3806d<WeakReference<Drawable.ConstantState>>> f1606d = new WeakHashMap<>(0);

    /* renamed from: e */
    private TypedValue f1607e;

    /* renamed from: f */
    private boolean f1608f;

    /* renamed from: g */
    private C0510f f1609g;

    /* renamed from: androidx.appcompat.widget.q0$a */
    static class C0505a implements C0509e {
        C0505a() {
        }

        /* renamed from: a */
        public Drawable mo2274a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C2649a.m21377m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.q0$b */
    private static class C0506b implements C0509e {
        C0506b() {
        }

        /* renamed from: a */
        public Drawable mo2274a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1189b.m4786a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.q0$c */
    private static class C0507c extends C3807e<Integer, PorterDuffColorFilter> {
        public C0507c(int i) {
            super(i);
        }

        /* renamed from: h */
        private static int m2096h(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public PorterDuffColorFilter mo2275i(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) mo15095c(Integer.valueOf(m2096h(i, mode)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public PorterDuffColorFilter mo2276j(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo15096d(Integer.valueOf(m2096h(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: androidx.appcompat.widget.q0$d */
    static class C0508d implements C0509e {
        C0508d() {
        }

        /* renamed from: a */
        public Drawable mo2274a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) C0508d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (Build.VERSION.SDK_INT >= 21) {
                        C2788c.m22219c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    } else {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet);
                    }
                    return drawable;
                } catch (Exception e) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                }
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.q0$e */
    private interface C0509e {
        /* renamed from: a */
        Drawable mo2274a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.q0$f */
    public interface C0510f {
        /* renamed from: a */
        boolean mo2121a(Context context, int i, Drawable drawable);

        /* renamed from: b */
        PorterDuff.Mode mo2122b(int i);

        /* renamed from: c */
        Drawable mo2123c(C0504q0 q0Var, Context context, int i);

        /* renamed from: d */
        ColorStateList mo2124d(Context context, int i);

        /* renamed from: e */
        boolean mo2125e(Context context, int i, Drawable drawable);
    }

    /* renamed from: androidx.appcompat.widget.q0$g */
    private static class C0511g implements C0509e {
        C0511g() {
        }

        /* renamed from: a */
        public Drawable mo2274a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1199h.m4819c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private void m2070a(String str, C0509e eVar) {
        if (this.f1604b == null) {
            this.f1604b = new C3814g<>();
        }
        this.f1604b.put(str, eVar);
    }

    /* renamed from: b */
    private synchronized boolean m2071b(Context context, long j, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C3806d dVar = this.f1606d.get(context);
            if (dVar == null) {
                dVar = new C3806d();
                this.f1606d.put(context, dVar);
            }
            dVar.mo15088h(j, new WeakReference(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    private void m2072c(Context context, int i, ColorStateList colorStateList) {
        if (this.f1603a == null) {
            this.f1603a = new WeakHashMap<>();
        }
        C3815h hVar = this.f1603a.get(context);
        if (hVar == null) {
            hVar = new C3815h();
            this.f1603a.put(context, hVar);
        }
        hVar.mo15188a(i, colorStateList);
    }

    /* renamed from: d */
    private void m2073d(Context context) {
        if (!this.f1608f) {
            this.f1608f = true;
            Drawable j = mo2266j(context, C2789d.abc_vector_test);
            if (j == null || !m2082q(j)) {
                this.f1608f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: e */
    private static long m2074e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: f */
    private Drawable m2075f(Context context, int i) {
        if (this.f1607e == null) {
            this.f1607e = new TypedValue();
        }
        TypedValue typedValue = this.f1607e;
        context.getResources().getValue(i, typedValue, true);
        long e = m2074e(typedValue);
        Drawable i2 = m2078i(context, e);
        if (i2 != null) {
            return i2;
        }
        C0510f fVar = this.f1609g;
        Drawable c = fVar == null ? null : fVar.mo2123c(this, context, i);
        if (c != null) {
            c.setChangingConfigurations(typedValue.changingConfigurations);
            m2071b(context, e, c);
        }
        return c;
    }

    /* renamed from: g */
    private static PorterDuffColorFilter m2076g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m2079l(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: h */
    public static synchronized C0504q0 m2077h() {
        C0504q0 q0Var;
        synchronized (C0504q0.class) {
            if (f1601i == null) {
                C0504q0 q0Var2 = new C0504q0();
                f1601i = q0Var2;
                m2081p(q0Var2);
            }
            q0Var = f1601i;
        }
        return q0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable m2078i(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, o.d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f1606d     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            o.d r0 = (p102o.C3806d) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo15085e(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.mo15089j(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0504q0.m2078i(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: l */
    public static synchronized PorterDuffColorFilter m2079l(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter i2;
        synchronized (C0504q0.class) {
            C0507c cVar = f1602j;
            i2 = cVar.mo2275i(i, mode);
            if (i2 == null) {
                i2 = new PorterDuffColorFilter(i, mode);
                cVar.mo2276j(i, mode, i2);
            }
        }
        return i2;
    }

    /* renamed from: n */
    private ColorStateList m2080n(Context context, int i) {
        C3815h hVar;
        WeakHashMap<Context, C3815h<ColorStateList>> weakHashMap = this.f1603a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) hVar.mo15192e(i);
    }

    /* renamed from: p */
    private static void m2081p(C0504q0 q0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            q0Var.m2070a("vector", new C0511g());
            q0Var.m2070a("animated-vector", new C0506b());
            q0Var.m2070a("animated-selector", new C0505a());
            q0Var.m2070a("drawable", new C0508d());
        }
    }

    /* renamed from: q */
    private static boolean m2082q(Drawable drawable) {
        return (drawable instanceof C1199h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m2083r(android.content.Context r11, int r12) {
        /*
            r10 = this;
            o.g<java.lang.String, androidx.appcompat.widget.q0$e> r0 = r10.f1604b
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b2
            o.h<java.lang.String> r0 = r10.f1605c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.mo15192e(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            o.g<java.lang.String, androidx.appcompat.widget.q0$e> r3 = r10.f1604b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            o.h r0 = new o.h
            r0.<init>()
            r10.f1605c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f1607e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f1607e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f1607e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = m2074e(r0)
            android.graphics.drawable.Drawable r6 = r10.m2078i(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00aa
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            o.h<java.lang.String> r8 = r10.f1605c     // Catch:{ Exception -> 0x00a2 }
            r8.mo15188a(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            o.g<java.lang.String, androidx.appcompat.widget.q0$e> r8 = r10.f1604b     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.appcompat.widget.q0$e r3 = (androidx.appcompat.widget.C0504q0.C0509e) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.mo2274a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00aa
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.m2071b(r11, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00aa
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00aa:
            if (r6 != 0) goto L_0x00b1
            o.h<java.lang.String> r11 = r10.f1605c
            r11.mo15188a(r12, r2)
        L_0x00b1:
            return r6
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0504q0.m2083r(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: v */
    private Drawable m2084v(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList m = mo2268m(context, i);
        if (m != null) {
            if (C0463i0.m1906a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable p = C0650a.m2699p(drawable);
            C0650a.m2697n(p, m);
            PorterDuff.Mode o = mo2269o(i);
            if (o == null) {
                return p;
            }
            C0650a.m2698o(p, o);
            return p;
        }
        C0510f fVar = this.f1609g;
        if ((fVar == null || !fVar.mo2125e(context, i, drawable)) && !mo2273x(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* renamed from: w */
    static void m2085w(Drawable drawable, C0534y0 y0Var, int[] iArr) {
        int[] state = drawable.getState();
        if (C0463i0.m1906a(drawable)) {
            if (!(drawable.mutate() == drawable)) {
                Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
                return;
            }
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = y0Var.f1693d;
        if (z || y0Var.f1692c) {
            drawable.setColorFilter(m2076g(z ? y0Var.f1690a : null, y0Var.f1692c ? y0Var.f1691b : f1600h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: j */
    public synchronized Drawable mo2266j(Context context, int i) {
        return mo2267k(context, i, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized Drawable mo2267k(Context context, int i, boolean z) {
        Drawable r;
        m2073d(context);
        r = m2083r(context, i);
        if (r == null) {
            r = m2075f(context, i);
        }
        if (r == null) {
            r = C0597a.m2449d(context, i);
        }
        if (r != null) {
            r = m2084v(context, i, z, r);
        }
        if (r != null) {
            C0463i0.m1907b(r);
        }
        return r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public synchronized ColorStateList mo2268m(Context context, int i) {
        ColorStateList n;
        n = m2080n(context, i);
        if (n == null) {
            C0510f fVar = this.f1609g;
            n = fVar == null ? null : fVar.mo2124d(context, i);
            if (n != null) {
                m2072c(context, i, n);
            }
        }
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public PorterDuff.Mode mo2269o(int i) {
        C0510f fVar = this.f1609g;
        if (fVar == null) {
            return null;
        }
        return fVar.mo2122b(i);
    }

    /* renamed from: s */
    public synchronized void mo2270s(Context context) {
        C3806d dVar = this.f1606d.get(context);
        if (dVar != null) {
            dVar.mo15082b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public synchronized Drawable mo2271t(Context context, C0464i1 i1Var, int i) {
        Drawable r = m2083r(context, i);
        if (r == null) {
            r = i1Var.mo2286a(i);
        }
        if (r == null) {
            return null;
        }
        return m2084v(context, i, false, r);
    }

    /* renamed from: u */
    public synchronized void mo2272u(C0510f fVar) {
        this.f1609g = fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo2273x(Context context, int i, Drawable drawable) {
        C0510f fVar = this.f1609g;
        return fVar != null && fVar.mo2121a(context, i, drawable);
    }
}
