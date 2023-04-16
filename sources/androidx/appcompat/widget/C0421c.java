package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.C0298a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0319b;
import androidx.appcompat.view.menu.C0330g;
import androidx.appcompat.view.menu.C0334i;
import androidx.appcompat.view.menu.C0343l;
import androidx.appcompat.view.menu.C0346m;
import androidx.appcompat.view.menu.C0348n;
import androidx.appcompat.view.menu.C0351p;
import androidx.appcompat.view.menu.C0355r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.C0650a;
import androidx.core.view.C0764b;
import java.util.ArrayList;
import p038f.C2582a;
import p038f.C2588g;

/* renamed from: androidx.appcompat.widget.c */
class C0421c extends C0319b implements C0764b.C0765a {

    /* renamed from: A */
    private boolean f1325A;

    /* renamed from: B */
    private int f1326B;

    /* renamed from: C */
    private final SparseBooleanArray f1327C = new SparseBooleanArray();

    /* renamed from: D */
    C0427e f1328D;

    /* renamed from: E */
    C0422a f1329E;

    /* renamed from: F */
    C0424c f1330F;

    /* renamed from: G */
    private C0423b f1331G;

    /* renamed from: H */
    final C0428f f1332H = new C0428f();

    /* renamed from: I */
    int f1333I;

    /* renamed from: p */
    C0425d f1334p;

    /* renamed from: q */
    private Drawable f1335q;

    /* renamed from: r */
    private boolean f1336r;

    /* renamed from: s */
    private boolean f1337s;

    /* renamed from: t */
    private boolean f1338t;

    /* renamed from: u */
    private int f1339u;

    /* renamed from: v */
    private int f1340v;

    /* renamed from: w */
    private int f1341w;

    /* renamed from: x */
    private boolean f1342x;

    /* renamed from: y */
    private boolean f1343y;

    /* renamed from: z */
    private boolean f1344z;

    /* renamed from: androidx.appcompat.widget.c$a */
    private class C0422a extends C0343l {
        public C0422a(Context context, C0355r rVar, View view) {
            super(context, rVar, view, false, C2582a.actionOverflowMenuStyle);
            if (!((C0334i) rVar.getItem()).mo1163l()) {
                View view2 = C0421c.this.f1334p;
                mo1271f(view2 == null ? (View) C0421c.this.f879n : view2);
            }
            mo1275j(C0421c.this.f1332H);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo1270e() {
            C0421c cVar = C0421c.this;
            cVar.f1329E = null;
            cVar.f1333I = 0;
            super.mo1270e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    private class C0423b extends ActionMenuItemView.C0317b {
        C0423b() {
        }

        /* renamed from: a */
        public C0351p mo920a() {
            C0422a aVar = C0421c.this.f1329E;
            if (aVar != null) {
                return aVar.mo1268c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c */
    private class C0424c implements Runnable {

        /* renamed from: f */
        private C0427e f1347f;

        public C0424c(C0427e eVar) {
            this.f1347f = eVar;
        }

        public void run() {
            if (C0421c.this.f873h != null) {
                C0421c.this.f873h.mo1098d();
            }
            View view = (View) C0421c.this.f879n;
            if (!(view == null || view.getWindowToken() == null || !this.f1347f.mo1277m())) {
                C0421c.this.f1328D = this.f1347f;
            }
            C0421c.this.f1330F = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    private class C0425d extends C0512r implements ActionMenuView.C0364a {

        /* renamed from: androidx.appcompat.widget.c$d$a */
        class C0426a extends C0478l0 {

            /* renamed from: o */
            final /* synthetic */ C0421c f1350o;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0426a(View view, C0421c cVar) {
                super(view);
                this.f1350o = cVar;
            }

            /* renamed from: b */
            public C0351p mo918b() {
                C0427e eVar = C0421c.this.f1328D;
                if (eVar == null) {
                    return null;
                }
                return eVar.mo1268c();
            }

            /* renamed from: c */
            public boolean mo919c() {
                C0421c.this.mo1803K();
                return true;
            }

            /* renamed from: e */
            public boolean mo1808e() {
                C0421c cVar = C0421c.this;
                if (cVar.f1330F != null) {
                    return false;
                }
                cVar.mo1794B();
                return true;
            }
        }

        public C0425d(Context context) {
            super(context, (AttributeSet) null, C2582a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0442d1.m1804a(this, getContentDescription());
            setOnTouchListener(new C0426a(this, C0421c.this));
        }

        /* renamed from: b */
        public boolean mo899b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo900c() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0421c.this.mo1803K();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0650a.m2694k(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    private class C0427e extends C0343l {
        public C0427e(Context context, C0330g gVar, View view, boolean z) {
            super(context, gVar, view, z, C2582a.actionOverflowMenuStyle);
            mo1273h(8388613);
            mo1275j(C0421c.this.f1332H);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo1270e() {
            if (C0421c.this.f873h != null) {
                C0421c.this.f873h.close();
            }
            C0421c.this.f1328D = null;
            super.mo1270e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    private class C0428f implements C0346m.C0347a {
        C0428f() {
        }

        /* renamed from: b */
        public void mo727b(C0330g gVar, boolean z) {
            if (gVar instanceof C0355r) {
                gVar.mo1060D().mo1100e(false);
            }
            C0346m.C0347a m = C0421c.this.mo1006m();
            if (m != null) {
                m.mo727b(gVar, z);
            }
        }

        /* renamed from: c */
        public boolean mo728c(C0330g gVar) {
            if (gVar == C0421c.this.f873h) {
                return false;
            }
            C0421c.this.f1333I = ((C0355r) gVar).getItem().getItemId();
            C0346m.C0347a m = C0421c.this.mo1006m();
            if (m != null) {
                return m.mo728c(gVar);
            }
            return false;
        }
    }

    public C0421c(Context context) {
        super(context, C2588g.abc_action_menu_layout, C2588g.abc_action_menu_item_layout);
    }

    /* renamed from: z */
    private View m1691z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f879n;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0348n.C0349a) && ((C0348n.C0349a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: A */
    public Drawable mo1793A() {
        C0425d dVar = this.f1334p;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1336r) {
            return this.f1335q;
        }
        return null;
    }

    /* renamed from: B */
    public boolean mo1794B() {
        C0348n nVar;
        C0424c cVar = this.f1330F;
        if (cVar == null || (nVar = this.f879n) == null) {
            C0427e eVar = this.f1328D;
            if (eVar == null) {
                return false;
            }
            eVar.mo1267b();
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.f1330F = null;
        return true;
    }

    /* renamed from: C */
    public boolean mo1795C() {
        C0422a aVar = this.f1329E;
        if (aVar == null) {
            return false;
        }
        aVar.mo1267b();
        return true;
    }

    /* renamed from: D */
    public boolean mo1796D() {
        return this.f1330F != null || mo1797E();
    }

    /* renamed from: E */
    public boolean mo1797E() {
        C0427e eVar = this.f1328D;
        return eVar != null && eVar.mo1269d();
    }

    /* renamed from: F */
    public void mo1798F(Configuration configuration) {
        if (!this.f1342x) {
            this.f1341w = C0298a.m1057b(this.f872g).mo828d();
        }
        C0330g gVar = this.f873h;
        if (gVar != null) {
            gVar.mo1067K(true);
        }
    }

    /* renamed from: G */
    public void mo1799G(boolean z) {
        this.f1325A = z;
    }

    /* renamed from: H */
    public void mo1800H(ActionMenuView actionMenuView) {
        this.f879n = actionMenuView;
        actionMenuView.mo922b(this.f873h);
    }

    /* renamed from: I */
    public void mo1801I(Drawable drawable) {
        C0425d dVar = this.f1334p;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f1336r = true;
        this.f1335q = drawable;
    }

    /* renamed from: J */
    public void mo1802J(boolean z) {
        this.f1337s = z;
        this.f1338t = true;
    }

    /* renamed from: K */
    public boolean mo1803K() {
        C0330g gVar;
        if (!this.f1337s || mo1797E() || (gVar = this.f873h) == null || this.f879n == null || this.f1330F != null || gVar.mo1131z().isEmpty()) {
            return false;
        }
        C0424c cVar = new C0424c(new C0427e(this.f872g, this.f873h, this.f1334p, true));
        this.f1330F = cVar;
        ((View) this.f879n).post(cVar);
        return true;
    }

    /* renamed from: b */
    public void mo996b(C0330g gVar, boolean z) {
        mo1804y();
        super.mo996b(gVar, z);
    }

    /* renamed from: c */
    public void mo997c(C0334i iVar, C0348n.C0349a aVar) {
        aVar.mo901e(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f879n);
        if (this.f1331G == null) {
            this.f1331G = new C0423b();
        }
        actionMenuItemView.setPopupCallback(this.f1331G);
    }

    /* renamed from: d */
    public void mo998d(Context context, C0330g gVar) {
        super.mo998d(context, gVar);
        Resources resources = context.getResources();
        C0298a b = C0298a.m1057b(context);
        if (!this.f1338t) {
            this.f1337s = b.mo832h();
        }
        if (!this.f1344z) {
            this.f1339u = b.mo827c();
        }
        if (!this.f1342x) {
            this.f1341w = b.mo828d();
        }
        int i = this.f1339u;
        if (this.f1337s) {
            if (this.f1334p == null) {
                C0425d dVar = new C0425d(this.f871f);
                this.f1334p = dVar;
                if (this.f1336r) {
                    dVar.setImageDrawable(this.f1335q);
                    this.f1335q = null;
                    this.f1336r = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1334p.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f1334p.getMeasuredWidth();
        } else {
            this.f1334p = null;
        }
        this.f1340v = i;
        this.f1326B = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    /* renamed from: e */
    public boolean mo999e(C0355r rVar) {
        boolean z = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        C0355r rVar2 = rVar;
        while (rVar2.mo1309e0() != this.f873h) {
            rVar2 = (C0355r) rVar2.mo1309e0();
        }
        View z2 = m1691z(rVar2.getItem());
        if (z2 == null) {
            return false;
        }
        this.f1333I = rVar.getItem().getItemId();
        int size = rVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        C0422a aVar = new C0422a(this.f872g, rVar, z2);
        this.f1329E = aVar;
        aVar.mo1272g(z);
        this.f1329E.mo1276k();
        super.mo999e(rVar);
        return true;
    }

    /* renamed from: f */
    public void mo1000f(boolean z) {
        C0348n nVar;
        super.mo1000f(z);
        ((View) this.f879n).requestLayout();
        C0330g gVar = this.f873h;
        boolean z2 = false;
        if (gVar != null) {
            ArrayList<C0334i> s = gVar.mo1118s();
            int size = s.size();
            for (int i = 0; i < size; i++) {
                C0764b b = s.get(i).mo937b();
                if (b != null) {
                    b.mo2825i(this);
                }
            }
        }
        C0330g gVar2 = this.f873h;
        ArrayList<C0334i> z3 = gVar2 != null ? gVar2.mo1131z() : null;
        if (this.f1337s && z3 != null) {
            int size2 = z3.size();
            if (size2 == 1) {
                z2 = !z3.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        C0425d dVar = this.f1334p;
        if (z2) {
            if (dVar == null) {
                this.f1334p = new C0425d(this.f871f);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1334p.getParent();
            if (viewGroup != this.f879n) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1334p);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f879n;
                actionMenuView.addView(this.f1334p, actionMenuView.mo1433D());
            }
        } else if (dVar != null && dVar.getParent() == (nVar = this.f879n)) {
            ((ViewGroup) nVar).removeView(this.f1334p);
        }
        ((ActionMenuView) this.f879n).setOverflowReserved(this.f1337s);
    }

    /* renamed from: h */
    public boolean mo1020h() {
        int i;
        ArrayList<C0334i> arrayList;
        int i2;
        int i3;
        int i4;
        boolean z;
        C0421c cVar = this;
        C0330g gVar = cVar.f873h;
        View view = null;
        boolean z2 = false;
        if (gVar != null) {
            arrayList = gVar.mo1061E();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i5 = cVar.f1341w;
        int i6 = cVar.f1340v;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f879n;
        boolean z3 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            C0334i iVar = arrayList.get(i9);
            if (iVar.mo1166o()) {
                i7++;
            } else if (iVar.mo1165n()) {
                i8++;
            } else {
                z3 = true;
            }
            if (cVar.f1325A && iVar.isActionViewExpanded()) {
                i5 = 0;
            }
        }
        if (cVar.f1337s && (z3 || i8 + i7 > i5)) {
            i5--;
        }
        int i10 = i5 - i7;
        SparseBooleanArray sparseBooleanArray = cVar.f1327C;
        sparseBooleanArray.clear();
        if (cVar.f1343y) {
            int i11 = cVar.f1326B;
            i2 = i6 / i11;
            i3 = i11 + ((i6 % i11) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i) {
            C0334i iVar2 = arrayList.get(i12);
            if (iVar2.mo1166o()) {
                View n = cVar.mo1007n(iVar2, view, viewGroup);
                if (cVar.f1343y) {
                    i2 -= ActionMenuView.m1456J(n, i3, i2, makeMeasureSpec, z2 ? 1 : 0);
                } else {
                    n.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.mo1189u(true);
                z = z2;
                i4 = i;
            } else if (iVar2.mo1165n()) {
                int groupId2 = iVar2.getGroupId();
                boolean z4 = sparseBooleanArray.get(groupId2);
                boolean z5 = (i10 > 0 || z4) && i6 > 0 && (!cVar.f1343y || i2 > 0);
                boolean z6 = z5;
                i4 = i;
                if (z5) {
                    View n2 = cVar.mo1007n(iVar2, (View) null, viewGroup);
                    if (cVar.f1343y) {
                        int J = ActionMenuView.m1456J(n2, i3, i2, makeMeasureSpec, 0);
                        i2 -= J;
                        if (J == 0) {
                            z6 = false;
                        }
                    } else {
                        n2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z7 = z6;
                    int measuredWidth2 = n2.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    z5 = z7 & (!cVar.f1343y ? i6 + i13 > 0 : i6 >= 0);
                }
                if (z5 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z4) {
                    sparseBooleanArray.put(groupId2, false);
                    int i14 = 0;
                    while (i14 < i12) {
                        C0334i iVar3 = arrayList.get(i14);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.mo1163l()) {
                                i10++;
                            }
                            iVar3.mo1189u(false);
                        }
                        i14++;
                    }
                }
                if (z5) {
                    i10--;
                }
                iVar2.mo1189u(z5);
                z = false;
            } else {
                z = z2;
                i4 = i;
                iVar2.mo1189u(z);
            }
            i12++;
            z2 = z;
            i = i4;
            view = null;
            cVar = this;
        }
        return true;
    }

    /* renamed from: l */
    public boolean mo1005l(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f1334p) {
            return false;
        }
        return super.mo1005l(viewGroup, i);
    }

    /* renamed from: n */
    public View mo1007n(C0334i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.mo1161j()) {
            actionView = super.mo1007n(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.mo1453m(layoutParams));
        }
        return actionView;
    }

    /* renamed from: o */
    public C0348n mo1008o(ViewGroup viewGroup) {
        C0348n nVar = this.f879n;
        C0348n o = super.mo1008o(viewGroup);
        if (nVar != o) {
            ((ActionMenuView) o).setPresenter(this);
        }
        return o;
    }

    /* renamed from: q */
    public boolean mo1010q(int i, C0334i iVar) {
        return iVar.mo1163l();
    }

    /* renamed from: y */
    public boolean mo1804y() {
        return mo1794B() | mo1795C();
    }
}
