package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;
import p034e2.C2547d;
import p061i1.C2818q;

public final class b31 implements C2450zn, rb1, C2818q, qb1 {

    /* renamed from: f */
    private final w21 f4661f;

    /* renamed from: g */
    private final x21 f4662g;

    /* renamed from: h */
    private final Set<eu0> f4663h = new HashSet();

    /* renamed from: i */
    private final oc0<JSONObject, JSONObject> f4664i;

    /* renamed from: j */
    private final Executor f4665j;

    /* renamed from: k */
    private final C2547d f4666k;

    /* renamed from: l */
    private final AtomicBoolean f4667l = new AtomicBoolean(false);
    @GuardedBy("this")

    /* renamed from: m */
    private final a31 f4668m = new a31();

    /* renamed from: n */
    private boolean f4669n = false;

    /* renamed from: o */
    private WeakReference<?> f4670o = new WeakReference<>(this);

    public b31(lc0 lc0, x21 x21, Executor executor, w21 w21, C2547d dVar) {
        this.f4661f = w21;
        wb0<JSONObject> wb0 = zb0.f18143b;
        this.f4664i = lc0.mo8918a("google.afma.activeView.handleUpdate", wb0, wb0);
        this.f4662g = x21;
        this.f4665j = executor;
        this.f4666k = dVar;
    }

    /* renamed from: h */
    private final void m6574h() {
        for (eu0 f : this.f4663h) {
            this.f4661f.mo11562f(f);
        }
        this.f4661f.mo11561e();
    }

    /* renamed from: D */
    public final void mo5643D(int i) {
    }

    /* renamed from: M3 */
    public final synchronized void mo5644M3() {
        this.f4668m.f3923b = false;
        mo5648c();
    }

    /* renamed from: Z2 */
    public final void mo5645Z2() {
    }

    /* renamed from: a */
    public final void mo5646a() {
    }

    /* renamed from: b */
    public final void mo5647b() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo5648c() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.ref.WeakReference<?> r0 = r5.f4670o     // Catch:{ all -> 0x0060 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x005b
            boolean r0 = r5.f4669n     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x0059
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f4667l     // Catch:{ all -> 0x0060 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0059
            com.google.android.gms.internal.ads.a31 r0 = r5.f4668m     // Catch:{ Exception -> 0x0051 }
            e2.d r1 = r5.f4666k     // Catch:{ Exception -> 0x0051 }
            long r1 = r1.mo12463b()     // Catch:{ Exception -> 0x0051 }
            r0.f3925d = r1     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.x21 r0 = r5.f4662g     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.a31 r1 = r5.f4668m     // Catch:{ Exception -> 0x0051 }
            org.json.JSONObject r0 = r0.mo8587a(r1)     // Catch:{ Exception -> 0x0051 }
            java.util.Set<com.google.android.gms.internal.ads.eu0> r1 = r5.f4663h     // Catch:{ Exception -> 0x0051 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0051 }
        L_0x002d:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x0051 }
            if (r2 == 0) goto L_0x0044
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.eu0 r2 = (com.google.android.gms.internal.ads.eu0) r2     // Catch:{ Exception -> 0x0051 }
            java.util.concurrent.Executor r3 = r5.f4665j     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.z21 r4 = new com.google.android.gms.internal.ads.z21     // Catch:{ Exception -> 0x0051 }
            r4.<init>(r2, r0)     // Catch:{ Exception -> 0x0051 }
            r3.execute(r4)     // Catch:{ Exception -> 0x0051 }
            goto L_0x002d
        L_0x0044:
            com.google.android.gms.internal.ads.oc0<org.json.JSONObject, org.json.JSONObject> r1 = r5.f4664i     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.cc3 r0 = r1.mo9721a(r0)     // Catch:{ Exception -> 0x0051 }
            java.lang.String r1 = "ActiveViewListener.callActiveViewJs"
            com.google.android.gms.internal.ads.zo0.m20770b(r0, r1)     // Catch:{ Exception -> 0x0051 }
            monitor-exit(r5)
            return
        L_0x0051:
            r0 = move-exception
            java.lang.String r1 = "Failed to call ActiveViewJS"
            p069j1.C3202r1.m24016l(r1, r0)     // Catch:{ all -> 0x0060 }
            monitor-exit(r5)
            return
        L_0x0059:
            monitor-exit(r5)
            return
        L_0x005b:
            r5.mo5652g()     // Catch:{ all -> 0x0060 }
            monitor-exit(r5)
            return
        L_0x0060:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b31.mo5648c():void");
    }

    /* renamed from: d */
    public final synchronized void mo5649d(eu0 eu0) {
        this.f4663h.add(eu0);
        this.f4661f.mo11560d(eu0);
    }

    /* renamed from: e */
    public final void mo5650e(Object obj) {
        this.f4670o = new WeakReference<>(obj);
    }

    /* renamed from: f */
    public final synchronized void mo5651f(Context context) {
        this.f4668m.f3923b = false;
        mo5648c();
    }

    /* renamed from: g */
    public final synchronized void mo5652g() {
        m6574h();
        this.f4669n = true;
    }

    /* renamed from: k */
    public final synchronized void mo5153k() {
        if (this.f4667l.compareAndSet(false, true)) {
            this.f4661f.mo11559c(this);
            mo5648c();
        }
    }

    /* renamed from: m0 */
    public final synchronized void mo5653m0(C2376xn xnVar) {
        a31 a31 = this.f4668m;
        a31.f3922a = xnVar.f17256j;
        a31.f3927f = xnVar;
        mo5648c();
    }

    /* renamed from: r */
    public final synchronized void mo5654r(Context context) {
        this.f4668m.f3923b = true;
        mo5648c();
    }

    /* renamed from: u5 */
    public final synchronized void mo5655u5() {
        this.f4668m.f3923b = true;
        mo5648c();
    }

    /* renamed from: y */
    public final synchronized void mo5656y(Context context) {
        this.f4668m.f3926e = "u";
        mo5648c();
        m6574h();
        this.f4669n = true;
    }
}
