package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.C0833y;
import androidx.core.widget.C0875f;
import p038f.C2591j;
import p045g.C2620a;

/* renamed from: androidx.appcompat.widget.q */
public class C0503q {

    /* renamed from: a */
    private final ImageView f1595a;

    /* renamed from: b */
    private C0534y0 f1596b;

    /* renamed from: c */
    private C0534y0 f1597c;

    /* renamed from: d */
    private C0534y0 f1598d;

    /* renamed from: e */
    private int f1599e = 0;

    public C0503q(ImageView imageView) {
        this.f1595a = imageView;
    }

    /* renamed from: a */
    private boolean m2058a(Drawable drawable) {
        if (this.f1598d == null) {
            this.f1598d = new C0534y0();
        }
        C0534y0 y0Var = this.f1598d;
        y0Var.mo2376a();
        ColorStateList a = C0875f.m3615a(this.f1595a);
        if (a != null) {
            y0Var.f1693d = true;
            y0Var.f1690a = a;
        }
        PorterDuff.Mode b = C0875f.m3616b(this.f1595a);
        if (b != null) {
            y0Var.f1692c = true;
            y0Var.f1691b = b;
        }
        if (!y0Var.f1693d && !y0Var.f1692c) {
            return false;
        }
        C0472k.m1944i(drawable, y0Var, this.f1595a.getDrawableState());
        return true;
    }

    /* renamed from: l */
    private boolean m2059l() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f1596b != null : i == 21;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2256b() {
        if (this.f1595a.getDrawable() != null) {
            this.f1595a.getDrawable().setLevel(this.f1599e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2257c() {
        Drawable drawable = this.f1595a.getDrawable();
        if (drawable != null) {
            C0463i0.m1907b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!m2059l() || !m2058a(drawable)) {
            C0534y0 y0Var = this.f1597c;
            if (y0Var != null) {
                C0472k.m1944i(drawable, y0Var, this.f1595a.getDrawableState());
                return;
            }
            C0534y0 y0Var2 = this.f1596b;
            if (y0Var2 != null) {
                C0472k.m1944i(drawable, y0Var2, this.f1595a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ColorStateList mo2258d() {
        C0534y0 y0Var = this.f1597c;
        if (y0Var != null) {
            return y0Var.f1690a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public PorterDuff.Mode mo2259e() {
        C0534y0 y0Var = this.f1597c;
        if (y0Var != null) {
            return y0Var.f1691b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo2260f() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1595a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: g */
    public void mo2261g(AttributeSet attributeSet, int i) {
        int m;
        Context context = this.f1595a.getContext();
        int[] iArr = C2591j.f18764P;
        C0415a1 u = C0415a1.m1660u(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f1595a;
        C0833y.m3328M(imageView, imageView.getContext(), iArr, attributeSet, u.mo1782q(), i, 0);
        try {
            Drawable drawable = this.f1595a.getDrawable();
            if (!(drawable != null || (m = u.mo1778m(C2591j.f18768Q, -1)) == -1 || (drawable = C2620a.m21330b(this.f1595a.getContext(), m)) == null)) {
                this.f1595a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0463i0.m1907b(drawable);
            }
            int i2 = C2591j.f18772R;
            if (u.mo1783r(i2)) {
                C0875f.m3617c(this.f1595a, u.mo1768c(i2));
            }
            int i3 = C2591j.f18776S;
            if (u.mo1783r(i3)) {
                C0875f.m3618d(this.f1595a, C0463i0.m1909d(u.mo1775j(i3, -1), (PorterDuff.Mode) null));
            }
        } finally {
            u.mo1784v();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2262h(Drawable drawable) {
        this.f1599e = drawable.getLevel();
    }

    /* renamed from: i */
    public void mo2263i(int i) {
        if (i != 0) {
            Drawable b = C2620a.m21330b(this.f1595a.getContext(), i);
            if (b != null) {
                C0463i0.m1907b(b);
            }
            this.f1595a.setImageDrawable(b);
        } else {
            this.f1595a.setImageDrawable((Drawable) null);
        }
        mo2257c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2264j(ColorStateList colorStateList) {
        if (this.f1597c == null) {
            this.f1597c = new C0534y0();
        }
        C0534y0 y0Var = this.f1597c;
        y0Var.f1690a = colorStateList;
        y0Var.f1693d = true;
        mo2257c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo2265k(PorterDuff.Mode mode) {
        if (this.f1597c == null) {
            this.f1597c = new C0534y0();
        }
        C0534y0 y0Var = this.f1597c;
        y0Var.f1691b = mode;
        y0Var.f1692c = true;
        mo2257c();
    }
}
