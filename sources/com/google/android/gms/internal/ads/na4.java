package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

public final class na4 extends Surface {

    /* renamed from: i */
    private static int f11378i;

    /* renamed from: j */
    private static boolean f11379j;

    /* renamed from: f */
    public final boolean f11380f;

    /* renamed from: g */
    private final la4 f11381g;

    /* renamed from: h */
    private boolean f11382h;

    /* synthetic */ na4(la4 la4, SurfaceTexture surfaceTexture, boolean z, ma4 ma4) {
        super(surfaceTexture);
        this.f11381g = la4;
        this.f11380f = z;
    }

    /* renamed from: b */
    public static na4 m13812b(Context context, boolean z) {
        int i = 0;
        boolean z2 = true;
        if (z && !m13813c(context)) {
            z2 = false;
        }
        wu1.m19207f(z2);
        la4 la4 = new la4();
        if (z) {
            i = f11378i;
        }
        return la4.mo8909a(i);
    }

    /* renamed from: c */
    public static synchronized boolean m13813c(Context context) {
        int i;
        synchronized (na4.class) {
            if (!f11379j) {
                int i2 = n13.f11236a;
                int i3 = 2;
                if (i2 >= 24) {
                    if (i2 < 26) {
                        if (!"samsung".equals(n13.f11238c)) {
                            if ("XT1650".equals(n13.f11239d)) {
                            }
                        }
                    }
                    if (i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                        if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                            if (i2 >= 17) {
                                String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                                if (eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                                    i3 = 1;
                                }
                            }
                            f11378i = i3;
                            f11379j = true;
                        }
                    }
                }
                i3 = 0;
                f11378i = i3;
                f11379j = true;
            }
            i = f11378i;
        }
        return i != 0;
    }

    public final void release() {
        super.release();
        synchronized (this.f11381g) {
            if (!this.f11382h) {
                this.f11381g.mo8910b();
                this.f11382h = true;
            }
        }
    }
}
