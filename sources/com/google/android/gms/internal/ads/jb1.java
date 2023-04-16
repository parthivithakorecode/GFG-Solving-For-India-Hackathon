package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class jb1 extends lg1<za1> implements za1 {

    /* renamed from: g */
    private final ScheduledExecutorService f9077g;

    /* renamed from: h */
    private ScheduledFuture<?> f9078h;

    /* renamed from: i */
    private boolean f9079i = false;

    /* renamed from: j */
    private final boolean f9080j;

    public jb1(ib1 ib1, Set<hi1<za1>> set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f9077g = scheduledExecutorService;
        this.f9080j = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10521i7)).booleanValue();
        mo8945B0(ib1, executor);
    }

    /* renamed from: S0 */
    public final void mo8441S0() {
        if (this.f9080j) {
            this.f9078h = this.f9077g.schedule(new db1(this), (long) ((Integer) C2199sw.m17001c().mo8579b(m10.f10530j7)).intValue(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    public final void mo8023a() {
        mo8947Q0(cb1.f5364a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo8442c() {
        synchronized (this) {
            io0.m11128d("Timeout waiting for show call succeed to be called.");
            mo8027q0(new ok1("Timeout for show call succeed."));
            this.f9079i = true;
        }
    }

    /* renamed from: d */
    public final void mo8025d(C1605cv cvVar) {
        mo8947Q0(new ab1(cvVar));
    }

    /* renamed from: g */
    public final synchronized void mo8443g() {
        if (this.f9080j) {
            ScheduledFuture<?> scheduledFuture = this.f9078h;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
    }

    /* renamed from: q0 */
    public final void mo8027q0(ok1 ok1) {
        if (this.f9080j) {
            if (!this.f9079i) {
                ScheduledFuture<?> scheduledFuture = this.f9078h;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
            } else {
                return;
            }
        }
        mo8947Q0(new bb1(ok1));
    }
}
