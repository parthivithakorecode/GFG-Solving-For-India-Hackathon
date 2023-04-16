package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ea1;
import java.util.concurrent.Executor;

final class zo2<R extends ea1<? extends v61>> {

    /* renamed from: a */
    private final tt2 f18313a;

    /* renamed from: b */
    private final R f18314b;

    /* renamed from: c */
    private final Executor f18315c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public yo2 f18316d;

    public zo2(tt2 tt2, R r, Executor executor) {
        this.f18313a = tt2;
        this.f18314b = r;
        this.f18315c = executor;
    }

    /* access modifiers changed from: private */
    @Deprecated
    /* renamed from: e */
    public final du2 m20775e() {
        ks2 e = this.f18314b.mo6883e();
        return this.f18313a.mo11114b(e.f9639d, e.f9641f, e.f9645j);
    }

    /* renamed from: c */
    public final cc3<yo2> mo12251c() {
        cc3<V> cc3;
        yo2 yo2 = this.f18316d;
        if (yo2 != null) {
            return rb3.m16131i(yo2);
        }
        if (!h30.f8027a.mo9928e().booleanValue()) {
            yo2 yo22 = new yo2((vi0) null, m20775e(), (xo2) null);
            this.f18316d = yo22;
            cc3 = rb3.m16131i(yo22);
        } else {
            cc3 = rb3.m16128f(rb3.m16135m(ib3.m10985E(this.f18314b.mo6881a().mo12175e(this.f18313a.zza())), new wo2(this), this.f18315c), k12.class, new vo2(this), this.f18315c);
        }
        return rb3.m16135m(cc3, uo2.f15666a, this.f18315c);
    }
}
