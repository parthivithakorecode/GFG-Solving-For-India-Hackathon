package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

final class oc3<V> extends hb3<V> {
    /* access modifiers changed from: private */
    @CheckForNull

    /* renamed from: m */
    public cc3<V> f11983m;
    /* access modifiers changed from: private */
    @CheckForNull

    /* renamed from: n */
    public ScheduledFuture<?> f11984n;

    private oc3(cc3<V> cc3) {
        Objects.requireNonNull(cc3);
        this.f11983m = cc3;
    }

    /* renamed from: G */
    static <V> cc3<V> m14403G(cc3<V> cc3, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        oc3 oc3 = new oc3(cc3);
        lc3 lc3 = new lc3(oc3);
        oc3.f11984n = scheduledExecutorService.schedule(lc3, j, timeUnit);
        cc3.mo5905b(lc3, fb3.INSTANCE);
        return oc3;
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    /* renamed from: i */
    public final String mo7548i() {
        cc3<V> cc3 = this.f11983m;
        ScheduledFuture<?> scheduledFuture = this.f11984n;
        if (cc3 == null) {
            return null;
        }
        String obj = cc3.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 14);
        sb.append("inputFuture=[");
        sb.append(obj);
        sb.append("]");
        String sb2 = sb.toString();
        if (scheduledFuture == null) {
            return sb2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return sb2;
        }
        StringBuilder sb3 = new StringBuilder(sb2.length() + 43);
        sb3.append(sb2);
        sb3.append(", remaining delay=[");
        sb3.append(delay);
        sb3.append(" ms]");
        return sb3.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo7551j() {
        mo7553u(this.f11983m);
        ScheduledFuture<?> scheduledFuture = this.f11984n;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f11983m = null;
        this.f11984n = null;
    }
}
