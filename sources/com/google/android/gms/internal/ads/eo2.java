package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ea1;
import com.google.android.gms.internal.ads.v61;
import java.util.concurrent.Executor;

public final class eo2<R extends ea1<AdT>, AdT extends v61> implements ep2<R, cu2<R, AdT>> {

    /* renamed from: a */
    private R f6301a;

    /* renamed from: b */
    private final Executor f6302b = jc3.m11564b();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cc3 mo7009a(fp2 fp2, dp2 dp2, Object obj) {
        return mo7011c(fp2, dp2, (ea1) null);
    }

    /* renamed from: b */
    public final R mo7010b() {
        return this.f6301a;
    }

    /* renamed from: c */
    public final cc3<cu2<R, AdT>> mo7011c(fp2 fp2, dp2<R> dp2, R r) {
        ca1<R> a = dp2.mo6523a(fp2.f6885b);
        a.mo6107l(new kp2(true));
        R r2 = (ea1) a.mo6106f();
        this.f6301a = r2;
        z71 a2 = r2.mo6881a();
        cu2 cu2 = new cu2();
        return rb3.m16135m(rb3.m16136n(ib3.m10985E(a2.mo12179i()), new do2(this, cu2, a2), this.f6302b), new co2(cu2), this.f6302b);
    }

    /* renamed from: g */
    public final /* synthetic */ Object mo7012g() {
        return this.f6301a;
    }
}
