package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C0747a0;
import androidx.core.view.C0833y;

/* renamed from: androidx.appcompat.widget.g1 */
class C0458g1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: p */
    private static C0458g1 f1439p;

    /* renamed from: q */
    private static C0458g1 f1440q;

    /* renamed from: f */
    private final View f1441f;

    /* renamed from: g */
    private final CharSequence f1442g;

    /* renamed from: h */
    private final int f1443h;

    /* renamed from: i */
    private final Runnable f1444i = new C0455f1(this);

    /* renamed from: j */
    private final Runnable f1445j = new C0452e1(this);

    /* renamed from: k */
    private int f1446k;

    /* renamed from: l */
    private int f1447l;

    /* renamed from: m */
    private C0461h1 f1448m;

    /* renamed from: n */
    private boolean f1449n;

    /* renamed from: o */
    private boolean f1450o;

    private C0458g1(View view, CharSequence charSequence) {
        this.f1441f = view;
        this.f1442g = charSequence;
        this.f1443h = C0747a0.m2976a(ViewConfiguration.get(view.getContext()));
        m1866c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: b */
    private void m1865b() {
        this.f1441f.removeCallbacks(this.f1444i);
    }

    /* renamed from: c */
    private void m1866c() {
        this.f1450o = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m1867e() {
        mo2009i(false);
    }

    /* renamed from: f */
    private void m1868f() {
        this.f1441f.postDelayed(this.f1444i, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: g */
    private static void m1869g(C0458g1 g1Var) {
        C0458g1 g1Var2 = f1439p;
        if (g1Var2 != null) {
            g1Var2.m1865b();
        }
        f1439p = g1Var;
        if (g1Var != null) {
            g1Var.m1868f();
        }
    }

    /* renamed from: h */
    public static void m1870h(View view, CharSequence charSequence) {
        C0458g1 g1Var = f1439p;
        if (g1Var != null && g1Var.f1441f == view) {
            m1869g((C0458g1) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C0458g1 g1Var2 = f1440q;
            if (g1Var2 != null && g1Var2.f1441f == view) {
                g1Var2.mo2008d();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new C0458g1(view, charSequence);
    }

    /* renamed from: j */
    private boolean m1871j(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.f1450o && Math.abs(x - this.f1446k) <= this.f1443h && Math.abs(y - this.f1447l) <= this.f1443h) {
            return false;
        }
        this.f1446k = x;
        this.f1447l = y;
        this.f1450o = false;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2008d() {
        if (f1440q == this) {
            f1440q = null;
            C0461h1 h1Var = this.f1448m;
            if (h1Var != null) {
                h1Var.mo2033c();
                this.f1448m = null;
                m1866c();
                this.f1441f.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1439p == this) {
            m1869g((C0458g1) null);
        }
        this.f1441f.removeCallbacks(this.f1445j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2009i(boolean z) {
        long j;
        if (C0833y.m3316A(this.f1441f)) {
            m1869g((C0458g1) null);
            C0458g1 g1Var = f1440q;
            if (g1Var != null) {
                g1Var.mo2008d();
            }
            f1440q = this;
            this.f1449n = z;
            C0461h1 h1Var = new C0461h1(this.f1441f.getContext());
            this.f1448m = h1Var;
            h1Var.mo2035e(this.f1441f, this.f1446k, this.f1447l, this.f1449n, this.f1442g);
            this.f1441f.addOnAttachStateChangeListener(this);
            if (this.f1449n) {
                j = 2500;
            } else {
                j = ((C0833y.m3368x(this.f1441f) & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f1441f.removeCallbacks(this.f1445j);
            this.f1441f.postDelayed(this.f1445j, j);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1448m != null && this.f1449n) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1441f.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m1866c();
                mo2008d();
            }
        } else if (this.f1441f.isEnabled() && this.f1448m == null && m1871j(motionEvent)) {
            m1869g(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f1446k = view.getWidth() / 2;
        this.f1447l = view.getHeight() / 2;
        mo2009i(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        mo2008d();
    }
}
