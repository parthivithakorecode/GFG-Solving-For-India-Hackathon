package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p054h1.C2694t;
import p069j1.C3208t1;

public final class gw1 {

    /* renamed from: a */
    private final C3208t1 f7628a;

    /* renamed from: b */
    private final List<Map<String, String>> f7629b = new ArrayList();

    /* renamed from: c */
    private boolean f7630c = false;

    /* renamed from: d */
    private boolean f7631d = false;

    /* renamed from: e */
    private final String f7632e;

    /* renamed from: f */
    private final cw1 f7633f;

    public gw1(String str, cw1 cw1) {
        this.f7632e = str;
        this.f7633f = cw1;
        this.f7628a = C2694t.m21607p().mo11025h();
    }

    /* renamed from: f */
    private final Map<String, String> m10024f() {
        Map<String, String> c = this.f7633f.mo6312c();
        c.put("tms", Long.toString(C2694t.m21592a().mo12463b(), 10));
        c.put("tid", this.f7628a.mo14078J() ? "" : this.f7632e);
        return c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo7720a(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10645x1     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = r1.mo8579b(r0)     // Catch:{ all -> 0x0044 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0044 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0042
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10592q6     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = r1.mo8579b(r0)     // Catch:{ all -> 0x0044 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0044 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0026
            goto L_0x0042
        L_0x0026:
            java.util.Map r0 = r3.m10024f()     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = "action"
            java.lang.String r2 = "adapter_init_finished"
            r0.put(r1, r2)     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = "ancn"
            r0.put(r1, r4)     // Catch:{ all -> 0x0044 }
            java.lang.String r4 = "rqe"
            r0.put(r4, r5)     // Catch:{ all -> 0x0044 }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r4 = r3.f7629b     // Catch:{ all -> 0x0044 }
            r4.add(r0)     // Catch:{ all -> 0x0044 }
            monitor-exit(r3)
            return
        L_0x0042:
            monitor-exit(r3)
            return
        L_0x0044:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gw1.mo7720a(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo7721b(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10645x1     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x003f }
            java.lang.Object r0 = r1.mo8579b(r0)     // Catch:{ all -> 0x003f }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003f }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x003d
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10592q6     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x003f }
            java.lang.Object r0 = r1.mo8579b(r0)     // Catch:{ all -> 0x003f }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003f }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0026
            goto L_0x003d
        L_0x0026:
            java.util.Map r0 = r3.m10024f()     // Catch:{ all -> 0x003f }
            java.lang.String r1 = "action"
            java.lang.String r2 = "adapter_init_started"
            r0.put(r1, r2)     // Catch:{ all -> 0x003f }
            java.lang.String r1 = "ancn"
            r0.put(r1, r4)     // Catch:{ all -> 0x003f }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r4 = r3.f7629b     // Catch:{ all -> 0x003f }
            r4.add(r0)     // Catch:{ all -> 0x003f }
            monitor-exit(r3)
            return
        L_0x003d:
            monitor-exit(r3)
            return
        L_0x003f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gw1.mo7721b(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo7722c(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10645x1     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x003f }
            java.lang.Object r0 = r1.mo8579b(r0)     // Catch:{ all -> 0x003f }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003f }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x003d
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10592q6     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x003f }
            java.lang.Object r0 = r1.mo8579b(r0)     // Catch:{ all -> 0x003f }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003f }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0026
            goto L_0x003d
        L_0x0026:
            java.util.Map r0 = r3.m10024f()     // Catch:{ all -> 0x003f }
            java.lang.String r1 = "action"
            java.lang.String r2 = "adapter_init_finished"
            r0.put(r1, r2)     // Catch:{ all -> 0x003f }
            java.lang.String r1 = "ancn"
            r0.put(r1, r4)     // Catch:{ all -> 0x003f }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r4 = r3.f7629b     // Catch:{ all -> 0x003f }
            r4.add(r0)     // Catch:{ all -> 0x003f }
            monitor-exit(r3)
            return
        L_0x003d:
            monitor-exit(r3)
            return
        L_0x003f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gw1.mo7722c(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo7723d() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10645x1     // Catch:{ all -> 0x005b }
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x005b }
            java.lang.Object r0 = r1.mo8579b(r0)     // Catch:{ all -> 0x005b }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005b }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0059
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10592q6     // Catch:{ all -> 0x005b }
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x005b }
            java.lang.Object r0 = r1.mo8579b(r0)     // Catch:{ all -> 0x005b }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005b }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0026
            goto L_0x0059
        L_0x0026:
            boolean r0 = r3.f7631d     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x0057
            java.util.Map r0 = r3.m10024f()     // Catch:{ all -> 0x005b }
            java.lang.String r1 = "action"
            java.lang.String r2 = "init_finished"
            r0.put(r1, r2)     // Catch:{ all -> 0x005b }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r1 = r3.f7629b     // Catch:{ all -> 0x005b }
            r1.add(r0)     // Catch:{ all -> 0x005b }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r0 = r3.f7629b     // Catch:{ all -> 0x005b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x005b }
        L_0x0040:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x0052
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x005b }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x005b }
            com.google.android.gms.internal.ads.cw1 r2 = r3.f7633f     // Catch:{ all -> 0x005b }
            r2.mo7174b(r1)     // Catch:{ all -> 0x005b }
            goto L_0x0040
        L_0x0052:
            r0 = 1
            r3.f7631d = r0     // Catch:{ all -> 0x005b }
            monitor-exit(r3)
            return
        L_0x0057:
            monitor-exit(r3)
            return
        L_0x0059:
            monitor-exit(r3)
            return
        L_0x005b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gw1.mo7723d():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo7724e() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10645x1     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r1.mo8579b(r0)     // Catch:{ all -> 0x0043 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0043 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0041
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10592q6     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r1.mo8579b(r0)     // Catch:{ all -> 0x0043 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0043 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0026
            goto L_0x0041
        L_0x0026:
            boolean r0 = r3.f7630c     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x003f
            java.util.Map r0 = r3.m10024f()     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = "action"
            java.lang.String r2 = "init_started"
            r0.put(r1, r2)     // Catch:{ all -> 0x0043 }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r1 = r3.f7629b     // Catch:{ all -> 0x0043 }
            r1.add(r0)     // Catch:{ all -> 0x0043 }
            r0 = 1
            r3.f7630c = r0     // Catch:{ all -> 0x0043 }
            monitor-exit(r3)
            return
        L_0x003f:
            monitor-exit(r3)
            return
        L_0x0041:
            monitor-exit(r3)
            return
        L_0x0043:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gw1.mo7724e():void");
    }
}
