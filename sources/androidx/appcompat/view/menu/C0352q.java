package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0346m;
import androidx.appcompat.widget.C0498p0;
import androidx.core.view.C0833y;
import p038f.C2585d;
import p038f.C2588g;

/* renamed from: androidx.appcompat.view.menu.q */
final class C0352q extends C0342k implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: A */
    private static final int f1027A = C2588g.abc_popup_menu_item_layout;

    /* renamed from: g */
    private final Context f1028g;

    /* renamed from: h */
    private final C0330g f1029h;

    /* renamed from: i */
    private final C0329f f1030i;

    /* renamed from: j */
    private final boolean f1031j;

    /* renamed from: k */
    private final int f1032k;

    /* renamed from: l */
    private final int f1033l;

    /* renamed from: m */
    private final int f1034m;

    /* renamed from: n */
    final C0498p0 f1035n;

    /* renamed from: o */
    final ViewTreeObserver.OnGlobalLayoutListener f1036o = new C0353a();

    /* renamed from: p */
    private final View.OnAttachStateChangeListener f1037p = new C0354b();

    /* renamed from: q */
    private PopupWindow.OnDismissListener f1038q;

    /* renamed from: r */
    private View f1039r;

    /* renamed from: s */
    View f1040s;

    /* renamed from: t */
    private C0346m.C0347a f1041t;

    /* renamed from: u */
    ViewTreeObserver f1042u;

    /* renamed from: v */
    private boolean f1043v;

    /* renamed from: w */
    private boolean f1044w;

    /* renamed from: x */
    private int f1045x;

    /* renamed from: y */
    private int f1046y = 0;

    /* renamed from: z */
    private boolean f1047z;

    /* renamed from: androidx.appcompat.view.menu.q$a */
    class C0353a implements ViewTreeObserver.OnGlobalLayoutListener {
        C0353a() {
        }

        public void onGlobalLayout() {
            if (C0352q.this.mo1017c() && !C0352q.this.f1035n.mo2225x()) {
                View view = C0352q.this.f1040s;
                if (view == null || !view.isShown()) {
                    C0352q.this.dismiss();
                } else {
                    C0352q.this.f1035n.mo1016a();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.q$b */
    class C0354b implements View.OnAttachStateChangeListener {
        C0354b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0352q.this.f1042u;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0352q.this.f1042u = view.getViewTreeObserver();
                }
                C0352q qVar = C0352q.this;
                qVar.f1042u.removeGlobalOnLayoutListener(qVar.f1036o);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C0352q(Context context, C0330g gVar, View view, int i, int i2, boolean z) {
        this.f1028g = context;
        this.f1029h = gVar;
        this.f1031j = z;
        this.f1030i = new C0329f(gVar, LayoutInflater.from(context), z, f1027A);
        this.f1033l = i;
        this.f1034m = i2;
        Resources resources = context.getResources();
        this.f1032k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C2585d.abc_config_prefDialogWidth));
        this.f1039r = view;
        this.f1035n = new C0498p0(context, (AttributeSet) null, i, i2);
        gVar.mo1093c(this, context);
    }

    /* renamed from: z */
    private boolean m1386z() {
        View view;
        if (mo1017c()) {
            return true;
        }
        if (this.f1043v || (view = this.f1039r) == null) {
            return false;
        }
        this.f1040s = view;
        this.f1035n.mo2208G(this);
        this.f1035n.mo2209H(this);
        this.f1035n.mo2207F(true);
        View view2 = this.f1040s;
        boolean z = this.f1042u == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1042u = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1036o);
        }
        view2.addOnAttachStateChangeListener(this.f1037p);
        this.f1035n.mo2226z(view2);
        this.f1035n.mo2204C(this.f1046y);
        if (!this.f1044w) {
            this.f1045x = C0342k.m1338o(this.f1030i, (ViewGroup) null, this.f1028g, this.f1032k);
            this.f1044w = true;
        }
        this.f1035n.mo2203B(this.f1045x);
        this.f1035n.mo2206E(2);
        this.f1035n.mo2205D(mo1264n());
        this.f1035n.mo1016a();
        ListView g = this.f1035n.mo1019g();
        g.setOnKeyListener(this);
        if (this.f1047z && this.f1029h.mo1129x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1028g).inflate(C2588g.abc_popup_menu_header_item_layout, g, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f1029h.mo1129x());
            }
            frameLayout.setEnabled(false);
            g.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f1035n.mo1741p(this.f1030i);
        this.f1035n.mo1016a();
        return true;
    }

    /* renamed from: a */
    public void mo1016a() {
        if (!m1386z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: b */
    public void mo996b(C0330g gVar, boolean z) {
        if (gVar == this.f1029h) {
            dismiss();
            C0346m.C0347a aVar = this.f1041t;
            if (aVar != null) {
                aVar.mo727b(gVar, z);
            }
        }
    }

    /* renamed from: c */
    public boolean mo1017c() {
        return !this.f1043v && this.f1035n.mo1017c();
    }

    public void dismiss() {
        if (mo1017c()) {
            this.f1035n.dismiss();
        }
    }

    /* renamed from: e */
    public boolean mo999e(C0355r rVar) {
        if (rVar.hasVisibleItems()) {
            C0343l lVar = new C0343l(this.f1028g, rVar, this.f1040s, this.f1031j, this.f1033l, this.f1034m);
            lVar.mo1275j(this.f1041t);
            lVar.mo1272g(C0342k.m1339x(rVar));
            lVar.mo1274i(this.f1038q);
            this.f1038q = null;
            this.f1029h.mo1100e(false);
            int b = this.f1035n.mo2214b();
            int n = this.f1035n.mo2219n();
            if ((Gravity.getAbsoluteGravity(this.f1046y, C0833y.m3362r(this.f1039r)) & 7) == 5) {
                b += this.f1039r.getWidth();
            }
            if (lVar.mo1278n(b, n)) {
                C0346m.C0347a aVar = this.f1041t;
                if (aVar == null) {
                    return true;
                }
                aVar.mo728c(rVar);
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo1000f(boolean z) {
        this.f1044w = false;
        C0329f fVar = this.f1030i;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    /* renamed from: g */
    public ListView mo1019g() {
        return this.f1035n.mo1019g();
    }

    /* renamed from: h */
    public boolean mo1020h() {
        return false;
    }

    /* renamed from: k */
    public void mo1004k(C0346m.C0347a aVar) {
        this.f1041t = aVar;
    }

    /* renamed from: l */
    public void mo1021l(C0330g gVar) {
    }

    public void onDismiss() {
        this.f1043v = true;
        this.f1029h.close();
        ViewTreeObserver viewTreeObserver = this.f1042u;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1042u = this.f1040s.getViewTreeObserver();
            }
            this.f1042u.removeGlobalOnLayoutListener(this.f1036o);
            this.f1042u = null;
        }
        this.f1040s.removeOnAttachStateChangeListener(this.f1037p);
        PopupWindow.OnDismissListener onDismissListener = this.f1038q;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: p */
    public void mo1025p(View view) {
        this.f1039r = view;
    }

    /* renamed from: r */
    public void mo1026r(boolean z) {
        this.f1030i.mo1052d(z);
    }

    /* renamed from: s */
    public void mo1027s(int i) {
        this.f1046y = i;
    }

    /* renamed from: t */
    public void mo1028t(int i) {
        this.f1035n.mo2218l(i);
    }

    /* renamed from: u */
    public void mo1029u(PopupWindow.OnDismissListener onDismissListener) {
        this.f1038q = onDismissListener;
    }

    /* renamed from: v */
    public void mo1030v(boolean z) {
        this.f1047z = z;
    }

    /* renamed from: w */
    public void mo1031w(int i) {
        this.f1035n.mo2217j(i);
    }
}
