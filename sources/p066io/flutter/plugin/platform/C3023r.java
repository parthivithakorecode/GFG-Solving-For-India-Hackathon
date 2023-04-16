package p066io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewTreeObserver;
import p066io.flutter.plugin.platform.SingleViewPresentation;
import p066io.flutter.view.C3119d;

@TargetApi(20)
/* renamed from: io.flutter.plugin.platform.r */
class C3023r {

    /* renamed from: a */
    SingleViewPresentation f20027a;

    /* renamed from: b */
    private final Context f20028b;

    /* renamed from: c */
    private final C2998a f20029c;

    /* renamed from: d */
    private final int f20030d;

    /* renamed from: e */
    private final C3119d.C3122c f20031e;

    /* renamed from: f */
    private final View.OnFocusChangeListener f20032f;

    /* renamed from: g */
    private final Surface f20033g;

    /* renamed from: h */
    private VirtualDisplay f20034h;

    /* renamed from: i */
    private int f20035i;

    /* renamed from: j */
    private int f20036j;

    /* renamed from: io.flutter.plugin.platform.r$a */
    class C3024a implements View.OnAttachStateChangeListener {

        /* renamed from: f */
        final /* synthetic */ View f20037f;

        /* renamed from: g */
        final /* synthetic */ Runnable f20038g;

        /* renamed from: io.flutter.plugin.platform.r$a$a */
        class C3025a implements Runnable {
            C3025a() {
            }

            public void run() {
                C3024a aVar = C3024a.this;
                aVar.f20037f.postDelayed(aVar.f20038g, 128);
            }
        }

        C3024a(View view, Runnable runnable) {
            this.f20037f = view;
            this.f20038g = runnable;
        }

        public void onViewAttachedToWindow(View view) {
            C3026b.m23373a(this.f20037f, new C3025a());
            this.f20037f.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: io.flutter.plugin.platform.r$b */
    static class C3026b implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a */
        final View f20041a;

        /* renamed from: b */
        Runnable f20042b;

        /* renamed from: io.flutter.plugin.platform.r$b$a */
        class C3027a implements Runnable {
            C3027a() {
            }

            public void run() {
                C3026b.this.f20041a.getViewTreeObserver().removeOnDrawListener(C3026b.this);
            }
        }

        C3026b(View view, Runnable runnable) {
            this.f20041a = view;
            this.f20042b = runnable;
        }

        /* renamed from: a */
        static void m23373a(View view, Runnable runnable) {
            view.getViewTreeObserver().addOnDrawListener(new C3026b(view, runnable));
        }

        public void onDraw() {
            Runnable runnable = this.f20042b;
            if (runnable != null) {
                runnable.run();
                this.f20042b = null;
                this.f20041a.post(new C3027a());
            }
        }
    }

    private C3023r(Context context, C2998a aVar, VirtualDisplay virtualDisplay, C3007f fVar, Surface surface, C3119d.C3122c cVar, View.OnFocusChangeListener onFocusChangeListener, int i, Object obj) {
        Context context2 = context;
        this.f20028b = context2;
        C2998a aVar2 = aVar;
        this.f20029c = aVar2;
        this.f20031e = cVar;
        View.OnFocusChangeListener onFocusChangeListener2 = onFocusChangeListener;
        this.f20032f = onFocusChangeListener2;
        this.f20033g = surface;
        this.f20034h = virtualDisplay;
        this.f20030d = context.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(context2, this.f20034h.getDisplay(), fVar, aVar2, i, onFocusChangeListener2);
        this.f20027a = singleViewPresentation;
        singleViewPresentation.show();
    }

    /* renamed from: a */
    public static C3023r m23364a(Context context, C2998a aVar, C3007f fVar, C3119d.C3122c cVar, int i, int i2, int i3, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        int i4 = i;
        int i5 = i2;
        context.getResources().getDisplayMetrics();
        if (i4 == 0 || i5 == 0) {
            return null;
        }
        cVar.mo13956c().setDefaultBufferSize(i4, i5);
        Surface surface = new Surface(cVar.mo13956c());
        VirtualDisplay createVirtualDisplay = ((DisplayManager) context.getSystemService("display")).createVirtualDisplay("flutter-vd", i, i2, context.getResources().getDisplayMetrics().densityDpi, surface, 0);
        if (createVirtualDisplay == null) {
            return null;
        }
        C3023r rVar = new C3023r(context, aVar, createVirtualDisplay, fVar, surface, cVar, onFocusChangeListener, i3, obj);
        rVar.f20035i = i4;
        rVar.f20036j = i5;
        return rVar;
    }

    /* renamed from: b */
    public void mo13728b(MotionEvent motionEvent) {
        SingleViewPresentation singleViewPresentation = this.f20027a;
        if (singleViewPresentation != null) {
            singleViewPresentation.dispatchTouchEvent(motionEvent);
        }
    }

    /* renamed from: c */
    public int mo13729c() {
        return this.f20036j;
    }

    /* renamed from: d */
    public int mo13730d() {
        return this.f20035i;
    }

    /* renamed from: e */
    public View mo13731e() {
        SingleViewPresentation singleViewPresentation = this.f20027a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().mo13659a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo13732f(View view) {
        SingleViewPresentation singleViewPresentation = this.f20027a;
        if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
            this.f20027a.getView().mo13662d(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo13733g() {
        SingleViewPresentation singleViewPresentation = this.f20027a;
        if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
            this.f20027a.getView().mo13664f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo13734h() {
        SingleViewPresentation singleViewPresentation = this.f20027a;
        if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
            this.f20027a.getView().mo13661c();
        }
    }

    /* renamed from: i */
    public void mo13735i(int i, int i2, Runnable runnable) {
        boolean isFocused = mo13731e().isFocused();
        SingleViewPresentation.C2996e detachState = this.f20027a.detachState();
        this.f20034h.setSurface((Surface) null);
        this.f20034h.release();
        this.f20035i = i;
        this.f20036j = i2;
        this.f20031e.mo13956c().setDefaultBufferSize(i, i2);
        this.f20034h = ((DisplayManager) this.f20028b.getSystemService("display")).createVirtualDisplay("flutter-vd", i, i2, this.f20030d, this.f20033g, 0);
        View e = mo13731e();
        e.addOnAttachStateChangeListener(new C3024a(e, runnable));
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.f20028b, this.f20034h.getDisplay(), this.f20029c, detachState, this.f20032f, isFocused);
        singleViewPresentation.show();
        this.f20027a.cancel();
        this.f20027a = singleViewPresentation;
    }
}
