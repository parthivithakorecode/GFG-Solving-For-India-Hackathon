package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;

final class za4 implements DisplayManager.DisplayListener, wa4 {

    /* renamed from: a */
    private final DisplayManager f18139a;

    /* renamed from: b */
    private ua4 f18140b;

    private za4(DisplayManager displayManager) {
        this.f18139a = displayManager;
    }

    /* renamed from: b */
    public static wa4 m20573b(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new za4(displayManager);
        }
        return null;
    }

    /* renamed from: c */
    private final Display m20574c() {
        return this.f18139a.getDisplay(0);
    }

    /* renamed from: a */
    public final void mo11629a(ua4 ua4) {
        this.f18140b = ua4;
        this.f18139a.registerDisplayListener(this, n13.m13633f0((Handler.Callback) null));
        bb4.m6741b(ua4.f15492a, m20574c());
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayChanged(int i) {
        ua4 ua4 = this.f18140b;
        if (ua4 != null && i == 0) {
            bb4.m6741b(ua4.f15492a, m20574c());
        }
    }

    public final void onDisplayRemoved(int i) {
    }

    public final void zza() {
        this.f18139a.unregisterDisplayListener(this);
        this.f18140b = null;
    }
}
