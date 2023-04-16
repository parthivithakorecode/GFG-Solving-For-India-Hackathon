package p066io.flutter.plugin.platform;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicLong;
import p064i4.C2854h;
import p066io.flutter.embedding.android.C2899a;
import p066io.flutter.view.C3119d;
import p099n3.C3768b;

@TargetApi(23)
/* renamed from: io.flutter.plugin.platform.j */
class C3011j extends FrameLayout {

    /* renamed from: f */
    private int f19974f;

    /* renamed from: g */
    private int f19975g;

    /* renamed from: h */
    private int f19976h;

    /* renamed from: i */
    private int f19977i;

    /* renamed from: j */
    private int f19978j;

    /* renamed from: k */
    private int f19979k;

    /* renamed from: l */
    private SurfaceTexture f19980l;

    /* renamed from: m */
    private Surface f19981m;

    /* renamed from: n */
    private C2899a f19982n;

    /* renamed from: o */
    ViewTreeObserver.OnGlobalFocusChangeListener f19983o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final AtomicLong f19984p;

    /* renamed from: q */
    private final C3119d.C3120a f19985q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f19986r;

    /* renamed from: s */
    private final C3119d.C3121b f19987s;

    /* renamed from: io.flutter.plugin.platform.j$a */
    class C3012a implements C3119d.C3120a {
        C3012a() {
        }

        /* renamed from: a */
        public void mo13685a() {
            if (Build.VERSION.SDK_INT == 29) {
                C3011j.this.f19984p.decrementAndGet();
            }
        }
    }

    /* renamed from: io.flutter.plugin.platform.j$b */
    class C3013b implements C3119d.C3121b {
        C3013b() {
        }

        public void onTrimMemory(int i) {
            if (i == 80 && Build.VERSION.SDK_INT >= 29) {
                boolean unused = C3011j.this.f19986r = true;
            }
        }
    }

    /* renamed from: io.flutter.plugin.platform.j$c */
    class C3014c implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: f */
        final /* synthetic */ View.OnFocusChangeListener f19990f;

        C3014c(View.OnFocusChangeListener onFocusChangeListener) {
            this.f19990f = onFocusChangeListener;
        }

        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f19990f;
            C3011j jVar = C3011j.this;
            onFocusChangeListener.onFocusChange(jVar, C2854h.m22361c(jVar));
        }
    }

    public C3011j(Context context) {
        super(context);
        this.f19984p = new AtomicLong(0);
        this.f19985q = new C3012a();
        this.f19986r = false;
        this.f19987s = new C3013b();
        setWillNotDraw(false);
    }

    public C3011j(Context context, C3119d.C3122c cVar) {
        this(context);
        cVar.mo13955b(this.f19985q);
        cVar.mo13954a(this.f19987s);
        mo13678l(cVar.mo13956c());
    }

    /* renamed from: f */
    private void m23259f() {
        if (Build.VERSION.SDK_INT == 29) {
            this.f19984p.incrementAndGet();
        }
    }

    /* renamed from: g */
    private void m23260g() {
        if (this.f19986r) {
            Surface surface = this.f19981m;
            if (surface != null) {
                surface.release();
            }
            this.f19981m = mo13669c(this.f19980l);
            this.f19986r = false;
        }
    }

    /* renamed from: n */
    private boolean m23261n() {
        return Build.VERSION.SDK_INT != 29 || this.f19984p.get() <= 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Surface mo13669c(SurfaceTexture surfaceTexture) {
        return new Surface(surfaceTexture);
    }

    /* renamed from: d */
    public int mo13670d() {
        return this.f19979k;
    }

    @SuppressLint({"NewApi"})
    public void draw(Canvas canvas) {
        String str;
        Surface surface = this.f19981m;
        if (surface == null) {
            super.draw(canvas);
            str = "Platform view cannot be composed without a surface.";
        } else if (!surface.isValid()) {
            str = "Invalid surface. The platform view cannot be displayed.";
        } else {
            SurfaceTexture surfaceTexture = this.f19980l;
            if (surfaceTexture == null || surfaceTexture.isReleased()) {
                str = "Invalid texture. The platform view cannot be displayed.";
            } else if (!m23261n()) {
                invalidate();
                return;
            } else {
                m23260g();
                Canvas lockHardwareCanvas = this.f19981m.lockHardwareCanvas();
                try {
                    lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    super.draw(lockHardwareCanvas);
                    m23259f();
                    return;
                } finally {
                    this.f19981m.unlockCanvasAndPost(lockHardwareCanvas);
                }
            }
        }
        C3768b.m25588b("PlatformViewWrapper", str);
    }

    /* renamed from: e */
    public int mo13672e() {
        return this.f19978j;
    }

    /* renamed from: h */
    public void mo13673h() {
        this.f19980l = null;
        Surface surface = this.f19981m;
        if (surface != null) {
            surface.release();
            this.f19981m = null;
        }
    }

    /* renamed from: i */
    public void mo13674i(int i, int i2) {
        this.f19978j = i;
        this.f19979k = i2;
        SurfaceTexture surfaceTexture = this.f19980l;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
    }

    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    /* renamed from: j */
    public void mo13676j(FrameLayout.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        this.f19976h = layoutParams.leftMargin;
        this.f19977i = layoutParams.topMargin;
    }

    /* renamed from: k */
    public void mo13677k(View.OnFocusChangeListener onFocusChangeListener) {
        mo13680o();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f19983o == null) {
            C3014c cVar = new C3014c(onFocusChangeListener);
            this.f19983o = cVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(cVar);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: l */
    public void mo13678l(SurfaceTexture surfaceTexture) {
        int i;
        if (Build.VERSION.SDK_INT < 23) {
            C3768b.m25588b("PlatformViewWrapper", "Platform views cannot be displayed below API level 23. You can prevent this issue by setting `minSdkVersion: 23` in build.gradle.");
            return;
        }
        this.f19980l = surfaceTexture;
        int i2 = this.f19978j;
        if (i2 > 0 && (i = this.f19979k) > 0) {
            surfaceTexture.setDefaultBufferSize(i2, i);
        }
        Surface surface = this.f19981m;
        if (surface != null) {
            surface.release();
        }
        Surface c = mo13669c(surfaceTexture);
        this.f19981m = c;
        Canvas lockHardwareCanvas = c.lockHardwareCanvas();
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            m23259f();
        } finally {
            this.f19981m.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    /* renamed from: m */
    public void mo13679m(C2899a aVar) {
        this.f19982n = aVar;
    }

    /* renamed from: o */
    public void mo13680o() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (onGlobalFocusChangeListener = this.f19983o) != null) {
            this.f19983o = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }

    @SuppressLint({"NewApi"})
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        float f;
        if (this.f19982n == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i2 = this.f19976h;
            this.f19974f = i2;
            i = this.f19977i;
            this.f19975g = i;
            f = (float) i2;
        } else if (action != 2) {
            f = (float) this.f19976h;
            i = this.f19977i;
        } else {
            matrix.postTranslate((float) this.f19974f, (float) this.f19975g);
            this.f19974f = this.f19976h;
            this.f19975g = this.f19977i;
            return this.f19982n.mo13238g(motionEvent, matrix);
        }
        matrix.postTranslate(f, (float) i);
        return this.f19982n.mo13238g(motionEvent, matrix);
    }

    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }
}
