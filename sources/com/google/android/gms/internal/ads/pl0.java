package com.google.android.gms.internal.ads;

import p034e2.C2547d;
import p069j1.C3202r1;
import p069j1.C3208t1;

final class pl0 {

    /* renamed from: a */
    private final C2547d f12696a;

    /* renamed from: b */
    private final C3208t1 f12697b;

    /* renamed from: c */
    private final pm0 f12698c;

    pl0(C2547d dVar, C3208t1 t1Var, pm0 pm0) {
        this.f12696a = dVar;
        this.f12697b = t1Var;
        this.f12698c = pm0;
    }

    /* renamed from: a */
    public final void mo10085a() {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10541l0)).booleanValue()) {
            this.f12698c.mo10108y();
        }
    }

    /* renamed from: b */
    public final void mo10086b(int i, long j) {
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10532k0)).booleanValue()) {
            if (j - this.f12697b.mo14081b() < 0) {
                C3202r1.m24015k("Receiving npa decision in the past, ignoring.");
                return;
            }
            if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10541l0)).booleanValue()) {
                this.f12697b.mo14098s(-1);
            } else {
                this.f12697b.mo14098s(i);
            }
            this.f12697b.mo14069A(j);
            mo10085a();
        }
    }
}
