package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

public final class f72 implements a52<ij1> {

    /* renamed from: a */
    private final Context f6730a;

    /* renamed from: b */
    private final et1 f6731b;

    /* renamed from: c */
    private final gk1 f6732c;

    /* renamed from: d */
    private final ks2 f6733d;

    /* renamed from: e */
    private final Executor f6734e;

    /* renamed from: f */
    private final po0 f6735f;

    /* renamed from: g */
    private final w70 f6736g;

    /* renamed from: h */
    private final boolean f6737h = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10666z6)).booleanValue();

    public f72(Context context, po0 po0, ks2 ks2, Executor executor, gk1 gk1, et1 et1, w70 w70) {
        this.f6730a = context;
        this.f6733d = ks2;
        this.f6732c = gk1;
        this.f6734e = executor;
        this.f6735f = po0;
        this.f6731b = et1;
        this.f6736g = w70;
    }

    /* renamed from: a */
    public final cc3<ij1> mo5105a(ds2 ds2, rr2 rr2) {
        it1 it1 = new it1();
        cc3<ij1> n = rb3.m16136n(rb3.m16131i(null), new c72(this, rr2, ds2, it1), this.f6734e);
        n.mo5905b(new d72(it1), this.f6734e);
        return n;
    }

    /* renamed from: b */
    public final boolean mo5106b(ds2 ds2, rr2 rr2) {
        wr2 wr2 = rr2.f13914t;
        return (wr2 == null || wr2.f16918a == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ cc3 mo7255c(rr2 rr2, ds2 ds2, it1 it1, Object obj) {
        rr2 rr22 = rr2;
        ds2 ds22 = ds2;
        eu0 a = this.f6731b.mo7072a(this.f6733d.f9640e, rr22, ds22.f5904b.f5509b);
        a.mo7111d1(rr22.f13877T);
        it1.mo8275a(this.f6730a, (View) a);
        bp0 bp0 = new bp0();
        gk1 gk1 = this.f6732c;
        l71 l71 = new l71(ds22, rr22, (String) null);
        e72 e72 = r1;
        e72 e722 = new e72(this.f6730a, this.f6735f, bp0, rr2, a, this.f6733d, this.f6737h, this.f6736g);
        jj1 c = gk1.mo7198c(l71, new nj1(e72, a));
        bp0.mo5907e(c);
        c.mo5576b().mo8945B0(new a72(a), wo0.f16891f);
        c.mo5584k().mo6650i(a, true, this.f6737h ? this.f6736g : null);
        c.mo5584k();
        rr2 rr23 = rr2;
        wr2 wr2 = rr23.f13914t;
        return rb3.m16135m(dt1.m8088j(a, wr2.f16919b, wr2.f16918a), new b72(this, a, rr23, c), this.f6734e);
    }
}
