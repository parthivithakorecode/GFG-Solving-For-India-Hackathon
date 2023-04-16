package com.google.android.gms.internal.ads;

import p069j1.C3202r1;

final class db0 implements dp0 {

    /* renamed from: a */
    final /* synthetic */ mb0 f5741a;

    /* renamed from: b */
    final /* synthetic */ nb0 f5742b;

    db0(nb0 nb0, mb0 mb0) {
        this.f5742b = nb0;
        this.f5741a = mb0;
    }

    public final void zza() {
        synchronized (this.f5742b.f11383a) {
            this.f5742b.f11390h = 1;
            C3202r1.m24015k("Failed loading new engine. Marking new engine destroyable.");
            this.f5741a.mo9161g();
        }
    }
}
