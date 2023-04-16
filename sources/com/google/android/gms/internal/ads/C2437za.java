package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.gms.internal.ads.za */
public final class C2437za implements C1585cb {

    /* renamed from: t */
    private static C2437za f18120t;

    /* renamed from: f */
    private final Context f18121f;

    /* renamed from: g */
    private final k23 f18122g;

    /* renamed from: h */
    private final s23 f18123h;

    /* renamed from: i */
    private final u23 f18124i;

    /* renamed from: j */
    private final C1512ac f18125j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final u03 f18126k;

    /* renamed from: l */
    private final Executor f18127l;

    /* renamed from: m */
    private final r23 f18128m;

    /* renamed from: n */
    private final CountDownLatch f18129n;

    /* renamed from: o */
    volatile long f18130o = 0;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final Object f18131p = new Object();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public volatile boolean f18132q;

    /* renamed from: r */
    private volatile boolean f18133r = false;

    /* renamed from: s */
    private final int f18134s;

    C2437za(Context context, u03 u03, k23 k23, s23 s23, u23 u23, C1512ac acVar, Executor executor, p03 p03, int i) {
        this.f18121f = context;
        this.f18126k = u03;
        this.f18122g = k23;
        this.f18123h = s23;
        this.f18124i = u23;
        this.f18125j = acVar;
        this.f18127l = executor;
        this.f18134s = i;
        this.f18129n = new CountDownLatch(1);
        this.f18128m = new C2363xa(this, p03);
    }

    /* renamed from: h */
    public static synchronized C2437za m20549h(String str, Context context, boolean z, boolean z2) {
        C2437za i;
        synchronized (C2437za.class) {
            i = m20550i(str, context, Executors.newCachedThreadPool(), z, z2);
        }
        return i;
    }

    @Deprecated
    /* renamed from: i */
    public static synchronized C2437za m20550i(String str, Context context, Executor executor, boolean z, boolean z2) {
        C2437za zaVar;
        Context context2 = context;
        Executor executor2 = executor;
        synchronized (C2437za.class) {
            if (f18120t == null) {
                v03 a = w03.m18798a();
                String str2 = str;
                a.mo11361a(str);
                a.mo11363c(z);
                w03 d = a.mo11364d();
                u03 a2 = u03.m17634a(context2, executor2, z2);
                C1845jb c = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10462c2)).booleanValue() ? C1845jb.m11540c(context) : null;
                o13 e = o13.m14210e(context2, executor2, a2, d);
                C2438zb zbVar = new C2438zb(context2);
                C1512ac acVar = new C1512ac(d, e, new C1994nc(context2, zbVar), zbVar, c);
                int b = x13.m19286b(context2, a2);
                p03 p03 = new p03();
                C2437za zaVar2 = new C2437za(context, a2, new k23(context2, b), new s23(context2, b, new C2326wa(a2), ((Boolean) C2199sw.m17001c().mo8579b(m10.f10243B1)).booleanValue()), new u23(context2, acVar, a2, p03), acVar, executor, p03, b);
                f18120t = zaVar2;
                zaVar2.mo12191n();
                f18120t.mo12192o();
            }
            zaVar = f18120t;
        }
        return zaVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        if (r4.mo11451H().mo11993N().equals(r5.mo11993N()) != false) goto L_0x00f9;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* bridge */ /* synthetic */ void m20554m(com.google.android.gms.internal.ads.C2437za r12) {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1
            com.google.android.gms.internal.ads.j23 r3 = r12.m20556r(r2)
            r4 = 0
            if (r3 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.yd r4 = r3.mo8333a()
            java.lang.String r4 = r4.mo11994O()
            com.google.android.gms.internal.ads.yd r3 = r3.mo8333a()
            java.lang.String r3 = r3.mo11993N()
            r9 = r3
            r8 = r4
            goto L_0x0021
        L_0x001f:
            r8 = r4
            r9 = r8
        L_0x0021:
            android.content.Context r5 = r12.f18121f     // Catch:{ mq3 -> 0x0116 }
            r6 = 1
            int r7 = r12.f18134s     // Catch:{ mq3 -> 0x0116 }
            java.lang.String r10 = "1"
            com.google.android.gms.internal.ads.u03 r11 = r12.f18126k     // Catch:{ mq3 -> 0x0116 }
            com.google.android.gms.internal.ads.p23 r3 = com.google.android.gms.internal.ads.e13.m8277a(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ mq3 -> 0x0116 }
            byte[] r4 = r3.f12463g     // Catch:{ mq3 -> 0x0116 }
            if (r4 == 0) goto L_0x010b
            int r5 = r4.length     // Catch:{ mq3 -> 0x0116 }
            if (r5 != 0) goto L_0x0037
            goto L_0x010b
        L_0x0037:
            com.google.android.gms.internal.ads.uo3 r4 = com.google.android.gms.internal.ads.uo3.m17968I(r4)     // Catch:{ NullPointerException -> 0x0102 }
            com.google.android.gms.internal.ads.mp3 r5 = com.google.android.gms.internal.ads.mp3.m13445a()     // Catch:{ NullPointerException -> 0x0102 }
            com.google.android.gms.internal.ads.vd r4 = com.google.android.gms.internal.ads.C2291vd.m18451G(r4, r5)     // Catch:{ NullPointerException -> 0x0102 }
            com.google.android.gms.internal.ads.yd r5 = r4.mo11451H()     // Catch:{ mq3 -> 0x0116 }
            java.lang.String r5 = r5.mo11994O()     // Catch:{ mq3 -> 0x0116 }
            boolean r5 = r5.isEmpty()     // Catch:{ mq3 -> 0x0116 }
            if (r5 != 0) goto L_0x00f9
            com.google.android.gms.internal.ads.yd r5 = r4.mo11451H()     // Catch:{ mq3 -> 0x0116 }
            java.lang.String r5 = r5.mo11993N()     // Catch:{ mq3 -> 0x0116 }
            boolean r5 = r5.isEmpty()     // Catch:{ mq3 -> 0x0116 }
            if (r5 != 0) goto L_0x00f9
            com.google.android.gms.internal.ads.uo3 r5 = r4.mo11452I()     // Catch:{ mq3 -> 0x0116 }
            byte[] r5 = r5.mo11272l()     // Catch:{ mq3 -> 0x0116 }
            int r5 = r5.length     // Catch:{ mq3 -> 0x0116 }
            if (r5 != 0) goto L_0x006c
            goto L_0x00f9
        L_0x006c:
            com.google.android.gms.internal.ads.j23 r5 = r12.m20556r(r2)     // Catch:{ mq3 -> 0x0116 }
            if (r5 != 0) goto L_0x0073
            goto L_0x009b
        L_0x0073:
            com.google.android.gms.internal.ads.yd r5 = r5.mo8333a()     // Catch:{ mq3 -> 0x0116 }
            com.google.android.gms.internal.ads.yd r6 = r4.mo11451H()     // Catch:{ mq3 -> 0x0116 }
            java.lang.String r6 = r6.mo11994O()     // Catch:{ mq3 -> 0x0116 }
            java.lang.String r7 = r5.mo11994O()     // Catch:{ mq3 -> 0x0116 }
            boolean r6 = r6.equals(r7)     // Catch:{ mq3 -> 0x0116 }
            if (r6 == 0) goto L_0x009b
            com.google.android.gms.internal.ads.yd r6 = r4.mo11451H()     // Catch:{ mq3 -> 0x0116 }
            java.lang.String r6 = r6.mo11993N()     // Catch:{ mq3 -> 0x0116 }
            java.lang.String r5 = r5.mo11993N()     // Catch:{ mq3 -> 0x0116 }
            boolean r5 = r6.equals(r5)     // Catch:{ mq3 -> 0x0116 }
            if (r5 != 0) goto L_0x00f9
        L_0x009b:
            com.google.android.gms.internal.ads.r23 r5 = r12.f18128m     // Catch:{ mq3 -> 0x0116 }
            int r3 = r3.f12464h     // Catch:{ mq3 -> 0x0116 }
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.m10.f10661z1     // Catch:{ mq3 -> 0x0116 }
            com.google.android.gms.internal.ads.k10 r7 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ mq3 -> 0x0116 }
            java.lang.Object r6 = r7.mo8579b(r6)     // Catch:{ mq3 -> 0x0116 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ mq3 -> 0x0116 }
            boolean r6 = r6.booleanValue()     // Catch:{ mq3 -> 0x0116 }
            if (r6 == 0) goto L_0x00c5
            r6 = 3
            if (r3 != r6) goto L_0x00bb
            com.google.android.gms.internal.ads.s23 r3 = r12.f18123h     // Catch:{ mq3 -> 0x0116 }
            boolean r3 = r3.mo10708a(r4)     // Catch:{ mq3 -> 0x0116 }
            goto L_0x00cb
        L_0x00bb:
            r6 = 4
            if (r3 != r6) goto L_0x00cd
            com.google.android.gms.internal.ads.s23 r3 = r12.f18123h     // Catch:{ mq3 -> 0x0116 }
            boolean r3 = r3.mo10709b(r4, r5)     // Catch:{ mq3 -> 0x0116 }
            goto L_0x00cb
        L_0x00c5:
            com.google.android.gms.internal.ads.k23 r3 = r12.f18122g     // Catch:{ mq3 -> 0x0116 }
            boolean r3 = r3.mo8588b(r4, r5)     // Catch:{ mq3 -> 0x0116 }
        L_0x00cb:
            if (r3 != 0) goto L_0x00df
        L_0x00cd:
            com.google.android.gms.internal.ads.u03 r2 = r12.f18126k     // Catch:{ mq3 -> 0x0116 }
            r3 = 4009(0xfa9, float:5.618E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ mq3 -> 0x0116 }
        L_0x00d5:
            long r4 = r4 - r0
            r2.mo11133d(r3, r4)     // Catch:{ mq3 -> 0x0116 }
        L_0x00d9:
            java.util.concurrent.CountDownLatch r12 = r12.f18129n
            r12.countDown()
            return
        L_0x00df:
            com.google.android.gms.internal.ads.j23 r3 = r12.m20556r(r2)     // Catch:{ mq3 -> 0x0116 }
            if (r3 == 0) goto L_0x00d9
            com.google.android.gms.internal.ads.u23 r4 = r12.f18124i     // Catch:{ mq3 -> 0x0116 }
            boolean r3 = r4.mo11151c(r3)     // Catch:{ mq3 -> 0x0116 }
            if (r3 == 0) goto L_0x00ef
            r12.f18133r = r2     // Catch:{ mq3 -> 0x0116 }
        L_0x00ef:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ mq3 -> 0x0116 }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r12.f18130o = r2     // Catch:{ mq3 -> 0x0116 }
            goto L_0x00d9
        L_0x00f9:
            com.google.android.gms.internal.ads.u03 r2 = r12.f18126k     // Catch:{ mq3 -> 0x0116 }
            r3 = 5010(0x1392, float:7.02E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ mq3 -> 0x0116 }
            goto L_0x00d5
        L_0x0102:
            com.google.android.gms.internal.ads.u03 r2 = r12.f18126k     // Catch:{ mq3 -> 0x0116 }
            r3 = 2030(0x7ee, float:2.845E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ mq3 -> 0x0116 }
            goto L_0x00d5
        L_0x010b:
            com.google.android.gms.internal.ads.u03 r2 = r12.f18126k     // Catch:{ mq3 -> 0x0116 }
            r3 = 5009(0x1391, float:7.019E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ mq3 -> 0x0116 }
            goto L_0x00d5
        L_0x0114:
            r0 = move-exception
            goto L_0x0124
        L_0x0116:
            r2 = move-exception
            com.google.android.gms.internal.ads.u03 r3 = r12.f18126k     // Catch:{ all -> 0x0114 }
            r4 = 4002(0xfa2, float:5.608E-42)
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0114 }
            long r5 = r5 - r0
            r3.mo11132c(r4, r5, r2)     // Catch:{ all -> 0x0114 }
            goto L_0x00d9
        L_0x0124:
            java.util.concurrent.CountDownLatch r12 = r12.f18129n
            r12.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2437za.m20554m(com.google.android.gms.internal.ads.za):void");
    }

    /* renamed from: r */
    private final j23 m20556r(int i) {
        if (!x13.m19285a(this.f18134s)) {
            return null;
        }
        return ((Boolean) C2199sw.m17001c().mo8579b(m10.f10661z1)).booleanValue() ? this.f18123h.mo10710c(1) : this.f18122g.mo8590d(1);
    }

    /* renamed from: a */
    public final void mo6110a(MotionEvent motionEvent) {
        x03 a = this.f18124i.mo11149a();
        if (a != null) {
            try {
                a.mo8055b((String) null, motionEvent);
            } catch (t23 e) {
                this.f18126k.mo11132c(e.mo10933a(), -1, e);
            }
        }
    }

    /* renamed from: b */
    public final void mo6111b(View view) {
        this.f18125j.mo5225b(view);
    }

    /* renamed from: c */
    public final String mo6112c(Context context, View view, Activity activity) {
        mo12192o();
        x03 a = this.f18124i.mo11149a();
        if (a == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String d = a.mo8057d(context, (String) null, view, (Activity) null);
        this.f18126k.mo11135f(5002, System.currentTimeMillis() - currentTimeMillis, d, (Map<String, String>) null);
        return d;
    }

    /* renamed from: d */
    public final String mo6113d(Context context) {
        mo12192o();
        x03 a = this.f18124i.mo11149a();
        if (a == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a2 = a.mo8054a(context, (String) null);
        this.f18126k.mo11135f(5001, System.currentTimeMillis() - currentTimeMillis, a2, (Map<String, String>) null);
        return a2;
    }

    /* renamed from: e */
    public final void mo6114e(int i, int i2, int i3) {
    }

    /* renamed from: f */
    public final String mo6115f(Context context, String str, View view) {
        return mo6116g(context, str, view, (Activity) null);
    }

    /* renamed from: g */
    public final String mo6116g(Context context, String str, View view, Activity activity) {
        mo12192o();
        x03 a = this.f18124i.mo11149a();
        if (a == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String c = a.mo8056c(context, (String) null, str, view, activity);
        this.f18126k.mo11135f(5000, System.currentTimeMillis() - currentTimeMillis, c, (Map<String, String>) null);
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final synchronized void mo12191n() {
        long currentTimeMillis = System.currentTimeMillis();
        j23 r = m20556r(1);
        if (r == null) {
            this.f18126k.mo11133d(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.f18124i.mo11151c(r)) {
            this.f18133r = true;
            this.f18129n.countDown();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12192o() {
        /*
            r5 = this;
            boolean r0 = r5.f18132q
            if (r0 != 0) goto L_0x0042
            java.lang.Object r0 = r5.f18131p
            monitor-enter(r0)
            boolean r1 = r5.f18132q     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x003d
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003f }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            long r3 = r5.f18130o     // Catch:{ all -> 0x003f }
            long r1 = r1 - r3
            r3 = 3600(0xe10, double:1.7786E-320)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x001d:
            com.google.android.gms.internal.ads.u23 r1 = r5.f18124i     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.j23 r1 = r1.mo11150b()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x002b
            boolean r1 = r1.mo8336d(r3)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
        L_0x002b:
            int r1 = r5.f18134s     // Catch:{ all -> 0x003f }
            boolean r1 = com.google.android.gms.internal.ads.x13.m19285a(r1)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
            java.util.concurrent.Executor r1 = r5.f18127l     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.ya r2 = new com.google.android.gms.internal.ads.ya     // Catch:{ all -> 0x003f }
            r2.<init>(r5)     // Catch:{ all -> 0x003f }
            r1.execute(r2)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r1
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2437za.mo12192o():void");
    }

    /* renamed from: q */
    public final synchronized boolean mo12193q() {
        return this.f18133r;
    }
}
