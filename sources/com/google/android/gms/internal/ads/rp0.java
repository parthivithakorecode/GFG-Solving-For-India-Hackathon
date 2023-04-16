package com.google.android.gms.internal.ads;

final class rp0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ String f13794f;

    /* renamed from: g */
    final /* synthetic */ String f13795g;

    /* renamed from: h */
    final /* synthetic */ xp0 f13796h;

    rp0(xp0 xp0, String str, String str2) {
        this.f13796h = xp0;
        this.f13794f = str;
        this.f13795g = str2;
    }

    public final void run() {
        if (this.f13796h.f17293w != null) {
            this.f13796h.f17293w.mo7681a(this.f13794f, this.f13795g);
        }
    }
}
