package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import p002a1.C0017c;
import p002a1.C0033q;
import p002a1.C0037u;
import p003a2.C0092o;
import p047g1.C2631a;
import p047g1.C2633b;
import p047g1.C2634c;
import p048g2.C2637b;

/* renamed from: com.google.android.gms.internal.ads.uz */
public final class C2276uz {
    @GuardedBy("InternalMobileAds.class")

    /* renamed from: i */
    private static C2276uz f15825i;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ArrayList<C2634c> f15826a = new ArrayList<>();

    /* renamed from: b */
    private final Object f15827b = new Object();
    @GuardedBy("lock")

    /* renamed from: c */
    private C1720fy f15828c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f15829d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f15830e = false;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: f */
    public C0033q f15831f = null;

    /* renamed from: g */
    private C0037u f15832g = new C0037u.C0038a().mo112a();

    /* renamed from: h */
    private C2633b f15833h;

    private C2276uz() {
    }

    /* renamed from: e */
    public static C2276uz m18256e() {
        C2276uz uzVar;
        synchronized (C2276uz.class) {
            if (f15825i == null) {
                f15825i = new C2276uz();
            }
            uzVar = f15825i;
        }
        return uzVar;
    }

    @GuardedBy("lock")
    /* renamed from: r */
    private final void m18260r(Context context) {
        if (this.f15828c == null) {
            this.f15828c = (C1720fy) new C1977mw(C2125qw.m15896a(), context).mo10181d(context, false);
        }
    }

    @GuardedBy("lock")
    /* renamed from: s */
    private final void m18261s(C0037u uVar) {
        try {
            this.f15828c.mo6318a1(new n00(uVar));
        } catch (RemoteException e) {
            io0.m11129e("Unable to set request configuration parcel.", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static final C2633b m18262t(List<f90> list) {
        HashMap hashMap = new HashMap();
        for (f90 next : list) {
            hashMap.put(next.f6758f, new n90(next.f6759g ? C2631a.C2632a.READY : C2631a.C2632a.NOT_READY, next.f6761i, next.f6760h));
        }
        return new o90(hashMap);
    }

    /* renamed from: b */
    public final C0037u mo11346b() {
        return this.f15832g;
    }

    /* renamed from: d */
    public final C2633b mo11347d() {
        synchronized (this.f15827b) {
            C0092o.m316l(this.f15828c != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                C2633b bVar = this.f15833h;
                if (bVar != null) {
                    return bVar;
                }
                C2633b t = m18262t(this.f15828c.mo6322e());
                return t;
            } catch (RemoteException unused) {
                io0.m11128d("Unable to get Initialization status.");
                return new C2017nz(this);
            }
        }
    }

    /* renamed from: f */
    public final String mo11348f() {
        String c;
        synchronized (this.f15827b) {
            C0092o.m316l(this.f15828c != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                c = b53.m6685c(this.f15828c.mo6320d());
            } catch (RemoteException e) {
                io0.m11129e("Unable to get version string.", e);
                return "";
            }
        }
        return c;
    }

    /* renamed from: j */
    public final void mo11349j(Context context) {
        synchronized (this.f15827b) {
            m18260r(context);
            try {
                this.f15828c.mo6323h();
            } catch (RemoteException unused) {
                io0.m11128d("Unable to disable mediation adapter initialization.");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11350k(android.content.Context r4, @javax.annotation.Nullable java.lang.String r5, @javax.annotation.Nullable p047g1.C2634c r6) {
        /*
            r3 = this;
            java.lang.Object r5 = r3.f15827b
            monitor-enter(r5)
            boolean r0 = r3.f15829d     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x0014
            if (r6 == 0) goto L_0x0012
            com.google.android.gms.internal.ads.uz r4 = m18256e()     // Catch:{ all -> 0x00c2 }
            java.util.ArrayList<g1.c> r4 = r4.f15826a     // Catch:{ all -> 0x00c2 }
            r4.add(r6)     // Catch:{ all -> 0x00c2 }
        L_0x0012:
            monitor-exit(r5)     // Catch:{ all -> 0x00c2 }
            return
        L_0x0014:
            boolean r0 = r3.f15830e     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x0023
            if (r6 == 0) goto L_0x0021
            g1.b r4 = r3.mo11347d()     // Catch:{ all -> 0x00c2 }
            r6.mo12520a(r4)     // Catch:{ all -> 0x00c2 }
        L_0x0021:
            monitor-exit(r5)     // Catch:{ all -> 0x00c2 }
            return
        L_0x0023:
            r0 = 1
            r3.f15829d = r0     // Catch:{ all -> 0x00c2 }
            if (r6 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.uz r0 = m18256e()     // Catch:{ all -> 0x00c2 }
            java.util.ArrayList<g1.c> r0 = r0.f15826a     // Catch:{ all -> 0x00c2 }
            r0.add(r6)     // Catch:{ all -> 0x00c2 }
        L_0x0031:
            if (r4 == 0) goto L_0x00ba
            com.google.android.gms.internal.ads.wc0 r0 = com.google.android.gms.internal.ads.wc0.m18958a()     // Catch:{ RemoteException -> 0x00b2 }
            r1 = 0
            r0.mo11639b(r4, r1)     // Catch:{ RemoteException -> 0x00b2 }
            r3.m18260r(r4)     // Catch:{ RemoteException -> 0x00b2 }
            if (r6 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.fy r0 = r3.f15828c     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.internal.ads.tz r2 = new com.google.android.gms.internal.ads.tz     // Catch:{ RemoteException -> 0x00b2 }
            r2.<init>(r3, r1)     // Catch:{ RemoteException -> 0x00b2 }
            r0.mo6321d3(r2)     // Catch:{ RemoteException -> 0x00b2 }
        L_0x004a:
            com.google.android.gms.internal.ads.fy r0 = r3.f15828c     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.internal.ads.ad0 r2 = new com.google.android.gms.internal.ads.ad0     // Catch:{ RemoteException -> 0x00b2 }
            r2.<init>()     // Catch:{ RemoteException -> 0x00b2 }
            r0.mo6317L3(r2)     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.internal.ads.fy r0 = r3.f15828c     // Catch:{ RemoteException -> 0x00b2 }
            r0.mo6324i()     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.internal.ads.fy r0 = r3.f15828c     // Catch:{ RemoteException -> 0x00b2 }
            g2.a r2 = p048g2.C2637b.m21358Z2(r1)     // Catch:{ RemoteException -> 0x00b2 }
            r0.mo6319a4(r1, r2)     // Catch:{ RemoteException -> 0x00b2 }
            a1.u r0 = r3.f15832g     // Catch:{ RemoteException -> 0x00b2 }
            int r0 = r0.mo108b()     // Catch:{ RemoteException -> 0x00b2 }
            r1 = -1
            if (r0 != r1) goto L_0x0073
            a1.u r0 = r3.f15832g     // Catch:{ RemoteException -> 0x00b2 }
            int r0 = r0.mo109c()     // Catch:{ RemoteException -> 0x00b2 }
            if (r0 == r1) goto L_0x0078
        L_0x0073:
            a1.u r0 = r3.f15832g     // Catch:{ RemoteException -> 0x00b2 }
            r3.m18261s(r0)     // Catch:{ RemoteException -> 0x00b2 }
        L_0x0078:
            com.google.android.gms.internal.ads.m10.m13007c(r4)     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.m10.f10357P3     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.internal.ads.k10 r0 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ RemoteException -> 0x00b2 }
            java.lang.Object r4 = r0.mo8579b(r4)     // Catch:{ RemoteException -> 0x00b2 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ RemoteException -> 0x00b2 }
            boolean r4 = r4.booleanValue()     // Catch:{ RemoteException -> 0x00b2 }
            if (r4 != 0) goto L_0x00b8
            java.lang.String r4 = r3.mo11348f()     // Catch:{ RemoteException -> 0x00b2 }
            java.lang.String r0 = "0"
            boolean r4 = r4.endsWith(r0)     // Catch:{ RemoteException -> 0x00b2 }
            if (r4 != 0) goto L_0x00b8
            java.lang.String r4 = "Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time."
            com.google.android.gms.internal.ads.io0.m11128d(r4)     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.internal.ads.nz r4 = new com.google.android.gms.internal.ads.nz     // Catch:{ RemoteException -> 0x00b2 }
            r4.<init>(r3)     // Catch:{ RemoteException -> 0x00b2 }
            r3.f15833h = r4     // Catch:{ RemoteException -> 0x00b2 }
            if (r6 == 0) goto L_0x00b8
            android.os.Handler r4 = com.google.android.gms.internal.ads.bo0.f4987b     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.internal.ads.oz r0 = new com.google.android.gms.internal.ads.oz     // Catch:{ RemoteException -> 0x00b2 }
            r0.<init>(r3, r6)     // Catch:{ RemoteException -> 0x00b2 }
            r4.post(r0)     // Catch:{ RemoteException -> 0x00b2 }
            goto L_0x00b8
        L_0x00b2:
            r4 = move-exception
            java.lang.String r6 = "MobileAdsSettingManager initialization failed"
            com.google.android.gms.internal.ads.io0.m11132h(r6, r4)     // Catch:{ all -> 0x00c2 }
        L_0x00b8:
            monitor-exit(r5)     // Catch:{ all -> 0x00c2 }
            return
        L_0x00ba:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00c2 }
            java.lang.String r6 = "Context cannot be null."
            r4.<init>(r6)     // Catch:{ all -> 0x00c2 }
            throw r4     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00c2 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2276uz.mo11350k(android.content.Context, java.lang.String, g1.c):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo11351l(C2634c cVar) {
        cVar.mo12520a(this.f15833h);
    }

    /* renamed from: m */
    public final void mo11352m(Context context, C0033q qVar) {
        synchronized (this.f15827b) {
            m18260r(context);
            m18256e().f15831f = qVar;
            try {
                this.f15828c.mo6315C3(new C2165rz((C2128qz) null));
            } catch (RemoteException unused) {
                io0.m11128d("Unable to open the ad inspector.");
                if (qVar != null) {
                    qVar.mo104a(new C0017c(0, "Ad inspector had an internal error.", "com.google.android.gms.ads"));
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo11353n(Context context, String str) {
        synchronized (this.f15827b) {
            C0092o.m316l(this.f15828c != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.f15828c.mo6316J1(C2637b.m21358Z2(context), str);
            } catch (RemoteException e) {
                io0.m11129e("Unable to open debug menu.", e);
            }
        }
    }

    /* renamed from: o */
    public final void mo11354o(boolean z) {
        synchronized (this.f15827b) {
            C0092o.m316l(this.f15828c != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.f15828c.mo6326x0(z);
            } catch (RemoteException e) {
                io0.m11129e("Unable to set app mute state.", e);
            }
        }
    }

    /* renamed from: p */
    public final void mo11355p(float f) {
        boolean z = true;
        C0092o.m306b(f >= 0.0f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.f15827b) {
            if (this.f15828c == null) {
                z = false;
            }
            C0092o.m316l(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.f15828c.mo6325i4(f);
            } catch (RemoteException e) {
                io0.m11129e("Unable to set app volume.", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11356q(p002a1.C0037u r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0004
            r0 = 1
            goto L_0x0005
        L_0x0004:
            r0 = 0
        L_0x0005:
            java.lang.String r1 = "Null passed to setRequestConfiguration."
            p003a2.C0092o.m306b(r0, r1)
            java.lang.Object r0 = r4.f15827b
            monitor-enter(r0)
            a1.u r1 = r4.f15832g     // Catch:{ all -> 0x0030 }
            r4.f15832g = r5     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.fy r2 = r4.f15828c     // Catch:{ all -> 0x0030 }
            if (r2 != 0) goto L_0x0017
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0017:
            int r2 = r1.mo108b()     // Catch:{ all -> 0x0030 }
            int r3 = r5.mo108b()     // Catch:{ all -> 0x0030 }
            if (r2 != r3) goto L_0x002b
            int r1 = r1.mo109c()     // Catch:{ all -> 0x0030 }
            int r2 = r5.mo109c()     // Catch:{ all -> 0x0030 }
            if (r1 == r2) goto L_0x002e
        L_0x002b:
            r4.m18261s(r5)     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2276uz.mo11356q(a1.u):void");
    }
}
