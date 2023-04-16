package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.C0318a;
import androidx.appcompat.view.menu.C0330g;
import androidx.appcompat.view.menu.C0346m;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0783e0;
import androidx.core.view.C0791g0;
import androidx.core.view.C0833y;
import p038f.C2582a;
import p038f.C2586e;
import p038f.C2587f;
import p038f.C2589h;
import p038f.C2591j;
import p045g.C2620a;

/* renamed from: androidx.appcompat.widget.c1 */
public class C0437c1 implements C0460h0 {

    /* renamed from: a */
    Toolbar f1375a;

    /* renamed from: b */
    private int f1376b;

    /* renamed from: c */
    private View f1377c;

    /* renamed from: d */
    private View f1378d;

    /* renamed from: e */
    private Drawable f1379e;

    /* renamed from: f */
    private Drawable f1380f;

    /* renamed from: g */
    private Drawable f1381g;

    /* renamed from: h */
    private boolean f1382h;

    /* renamed from: i */
    CharSequence f1383i;

    /* renamed from: j */
    private CharSequence f1384j;

    /* renamed from: k */
    private CharSequence f1385k;

    /* renamed from: l */
    Window.Callback f1386l;

    /* renamed from: m */
    boolean f1387m;

    /* renamed from: n */
    private C0421c f1388n;

    /* renamed from: o */
    private int f1389o;

    /* renamed from: p */
    private int f1390p;

    /* renamed from: q */
    private Drawable f1391q;

    /* renamed from: androidx.appcompat.widget.c1$a */
    class C0438a implements View.OnClickListener {

        /* renamed from: f */
        final C0318a f1392f;

        C0438a() {
            this.f1392f = new C0318a(C0437c1.this.f1375a.getContext(), 0, 16908332, 0, 0, C0437c1.this.f1383i);
        }

        public void onClick(View view) {
            C0437c1 c1Var = C0437c1.this;
            Window.Callback callback = c1Var.f1386l;
            if (callback != null && c1Var.f1387m) {
                callback.onMenuItemSelected(0, this.f1392f);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.c1$b */
    class C0439b extends C0791g0 {

        /* renamed from: a */
        private boolean f1394a = false;

        /* renamed from: b */
        final /* synthetic */ int f1395b;

        C0439b(int i) {
            this.f1395b = i;
        }

        /* renamed from: a */
        public void mo1695a(View view) {
            this.f1394a = true;
        }

        /* renamed from: b */
        public void mo723b(View view) {
            if (!this.f1394a) {
                C0437c1.this.f1375a.setVisibility(this.f1395b);
            }
        }

        /* renamed from: c */
        public void mo724c(View view) {
            C0437c1.this.f1375a.setVisibility(0);
        }
    }

    public C0437c1(Toolbar toolbar, boolean z) {
        this(toolbar, z, C2589h.abc_action_bar_up_description, C2586e.abc_ic_ab_back_material);
    }

    public C0437c1(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f1389o = 0;
        this.f1390p = 0;
        this.f1375a = toolbar;
        this.f1383i = toolbar.getTitle();
        this.f1384j = toolbar.getSubtitle();
        this.f1382h = this.f1383i != null;
        this.f1381g = toolbar.getNavigationIcon();
        C0415a1 u = C0415a1.m1660u(toolbar.getContext(), (AttributeSet) null, C2591j.f18808a, C2582a.actionBarStyle, 0);
        this.f1391q = u.mo1771f(C2591j.f18863l);
        if (z) {
            CharSequence o = u.mo1780o(C2591j.f18893r);
            if (!TextUtils.isEmpty(o)) {
                mo1837C(o);
            }
            CharSequence o2 = u.mo1780o(C2591j.f18883p);
            if (!TextUtils.isEmpty(o2)) {
                mo1836B(o2);
            }
            Drawable f = u.mo1771f(C2591j.f18873n);
            if (f != null) {
                mo1867x(f);
            }
            Drawable f2 = u.mo1771f(C2591j.f18868m);
            if (f2 != null) {
                setIcon(f2);
            }
            if (this.f1381g == null && (drawable = this.f1391q) != null) {
                mo1835A(drawable);
            }
            mo1853m(u.mo1775j(C2591j.f18843h, 0));
            int m = u.mo1778m(C2591j.f18838g, 0);
            if (m != 0) {
                mo1865v(LayoutInflater.from(this.f1375a.getContext()).inflate(m, this.f1375a, false));
                mo1853m(this.f1376b | 16);
            }
            int l = u.mo1777l(C2591j.f18853j, 0);
            if (l > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1375a.getLayoutParams();
                layoutParams.height = l;
                this.f1375a.setLayoutParams(layoutParams);
            }
            int d = u.mo1769d(C2591j.f18833f, -1);
            int d2 = u.mo1769d(C2591j.f18828e, -1);
            if (d >= 0 || d2 >= 0) {
                this.f1375a.mo1578J(Math.max(d, 0), Math.max(d2, 0));
            }
            int m2 = u.mo1778m(C2591j.f18898s, 0);
            if (m2 != 0) {
                Toolbar toolbar2 = this.f1375a;
                toolbar2.mo1581M(toolbar2.getContext(), m2);
            }
            int m3 = u.mo1778m(C2591j.f18888q, 0);
            if (m3 != 0) {
                Toolbar toolbar3 = this.f1375a;
                toolbar3.mo1580L(toolbar3.getContext(), m3);
            }
            int m4 = u.mo1778m(C2591j.f18878o, 0);
            if (m4 != 0) {
                this.f1375a.setPopupTheme(m4);
            }
        } else {
            this.f1376b = m1770u();
        }
        u.mo1784v();
        mo1866w(i);
        this.f1385k = this.f1375a.getNavigationContentDescription();
        this.f1375a.setNavigationOnClickListener(new C0438a());
    }

    /* renamed from: D */
    private void m1766D(CharSequence charSequence) {
        this.f1383i = charSequence;
        if ((this.f1376b & 8) != 0) {
            this.f1375a.setTitle(charSequence);
            if (this.f1382h) {
                C0833y.m3332Q(this.f1375a.getRootView(), charSequence);
            }
        }
    }

    /* renamed from: E */
    private void m1767E() {
        if ((this.f1376b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1385k)) {
            this.f1375a.setNavigationContentDescription(this.f1390p);
        } else {
            this.f1375a.setNavigationContentDescription(this.f1385k);
        }
    }

    /* renamed from: F */
    private void m1768F() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f1376b & 4) != 0) {
            toolbar = this.f1375a;
            drawable = this.f1381g;
            if (drawable == null) {
                drawable = this.f1391q;
            }
        } else {
            toolbar = this.f1375a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: G */
    private void m1769G() {
        Drawable drawable;
        int i = this.f1376b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f1380f) == null) {
            drawable = this.f1379e;
        }
        this.f1375a.setLogo(drawable);
    }

    /* renamed from: u */
    private int m1770u() {
        if (this.f1375a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1391q = this.f1375a.getNavigationIcon();
        return 15;
    }

    /* renamed from: A */
    public void mo1835A(Drawable drawable) {
        this.f1381g = drawable;
        m1768F();
    }

    /* renamed from: B */
    public void mo1836B(CharSequence charSequence) {
        this.f1384j = charSequence;
        if ((this.f1376b & 8) != 0) {
            this.f1375a.setSubtitle(charSequence);
        }
    }

    /* renamed from: C */
    public void mo1837C(CharSequence charSequence) {
        this.f1382h = true;
        m1766D(charSequence);
    }

    /* renamed from: a */
    public void mo1838a(Menu menu, C0346m.C0347a aVar) {
        if (this.f1388n == null) {
            C0421c cVar = new C0421c(this.f1375a.getContext());
            this.f1388n = cVar;
            cVar.mo1009p(C2587f.action_menu_presenter);
        }
        this.f1388n.mo1004k(aVar);
        this.f1375a.mo1579K((C0330g) menu, this.f1388n);
    }

    /* renamed from: b */
    public boolean mo1839b() {
        return this.f1375a.mo1576B();
    }

    /* renamed from: c */
    public void mo1840c() {
        this.f1387m = true;
    }

    public void collapseActionView() {
        this.f1375a.mo1586e();
    }

    /* renamed from: d */
    public boolean mo1842d() {
        return this.f1375a.mo1575A();
    }

    /* renamed from: e */
    public boolean mo1843e() {
        return this.f1375a.mo1666w();
    }

    /* renamed from: f */
    public boolean mo1844f() {
        return this.f1375a.mo1582P();
    }

    /* renamed from: g */
    public boolean mo1845g() {
        return this.f1375a.mo1585d();
    }

    public Context getContext() {
        return this.f1375a.getContext();
    }

    public CharSequence getTitle() {
        return this.f1375a.getTitle();
    }

    /* renamed from: h */
    public void mo1848h() {
        this.f1375a.mo1587f();
    }

    /* renamed from: i */
    public void mo1849i(int i) {
        this.f1375a.setVisibility(i);
    }

    /* renamed from: j */
    public void mo1850j(C0517t0 t0Var) {
        Toolbar toolbar;
        View view = this.f1377c;
        if (view != null && view.getParent() == (toolbar = this.f1375a)) {
            toolbar.removeView(this.f1377c);
        }
        this.f1377c = t0Var;
        if (t0Var != null && this.f1389o == 2) {
            this.f1375a.addView(t0Var, 0);
            Toolbar.C0393e eVar = (Toolbar.C0393e) this.f1377c.getLayoutParams();
            eVar.width = -2;
            eVar.height = -2;
            eVar.f556a = 8388691;
            t0Var.setAllowCollapse(true);
        }
    }

    /* renamed from: k */
    public void mo1851k(boolean z) {
    }

    /* renamed from: l */
    public boolean mo1852l() {
        return this.f1375a.mo1665v();
    }

    /* renamed from: m */
    public void mo1853m(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f1376b ^ i;
        this.f1376b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m1767E();
                }
                m1768F();
            }
            if ((i2 & 3) != 0) {
                m1769G();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1375a.setTitle(this.f1383i);
                    toolbar = this.f1375a;
                    charSequence = this.f1384j;
                } else {
                    charSequence = null;
                    this.f1375a.setTitle((CharSequence) null);
                    toolbar = this.f1375a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) != 0 && (view = this.f1378d) != null) {
                if ((i & 16) != 0) {
                    this.f1375a.addView(view);
                } else {
                    this.f1375a.removeView(view);
                }
            }
        }
    }

    /* renamed from: n */
    public int mo1854n() {
        return this.f1376b;
    }

    /* renamed from: o */
    public void mo1855o(int i) {
        mo1867x(i != 0 ? C2620a.m21330b(getContext(), i) : null);
    }

    /* renamed from: p */
    public int mo1856p() {
        return this.f1389o;
    }

    /* renamed from: q */
    public C0783e0 mo1857q(int i, long j) {
        return C0833y.m3346c(this.f1375a).mo2853b(i == 0 ? 1.0f : 0.0f).mo2856f(j).mo2858h(new C0439b(i));
    }

    /* renamed from: r */
    public void mo1858r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: s */
    public void mo1859s() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void setIcon(int i) {
        setIcon(i != 0 ? C2620a.m21330b(getContext(), i) : null);
    }

    public void setIcon(Drawable drawable) {
        this.f1379e = drawable;
        m1769G();
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f1386l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1382h) {
            m1766D(charSequence);
        }
    }

    /* renamed from: t */
    public void mo1864t(boolean z) {
        this.f1375a.setCollapsible(z);
    }

    /* renamed from: v */
    public void mo1865v(View view) {
        View view2 = this.f1378d;
        if (!(view2 == null || (this.f1376b & 16) == 0)) {
            this.f1375a.removeView(view2);
        }
        this.f1378d = view;
        if (view != null && (this.f1376b & 16) != 0) {
            this.f1375a.addView(view);
        }
    }

    /* renamed from: w */
    public void mo1866w(int i) {
        if (i != this.f1390p) {
            this.f1390p = i;
            if (TextUtils.isEmpty(this.f1375a.getNavigationContentDescription())) {
                mo1868y(this.f1390p);
            }
        }
    }

    /* renamed from: x */
    public void mo1867x(Drawable drawable) {
        this.f1380f = drawable;
        m1769G();
    }

    /* renamed from: y */
    public void mo1868y(int i) {
        mo1869z(i == 0 ? null : getContext().getString(i));
    }

    /* renamed from: z */
    public void mo1869z(CharSequence charSequence) {
        this.f1385k = charSequence;
        m1767E();
    }
}
