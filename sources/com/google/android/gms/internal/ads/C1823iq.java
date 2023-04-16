package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;
import p003a2.C0052c;
import p054h1.C2694t;
import p069j1.C3163g2;

/* renamed from: com.google.android.gms.internal.ads.iq */
public final class C1823iq {

    /* renamed from: a */
    private final Runnable f8753a = new C1675eq(this);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f8754b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: c */
    public C1934lq f8755c;
    @GuardedBy("lock")

    /* renamed from: d */
    private Context f8756d;
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: e */
    public C2045oq f8757e;

    /* renamed from: h */
    static /* bridge */ /* synthetic */ void m11186h(C1823iq iqVar) {
        synchronized (iqVar.f8754b) {
            C1934lq lqVar = iqVar.f8755c;
            if (lqVar != null) {
                if (lqVar.mo173a() || iqVar.f8755c.mo179j()) {
                    iqVar.f8755c.mo184o();
                }
                iqVar.f8755c = null;
                iqVar.f8757e = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m11188l() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f8754b
            monitor-enter(r0)
            android.content.Context r1 = r3.f8756d     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.lq r1 = r3.f8755c     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0021
        L_0x000c:
            com.google.android.gms.internal.ads.gq r1 = new com.google.android.gms.internal.ads.gq     // Catch:{ all -> 0x0023 }
            r1.<init>(r3)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.hq r2 = new com.google.android.gms.internal.ads.hq     // Catch:{ all -> 0x0023 }
            r2.<init>(r3)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.lq r1 = r3.mo8236d(r1, r2)     // Catch:{ all -> 0x0023 }
            r3.f8755c = r1     // Catch:{ all -> 0x0023 }
            r1.mo186q()     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1823iq.m11188l():void");
    }

    /* renamed from: a */
    public final long mo8234a(C1971mq mqVar) {
        synchronized (this.f8754b) {
            if (this.f8757e == null) {
                return -2;
            }
            if (this.f8755c.mo8988i0()) {
                try {
                    long b3 = this.f8757e.mo9834b3(mqVar);
                    return b3;
                } catch (RemoteException e) {
                    io0.m11129e("Unable to call into cache service.", e);
                    return -2;
                }
            }
        }
    }

    /* renamed from: b */
    public final C1860jq mo8235b(C1971mq mqVar) {
        synchronized (this.f8754b) {
            if (this.f8757e == null) {
                C1860jq jqVar = new C1860jq();
                return jqVar;
            }
            try {
                if (this.f8755c.mo8988i0()) {
                    C1860jq P4 = this.f8757e.mo9833P4(mqVar);
                    return P4;
                }
                C1860jq M3 = this.f8757e.mo9832M3(mqVar);
                return M3;
            } catch (RemoteException e) {
                io0.m11129e("Unable to call into cache service.", e);
                return new C1860jq();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final synchronized C1934lq mo8236d(C0052c.C0053a aVar, C0052c.C0054b bVar) {
        return new C1934lq(this.f8756d, C2694t.m21612u().mo13974b(), aVar, bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8237i(android.content.Context r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Object r0 = r2.f8754b
            monitor-enter(r0)
            android.content.Context r1 = r2.f8756d     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x000c:
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0048 }
            r2.f8756d = r3     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.m10.f10324L2     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.mo8579b(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0028
            r2.m11188l()     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0028:
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.m10.f10316K2     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.mo8579b(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.fq r3 = new com.google.android.gms.internal.ads.fq     // Catch:{ all -> 0x0048 }
            r3.<init>(r2)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.to r1 = p054h1.C2694t.m21594c()     // Catch:{ all -> 0x0048 }
            r1.mo11040c(r3)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1823iq.mo8237i(android.content.Context):void");
    }

    /* renamed from: j */
    public final void mo8238j() {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10332M2)).booleanValue()) {
            synchronized (this.f8754b) {
                m11188l();
                s33 s33 = C3163g2.f20465i;
                s33.removeCallbacks(this.f8753a);
                s33.postDelayed(this.f8753a, ((Long) C2199sw.m17001c().mo8579b(m10.f10340N2)).longValue());
            }
        }
    }
}
