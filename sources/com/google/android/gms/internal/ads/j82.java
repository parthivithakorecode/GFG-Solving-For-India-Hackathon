package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

public final class j82 extends i82<t41> {

    /* renamed from: a */
    private final bw0 f9028a;

    /* renamed from: b */
    private final fa1 f9029b;

    /* renamed from: c */
    private final ua2 f9030c;

    /* renamed from: d */
    private final og1 f9031d;

    /* renamed from: e */
    private final yk1 f9032e;

    /* renamed from: f */
    private final nd1 f9033f;

    /* renamed from: g */
    private final ViewGroup f9034g;

    public j82(bw0 bw0, fa1 fa1, ua2 ua2, og1 og1, yk1 yk1, nd1 nd1, ViewGroup viewGroup) {
        this.f9028a = bw0;
        this.f9029b = fa1;
        this.f9030c = ua2;
        this.f9031d = og1;
        this.f9032e = yk1;
        this.f9033f = nd1;
        this.f9034g = viewGroup;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final cc3<t41> mo7527c(ks2 ks2, Bundle bundle) {
        q51 l = this.f9028a.mo5604l();
        fa1 fa1 = this.f9029b;
        fa1.mo7277f(ks2);
        fa1.mo7275d(bundle);
        l.mo6724p(fa1.mo7278g());
        l.mo6726s(this.f9031d);
        l.mo6725q(this.f9030c);
        l.mo6720g(this.f9032e);
        l.mo6723m(new p61(this.f9033f));
        l.mo6721h(new q41(this.f9034g));
        z71<t41> d = l.mo6722i().mo7443d();
        return d.mo12178h(d.mo12179i());
    }
}
