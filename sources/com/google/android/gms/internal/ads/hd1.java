package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class hd1 extends lg1<jd1> implements qb1, wc1 {

    /* renamed from: g */
    private final rr2 f8166g;

    /* renamed from: h */
    private final AtomicBoolean f8167h = new AtomicBoolean();

    public hd1(Set<hi1<jd1>> set, rr2 rr2) {
        super(set);
        this.f8166g = rr2;
    }

    /* renamed from: a */
    private final void m10481a() {
        C2161rv rvVar;
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10295H5)).booleanValue() && this.f8167h.compareAndSet(false, true) && (rvVar = this.f8166g.f13889c0) != null && rvVar.f13943f == 3) {
            mo8947Q0(new fd1(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S0 */
    public final /* synthetic */ void mo7914S0(jd1 jd1) {
        jd1.mo8183s(this.f8166g.f13889c0);
    }

    /* renamed from: f */
    public final void mo7915f() {
        if (this.f8166g.f13886b == 1) {
            m10481a();
        }
    }

    /* renamed from: k */
    public final void mo5153k() {
        int i = this.f8166g.f13886b;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            m10481a();
        }
    }
}
