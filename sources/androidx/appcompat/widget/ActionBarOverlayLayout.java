package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.C0346m;
import androidx.core.view.C0796i0;
import androidx.core.view.C0823o;
import androidx.core.view.C0824p;
import androidx.core.view.C0825q;
import androidx.core.view.C0826r;
import androidx.core.view.C0833y;
import p038f.C2582a;
import p038f.C2587f;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements C0457g0, C0825q, C0823o, C0824p {

    /* renamed from: K */
    static final int[] f1077K = {C2582a.actionBarSize, 16842841};

    /* renamed from: A */
    private C0796i0 f1078A;

    /* renamed from: B */
    private C0796i0 f1079B;

    /* renamed from: C */
    private C0796i0 f1080C;

    /* renamed from: D */
    private C0362d f1081D;

    /* renamed from: E */
    private OverScroller f1082E;

    /* renamed from: F */
    ViewPropertyAnimator f1083F;

    /* renamed from: G */
    final AnimatorListenerAdapter f1084G;

    /* renamed from: H */
    private final Runnable f1085H;

    /* renamed from: I */
    private final Runnable f1086I;

    /* renamed from: J */
    private final C0826r f1087J;

    /* renamed from: f */
    private int f1088f;

    /* renamed from: g */
    private int f1089g = 0;

    /* renamed from: h */
    private ContentFrameLayout f1090h;

    /* renamed from: i */
    ActionBarContainer f1091i;

    /* renamed from: j */
    private C0460h0 f1092j;

    /* renamed from: k */
    private Drawable f1093k;

    /* renamed from: l */
    private boolean f1094l;

    /* renamed from: m */
    private boolean f1095m;

    /* renamed from: n */
    private boolean f1096n;

    /* renamed from: o */
    private boolean f1097o;

    /* renamed from: p */
    boolean f1098p;

    /* renamed from: q */
    private int f1099q;

    /* renamed from: r */
    private int f1100r;

    /* renamed from: s */
    private final Rect f1101s = new Rect();

    /* renamed from: t */
    private final Rect f1102t = new Rect();

    /* renamed from: u */
    private final Rect f1103u = new Rect();

    /* renamed from: v */
    private final Rect f1104v = new Rect();

    /* renamed from: w */
    private final Rect f1105w = new Rect();

    /* renamed from: x */
    private final Rect f1106x = new Rect();

    /* renamed from: y */
    private final Rect f1107y = new Rect();

    /* renamed from: z */
    private C0796i0 f1108z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    class C0359a extends AnimatorListenerAdapter {
        C0359a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1083F = null;
            actionBarOverlayLayout.f1098p = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1083F = null;
            actionBarOverlayLayout.f1098p = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    class C0360b implements Runnable {
        C0360b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo1423u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1083F = actionBarOverlayLayout.f1091i.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f1084G);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    class C0361c implements Runnable {
        C0361c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo1423u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1083F = actionBarOverlayLayout.f1091i.animate().translationY((float) (-ActionBarOverlayLayout.this.f1091i.getHeight())).setListener(ActionBarOverlayLayout.this.f1084G);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface C0362d {
        /* renamed from: a */
        void mo800a();

        /* renamed from: b */
        void mo801b();

        /* renamed from: c */
        void mo802c();

        /* renamed from: d */
        void mo803d(boolean z);

        /* renamed from: e */
        void mo804e();

        void onWindowVisibilityChanged(int i);
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0363e extends ViewGroup.MarginLayoutParams {
        public C0363e(int i, int i2) {
            super(i, i2);
        }

        public C0363e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0363e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0796i0 i0Var = C0796i0.f2217b;
        this.f1108z = i0Var;
        this.f1078A = i0Var;
        this.f1079B = i0Var;
        this.f1080C = i0Var;
        this.f1084G = new C0359a();
        this.f1085H = new C0360b();
        this.f1086I = new C0361c();
        m1428v(context);
        this.f1087J = new C0826r(this);
    }

    /* renamed from: A */
    private void m1423A() {
        mo1423u();
        this.f1085H.run();
    }

    /* renamed from: B */
    private boolean m1424B(float f) {
        this.f1082E.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f1082E.getFinalY() > this.f1091i.getHeight();
    }

    /* renamed from: p */
    private void m1425p() {
        mo1423u();
        this.f1086I.run();
    }

    /* renamed from: q */
    private boolean m1426q(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        C0363e eVar = (C0363e) view.getLayoutParams();
        if (!z || eVar.leftMargin == (i4 = rect.left)) {
            z5 = false;
        } else {
            eVar.leftMargin = i4;
            z5 = true;
        }
        if (z2 && eVar.topMargin != (i3 = rect.top)) {
            eVar.topMargin = i3;
            z5 = true;
        }
        if (z4 && eVar.rightMargin != (i2 = rect.right)) {
            eVar.rightMargin = i2;
            z5 = true;
        }
        if (!z3 || eVar.bottomMargin == (i = rect.bottom)) {
            return z5;
        }
        eVar.bottomMargin = i;
        return true;
    }

    /* renamed from: t */
    private C0460h0 m1427t(View view) {
        if (view instanceof C0460h0) {
            return (C0460h0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: v */
    private void m1428v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1077K);
        boolean z = false;
        this.f1088f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1093k = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f1094l = z;
        this.f1082E = new OverScroller(context);
    }

    /* renamed from: x */
    private void m1429x() {
        mo1423u();
        postDelayed(this.f1086I, 600);
    }

    /* renamed from: y */
    private void m1430y() {
        mo1423u();
        postDelayed(this.f1085H, 600);
    }

    /* renamed from: a */
    public void mo1370a(Menu menu, C0346m.C0347a aVar) {
        mo1425z();
        this.f1092j.mo1838a(menu, aVar);
    }

    /* renamed from: b */
    public boolean mo1371b() {
        mo1425z();
        return this.f1092j.mo1839b();
    }

    /* renamed from: c */
    public void mo1372c() {
        mo1425z();
        this.f1092j.mo1840c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0363e;
    }

    /* renamed from: d */
    public boolean mo1374d() {
        mo1425z();
        return this.f1092j.mo1842d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1093k != null && !this.f1094l) {
            int bottom = this.f1091i.getVisibility() == 0 ? (int) (((float) this.f1091i.getBottom()) + this.f1091i.getTranslationY() + 0.5f) : 0;
            this.f1093k.setBounds(0, bottom, getWidth(), this.f1093k.getIntrinsicHeight() + bottom);
            this.f1093k.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo1376e() {
        mo1425z();
        return this.f1092j.mo1843e();
    }

    /* renamed from: f */
    public boolean mo1377f() {
        mo1425z();
        return this.f1092j.mo1844f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        mo1425z();
        boolean q = m1426q(this.f1091i, rect, true, true, false, true);
        this.f1104v.set(rect);
        C0471j1.m1937a(this, this.f1104v, this.f1101s);
        if (!this.f1105w.equals(this.f1104v)) {
            this.f1105w.set(this.f1104v);
            q = true;
        }
        if (!this.f1102t.equals(this.f1101s)) {
            this.f1102t.set(this.f1101s);
            q = true;
        }
        if (q) {
            requestLayout();
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo1379g() {
        mo1425z();
        return this.f1092j.mo1845g();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0363e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1091i;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f1087J.mo2948a();
    }

    public CharSequence getTitle() {
        mo1425z();
        return this.f1092j.getTitle();
    }

    /* renamed from: h */
    public void mo1386h(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* renamed from: i */
    public void mo1387i(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* renamed from: j */
    public void mo1388j(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    /* renamed from: k */
    public void mo1389k(int i) {
        mo1425z();
        if (i == 2) {
            this.f1092j.mo1858r();
        } else if (i == 5) {
            this.f1092j.mo1859s();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: l */
    public void mo1390l() {
        mo1425z();
        this.f1092j.mo1848h();
    }

    /* renamed from: m */
    public void mo1391m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo1392n(view, i, i2, i3, i4, i5);
    }

    /* renamed from: n */
    public void mo1392n(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: o */
    public boolean mo1393o(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        mo1425z();
        C0796i0 v = C0796i0.m3157v(windowInsets, this);
        boolean q = m1426q(this.f1091i, new Rect(v.mo2880i(), v.mo2882k(), v.mo2881j(), v.mo2878h()), true, true, false, true);
        C0833y.m3348d(this, v, this.f1101s);
        Rect rect = this.f1101s;
        C0796i0 l = v.mo2883l(rect.left, rect.top, rect.right, rect.bottom);
        this.f1108z = l;
        boolean z = true;
        if (!this.f1078A.equals(l)) {
            this.f1078A = this.f1108z;
            q = true;
        }
        if (!this.f1102t.equals(this.f1101s)) {
            this.f1102t.set(this.f1101s);
        } else {
            z = q;
        }
        if (z) {
            requestLayout();
        }
        return v.mo2870a().mo2872c().mo2871b().mo2890t();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1428v(getContext());
        C0833y.m3327L(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1423u();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0363e eVar = (C0363e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = eVar.leftMargin + paddingLeft;
                int i7 = eVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0105 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r13, int r14) {
        /*
            r12 = this;
            r12.mo1425z()
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f1091i
            r3 = 0
            r5 = 0
            r0 = r12
            r2 = r13
            r4 = r14
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionBarContainer r0 = r12.f1091i
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0363e) r0
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f1091i
            int r1 = r1.getMeasuredWidth()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            r2 = 0
            int r7 = java.lang.Math.max(r2, r1)
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f1091i
            int r1 = r1.getMeasuredHeight()
            int r3 = r0.topMargin
            int r1 = r1 + r3
            int r0 = r0.bottomMargin
            int r1 = r1 + r0
            int r8 = java.lang.Math.max(r2, r1)
            androidx.appcompat.widget.ActionBarContainer r0 = r12.f1091i
            int r0 = r0.getMeasuredState()
            int r9 = android.view.View.combineMeasuredStates(r2, r0)
            int r0 = androidx.core.view.C0833y.m3368x(r12)
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x004a
            r0 = 1
            goto L_0x004b
        L_0x004a:
            r0 = r2
        L_0x004b:
            if (r0 == 0) goto L_0x005f
            int r1 = r12.f1088f
            boolean r3 = r12.f1096n
            if (r3 == 0) goto L_0x0071
            androidx.appcompat.widget.ActionBarContainer r3 = r12.f1091i
            android.view.View r3 = r3.getTabContainer()
            if (r3 == 0) goto L_0x0071
            int r3 = r12.f1088f
            int r1 = r1 + r3
            goto L_0x0071
        L_0x005f:
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f1091i
            int r1 = r1.getVisibility()
            r3 = 8
            if (r1 == r3) goto L_0x0070
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f1091i
            int r1 = r1.getMeasuredHeight()
            goto L_0x0071
        L_0x0070:
            r1 = r2
        L_0x0071:
            android.graphics.Rect r3 = r12.f1103u
            android.graphics.Rect r4 = r12.f1101s
            r3.set(r4)
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 21
            if (r10 < r11) goto L_0x0083
            androidx.core.view.i0 r3 = r12.f1108z
            r12.f1079B = r3
            goto L_0x008a
        L_0x0083:
            android.graphics.Rect r3 = r12.f1106x
            android.graphics.Rect r4 = r12.f1104v
            r3.set(r4)
        L_0x008a:
            boolean r3 = r12.f1095m
            if (r3 != 0) goto L_0x00a5
            if (r0 != 0) goto L_0x00a5
            android.graphics.Rect r0 = r12.f1103u
            int r3 = r0.top
            int r3 = r3 + r1
            r0.top = r3
            int r3 = r0.bottom
            int r3 = r3 + r2
            r0.bottom = r3
            if (r10 < r11) goto L_0x00e3
            androidx.core.view.i0 r0 = r12.f1079B
            androidx.core.view.i0 r0 = r0.mo2883l(r2, r1, r2, r2)
            goto L_0x00d4
        L_0x00a5:
            if (r10 < r11) goto L_0x00d7
            androidx.core.view.i0 r0 = r12.f1079B
            int r0 = r0.mo2880i()
            androidx.core.view.i0 r3 = r12.f1079B
            int r3 = r3.mo2882k()
            int r3 = r3 + r1
            androidx.core.view.i0 r1 = r12.f1079B
            int r1 = r1.mo2881j()
            androidx.core.view.i0 r4 = r12.f1079B
            int r4 = r4.mo2878h()
            int r4 = r4 + r2
            androidx.core.graphics.b r0 = androidx.core.graphics.C0639b.m2620b(r0, r3, r1, r4)
            androidx.core.view.i0$b r1 = new androidx.core.view.i0$b
            androidx.core.view.i0 r2 = r12.f1079B
            r1.<init>(r2)
            androidx.core.view.i0$b r0 = r1.mo2893c(r0)
            androidx.core.view.i0 r0 = r0.mo2891a()
        L_0x00d4:
            r12.f1079B = r0
            goto L_0x00e3
        L_0x00d7:
            android.graphics.Rect r0 = r12.f1106x
            int r3 = r0.top
            int r3 = r3 + r1
            r0.top = r3
            int r1 = r0.bottom
            int r1 = r1 + r2
            r0.bottom = r1
        L_0x00e3:
            androidx.appcompat.widget.ContentFrameLayout r1 = r12.f1090h
            android.graphics.Rect r2 = r12.f1103u
            r3 = 1
            r4 = 1
            r5 = 1
            r6 = 1
            r0 = r12
            r0.m1426q(r1, r2, r3, r4, r5, r6)
            if (r10 < r11) goto L_0x0105
            androidx.core.view.i0 r0 = r12.f1080C
            androidx.core.view.i0 r1 = r12.f1079B
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0105
            androidx.core.view.i0 r0 = r12.f1079B
            r12.f1080C = r0
            androidx.appcompat.widget.ContentFrameLayout r1 = r12.f1090h
            androidx.core.view.C0833y.m3349e(r1, r0)
            goto L_0x011f
        L_0x0105:
            if (r10 >= r11) goto L_0x011f
            android.graphics.Rect r0 = r12.f1107y
            android.graphics.Rect r1 = r12.f1106x
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x011f
            android.graphics.Rect r0 = r12.f1107y
            android.graphics.Rect r1 = r12.f1106x
            r0.set(r1)
            androidx.appcompat.widget.ContentFrameLayout r0 = r12.f1090h
            android.graphics.Rect r1 = r12.f1106x
            r0.mo1468a(r1)
        L_0x011f:
            androidx.appcompat.widget.ContentFrameLayout r1 = r12.f1090h
            r3 = 0
            r5 = 0
            r0 = r12
            r2 = r13
            r4 = r14
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ContentFrameLayout r0 = r12.f1090h
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0363e) r0
            androidx.appcompat.widget.ContentFrameLayout r1 = r12.f1090h
            int r1 = r1.getMeasuredWidth()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r7, r1)
            androidx.appcompat.widget.ContentFrameLayout r2 = r12.f1090h
            int r2 = r2.getMeasuredHeight()
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r0 = r0.bottomMargin
            int r2 = r2 + r0
            int r0 = java.lang.Math.max(r8, r2)
            androidx.appcompat.widget.ContentFrameLayout r2 = r12.f1090h
            int r2 = r2.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r9, r2)
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r3 = r3 + r4
            int r1 = r1 + r3
            int r3 = r12.getPaddingTop()
            int r4 = r12.getPaddingBottom()
            int r3 = r3 + r4
            int r0 = r0 + r3
            int r3 = r12.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r3)
            int r3 = r12.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r3)
            int r1 = android.view.View.resolveSizeAndState(r1, r13, r2)
            int r2 = r2 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r14, r2)
            r12.setMeasuredDimension(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f1097o || !z) {
            return false;
        }
        if (m1424B(f2)) {
            m1425p();
        } else {
            m1423A();
        }
        this.f1098p = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f1099q + i2;
        this.f1099q = i5;
        setActionBarHideOffset(i5);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1087J.mo2949b(view, view2, i);
        this.f1099q = getActionBarHideOffset();
        mo1423u();
        C0362d dVar = this.f1081D;
        if (dVar != null) {
            dVar.mo801b();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1091i.getVisibility() != 0) {
            return false;
        }
        return this.f1097o;
    }

    public void onStopNestedScroll(View view) {
        if (this.f1097o && !this.f1098p) {
            if (this.f1099q <= this.f1091i.getHeight()) {
                m1430y();
            } else {
                m1429x();
            }
        }
        C0362d dVar = this.f1081D;
        if (dVar != null) {
            dVar.mo802c();
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        mo1425z();
        int i2 = this.f1100r ^ i;
        this.f1100r = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        C0362d dVar = this.f1081D;
        if (dVar != null) {
            dVar.mo803d(!z);
            if (z2 || !z) {
                this.f1081D.mo800a();
            } else {
                this.f1081D.mo804e();
            }
        }
        if ((i2 & 256) != 0 && this.f1081D != null) {
            C0833y.m3327L(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1089g = i;
        C0362d dVar = this.f1081D;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C0363e generateDefaultLayoutParams() {
        return new C0363e(-1, -1);
    }

    /* renamed from: s */
    public C0363e generateLayoutParams(AttributeSet attributeSet) {
        return new C0363e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i) {
        mo1423u();
        this.f1091i.setTranslationY((float) (-Math.max(0, Math.min(i, this.f1091i.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0362d dVar) {
        this.f1081D = dVar;
        if (getWindowToken() != null) {
            this.f1081D.onWindowVisibilityChanged(this.f1089g);
            int i = this.f1100r;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C0833y.m3327L(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1096n = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f1097o) {
            this.f1097o = z;
            if (!z) {
                mo1423u();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo1425z();
        this.f1092j.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        mo1425z();
        this.f1092j.setIcon(drawable);
    }

    public void setLogo(int i) {
        mo1425z();
        this.f1092j.mo1855o(i);
    }

    public void setOverlayMode(boolean z) {
        this.f1095m = z;
        this.f1094l = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        mo1425z();
        this.f1092j.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo1425z();
        this.f1092j.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo1423u() {
        removeCallbacks(this.f1085H);
        removeCallbacks(this.f1086I);
        ViewPropertyAnimator viewPropertyAnimator = this.f1083F;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: w */
    public boolean mo1424w() {
        return this.f1095m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo1425z() {
        if (this.f1090h == null) {
            this.f1090h = (ContentFrameLayout) findViewById(C2587f.action_bar_activity_content);
            this.f1091i = (ActionBarContainer) findViewById(C2587f.action_bar_container);
            this.f1092j = m1427t(findViewById(C2587f.action_bar));
        }
    }
}
