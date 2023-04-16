package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.internal.ads.m5 */
public final class C1950m5 extends Thread {

    /* renamed from: l */
    private static final boolean f10722l = C1988n6.f11315b;

    /* renamed from: f */
    private final BlockingQueue<C1506a6<?>> f10723f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final BlockingQueue<C1506a6<?>> f10724g;

    /* renamed from: h */
    private final C1876k5 f10725h;

    /* renamed from: i */
    private volatile boolean f10726i = false;

    /* renamed from: j */
    private final C2025o6 f10727j;

    /* renamed from: k */
    private final C2135r5 f10728k;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.a6<?>>, com.google.android.gms.internal.ads.k5] */
    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.r5, com.google.android.gms.internal.ads.k5] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1950m5(java.util.concurrent.BlockingQueue r1, java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.C1506a6<?>> r2, java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.C1506a6<?>> r3, com.google.android.gms.internal.ads.C1876k5 r4, com.google.android.gms.internal.ads.C2135r5 r5) {
        /*
            r0 = this;
            r0.<init>()
            r5 = 0
            r0.f10726i = r5
            r0.f10723f = r1
            r0.f10724g = r2
            r0.f10725h = r3
            r0.f10728k = r4
            com.google.android.gms.internal.ads.o6 r1 = new com.google.android.gms.internal.ads.o6
            r3 = 0
            r1.<init>(r0, r2, r4, r3)
            r0.f10727j = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1950m5.<init>(java.util.concurrent.BlockingQueue, java.util.concurrent.BlockingQueue, com.google.android.gms.internal.ads.k5, com.google.android.gms.internal.ads.r5, byte[]):void");
    }

    /* renamed from: c */
    private void m13057c() {
        C2135r5 r5Var;
        C1506a6 take = this.f10723f.take();
        take.mo5121n("cache-queue-take");
        take.mo5129u(1);
        try {
            take.mo5132x();
            C1839j5 b = this.f10725h.mo8616b(take.mo5118k());
            if (b == null) {
                take.mo5121n("cache-miss");
                if (!this.f10727j.mo9690c(take)) {
                    this.f10724g.put(take);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (b.mo8344a(currentTimeMillis)) {
                take.mo5121n("cache-hit-expired");
                take.mo5114f(b);
                if (!this.f10727j.mo9690c(take)) {
                    this.f10724g.put(take);
                }
                take.mo5129u(2);
                return;
            }
            take.mo5121n("cache-hit");
            C1729g6 i = take.mo5117i(new C2320w5(b.f8983a, b.f8989g));
            take.mo5121n("cache-hit-parsed");
            if (!i.mo7509c()) {
                take.mo5121n("cache-parsing-failed");
                this.f10725h.mo8617c(take.mo5118k(), true);
                take.mo5114f((C1839j5) null);
                if (!this.f10727j.mo9690c(take)) {
                    this.f10724g.put(take);
                }
                take.mo5129u(2);
                return;
            }
            if (b.f8988f < currentTimeMillis) {
                take.mo5121n("cache-hit-refresh-needed");
                take.mo5114f(b);
                i.f7281d = true;
                if (!this.f10727j.mo9690c(take)) {
                    this.f10728k.mo10482b(take, i, new C1913l5(this, take));
                    take.mo5129u(2);
                }
                r5Var = this.f10728k;
            } else {
                r5Var = this.f10728k;
            }
            r5Var.mo10482b(take, i, (Runnable) null);
            take.mo5129u(2);
        } finally {
            take.mo5129u(2);
        }
    }

    /* renamed from: b */
    public final void mo9129b() {
        this.f10726i = true;
        interrupt();
    }

    public final void run() {
        if (f10722l) {
            C1988n6.m13726d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f10725h.mo8615a();
        while (true) {
            try {
                m13057c();
            } catch (InterruptedException unused) {
                if (this.f10726i) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C1988n6.m13724b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
