package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.util.Log;
import java.util.Objects;

public final class f32 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: l */
    private static final int[] f6677l = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: f */
    private final Handler f6678f;

    /* renamed from: g */
    private final int[] f6679g = new int[1];

    /* renamed from: h */
    private EGLDisplay f6680h;

    /* renamed from: i */
    private EGLContext f6681i;

    /* renamed from: j */
    private EGLSurface f6682j;

    /* renamed from: k */
    private SurfaceTexture f6683k;

    public f32(Handler handler, e22 e22) {
        this.f6678f = handler;
    }

    /* renamed from: a */
    public final SurfaceTexture mo7222a() {
        SurfaceTexture surfaceTexture = this.f6683k;
        Objects.requireNonNull(surfaceTexture);
        return surfaceTexture;
    }

    /* renamed from: b */
    public final void mo7223b(int i) {
        EGLConfig eGLConfig;
        EGLSurface eGLSurface;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                this.f6680h = eglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, f6677l, 0, eGLConfigArr, 0, 1, iArr2, 0);
                if (!eglChooseConfig || iArr2[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                    throw new d12(n13.m13628d("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]), (c02) null);
                }
                EGLContext eglCreateContext = EGL14.eglCreateContext(this.f6680h, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                if (eglCreateContext != null) {
                    this.f6681i = eglCreateContext;
                    EGLDisplay eGLDisplay = this.f6680h;
                    if (i == 1) {
                        eGLSurface = EGL14.EGL_NO_SURFACE;
                    } else {
                        eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                        if (eGLSurface == null) {
                            throw new d12("eglCreatePbufferSurface failed", (c02) null);
                        }
                    }
                    if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eglCreateContext)) {
                        this.f6682j = eGLSurface;
                        GLES20.glGenTextures(1, this.f6679g, 0);
                        int i2 = 0;
                        while (true) {
                            int glGetError = GLES20.glGetError();
                            if (glGetError == 0) {
                                break;
                            }
                            String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
                            Log.e("GlUtil", valueOf.length() != 0 ? "glError ".concat(valueOf) : new String("glError "));
                            i2 = glGetError;
                        }
                        if (i2 != 0) {
                            String valueOf2 = String.valueOf(GLU.gluErrorString(i2));
                            Log.e("GlUtil", valueOf2.length() != 0 ? "glError ".concat(valueOf2) : new String("glError "));
                        }
                        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f6679g[0]);
                        this.f6683k = surfaceTexture;
                        surfaceTexture.setOnFrameAvailableListener(this);
                        return;
                    }
                    throw new d12("eglMakeCurrent failed", (c02) null);
                }
                throw new d12("eglCreateContext failed", (c02) null);
            }
            throw new d12("eglInitialize failed", (c02) null);
        }
        throw new d12("eglGetDisplay failed", (c02) null);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final void mo7224c() {
        this.f6678f.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f6683k;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f6679g, 0);
            }
            EGLDisplay eGLDisplay = this.f6680h;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f6680h;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f6682j;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f6680h, this.f6682j);
            }
            EGLContext eGLContext = this.f6681i;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f6680h, eGLContext);
            }
            if (n13.f11236a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f6680h;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f6680h);
            }
            this.f6680h = null;
            this.f6681i = null;
            this.f6682j = null;
            this.f6683k = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.f6680h;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f6680h;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f6682j;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f6680h, this.f6682j);
            }
            EGLContext eGLContext2 = this.f6681i;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f6680h, eGLContext2);
            }
            if (n13.f11236a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay6 = this.f6680h;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f6680h);
            }
            this.f6680h = null;
            this.f6681i = null;
            this.f6682j = null;
            this.f6683k = null;
            throw th;
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f6678f.post(this);
    }

    public final void run() {
        SurfaceTexture surfaceTexture = this.f6683k;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
