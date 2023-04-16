package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import p034e2.C2547d;
import p054h1.C2694t;

public final class n31 implements C2191so {

    /* renamed from: a */
    private final ScheduledExecutorService f11280a;

    /* renamed from: b */
    private final C2547d f11281b;
    @GuardedBy("this")

    /* renamed from: c */
    private ScheduledFuture<?> f11282c;
    @GuardedBy("this")

    /* renamed from: d */
    private long f11283d = -1;
    @GuardedBy("this")

    /* renamed from: e */
    private long f11284e = -1;
    @GuardedBy("this")

    /* renamed from: f */
    private Runnable f11285f = null;
    @GuardedBy("this")

    /* renamed from: g */
    private boolean f11286g = false;

    public n31(ScheduledExecutorService scheduledExecutorService, C2547d dVar) {
        this.f11280a = scheduledExecutorService;
        this.f11281b = dVar;
        C2694t.m21594c().mo11040c(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo9408a() {
        if (!this.f11286g) {
            ScheduledFuture<?> scheduledFuture = this.f11282c;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.f11284e = -1;
            } else {
                this.f11282c.cancel(true);
                this.f11284e = this.f11283d - this.f11281b.mo12463b();
            }
            this.f11286g = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo9409b() {
        ScheduledFuture<?> scheduledFuture;
        if (this.f11286g) {
            if (this.f11284e > 0 && (scheduledFuture = this.f11282c) != null && scheduledFuture.isCancelled()) {
                this.f11282c = this.f11280a.schedule(this.f11285f, this.f11284e, TimeUnit.MILLISECONDS);
            }
            this.f11286g = false;
        }
    }

    /* renamed from: c */
    public final void mo7380c(boolean z) {
        if (z) {
            mo9409b();
        } else {
            mo9408a();
        }
    }

    /* renamed from: d */
    public final synchronized void mo9410d(int i, Runnable runnable) {
        this.f11285f = runnable;
        long j = (long) i;
        this.f11283d = this.f11281b.mo12463b() + j;
        this.f11282c = this.f11280a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }
}
