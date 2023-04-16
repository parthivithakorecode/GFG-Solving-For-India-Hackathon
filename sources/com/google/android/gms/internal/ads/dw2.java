package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class dw2<O> {

    /* renamed from: a */
    private final Object f5954a;

    /* renamed from: b */
    private final String f5955b;

    /* renamed from: c */
    private final cc3<?> f5956c;

    /* renamed from: d */
    private final List<cc3<?>> f5957d;

    /* renamed from: e */
    private final cc3<O> f5958e;

    /* renamed from: f */
    final /* synthetic */ ew2 f5959f;

    private dw2(ew2 ew2, ew2 ew22, String str, cc3 cc3, List<cc3> list, cc3<O> cc32) {
        this.f5959f = ew2;
        this.f5954a = ew22;
        this.f5955b = str;
        this.f5956c = cc3;
        this.f5957d = list;
        this.f5958e = cc32;
    }

    /* synthetic */ dw2(ew2 ew2, Object obj, String str, cc3 cc3, List list, cc3 cc32, cw2 cw2) {
        this(ew2, obj, (String) null, cc3, list, cc32);
    }

    /* renamed from: a */
    public final rv2 mo6681a() {
        Object obj = this.f5954a;
        String str = this.f5955b;
        if (str == null) {
            str = this.f5959f.mo7177f(obj);
        }
        rv2 rv2 = new rv2(obj, str, this.f5958e);
        this.f5959f.f6410c.mo7412R(rv2);
        cc3<?> cc3 = this.f5956c;
        aw2 aw2 = new aw2(this, rv2);
        dc3 dc3 = wo0.f16891f;
        cc3.mo5905b(aw2, dc3);
        rb3.m16140r(rv2, new bw2(this, rv2), dc3);
        return rv2;
    }

    /* renamed from: b */
    public final dw2<O> mo6682b(Object obj) {
        return this.f5959f.mo7176b(obj, mo6681a());
    }

    /* renamed from: c */
    public final <T extends Throwable> dw2<O> mo6683c(Class<T> cls, xa3<T, O> xa3) {
        ew2 ew2 = this.f5959f;
        return new dw2(ew2, this.f5954a, this.f5955b, this.f5956c, this.f5957d, rb3.m16129g(this.f5958e, cls, xa3, ew2.f6408a));
    }

    /* renamed from: d */
    public final <O2> dw2<O2> mo6684d(cc3<O2> cc3) {
        return mo6687g(new zv2(cc3), wo0.f16891f);
    }

    /* renamed from: e */
    public final <O2> dw2<O2> mo6685e(pv2<O, O2> pv2) {
        return mo6686f(new xv2(pv2));
    }

    /* renamed from: f */
    public final <O2> dw2<O2> mo6686f(xa3<O, O2> xa3) {
        return mo6687g(xa3, this.f5959f.f6408a);
    }

    /* renamed from: g */
    public final <O2> dw2<O2> mo6687g(xa3<O, O2> xa3, Executor executor) {
        return new dw2(this.f5959f, this.f5954a, this.f5955b, this.f5956c, this.f5957d, rb3.m16136n(this.f5958e, xa3, executor));
    }

    /* renamed from: h */
    public final dw2<O> mo6688h(String str) {
        return new dw2(this.f5959f, this.f5954a, str, this.f5956c, this.f5957d, this.f5958e);
    }

    /* renamed from: i */
    public final dw2<O> mo6689i(long j, TimeUnit timeUnit) {
        ew2 ew2 = this.f5959f;
        return new dw2(ew2, this.f5954a, this.f5955b, this.f5956c, this.f5957d, rb3.m16137o(this.f5958e, j, timeUnit, ew2.f6409b));
    }
}
