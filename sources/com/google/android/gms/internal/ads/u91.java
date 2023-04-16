package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class u91 implements va1, zh1, vf1, mb1 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ob1 f15469f;

    /* renamed from: g */
    private final rr2 f15470g;

    /* renamed from: h */
    private final ScheduledExecutorService f15471h;

    /* renamed from: i */
    private final Executor f15472i;

    /* renamed from: j */
    private final kc3<Boolean> f15473j = kc3.m12110E();

    /* renamed from: k */
    private ScheduledFuture<?> f15474k;

    public u91(ob1 ob1, rr2 rr2, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f15469f = ob1;
        this.f15470g = rr2;
        this.f15471h = scheduledExecutorService;
        this.f15472i = executor;
    }

    /* renamed from: B0 */
    public final synchronized void mo8177B0(C1605cv cvVar) {
        if (!this.f15473j.isDone()) {
            ScheduledFuture<?> scheduledFuture = this.f15474k;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f15473j.mo7555x(new Exception());
        }
    }

    /* renamed from: b */
    public final void mo11193b() {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10497g1)).booleanValue()) {
            rr2 rr2 = this.f15470g;
            if (rr2.f13879V != 2) {
                return;
            }
            if (rr2.f13912r == 0) {
                this.f15469f.zza();
                return;
            }
            rb3.m16140r(this.f15473j, new t91(this), this.f15472i);
            this.f15474k = this.f15471h.schedule(new s91(this), (long) this.f15470g.f13912r, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: c */
    public final void mo8024c() {
    }

    /* renamed from: d */
    public final void mo11194d() {
    }

    /* renamed from: e */
    public final void mo5297e() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo11195f() {
        synchronized (this) {
            if (!this.f15473j.isDone()) {
                this.f15473j.mo7554w(Boolean.TRUE);
            }
        }
    }

    /* renamed from: g */
    public final synchronized void mo8026g() {
        if (!this.f15473j.isDone()) {
            ScheduledFuture<?> scheduledFuture = this.f15474k;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f15473j.mo7554w(Boolean.TRUE);
        }
    }

    /* renamed from: h */
    public final void mo5298h(mj0 mj0, String str, String str2) {
    }

    /* renamed from: i */
    public final void mo5299i() {
    }

    /* renamed from: n */
    public final void mo5300n() {
        int i = this.f15470g.f13879V;
        if (i == 0 || i == 1) {
            this.f15469f.zza();
        }
    }

    /* renamed from: o */
    public final void mo5301o() {
    }

    /* renamed from: t */
    public final void mo5302t() {
    }
}
