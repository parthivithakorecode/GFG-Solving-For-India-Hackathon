package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* renamed from: androidx.core.view.n */
public class C0822n {

    /* renamed from: a */
    private ViewParent f2257a;

    /* renamed from: b */
    private ViewParent f2258b;

    /* renamed from: c */
    private final View f2259c;

    /* renamed from: d */
    private boolean f2260d;

    /* renamed from: e */
    private int[] f2261e;

    public C0822n(View view) {
        this.f2259c = view;
    }

    /* renamed from: f */
    private boolean m3286f(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent g;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!mo2944j() || (g = m3287g(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f2259c.getLocationInWindow(iArr4);
            i7 = iArr4[0];
            i6 = iArr4[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            int[] h = m3288h();
            h[0] = 0;
            h[1] = 0;
            iArr3 = h;
        } else {
            iArr3 = iArr2;
        }
        C0777c0.m3086d(g, this.f2259c, i, i2, i3, i4, i5, iArr3);
        if (iArr4 != null) {
            this.f2259c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i7;
            iArr4[1] = iArr4[1] - i6;
        }
        return true;
    }

    /* renamed from: g */
    private ViewParent m3287g(int i) {
        if (i == 0) {
            return this.f2257a;
        }
        if (i != 1) {
            return null;
        }
        return this.f2258b;
    }

    /* renamed from: h */
    private int[] m3288h() {
        if (this.f2261e == null) {
            this.f2261e = new int[2];
        }
        return this.f2261e;
    }

    /* renamed from: l */
    private void m3289l(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f2257a = viewParent;
        } else if (i == 1) {
            this.f2258b = viewParent;
        }
    }

    /* renamed from: a */
    public boolean mo2938a(float f, float f2, boolean z) {
        ViewParent g;
        if (!mo2944j() || (g = m3287g(0)) == null) {
            return false;
        }
        return C0777c0.m3083a(g, this.f2259c, f, f2, z);
    }

    /* renamed from: b */
    public boolean mo2939b(float f, float f2) {
        ViewParent g;
        if (!mo2944j() || (g = m3287g(0)) == null) {
            return false;
        }
        return C0777c0.m3084b(g, this.f2259c, f, f2);
    }

    /* renamed from: c */
    public boolean mo2940c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent g;
        int i4;
        int i5;
        if (!mo2944j() || (g = m3287g(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f2259c.getLocationInWindow(iArr2);
                i5 = iArr2[0];
                i4 = iArr2[1];
            } else {
                i5 = 0;
                i4 = 0;
            }
            if (iArr == null) {
                iArr = m3288h();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            C0777c0.m3085c(g, this.f2259c, i, i2, iArr, i3);
            if (iArr2 != null) {
                this.f2259c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i5;
                iArr2[1] = iArr2[1] - i4;
            }
            return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    /* renamed from: d */
    public void mo2941d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m3286f(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: e */
    public boolean mo2942e(int i, int i2, int i3, int i4, int[] iArr) {
        return m3286f(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    /* renamed from: i */
    public boolean mo2943i(int i) {
        return m3287g(i) != null;
    }

    /* renamed from: j */
    public boolean mo2944j() {
        return this.f2260d;
    }

    /* renamed from: k */
    public void mo2945k(boolean z) {
        if (this.f2260d) {
            C0833y.m3347c0(this.f2259c);
        }
        this.f2260d = z;
    }

    /* renamed from: m */
    public boolean mo2946m(int i, int i2) {
        if (mo2943i(i2)) {
            return true;
        }
        if (!mo2944j()) {
            return false;
        }
        View view = this.f2259c;
        for (ViewParent parent = this.f2259c.getParent(); parent != null; parent = parent.getParent()) {
            if (C0777c0.m3088f(parent, view, this.f2259c, i, i2)) {
                m3289l(i2, parent);
                C0777c0.m3087e(parent, view, this.f2259c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: n */
    public void mo2947n(int i) {
        ViewParent g = m3287g(i);
        if (g != null) {
            C0777c0.m3089g(g, this.f2259c, i);
            m3289l(i, (ViewParent) null);
        }
    }
}
