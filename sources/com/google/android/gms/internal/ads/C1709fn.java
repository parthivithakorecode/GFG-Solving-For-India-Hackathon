package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

@TargetApi(17)
/* renamed from: com.google.android.gms.internal.ads.fn */
public final class C1709fn extends Surface {

    /* renamed from: h */
    private static boolean f6868h;

    /* renamed from: i */
    private static boolean f6869i;

    /* renamed from: f */
    private final C1634dn f6870f;

    /* renamed from: g */
    private boolean f6871g;

    /* synthetic */ C1709fn(C1634dn dnVar, SurfaceTexture surfaceTexture, boolean z, C1672en enVar) {
        super(surfaceTexture);
        this.f6870f = dnVar;
    }

    /* renamed from: b */
    public static C1709fn m9238b(Context context, boolean z) {
        if (C2449zm.f18287a >= 17) {
            boolean z2 = true;
            if (z && !m9239c(context)) {
                z2 = false;
            }
            C1856jm.m11730e(z2);
            return new C1634dn().mo6515a(z);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    /* renamed from: c */
    public static synchronized boolean m9239c(Context context) {
        boolean z;
        synchronized (C1709fn.class) {
            if (!f6869i) {
                int i = C2449zm.f18287a;
                if (i >= 17) {
                    boolean z2 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        if (i == 24) {
                            String str = C2449zm.f18290d;
                            if ((str.startsWith("SM-G950") || str.startsWith("SM-G955")) && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                            }
                        }
                        z2 = true;
                    }
                    f6868h = z2;
                }
                f6869i = true;
            }
            z = f6868h;
        }
        return z;
    }

    public final void release() {
        super.release();
        synchronized (this.f6870f) {
            if (!this.f6871g) {
                this.f6870f.mo6516b();
                this.f6871g = true;
            }
        }
    }
}
