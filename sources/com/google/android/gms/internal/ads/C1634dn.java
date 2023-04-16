package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.dn */
final class C1634dn extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {

    /* renamed from: f */
    private final int[] f5840f = new int[1];

    /* renamed from: g */
    private Handler f5841g;

    /* renamed from: h */
    private SurfaceTexture f5842h;

    /* renamed from: i */
    private Error f5843i;

    /* renamed from: j */
    private RuntimeException f5844j;

    /* renamed from: k */
    private C1709fn f5845k;

    public C1634dn() {
        super("dummySurface");
    }

    /* renamed from: a */
    public final C1709fn mo6515a(boolean z) {
        boolean z2;
        start();
        this.f5841g = new Handler(getLooper(), this);
        synchronized (this) {
            z2 = false;
            this.f5841g.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            while (this.f5845k == null && this.f5844j == null && this.f5843i == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f5844j;
        if (runtimeException == null) {
            Error error = this.f5843i;
            if (error == null) {
                return this.f5845k;
            }
            throw error;
        }
        throw runtimeException;
    }

    /* renamed from: b */
    public final void mo6516b() {
        this.f5841g.sendEmptyMessage(3);
    }

    public final boolean handleMessage(Message message) {
        Message message2 = message;
        int i = message2.what;
        if (i == 1) {
            try {
                boolean z = message2.arg1 != 0;
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                C1856jm.m11731f(eglGetDisplay != null, "eglGetDisplay failed");
                int[] iArr = new int[2];
                C1856jm.m11731f(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                EGLConfig[] eGLConfigArr2 = eGLConfigArr;
                C1856jm.m11731f(EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0 && eGLConfigArr2[0] != null, "eglChooseConfig failed");
                EGLConfig eGLConfig = eGLConfigArr2[0];
                EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, z ? new int[]{12440, 2, 12992, 1, 12344} : new int[]{12440, 2, 12344}, 0);
                C1856jm.m11731f(eglCreateContext != null, "eglCreateContext failed");
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, z ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                C1856jm.m11731f(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                C1856jm.m11731f(EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext), "eglMakeCurrent failed");
                GLES20.glGenTextures(1, this.f5840f, 0);
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f5840f[0]);
                this.f5842h = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(this);
                this.f5845k = new C1709fn(this, this.f5842h, z, (C1672en) null);
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e);
                this.f5844j = e;
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                try {
                    Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                    this.f5843i = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        notify();
                        throw th;
                    }
                }
            }
            return true;
        } else if (i == 2) {
            this.f5842h.updateTexImage();
            return true;
        } else if (i != 3) {
            return true;
        } else {
            try {
                this.f5842h.release();
                this.f5845k = null;
                this.f5842h = null;
                GLES20.glDeleteTextures(1, this.f5840f, 0);
            } catch (Throwable th2) {
                try {
                    Log.e("DummySurface", "Failed to release dummy surface", th2);
                } catch (Throwable th3) {
                    quit();
                    throw th3;
                }
            }
            quit();
            return true;
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f5841g.sendEmptyMessage(2);
    }
}
