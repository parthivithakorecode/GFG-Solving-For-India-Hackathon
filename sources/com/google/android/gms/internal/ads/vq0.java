package com.google.android.gms.internal.ads;

import p069j1.C3163g2;

final class vq0 implements Runnable {

    /* renamed from: f */
    private final gq0 f16384f;

    /* renamed from: g */
    private boolean f16385g = false;

    vq0(gq0 gq0) {
        this.f16384f = gq0;
    }

    /* renamed from: c */
    private final void m18622c() {
        s33 s33 = C3163g2.f20465i;
        s33.removeCallbacks(this);
        s33.postDelayed(this, 250);
    }

    /* renamed from: a */
    public final void mo11513a() {
        this.f16385g = true;
        this.f16384f.mo7706z();
    }

    /* renamed from: b */
    public final void mo11514b() {
        this.f16385g = false;
        m18622c();
    }

    public final void run() {
        if (!this.f16385g) {
            this.f16384f.mo7706z();
            m18622c();
        }
    }
}
