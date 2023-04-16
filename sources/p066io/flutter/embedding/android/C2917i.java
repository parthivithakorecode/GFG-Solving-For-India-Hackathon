package p066io.flutter.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import p099n3.C3768b;
import p168y3.C4462a;
import p168y3.C4473c;

/* renamed from: io.flutter.embedding.android.i */
public class C2917i extends TextureView implements C4473c {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f19709f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f19710g;

    /* renamed from: h */
    private boolean f19711h;

    /* renamed from: i */
    private C4462a f19712i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Surface f19713j;

    /* renamed from: k */
    private final TextureView.SurfaceTextureListener f19714k;

    /* renamed from: io.flutter.embedding.android.i$a */
    class C2918a implements TextureView.SurfaceTextureListener {
        C2918a() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C3768b.m25592f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
            boolean unused = C2917i.this.f19709f = true;
            if (C2917i.this.f19710g) {
                C2917i.this.m22930l();
            }
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C3768b.m25592f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
            boolean unused = C2917i.this.f19709f = false;
            if (C2917i.this.f19710g) {
                C2917i.this.m22931m();
            }
            if (C2917i.this.f19713j == null) {
                return true;
            }
            C2917i.this.f19713j.release();
            Surface unused2 = C2917i.this.f19713j = null;
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C3768b.m25592f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
            if (C2917i.this.f19710g) {
                C2917i.this.m22929k(i, i2);
            }
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public C2917i(Context context) {
        this(context, (AttributeSet) null);
    }

    public C2917i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19709f = false;
        this.f19710g = false;
        this.f19711h = false;
        this.f19714k = new C2918a();
        m22932n();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m22929k(int i, int i2) {
        if (this.f19712i != null) {
            C3768b.m25592f("FlutterTextureView", "Notifying FlutterRenderer that Android surface size has changed to " + i + " x " + i2);
            this.f19712i.mo16113u(i, i2);
            return;
        }
        throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m22930l() {
        if (this.f19712i == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f19713j;
        if (surface != null) {
            surface.release();
            this.f19713j = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f19713j = surface2;
        this.f19712i.mo16111s(surface2, this.f19711h);
        this.f19711h = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m22931m() {
        C4462a aVar = this.f19712i;
        if (aVar != null) {
            aVar.mo16112t();
            Surface surface = this.f19713j;
            if (surface != null) {
                surface.release();
                this.f19713j = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    /* renamed from: n */
    private void m22932n() {
        setSurfaceTextureListener(this.f19714k);
    }

    /* renamed from: a */
    public void mo13324a() {
        if (this.f19712i != null) {
            if (getWindowToken() != null) {
                C3768b.m25592f("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
                m22931m();
            }
            this.f19712i = null;
            this.f19710g = false;
            return;
        }
        C3768b.m25593g("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    /* renamed from: b */
    public void mo13325b() {
        if (this.f19712i != null) {
            this.f19712i = null;
            this.f19711h = true;
            this.f19710g = false;
            return;
        }
        C3768b.m25593g("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
    }

    /* renamed from: c */
    public void mo13326c(C4462a aVar) {
        C3768b.m25592f("FlutterTextureView", "Attaching to FlutterRenderer.");
        if (this.f19712i != null) {
            C3768b.m25592f("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f19712i.mo16112t();
        }
        this.f19712i = aVar;
        this.f19710g = true;
        if (this.f19709f) {
            C3768b.m25592f("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            m22930l();
        }
    }

    public C4462a getAttachedRenderer() {
        return this.f19712i;
    }

    public void setRenderSurface(Surface surface) {
        this.f19713j = surface;
    }
}
