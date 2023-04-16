package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class ic3 extends fc3 implements ScheduledExecutorService {

    /* renamed from: g */
    final ScheduledExecutorService f8609g;

    ic3(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        Objects.requireNonNull(scheduledExecutorService);
        this.f8609g = scheduledExecutorService;
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        rc3 F = rc3.m16145F(runnable, null);
        return new gc3(F, this.f8609g.schedule(F, j, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        rc3 rc3 = new rc3(callable);
        return new gc3(rc3, this.f8609g.schedule(rc3, j, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        hc3 hc3 = new hc3(runnable);
        return new gc3(hc3, this.f8609g.scheduleAtFixedRate(hc3, j, j2, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        hc3 hc3 = new hc3(runnable);
        return new gc3(hc3, this.f8609g.scheduleWithFixedDelay(hc3, j, j2, timeUnit));
    }
}
