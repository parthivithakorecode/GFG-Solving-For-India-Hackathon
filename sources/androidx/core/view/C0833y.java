package androidx.core.view;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.C0744a;
import androidx.core.view.C0796i0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p102o.C3814g;
import p109p.C3879e;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: androidx.core.view.y */
public class C0833y {

    /* renamed from: a */
    private static final AtomicInteger f2268a = new AtomicInteger(1);

    /* renamed from: b */
    private static Field f2269b;

    /* renamed from: c */
    private static boolean f2270c;

    /* renamed from: d */
    private static WeakHashMap<View, String> f2271d;

    /* renamed from: e */
    private static WeakHashMap<View, C0783e0> f2272e = null;

    /* renamed from: f */
    private static Field f2273f;

    /* renamed from: g */
    private static boolean f2274g = false;

    /* renamed from: h */
    private static final int[] f2275h = {C3879e.accessibility_custom_action_0, C3879e.accessibility_custom_action_1, C3879e.accessibility_custom_action_2, C3879e.accessibility_custom_action_3, C3879e.accessibility_custom_action_4, C3879e.accessibility_custom_action_5, C3879e.accessibility_custom_action_6, C3879e.accessibility_custom_action_7, C3879e.accessibility_custom_action_8, C3879e.accessibility_custom_action_9, C3879e.accessibility_custom_action_10, C3879e.accessibility_custom_action_11, C3879e.accessibility_custom_action_12, C3879e.accessibility_custom_action_13, C3879e.accessibility_custom_action_14, C3879e.accessibility_custom_action_15, C3879e.accessibility_custom_action_16, C3879e.accessibility_custom_action_17, C3879e.accessibility_custom_action_18, C3879e.accessibility_custom_action_19, C3879e.accessibility_custom_action_20, C3879e.accessibility_custom_action_21, C3879e.accessibility_custom_action_22, C3879e.accessibility_custom_action_23, C3879e.accessibility_custom_action_24, C3879e.accessibility_custom_action_25, C3879e.accessibility_custom_action_26, C3879e.accessibility_custom_action_27, C3879e.accessibility_custom_action_28, C3879e.accessibility_custom_action_29, C3879e.accessibility_custom_action_30, C3879e.accessibility_custom_action_31};

    /* renamed from: i */
    private static final C0829u f2276i = C0832x.f2267f;

    /* renamed from: j */
    private static final C0838e f2277j = new C0838e();

    /* renamed from: androidx.core.view.y$a */
    class C0834a extends C0839f<Boolean> {
        C0834a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean mo2957d(View view) {
            return Boolean.valueOf(C0848n.m3482d(view));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo2958e(View view, Boolean bool) {
            C0848n.m3487i(view, bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo2959h(Boolean bool, Boolean bool2) {
            return !mo2977a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.y$b */
    class C0835b extends C0839f<CharSequence> {
        C0835b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence mo2957d(View view) {
            return C0848n.m3480b(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo2958e(View view, CharSequence charSequence) {
            C0848n.m3486h(view, charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo2959h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.y$c */
    class C0836c extends C0839f<CharSequence> {
        C0836c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence mo2957d(View view) {
            return C0850p.m3492a(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo2958e(View view, CharSequence charSequence) {
            C0850p.m3493b(view, charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo2959h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.y$d */
    class C0837d extends C0839f<Boolean> {
        C0837d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean mo2957d(View view) {
            return Boolean.valueOf(C0848n.m3481c(view));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo2958e(View view, Boolean bool) {
            C0848n.m3485g(view, bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo2959h(Boolean bool, Boolean bool2) {
            return !mo2977a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.y$e */
    static class C0838e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: f */
        private final WeakHashMap<View, Boolean> f2278f = new WeakHashMap<>();

        C0838e() {
        }

        /* renamed from: b */
        private void m3395b(View view, boolean z) {
            boolean z2 = view.isShown() && view.getWindowVisibility() == 0;
            if (z != z2) {
                C0833y.m3320E(view, z2 ? 16 : 32);
                this.f2278f.put(view, Boolean.valueOf(z2));
            }
        }

        /* renamed from: c */
        private void m3396c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        /* renamed from: e */
        private void m3397e(View view) {
            C0841h.m3423o(view.getViewTreeObserver(), this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2972a(View view) {
            this.f2278f.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (C0843j.m3440b(view)) {
                m3396c(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo2973d(View view) {
            this.f2278f.remove(view);
            view.removeOnAttachStateChangeListener(this);
            m3397e(view);
        }

        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry next : this.f2278f.entrySet()) {
                    m3395b((View) next.getKey(), ((Boolean) next.getValue()).booleanValue());
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            m3396c(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.core.view.y$f */
    static abstract class C0839f<T> {

        /* renamed from: a */
        private final int f2279a;

        /* renamed from: b */
        private final Class<T> f2280b;

        /* renamed from: c */
        private final int f2281c;

        /* renamed from: d */
        private final int f2282d;

        C0839f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        C0839f(int i, Class<T> cls, int i2, int i3) {
            this.f2279a = i;
            this.f2280b = cls;
            this.f2282d = i2;
            this.f2281c = i3;
        }

        /* renamed from: b */
        private boolean m3400b() {
            return Build.VERSION.SDK_INT >= 19;
        }

        /* renamed from: c */
        private boolean m3401c() {
            return Build.VERSION.SDK_INT >= this.f2281c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2977a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract T mo2957d(View view);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract void mo2958e(View view, T t);

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public T mo2978f(View view) {
            if (m3401c()) {
                return mo2957d(view);
            }
            if (!m3400b()) {
                return null;
            }
            T tag = view.getTag(this.f2279a);
            if (this.f2280b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo2979g(View view, T t) {
            if (m3401c()) {
                mo2958e(view, t);
            } else if (m3400b() && mo2959h(mo2978f(view), t)) {
                C0833y.m3352h(view);
                view.setTag(this.f2279a, t);
                C0833y.m3320E(view, this.f2282d);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public abstract boolean mo2959h(T t, T t2);
    }

    /* renamed from: androidx.core.view.y$g */
    static class C0840g {
        /* renamed from: a */
        static boolean m3408a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* renamed from: androidx.core.view.y$h */
    static class C0841h {
        /* renamed from: a */
        static AccessibilityNodeProvider m3409a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        /* renamed from: b */
        static boolean m3410b(View view) {
            return view.getFitsSystemWindows();
        }

        /* renamed from: c */
        static int m3411c(View view) {
            return view.getImportantForAccessibility();
        }

        /* renamed from: d */
        static int m3412d(View view) {
            return view.getMinimumHeight();
        }

        /* renamed from: e */
        static int m3413e(View view) {
            return view.getMinimumWidth();
        }

        /* renamed from: f */
        static ViewParent m3414f(View view) {
            return view.getParentForAccessibility();
        }

        /* renamed from: g */
        static int m3415g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        /* renamed from: h */
        static boolean m3416h(View view) {
            return view.hasOverlappingRendering();
        }

        /* renamed from: i */
        static boolean m3417i(View view) {
            return view.hasTransientState();
        }

        /* renamed from: j */
        static boolean m3418j(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        /* renamed from: k */
        static void m3419k(View view) {
            view.postInvalidateOnAnimation();
        }

        /* renamed from: l */
        static void m3420l(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        /* renamed from: m */
        static void m3421m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* renamed from: n */
        static void m3422n(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        /* renamed from: o */
        static void m3423o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        /* renamed from: p */
        static void m3424p(View view) {
            view.requestFitSystemWindows();
        }

        /* renamed from: q */
        static void m3425q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        /* renamed from: r */
        static void m3426r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        /* renamed from: s */
        static void m3427s(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    /* renamed from: androidx.core.view.y$i */
    static class C0842i {
        /* renamed from: a */
        static int m3428a() {
            return View.generateViewId();
        }

        /* renamed from: b */
        static Display m3429b(View view) {
            return view.getDisplay();
        }

        /* renamed from: c */
        static int m3430c(View view) {
            return view.getLabelFor();
        }

        /* renamed from: d */
        static int m3431d(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: e */
        static int m3432e(View view) {
            return view.getPaddingEnd();
        }

        /* renamed from: f */
        static int m3433f(View view) {
            return view.getPaddingStart();
        }

        /* renamed from: g */
        static boolean m3434g(View view) {
            return view.isPaddingRelative();
        }

        /* renamed from: h */
        static void m3435h(View view, int i) {
            view.setLabelFor(i);
        }

        /* renamed from: i */
        static void m3436i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        /* renamed from: j */
        static void m3437j(View view, int i) {
            view.setLayoutDirection(i);
        }

        /* renamed from: k */
        static void m3438k(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    /* renamed from: androidx.core.view.y$j */
    static class C0843j {
        /* renamed from: a */
        static int m3439a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        /* renamed from: b */
        static boolean m3440b(View view) {
            return view.isAttachedToWindow();
        }

        /* renamed from: c */
        static boolean m3441c(View view) {
            return view.isLaidOut();
        }

        /* renamed from: d */
        static boolean m3442d(View view) {
            return view.isLayoutDirectionResolved();
        }

        /* renamed from: e */
        static void m3443e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        /* renamed from: f */
        static void m3444f(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        /* renamed from: g */
        static void m3445g(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: androidx.core.view.y$k */
    static class C0844k {
        /* renamed from: a */
        static WindowInsets m3446a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* renamed from: b */
        static WindowInsets m3447b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: c */
        static void m3448c(View view) {
            view.requestApplyInsets();
        }
    }

    /* renamed from: androidx.core.view.y$l */
    private static class C0845l {

        /* renamed from: androidx.core.view.y$l$a */
        class C0846a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            C0796i0 f2283a = null;

            /* renamed from: b */
            final /* synthetic */ View f2284b;

            /* renamed from: c */
            final /* synthetic */ C0827s f2285c;

            C0846a(View view, C0827s sVar) {
                this.f2284b = view;
                this.f2285c = sVar;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C0796i0 v = C0796i0.m3157v(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    C0845l.m3449a(windowInsets, this.f2284b);
                    if (v.equals(this.f2283a)) {
                        return this.f2285c.mo718a(view, v).mo2890t();
                    }
                }
                this.f2283a = v;
                C0796i0 a = this.f2285c.mo718a(view, v);
                if (i >= 30) {
                    return a.mo2890t();
                }
                C0833y.m3327L(view);
                return a.mo2890t();
            }
        }

        /* renamed from: a */
        static void m3449a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C3879e.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        static C0796i0 m3450b(View view, C0796i0 i0Var, Rect rect) {
            WindowInsets t = i0Var.mo2890t();
            if (t != null) {
                return C0796i0.m3157v(view.computeSystemWindowInsets(t, rect), view);
            }
            rect.setEmpty();
            return i0Var;
        }

        /* renamed from: c */
        static boolean m3451c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        /* renamed from: d */
        static boolean m3452d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        /* renamed from: e */
        static boolean m3453e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        /* renamed from: f */
        static boolean m3454f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        /* renamed from: g */
        static ColorStateList m3455g(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: h */
        static PorterDuff.Mode m3456h(View view) {
            return view.getBackgroundTintMode();
        }

        /* renamed from: i */
        static float m3457i(View view) {
            return view.getElevation();
        }

        /* renamed from: j */
        public static C0796i0 m3458j(View view) {
            return C0796i0.C0797a.m3177a(view);
        }

        /* renamed from: k */
        static String m3459k(View view) {
            return view.getTransitionName();
        }

        /* renamed from: l */
        static float m3460l(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: m */
        static float m3461m(View view) {
            return view.getZ();
        }

        /* renamed from: n */
        static boolean m3462n(View view) {
            return view.hasNestedScrollingParent();
        }

        /* renamed from: o */
        static boolean m3463o(View view) {
            return view.isImportantForAccessibility();
        }

        /* renamed from: p */
        static boolean m3464p(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* renamed from: q */
        static void m3465q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* renamed from: r */
        static void m3466r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* renamed from: s */
        static void m3467s(View view, float f) {
            view.setElevation(f);
        }

        /* renamed from: t */
        static void m3468t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        /* renamed from: u */
        static void m3469u(View view, C0827s sVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C3879e.tag_on_apply_window_listener, sVar);
            }
            if (sVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C3879e.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new C0846a(view, sVar));
            }
        }

        /* renamed from: v */
        static void m3470v(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: w */
        static void m3471w(View view, float f) {
            view.setTranslationZ(f);
        }

        /* renamed from: x */
        static void m3472x(View view, float f) {
            view.setZ(f);
        }

        /* renamed from: y */
        static boolean m3473y(View view, int i) {
            return view.startNestedScroll(i);
        }

        /* renamed from: z */
        static void m3474z(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: androidx.core.view.y$m */
    private static class C0847m {
        /* renamed from: a */
        public static C0796i0 m3475a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C0796i0 u = C0796i0.m3156u(rootWindowInsets);
            u.mo2888r(u);
            u.mo2873d(view.getRootView());
            return u;
        }

        /* renamed from: b */
        static int m3476b(View view) {
            return view.getScrollIndicators();
        }

        /* renamed from: c */
        static void m3477c(View view, int i) {
            view.setScrollIndicators(i);
        }

        /* renamed from: d */
        static void m3478d(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: androidx.core.view.y$n */
    static class C0848n {
        /* renamed from: a */
        static void m3479a(View view, C0853s sVar) {
            int i = C3879e.tag_unhandled_key_listeners;
            C3814g gVar = (C3814g) view.getTag(i);
            if (gVar == null) {
                gVar = new C3814g();
                view.setTag(i, gVar);
            }
            Objects.requireNonNull(sVar);
            C0855z zVar = new C0855z(sVar);
            gVar.put(sVar, zVar);
            view.addOnUnhandledKeyEventListener(zVar);
        }

        /* renamed from: b */
        static CharSequence m3480b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* renamed from: c */
        static boolean m3481c(View view) {
            return view.isAccessibilityHeading();
        }

        /* renamed from: d */
        static boolean m3482d(View view) {
            return view.isScreenReaderFocusable();
        }

        /* renamed from: e */
        static void m3483e(View view, C0853s sVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            C3814g gVar = (C3814g) view.getTag(C3879e.tag_unhandled_key_listeners);
            if (gVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.get(sVar)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        /* renamed from: f */
        static <T> T m3484f(View view, int i) {
            return view.requireViewById(i);
        }

        /* renamed from: g */
        static void m3485g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        /* renamed from: h */
        static void m3486h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* renamed from: i */
        static void m3487i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* renamed from: androidx.core.view.y$o */
    private static class C0849o {
        /* renamed from: a */
        static View.AccessibilityDelegate m3488a(View view) {
            return view.getAccessibilityDelegate();
        }

        /* renamed from: b */
        static List<Rect> m3489b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        /* renamed from: c */
        static void m3490c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        /* renamed from: d */
        static void m3491d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* renamed from: androidx.core.view.y$p */
    private static class C0850p {
        /* renamed from: a */
        static CharSequence m3492a(View view) {
            return view.getStateDescription();
        }

        /* renamed from: b */
        static void m3493b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* renamed from: androidx.core.view.y$q */
    private static final class C0851q {
        /* renamed from: a */
        public static String[] m3494a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        /* renamed from: b */
        public static C0769c m3495b(View view, C0769c cVar) {
            ContentInfo f = cVar.mo2829f();
            ContentInfo performReceiveContent = view.performReceiveContent(f);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == f ? cVar : C0769c.m3050g(performReceiveContent);
        }

        /* renamed from: c */
        public static void m3496c(View view, String[] strArr, C0828t tVar) {
            if (tVar == null) {
                view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
            } else {
                view.setOnReceiveContentListener(strArr, new C0852r(tVar));
            }
        }
    }

    /* renamed from: androidx.core.view.y$r */
    private static final class C0852r implements OnReceiveContentListener {

        /* renamed from: a */
        private final C0828t f2286a;

        C0852r(C0828t tVar) {
            this.f2286a = tVar;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C0769c g = C0769c.m3050g(contentInfo);
            C0769c a = this.f2286a.mo2952a(view, g);
            if (a == null) {
                return null;
            }
            return a == g ? contentInfo : a.mo2829f();
        }
    }

    /* renamed from: androidx.core.view.y$s */
    public interface C0853s {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* renamed from: androidx.core.view.y$t */
    static class C0854t {

        /* renamed from: d */
        private static final ArrayList<WeakReference<View>> f2287d = new ArrayList<>();

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f2288a = null;

        /* renamed from: b */
        private SparseArray<WeakReference<View>> f2289b = null;

        /* renamed from: c */
        private WeakReference<KeyEvent> f2290c = null;

        C0854t() {
        }

        /* renamed from: a */
        static C0854t m3497a(View view) {
            int i = C3879e.tag_unhandled_key_event_manager;
            C0854t tVar = (C0854t) view.getTag(i);
            if (tVar != null) {
                return tVar;
            }
            C0854t tVar2 = new C0854t();
            view.setTag(i, tVar2);
            return tVar2;
        }

        /* renamed from: c */
        private View m3498c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f2288a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c = m3498c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c != null) {
                            return c;
                        }
                    }
                }
                if (m3500e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        private SparseArray<WeakReference<View>> m3499d() {
            if (this.f2289b == null) {
                this.f2289b = new SparseArray<>();
            }
            return this.f2289b;
        }

        /* renamed from: e */
        private boolean m3500e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C3879e.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((C0853s) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private void m3501g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f2288a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f2287d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f2288a == null) {
                        this.f2288a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f2287d;
                        View view = (View) arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f2288a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f2288a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo2983b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m3501g();
            }
            View c = m3498c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m3499d().put(keyCode, new WeakReference(c));
                }
            }
            return c != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo2984f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f2290c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f2290c = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray<WeakReference<View>> d = m3499d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d.valueAt(indexOfKey);
                d.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && C0833y.m3316A(view)) {
                m3500e(view, keyEvent);
            }
            return true;
        }
    }

    /* renamed from: A */
    public static boolean m3316A(View view) {
        return Build.VERSION.SDK_INT >= 19 ? C0843j.m3440b(view) : view.getWindowToken() != null;
    }

    /* renamed from: B */
    public static boolean m3317B(View view) {
        return Build.VERSION.SDK_INT >= 19 ? C0843j.m3441c(view) : view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: C */
    public static boolean m3318C(View view) {
        Boolean f = m3329N().mo2978f(view);
        return f != null && f.booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static /* synthetic */ C0769c m3319D(C0769c cVar) {
        return cVar;
    }

    /* renamed from: E */
    static void m3320E(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m3357m(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            int i2 = 32;
            if (m3356l(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i2 = 2048;
                }
                obtain.setEventType(i2);
                C0843j.m3445g(obtain, i);
                if (z) {
                    obtain.getText().add(m3357m(view));
                    m3343a0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                C0843j.m3445g(obtain2, i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m3357m(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    C0843j.m3443e(view.getParent(), view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    /* renamed from: F */
    public static C0796i0 m3321F(View view, C0796i0 i0Var) {
        WindowInsets t;
        if (Build.VERSION.SDK_INT >= 21 && (t = i0Var.mo2890t()) != null) {
            WindowInsets b = C0844k.m3447b(view, t);
            if (!b.equals(t)) {
                return C0796i0.m3157v(b, view);
            }
        }
        return i0Var;
    }

    /* renamed from: G */
    private static C0839f<CharSequence> m3322G() {
        return new C0835b(C3879e.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    /* renamed from: H */
    public static C0769c m3323H(View view, C0769c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C0851q.m3495b(view, cVar);
        }
        C0828t tVar = (C0828t) view.getTag(C3879e.tag_on_receive_content_listener);
        if (tVar == null) {
            return m3360p(view).mo2127a(cVar);
        }
        C0769c a = tVar.mo2952a(view, cVar);
        if (a == null) {
            return null;
        }
        return m3360p(view).mo2127a(a);
    }

    /* renamed from: I */
    public static void m3324I(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0841h.m3419k(view);
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: J */
    public static void m3325J(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0841h.m3421m(view, runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: K */
    public static void m3326K(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0841h.m3422n(view, runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: L */
    public static void m3327L(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            C0844k.m3448c(view);
        } else if (i >= 16) {
            C0841h.m3424p(view);
        }
    }

    /* renamed from: M */
    public static void m3328M(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C0849o.m3490c(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: N */
    private static C0839f<Boolean> m3329N() {
        return new C0834a(C3879e.tag_screen_reader_focusable, Boolean.class, 28);
    }

    /* renamed from: O */
    public static void m3330O(View view, C0744a aVar) {
        if (aVar == null && (m3354j(view) instanceof C0744a.C0745a)) {
            aVar = new C0744a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.mo2765d());
    }

    /* renamed from: P */
    public static void m3331P(View view, boolean z) {
        m3344b().mo2979g(view, Boolean.valueOf(z));
    }

    /* renamed from: Q */
    public static void m3332Q(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            m3322G().mo2979g(view, charSequence);
            if (charSequence != null) {
                f2277j.mo2972a(view);
            } else {
                f2277j.mo2973d(view);
            }
        }
    }

    /* renamed from: R */
    public static void m3333R(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0841h.m3425q(view, drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: S */
    public static void m3334S(View view, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            C0845l.m3465q(view, colorStateList);
            if (i == 21) {
                Drawable background = view.getBackground();
                boolean z = (C0845l.m3455g(view) == null && C0845l.m3456h(view) == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    C0841h.m3425q(view, background);
                }
            }
        } else if (view instanceof C0831w) {
            ((C0831w) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: T */
    public static void m3335T(View view, PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            C0845l.m3466r(view, mode);
            if (i == 21) {
                Drawable background = view.getBackground();
                boolean z = (C0845l.m3455g(view) == null && C0845l.m3456h(view) == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    C0841h.m3425q(view, background);
                }
            }
        } else if (view instanceof C0831w) {
            ((C0831w) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: U */
    public static void m3336U(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0845l.m3467s(view, f);
        }
    }

    /* renamed from: V */
    public static void m3337V(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 19) {
            if (i2 < 16) {
                return;
            }
            if (i == 4) {
                i = 2;
            }
        }
        C0841h.m3427s(view, i);
    }

    /* renamed from: W */
    public static void m3338W(View view, C0827s sVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0845l.m3469u(view, sVar);
        }
    }

    /* renamed from: X */
    public static void m3339X(View view, boolean z) {
        m3329N().mo2979g(view, Boolean.valueOf(z));
    }

    /* renamed from: Y */
    public static void m3340Y(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            C0847m.m3478d(view, i, i2);
        }
    }

    /* renamed from: Z */
    public static void m3341Z(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0845l.m3470v(view, str);
            return;
        }
        if (f2271d == null) {
            f2271d = new WeakHashMap<>();
        }
        f2271d.put(view, str);
    }

    /* renamed from: a0 */
    private static void m3343a0(View view) {
        if (m3361q(view) == 0) {
            m3337V(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m3361q((View) parent) == 4) {
                m3337V(view, 2);
                return;
            }
        }
    }

    /* renamed from: b */
    private static C0839f<Boolean> m3344b() {
        return new C0837d(C3879e.tag_accessibility_heading, Boolean.class, 28);
    }

    /* renamed from: b0 */
    private static C0839f<CharSequence> m3345b0() {
        return new C0836c(C3879e.tag_state_description, CharSequence.class, 64, 30);
    }

    /* renamed from: c */
    public static C0783e0 m3346c(View view) {
        if (f2272e == null) {
            f2272e = new WeakHashMap<>();
        }
        C0783e0 e0Var = f2272e.get(view);
        if (e0Var != null) {
            return e0Var;
        }
        C0783e0 e0Var2 = new C0783e0(view);
        f2272e.put(view, e0Var2);
        return e0Var2;
    }

    /* renamed from: c0 */
    public static void m3347c0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0845l.m3474z(view);
        } else if (view instanceof C0821m) {
            ((C0821m) view).stopNestedScroll();
        }
    }

    /* renamed from: d */
    public static C0796i0 m3348d(View view, C0796i0 i0Var, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? C0845l.m3450b(view, i0Var, rect) : i0Var;
    }

    /* renamed from: e */
    public static C0796i0 m3349e(View view, C0796i0 i0Var) {
        WindowInsets t;
        if (Build.VERSION.SDK_INT >= 21 && (t = i0Var.mo2890t()) != null) {
            WindowInsets a = C0844k.m3446a(view, t);
            if (!a.equals(t)) {
                return C0796i0.m3157v(a, view);
            }
        }
        return i0Var;
    }

    /* renamed from: f */
    static boolean m3350f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0854t.m3497a(view).mo2983b(view, keyEvent);
    }

    /* renamed from: g */
    static boolean m3351g(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0854t.m3497a(view).mo2984f(keyEvent);
    }

    /* renamed from: h */
    static void m3352h(View view) {
        C0744a i = m3353i(view);
        if (i == null) {
            i = new C0744a();
        }
        m3330O(view, i);
    }

    /* renamed from: i */
    public static C0744a m3353i(View view) {
        View.AccessibilityDelegate j = m3354j(view);
        if (j == null) {
            return null;
        }
        return j instanceof C0744a.C0745a ? ((C0744a.C0745a) j).f2125a : new C0744a(j);
    }

    /* renamed from: j */
    private static View.AccessibilityDelegate m3354j(View view) {
        return Build.VERSION.SDK_INT >= 29 ? C0849o.m3488a(view) : m3355k(view);
    }

    /* renamed from: k */
    private static View.AccessibilityDelegate m3355k(View view) {
        if (f2274g) {
            return null;
        }
        if (f2273f == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2273f = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2274g = true;
                return null;
            }
        }
        try {
            Object obj = f2273f.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2274g = true;
            return null;
        }
    }

    /* renamed from: l */
    public static int m3356l(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0843j.m3439a(view);
        }
        return 0;
    }

    /* renamed from: m */
    public static CharSequence m3357m(View view) {
        return m3322G().mo2978f(view);
    }

    /* renamed from: n */
    public static ColorStateList m3358n(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0845l.m3455g(view);
        }
        if (view instanceof C0831w) {
            return ((C0831w) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: o */
    public static PorterDuff.Mode m3359o(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0845l.m3456h(view);
        }
        if (view instanceof C0831w) {
            return ((C0831w) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: p */
    private static C0829u m3360p(View view) {
        return view instanceof C0829u ? (C0829u) view : f2276i;
    }

    /* renamed from: q */
    public static int m3361q(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C0841h.m3411c(view);
        }
        return 0;
    }

    /* renamed from: r */
    public static int m3362r(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return C0842i.m3431d(view);
        }
        return 0;
    }

    /* renamed from: s */
    public static int m3363s(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C0841h.m3412d(view);
        }
        if (!f2270c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f2269b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2270c = true;
        }
        Field field = f2269b;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: t */
    public static String[] m3364t(View view) {
        return Build.VERSION.SDK_INT >= 31 ? C0851q.m3494a(view) : (String[]) view.getTag(C3879e.tag_on_receive_content_mime_types);
    }

    /* renamed from: u */
    public static C0796i0 m3365u(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return C0847m.m3475a(view);
        }
        if (i >= 21) {
            return C0845l.m3458j(view);
        }
        return null;
    }

    /* renamed from: v */
    public static CharSequence m3366v(View view) {
        return m3345b0().mo2978f(view);
    }

    /* renamed from: w */
    public static String m3367w(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0845l.m3459k(view);
        }
        WeakHashMap<View, String> weakHashMap = f2271d;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    @Deprecated
    /* renamed from: x */
    public static int m3368x(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C0841h.m3415g(view);
        }
        return 0;
    }

    /* renamed from: y */
    public static boolean m3369y(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return C0840g.m3408a(view);
        }
        return false;
    }

    /* renamed from: z */
    public static boolean m3370z(View view) {
        Boolean f = m3344b().mo2978f(view);
        return f != null && f.booleanValue();
    }
}
