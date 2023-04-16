package com.google.android.gms.internal.ads;

public abstract class lx3 implements ub0 {

    /* renamed from: a */
    protected final hh0 f10202a = new hh0();

    protected lx3() {
    }

    /* renamed from: c */
    public final boolean mo9086c() {
        ei0 o = mo7764o();
        if (!o.mo6970o()) {
            int e = mo7756e();
            mo7758h();
            mo7763n();
            if (o.mo6965j(e, 0, false) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo9087g() {
        ei0 o = mo7764o();
        if (!o.mo6970o()) {
            int e = mo7756e();
            mo7758h();
            mo7763n();
            if (o.mo6966k(e, 0, false) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo9088m() {
        ei0 o = mo7764o();
        return !o.mo6970o() && o.mo6958e(mo7756e(), this.f10202a, 0).mo7939b();
    }

    /* renamed from: p */
    public final boolean mo9089p() {
        ei0 o = mo7764o();
        return !o.mo6970o() && o.mo6958e(mo7756e(), this.f10202a, 0).f8230f;
    }
}
