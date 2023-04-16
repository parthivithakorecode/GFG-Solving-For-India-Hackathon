package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.C0624h;
import androidx.core.view.C0833y;
import androidx.core.widget.C0864b;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p038f.C2591j;
import p128s.C3994a;

/* renamed from: androidx.appcompat.widget.c0 */
class C0429c0 {

    /* renamed from: a */
    private final TextView f1354a;

    /* renamed from: b */
    private C0534y0 f1355b;

    /* renamed from: c */
    private C0534y0 f1356c;

    /* renamed from: d */
    private C0534y0 f1357d;

    /* renamed from: e */
    private C0534y0 f1358e;

    /* renamed from: f */
    private C0534y0 f1359f;

    /* renamed from: g */
    private C0534y0 f1360g;

    /* renamed from: h */
    private C0534y0 f1361h;

    /* renamed from: i */
    private final C0445e0 f1362i;

    /* renamed from: j */
    private int f1363j = 0;

    /* renamed from: k */
    private int f1364k = -1;

    /* renamed from: l */
    private Typeface f1365l;

    /* renamed from: m */
    private boolean f1366m;

    /* renamed from: androidx.appcompat.widget.c0$a */
    class C0430a extends C0624h.C0630f {

        /* renamed from: a */
        final /* synthetic */ int f1367a;

        /* renamed from: b */
        final /* synthetic */ int f1368b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f1369c;

        C0430a(int i, int i2, WeakReference weakReference) {
            this.f1367a = i;
            this.f1368b = i2;
            this.f1369c = weakReference;
        }

        /* renamed from: h */
        public void mo1832h(int i) {
        }

        /* renamed from: i */
        public void mo1833i(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f1367a) != -1) {
                typeface = C0436g.m1765a(typeface, i, (this.f1368b & 2) != 0);
            }
            C0429c0.this.mo1821n(this.f1369c, typeface);
        }
    }

    /* renamed from: androidx.appcompat.widget.c0$b */
    class C0431b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ TextView f1371f;

        /* renamed from: g */
        final /* synthetic */ Typeface f1372g;

        /* renamed from: h */
        final /* synthetic */ int f1373h;

        C0431b(TextView textView, Typeface typeface, int i) {
            this.f1371f = textView;
            this.f1372g = typeface;
            this.f1373h = i;
        }

        public void run() {
            this.f1371f.setTypeface(this.f1372g, this.f1373h);
        }
    }

    /* renamed from: androidx.appcompat.widget.c0$c */
    static class C0432c {
        /* renamed from: a */
        static Drawable[] m1755a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        static void m1756b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: c */
        static void m1757c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* renamed from: androidx.appcompat.widget.c0$d */
    static class C0433d {
        /* renamed from: a */
        static Locale m1758a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* renamed from: androidx.appcompat.widget.c0$e */
    static class C0434e {
        /* renamed from: a */
        static LocaleList m1759a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        /* renamed from: b */
        static void m1760b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* renamed from: androidx.appcompat.widget.c0$f */
    static class C0435f {
        /* renamed from: a */
        static int m1761a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        /* renamed from: b */
        static void m1762b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        /* renamed from: c */
        static void m1763c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        /* renamed from: d */
        static boolean m1764d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* renamed from: androidx.appcompat.widget.c0$g */
    static class C0436g {
        /* renamed from: a */
        static Typeface m1765a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    C0429c0(TextView textView) {
        this.f1354a = textView;
        this.f1362i = new C0445e0(textView);
    }

    /* renamed from: B */
    private void m1724B(int i, float f) {
        this.f1362i.mo1951w(i, f);
    }

    /* renamed from: C */
    private void m1725C(Context context, C0415a1 a1Var) {
        String n;
        Typeface typeface;
        Typeface typeface2;
        this.f1363j = a1Var.mo1775j(C2591j.f18735H2, this.f1363j);
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i >= 28) {
            int j = a1Var.mo1775j(C2591j.f18755M2, -1);
            this.f1364k = j;
            if (j != -1) {
                this.f1363j = (this.f1363j & 2) | 0;
            }
        }
        int i2 = C2591j.f18751L2;
        if (a1Var.mo1783r(i2) || a1Var.mo1783r(C2591j.f18759N2)) {
            this.f1365l = null;
            int i3 = C2591j.f18759N2;
            if (a1Var.mo1783r(i3)) {
                i2 = i3;
            }
            int i4 = this.f1364k;
            int i5 = this.f1363j;
            if (!context.isRestricted()) {
                try {
                    Typeface i6 = a1Var.mo1774i(i2, this.f1363j, new C0430a(i4, i5, new WeakReference(this.f1354a)));
                    if (i6 != null) {
                        if (i >= 28 && this.f1364k != -1) {
                            i6 = C0436g.m1765a(Typeface.create(i6, 0), this.f1364k, (this.f1363j & 2) != 0);
                        }
                        this.f1365l = i6;
                    }
                    this.f1366m = this.f1365l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1365l == null && (n = a1Var.mo1779n(i2)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f1364k == -1) {
                    typeface = Typeface.create(n, this.f1363j);
                } else {
                    Typeface create = Typeface.create(n, 0);
                    int i7 = this.f1364k;
                    if ((this.f1363j & 2) != 0) {
                        z = true;
                    }
                    typeface = C0436g.m1765a(create, i7, z);
                }
                this.f1365l = typeface;
                return;
            }
            return;
        }
        int i8 = C2591j.f18731G2;
        if (a1Var.mo1783r(i8)) {
            this.f1366m = false;
            int j2 = a1Var.mo1775j(i8, 1);
            if (j2 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (j2 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (j2 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.f1365l = typeface2;
        }
    }

    /* renamed from: a */
    private void m1726a(Drawable drawable, C0534y0 y0Var) {
        if (drawable != null && y0Var != null) {
            C0472k.m1944i(drawable, y0Var, this.f1354a.getDrawableState());
        }
    }

    /* renamed from: d */
    private static C0534y0 m1727d(Context context, C0472k kVar, int i) {
        ColorStateList f = kVar.mo2119f(context, i);
        if (f == null) {
            return null;
        }
        C0534y0 y0Var = new C0534y0();
        y0Var.f1693d = true;
        y0Var.f1690a = f;
        return y0Var;
    }

    /* renamed from: y */
    private void m1728y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] a = C0432c.m1755a(this.f1354a);
            TextView textView = this.f1354a;
            if (drawable5 == null) {
                drawable5 = a[0];
            }
            if (drawable2 == null) {
                drawable2 = a[1];
            }
            if (drawable6 == null) {
                drawable6 = a[2];
            }
            if (drawable4 == null) {
                drawable4 = a[3];
            }
            C0432c.m1756b(textView, drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            if (i >= 17) {
                Drawable[] a2 = C0432c.m1755a(this.f1354a);
                if (!(a2[0] == null && a2[2] == null)) {
                    TextView textView2 = this.f1354a;
                    Drawable drawable7 = a2[0];
                    if (drawable2 == null) {
                        drawable2 = a2[1];
                    }
                    Drawable drawable8 = a2[2];
                    if (drawable4 == null) {
                        drawable4 = a2[3];
                    }
                    C0432c.m1756b(textView2, drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f1354a.getCompoundDrawables();
            TextView textView3 = this.f1354a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: z */
    private void m1729z() {
        C0534y0 y0Var = this.f1361h;
        this.f1355b = y0Var;
        this.f1356c = y0Var;
        this.f1357d = y0Var;
        this.f1358e = y0Var;
        this.f1359f = y0Var;
        this.f1360g = y0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo1809A(int i, float f) {
        if (!C0864b.f2351a && !mo1819l()) {
            m1724B(i, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1810b() {
        if (!(this.f1355b == null && this.f1356c == null && this.f1357d == null && this.f1358e == null)) {
            Drawable[] compoundDrawables = this.f1354a.getCompoundDrawables();
            m1726a(compoundDrawables[0], this.f1355b);
            m1726a(compoundDrawables[1], this.f1356c);
            m1726a(compoundDrawables[2], this.f1357d);
            m1726a(compoundDrawables[3], this.f1358e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f1359f != null || this.f1360g != null) {
            Drawable[] a = C0432c.m1755a(this.f1354a);
            m1726a(a[0], this.f1359f);
            m1726a(a[2], this.f1360g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1811c() {
        this.f1362i.mo1938b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo1812e() {
        return this.f1362i.mo1940h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo1813f() {
        return this.f1362i.mo1941i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo1814g() {
        return this.f1362i.mo1942j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int[] mo1815h() {
        return this.f1362i.mo1943k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo1816i() {
        return this.f1362i.mo1944l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList mo1817j() {
        C0534y0 y0Var = this.f1361h;
        if (y0Var != null) {
            return y0Var.f1690a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public PorterDuff.Mode mo1818k() {
        C0534y0 y0Var = this.f1361h;
        if (y0Var != null) {
            return y0Var.f1691b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo1819l() {
        return this.f1362i.mo1946q();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ce  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1820m(android.util.AttributeSet r24, int r25) {
        /*
            r23 = this;
            r7 = r23
            r8 = r24
            r9 = r25
            android.widget.TextView r0 = r7.f1354a
            android.content.Context r10 = r0.getContext()
            androidx.appcompat.widget.k r11 = androidx.appcompat.widget.C0472k.m1941b()
            int[] r2 = p038f.C2591j.f18800Y
            r12 = 0
            androidx.appcompat.widget.a1 r13 = androidx.appcompat.widget.C0415a1.m1660u(r10, r8, r2, r9, r12)
            android.widget.TextView r0 = r7.f1354a
            android.content.Context r1 = r0.getContext()
            android.content.res.TypedArray r4 = r13.mo1782q()
            r6 = 0
            r3 = r24
            r5 = r25
            androidx.core.view.C0833y.m3328M(r0, r1, r2, r3, r4, r5, r6)
            int r0 = p038f.C2591j.f18804Z
            r14 = -1
            int r0 = r13.mo1778m(r0, r14)
            int r1 = p038f.C2591j.f18819c0
            boolean r2 = r13.mo1783r(r1)
            if (r2 == 0) goto L_0x0042
            int r1 = r13.mo1778m(r1, r12)
            androidx.appcompat.widget.y0 r1 = m1727d(r10, r11, r1)
            r7.f1355b = r1
        L_0x0042:
            int r1 = p038f.C2591j.f18809a0
            boolean r2 = r13.mo1783r(r1)
            if (r2 == 0) goto L_0x0054
            int r1 = r13.mo1778m(r1, r12)
            androidx.appcompat.widget.y0 r1 = m1727d(r10, r11, r1)
            r7.f1356c = r1
        L_0x0054:
            int r1 = p038f.C2591j.f18824d0
            boolean r2 = r13.mo1783r(r1)
            if (r2 == 0) goto L_0x0066
            int r1 = r13.mo1778m(r1, r12)
            androidx.appcompat.widget.y0 r1 = m1727d(r10, r11, r1)
            r7.f1357d = r1
        L_0x0066:
            int r1 = p038f.C2591j.f18814b0
            boolean r2 = r13.mo1783r(r1)
            if (r2 == 0) goto L_0x0078
            int r1 = r13.mo1778m(r1, r12)
            androidx.appcompat.widget.y0 r1 = m1727d(r10, r11, r1)
            r7.f1358e = r1
        L_0x0078:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L_0x00a2
            int r2 = p038f.C2591j.f18829e0
            boolean r3 = r13.mo1783r(r2)
            if (r3 == 0) goto L_0x0090
            int r2 = r13.mo1778m(r2, r12)
            androidx.appcompat.widget.y0 r2 = m1727d(r10, r11, r2)
            r7.f1359f = r2
        L_0x0090:
            int r2 = p038f.C2591j.f18834f0
            boolean r3 = r13.mo1783r(r2)
            if (r3 == 0) goto L_0x00a2
            int r2 = r13.mo1778m(r2, r12)
            androidx.appcompat.widget.y0 r2 = m1727d(r10, r11, r2)
            r7.f1360g = r2
        L_0x00a2:
            r13.mo1784v()
            android.widget.TextView r2 = r7.f1354a
            android.text.method.TransformationMethod r2 = r2.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            r3 = 26
            r5 = 23
            if (r0 == r14) goto L_0x011e
            int[] r6 = p038f.C2591j.f18721E2
            androidx.appcompat.widget.a1 r0 = androidx.appcompat.widget.C0415a1.m1658s(r10, r0, r6)
            if (r2 != 0) goto L_0x00c9
            int r6 = p038f.C2591j.f18767P2
            boolean r15 = r0.mo1783r(r6)
            if (r15 == 0) goto L_0x00c9
            boolean r6 = r0.mo1766a(r6, r12)
            r15 = 1
            goto L_0x00cb
        L_0x00c9:
            r6 = r12
            r15 = r6
        L_0x00cb:
            r7.m1725C(r10, r0)
            if (r1 >= r5) goto L_0x00f9
            int r4 = p038f.C2591j.f18739I2
            boolean r17 = r0.mo1783r(r4)
            if (r17 == 0) goto L_0x00dd
            android.content.res.ColorStateList r4 = r0.mo1768c(r4)
            goto L_0x00de
        L_0x00dd:
            r4 = 0
        L_0x00de:
            int r13 = p038f.C2591j.f18743J2
            boolean r18 = r0.mo1783r(r13)
            if (r18 == 0) goto L_0x00eb
            android.content.res.ColorStateList r13 = r0.mo1768c(r13)
            goto L_0x00ec
        L_0x00eb:
            r13 = 0
        L_0x00ec:
            int r14 = p038f.C2591j.f18747K2
            boolean r19 = r0.mo1783r(r14)
            if (r19 == 0) goto L_0x00fb
            android.content.res.ColorStateList r14 = r0.mo1768c(r14)
            goto L_0x00fc
        L_0x00f9:
            r4 = 0
            r13 = 0
        L_0x00fb:
            r14 = 0
        L_0x00fc:
            int r5 = p038f.C2591j.f18771Q2
            boolean r20 = r0.mo1783r(r5)
            if (r20 == 0) goto L_0x0109
            java.lang.String r5 = r0.mo1779n(r5)
            goto L_0x010a
        L_0x0109:
            r5 = 0
        L_0x010a:
            if (r1 < r3) goto L_0x0119
            int r3 = p038f.C2591j.f18763O2
            boolean r21 = r0.mo1783r(r3)
            if (r21 == 0) goto L_0x0119
            java.lang.String r3 = r0.mo1779n(r3)
            goto L_0x011a
        L_0x0119:
            r3 = 0
        L_0x011a:
            r0.mo1784v()
            goto L_0x0125
        L_0x011e:
            r6 = r12
            r15 = r6
            r3 = 0
            r4 = 0
            r5 = 0
            r13 = 0
            r14 = 0
        L_0x0125:
            int[] r0 = p038f.C2591j.f18721E2
            androidx.appcompat.widget.a1 r0 = androidx.appcompat.widget.C0415a1.m1660u(r10, r8, r0, r9, r12)
            if (r2 != 0) goto L_0x0140
            int r12 = p038f.C2591j.f18767P2
            boolean r22 = r0.mo1783r(r12)
            if (r22 == 0) goto L_0x0140
            r22 = r3
            r3 = 0
            boolean r6 = r0.mo1766a(r12, r3)
            r3 = 23
            r15 = 1
            goto L_0x0144
        L_0x0140:
            r22 = r3
            r3 = 23
        L_0x0144:
            if (r1 >= r3) goto L_0x016a
            int r3 = p038f.C2591j.f18739I2
            boolean r12 = r0.mo1783r(r3)
            if (r12 == 0) goto L_0x0152
            android.content.res.ColorStateList r4 = r0.mo1768c(r3)
        L_0x0152:
            int r3 = p038f.C2591j.f18743J2
            boolean r12 = r0.mo1783r(r3)
            if (r12 == 0) goto L_0x015e
            android.content.res.ColorStateList r13 = r0.mo1768c(r3)
        L_0x015e:
            int r3 = p038f.C2591j.f18747K2
            boolean r12 = r0.mo1783r(r3)
            if (r12 == 0) goto L_0x016a
            android.content.res.ColorStateList r14 = r0.mo1768c(r3)
        L_0x016a:
            int r3 = p038f.C2591j.f18771Q2
            boolean r12 = r0.mo1783r(r3)
            if (r12 == 0) goto L_0x0176
            java.lang.String r5 = r0.mo1779n(r3)
        L_0x0176:
            r3 = 26
            if (r1 < r3) goto L_0x0187
            int r3 = p038f.C2591j.f18763O2
            boolean r12 = r0.mo1783r(r3)
            if (r12 == 0) goto L_0x0187
            java.lang.String r3 = r0.mo1779n(r3)
            goto L_0x0189
        L_0x0187:
            r3 = r22
        L_0x0189:
            r12 = 28
            if (r1 < r12) goto L_0x01a6
            int r12 = p038f.C2591j.f18726F2
            boolean r16 = r0.mo1783r(r12)
            if (r16 == 0) goto L_0x01a6
            r16 = r11
            r11 = -1
            int r12 = r0.mo1770e(r12, r11)
            if (r12 != 0) goto L_0x01a8
            android.widget.TextView r11 = r7.f1354a
            r12 = 0
            r8 = 0
            r11.setTextSize(r8, r12)
            goto L_0x01a8
        L_0x01a6:
            r16 = r11
        L_0x01a8:
            r7.m1725C(r10, r0)
            r0.mo1784v()
            if (r4 == 0) goto L_0x01b5
            android.widget.TextView r0 = r7.f1354a
            r0.setTextColor(r4)
        L_0x01b5:
            if (r13 == 0) goto L_0x01bc
            android.widget.TextView r0 = r7.f1354a
            r0.setHintTextColor(r13)
        L_0x01bc:
            if (r14 == 0) goto L_0x01c3
            android.widget.TextView r0 = r7.f1354a
            r0.setLinkTextColor(r14)
        L_0x01c3:
            if (r2 != 0) goto L_0x01ca
            if (r15 == 0) goto L_0x01ca
            r7.mo1826s(r6)
        L_0x01ca:
            android.graphics.Typeface r0 = r7.f1365l
            if (r0 == 0) goto L_0x01e0
            int r2 = r7.f1364k
            r4 = -1
            if (r2 != r4) goto L_0x01db
            android.widget.TextView r2 = r7.f1354a
            int r4 = r7.f1363j
            r2.setTypeface(r0, r4)
            goto L_0x01e0
        L_0x01db:
            android.widget.TextView r2 = r7.f1354a
            r2.setTypeface(r0)
        L_0x01e0:
            if (r3 == 0) goto L_0x01e7
            android.widget.TextView r0 = r7.f1354a
            androidx.appcompat.widget.C0429c0.C0435f.m1764d(r0, r3)
        L_0x01e7:
            if (r5 == 0) goto L_0x020d
            r0 = 24
            if (r1 < r0) goto L_0x01f7
            android.widget.TextView r0 = r7.f1354a
            android.os.LocaleList r1 = androidx.appcompat.widget.C0429c0.C0434e.m1759a(r5)
            androidx.appcompat.widget.C0429c0.C0434e.m1760b(r0, r1)
            goto L_0x020d
        L_0x01f7:
            r0 = 21
            if (r1 < r0) goto L_0x020d
            java.lang.String r0 = ","
            java.lang.String[] r0 = r5.split(r0)
            r1 = 0
            r0 = r0[r1]
            android.widget.TextView r1 = r7.f1354a
            java.util.Locale r0 = androidx.appcompat.widget.C0429c0.C0433d.m1758a(r0)
            androidx.appcompat.widget.C0429c0.C0432c.m1757c(r1, r0)
        L_0x020d:
            androidx.appcompat.widget.e0 r0 = r7.f1362i
            r1 = r24
            r0.mo1947r(r1, r9)
            boolean r0 = androidx.core.widget.C0864b.f2351a
            if (r0 == 0) goto L_0x0255
            androidx.appcompat.widget.e0 r0 = r7.f1362i
            int r0 = r0.mo1944l()
            if (r0 == 0) goto L_0x0255
            androidx.appcompat.widget.e0 r0 = r7.f1362i
            int[] r0 = r0.mo1943k()
            int r2 = r0.length
            if (r2 <= 0) goto L_0x0255
            android.widget.TextView r2 = r7.f1354a
            int r2 = androidx.appcompat.widget.C0429c0.C0435f.m1761a(r2)
            float r2 = (float) r2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x024f
            android.widget.TextView r0 = r7.f1354a
            androidx.appcompat.widget.e0 r2 = r7.f1362i
            int r2 = r2.mo1941i()
            androidx.appcompat.widget.e0 r3 = r7.f1362i
            int r3 = r3.mo1940h()
            androidx.appcompat.widget.e0 r4 = r7.f1362i
            int r4 = r4.mo1942j()
            r5 = 0
            androidx.appcompat.widget.C0429c0.C0435f.m1762b(r0, r2, r3, r4, r5)
            goto L_0x0255
        L_0x024f:
            r5 = 0
            android.widget.TextView r2 = r7.f1354a
            androidx.appcompat.widget.C0429c0.C0435f.m1763c(r2, r0, r5)
        L_0x0255:
            int[] r0 = p038f.C2591j.f18839g0
            androidx.appcompat.widget.a1 r8 = androidx.appcompat.widget.C0415a1.m1659t(r10, r1, r0)
            int r0 = p038f.C2591j.f18879o0
            r1 = -1
            int r0 = r8.mo1778m(r0, r1)
            r2 = r16
            if (r0 == r1) goto L_0x026c
            android.graphics.drawable.Drawable r0 = r2.mo2117c(r10, r0)
            r3 = r0
            goto L_0x026d
        L_0x026c:
            r3 = 0
        L_0x026d:
            int r0 = p038f.C2591j.f18904t0
            int r0 = r8.mo1778m(r0, r1)
            if (r0 == r1) goto L_0x027b
            android.graphics.drawable.Drawable r0 = r2.mo2117c(r10, r0)
            r4 = r0
            goto L_0x027c
        L_0x027b:
            r4 = 0
        L_0x027c:
            int r0 = p038f.C2591j.f18884p0
            int r0 = r8.mo1778m(r0, r1)
            if (r0 == r1) goto L_0x028a
            android.graphics.drawable.Drawable r0 = r2.mo2117c(r10, r0)
            r5 = r0
            goto L_0x028b
        L_0x028a:
            r5 = 0
        L_0x028b:
            int r0 = p038f.C2591j.f18869m0
            int r0 = r8.mo1778m(r0, r1)
            if (r0 == r1) goto L_0x0299
            android.graphics.drawable.Drawable r0 = r2.mo2117c(r10, r0)
            r6 = r0
            goto L_0x029a
        L_0x0299:
            r6 = 0
        L_0x029a:
            int r0 = p038f.C2591j.f18889q0
            int r0 = r8.mo1778m(r0, r1)
            if (r0 == r1) goto L_0x02a8
            android.graphics.drawable.Drawable r0 = r2.mo2117c(r10, r0)
            r9 = r0
            goto L_0x02a9
        L_0x02a8:
            r9 = 0
        L_0x02a9:
            int r0 = p038f.C2591j.f18874n0
            int r0 = r8.mo1778m(r0, r1)
            if (r0 == r1) goto L_0x02b7
            android.graphics.drawable.Drawable r0 = r2.mo2117c(r10, r0)
            r10 = r0
            goto L_0x02b8
        L_0x02b7:
            r10 = 0
        L_0x02b8:
            r0 = r23
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r9
            r6 = r10
            r0.m1728y(r1, r2, r3, r4, r5, r6)
            int r0 = p038f.C2591j.f18894r0
            boolean r1 = r8.mo1783r(r0)
            if (r1 == 0) goto L_0x02d4
            android.content.res.ColorStateList r0 = r8.mo1768c(r0)
            android.widget.TextView r1 = r7.f1354a
            androidx.core.widget.C0883j.m3642f(r1, r0)
        L_0x02d4:
            int r0 = p038f.C2591j.f18899s0
            boolean r1 = r8.mo1783r(r0)
            if (r1 == 0) goto L_0x02ec
            r1 = -1
            int r0 = r8.mo1775j(r0, r1)
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0463i0.m1909d(r0, r2)
            android.widget.TextView r2 = r7.f1354a
            androidx.core.widget.C0883j.m3643g(r2, r0)
            goto L_0x02ed
        L_0x02ec:
            r1 = -1
        L_0x02ed:
            int r0 = p038f.C2591j.f18914v0
            int r0 = r8.mo1770e(r0, r1)
            int r2 = p038f.C2591j.f18919w0
            int r2 = r8.mo1770e(r2, r1)
            int r3 = p038f.C2591j.f18924x0
            int r3 = r8.mo1770e(r3, r1)
            r8.mo1784v()
            if (r0 == r1) goto L_0x0309
            android.widget.TextView r4 = r7.f1354a
            androidx.core.widget.C0883j.m3644h(r4, r0)
        L_0x0309:
            if (r2 == r1) goto L_0x0310
            android.widget.TextView r0 = r7.f1354a
            androidx.core.widget.C0883j.m3645i(r0, r2)
        L_0x0310:
            if (r3 == r1) goto L_0x0317
            android.widget.TextView r0 = r7.f1354a
            androidx.core.widget.C0883j.m3646j(r0, r3)
        L_0x0317:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0429c0.mo1820m(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo1821n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1366m) {
            this.f1365l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView == null) {
                return;
            }
            if (C0833y.m3316A(textView)) {
                textView.post(new C0431b(textView, typeface, this.f1363j));
            } else {
                textView.setTypeface(typeface, this.f1363j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo1822o(boolean z, int i, int i2, int i3, int i4) {
        if (!C0864b.f2351a) {
            mo1811c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo1823p() {
        mo1810b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo1824q(Context context, int i) {
        String n;
        ColorStateList c;
        ColorStateList c2;
        ColorStateList c3;
        C0415a1 s = C0415a1.m1658s(context, i, C2591j.f18721E2);
        int i2 = C2591j.f18767P2;
        if (s.mo1783r(i2)) {
            mo1826s(s.mo1766a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            int i4 = C2591j.f18739I2;
            if (s.mo1783r(i4) && (c3 = s.mo1768c(i4)) != null) {
                this.f1354a.setTextColor(c3);
            }
            int i5 = C2591j.f18747K2;
            if (s.mo1783r(i5) && (c2 = s.mo1768c(i5)) != null) {
                this.f1354a.setLinkTextColor(c2);
            }
            int i6 = C2591j.f18743J2;
            if (s.mo1783r(i6) && (c = s.mo1768c(i6)) != null) {
                this.f1354a.setHintTextColor(c);
            }
        }
        int i7 = C2591j.f18726F2;
        if (s.mo1783r(i7) && s.mo1770e(i7, -1) == 0) {
            this.f1354a.setTextSize(0, 0.0f);
        }
        m1725C(context, s);
        if (i3 >= 26) {
            int i8 = C2591j.f18763O2;
            if (s.mo1783r(i8) && (n = s.mo1779n(i8)) != null) {
                C0435f.m1764d(this.f1354a, n);
            }
        }
        s.mo1784v();
        Typeface typeface = this.f1365l;
        if (typeface != null) {
            this.f1354a.setTypeface(typeface, this.f1363j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo1825r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            C3994a.m26226f(editorInfo, textView.getText());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo1826s(boolean z) {
        this.f1354a.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo1827t(int i, int i2, int i3, int i4) {
        this.f1362i.mo1948s(i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo1828u(int[] iArr, int i) {
        this.f1362i.mo1949t(iArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo1829v(int i) {
        this.f1362i.mo1950u(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo1830w(ColorStateList colorStateList) {
        if (this.f1361h == null) {
            this.f1361h = new C0534y0();
        }
        C0534y0 y0Var = this.f1361h;
        y0Var.f1690a = colorStateList;
        y0Var.f1693d = colorStateList != null;
        m1729z();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo1831x(PorterDuff.Mode mode) {
        if (this.f1361h == null) {
            this.f1361h = new C0534y0();
        }
        C0534y0 y0Var = this.f1361h;
        y0Var.f1691b = mode;
        y0Var.f1692c = mode != null;
        m1729z();
    }
}
