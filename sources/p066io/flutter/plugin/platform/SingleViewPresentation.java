package p066io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import p099n3.C3768b;

@TargetApi(17)
@Keep
/* renamed from: io.flutter.plugin.platform.SingleViewPresentation */
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final C2998a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private C2992a rootView;
    private boolean startFocused = false;
    private final C2996e state;
    private int viewId;

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$a */
    private static class C2992a extends FrameLayout {

        /* renamed from: f */
        private final C2998a f19943f;

        /* renamed from: g */
        private final View f19944g;

        public C2992a(Context context, C2998a aVar, View view) {
            super(context);
            this.f19943f = aVar;
            this.f19944g = view;
        }

        public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f19943f.mo13638b(this.f19944g, view, accessibilityEvent);
        }
    }

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$b */
    static class C2993b extends ViewGroup {

        /* renamed from: f */
        private final Rect f19945f = new Rect();

        /* renamed from: g */
        private final Rect f19946g = new Rect();

        public C2993b(Context context) {
            super(context);
        }

        /* renamed from: a */
        private static int m23181a(int i) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE);
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
                this.f19945f.set(i, i2, i3, i4);
                Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f19945f, layoutParams.x, layoutParams.y, this.f19946g);
                Rect rect = this.f19946g;
                childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                getChildAt(i3).measure(m23181a(i), m23181a(i2));
            }
            super.onMeasure(i, i2);
        }
    }

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$c */
    private static class C2994c extends ContextWrapper {

        /* renamed from: a */
        private final InputMethodManager f19947a;

        C2994c(Context context) {
            this(context, (InputMethodManager) null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.view.inputmethod.InputMethodManager} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C2994c(android.content.Context r1, android.view.inputmethod.InputMethodManager r2) {
            /*
                r0 = this;
                r0.<init>(r1)
                if (r2 == 0) goto L_0x0006
                goto L_0x000f
            L_0x0006:
                java.lang.String r2 = "input_method"
                java.lang.Object r1 = r1.getSystemService(r2)
                r2 = r1
                android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
            L_0x000f:
                r0.f19947a = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p066io.flutter.plugin.platform.SingleViewPresentation.C2994c.<init>(android.content.Context, android.view.inputmethod.InputMethodManager):void");
        }

        public Context createDisplayContext(Display display) {
            return new C2994c(super.createDisplayContext(display), this.f19947a);
        }

        public Object getSystemService(String str) {
            return "input_method".equals(str) ? this.f19947a : super.getSystemService(str);
        }
    }

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$d */
    private static class C2995d extends ContextWrapper {

        /* renamed from: a */
        private final C2997f f19948a;

        /* renamed from: b */
        private WindowManager f19949b;

        /* renamed from: c */
        private final Context f19950c;

        C2995d(Context context, C2997f fVar, Context context2) {
            super(context);
            this.f19948a = fVar;
            this.f19950c = context2;
        }

        /* renamed from: a */
        private WindowManager m23182a() {
            if (this.f19949b == null) {
                this.f19949b = this.f19948a.mo13635b();
            }
            return this.f19949b;
        }

        /* renamed from: b */
        private boolean m23183b() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            int i = 0;
            while (i < stackTrace.length && i < 11) {
                if (stackTrace[i].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i].getMethodName().equals("<init>")) {
                    return true;
                }
                i++;
            }
            return false;
        }

        public Object getSystemService(String str) {
            return "window".equals(str) ? m23183b() ? this.f19950c.getSystemService(str) : m23182a() : super.getSystemService(str);
        }
    }

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$e */
    static class C2996e {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C3007f f19951a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C2997f f19952b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C2993b f19953c;

        C2996e() {
        }
    }

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$f */
    static class C2997f implements InvocationHandler {

        /* renamed from: a */
        private final WindowManager f19954a;

        /* renamed from: b */
        C2993b f19955b;

        C2997f(WindowManager windowManager, C2993b bVar) {
            this.f19954a = windowManager;
            this.f19955b = bVar;
        }

        /* renamed from: a */
        private void m23190a(Object[] objArr) {
            C2993b bVar = this.f19955b;
            if (bVar == null) {
                C3768b.m25593g(SingleViewPresentation.TAG, "Embedded view called addView while detached from presentation");
            } else {
                bVar.addView(objArr[0], objArr[1]);
            }
        }

        /* renamed from: c */
        private void m23191c(Object[] objArr) {
            C2993b bVar = this.f19955b;
            if (bVar == null) {
                C3768b.m25593g(SingleViewPresentation.TAG, "Embedded view called removeView while detached from presentation");
            } else {
                bVar.removeView(objArr[0]);
            }
        }

        /* renamed from: d */
        private void m23192d(Object[] objArr) {
            if (this.f19955b == null) {
                C3768b.m25593g(SingleViewPresentation.TAG, "Embedded view called removeViewImmediate while detached from presentation");
                return;
            }
            View view = objArr[0];
            view.clearAnimation();
            this.f19955b.removeView(view);
        }

        /* renamed from: e */
        private void m23193e(Object[] objArr) {
            C2993b bVar = this.f19955b;
            if (bVar == null) {
                C3768b.m25593g(SingleViewPresentation.TAG, "Embedded view called updateViewLayout while detached from presentation");
            } else {
                bVar.updateViewLayout(objArr[0], objArr[1]);
            }
        }

        /* renamed from: b */
        public WindowManager mo13635b() {
            return (WindowManager) Proxy.newProxyInstance(WindowManager.class.getClassLoader(), new Class[]{WindowManager.class}, this);
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            name.hashCode();
            char c = 65535;
            switch (name.hashCode()) {
                case -1148522778:
                    if (name.equals("addView")) {
                        c = 0;
                        break;
                    }
                    break;
                case 542766184:
                    if (name.equals("removeViewImmediate")) {
                        c = 1;
                        break;
                    }
                    break;
                case 931413976:
                    if (name.equals("updateViewLayout")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1098630473:
                    if (name.equals("removeView")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m23190a(objArr);
                    return null;
                case 1:
                    m23192d(objArr);
                    return null;
                case 2:
                    m23193e(objArr);
                    return null;
                case 3:
                    m23191c(objArr);
                    return null;
                default:
                    try {
                        return method.invoke(this.f19954a, objArr);
                    } catch (InvocationTargetException e) {
                        throw e.getCause();
                    }
            }
        }
    }

    public SingleViewPresentation(Context context, Display display, C2998a aVar, C2996e eVar, View.OnFocusChangeListener onFocusChangeListener, boolean z) {
        super(new C2994c(context), display);
        this.accessibilityEventsDelegate = aVar;
        this.state = eVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z;
    }

    public SingleViewPresentation(Context context, Display display, C3007f fVar, C2998a aVar, int i, View.OnFocusChangeListener onFocusChangeListener) {
        super(new C2994c(context), display);
        this.accessibilityEventsDelegate = aVar;
        this.viewId = i;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        C2996e eVar = new C2996e();
        this.state = eVar;
        C3007f unused = eVar.f19951a = fVar;
        getWindow().setFlags(8, 8);
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().setType(2030);
        }
    }

    public C2996e detachState() {
        this.container.removeAllViews();
        this.rootView.removeAllViews();
        return this.state;
    }

    public C3007f getView() {
        if (this.state.f19951a == null) {
            return null;
        }
        return this.state.f19951a;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (this.state.f19953c == null) {
            C2993b unused = this.state.f19953c = new C2993b(getContext());
        }
        if (this.state.f19952b == null) {
            C2996e eVar = this.state;
            C2997f unused2 = eVar.f19952b = new C2997f((WindowManager) getContext().getSystemService("window"), eVar.f19953c);
        }
        this.container = new FrameLayout(getContext());
        C2995d dVar = new C2995d(getContext(), this.state.f19952b, this.outerContext);
        View a = this.state.f19951a.mo13659a();
        if (a.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) a.getContext()).setBaseContext(dVar);
        } else {
            C3768b.m25593g(TAG, "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.container.addView(a);
        C2992a aVar = new C2992a(getContext(), this.accessibilityEventsDelegate, a);
        this.rootView = aVar;
        aVar.addView(this.container);
        this.rootView.addView(this.state.f19953c);
        a.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            a.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }
}
