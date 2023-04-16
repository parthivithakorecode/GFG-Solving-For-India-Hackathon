package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.C0744a;
import androidx.core.view.C0821m;
import androidx.core.view.C0822n;
import androidx.core.view.C0824p;
import androidx.core.view.C0826r;
import androidx.core.view.C0833y;
import androidx.core.view.accessibility.C0750b;
import androidx.core.view.accessibility.C0753d;
import java.util.ArrayList;
import p109p.C3875a;

public class NestedScrollView extends FrameLayout implements C0824p, C0821m {

    /* renamed from: F */
    private static final C0856a f2292F = new C0856a();

    /* renamed from: G */
    private static final int[] f2293G = {16843130};

    /* renamed from: A */
    private C0859d f2294A;

    /* renamed from: B */
    private final C0826r f2295B;

    /* renamed from: C */
    private final C0822n f2296C;

    /* renamed from: D */
    private float f2297D;

    /* renamed from: E */
    private C0858c f2298E;

    /* renamed from: f */
    private long f2299f;

    /* renamed from: g */
    private final Rect f2300g;

    /* renamed from: h */
    private OverScroller f2301h;

    /* renamed from: i */
    public EdgeEffect f2302i;

    /* renamed from: j */
    public EdgeEffect f2303j;

    /* renamed from: k */
    private int f2304k;

    /* renamed from: l */
    private boolean f2305l;

    /* renamed from: m */
    private boolean f2306m;

    /* renamed from: n */
    private View f2307n;

    /* renamed from: o */
    private boolean f2308o;

    /* renamed from: p */
    private VelocityTracker f2309p;

    /* renamed from: q */
    private boolean f2310q;

    /* renamed from: r */
    private boolean f2311r;

    /* renamed from: s */
    private int f2312s;

    /* renamed from: t */
    private int f2313t;

    /* renamed from: u */
    private int f2314u;

    /* renamed from: v */
    private int f2315v;

    /* renamed from: w */
    private final int[] f2316w;

    /* renamed from: x */
    private final int[] f2317x;

    /* renamed from: y */
    private int f2318y;

    /* renamed from: z */
    private int f2319z;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    static class C0856a extends C0744a {
        C0856a() {
        }

        /* renamed from: f */
        public void mo2766f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2766f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0753d.m3026a(accessibilityEvent, nestedScrollView.getScrollX());
            C0753d.m3027b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        /* renamed from: g */
        public void mo2767g(View view, C0750b bVar) {
            int scrollRange;
            super.mo2767g(view, bVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            bVar.mo2789I(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                bVar.mo2793M(true);
                if (nestedScrollView.getScrollY() > 0) {
                    bVar.mo2796a(C0750b.C0751a.f2164r);
                    bVar.mo2796a(C0750b.C0751a.f2136C);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    bVar.mo2796a(C0750b.C0751a.f2163q);
                    bVar.mo2796a(C0750b.C0751a.f2138E);
                }
            }
        }

        /* renamed from: j */
        public boolean mo2770j(View view, int i, Bundle bundle) {
            if (super.mo2770j(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.mo2990Q(0, max, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.mo2990Q(0, min, true);
            return true;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    static class C0857b {
        /* renamed from: a */
        static boolean m3553a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    public interface C0858c {
        /* renamed from: a */
        void mo580a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* renamed from: androidx.core.widget.NestedScrollView$d */
    static class C0859d extends View.BaseSavedState {
        public static final Parcelable.Creator<C0859d> CREATOR = new C0860a();

        /* renamed from: f */
        public int f2320f;

        /* renamed from: androidx.core.widget.NestedScrollView$d$a */
        class C0860a implements Parcelable.Creator<C0859d> {
            C0860a() {
            }

            /* renamed from: a */
            public C0859d createFromParcel(Parcel parcel) {
                return new C0859d(parcel);
            }

            /* renamed from: b */
            public C0859d[] newArray(int i) {
                return new C0859d[i];
            }
        }

        C0859d(Parcel parcel) {
            super(parcel);
            this.f2320f = parcel.readInt();
        }

        C0859d(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2320f + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2320f);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3875a.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2300g = new Rect();
        this.f2305l = true;
        this.f2306m = false;
        this.f2307n = null;
        this.f2308o = false;
        this.f2311r = true;
        this.f2315v = -1;
        this.f2316w = new int[2];
        this.f2317x = new int[2];
        this.f2302i = C0872e.m3607a(context, attributeSet);
        this.f2303j = C0872e.m3607a(context, attributeSet);
        m3527y();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2293G, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2295B = new C0826r(this);
        this.f2296C = new C0822n(this);
        setNestedScrollingEnabled(true);
        C0833y.m3330O(this, f2292F);
    }

    /* renamed from: A */
    private boolean m3504A(View view) {
        return !m3506C(view, 0, getHeight());
    }

    /* renamed from: B */
    private static boolean m3505B(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m3505B((View) parent, view2);
    }

    /* renamed from: C */
    private boolean m3506C(View view, int i, int i2) {
        view.getDrawingRect(this.f2300g);
        offsetDescendantRectToMyCoords(view, this.f2300g);
        return this.f2300g.bottom + i >= getScrollY() && this.f2300g.top - i <= getScrollY() + i2;
    }

    /* renamed from: D */
    private void m3507D(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2296C.mo2941d(0, scrollY2, 0, i - scrollY2, (int[]) null, i2, iArr);
    }

    /* renamed from: E */
    private void m3508E(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2315v) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2304k = (int) motionEvent.getY(i);
            this.f2315v = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f2309p;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: H */
    private void m3509H() {
        VelocityTracker velocityTracker = this.f2309p;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2309p = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m3510I(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f2302i
            float r0 = androidx.core.widget.C0872e.m3608b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            android.widget.EdgeEffect r0 = r3.f2302i
            float r4 = -r4
            float r4 = androidx.core.widget.C0872e.m3610d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f2302i
            float r5 = androidx.core.widget.C0872e.m3608b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f2302i
        L_0x002c:
            r5.onRelease()
        L_0x002f:
            r1 = r4
            goto L_0x0051
        L_0x0031:
            android.widget.EdgeEffect r0 = r3.f2303j
            float r0 = androidx.core.widget.C0872e.m3608b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0051
            android.widget.EdgeEffect r0 = r3.f2303j
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.C0872e.m3610d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f2303j
            float r5 = androidx.core.widget.C0872e.m3608b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f2303j
            goto L_0x002c
        L_0x0051:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L_0x0060
            r3.invalidate()
        L_0x0060:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m3510I(int, float):int");
    }

    /* renamed from: J */
    private void m3511J(boolean z) {
        if (z) {
            mo2991R(2, 1);
        } else {
            mo2992T(1);
        }
        this.f2319z = getScrollY();
        C0833y.m3324I(this);
    }

    /* renamed from: K */
    private boolean m3512K(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View s = m3524s(z2, i2, i3);
        if (s == null) {
            s = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m3521l(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (s != findFocus()) {
            s.requestFocus(i);
        }
        return z;
    }

    /* renamed from: L */
    private void m3513L(View view) {
        view.getDrawingRect(this.f2300g);
        offsetDescendantRectToMyCoords(view, this.f2300g);
        int f = mo3011f(this.f2300g);
        if (f != 0) {
            scrollBy(0, f);
        }
    }

    /* renamed from: M */
    private boolean m3514M(Rect rect, boolean z) {
        int f = mo3011f(rect);
        boolean z2 = f != 0;
        if (z2) {
            if (z) {
                scrollBy(0, f);
            } else {
                mo2988N(0, f);
            }
        }
        return z2;
    }

    /* renamed from: O */
    private void m3515O(int i, int i2, int i3, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f2299f > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f2301h;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
                m3511J(z);
            } else {
                if (!this.f2301h.isFinished()) {
                    m3517a();
                }
                scrollBy(i, i2);
            }
            this.f2299f = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: S */
    private boolean m3516S(MotionEvent motionEvent) {
        boolean z;
        if (C0872e.m3608b(this.f2302i) != 0.0f) {
            C0872e.m3610d(this.f2302i, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z = true;
        } else {
            z = false;
        }
        if (C0872e.m3608b(this.f2303j) == 0.0f) {
            return z;
        }
        C0872e.m3610d(this.f2303j, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    /* renamed from: a */
    private void m3517a() {
        this.f2301h.abortAnimation();
        mo2992T(1);
    }

    /* renamed from: c */
    private boolean m3518c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    /* renamed from: d */
    private boolean m3519d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: e */
    private static int m3520e(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2297D == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f2297D = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f2297D;
    }

    /* renamed from: l */
    private void m3521l(int i) {
        if (i == 0) {
            return;
        }
        if (this.f2311r) {
            mo2988N(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    /* renamed from: p */
    private boolean m3522p(int i) {
        EdgeEffect edgeEffect;
        if (C0872e.m3608b(this.f2302i) != 0.0f) {
            edgeEffect = this.f2302i;
        } else if (C0872e.m3608b(this.f2303j) == 0.0f) {
            return false;
        } else {
            edgeEffect = this.f2303j;
            i = -i;
        }
        edgeEffect.onAbsorb(i);
        return true;
    }

    /* renamed from: q */
    private void m3523q() {
        this.f2308o = false;
        m3509H();
        mo2992T(0);
        this.f2302i.onRelease();
        this.f2303j.onRelease();
    }

    /* renamed from: s */
    private View m3524s(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: w */
    private boolean m3525w(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    /* renamed from: x */
    private void m3526x() {
        VelocityTracker velocityTracker = this.f2309p;
        if (velocityTracker == null) {
            this.f2309p = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: y */
    private void m3527y() {
        this.f2301h = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2312s = viewConfiguration.getScaledTouchSlop();
        this.f2313t = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2314u = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: z */
    private void m3528z() {
        if (this.f2309p == null) {
            this.f2309p = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean mo2986F(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        int overScrollMode = getOverScrollMode();
        boolean z4 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z5 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        int i9 = i3 + i;
        int i10 = !z6 ? 0 : i7;
        int i11 = i4 + i2;
        int i12 = !z7 ? 0 : i8;
        int i13 = -i10;
        int i14 = i10 + i5;
        int i15 = -i12;
        int i16 = i12 + i6;
        if (i9 > i14) {
            i9 = i14;
            z2 = true;
        } else if (i9 < i13) {
            z2 = true;
            i9 = i13;
        } else {
            z2 = false;
        }
        if (i11 > i16) {
            i11 = i16;
            z3 = true;
        } else if (i11 < i15) {
            z3 = true;
            i11 = i15;
        } else {
            z3 = false;
        }
        if (z3 && !mo3049v(1)) {
            this.f2301h.springBack(i9, i11, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i9, i11, z2, z3);
        return z2 || z3;
    }

    /* renamed from: G */
    public boolean mo2987G(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f2300g.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f2300g;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f2300g.top = getScrollY() - height;
            Rect rect2 = this.f2300g;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f2300g;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return m3512K(i, i2, i3);
    }

    /* renamed from: N */
    public final void mo2988N(int i, int i2) {
        m3515O(i, i2, 250, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo2989P(int i, int i2, int i3, boolean z) {
        m3515O(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo2990Q(int i, int i2, boolean z) {
        mo2989P(i, i2, 250, z);
    }

    /* renamed from: R */
    public boolean mo2991R(int i, int i2) {
        return this.f2296C.mo2946m(i, i2);
    }

    /* renamed from: T */
    public void mo2992T(int i) {
        this.f2296C.mo2947n(i);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public boolean mo2997b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m3506C(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m3521l(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f2300g);
            offsetDescendantRectToMyCoords(findNextFocus, this.f2300g);
            m3521l(mo3011f(this.f2300g));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !m3504A(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (!this.f2301h.isFinished()) {
            this.f2301h.computeScrollOffset();
            int currY = this.f2301h.getCurrY();
            int i = currY - this.f2319z;
            this.f2319z = currY;
            int[] iArr = this.f2317x;
            boolean z = false;
            iArr[1] = 0;
            mo3012g(0, i, iArr, (int[]) null, 1);
            int i2 = i - this.f2317x[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                mo2986F(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.f2317x;
                iArr2[1] = 0;
                mo3020k(0, scrollY2, 0, i3, this.f2316w, 1, iArr2);
                i2 = i3 - this.f2317x[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    if (i2 < 0) {
                        if (this.f2302i.isFinished()) {
                            edgeEffect = this.f2302i;
                        }
                    } else if (this.f2303j.isFinished()) {
                        edgeEffect = this.f2303j;
                    }
                    edgeEffect.onAbsorb((int) this.f2301h.getCurrVelocity());
                }
                m3517a();
            }
            if (!this.f2301h.isFinished()) {
                C0833y.m3324I(this);
            } else {
                mo2992T(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo3035r(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f2296C.mo2938a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f2296C.mo2939b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return mo3012g(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f2296C.mo2942e(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i2 = 0;
        if (!this.f2302i.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 21 || C0857b.m3553a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i = getPaddingLeft() + 0;
            } else {
                i = 0;
            }
            if (i3 >= 21 && C0857b.m3553a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate((float) i, (float) min);
            this.f2302i.setSize(width, height);
            if (this.f2302i.draw(canvas)) {
                C0833y.m3324I(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f2303j.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 < 21 || C0857b.m3553a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i2 = 0 + getPaddingLeft();
            }
            if (i4 >= 21 && C0857b.m3553a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i2 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            this.f2303j.setSize(width2, height2);
            if (this.f2303j.draw(canvas)) {
                C0833y.m3324I(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo3011f(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        } else if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    /* renamed from: g */
    public boolean mo3012g(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f2296C.mo2940c(i, i2, iArr, iArr2, i3);
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f2295B.mo2948a();
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* renamed from: h */
    public void mo1386h(View view, View view2, int i, int i2) {
        this.f2295B.mo2950c(view, view2, i, i2);
        mo2991R(2, i2);
    }

    public boolean hasNestedScrollingParent() {
        return mo3049v(0);
    }

    /* renamed from: i */
    public void mo1387i(View view, int i) {
        this.f2295B.mo2951d(view, i);
        mo2992T(i);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f2296C.mo2944j();
    }

    /* renamed from: j */
    public void mo1388j(View view, int i, int i2, int[] iArr, int i3) {
        mo3012g(i, i2, iArr, (int[]) null, i3);
    }

    /* renamed from: k */
    public void mo3020k(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.f2296C.mo2941d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: m */
    public void mo1391m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m3507D(i4, i5, iArr);
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public void mo1392n(View view, int i, int i2, int i3, int i4, int i5) {
        m3507D(i4, i5, (int[]) null);
    }

    /* renamed from: o */
    public boolean mo1393o(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2306m = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onGenericMotionEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 0
            r2 = 8
            if (r0 != r2) goto L_0x00a6
            boolean r0 = r8.f2308o
            if (r0 != 0) goto L_0x00a6
            r0 = 2
            boolean r0 = androidx.core.view.C0820l.m3285a(r9, r0)
            r2 = 0
            if (r0 == 0) goto L_0x001c
            r0 = 9
        L_0x0017:
            float r0 = r9.getAxisValue(r0)
            goto L_0x0028
        L_0x001c:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = androidx.core.view.C0820l.m3285a(r9, r0)
            if (r0 == 0) goto L_0x0027
            r0 = 26
            goto L_0x0017
        L_0x0027:
            r0 = r2
        L_0x0028:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00a6
            float r2 = r8.getVerticalScrollFactorCompat()
            float r0 = r0 * r2
            int r0 = (int) r0
            int r2 = r8.getScrollRange()
            int r3 = r8.getScrollY()
            int r0 = r3 - r0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 8194(0x2002, float:1.1482E-41)
            r6 = 1
            if (r0 >= 0) goto L_0x006d
            boolean r2 = r8.m3518c()
            if (r2 == 0) goto L_0x0051
            boolean r9 = androidx.core.view.C0820l.m3285a(r9, r5)
            if (r9 != 0) goto L_0x0051
            r9 = r6
            goto L_0x0052
        L_0x0051:
            r9 = r1
        L_0x0052:
            if (r9 == 0) goto L_0x006b
            android.widget.EdgeEffect r9 = r8.f2302i
            float r0 = (float) r0
            float r0 = -r0
            int r2 = r8.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            androidx.core.widget.C0872e.m3610d(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f2302i
            r9.onRelease()
            r8.invalidate()
            r9 = r6
            goto L_0x009b
        L_0x006b:
            r9 = r1
            goto L_0x009b
        L_0x006d:
            if (r0 <= r2) goto L_0x0099
            boolean r7 = r8.m3518c()
            if (r7 == 0) goto L_0x007d
            boolean r9 = androidx.core.view.C0820l.m3285a(r9, r5)
            if (r9 != 0) goto L_0x007d
            r9 = r6
            goto L_0x007e
        L_0x007d:
            r9 = r1
        L_0x007e:
            if (r9 == 0) goto L_0x0096
            android.widget.EdgeEffect r9 = r8.f2303j
            int r0 = r0 - r2
            float r0 = (float) r0
            int r1 = r8.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            androidx.core.widget.C0872e.m3610d(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f2303j
            r9.onRelease()
            r8.invalidate()
            r1 = r6
        L_0x0096:
            r9 = r1
            r1 = r2
            goto L_0x009b
        L_0x0099:
            r9 = r1
            r1 = r0
        L_0x009b:
            if (r1 == r3) goto L_0x00a5
            int r9 = r8.getScrollX()
            super.scrollTo(r9, r1)
            return r6
        L_0x00a5:
            return r9
        L_0x00a6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f2308o) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f2315v;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f2304k) > this.f2312s && (2 & getNestedScrollAxes()) == 0) {
                                this.f2308o = true;
                                this.f2304k = y;
                                m3528z();
                                this.f2309p.addMovement(motionEvent);
                                this.f2318y = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m3508E(motionEvent);
                    }
                }
            }
            this.f2308o = false;
            this.f2315v = -1;
            m3509H();
            if (this.f2301h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C0833y.m3324I(this);
            }
            mo2992T(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!m3525w((int) motionEvent.getX(), y2)) {
                if (!m3516S(motionEvent) && this.f2301h.isFinished()) {
                    z = false;
                }
                this.f2308o = z;
                m3509H();
            } else {
                this.f2304k = y2;
                this.f2315v = motionEvent.getPointerId(0);
                m3526x();
                this.f2309p.addMovement(motionEvent);
                this.f2301h.computeScrollOffset();
                if (!m3516S(motionEvent) && this.f2301h.isFinished()) {
                    z = false;
                }
                this.f2308o = z;
                mo2991R(2, 0);
            }
        }
        return this.f2308o;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f2305l = false;
        View view = this.f2307n;
        if (view != null && m3505B(view, this)) {
            m3513L(this.f2307n);
        }
        this.f2307n = null;
        if (!this.f2306m) {
            if (this.f2294A != null) {
                scrollTo(getScrollX(), this.f2294A.f2320f);
                this.f2294A = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int e = m3520e(scrollY, paddingTop, i5);
            if (e != scrollY) {
                scrollTo(getScrollX(), e);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2306m = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2310q && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        mo3047t((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1388j(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m3507D(i4, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo1386h(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        View findNextFocus = rect == null ? instance.findNextFocus(this, (View) null, i) : instance.findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && !m3504A(findNextFocus)) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0859d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0859d dVar = (C0859d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f2294A = dVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0859d dVar = new C0859d(super.onSaveInstanceState());
        dVar.f2320f = getScrollY();
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C0858c cVar = this.f2298E;
        if (cVar != null) {
            cVar.mo580a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m3506C(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f2300g);
            offsetDescendantRectToMyCoords(findFocus, this.f2300g);
            m3521l(mo3011f(this.f2300g));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1393o(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo1387i(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        if (r10.f2301h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0222, code lost:
        if (r10.f2301h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            r23 = this;
            r10 = r23
            r11 = r24
            r23.m3528z()
            int r0 = r24.getActionMasked()
            r12 = 0
            if (r0 != 0) goto L_0x0010
            r10.f2318y = r12
        L_0x0010:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r24)
            int r1 = r10.f2318y
            float r1 = (float) r1
            r2 = 0
            r13.offsetLocation(r2, r1)
            r1 = 2
            r14 = 1
            if (r0 == 0) goto L_0x0226
            r3 = -1
            if (r0 == r14) goto L_0x01db
            if (r0 == r1) goto L_0x0082
            r1 = 3
            if (r0 == r1) goto L_0x0054
            r1 = 5
            if (r0 == r1) goto L_0x0041
            r1 = 6
            if (r0 == r1) goto L_0x002f
            goto L_0x0255
        L_0x002f:
            r23.m3508E(r24)
            int r0 = r10.f2315v
            int r0 = r11.findPointerIndex(r0)
            float r0 = r11.getY(r0)
            int r0 = (int) r0
            r10.f2304k = r0
            goto L_0x0255
        L_0x0041:
            int r0 = r24.getActionIndex()
            float r1 = r11.getY(r0)
            int r1 = (int) r1
            r10.f2304k = r1
            int r0 = r11.getPointerId(r0)
            r10.f2315v = r0
            goto L_0x0255
        L_0x0054:
            boolean r0 = r10.f2308o
            if (r0 == 0) goto L_0x007b
            int r0 = r23.getChildCount()
            if (r0 <= 0) goto L_0x007b
            android.widget.OverScroller r15 = r10.f2301h
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x007b
        L_0x0078:
            androidx.core.view.C0833y.m3324I(r23)
        L_0x007b:
            r10.f2315v = r3
            r23.m3523q()
            goto L_0x0255
        L_0x0082:
            int r0 = r10.f2315v
            int r15 = r11.findPointerIndex(r0)
            if (r15 != r3) goto L_0x00a9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r0.append(r1)
            int r1 = r10.f2315v
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NestedScrollView"
            android.util.Log.e(r1, r0)
            goto L_0x0255
        L_0x00a9:
            float r0 = r11.getY(r15)
            int r6 = (int) r0
            int r0 = r10.f2304k
            int r0 = r0 - r6
            float r1 = r11.getX(r15)
            int r1 = r10.m3510I(r0, r1)
            int r0 = r0 - r1
            boolean r1 = r10.f2308o
            if (r1 != 0) goto L_0x00d8
            int r1 = java.lang.Math.abs(r0)
            int r2 = r10.f2312s
            if (r1 <= r2) goto L_0x00d8
            android.view.ViewParent r1 = r23.getParent()
            if (r1 == 0) goto L_0x00cf
            r1.requestDisallowInterceptTouchEvent(r14)
        L_0x00cf:
            r10.f2308o = r14
            int r1 = r10.f2312s
            if (r0 <= 0) goto L_0x00d7
            int r0 = r0 - r1
            goto L_0x00d8
        L_0x00d7:
            int r0 = r0 + r1
        L_0x00d8:
            r7 = r0
            boolean r0 = r10.f2308o
            if (r0 == 0) goto L_0x0255
            r1 = 0
            int[] r3 = r10.f2317x
            int[] r4 = r10.f2316w
            r5 = 0
            r0 = r23
            r2 = r7
            boolean r0 = r0.mo3012g(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00fa
            int[] r0 = r10.f2317x
            r0 = r0[r14]
            int r7 = r7 - r0
            int r0 = r10.f2318y
            int[] r1 = r10.f2316w
            r1 = r1[r14]
            int r0 = r0 + r1
            r10.f2318y = r0
        L_0x00fa:
            r16 = r7
            int[] r0 = r10.f2316w
            r0 = r0[r14]
            int r6 = r6 - r0
            r10.f2304k = r6
            int r17 = r23.getScrollY()
            int r9 = r23.getScrollRange()
            int r0 = r23.getOverScrollMode()
            if (r0 == 0) goto L_0x0119
            if (r0 != r14) goto L_0x0116
            if (r9 <= 0) goto L_0x0116
            goto L_0x0119
        L_0x0116:
            r18 = r12
            goto L_0x011b
        L_0x0119:
            r18 = r14
        L_0x011b:
            r1 = 0
            r3 = 0
            int r4 = r23.getScrollY()
            r5 = 0
            r7 = 0
            r8 = 0
            r19 = 1
            r0 = r23
            r2 = r16
            r6 = r9
            r22 = r9
            r9 = r19
            boolean r0 = r0.mo2986F(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x013d
            boolean r0 = r10.mo3049v(r12)
            if (r0 != 0) goto L_0x013d
            r8 = r14
            goto L_0x013e
        L_0x013d:
            r8 = r12
        L_0x013e:
            int r0 = r23.getScrollY()
            int r2 = r0 - r17
            int r4 = r16 - r2
            int[] r7 = r10.f2317x
            r7[r14] = r12
            r1 = 0
            r3 = 0
            int[] r5 = r10.f2316w
            r6 = 0
            r0 = r23
            r0.mo3020k(r1, r2, r3, r4, r5, r6, r7)
            int r0 = r10.f2304k
            int[] r1 = r10.f2316w
            r2 = r1[r14]
            int r0 = r0 - r2
            r10.f2304k = r0
            int r0 = r10.f2318y
            r1 = r1[r14]
            int r0 = r0 + r1
            r10.f2318y = r0
            if (r18 == 0) goto L_0x01d1
            int[] r0 = r10.f2317x
            r0 = r0[r14]
            int r0 = r16 - r0
            int r1 = r17 + r0
            if (r1 >= 0) goto L_0x0195
            android.widget.EdgeEffect r1 = r10.f2302i
            int r0 = -r0
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            float r2 = r11.getX(r15)
            int r3 = r23.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            androidx.core.widget.C0872e.m3610d(r1, r0, r2)
            android.widget.EdgeEffect r0 = r10.f2303j
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01bd
            android.widget.EdgeEffect r0 = r10.f2303j
        L_0x0191:
            r0.onRelease()
            goto L_0x01bd
        L_0x0195:
            r2 = r22
            if (r1 <= r2) goto L_0x01bd
            android.widget.EdgeEffect r1 = r10.f2303j
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r11.getX(r15)
            int r4 = r23.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r2 = r2 - r3
            androidx.core.widget.C0872e.m3610d(r1, r0, r2)
            android.widget.EdgeEffect r0 = r10.f2302i
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01bd
            android.widget.EdgeEffect r0 = r10.f2302i
            goto L_0x0191
        L_0x01bd:
            android.widget.EdgeEffect r0 = r10.f2302i
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01cd
            android.widget.EdgeEffect r0 = r10.f2303j
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01d1
        L_0x01cd:
            androidx.core.view.C0833y.m3324I(r23)
            goto L_0x01d2
        L_0x01d1:
            r12 = r8
        L_0x01d2:
            if (r12 == 0) goto L_0x0255
            android.view.VelocityTracker r0 = r10.f2309p
            r0.clear()
            goto L_0x0255
        L_0x01db:
            android.view.VelocityTracker r0 = r10.f2309p
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r10.f2314u
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            int r1 = r10.f2315v
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r10.f2313t
            if (r1 < r4) goto L_0x020a
            boolean r1 = r10.m3522p(r0)
            if (r1 != 0) goto L_0x007b
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r10.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L_0x007b
            r10.dispatchNestedFling(r2, r1, r14)
            r10.mo3047t(r0)
            goto L_0x007b
        L_0x020a:
            android.widget.OverScroller r15 = r10.f2301h
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x007b
            goto L_0x0078
        L_0x0226:
            int r0 = r23.getChildCount()
            if (r0 != 0) goto L_0x022d
            return r12
        L_0x022d:
            boolean r0 = r10.f2308o
            if (r0 == 0) goto L_0x023a
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L_0x023a
            r0.requestDisallowInterceptTouchEvent(r14)
        L_0x023a:
            android.widget.OverScroller r0 = r10.f2301h
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0245
            r23.m3517a()
        L_0x0245:
            float r0 = r24.getY()
            int r0 = (int) r0
            r10.f2304k = r0
            int r0 = r11.getPointerId(r12)
            r10.f2315v = r0
            r10.mo2991R(r1, r12)
        L_0x0255:
            android.view.VelocityTracker r0 = r10.f2309p
            if (r0 == 0) goto L_0x025c
            r0.addMovement(r13)
        L_0x025c:
            r13.recycle()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: r */
    public boolean mo3035r(KeyEvent keyEvent) {
        this.f2300g.setEmpty();
        int i = 130;
        if (!m3519d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return !keyEvent.isAltPressed() ? mo2997b(33) : mo3048u(33);
            }
            if (keyCode == 20) {
                return !keyEvent.isAltPressed() ? mo2997b(130) : mo3048u(130);
            }
            if (keyCode != 62) {
                return false;
            }
            if (keyEvent.isShiftPressed()) {
                i = 33;
            }
            mo2987G(i);
            return false;
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f2305l) {
            m3513L(view2);
        } else {
            this.f2307n = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m3514M(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m3509H();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f2305l = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int e = m3520e(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int e2 = m3520e(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (e != getScrollX() || e2 != getScrollY()) {
                super.scrollTo(e, e2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f2310q) {
            this.f2310q = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f2296C.mo2945k(z);
    }

    public void setOnScrollChangeListener(C0858c cVar) {
        this.f2298E = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f2311r = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return mo2991R(i, 0);
    }

    public void stopNestedScroll() {
        mo2992T(0);
    }

    /* renamed from: t */
    public void mo3047t(int i) {
        if (getChildCount() > 0) {
            this.f2301h.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m3511J(true);
        }
    }

    /* renamed from: u */
    public boolean mo3048u(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f2300g;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f2300g.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f2300g;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f2300g;
        return m3512K(i, rect3.top, rect3.bottom);
    }

    /* renamed from: v */
    public boolean mo3049v(int i) {
        return this.f2296C.mo2943i(i);
    }
}
