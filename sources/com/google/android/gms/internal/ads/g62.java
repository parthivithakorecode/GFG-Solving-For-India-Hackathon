package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import p002a1.C0044y;
import p069j1.C3138a1;

public final class g62 implements j52<t41, at2, y62> {

    /* renamed from: a */
    private final Context f7284a;

    /* renamed from: b */
    private final r51 f7285b;

    /* renamed from: c */
    private final Executor f7286c;

    public g62(Context context, r51 r51, Executor executor) {
        this.f7284a = context;
        this.f7285b = r51;
        this.f7286c = executor;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo6411a(com.google.android.gms.internal.ads.ds2 r7, com.google.android.gms.internal.ads.rr2 r8, com.google.android.gms.internal.ads.d52 r9) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10303I5
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r0 = r1.mo8579b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0077
            boolean r0 = r8.f13893e0
            if (r0 == 0) goto L_0x0077
            AdapterT r0 = r9.f5647b
            com.google.android.gms.internal.ads.at2 r0 = (com.google.android.gms.internal.ads.at2) r0
            com.google.android.gms.internal.ads.md0 r0 = r0.mo5499f()
            if (r0 == 0) goto L_0x0067
            g2.a r2 = r0.mo6460b()     // Catch:{ RemoteException -> 0x0060 }
            java.lang.Object r2 = p048g2.C2637b.m21357C0(r2)     // Catch:{ RemoteException -> 0x0060 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ RemoteException -> 0x0060 }
            boolean r0 = r0.mo6461d()     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x0053
            if (r0 == 0) goto L_0x007f
            com.google.android.gms.internal.ads.cc3 r0 = com.google.android.gms.internal.ads.rb3.m16131i(r1)
            com.google.android.gms.internal.ads.f62 r3 = new com.google.android.gms.internal.ads.f62
            r3.<init>(r6, r2, r8)
            com.google.android.gms.internal.ads.dc3 r2 = com.google.android.gms.internal.ads.wo0.f16890e
            com.google.android.gms.internal.ads.cc3 r0 = com.google.android.gms.internal.ads.rb3.m16136n(r0, r3, r2)
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x004c, ExecutionException -> 0x004a }
            r2 = r0
            android.view.View r2 = (android.view.View) r2     // Catch:{ InterruptedException -> 0x004c, ExecutionException -> 0x004a }
            goto L_0x007f
        L_0x004a:
            r7 = move-exception
            goto L_0x004d
        L_0x004c:
            r7 = move-exception
        L_0x004d:
            com.google.android.gms.internal.ads.ps2 r8 = new com.google.android.gms.internal.ads.ps2
            r8.<init>(r7)
            throw r8
        L_0x0053:
            com.google.android.gms.internal.ads.ps2 r7 = new com.google.android.gms.internal.ads.ps2
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "BannerAdapterWrapper interscrollerView should not be null"
            r8.<init>(r9)
            r7.<init>(r8)
            throw r7
        L_0x0060:
            r7 = move-exception
            com.google.android.gms.internal.ads.ps2 r8 = new com.google.android.gms.internal.ads.ps2
            r8.<init>(r7)
            throw r8
        L_0x0067:
            java.lang.String r7 = "getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."
            com.google.android.gms.internal.ads.io0.m11128d(r7)
            com.google.android.gms.internal.ads.ps2 r8 = new com.google.android.gms.internal.ads.ps2
            java.lang.Exception r9 = new java.lang.Exception
            r9.<init>(r7)
            r8.<init>(r9)
            throw r8
        L_0x0077:
            AdapterT r0 = r9.f5647b
            com.google.android.gms.internal.ads.at2 r0 = (com.google.android.gms.internal.ads.at2) r0
            android.view.View r2 = r0.mo5497d()
        L_0x007f:
            com.google.android.gms.internal.ads.r51 r0 = r6.f7285b
            com.google.android.gms.internal.ads.l71 r3 = new com.google.android.gms.internal.ads.l71
            java.lang.String r4 = r9.f5646a
            r3.<init>(r7, r8, r4)
            com.google.android.gms.internal.ads.b51 r7 = new com.google.android.gms.internal.ads.b51
            AdapterT r4 = r9.f5647b
            com.google.android.gms.internal.ads.at2 r4 = (com.google.android.gms.internal.ads.at2) r4
            com.google.android.gms.internal.ads.e62 r5 = new com.google.android.gms.internal.ads.e62
            r5.<init>(r4)
            java.util.List<com.google.android.gms.internal.ads.sr2> r8 = r8.f13916v
            r4 = 0
            java.lang.Object r8 = r8.get(r4)
            com.google.android.gms.internal.ads.sr2 r8 = (com.google.android.gms.internal.ads.sr2) r8
            r7.<init>(r2, r1, r5, r8)
            com.google.android.gms.internal.ads.u41 r7 = r0.mo7440a(r3, r7)
            com.google.android.gms.internal.ads.ji1 r8 = r7.mo5989i()
            r8.mo8466S0(r2)
            com.google.android.gms.internal.ads.vb1 r8 = r7.mo5577c()
            com.google.android.gms.internal.ads.g21 r0 = new com.google.android.gms.internal.ads.g21
            AdapterT r1 = r9.f5647b
            com.google.android.gms.internal.ads.at2 r1 = (com.google.android.gms.internal.ads.at2) r1
            r0.<init>(r1)
            java.util.concurrent.Executor r1 = r6.f7286c
            r8.mo8945B0(r0, r1)
            ListenerT r8 = r9.f5648c
            com.google.android.gms.internal.ads.y62 r8 = (com.google.android.gms.internal.ads.y62) r8
            com.google.android.gms.internal.ads.ha2 r9 = r7.mo5580g()
            r8.mo11973A5(r9)
            com.google.android.gms.internal.ads.t41 r7 = r7.mo5988h()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g62.mo6411a(com.google.android.gms.internal.ads.ds2, com.google.android.gms.internal.ads.rr2, com.google.android.gms.internal.ads.d52):java.lang.Object");
    }

    /* renamed from: b */
    public final void mo6412b(ds2 ds2, rr2 rr2, d52<at2, y62> d52) {
        C2087pv a;
        C2087pv pvVar = ds2.f5903a.f4336a.f9640e;
        if (pvVar.f12817s) {
            a = new C2087pv(this.f7284a, C0044y.m148d(pvVar.f12808j, pvVar.f12805g));
        } else {
            a = (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10303I5)).booleanValue() || !rr2.f13893e0) ? os2.m14626a(this.f7284a, rr2.f13916v) : new C2087pv(this.f7284a, C0044y.m149e(pvVar.f12808j, pvVar.f12805g));
        }
        C2087pv pvVar2 = a;
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10303I5)).booleanValue() || !rr2.f13893e0) {
            ((at2) d52.f5647b).mo5508o(this.f7284a, pvVar2, ds2.f5903a.f4336a.f9639d, rr2.f13917w.toString(), C3138a1.m23830l(rr2.f13914t), (jd0) d52.f5648c);
        } else {
            ((at2) d52.f5647b).mo5509p(this.f7284a, pvVar2, ds2.f5903a.f4336a.f9639d, rr2.f13917w.toString(), C3138a1.m23830l(rr2.f13914t), (jd0) d52.f5648c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ cc3 mo7512c(View view, rr2 rr2, Object obj) {
        return rb3.m16131i(k61.m12027a(this.f7284a, view, rr2));
    }
}
