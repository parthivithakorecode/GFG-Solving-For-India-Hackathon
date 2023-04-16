package com.google.android.gms.internal.ads;

import android.view.Surface;

final class va4 {
    /* renamed from: a */
    public static void m18437a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            oc2.m14399a("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
