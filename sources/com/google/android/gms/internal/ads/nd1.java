package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import p034e2.C2547d;

public final class nd1 extends lg1<od1> {

    /* renamed from: g */
    private final ScheduledExecutorService f11417g;

    /* renamed from: h */
    private final C2547d f11418h;
    @GuardedBy("this")

    /* renamed from: i */
    private long f11419i = -1;
    @GuardedBy("this")

    /* renamed from: j */
    private long f11420j = -1;
    @GuardedBy("this")

    /* renamed from: k */
    private boolean f11421k = false;
    @GuardedBy("this")

    /* renamed from: l */
    private ScheduledFuture<?> f11422l;

    public nd1(ScheduledExecutorService scheduledExecutorService, C2547d dVar) {
        super(Collections.emptySet());
        this.f11417g = scheduledExecutorService;
        this.f11418h = dVar;
    }

    /* renamed from: T0 */
    private final synchronized void m13863T0(long j) {
        ScheduledFuture<?> scheduledFuture = this.f11422l;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f11422l.cancel(true);
        }
        this.f11419i = this.f11418h.mo12463b() + j;
        this.f11422l = this.f11417g.schedule(new md1(this, (ld1) null), j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: S0 */
    public final synchronized void mo9508S0(int i) {
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis((long) i);
            if (this.f11421k) {
                long j = this.f11420j;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.f11420j = millis;
                return;
            }
            long b = this.f11418h.mo12463b();
            long j2 = this.f11419i;
            if (b > j2 || j2 - this.f11418h.mo12463b() > millis) {
                m13863T0(millis);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo9509a() {
        if (!this.f11421k) {
            ScheduledFuture<?> scheduledFuture = this.f11422l;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.f11420j = -1;
            } else {
                this.f11422l.cancel(true);
                this.f11420j = this.f11419i - this.f11418h.mo12463b();
            }
            this.f11421k = true;
        }
    }

    /* renamed from: c */
    public final synchronized void mo9510c() {
        if (this.f11421k) {
            if (this.f11420j > 0 && this.f11422l.isCancelled()) {
                m13863T0(this.f11420j);
            }
            this.f11421k = false;
        }
    }

    public final synchronized void zza() {
        this.f11421k = false;
        m13863T0(0);
    }
}
