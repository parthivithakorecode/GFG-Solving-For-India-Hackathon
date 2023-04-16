package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class gc3<V> extends lb3<V> implements ScheduledFuture<V> {

    /* renamed from: g */
    private final ScheduledFuture<?> f7375g;

    public gc3(cc3<V> cc3, ScheduledFuture<?> scheduledFuture) {
        super(cc3);
        this.f7375g = scheduledFuture;
    }

    public final boolean cancel(boolean z) {
        boolean cancel = mo8650f().cancel(z);
        if (cancel) {
            this.f7375g.cancel(z);
        }
        return cancel;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f7375g.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.f7375g.getDelay(timeUnit);
    }
}
