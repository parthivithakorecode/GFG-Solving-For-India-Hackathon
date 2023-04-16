package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.util.Pair;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class lc2 implements td1, lc1, ya1, qb1, C2420yu, va1, jd1, C1700fe, mb1, pi1 {

    /* renamed from: f */
    private final AtomicReference<C2459zw> f9996f = new AtomicReference<>();

    /* renamed from: g */
    private final AtomicReference<C2274ux> f9997g = new AtomicReference<>();

    /* renamed from: h */
    private final AtomicReference<C2350wy> f9998h = new AtomicReference<>();

    /* renamed from: i */
    private final AtomicReference<C1644dx> f9999i = new AtomicReference<>();

    /* renamed from: j */
    private final AtomicReference<C1571by> f10000j = new AtomicReference<>();

    /* renamed from: k */
    private final AtomicBoolean f10001k = new AtomicBoolean(true);

    /* renamed from: l */
    private final AtomicBoolean f10002l = new AtomicBoolean(false);

    /* renamed from: m */
    private final AtomicBoolean f10003m = new AtomicBoolean(false);

    /* renamed from: n */
    private final xw2 f10004n;

    /* renamed from: o */
    final BlockingQueue<Pair<String, String>> f10005o = new ArrayBlockingQueue(((Integer) C2199sw.m17001c().mo8579b(m10.f10650x6)).intValue());

    public lc2(xw2 xw2) {
        this.f10004n = xw2;
    }

    @TargetApi(5)
    /* renamed from: Q */
    private final void m12664Q() {
        if (this.f10002l.get() && this.f10003m.get()) {
            for (Pair tb2 : this.f10005o) {
                ro2.m16376a(this.f9997g, new tb2(tb2));
            }
            this.f10005o.clear();
            this.f10001k.set(false);
        }
    }

    /* renamed from: B */
    public final void mo8921B(C2274ux uxVar) {
        this.f9997g.set(uxVar);
        this.f10002l.set(true);
        m12664Q();
    }

    /* renamed from: B0 */
    public final void mo8177B0(C1605cv cvVar) {
        ro2.m16376a(this.f10000j, new fc2(cvVar));
    }

    /* renamed from: D */
    public final void mo8922D(C1571by byVar) {
        this.f10000j.set(byVar);
    }

    /* renamed from: L */
    public final void mo25L() {
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10557m7)).booleanValue()) {
            ro2.m16376a(this.f9996f, ic2.f8608a);
        }
    }

    /* renamed from: a */
    public final synchronized C2459zw mo8923a() {
        return this.f9996f.get();
    }

    /* renamed from: b */
    public final synchronized C2274ux mo8924b() {
        return this.f9997g.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        return;
     */
    @android.annotation.TargetApi(5)
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo7303c(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f10001k     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0036
            java.util.concurrent.BlockingQueue<android.util.Pair<java.lang.String, java.lang.String>> r0 = r3.f10005o     // Catch:{ all -> 0x0042 }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x0042 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.offer(r1)     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = "The queue for app events is full, dropping the new event."
            com.google.android.gms.internal.ads.io0.m11126b(r0)     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.xw2 r0 = r3.f10004n     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0034
            java.lang.String r1 = "dae_action"
            com.google.android.gms.internal.ads.ww2 r1 = com.google.android.gms.internal.ads.ww2.m19233b(r1)     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "dae_name"
            r1.mo11742a(r2, r4)     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = "dae_data"
            r1.mo11742a(r4, r5)     // Catch:{ all -> 0x0042 }
            r0.mo5981a(r1)     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)
            return
        L_0x0034:
            monitor-exit(r3)
            return
        L_0x0036:
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.internal.ads.ux> r0 = r3.f9997g     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.hc2 r1 = new com.google.android.gms.internal.ads.hc2     // Catch:{ all -> 0x0042 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.ro2.m16376a(r0, r1)     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)
            return
        L_0x0042:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lc2.mo7303c(java.lang.String, java.lang.String):void");
    }

    /* renamed from: d */
    public final void mo7808d(C1605cv cvVar) {
        ro2.m16376a(this.f9996f, new cc2(cvVar));
        ro2.m16376a(this.f9996f, new dc2(cvVar));
        ro2.m16376a(this.f9999i, new ec2(cvVar));
        this.f10001k.set(false);
        this.f10005o.clear();
    }

    /* renamed from: e */
    public final void mo5297e() {
    }

    /* renamed from: f */
    public final void mo8925f(C2459zw zwVar) {
        this.f9996f.set(zwVar);
    }

    /* renamed from: h */
    public final void mo5298h(mj0 mj0, String str, String str2) {
    }

    /* renamed from: i */
    public final void mo5299i() {
        ro2.m16376a(this.f9996f, jc2.f9091a);
        ro2.m16376a(this.f10000j, zb2.f18146a);
    }

    /* renamed from: k */
    public final void mo5153k() {
        ro2.m16376a(this.f9996f, kc2.f9477a);
    }

    /* renamed from: m */
    public final synchronized void mo8445m() {
        ro2.m16376a(this.f9996f, vb2.f16154a);
        ro2.m16376a(this.f9999i, xb2.f17104a);
        this.f10003m.set(true);
        m12664Q();
    }

    /* renamed from: n */
    public final void mo5300n() {
        ro2.m16376a(this.f9996f, wb2.f16779a);
        ro2.m16376a(this.f10000j, bc2.f4848a);
        ro2.m16376a(this.f10000j, ac2.f4069a);
    }

    /* renamed from: n0 */
    public final void mo6025n0(vi0 vi0) {
    }

    /* renamed from: o */
    public final void mo5301o() {
        ro2.m16376a(this.f9996f, ub2.f15495a);
    }

    /* renamed from: q */
    public final void mo6026q(ds2 ds2) {
        this.f10001k.set(true);
        this.f10003m.set(false);
    }

    /* renamed from: r */
    public final void mo8182r() {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10557m7)).booleanValue()) {
            ro2.m16376a(this.f9996f, ic2.f8608a);
        }
        ro2.m16376a(this.f10000j, yb2.f17658a);
    }

    /* renamed from: s */
    public final void mo8183s(C2161rv rvVar) {
        ro2.m16376a(this.f9998h, new gc2(rvVar));
    }

    /* renamed from: t */
    public final void mo5302t() {
    }

    /* renamed from: y */
    public final void mo8926y(C1644dx dxVar) {
        this.f9999i.set(dxVar);
    }

    /* renamed from: z */
    public final void mo8927z(C2350wy wyVar) {
        this.f9998h.set(wyVar);
    }
}
