package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
public class ip0<T> {

    /* renamed from: a */
    private final bp0<T> f8747a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AtomicInteger f8748b = new AtomicInteger(0);

    public ip0() {
        bp0<T> bp0 = new bp0<>();
        this.f8747a = bp0;
        rb3.m16140r(bp0, new gp0(this), wo0.f16891f);
    }

    @Deprecated
    /* renamed from: a */
    public final int mo8193a() {
        return this.f8748b.get();
    }

    @Deprecated
    /* renamed from: c */
    public final void mo8194c() {
        this.f8747a.mo5908f(new Exception());
    }

    @Deprecated
    /* renamed from: d */
    public final void mo8195d(T t) {
        this.f8747a.mo5907e(t);
    }

    @Deprecated
    /* renamed from: e */
    public final void mo8196e(fp0<T> fp0, dp0 dp0) {
        rb3.m16140r(this.f8747a, new hp0(this, fp0, dp0), wo0.f16891f);
    }
}
