package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.internal.ads.u5 */
public final class C2246u5 extends Thread {

    /* renamed from: f */
    private final BlockingQueue<C1506a6<?>> f15400f;

    /* renamed from: g */
    private final C2209t5 f15401g;

    /* renamed from: h */
    private final C1876k5 f15402h;

    /* renamed from: i */
    private volatile boolean f15403i = false;

    /* renamed from: j */
    private final C2135r5 f15404j;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.a6<?>>, com.google.android.gms.internal.ads.t5] */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.t5, com.google.android.gms.internal.ads.k5] */
    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.r5, com.google.android.gms.internal.ads.k5] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2246u5(java.util.concurrent.BlockingQueue r1, java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.C1506a6<?>> r2, com.google.android.gms.internal.ads.C2209t5 r3, com.google.android.gms.internal.ads.C1876k5 r4, com.google.android.gms.internal.ads.C2135r5 r5) {
        /*
            r0 = this;
            r0.<init>()
            r5 = 0
            r0.f15403i = r5
            r0.f15400f = r1
            r0.f15401g = r2
            r0.f15402h = r3
            r0.f15404j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2246u5.<init>(java.util.concurrent.BlockingQueue, com.google.android.gms.internal.ads.t5, com.google.android.gms.internal.ads.k5, com.google.android.gms.internal.ads.r5, byte[]):void");
    }

    /* renamed from: b */
    private void m17719b() {
        C1506a6 take = this.f15400f.take();
        SystemClock.elapsedRealtime();
        take.mo5129u(3);
        try {
            take.mo5121n("network-queue-take");
            take.mo5132x();
            TrafficStats.setThreadStatsTag(take.mo5112d());
            C2320w5 a = this.f15401g.mo6876a(take);
            take.mo5121n("network-http-complete");
            if (!a.f16712e || !take.mo5131w()) {
                C1729g6 i = take.mo5117i(a);
                take.mo5121n("network-parse-complete");
                if (i.f7279b != null) {
                    this.f15402h.mo8618d(take.mo5118k(), i.f7279b);
                    take.mo5121n("network-cache-written");
                }
                take.mo5125r();
                this.f15404j.mo10482b(take, i, (Runnable) null);
                take.mo5127t(i);
                take.mo5129u(4);
                return;
            }
            take.mo5124q("not-modified");
            take.mo5126s();
        } catch (C1877k6 e) {
            SystemClock.elapsedRealtime();
            this.f15404j.mo10481a(take, e);
            take.mo5126s();
        } catch (Exception e2) {
            C1988n6.m13725c(e2, "Unhandled exception %s", e2.toString());
            C1877k6 k6Var = new C1877k6((Throwable) e2);
            SystemClock.elapsedRealtime();
            this.f15404j.mo10481a(take, k6Var);
            take.mo5126s();
        } finally {
            take.mo5129u(4);
        }
    }

    /* renamed from: a */
    public final void mo11160a() {
        this.f15403i = true;
        interrupt();
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m17719b();
            } catch (InterruptedException unused) {
                if (this.f15403i) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C1988n6.m13724b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
