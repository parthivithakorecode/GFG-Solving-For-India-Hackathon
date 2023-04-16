package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.C0833y;
import p038f.C2591j;

/* renamed from: androidx.appcompat.widget.e */
class C0444e {

    /* renamed from: a */
    private final View f1407a;

    /* renamed from: b */
    private final C0472k f1408b;

    /* renamed from: c */
    private int f1409c = -1;

    /* renamed from: d */
    private C0534y0 f1410d;

    /* renamed from: e */
    private C0534y0 f1411e;

    /* renamed from: f */
    private C0534y0 f1412f;

    C0444e(View view) {
        this.f1407a = view;
        this.f1408b = C0472k.m1941b();
    }

    /* renamed from: a */
    private boolean m1806a(Drawable drawable) {
        if (this.f1412f == null) {
            this.f1412f = new C0534y0();
        }
        C0534y0 y0Var = this.f1412f;
        y0Var.mo2376a();
        ColorStateList n = C0833y.m3358n(this.f1407a);
        if (n != null) {
            y0Var.f1693d = true;
            y0Var.f1690a = n;
        }
        PorterDuff.Mode o = C0833y.m3359o(this.f1407a);
        if (o != null) {
            y0Var.f1692c = true;
            y0Var.f1691b = o;
        }
        if (!y0Var.f1693d && !y0Var.f1692c) {
            return false;
        }
        C0472k.m1944i(drawable, y0Var, this.f1407a.getDrawableState());
        return true;
    }

    /* renamed from: k */
    private boolean m1807k() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f1410d != null : i == 21;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1929b() {
        Drawable background = this.f1407a.getBackground();
        if (background == null) {
            return;
        }
        if (!m1807k() || !m1806a(background)) {
            C0534y0 y0Var = this.f1411e;
            if (y0Var != null) {
                C0472k.m1944i(background, y0Var, this.f1407a.getDrawableState());
                return;
            }
            C0534y0 y0Var2 = this.f1410d;
            if (y0Var2 != null) {
                C0472k.m1944i(background, y0Var2, this.f1407a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo1930c() {
        C0534y0 y0Var = this.f1411e;
        if (y0Var != null) {
            return y0Var.f1690a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode mo1931d() {
        C0534y0 y0Var = this.f1411e;
        if (y0Var != null) {
            return y0Var.f1691b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1932e(AttributeSet attributeSet, int i) {
        Context context = this.f1407a.getContext();
        int[] iArr = C2591j.f18932y3;
        C0415a1 u = C0415a1.m1660u(context, attributeSet, iArr, i, 0);
        View view = this.f1407a;
        C0833y.m3328M(view, view.getContext(), iArr, attributeSet, u.mo1782q(), i, 0);
        try {
            int i2 = C2591j.f18937z3;
            if (u.mo1783r(i2)) {
                this.f1409c = u.mo1778m(i2, -1);
                ColorStateList f = this.f1408b.mo2119f(this.f1407a.getContext(), this.f1409c);
                if (f != null) {
                    mo1935h(f);
                }
            }
            int i3 = C2591j.f18702A3;
            if (u.mo1783r(i3)) {
                C0833y.m3334S(this.f1407a, u.mo1768c(i3));
            }
            int i4 = C2591j.f18707B3;
            if (u.mo1783r(i4)) {
                C0833y.m3335T(this.f1407a, C0463i0.m1909d(u.mo1775j(i4, -1), (PorterDuff.Mode) null));
            }
        } finally {
            u.mo1784v();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo1933f(Drawable drawable) {
        this.f1409c = -1;
        mo1935h((ColorStateList) null);
        mo1929b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1934g(int i) {
        this.f1409c = i;
        C0472k kVar = this.f1408b;
        mo1935h(kVar != null ? kVar.mo2119f(this.f1407a.getContext(), i) : null);
        mo1929b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1935h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1410d == null) {
                this.f1410d = new C0534y0();
            }
            C0534y0 y0Var = this.f1410d;
            y0Var.f1690a = colorStateList;
            y0Var.f1693d = true;
        } else {
            this.f1410d = null;
        }
        mo1929b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo1936i(ColorStateList colorStateList) {
        if (this.f1411e == null) {
            this.f1411e = new C0534y0();
        }
        C0534y0 y0Var = this.f1411e;
        y0Var.f1690a = colorStateList;
        y0Var.f1693d = true;
        mo1929b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo1937j(PorterDuff.Mode mode) {
        if (this.f1411e == null) {
            this.f1411e = new C0534y0();
        }
        C0534y0 y0Var = this.f1411e;
        y0Var.f1691b = mode;
        y0Var.f1692c = true;
        mo1929b();
    }
}
