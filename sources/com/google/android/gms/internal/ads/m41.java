package com.google.android.gms.internal.ads;

import android.content.Context;

public final class m41 extends v61 {

    /* renamed from: i */
    private final eu0 f10714i;

    /* renamed from: j */
    private final int f10715j;

    /* renamed from: k */
    private final Context f10716k;

    /* renamed from: l */
    private final t31 f10717l;

    /* renamed from: m */
    private final pk1 f10718m;

    /* renamed from: n */
    private final jb1 f10719n;

    /* renamed from: o */
    private boolean f10720o = false;

    m41(u61 u61, Context context, eu0 eu0, int i, t31 t31, pk1 pk1, jb1 jb1) {
        super(u61);
        this.f10714i = eu0;
        this.f10716k = context;
        this.f10715j = i;
        this.f10717l = t31;
        this.f10718m = pk1;
        this.f10719n = jb1;
    }

    /* renamed from: a */
    public final void mo9123a() {
        super.mo9123a();
        eu0 eu0 = this.f10714i;
        if (eu0 != null) {
            eu0.destroy();
        }
    }

    /* renamed from: h */
    public final int mo9124h() {
        return this.f10715j;
    }

    /* renamed from: i */
    public final void mo9125i(C2007np npVar) {
        eu0 eu0 = this.f10714i;
        if (eu0 != null) {
            eu0.mo7094N(npVar);
        }
    }

    /* JADX WARNING: type inference failed for: r4v10, types: [android.content.Context] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9126j(android.app.Activity r4, com.google.android.gms.internal.ads.C1600cq r5, boolean r6) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0004
            android.content.Context r4 = r3.f10716k
        L_0x0004:
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10620u0
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r0 = r1.mo8579b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0058
            p054h1.C2694t.m21608q()
            boolean r0 = p069j1.C3163g2.m23935k(r4)
            if (r0 == 0) goto L_0x0058
            java.lang.String r5 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.internal.ads.io0.m11131g(r5)
            com.google.android.gms.internal.ads.jb1 r5 = r3.f10719n
            r5.mo8023a()
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.m10.f10628v0
            com.google.android.gms.internal.ads.k10 r6 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r5 = r6.mo8579b(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x00ae
            com.google.android.gms.internal.ads.f13 r5 = new com.google.android.gms.internal.ads.f13
            android.content.Context r4 = r4.getApplicationContext()
            j1.b1 r6 = p054h1.C2694t.m21612u()
            android.os.Looper r6 = r6.mo13974b()
            r5.<init>(r4, r6)
            com.google.android.gms.internal.ads.ds2 r4 = r3.f15921a
            com.google.android.gms.internal.ads.cs2 r4 = r4.f5904b
            com.google.android.gms.internal.ads.ur2 r4 = r4.f5509b
            java.lang.String r4 = r4.f15729b
            r5.mo7215a(r4)
            return
        L_0x0058:
            boolean r0 = r3.f10720o
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = "App open interstitial ad is already visible."
            com.google.android.gms.internal.ads.io0.m11131g(r0)
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10521i7
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r0 = r1.mo8579b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x007f
            com.google.android.gms.internal.ads.jb1 r0 = r3.f10719n
            r1 = 10
            r2 = 0
            com.google.android.gms.internal.ads.cv r1 = com.google.android.gms.internal.ads.dt2.m8099d(r1, r2, r2)
            r0.mo8025d(r1)
        L_0x007f:
            boolean r0 = r3.f10720o
            if (r0 != 0) goto L_0x00ae
            com.google.android.gms.internal.ads.pk1 r0 = r3.f10718m     // Catch:{ ok1 -> 0x008e }
            com.google.android.gms.internal.ads.jb1 r1 = r3.f10719n     // Catch:{ ok1 -> 0x008e }
            r0.mo6852a(r6, r4, r1)     // Catch:{ ok1 -> 0x008e }
            r4 = 1
            r3.f10720o = r4
            return
        L_0x008e:
            r4 = move-exception
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.m10.f10521i7
            com.google.android.gms.internal.ads.k10 r0 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r6 = r0.mo8579b(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x00a7
            com.google.android.gms.internal.ads.jb1 r5 = r3.f10719n
            r5.mo8027q0(r4)
            return
        L_0x00a7:
            com.google.android.gms.internal.ads.cv r4 = com.google.android.gms.internal.ads.dt2.m8096a(r4)
            r5.mo6257t0(r4)
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m41.mo9126j(android.app.Activity, com.google.android.gms.internal.ads.cq, boolean):void");
    }

    /* renamed from: k */
    public final void mo9127k(long j, int i) {
        this.f10717l.mo10934a(j, i);
    }
}
