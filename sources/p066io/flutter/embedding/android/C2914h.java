package p066io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import p099n3.C3768b;
import p168y3.C4462a;
import p168y3.C4472b;
import p168y3.C4473c;

/* renamed from: io.flutter.embedding.android.h */
public class C2914h extends SurfaceView implements C4473c {

    /* renamed from: f */
    private final boolean f19700f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f19701g;

    /* renamed from: h */
    private boolean f19702h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f19703i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C4462a f19704j;

    /* renamed from: k */
    private final SurfaceHolder.Callback f19705k;

    /* renamed from: l */
    private final C4472b f19706l;

    /* renamed from: io.flutter.embedding.android.h$a */
    class C2915a implements SurfaceHolder.Callback {
        C2915a() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C3768b.m25592f("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
            if (C2914h.this.f19703i) {
                C2914h.this.m22913j(i2, i3);
            }
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C3768b.m25592f("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
            boolean unused = C2914h.this.f19701g = true;
            if (C2914h.this.f19703i) {
                C2914h.this.m22914k();
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C3768b.m25592f("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
            boolean unused = C2914h.this.f19701g = false;
            if (C2914h.this.f19703i) {
                C2914h.this.m22915l();
            }
        }
    }

    /* renamed from: io.flutter.embedding.android.h$b */
    class C2916b implements C4472b {
        C2916b() {
        }

        /* renamed from: c */
        public void mo13233c() {
        }

        /* renamed from: f */
        public void mo13234f() {
            C3768b.m25592f("FlutterSurfaceView", "onFlutterUiDisplayed()");
            C2914h.this.setAlpha(1.0f);
            if (C2914h.this.f19704j != null) {
                C2914h.this.f19704j.mo16108p(this);
            }
        }
    }

    private C2914h(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.f19701g = false;
        this.f19702h = false;
        this.f19703i = false;
        this.f19705k = new C2915a();
        this.f19706l = new C2916b();
        this.f19700f = z;
        m22916m();
    }

    public C2914h(Context context, boolean z) {
        this(context, (AttributeSet) null, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m22913j(int i, int i2) {
        if (this.f19704j != null) {
            C3768b.m25592f("FlutterSurfaceView", "Notifying FlutterRenderer that Android surface size has changed to " + i + " x " + i2);
            this.f19704j.mo16113u(i, i2);
            return;
        }
        throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m22914k() {
        if (this.f19704j == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.f19704j.mo16111s(getHolder().getSurface(), this.f19702h);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m22915l() {
        C4462a aVar = this.f19704j;
        if (aVar != null) {
            aVar.mo16112t();
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    /* renamed from: m */
    private void m22916m() {
        if (this.f19700f) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.f19705k);
        setAlpha(0.0f);
    }

    /* renamed from: a */
    public void mo13324a() {
        if (this.f19704j != null) {
            if (getWindowToken() != null) {
                C3768b.m25592f("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
                m22915l();
            }
            setAlpha(0.0f);
            this.f19704j.mo16108p(this.f19706l);
            this.f19704j = null;
            this.f19703i = false;
            return;
        }
        C3768b.m25593g("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    /* renamed from: b */
    public void mo13325b() {
        if (this.f19704j != null) {
            this.f19704j = null;
            this.f19702h = true;
            this.f19703i = false;
            return;
        }
        C3768b.m25593g("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
    }

    /* renamed from: c */
    public void mo13326c(C4462a aVar) {
        C3768b.m25592f("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.f19704j != null) {
            C3768b.m25592f("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f19704j.mo16112t();
            this.f19704j.mo16108p(this.f19706l);
        }
        this.f19704j = aVar;
        this.f19703i = true;
        aVar.mo16101f(this.f19706l);
        if (this.f19701g) {
            C3768b.m25592f("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            m22914k();
        }
        this.f19702h = false;
    }

    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        region.op(iArr[0], iArr[1], (iArr[0] + getRight()) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    public C4462a getAttachedRenderer() {
        return this.f19704j;
    }
}
