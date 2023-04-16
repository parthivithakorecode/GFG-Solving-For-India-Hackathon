package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.internal.ads.o6 */
final class C2025o6 implements C2432z5 {

    /* renamed from: a */
    private final Map<String, List<C1506a6<?>>> f11907a = new HashMap();

    /* renamed from: b */
    private final C1950m5 f11908b;

    /* renamed from: c */
    private final BlockingQueue<C1506a6<?>> f11909c;

    /* renamed from: d */
    private final C2135r5 f11910d;

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.m5, java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.a6<?>>] */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.r5, java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.a6<?>>] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C2025o6(com.google.android.gms.internal.ads.C1950m5 r1, com.google.android.gms.internal.ads.C1950m5 r2, java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.C1506a6<?>> r3, com.google.android.gms.internal.ads.C2135r5 r4) {
        /*
            r0 = this;
            r0.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r0.f11907a = r4
            r0.f11910d = r3
            r0.f11908b = r1
            r0.f11909c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2025o6.<init>(com.google.android.gms.internal.ads.m5, java.util.concurrent.BlockingQueue, com.google.android.gms.internal.ads.r5, byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo9688a(com.google.android.gms.internal.ads.C1506a6<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r6 = r6.mo5118k()     // Catch:{ all -> 0x0062 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.a6<?>>> r0 = r5.f11907a     // Catch:{ all -> 0x0062 }
            java.lang.Object r0 = r0.remove(r6)     // Catch:{ all -> 0x0062 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0060
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x0060
            boolean r1 = com.google.android.gms.internal.ads.C1988n6.f11315b     // Catch:{ all -> 0x0062 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x002f
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0062 }
            int r4 = r0.size()     // Catch:{ all -> 0x0062 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0062 }
            r1[r3] = r4     // Catch:{ all -> 0x0062 }
            r1[r2] = r6     // Catch:{ all -> 0x0062 }
            java.lang.String r4 = "%d waiting requests for cacheKey=%s; resend to network"
            com.google.android.gms.internal.ads.C1988n6.m13726d(r4, r1)     // Catch:{ all -> 0x0062 }
        L_0x002f:
            java.lang.Object r1 = r0.remove(r3)     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.ads.a6 r1 = (com.google.android.gms.internal.ads.C1506a6) r1     // Catch:{ all -> 0x0062 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.a6<?>>> r4 = r5.f11907a     // Catch:{ all -> 0x0062 }
            r4.put(r6, r0)     // Catch:{ all -> 0x0062 }
            r1.mo5130v(r5)     // Catch:{ all -> 0x0062 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.a6<?>> r6 = r5.f11909c     // Catch:{ InterruptedException -> 0x0044 }
            r6.put(r1)     // Catch:{ InterruptedException -> 0x0044 }
            monitor-exit(r5)
            return
        L_0x0044:
            r6 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0062 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0062 }
            r0[r3] = r6     // Catch:{ all -> 0x0062 }
            java.lang.String r6 = "Couldn't add request to queue. %s"
            com.google.android.gms.internal.ads.C1988n6.m13724b(r6, r0)     // Catch:{ all -> 0x0062 }
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0062 }
            r6.interrupt()     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.ads.m5 r6 = r5.f11908b     // Catch:{ all -> 0x0062 }
            r6.mo9129b()     // Catch:{ all -> 0x0062 }
            monitor-exit(r5)
            return
        L_0x0060:
            monitor-exit(r5)
            return
        L_0x0062:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2025o6.mo9688a(com.google.android.gms.internal.ads.a6):void");
    }

    /* renamed from: b */
    public final void mo9689b(C1506a6<?> a6Var, C1729g6<?> g6Var) {
        List<C1506a6> remove;
        C1839j5 j5Var = g6Var.f7279b;
        if (j5Var == null || j5Var.mo8344a(System.currentTimeMillis())) {
            mo9688a(a6Var);
            return;
        }
        String k = a6Var.mo5118k();
        synchronized (this) {
            remove = this.f11907a.remove(k);
        }
        if (remove != null) {
            if (C1988n6.f11315b) {
                C1988n6.m13726d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), k);
            }
            for (C1506a6 b : remove) {
                this.f11910d.mo10482b(b, g6Var, (Runnable) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo9690c(com.google.android.gms.internal.ads.C1506a6<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = r6.mo5118k()     // Catch:{ all -> 0x0052 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.a6<?>>> r1 = r5.f11907a     // Catch:{ all -> 0x0052 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0052 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x003a
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.a6<?>>> r1 = r5.f11907a     // Catch:{ all -> 0x0052 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0052 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0052 }
            if (r1 != 0) goto L_0x001e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0052 }
            r1.<init>()     // Catch:{ all -> 0x0052 }
        L_0x001e:
            java.lang.String r4 = "waiting-for-response"
            r6.mo5121n(r4)     // Catch:{ all -> 0x0052 }
            r1.add(r6)     // Catch:{ all -> 0x0052 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.a6<?>>> r6 = r5.f11907a     // Catch:{ all -> 0x0052 }
            r6.put(r0, r1)     // Catch:{ all -> 0x0052 }
            boolean r6 = com.google.android.gms.internal.ads.C1988n6.f11315b     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0038
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
            r6[r3] = r0     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "Request for cacheKey=%s is in flight, putting on hold."
            com.google.android.gms.internal.ads.C1988n6.m13723a(r0, r6)     // Catch:{ all -> 0x0052 }
        L_0x0038:
            monitor-exit(r5)
            return r2
        L_0x003a:
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.a6<?>>> r1 = r5.f11907a     // Catch:{ all -> 0x0052 }
            r4 = 0
            r1.put(r0, r4)     // Catch:{ all -> 0x0052 }
            r6.mo5130v(r5)     // Catch:{ all -> 0x0052 }
            boolean r6 = com.google.android.gms.internal.ads.C1988n6.f11315b     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0050
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
            r6[r3] = r0     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "new request, sending to network %s"
            com.google.android.gms.internal.ads.C1988n6.m13723a(r0, r6)     // Catch:{ all -> 0x0052 }
        L_0x0050:
            monitor-exit(r5)
            return r3
        L_0x0052:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2025o6.mo9690c(com.google.android.gms.internal.ads.a6):boolean");
    }
}
