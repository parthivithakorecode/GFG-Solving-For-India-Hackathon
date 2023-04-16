package com.google.android.gms.internal.ads;

import javax.annotation.concurrent.GuardedBy;
import p034e2.C2547d;

public final class qr2 {

    /* renamed from: a */
    private final C2547d f13292a;

    /* renamed from: b */
    private final Object f13293b = new Object();

    /* renamed from: c */
    private volatile long f13294c = 0;
    @GuardedBy("lock")

    /* renamed from: d */
    private volatile int f13295d = 1;

    public qr2(C2547d dVar) {
        this.f13292a = dVar;
    }

    /* renamed from: e */
    private final void m15837e() {
        long a = this.f13292a.mo12462a();
        synchronized (this.f13293b) {
            if (this.f13295d == 3) {
                if (this.f13294c + ((Long) C2199sw.m17001c().mo8579b(m10.f10608s4)).longValue() <= a) {
                    this.f13295d = 1;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m15838f(int r5, int r6) {
        /*
            r4 = this;
            r4.m15837e()
            e2.d r0 = r4.f13292a
            long r0 = r0.mo12462a()
            java.lang.Object r2 = r4.f13293b
            monitor-enter(r2)
            int r3 = r4.f13295d     // Catch:{ all -> 0x001d }
            if (r3 == r5) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            return
        L_0x0012:
            r4.f13295d = r6     // Catch:{ all -> 0x001d }
            int r5 = r4.f13295d     // Catch:{ all -> 0x001d }
            r6 = 3
            if (r5 != r6) goto L_0x001b
            r4.f13294c = r0     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qr2.m15838f(int, int):void");
    }

    /* renamed from: a */
    public final void mo10373a() {
        m15838f(2, 3);
    }

    /* renamed from: b */
    public final void mo10374b(boolean z) {
        if (z) {
            m15838f(1, 2);
        } else {
            m15838f(2, 1);
        }
    }

    /* renamed from: c */
    public final boolean mo10375c() {
        boolean z;
        synchronized (this.f13293b) {
            m15837e();
            z = this.f13295d == 3;
        }
        return z;
    }

    /* renamed from: d */
    public final boolean mo10376d() {
        boolean z;
        synchronized (this.f13293b) {
            m15837e();
            z = this.f13295d == 2;
        }
        return z;
    }
}
