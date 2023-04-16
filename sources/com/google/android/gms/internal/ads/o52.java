package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

public final class o52 implements a52<m41> {

    /* renamed from: a */
    private final h41 f11889a;

    /* renamed from: b */
    private final Context f11890b;

    /* renamed from: c */
    private final et1 f11891c;

    /* renamed from: d */
    private final ks2 f11892d;

    /* renamed from: e */
    private final Executor f11893e;

    /* renamed from: f */
    private final po0 f11894f;

    /* renamed from: g */
    private final w70 f11895g;

    /* renamed from: h */
    private final boolean f11896h = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10666z6)).booleanValue();

    public o52(h41 h41, Context context, Executor executor, et1 et1, ks2 ks2, po0 po0, w70 w70) {
        this.f11890b = context;
        this.f11889a = h41;
        this.f11893e = executor;
        this.f11891c = et1;
        this.f11892d = ks2;
        this.f11894f = po0;
        this.f11895g = w70;
    }

    /* renamed from: a */
    public final cc3<m41> mo5105a(ds2 ds2, rr2 rr2) {
        it1 it1 = new it1();
        cc3<m41> n = rb3.m16136n(rb3.m16131i(null), new m52(this, rr2, ds2, it1), this.f11893e);
        n.mo5905b(new n52(it1), this.f11893e);
        return n;
    }

    /* renamed from: b */
    public final boolean mo5106b(ds2 ds2, rr2 rr2) {
        wr2 wr2 = rr2.f13914t;
        return (wr2 == null || wr2.f16918a == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ cc3 mo9659c(rr2 rr2, ds2 ds2, it1 it1, Object obj) {
        rr2 rr22 = rr2;
        ds2 ds22 = ds2;
        eu0 a = this.f11891c.mo7072a(this.f11892d.f9640e, rr22, ds22.f5904b.f5509b);
        a.mo7111d1(rr22.f13877T);
        it1.mo8275a(this.f11890b, (View) a);
        bp0 bp0 = new bp0();
        h41 h41 = this.f11889a;
        l71 l71 = new l71(ds22, rr22, (String) null);
        q52 q52 = r1;
        q52 q522 = new q52(this.f11894f, bp0, rr2, a, this.f11892d, this.f11896h, this.f11895g);
        e41 b = h41.mo7838b(l71, new nj1(q52, a), new f41(rr22.f13881X));
        b.mo6790j().mo6650i(a, false, this.f11896h ? this.f11895g : null);
        bp0.mo5907e(b);
        b.mo5576b().mo8945B0(new k52(a), wo0.f16891f);
        b.mo6790j();
        wr2 wr2 = rr22.f13914t;
        return rb3.m16135m(dt1.m8088j(a, wr2.f16919b, wr2.f16918a), new l52(this, a, rr22, b), this.f11893e);
    }
}
