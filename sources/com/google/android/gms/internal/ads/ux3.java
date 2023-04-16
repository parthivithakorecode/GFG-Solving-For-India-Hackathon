package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

public final class ux3 {

    /* renamed from: a */
    private final tx3 f15791a;

    /* renamed from: b */
    private final sx3 f15792b;

    /* renamed from: c */
    private final xv1 f15793c;

    /* renamed from: d */
    private final ei0 f15794d;

    /* renamed from: e */
    private int f15795e;

    /* renamed from: f */
    private Object f15796f;

    /* renamed from: g */
    private final Looper f15797g;

    /* renamed from: h */
    private final int f15798h;

    /* renamed from: i */
    private boolean f15799i;

    /* renamed from: j */
    private boolean f15800j;

    /* renamed from: k */
    private boolean f15801k;

    public ux3(sx3 sx3, tx3 tx3, ei0 ei0, int i, xv1 xv1, Looper looper) {
        this.f15792b = sx3;
        this.f15791a = tx3;
        this.f15794d = ei0;
        this.f15797g = looper;
        this.f15793c = xv1;
        this.f15798h = i;
    }

    /* renamed from: a */
    public final int mo11320a() {
        return this.f15795e;
    }

    /* renamed from: b */
    public final Looper mo11321b() {
        return this.f15797g;
    }

    /* renamed from: c */
    public final tx3 mo11322c() {
        return this.f15791a;
    }

    /* renamed from: d */
    public final ux3 mo11323d() {
        wu1.m19207f(!this.f15799i);
        this.f15799i = true;
        this.f15792b.mo5557b(this);
        return this;
    }

    /* renamed from: e */
    public final ux3 mo11324e(Object obj) {
        wu1.m19207f(!this.f15799i);
        this.f15796f = obj;
        return this;
    }

    /* renamed from: f */
    public final ux3 mo11325f(int i) {
        wu1.m19207f(!this.f15799i);
        this.f15795e = i;
        return this;
    }

    /* renamed from: g */
    public final Object mo11326g() {
        return this.f15796f;
    }

    /* renamed from: h */
    public final synchronized void mo11327h(boolean z) {
        this.f15800j = z | this.f15800j;
        this.f15801k = true;
        notifyAll();
    }

    /* renamed from: i */
    public final synchronized boolean mo11328i(long j) {
        wu1.m19207f(this.f15799i);
        wu1.m19207f(this.f15797g.getThread() != Thread.currentThread());
        long j2 = 2000;
        long elapsedRealtime = SystemClock.elapsedRealtime() + 2000;
        while (!this.f15801k) {
            if (j2 > 0) {
                wait(j2);
                j2 = elapsedRealtime - SystemClock.elapsedRealtime();
            } else {
                throw new TimeoutException("Message delivery timed out.");
            }
        }
        return this.f15800j;
    }

    /* renamed from: j */
    public final synchronized boolean mo11329j() {
        return false;
    }
}
