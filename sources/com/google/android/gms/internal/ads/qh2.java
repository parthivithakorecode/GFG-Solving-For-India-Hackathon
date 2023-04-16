package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.hj2;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class qh2<S extends hj2> implements ij2<S> {

    /* renamed from: a */
    private final ij2<S> f13165a;

    /* renamed from: b */
    private final long f13166b;

    /* renamed from: c */
    private final ScheduledExecutorService f13167c;

    public qh2(ij2<S> ij2, long j, ScheduledExecutorService scheduledExecutorService) {
        this.f13165a = ij2;
        this.f13166b = j;
        this.f13167c = scheduledExecutorService;
    }

    /* renamed from: a */
    public final cc3<S> mo5813a() {
        cc3<S> a = this.f13165a.mo5813a();
        long j = this.f13166b;
        if (j > 0) {
            a = rb3.m16137o(a, j, TimeUnit.MILLISECONDS, this.f13167c);
        }
        return rb3.m16129g(a, Throwable.class, ph2.f12665a, wo0.f16891f);
    }
}
