package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0346m;
import androidx.appcompat.widget.C0496o0;
import androidx.appcompat.widget.C0498p0;
import androidx.core.view.C0782e;
import androidx.core.view.C0833y;
import java.util.ArrayList;
import java.util.List;
import p038f.C2585d;
import p038f.C2588g;

/* renamed from: androidx.appcompat.view.menu.d */
final class C0321d extends C0342k implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: G */
    private static final int f884G = C2588g.abc_cascading_menu_item_layout;

    /* renamed from: A */
    private boolean f885A;

    /* renamed from: B */
    private boolean f886B;

    /* renamed from: C */
    private C0346m.C0347a f887C;

    /* renamed from: D */
    ViewTreeObserver f888D;

    /* renamed from: E */
    private PopupWindow.OnDismissListener f889E;

    /* renamed from: F */
    boolean f890F;

    /* renamed from: g */
    private final Context f891g;

    /* renamed from: h */
    private final int f892h;

    /* renamed from: i */
    private final int f893i;

    /* renamed from: j */
    private final int f894j;

    /* renamed from: k */
    private final boolean f895k;

    /* renamed from: l */
    final Handler f896l;

    /* renamed from: m */
    private final List<C0330g> f897m = new ArrayList();

    /* renamed from: n */
    final List<C0326d> f898n = new ArrayList();

    /* renamed from: o */
    final ViewTreeObserver.OnGlobalLayoutListener f899o = new C0322a();

    /* renamed from: p */
    private final View.OnAttachStateChangeListener f900p = new C0323b();

    /* renamed from: q */
    private final C0496o0 f901q = new C0324c();

    /* renamed from: r */
    private int f902r = 0;

    /* renamed from: s */
    private int f903s = 0;

    /* renamed from: t */
    private View f904t;

    /* renamed from: u */
    View f905u;

    /* renamed from: v */
    private int f906v;

    /* renamed from: w */
    private boolean f907w;

    /* renamed from: x */
    private boolean f908x;

    /* renamed from: y */
    private int f909y;

    /* renamed from: z */
    private int f910z;

    /* renamed from: androidx.appcompat.view.menu.d$a */
    class C0322a implements ViewTreeObserver.OnGlobalLayoutListener {
        C0322a() {
        }

        public void onGlobalLayout() {
            if (C0321d.this.mo1017c() && C0321d.this.f898n.size() > 0 && !C0321d.this.f898n.get(0).f918a.mo2225x()) {
                View view = C0321d.this.f905u;
                if (view == null || !view.isShown()) {
                    C0321d.this.dismiss();
                    return;
                }
                for (C0326d dVar : C0321d.this.f898n) {
                    dVar.f918a.mo1016a();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$b */
    class C0323b implements View.OnAttachStateChangeListener {
        C0323b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0321d.this.f888D;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0321d.this.f888D = view.getViewTreeObserver();
                }
                C0321d dVar = C0321d.this;
                dVar.f888D.removeGlobalOnLayoutListener(dVar.f899o);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$c */
    class C0324c implements C0496o0 {

        /* renamed from: androidx.appcompat.view.menu.d$c$a */
        class C0325a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C0326d f914f;

            /* renamed from: g */
            final /* synthetic */ MenuItem f915g;

            /* renamed from: h */
            final /* synthetic */ C0330g f916h;

            C0325a(C0326d dVar, MenuItem menuItem, C0330g gVar) {
                this.f914f = dVar;
                this.f915g = menuItem;
                this.f916h = gVar;
            }

            public void run() {
                C0326d dVar = this.f914f;
                if (dVar != null) {
                    C0321d.this.f890F = true;
                    dVar.f919b.mo1100e(false);
                    C0321d.this.f890F = false;
                }
                if (this.f915g.isEnabled() && this.f915g.hasSubMenu()) {
                    this.f916h.mo1068L(this.f915g, 4);
                }
            }
        }

        C0324c() {
        }

        /* renamed from: d */
        public void mo1035d(C0330g gVar, MenuItem menuItem) {
            C0326d dVar = null;
            C0321d.this.f896l.removeCallbacksAndMessages((Object) null);
            int size = C0321d.this.f898n.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == C0321d.this.f898n.get(i).f919b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C0321d.this.f898n.size()) {
                    dVar = C0321d.this.f898n.get(i2);
                }
                C0321d.this.f896l.postAtTime(new C0325a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        /* renamed from: e */
        public void mo1036e(C0330g gVar, MenuItem menuItem) {
            C0321d.this.f896l.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d */
    private static class C0326d {

        /* renamed from: a */
        public final C0498p0 f918a;

        /* renamed from: b */
        public final C0330g f919b;

        /* renamed from: c */
        public final int f920c;

        public C0326d(C0498p0 p0Var, C0330g gVar, int i) {
            this.f918a = p0Var;
            this.f919b = gVar;
            this.f920c = i;
        }

        /* renamed from: a */
        public ListView mo1038a() {
            return this.f918a.mo1019g();
        }
    }

    public C0321d(Context context, View view, int i, int i2, boolean z) {
        this.f891g = context;
        this.f904t = view;
        this.f893i = i;
        this.f894j = i2;
        this.f895k = z;
        this.f885A = false;
        this.f906v = m1195D();
        Resources resources = context.getResources();
        this.f892h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C2585d.abc_config_prefDialogWidth));
        this.f896l = new Handler();
    }

    /* renamed from: A */
    private int m1192A(C0330g gVar) {
        int size = this.f898n.size();
        for (int i = 0; i < size; i++) {
            if (gVar == this.f898n.get(i).f919b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: B */
    private MenuItem m1193B(C0330g gVar, C0330g gVar2) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: C */
    private View m1194C(C0326d dVar, C0330g gVar) {
        int i;
        C0329f fVar;
        int firstVisiblePosition;
        MenuItem B = m1193B(dVar.f919b, gVar);
        if (B == null) {
            return null;
        }
        ListView a = dVar.mo1038a();
        ListAdapter adapter = a.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            fVar = (C0329f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (C0329f) adapter;
            i = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (B == fVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a.getChildCount()) {
            return a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: D */
    private int m1195D() {
        return C0833y.m3362r(this.f904t) == 1 ? 0 : 1;
    }

    /* renamed from: E */
    private int m1196E(int i) {
        List<C0326d> list = this.f898n;
        ListView a = list.get(list.size() - 1).mo1038a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f905u.getWindowVisibleDisplayFrame(rect);
        return this.f906v == 1 ? (iArr[0] + a.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    /* renamed from: F */
    private void m1197F(C0330g gVar) {
        View view;
        C0326d dVar;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f891g);
        C0329f fVar = new C0329f(gVar, from, this.f895k, f884G);
        if (!mo1017c() && this.f885A) {
            fVar.mo1052d(true);
        } else if (mo1017c()) {
            fVar.mo1052d(C0342k.m1339x(gVar));
        }
        int o = C0342k.m1338o(fVar, (ViewGroup) null, this.f891g, this.f892h);
        C0498p0 z = m1198z();
        z.mo1741p(fVar);
        z.mo2203B(o);
        z.mo2204C(this.f903s);
        if (this.f898n.size() > 0) {
            List<C0326d> list = this.f898n;
            dVar = list.get(list.size() - 1);
            view = m1194C(dVar, gVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            z.mo2253Q(false);
            z.mo2250N((Object) null);
            int E = m1196E(o);
            boolean z2 = E == 1;
            this.f906v = E;
            if (Build.VERSION.SDK_INT >= 26) {
                z.mo2226z(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f904t.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f903s & 7) == 5) {
                    iArr[0] = iArr[0] + this.f904t.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f903s & 5) != 5) {
                if (z2) {
                    o = view.getWidth();
                }
                i3 = i - o;
                z.mo2218l(i3);
                z.mo2210I(true);
                z.mo2217j(i2);
            } else if (!z2) {
                o = view.getWidth();
                i3 = i - o;
                z.mo2218l(i3);
                z.mo2210I(true);
                z.mo2217j(i2);
            }
            i3 = i + o;
            z.mo2218l(i3);
            z.mo2210I(true);
            z.mo2217j(i2);
        } else {
            if (this.f907w) {
                z.mo2218l(this.f909y);
            }
            if (this.f908x) {
                z.mo2217j(this.f910z);
            }
            z.mo2205D(mo1264n());
        }
        this.f898n.add(new C0326d(z, gVar, this.f906v));
        z.mo1016a();
        ListView g = z.mo1019g();
        g.setOnKeyListener(this);
        if (dVar == null && this.f886B && gVar.mo1129x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C2588g.abc_popup_menu_header_item_layout, g, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(gVar.mo1129x());
            g.addHeaderView(frameLayout, (Object) null, false);
            z.mo1016a();
        }
    }

    /* renamed from: z */
    private C0498p0 m1198z() {
        C0498p0 p0Var = new C0498p0(this.f891g, (AttributeSet) null, this.f893i, this.f894j);
        p0Var.mo2252P(this.f901q);
        p0Var.mo2209H(this);
        p0Var.mo2208G(this);
        p0Var.mo2226z(this.f904t);
        p0Var.mo2204C(this.f903s);
        p0Var.mo2207F(true);
        p0Var.mo2206E(2);
        return p0Var;
    }

    /* renamed from: a */
    public void mo1016a() {
        if (!mo1017c()) {
            for (C0330g F : this.f897m) {
                m1197F(F);
            }
            this.f897m.clear();
            View view = this.f904t;
            this.f905u = view;
            if (view != null) {
                boolean z = this.f888D == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f888D = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f899o);
                }
                this.f905u.addOnAttachStateChangeListener(this.f900p);
            }
        }
    }

    /* renamed from: b */
    public void mo996b(C0330g gVar, boolean z) {
        int A = m1192A(gVar);
        if (A >= 0) {
            int i = A + 1;
            if (i < this.f898n.size()) {
                this.f898n.get(i).f919b.mo1100e(false);
            }
            C0326d remove = this.f898n.remove(A);
            remove.f919b.mo1070O(this);
            if (this.f890F) {
                remove.f918a.mo2251O((Object) null);
                remove.f918a.mo2202A(0);
            }
            remove.f918a.dismiss();
            int size = this.f898n.size();
            this.f906v = size > 0 ? this.f898n.get(size - 1).f920c : m1195D();
            if (size == 0) {
                dismiss();
                C0346m.C0347a aVar = this.f887C;
                if (aVar != null) {
                    aVar.mo727b(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f888D;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f888D.removeGlobalOnLayoutListener(this.f899o);
                    }
                    this.f888D = null;
                }
                this.f905u.removeOnAttachStateChangeListener(this.f900p);
                this.f889E.onDismiss();
            } else if (z) {
                this.f898n.get(0).f919b.mo1100e(false);
            }
        }
    }

    /* renamed from: c */
    public boolean mo1017c() {
        return this.f898n.size() > 0 && this.f898n.get(0).f918a.mo1017c();
    }

    public void dismiss() {
        int size = this.f898n.size();
        if (size > 0) {
            C0326d[] dVarArr = (C0326d[]) this.f898n.toArray(new C0326d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0326d dVar = dVarArr[i];
                if (dVar.f918a.mo1017c()) {
                    dVar.f918a.dismiss();
                }
            }
        }
    }

    /* renamed from: e */
    public boolean mo999e(C0355r rVar) {
        for (C0326d next : this.f898n) {
            if (rVar == next.f919b) {
                next.mo1038a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        mo1021l(rVar);
        C0346m.C0347a aVar = this.f887C;
        if (aVar != null) {
            aVar.mo728c(rVar);
        }
        return true;
    }

    /* renamed from: f */
    public void mo1000f(boolean z) {
        for (C0326d a : this.f898n) {
            C0342k.m1340y(a.mo1038a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: g */
    public ListView mo1019g() {
        if (this.f898n.isEmpty()) {
            return null;
        }
        List<C0326d> list = this.f898n;
        return list.get(list.size() - 1).mo1038a();
    }

    /* renamed from: h */
    public boolean mo1020h() {
        return false;
    }

    /* renamed from: k */
    public void mo1004k(C0346m.C0347a aVar) {
        this.f887C = aVar;
    }

    /* renamed from: l */
    public void mo1021l(C0330g gVar) {
        gVar.mo1093c(this, this.f891g);
        if (mo1017c()) {
            m1197F(gVar);
        } else {
            this.f897m.add(gVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo1022m() {
        return false;
    }

    public void onDismiss() {
        C0326d dVar;
        int size = this.f898n.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.f898n.get(i);
            if (!dVar.f918a.mo1017c()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f919b.mo1100e(false);
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
        if (this.f904t != view) {
            this.f904t = view;
            this.f903s = C0782e.m3108a(this.f902r, C0833y.m3362r(view));
        }
    }

    /* renamed from: r */
    public void mo1026r(boolean z) {
        this.f885A = z;
    }

    /* renamed from: s */
    public void mo1027s(int i) {
        if (this.f902r != i) {
            this.f902r = i;
            this.f903s = C0782e.m3108a(i, C0833y.m3362r(this.f904t));
        }
    }

    /* renamed from: t */
    public void mo1028t(int i) {
        this.f907w = true;
        this.f909y = i;
    }

    /* renamed from: u */
    public void mo1029u(PopupWindow.OnDismissListener onDismissListener) {
        this.f889E = onDismissListener;
    }

    /* renamed from: v */
    public void mo1030v(boolean z) {
        this.f886B = z;
    }

    /* renamed from: w */
    public void mo1031w(int i) {
        this.f908x = true;
        this.f910z = i;
    }
}
