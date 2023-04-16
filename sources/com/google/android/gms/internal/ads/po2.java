package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ea1;
import com.google.android.gms.internal.ads.v61;
import java.util.concurrent.Executor;

public final class po2<R extends ea1<AdT>, AdT extends v61> implements ep2<R, oo2<R, AdT>> {

    /* renamed from: a */
    private final tt2 f12747a;

    /* renamed from: b */
    private final Executor f12748b;

    /* renamed from: c */
    private final nb3<Void> f12749c = new no2(this);

    public po2(tt2 tt2, Executor executor) {
        this.f12747a = tt2;
        this.f12748b = executor;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cc3 mo7009a(fp2 fp2, dp2 dp2, Object obj) {
        return mo10142c(fp2, dp2, (ea1) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ cc3 mo10141b(ea1 ea1, yo2 yo2) {
        du2 du2 = yo2.f17824b;
        vi0 vi0 = yo2.f17823a;
        cu2<?, ?> c = du2 != null ? this.f12747a.mo11115c(du2) : null;
        if (du2 == null) {
            return rb3.m16131i(null);
        }
        if (!(c == null || vi0 == null)) {
            rb3.m16140r(ea1.mo6881a().mo12177g(vi0), this.f12749c, this.f12748b);
        }
        return rb3.m16131i(new oo2(du2, vi0, c));
    }

    /* renamed from: c */
    public final cc3<oo2<R, AdT>> mo10142c(fp2 fp2, dp2<R> dp2, R r) {
        return rb3.m16128f(rb3.m16136n(ib3.m10985E(new zo2(this.f12747a, r, this.f12748b).mo12251c()), new lo2(this, r), this.f12748b), Exception.class, new mo2(this), this.f12748b);
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ Object mo7012g() {
        return null;
    }
}
