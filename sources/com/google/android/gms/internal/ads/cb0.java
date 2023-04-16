package com.google.android.gms.internal.ads;

import p069j1.C3202r1;

final class cb0 implements fp0<ha0> {

    /* renamed from: a */
    final /* synthetic */ mb0 f5362a;

    /* renamed from: b */
    final /* synthetic */ nb0 f5363b;

    cb0(nb0 nb0, mb0 mb0) {
        this.f5363b = nb0;
        this.f5362a = mb0;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo6117c(Object obj) {
        ha0 ha0 = (ha0) obj;
        synchronized (this.f5363b.f11383a) {
            this.f5363b.f11390h = 0;
            if (!(this.f5363b.f11389g == null || this.f5362a == this.f5363b.f11389g)) {
                C3202r1.m24015k("New JS engine is loaded, marking previous one as destroyable.");
                this.f5363b.f11389g.mo9161g();
            }
            this.f5363b.f11389g = this.f5362a;
        }
    }
}
