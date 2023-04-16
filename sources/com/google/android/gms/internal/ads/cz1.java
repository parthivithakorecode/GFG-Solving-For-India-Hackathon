package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import p054h1.C2675a;
import p054h1.C2676b;
import p054h1.C2686l;
import p054h1.C2694t;
import p061i1.C2817p;
import p061i1.C2818q;
import p061i1.C2826y;
import p069j1.C3202r1;

public final class cz1 implements C2818q, rv0 {

    /* renamed from: f */
    private final Context f5581f;

    /* renamed from: g */
    private final po0 f5582g;

    /* renamed from: h */
    private uy1 f5583h;

    /* renamed from: i */
    private eu0 f5584i;

    /* renamed from: j */
    private boolean f5585j;

    /* renamed from: k */
    private boolean f5586k;

    /* renamed from: l */
    private long f5587l;

    /* renamed from: m */
    private C2127qy f5588m;

    /* renamed from: n */
    private boolean f5589n;

    cz1(Context context, po0 po0) {
        this.f5581f = context;
        this.f5582g = po0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m7655g() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f5585j     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0016
            boolean r0 = r2.f5586k     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x000a
            goto L_0x0016
        L_0x000a:
            com.google.android.gms.internal.ads.dc3 r0 = com.google.android.gms.internal.ads.wo0.f16890e     // Catch:{ all -> 0x0018 }
            com.google.android.gms.internal.ads.az1 r1 = new com.google.android.gms.internal.ads.az1     // Catch:{ all -> 0x0018 }
            r1.<init>(r2)     // Catch:{ all -> 0x0018 }
            r0.execute(r1)     // Catch:{ all -> 0x0018 }
            monitor-exit(r2)
            return
        L_0x0016:
            monitor-exit(r2)
            return
        L_0x0018:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cz1.m7655g():void");
    }

    /* renamed from: h */
    private final synchronized boolean m7656h(C2127qy qyVar) {
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10240A6)).booleanValue()) {
            io0.m11131g("Ad inspector had an internal error.");
            try {
                qyVar.mo9888x2(dt2.m8099d(16, (String) null, (C1605cv) null));
            } catch (RemoteException unused) {
            }
        } else if (this.f5583h == null) {
            io0.m11131g("Ad inspector had an internal error.");
            try {
                qyVar.mo9888x2(dt2.m8099d(16, (String) null, (C1605cv) null));
            } catch (RemoteException unused2) {
            }
        } else {
            if (!this.f5585j && !this.f5586k) {
                if (C2694t.m21592a().mo12462a() >= this.f5587l + ((long) ((Integer) C2199sw.m17001c().mo8579b(m10.f10264D6)).intValue())) {
                    return true;
                }
            }
            io0.m11131g("Ad inspector cannot be opened because it is already open.");
            try {
                qyVar.mo9888x2(dt2.m8099d(19, (String) null, (C1605cv) null));
            } catch (RemoteException unused3) {
            }
        }
        return false;
        return false;
        return false;
    }

    /* renamed from: D */
    public final synchronized void mo5643D(int i) {
        this.f5584i.destroy();
        if (!this.f5589n) {
            C3202r1.m24015k("Inspector closed.");
            C2127qy qyVar = this.f5588m;
            if (qyVar != null) {
                try {
                    qyVar.mo9888x2((C1605cv) null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f5586k = false;
        this.f5585j = false;
        this.f5587l = 0;
        this.f5589n = false;
        this.f5588m = null;
    }

    /* renamed from: M3 */
    public final void mo5644M3() {
    }

    /* renamed from: Z2 */
    public final void mo5645Z2() {
    }

    /* renamed from: a */
    public final synchronized void mo5646a() {
        this.f5586k = true;
        m7655g();
    }

    /* renamed from: b */
    public final void mo5647b() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:8|9|10|11|12|(1:14)|15|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0023 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo5388c(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 1
            if (r4 == 0) goto L_0x0010
            java.lang.String r4 = "Ad inspector loaded."
            p069j1.C3202r1.m24015k(r4)     // Catch:{ all -> 0x002c }
            r3.f5585j = r0     // Catch:{ all -> 0x002c }
            r3.m7655g()     // Catch:{ all -> 0x002c }
            monitor-exit(r3)
            return
        L_0x0010:
            java.lang.String r4 = "Ad inspector failed to load."
            com.google.android.gms.internal.ads.io0.m11131g(r4)     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.qy r4 = r3.f5588m     // Catch:{ RemoteException -> 0x0023 }
            if (r4 == 0) goto L_0x0023
            r1 = 17
            r2 = 0
            com.google.android.gms.internal.ads.cv r1 = com.google.android.gms.internal.ads.dt2.m8099d(r1, r2, r2)     // Catch:{ RemoteException -> 0x0023 }
            r4.mo9888x2(r1)     // Catch:{ RemoteException -> 0x0023 }
        L_0x0023:
            r3.f5589n = r0     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.eu0 r4 = r3.f5584i     // Catch:{ all -> 0x002c }
            r4.destroy()     // Catch:{ all -> 0x002c }
            monitor-exit(r3)
            return
        L_0x002c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cz1.mo5388c(boolean):void");
    }

    /* renamed from: d */
    public final void mo6345d(uy1 uy1) {
        this.f5583h = uy1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo6346e() {
        this.f5584i.mo7272a("window.inspectorInfo", this.f5583h.mo11333d().toString());
    }

    /* renamed from: f */
    public final synchronized void mo6347f(C2127qy qyVar, u70 u70) {
        C2127qy qyVar2 = qyVar;
        synchronized (this) {
            if (m7656h(qyVar)) {
                try {
                    C2694t.m21591A();
                    eu0 a = ru0.m16446a(this.f5581f, vv0.m18686a(), "", false, false, (C1734gb) null, (m20) null, this.f5582g, (b20) null, (C2686l) null, (C2675a) null, C1527ar.m6231a(), (rr2) null, (ur2) null);
                    this.f5584i = a;
                    tv0 D0 = a.mo7077D0();
                    if (D0 == null) {
                        io0.m11131g("Failed to obtain a web view for the ad inspector");
                        try {
                            qyVar2.mo9888x2(dt2.m8099d(17, "Failed to obtain a web view for the ad inspector", (C1605cv) null));
                        } catch (RemoteException unused) {
                        }
                    } else {
                        this.f5588m = qyVar2;
                        D0.mo9053k0((C2420yu) null, (s60) null, (C2818q) null, (u60) null, (C2826y) null, false, (w70) null, (C2676b) null, (fg0) null, (ml0) null, (o42) null, (cy2) null, (wv1) null, (xw2) null, u70, (pi1) null);
                        D0.mo9048f1(this);
                        this.f5584i.loadUrl((String) C2199sw.m17001c().mo8579b(m10.f10248B6));
                        C2694t.m21602k();
                        C2817p.m22284a(this.f5581f, new AdOverlayInfoParcel(this, this.f5584i, 1, this.f5582g), true);
                        this.f5587l = C2694t.m21592a().mo12462a();
                    }
                } catch (qu0 e) {
                    io0.m11132h("Failed to obtain a web view for the ad inspector", e);
                    try {
                        qyVar2.mo9888x2(dt2.m8099d(17, "Failed to obtain a web view for the ad inspector", (C1605cv) null));
                    } catch (RemoteException unused2) {
                    }
                }
            }
        }
    }

    /* renamed from: u5 */
    public final void mo5655u5() {
    }
}
