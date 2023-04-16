package com.google.android.gms.internal.ads;

import p003a2.C0092o;
import p069j1.C3165h0;
import p069j1.C3202r1;

public final class mb0 extends ip0<ha0> {

    /* renamed from: c */
    private final Object f10791c = new Object();

    /* renamed from: d */
    private final C3165h0<ha0> f10792d;

    /* renamed from: e */
    private boolean f10793e;

    /* renamed from: f */
    private int f10794f;

    public mb0(C3165h0<ha0> h0Var) {
        this.f10792d = h0Var;
        this.f10793e = false;
        this.f10794f = 0;
    }

    /* renamed from: f */
    public final hb0 mo9160f() {
        hb0 hb0 = new hb0(this);
        synchronized (this.f10791c) {
            mo8196e(new ib0(this, hb0), new jb0(this, hb0));
            C0092o.m315k(this.f10794f >= 0);
            this.f10794f++;
        }
        return hb0;
    }

    /* renamed from: g */
    public final void mo9161g() {
        synchronized (this.f10791c) {
            C0092o.m315k(this.f10794f >= 0);
            C3202r1.m24015k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f10793e = true;
            mo9162h();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo9162h() {
        synchronized (this.f10791c) {
            C0092o.m315k(this.f10794f >= 0);
            if (!this.f10793e || this.f10794f != 0) {
                C3202r1.m24015k("There are still references to the engine. Not destroying.");
            } else {
                C3202r1.m24015k("No reference is left (including root). Cleaning up engine.");
                mo8196e(new lb0(this), new ep0());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo9163i() {
        synchronized (this.f10791c) {
            C0092o.m315k(this.f10794f > 0);
            C3202r1.m24015k("Releasing 1 reference for JS Engine");
            this.f10794f--;
            mo9162h();
        }
    }
}
