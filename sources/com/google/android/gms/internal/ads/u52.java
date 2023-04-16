package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

public final class u52 implements a52<c41> {

    /* renamed from: a */
    private final v31 f15406a;

    /* renamed from: b */
    private final Context f15407b;

    /* renamed from: c */
    private final et1 f15408c;

    /* renamed from: d */
    private final Executor f15409d;

    public u52(v31 v31, Context context, Executor executor, et1 et1) {
        this.f15407b = context;
        this.f15406a = v31;
        this.f15409d = executor;
        this.f15408c = et1;
    }

    /* renamed from: a */
    public final cc3<c41> mo5105a(ds2 ds2, rr2 rr2) {
        return rb3.m16136n(rb3.m16131i(null), new t52(this, ds2, rr2), this.f15409d);
    }

    /* renamed from: b */
    public final boolean mo5106b(ds2 ds2, rr2 rr2) {
        wr2 wr2 = rr2.f13914t;
        return (wr2 == null || wr2.f16918a == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ cc3 mo11162c(ds2 ds2, rr2 rr2, Object obj) {
        C2087pv a = os2.m14626a(this.f15407b, rr2.f13916v);
        eu0 a2 = this.f15408c.mo7072a(a, rr2, ds2.f5904b.f5509b);
        o31 b = this.f15406a.mo11375b(new l71(ds2, rr2, (String) null), new p31((View) a2, a2, os2.m14628c(a), rr2.f13881X, rr2.f13887b0, rr2.f13869L));
        b.mo8810i().mo6650i(a2, false, (w70) null);
        ob1 b2 = b.mo5576b();
        r52 r52 = new r52(a2);
        dc3 dc3 = wo0.f16891f;
        b2.mo8945B0(r52, dc3);
        b.mo8810i();
        wr2 wr2 = rr2.f13914t;
        return rb3.m16135m(dt1.m8088j(a2, wr2.f16919b, wr2.f16918a), new s52(b), dc3);
    }
}
