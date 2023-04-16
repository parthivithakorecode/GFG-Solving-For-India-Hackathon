package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

public final class uv2 {

    /* renamed from: a */
    private final Object f15781a;

    /* renamed from: b */
    private final List<cc3<?>> f15782b;

    /* renamed from: c */
    final /* synthetic */ ew2 f15783c;

    /* synthetic */ uv2(ew2 ew2, Object obj, List list, tv2 tv2) {
        this.f15783c = ew2;
        this.f15781a = obj;
        this.f15782b = list;
    }

    /* renamed from: a */
    public final <O> dw2<O> mo11315a(Callable<O> callable) {
        qb3<V> c = rb3.m16125c(this.f15782b);
        cc3<C> a = c.mo10266a(sv2.f14600a, wo0.f16891f);
        ew2 ew2 = this.f15783c;
        return new dw2(ew2, this.f15781a, (String) null, a, this.f15782b, c.mo10266a(callable, ew2.f6408a), (cw2) null);
    }
}
