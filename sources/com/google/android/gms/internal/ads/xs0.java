package com.google.android.gms.internal.ads;

public final class xs0 extends ts0 {
    public xs0(tq0 tq0) {
        super(tq0);
    }

    /* renamed from: g */
    public final void mo6288g() {
    }

    /* renamed from: t */
    public final boolean mo6294t(String str) {
        String e = bo0.m6984e(str);
        tq0 tq0 = (tq0) this.f15038h.get();
        if (!(tq0 == null || e == null)) {
            tq0.mo7078E(e, this);
        }
        io0.m11131g("VideoStreamNoopCache is doing nothing.");
        mo11102h(str, e, "noop", "Noop cache is a noop.");
        return false;
    }
}
