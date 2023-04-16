package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.concurrent.GuardedBy;
import p002a1.C0040w;

public final class fj1 extends lg1<C0040w.C0041a> {
    @GuardedBy("this")

    /* renamed from: g */
    private boolean f6835g;

    protected fj1(Set<hi1<C0040w.C0041a>> set) {
        super(set);
    }

    /* renamed from: a */
    public final void mo7351a() {
        mo8947Q0(cj1.f5428a);
    }

    /* renamed from: c */
    public final synchronized void mo7352c() {
        if (!this.f6835g) {
            mo8947Q0(ej1.f6227a);
            this.f6835g = true;
        }
        mo8947Q0(dj1.f5824a);
    }

    /* renamed from: g */
    public final synchronized void mo7353g() {
        mo8947Q0(ej1.f6227a);
        this.f6835g = true;
    }

    public final void zza() {
        mo8947Q0(bj1.f4959a);
    }
}
