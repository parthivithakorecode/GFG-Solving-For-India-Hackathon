package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.C0246a;
import androidx.appcompat.view.C0298a;
import androidx.appcompat.view.C0299b;
import androidx.appcompat.view.C0307g;
import androidx.appcompat.view.C0310h;
import androidx.appcompat.view.menu.C0330g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0460h0;
import androidx.appcompat.widget.C0517t0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0783e0;
import androidx.core.view.C0789f0;
import androidx.core.view.C0791g0;
import androidx.core.view.C0794h0;
import androidx.core.view.C0833y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p038f.C2582a;
import p038f.C2587f;
import p038f.C2591j;

/* renamed from: androidx.appcompat.app.n */
public class C0293n extends C0246a implements ActionBarOverlayLayout.C0362d {

    /* renamed from: E */
    private static final Interpolator f706E = new AccelerateInterpolator();

    /* renamed from: F */
    private static final Interpolator f707F = new DecelerateInterpolator();

    /* renamed from: A */
    boolean f708A;

    /* renamed from: B */
    final C0789f0 f709B = new C0294a();

    /* renamed from: C */
    final C0789f0 f710C = new C0295b();

    /* renamed from: D */
    final C0794h0 f711D = new C0296c();

    /* renamed from: a */
    Context f712a;

    /* renamed from: b */
    private Context f713b;

    /* renamed from: c */
    private Activity f714c;

    /* renamed from: d */
    ActionBarOverlayLayout f715d;

    /* renamed from: e */
    ActionBarContainer f716e;

    /* renamed from: f */
    C0460h0 f717f;

    /* renamed from: g */
    ActionBarContextView f718g;

    /* renamed from: h */
    View f719h;

    /* renamed from: i */
    C0517t0 f720i;

    /* renamed from: j */
    private ArrayList<Object> f721j = new ArrayList<>();

    /* renamed from: k */
    private int f722k = -1;

    /* renamed from: l */
    private boolean f723l;

    /* renamed from: m */
    C0297d f724m;

    /* renamed from: n */
    C0299b f725n;

    /* renamed from: o */
    C0299b.C0300a f726o;

    /* renamed from: p */
    private boolean f727p;

    /* renamed from: q */
    private ArrayList<C0246a.C0248b> f728q = new ArrayList<>();

    /* renamed from: r */
    private boolean f729r;

    /* renamed from: s */
    private int f730s = 0;

    /* renamed from: t */
    boolean f731t = true;

    /* renamed from: u */
    boolean f732u;

    /* renamed from: v */
    boolean f733v;

    /* renamed from: w */
    private boolean f734w;

    /* renamed from: x */
    private boolean f735x = true;

    /* renamed from: y */
    C0310h f736y;

    /* renamed from: z */
    private boolean f737z;

    /* renamed from: androidx.appcompat.app.n$a */
    class C0294a extends C0791g0 {
        C0294a() {
        }

        /* renamed from: b */
        public void mo723b(View view) {
            View view2;
            C0293n nVar = C0293n.this;
            if (nVar.f731t && (view2 = nVar.f719h) != null) {
                view2.setTranslationY(0.0f);
                C0293n.this.f716e.setTranslationY(0.0f);
            }
            C0293n.this.f716e.setVisibility(8);
            C0293n.this.f716e.setTransitioning(false);
            C0293n nVar2 = C0293n.this;
            nVar2.f736y = null;
            nVar2.mo807w();
            ActionBarOverlayLayout actionBarOverlayLayout = C0293n.this.f715d;
            if (actionBarOverlayLayout != null) {
                C0833y.m3327L(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.n$b */
    class C0295b extends C0791g0 {
        C0295b() {
        }

        /* renamed from: b */
        public void mo723b(View view) {
            C0293n nVar = C0293n.this;
            nVar.f736y = null;
            nVar.f716e.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.n$c */
    class C0296c implements C0794h0 {
        C0296c() {
        }

        /* renamed from: a */
        public void mo810a(View view) {
            ((View) C0293n.this.f716e.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.n$d */
    public class C0297d extends C0299b implements C0330g.C0331a {

        /* renamed from: h */
        private final Context f741h;

        /* renamed from: i */
        private final C0330g f742i;

        /* renamed from: j */
        private C0299b.C0300a f743j;

        /* renamed from: k */
        private WeakReference<View> f744k;

        public C0297d(Context context, C0299b.C0300a aVar) {
            this.f741h = context;
            this.f743j = aVar;
            C0330g S = new C0330g(context).mo1074S(1);
            this.f742i = S;
            S.mo1073R(this);
        }

        /* renamed from: a */
        public boolean mo698a(C0330g gVar, MenuItem menuItem) {
            C0299b.C0300a aVar = this.f743j;
            if (aVar != null) {
                return aVar.mo731c(this, menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public void mo700b(C0330g gVar) {
            if (this.f743j != null) {
                mo817k();
                C0293n.this.f718g.mo1356l();
            }
        }

        /* renamed from: c */
        public void mo811c() {
            C0293n nVar = C0293n.this;
            if (nVar.f724m == this) {
                if (!C0293n.m1010v(nVar.f732u, nVar.f733v, false)) {
                    C0293n nVar2 = C0293n.this;
                    nVar2.f725n = this;
                    nVar2.f726o = this.f743j;
                } else {
                    this.f743j.mo730b(this);
                }
                this.f743j = null;
                C0293n.this.mo806u(false);
                C0293n.this.f718g.mo1346g();
                C0293n nVar3 = C0293n.this;
                nVar3.f715d.setHideOnContentScrollEnabled(nVar3.f708A);
                C0293n.this.f724m = null;
            }
        }

        /* renamed from: d */
        public View mo812d() {
            WeakReference<View> weakReference = this.f744k;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        /* renamed from: e */
        public Menu mo813e() {
            return this.f742i;
        }

        /* renamed from: f */
        public MenuInflater mo814f() {
            return new C0307g(this.f741h);
        }

        /* renamed from: g */
        public CharSequence mo815g() {
            return C0293n.this.f718g.getSubtitle();
        }

        /* renamed from: i */
        public CharSequence mo816i() {
            return C0293n.this.f718g.getTitle();
        }

        /* renamed from: k */
        public void mo817k() {
            if (C0293n.this.f724m == this) {
                this.f742i.mo1099d0();
                try {
                    this.f743j.mo729a(this, this.f742i);
                } finally {
                    this.f742i.mo1094c0();
                }
            }
        }

        /* renamed from: l */
        public boolean mo818l() {
            return C0293n.this.f718g.mo1354j();
        }

        /* renamed from: m */
        public void mo819m(View view) {
            C0293n.this.f718g.setCustomView(view);
            this.f744k = new WeakReference<>(view);
        }

        /* renamed from: n */
        public void mo820n(int i) {
            mo821o(C0293n.this.f712a.getResources().getString(i));
        }

        /* renamed from: o */
        public void mo821o(CharSequence charSequence) {
            C0293n.this.f718g.setSubtitle(charSequence);
        }

        /* renamed from: q */
        public void mo822q(int i) {
            mo823r(C0293n.this.f712a.getResources().getString(i));
        }

        /* renamed from: r */
        public void mo823r(CharSequence charSequence) {
            C0293n.this.f718g.setTitle(charSequence);
        }

        /* renamed from: s */
        public void mo824s(boolean z) {
            super.mo824s(z);
            C0293n.this.f718g.setTitleOptional(z);
        }

        /* renamed from: t */
        public boolean mo825t() {
            this.f742i.mo1099d0();
            try {
                return this.f743j.mo732d(this, this.f742i);
            } finally {
                this.f742i.mo1094c0();
            }
        }
    }

    public C0293n(Activity activity, boolean z) {
        this.f714c = activity;
        View decorView = activity.getWindow().getDecorView();
        m1005C(decorView);
        if (!z) {
            this.f719h = decorView.findViewById(16908290);
        }
    }

    public C0293n(Dialog dialog) {
        m1005C(dialog.getWindow().getDecorView());
    }

    /* renamed from: B */
    private void m1004B() {
        if (this.f734w) {
            this.f734w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f715d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m1009L(false);
        }
    }

    /* renamed from: C */
    private void m1005C(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C2587f.decor_content_parent);
        this.f715d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f717f = m1011z(view.findViewById(C2587f.action_bar));
        this.f718g = (ActionBarContextView) view.findViewById(C2587f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C2587f.action_bar_container);
        this.f716e = actionBarContainer;
        C0460h0 h0Var = this.f717f;
        if (h0Var == null || this.f718g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f712a = h0Var.getContext();
        boolean z = (this.f717f.mo1854n() & 4) != 0;
        if (z) {
            this.f723l = true;
        }
        C0298a b = C0298a.m1057b(this.f712a);
        mo799I(b.mo826a() || z);
        m1006G(b.mo831g());
        TypedArray obtainStyledAttributes = this.f712a.obtainStyledAttributes((AttributeSet) null, C2591j.f18808a, C2582a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C2591j.f18858k, false)) {
            mo798H(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C2591j.f18848i, 0);
        if (dimensionPixelSize != 0) {
            mo797F((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: G */
    private void m1006G(boolean z) {
        this.f729r = z;
        if (!z) {
            this.f717f.mo1850j((C0517t0) null);
            this.f716e.setTabContainer(this.f720i);
        } else {
            this.f716e.setTabContainer((C0517t0) null);
            this.f717f.mo1850j(this.f720i);
        }
        boolean z2 = true;
        boolean z3 = mo794A() == 2;
        C0517t0 t0Var = this.f720i;
        if (t0Var != null) {
            if (z3) {
                t0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f715d;
                if (actionBarOverlayLayout != null) {
                    C0833y.m3327L(actionBarOverlayLayout);
                }
            } else {
                t0Var.setVisibility(8);
            }
        }
        this.f717f.mo1864t(!this.f729r && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f715d;
        if (this.f729r || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: J */
    private boolean m1007J() {
        return C0833y.m3317B(this.f716e);
    }

    /* renamed from: K */
    private void m1008K() {
        if (!this.f734w) {
            this.f734w = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f715d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m1009L(false);
        }
    }

    /* renamed from: L */
    private void m1009L(boolean z) {
        if (m1010v(this.f732u, this.f733v, this.f734w)) {
            if (!this.f735x) {
                this.f735x = true;
                mo809y(z);
            }
        } else if (this.f735x) {
            this.f735x = false;
            mo808x(z);
        }
    }

    /* renamed from: v */
    static boolean m1010v(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: z */
    private C0460h0 m1011z(View view) {
        if (view instanceof C0460h0) {
            return (C0460h0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: A */
    public int mo794A() {
        return this.f717f.mo1856p();
    }

    /* renamed from: D */
    public void mo795D(boolean z) {
        mo796E(z ? 4 : 0, 4);
    }

    /* renamed from: E */
    public void mo796E(int i, int i2) {
        int n = this.f717f.mo1854n();
        if ((i2 & 4) != 0) {
            this.f723l = true;
        }
        this.f717f.mo1853m((i & i2) | ((~i2) & n));
    }

    /* renamed from: F */
    public void mo797F(float f) {
        C0833y.m3336U(this.f716e, f);
    }

    /* renamed from: H */
    public void mo798H(boolean z) {
        if (!z || this.f715d.mo1424w()) {
            this.f708A = z;
            this.f715d.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: I */
    public void mo799I(boolean z) {
        this.f717f.mo1851k(z);
    }

    /* renamed from: a */
    public void mo800a() {
        if (this.f733v) {
            this.f733v = false;
            m1009L(true);
        }
    }

    /* renamed from: b */
    public void mo801b() {
        C0310h hVar = this.f736y;
        if (hVar != null) {
            hVar.mo874a();
            this.f736y = null;
        }
    }

    /* renamed from: c */
    public void mo802c() {
    }

    /* renamed from: d */
    public void mo803d(boolean z) {
        this.f731t = z;
    }

    /* renamed from: e */
    public void mo804e() {
        if (!this.f733v) {
            this.f733v = true;
            m1009L(true);
        }
    }

    /* renamed from: g */
    public boolean mo596g() {
        C0460h0 h0Var = this.f717f;
        if (h0Var == null || !h0Var.mo1852l()) {
            return false;
        }
        this.f717f.collapseActionView();
        return true;
    }

    /* renamed from: h */
    public void mo597h(boolean z) {
        if (z != this.f727p) {
            this.f727p = z;
            int size = this.f728q.size();
            for (int i = 0; i < size; i++) {
                this.f728q.get(i).mo610a(z);
            }
        }
    }

    /* renamed from: i */
    public int mo598i() {
        return this.f717f.mo1854n();
    }

    /* renamed from: j */
    public Context mo599j() {
        if (this.f713b == null) {
            TypedValue typedValue = new TypedValue();
            this.f712a.getTheme().resolveAttribute(C2582a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f713b = new ContextThemeWrapper(this.f712a, i);
            } else {
                this.f713b = this.f712a;
            }
        }
        return this.f713b;
    }

    /* renamed from: l */
    public void mo601l(Configuration configuration) {
        m1006G(C0298a.m1057b(this.f712a).mo831g());
    }

    /* renamed from: n */
    public boolean mo603n(int i, KeyEvent keyEvent) {
        Menu e;
        C0297d dVar = this.f724m;
        if (dVar == null || (e = dVar.mo813e()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        e.setQwertyMode(z);
        return e.performShortcut(i, keyEvent, 0);
    }

    public void onWindowVisibilityChanged(int i) {
        this.f730s = i;
    }

    /* renamed from: q */
    public void mo606q(boolean z) {
        if (!this.f723l) {
            mo795D(z);
        }
    }

    /* renamed from: r */
    public void mo607r(boolean z) {
        C0310h hVar;
        this.f737z = z;
        if (!z && (hVar = this.f736y) != null) {
            hVar.mo874a();
        }
    }

    /* renamed from: s */
    public void mo608s(CharSequence charSequence) {
        this.f717f.setWindowTitle(charSequence);
    }

    /* renamed from: t */
    public C0299b mo609t(C0299b.C0300a aVar) {
        C0297d dVar = this.f724m;
        if (dVar != null) {
            dVar.mo811c();
        }
        this.f715d.setHideOnContentScrollEnabled(false);
        this.f718g.mo1355k();
        C0297d dVar2 = new C0297d(this.f718g.getContext(), aVar);
        if (!dVar2.mo825t()) {
            return null;
        }
        this.f724m = dVar2;
        dVar2.mo817k();
        this.f718g.mo1353h(dVar2);
        mo806u(true);
        return dVar2;
    }

    /* renamed from: u */
    public void mo806u(boolean z) {
        C0783e0 e0Var;
        C0783e0 e0Var2;
        if (z) {
            m1008K();
        } else {
            m1004B();
        }
        if (m1007J()) {
            if (z) {
                e0Var = this.f717f.mo1857q(4, 100);
                e0Var2 = this.f718g.mo1345f(0, 200);
            } else {
                e0Var2 = this.f717f.mo1857q(0, 200);
                e0Var = this.f718g.mo1345f(8, 100);
            }
            C0310h hVar = new C0310h();
            hVar.mo877d(e0Var, e0Var2);
            hVar.mo881h();
        } else if (z) {
            this.f717f.mo1849i(4);
            this.f718g.setVisibility(0);
        } else {
            this.f717f.mo1849i(0);
            this.f718g.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo807w() {
        C0299b.C0300a aVar = this.f726o;
        if (aVar != null) {
            aVar.mo730b(this.f725n);
            this.f725n = null;
            this.f726o = null;
        }
    }

    /* renamed from: x */
    public void mo808x(boolean z) {
        View view;
        C0310h hVar = this.f736y;
        if (hVar != null) {
            hVar.mo874a();
        }
        if (this.f730s != 0 || (!this.f737z && !z)) {
            this.f709B.mo723b((View) null);
            return;
        }
        this.f716e.setAlpha(1.0f);
        this.f716e.setTransitioning(true);
        C0310h hVar2 = new C0310h();
        float f = (float) (-this.f716e.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f716e.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C0783e0 m = C0833y.m3346c(this.f716e).mo2862m(f);
        m.mo2860k(this.f711D);
        hVar2.mo876c(m);
        if (this.f731t && (view = this.f719h) != null) {
            hVar2.mo876c(C0833y.m3346c(view).mo2862m(f));
        }
        hVar2.mo879f(f706E);
        hVar2.mo878e(250);
        hVar2.mo880g(this.f709B);
        this.f736y = hVar2;
        hVar2.mo881h();
    }

    /* renamed from: y */
    public void mo809y(boolean z) {
        View view;
        View view2;
        C0310h hVar = this.f736y;
        if (hVar != null) {
            hVar.mo874a();
        }
        this.f716e.setVisibility(0);
        if (this.f730s != 0 || (!this.f737z && !z)) {
            this.f716e.setAlpha(1.0f);
            this.f716e.setTranslationY(0.0f);
            if (this.f731t && (view = this.f719h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f710C.mo723b((View) null);
        } else {
            this.f716e.setTranslationY(0.0f);
            float f = (float) (-this.f716e.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f716e.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f716e.setTranslationY(f);
            C0310h hVar2 = new C0310h();
            C0783e0 m = C0833y.m3346c(this.f716e).mo2862m(0.0f);
            m.mo2860k(this.f711D);
            hVar2.mo876c(m);
            if (this.f731t && (view2 = this.f719h) != null) {
                view2.setTranslationY(f);
                hVar2.mo876c(C0833y.m3346c(this.f719h).mo2862m(0.0f));
            }
            hVar2.mo879f(f707F);
            hVar2.mo878e(250);
            hVar2.mo880g(this.f710C);
            this.f736y = hVar2;
            hVar2.mo881h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f715d;
        if (actionBarOverlayLayout != null) {
            C0833y.m3327L(actionBarOverlayLayout);
        }
    }
}
