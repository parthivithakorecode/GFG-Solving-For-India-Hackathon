package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import p069j1.C3218x;

public final class c62 implements a52<t41> {

    /* renamed from: a */
    private final r51 f5316a;

    /* renamed from: b */
    private final Context f5317b;

    /* renamed from: c */
    private final et1 f5318c;

    /* renamed from: d */
    private final ks2 f5319d;

    /* renamed from: e */
    private final Executor f5320e;

    /* renamed from: f */
    private final e43<rr2, C3218x> f5321f;

    public c62(r51 r51, Context context, Executor executor, et1 et1, ks2 ks2, e43<rr2, C3218x> e43) {
        this.f5317b = context;
        this.f5316a = r51;
        this.f5320e = executor;
        this.f5318c = et1;
        this.f5319d = ks2;
        this.f5321f = e43;
    }

    /* renamed from: a */
    public final cc3<t41> mo5105a(ds2 ds2, rr2 rr2) {
        return rb3.m16136n(rb3.m16131i(null), new z52(this, ds2, rr2), this.f5320e);
    }

    /* renamed from: b */
    public final boolean mo5106b(ds2 ds2, rr2 rr2) {
        wr2 wr2 = rr2.f13914t;
        return (wr2 == null || wr2.f16918a == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ cc3 mo6062c(ds2 ds2, rr2 rr2, Object obj) {
        View view;
        C2087pv a = os2.m14626a(this.f5317b, rr2.f13916v);
        eu0 a2 = this.f5318c.mo7072a(a, rr2, ds2.f5904b.f5509b);
        a2.mo7111d1(rr2.f13877T);
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10303I5)).booleanValue() || !rr2.f13893e0) {
            view = new ht1(this.f5317b, (View) a2, this.f5321f.mo5054a(rr2));
        } else {
            view = k61.m12027a(this.f5317b, (View) a2, rr2);
        }
        u41 a3 = this.f5316a.mo7440a(new l71(ds2, rr2, (String) null), new b51(view, a2, new w52(a2), os2.m14628c(a)));
        a3.mo5990j().mo6650i(a2, false, (w70) null);
        ob1 b = a3.mo5576b();
        x52 x52 = new x52(a2);
        dc3 dc3 = wo0.f16891f;
        b.mo8945B0(x52, dc3);
        a3.mo5990j();
        wr2 wr2 = rr2.f13914t;
        cc3<?> j = dt1.m8088j(a2, wr2.f16919b, wr2.f16918a);
        if (rr2.f13867J) {
            j.mo5905b(new a62(a2), this.f5320e);
        }
        j.mo5905b(new b62(this, a2), this.f5320e);
        return rb3.m16135m(j, new y52(a3), dc3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo6063d(eu0 eu0) {
        eu0.mo7086I0();
        bv0 p = eu0.mo7139p();
        s00 s00 = this.f5319d.f9636a;
        if (s00 != null && p != null) {
            p.mo5962D5(s00);
        }
    }
}
