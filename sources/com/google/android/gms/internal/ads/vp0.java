package com.google.android.gms.internal.ads;

final class vp0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ xp0 f16378f;

    vp0(xp0 xp0) {
        this.f16378f = xp0;
    }

    public final void run() {
        if (this.f16378f.f17293w != null) {
            if (!this.f16378f.f17294x) {
                this.f16378f.f17293w.mo7685e();
                this.f16378f.f17294x = true;
            }
            this.f16378f.f17293w.mo7682b();
        }
    }
}
