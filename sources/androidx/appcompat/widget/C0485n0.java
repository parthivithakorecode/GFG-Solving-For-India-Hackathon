package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0351p;
import androidx.core.view.C0833y;
import androidx.core.widget.C0880i;
import java.lang.reflect.Method;
import p038f.C2591j;

/* renamed from: androidx.appcompat.widget.n0 */
public class C0485n0 implements C0351p {

    /* renamed from: L */
    private static Method f1544L;

    /* renamed from: M */
    private static Method f1545M;

    /* renamed from: N */
    private static Method f1546N;

    /* renamed from: A */
    private AdapterView.OnItemSelectedListener f1547A;

    /* renamed from: B */
    final C0494i f1548B;

    /* renamed from: C */
    private final C0493h f1549C;

    /* renamed from: D */
    private final C0492g f1550D;

    /* renamed from: E */
    private final C0490e f1551E;

    /* renamed from: F */
    private Runnable f1552F;

    /* renamed from: G */
    final Handler f1553G;

    /* renamed from: H */
    private final Rect f1554H;

    /* renamed from: I */
    private Rect f1555I;

    /* renamed from: J */
    private boolean f1556J;

    /* renamed from: K */
    PopupWindow f1557K;

    /* renamed from: f */
    private Context f1558f;

    /* renamed from: g */
    private ListAdapter f1559g;

    /* renamed from: h */
    C0466j0 f1560h;

    /* renamed from: i */
    private int f1561i;

    /* renamed from: j */
    private int f1562j;

    /* renamed from: k */
    private int f1563k;

    /* renamed from: l */
    private int f1564l;

    /* renamed from: m */
    private int f1565m;

    /* renamed from: n */
    private boolean f1566n;

    /* renamed from: o */
    private boolean f1567o;

    /* renamed from: p */
    private boolean f1568p;

    /* renamed from: q */
    private int f1569q;

    /* renamed from: r */
    private boolean f1570r;

    /* renamed from: s */
    private boolean f1571s;

    /* renamed from: t */
    int f1572t;

    /* renamed from: u */
    private View f1573u;

    /* renamed from: v */
    private int f1574v;

    /* renamed from: w */
    private DataSetObserver f1575w;

    /* renamed from: x */
    private View f1576x;

    /* renamed from: y */
    private Drawable f1577y;

    /* renamed from: z */
    private AdapterView.OnItemClickListener f1578z;

    /* renamed from: androidx.appcompat.widget.n0$a */
    class C0486a implements Runnable {
        C0486a() {
        }

        public void run() {
            View t = C0485n0.this.mo2222t();
            if (t != null && t.getWindowToken() != null) {
                C0485n0.this.mo1016a();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.n0$b */
    class C0487b implements AdapterView.OnItemSelectedListener {
        C0487b() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C0466j0 j0Var;
            if (i != -1 && (j0Var = C0485n0.this.f1560h) != null) {
                j0Var.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.n0$c */
    static class C0488c {
        /* renamed from: a */
        static int m2039a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    /* renamed from: androidx.appcompat.widget.n0$d */
    static class C0489d {
        /* renamed from: a */
        static void m2040a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        /* renamed from: b */
        static void m2041b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.n0$e */
    private class C0490e implements Runnable {
        C0490e() {
        }

        public void run() {
            C0485n0.this.mo2220r();
        }
    }

    /* renamed from: androidx.appcompat.widget.n0$f */
    private class C0491f extends DataSetObserver {
        C0491f() {
        }

        public void onChanged() {
            if (C0485n0.this.mo1017c()) {
                C0485n0.this.mo1016a();
            }
        }

        public void onInvalidated() {
            C0485n0.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.n0$g */
    private class C0492g implements AbsListView.OnScrollListener {
        C0492g() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C0485n0.this.mo2224w() && C0485n0.this.f1557K.getContentView() != null) {
                C0485n0 n0Var = C0485n0.this;
                n0Var.f1553G.removeCallbacks(n0Var.f1548B);
                C0485n0.this.f1548B.run();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.n0$h */
    private class C0493h implements View.OnTouchListener {
        C0493h() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C0485n0.this.f1557K) != null && popupWindow.isShowing() && x >= 0 && x < C0485n0.this.f1557K.getWidth() && y >= 0 && y < C0485n0.this.f1557K.getHeight()) {
                C0485n0 n0Var = C0485n0.this;
                n0Var.f1553G.postDelayed(n0Var.f1548B, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                C0485n0 n0Var2 = C0485n0.this;
                n0Var2.f1553G.removeCallbacks(n0Var2.f1548B);
                return false;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.n0$i */
    private class C0494i implements Runnable {
        C0494i() {
        }

        public void run() {
            C0466j0 j0Var = C0485n0.this.f1560h;
            if (j0Var != null && C0833y.m3316A(j0Var) && C0485n0.this.f1560h.getCount() > C0485n0.this.f1560h.getChildCount()) {
                int childCount = C0485n0.this.f1560h.getChildCount();
                C0485n0 n0Var = C0485n0.this;
                if (childCount <= n0Var.f1572t) {
                    n0Var.f1557K.setInputMethodMode(2);
                    C0485n0.this.mo1016a();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                f1544L = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1546N = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                f1545M = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C0485n0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C0485n0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1561i = -2;
        this.f1562j = -2;
        this.f1565m = 1002;
        this.f1569q = 0;
        this.f1570r = false;
        this.f1571s = false;
        this.f1572t = Integer.MAX_VALUE;
        this.f1574v = 0;
        this.f1548B = new C0494i();
        this.f1549C = new C0493h();
        this.f1550D = new C0492g();
        this.f1551E = new C0490e();
        this.f1554H = new Rect();
        this.f1558f = context;
        this.f1553G = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2591j.f18865l1, i, i2);
        this.f1563k = obtainStyledAttributes.getDimensionPixelOffset(C2591j.f18870m1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C2591j.f18875n1, 0);
        this.f1564l = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1566n = true;
        }
        obtainStyledAttributes.recycle();
        C0516t tVar = new C0516t(context, attributeSet, i, i2);
        this.f1557K = tVar;
        tVar.setInputMethodMode(1);
    }

    /* renamed from: J */
    private void m2006J(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1544L;
            if (method != null) {
                try {
                    method.invoke(this.f1557K, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            C0489d.m2041b(this.f1557K, z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: androidx.appcompat.widget.j0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: androidx.appcompat.widget.j0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: androidx.appcompat.widget.j0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0150  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m2007q() {
        /*
            r12 = this;
            androidx.appcompat.widget.j0 r0 = r12.f1560h
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00be
            android.content.Context r0 = r12.f1558f
            androidx.appcompat.widget.n0$a r5 = new androidx.appcompat.widget.n0$a
            r5.<init>()
            r12.f1552F = r5
            boolean r5 = r12.f1556J
            r5 = r5 ^ r3
            androidx.appcompat.widget.j0 r5 = r12.mo2221s(r0, r5)
            r12.f1560h = r5
            android.graphics.drawable.Drawable r6 = r12.f1577y
            if (r6 == 0) goto L_0x0022
            r5.setSelector(r6)
        L_0x0022:
            androidx.appcompat.widget.j0 r5 = r12.f1560h
            android.widget.ListAdapter r6 = r12.f1559g
            r5.setAdapter(r6)
            androidx.appcompat.widget.j0 r5 = r12.f1560h
            android.widget.AdapterView$OnItemClickListener r6 = r12.f1578z
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.j0 r5 = r12.f1560h
            r5.setFocusable(r3)
            androidx.appcompat.widget.j0 r5 = r12.f1560h
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.j0 r5 = r12.f1560h
            androidx.appcompat.widget.n0$b r6 = new androidx.appcompat.widget.n0$b
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.j0 r5 = r12.f1560h
            androidx.appcompat.widget.n0$g r6 = r12.f1550D
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f1547A
            if (r5 == 0) goto L_0x0054
            androidx.appcompat.widget.j0 r6 = r12.f1560h
            r6.setOnItemSelectedListener(r5)
        L_0x0054:
            androidx.appcompat.widget.j0 r5 = r12.f1560h
            android.view.View r6 = r12.f1573u
            if (r6 == 0) goto L_0x00b7
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f1574v
            if (r8 == 0) goto L_0x008f
            if (r8 == r3) goto L_0x0088
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.f1574v
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x0095
        L_0x0088:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0095
        L_0x008f:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0095:
            int r0 = r12.f1562j
            if (r0 < 0) goto L_0x009b
            r5 = r1
            goto L_0x009d
        L_0x009b:
            r0 = r4
            r5 = r0
        L_0x009d:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00b8
        L_0x00b7:
            r0 = r4
        L_0x00b8:
            android.widget.PopupWindow r6 = r12.f1557K
            r6.setContentView(r5)
            goto L_0x00dc
        L_0x00be:
            android.widget.PopupWindow r0 = r12.f1557K
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f1573u
            if (r0 == 0) goto L_0x00db
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00dc
        L_0x00db:
            r0 = r4
        L_0x00dc:
            android.widget.PopupWindow r5 = r12.f1557K
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f8
            android.graphics.Rect r6 = r12.f1554H
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.f1554H
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f1566n
            if (r7 != 0) goto L_0x00fe
            int r6 = -r6
            r12.f1564l = r6
            goto L_0x00fe
        L_0x00f8:
            android.graphics.Rect r5 = r12.f1554H
            r5.setEmpty()
            r5 = r4
        L_0x00fe:
            android.widget.PopupWindow r6 = r12.f1557K
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0108
            goto L_0x0109
        L_0x0108:
            r3 = r4
        L_0x0109:
            android.view.View r4 = r12.mo2222t()
            int r6 = r12.f1564l
            int r3 = r12.m2008u(r4, r6, r3)
            boolean r4 = r12.f1570r
            if (r4 != 0) goto L_0x0161
            int r4 = r12.f1561i
            if (r4 != r2) goto L_0x011c
            goto L_0x0161
        L_0x011c:
            int r4 = r12.f1562j
            r6 = -2
            if (r4 == r6) goto L_0x012a
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x012a
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L_0x0142
        L_0x012a:
            android.content.Context r2 = r12.f1558f
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f1554H
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L_0x0142:
            r7 = r1
            androidx.appcompat.widget.j0 r6 = r12.f1560h
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.mo2095d(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x015f
            androidx.appcompat.widget.j0 r2 = r12.f1560h
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.j0 r3 = r12.f1560h
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x015f:
            int r1 = r1 + r0
            return r1
        L_0x0161:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0485n0.m2007q():int");
    }

    /* renamed from: u */
    private int m2008u(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT > 23) {
            return C0488c.m2039a(this.f1557K, view, i, z);
        }
        Method method = f1545M;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f1557K, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f1557K.getMaxAvailableHeight(view, i);
    }

    /* renamed from: y */
    private void m2009y() {
        View view = this.f1573u;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1573u);
            }
        }
    }

    /* renamed from: A */
    public void mo2202A(int i) {
        this.f1557K.setAnimationStyle(i);
    }

    /* renamed from: B */
    public void mo2203B(int i) {
        Drawable background = this.f1557K.getBackground();
        if (background != null) {
            background.getPadding(this.f1554H);
            Rect rect = this.f1554H;
            this.f1562j = rect.left + rect.right + i;
            return;
        }
        mo2213M(i);
    }

    /* renamed from: C */
    public void mo2204C(int i) {
        this.f1569q = i;
    }

    /* renamed from: D */
    public void mo2205D(Rect rect) {
        this.f1555I = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: E */
    public void mo2206E(int i) {
        this.f1557K.setInputMethodMode(i);
    }

    /* renamed from: F */
    public void mo2207F(boolean z) {
        this.f1556J = z;
        this.f1557K.setFocusable(z);
    }

    /* renamed from: G */
    public void mo2208G(PopupWindow.OnDismissListener onDismissListener) {
        this.f1557K.setOnDismissListener(onDismissListener);
    }

    /* renamed from: H */
    public void mo2209H(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1578z = onItemClickListener;
    }

    /* renamed from: I */
    public void mo2210I(boolean z) {
        this.f1568p = true;
        this.f1567o = z;
    }

    /* renamed from: K */
    public void mo2211K(int i) {
        this.f1574v = i;
    }

    /* renamed from: L */
    public void mo2212L(int i) {
        C0466j0 j0Var = this.f1560h;
        if (mo1017c() && j0Var != null) {
            j0Var.setListSelectionHidden(false);
            j0Var.setSelection(i);
            if (j0Var.getChoiceMode() != 0) {
                j0Var.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: M */
    public void mo2213M(int i) {
        this.f1562j = i;
    }

    /* renamed from: a */
    public void mo1016a() {
        int q = m2007q();
        boolean w = mo2224w();
        C0880i.m3630b(this.f1557K, this.f1565m);
        boolean z = true;
        if (!this.f1557K.isShowing()) {
            int i = this.f1562j;
            if (i == -1) {
                i = -1;
            } else if (i == -2) {
                i = mo2222t().getWidth();
            }
            int i2 = this.f1561i;
            if (i2 == -1) {
                q = -1;
            } else if (i2 != -2) {
                q = i2;
            }
            this.f1557K.setWidth(i);
            this.f1557K.setHeight(q);
            m2006J(true);
            this.f1557K.setOutsideTouchable(!this.f1571s && !this.f1570r);
            this.f1557K.setTouchInterceptor(this.f1549C);
            if (this.f1568p) {
                C0880i.m3629a(this.f1557K, this.f1567o);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = f1546N;
                if (method != null) {
                    try {
                        method.invoke(this.f1557K, new Object[]{this.f1555I});
                    } catch (Exception e) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                    }
                }
            } else {
                C0489d.m2040a(this.f1557K, this.f1555I);
            }
            C0880i.m3631c(this.f1557K, mo2222t(), this.f1563k, this.f1564l, this.f1569q);
            this.f1560h.setSelection(-1);
            if (!this.f1556J || this.f1560h.isInTouchMode()) {
                mo2220r();
            }
            if (!this.f1556J) {
                this.f1553G.post(this.f1551E);
            }
        } else if (C0833y.m3316A(mo2222t())) {
            int i3 = this.f1562j;
            if (i3 == -1) {
                i3 = -1;
            } else if (i3 == -2) {
                i3 = mo2222t().getWidth();
            }
            int i4 = this.f1561i;
            if (i4 == -1) {
                if (!w) {
                    q = -1;
                }
                if (w) {
                    this.f1557K.setWidth(this.f1562j == -1 ? -1 : 0);
                    this.f1557K.setHeight(0);
                } else {
                    this.f1557K.setWidth(this.f1562j == -1 ? -1 : 0);
                    this.f1557K.setHeight(-1);
                }
            } else if (i4 != -2) {
                q = i4;
            }
            PopupWindow popupWindow = this.f1557K;
            if (this.f1571s || this.f1570r) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f1557K.update(mo2222t(), this.f1563k, this.f1564l, i3 < 0 ? -1 : i3, q < 0 ? -1 : q);
        }
    }

    /* renamed from: b */
    public int mo2214b() {
        return this.f1563k;
    }

    /* renamed from: c */
    public boolean mo1017c() {
        return this.f1557K.isShowing();
    }

    public void dismiss() {
        this.f1557K.dismiss();
        m2009y();
        this.f1557K.setContentView((View) null);
        this.f1560h = null;
        this.f1553G.removeCallbacks(this.f1548B);
    }

    /* renamed from: f */
    public Drawable mo2215f() {
        return this.f1557K.getBackground();
    }

    /* renamed from: g */
    public ListView mo1019g() {
        return this.f1560h;
    }

    /* renamed from: i */
    public void mo2216i(Drawable drawable) {
        this.f1557K.setBackgroundDrawable(drawable);
    }

    /* renamed from: j */
    public void mo2217j(int i) {
        this.f1564l = i;
        this.f1566n = true;
    }

    /* renamed from: l */
    public void mo2218l(int i) {
        this.f1563k = i;
    }

    /* renamed from: n */
    public int mo2219n() {
        if (!this.f1566n) {
            return 0;
        }
        return this.f1564l;
    }

    /* renamed from: p */
    public void mo1741p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1575w;
        if (dataSetObserver == null) {
            this.f1575w = new C0491f();
        } else {
            ListAdapter listAdapter2 = this.f1559g;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1559g = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1575w);
        }
        C0466j0 j0Var = this.f1560h;
        if (j0Var != null) {
            j0Var.setAdapter(this.f1559g);
        }
    }

    /* renamed from: r */
    public void mo2220r() {
        C0466j0 j0Var = this.f1560h;
        if (j0Var != null) {
            j0Var.setListSelectionHidden(true);
            j0Var.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C0466j0 mo2221s(Context context, boolean z) {
        return new C0466j0(context, z);
    }

    /* renamed from: t */
    public View mo2222t() {
        return this.f1576x;
    }

    /* renamed from: v */
    public int mo2223v() {
        return this.f1562j;
    }

    /* renamed from: w */
    public boolean mo2224w() {
        return this.f1557K.getInputMethodMode() == 2;
    }

    /* renamed from: x */
    public boolean mo2225x() {
        return this.f1556J;
    }

    /* renamed from: z */
    public void mo2226z(View view) {
        this.f1576x = view;
    }
}
