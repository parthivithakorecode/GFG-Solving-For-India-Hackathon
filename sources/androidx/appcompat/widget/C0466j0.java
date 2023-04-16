package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.graphics.drawable.C0650a;
import androidx.core.view.C0783e0;
import androidx.core.widget.C0877g;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p038f.C2582a;
import p052h.C2662c;

/* renamed from: androidx.appcompat.widget.j0 */
class C0466j0 extends ListView {

    /* renamed from: f */
    private final Rect f1479f = new Rect();

    /* renamed from: g */
    private int f1480g = 0;

    /* renamed from: h */
    private int f1481h = 0;

    /* renamed from: i */
    private int f1482i = 0;

    /* renamed from: j */
    private int f1483j = 0;

    /* renamed from: k */
    private int f1484k;

    /* renamed from: l */
    private Field f1485l;

    /* renamed from: m */
    private C0469c f1486m;

    /* renamed from: n */
    private boolean f1487n;

    /* renamed from: o */
    private boolean f1488o;

    /* renamed from: p */
    private boolean f1489p;

    /* renamed from: q */
    private C0783e0 f1490q;

    /* renamed from: r */
    private C0877g f1491r;

    /* renamed from: s */
    C0470d f1492s;

    /* renamed from: androidx.appcompat.widget.j0$a */
    static class C0467a {
        /* renamed from: a */
        static void m1931a(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$b */
    static class C0468b {

        /* renamed from: a */
        private static Method f1493a;

        /* renamed from: b */
        private static Method f1494b;

        /* renamed from: c */
        private static Method f1495c;

        /* renamed from: d */
        private static boolean f1496d = true;

        static {
            Class<AbsListView> cls = AbsListView.class;
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("positionSelector", new Class[]{cls2, View.class, Boolean.TYPE, cls3, cls3});
                f1493a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", new Class[]{cls2});
                f1494b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{cls2});
                f1495c = declaredMethod3;
                declaredMethod3.setAccessible(true);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: a */
        static boolean m1932a() {
            return f1496d;
        }

        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: b */
        static void m1933b(C0466j0 j0Var, int i, View view) {
            try {
                f1493a.invoke(j0Var, new Object[]{Integer.valueOf(i), view, Boolean.FALSE, -1, -1});
                f1494b.invoke(j0Var, new Object[]{Integer.valueOf(i)});
                f1495c.invoke(j0Var, new Object[]{Integer.valueOf(i)});
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$c */
    private static class C0469c extends C2662c {

        /* renamed from: g */
        private boolean f1497g = true;

        C0469c(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo2108c(boolean z) {
            this.f1497g = z;
        }

        public void draw(Canvas canvas) {
            if (this.f1497g) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f1497g) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1497g) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f1497g) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1497g) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$d */
    private class C0470d implements Runnable {
        C0470d() {
        }

        /* renamed from: a */
        public void mo2114a() {
            C0466j0 j0Var = C0466j0.this;
            j0Var.f1492s = null;
            j0Var.removeCallbacks(this);
        }

        /* renamed from: b */
        public void mo2115b() {
            C0466j0.this.post(this);
        }

        public void run() {
            C0466j0 j0Var = C0466j0.this;
            j0Var.f1492s = null;
            j0Var.drawableStateChanged();
        }
    }

    C0466j0(Context context, boolean z) {
        super(context, (AttributeSet) null, C2582a.dropDownListViewStyle);
        this.f1488o = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1485l = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m1920a() {
        this.f1489p = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1484k - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C0783e0 e0Var = this.f1490q;
        if (e0Var != null) {
            e0Var.mo2854c();
            this.f1490q = null;
        }
    }

    /* renamed from: b */
    private void m1921b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: c */
    private void m1922c(Canvas canvas) {
        Drawable selector;
        if (!this.f1479f.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1479f);
            selector.draw(canvas);
        }
    }

    /* renamed from: f */
    private void m1923f(int i, View view) {
        Rect rect = this.f1479f;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1480g;
        rect.top -= this.f1481h;
        rect.right += this.f1482i;
        rect.bottom += this.f1483j;
        try {
            boolean z = this.f1485l.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f1485l.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    private void m1924g(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        m1923f(i, view);
        if (z2) {
            Rect rect = this.f1479f;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0650a.m2693j(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: h */
    private void m1925h(int i, View view, float f, float f2) {
        m1924g(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0650a.m2693j(selector, f, f2);
        }
    }

    /* renamed from: i */
    private void m1926i(View view, int i, float f, float f2) {
        View childAt;
        this.f1489p = true;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            C0467a.m1931a(this, f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i3 = this.f1484k;
        if (!(i3 == -1 || (childAt = getChildAt(i3 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f1484k = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (i2 >= 21) {
            C0467a.m1931a(view, left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m1925h(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: j */
    private boolean m1927j() {
        return this.f1489p;
    }

    /* renamed from: k */
    private void m1928k() {
        Drawable selector = getSelector();
        if (selector != null && m1927j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0469c cVar = this.f1486m;
        if (cVar != null) {
            cVar.mo2108c(z);
        }
    }

    /* renamed from: d */
    public int mo2095d(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i6 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i6;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        View view = null;
        while (i7 < count) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            view.measure(i, i10 > 0 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i4) {
                return (i5 < 0 || i7 <= i5 || i9 <= 0 || i6 == i4) ? i4 : i9;
            }
            if (i5 >= 0 && i7 >= i5) {
                i9 = i6;
            }
            i7++;
        }
        return i6;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m1922c(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f1492s == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m1928k();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2098e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r9 = r1
            r3 = r2
            goto L_0x0046
        L_0x0011:
            r9 = r1
            r3 = r9
            goto L_0x0046
        L_0x0014:
            r3 = r2
            goto L_0x0017
        L_0x0016:
            r3 = r1
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = r2
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m1926i(r3, r5, r4, r9)
            if (r0 != r2) goto L_0x000e
            r7.m1921b(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.m1920a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            androidx.core.widget.g r9 = r7.f1491r
            if (r9 != 0) goto L_0x005a
            androidx.core.widget.g r9 = new androidx.core.widget.g
            r9.<init>(r7)
            r7.f1491r = r9
        L_0x005a:
            androidx.core.widget.g r9 = r7.f1491r
            r9.mo3068w(r2)
            androidx.core.widget.g r9 = r7.f1491r
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            androidx.core.widget.g r8 = r7.f1491r
            if (r8 == 0) goto L_0x006c
            r8.mo3068w(r1)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0466j0.mo2098e(android.view.MotionEvent, int):boolean");
    }

    public boolean hasFocus() {
        return this.f1488o || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f1488o || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f1488o || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f1488o && this.f1487n) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f1492s = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1492s == null) {
            C0470d dVar = new C0470d();
            this.f1492s = dVar;
            dVar.mo2115b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !C0468b.m1932a()) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        C0468b.m1933b(this, pointToPosition, childAt);
                    }
                }
                m1928k();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1484k = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C0470d dVar = this.f1492s;
        if (dVar != null) {
            dVar.mo2114a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f1487n = z;
    }

    public void setSelector(Drawable drawable) {
        C0469c cVar = drawable != null ? new C0469c(drawable) : null;
        this.f1486m = cVar;
        super.setSelector(cVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1480g = rect.left;
        this.f1481h = rect.top;
        this.f1482i = rect.right;
        this.f1483j = rect.bottom;
    }
}
