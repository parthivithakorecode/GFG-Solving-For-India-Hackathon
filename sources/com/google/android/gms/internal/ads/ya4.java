package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;

final class ya4 implements wa4 {

    /* renamed from: a */
    private final WindowManager f17653a;

    private ya4(WindowManager windowManager) {
        this.f17653a = windowManager;
    }

    /* renamed from: b */
    public static wa4 m19944b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new ya4(windowManager);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo11629a(ua4 ua4) {
        bb4.m6741b(ua4.f15492a, this.f17653a.getDefaultDisplay());
    }

    public final void zza() {
    }
}
