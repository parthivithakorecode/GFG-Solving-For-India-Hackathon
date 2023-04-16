package com.google.android.gms.internal.ads;

import p054h1.C2694t;
import p069j1.C3141b0;

final class qn0 extends C3141b0 {

    /* renamed from: c */
    final /* synthetic */ tn0 f13240c;

    qn0(tn0 tn0) {
        this.f13240c = tn0;
    }

    /* renamed from: a */
    public final void mo8780a() {
        p10 p10 = new p10(this.f13240c.f14918e, this.f13240c.f14919f.f12729f);
        synchronized (this.f13240c.f14914a) {
            try {
                C2694t.m21597f();
                s10.m16564a(this.f13240c.f14920g, p10);
            } catch (IllegalArgumentException e) {
                io0.m11132h("Cannot config CSI reporter.", e);
            }
        }
    }
}
