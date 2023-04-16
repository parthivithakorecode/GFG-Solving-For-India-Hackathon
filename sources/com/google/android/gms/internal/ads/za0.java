package com.google.android.gms.internal.ads;

import java.util.Map;
import p069j1.C3166h1;

final class za0 implements t70<ob0> {

    /* renamed from: a */
    final /* synthetic */ ha0 f18135a;

    /* renamed from: b */
    final /* synthetic */ C3166h1 f18136b;

    /* renamed from: c */
    final /* synthetic */ nb0 f18137c;

    za0(nb0 nb0, C1734gb gbVar, ha0 ha0, C3166h1 h1Var) {
        this.f18137c = nb0;
        this.f18135a = ha0;
        this.f18136b = h1Var;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, com.google.android.gms.internal.ads.t70] */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5150a(Object obj, Map map) {
        ob0 ob0 = (ob0) obj;
        synchronized (this.f18137c.f11383a) {
            io0.m11130f("JS Engine is requesting an update");
            if (this.f18137c.f11390h == 0) {
                io0.m11130f("Starting reload.");
                this.f18137c.f11390h = 2;
                this.f18137c.mo9482d((C1734gb) null);
            }
            this.f18135a.mo9717V0("/requestReload", this.f18136b.mo14035a());
        }
    }
}
