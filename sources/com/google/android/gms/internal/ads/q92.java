package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

public final class q92 implements a52<hs1> {

    /* renamed from: a */
    private final Context f13102a;

    /* renamed from: b */
    private final et1 f13103b;

    /* renamed from: c */
    private final ms1 f13104c;

    /* renamed from: d */
    private final ks2 f13105d;

    /* renamed from: e */
    private final Executor f13106e;

    /* renamed from: f */
    private final po0 f13107f;

    /* renamed from: g */
    private final w70 f13108g;

    /* renamed from: h */
    private final boolean f13109h = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10666z6)).booleanValue();

    public q92(Context context, po0 po0, ks2 ks2, Executor executor, ms1 ms1, et1 et1, w70 w70) {
        this.f13102a = context;
        this.f13105d = ks2;
        this.f13104c = ms1;
        this.f13106e = executor;
        this.f13107f = po0;
        this.f13103b = et1;
        this.f13108g = w70;
    }

    /* renamed from: a */
    public final cc3<hs1> mo5105a(ds2 ds2, rr2 rr2) {
        it1 it1 = new it1();
        cc3<hs1> n = rb3.m16136n(rb3.m16131i(null), new k92(this, rr2, ds2, it1), this.f13106e);
        n.mo5905b(new m92(it1), this.f13106e);
        return n;
    }

    /* renamed from: b */
    public final boolean mo5106b(ds2 ds2, rr2 rr2) {
        wr2 wr2 = rr2.f13914t;
        return (wr2 == null || wr2.f16918a == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ cc3 mo10263c(rr2 rr2, ds2 ds2, it1 it1, Object obj) {
        rr2 rr22 = rr2;
        ds2 ds22 = ds2;
        eu0 a = this.f13103b.mo7072a(this.f13105d.f9640e, rr22, ds22.f5904b.f5509b);
        a.mo7111d1(rr22.f13877T);
        it1.mo8275a(this.f13102a, (View) a);
        bp0 bp0 = new bp0();
        ms1 ms1 = this.f13104c;
        l71 l71 = new l71(ds22, rr22, (String) null);
        p92 p92 = r1;
        p92 p922 = new p92(this.f13102a, this.f13103b, this.f13105d, this.f13107f, rr2, bp0, a, this.f13108g, this.f13109h);
        is1 f = ms1.mo9362f(l71, new js1(p92, a));
        bp0.mo5907e(f);
        k80.m12053b(a, f.mo8243i());
        f.mo5576b().mo8945B0(new i92(a), wo0.f16891f);
        f.mo8246l().mo6650i(a, true, this.f13109h ? this.f13108g : null);
        f.mo8246l();
        rr2 rr23 = rr2;
        wr2 wr2 = rr23.f13914t;
        return rb3.m16135m(dt1.m8088j(a, wr2.f16919b, wr2.f16918a), new j92(this, a, rr23, f), this.f13106e);
    }
}
