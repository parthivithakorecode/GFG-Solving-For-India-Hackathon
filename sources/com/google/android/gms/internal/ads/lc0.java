package com.google.android.gms.internal.ads;

public final class lc0 {

    /* renamed from: a */
    private final nb0 f9994a;

    /* renamed from: b */
    private cc3<ob0> f9995b;

    lc0(nb0 nb0) {
        this.f9994a = nb0;
    }

    /* renamed from: d */
    private final void m12659d() {
        if (this.f9995b == null) {
            bp0 bp0 = new bp0();
            this.f9995b = bp0;
            this.f9994a.mo9481b((C1734gb) null).mo8196e(new ic0(bp0), new hc0(bp0));
        }
    }

    /* renamed from: a */
    public final <I, O> oc0<I, O> mo8918a(String str, vb0<I> vb0, tb0<O> tb0) {
        m12659d();
        return new oc0<>(this.f9995b, "google.afma.activeView.handleUpdate", vb0, tb0);
    }

    /* renamed from: b */
    public final void mo8919b(String str, t70<? super ob0> t70) {
        m12659d();
        this.f9995b = rb3.m16136n(this.f9995b, new kc0(str, t70), wo0.f16891f);
    }

    /* renamed from: c */
    public final void mo8920c(String str, t70<? super ob0> t70) {
        this.f9995b = rb3.m16135m(this.f9995b, new jc0(str, t70), wo0.f16891f);
    }
}
