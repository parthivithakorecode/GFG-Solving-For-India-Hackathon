package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.b41;
import com.google.android.gms.internal.ads.ca1;
import com.google.android.gms.internal.ads.v61;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public abstract class rm2<AppOpenAd extends v61, AppOpenRequestComponent extends b41<AppOpenAd>, AppOpenRequestComponentBuilder extends ca1<AppOpenRequestComponent>> implements cd2<AppOpenAd> {

    /* renamed from: a */
    private final Context f13735a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f13736b;

    /* renamed from: c */
    protected final bw0 f13737c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final in2 f13738d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ep2<AppOpenRequestComponent, AppOpenAd> f13739e;

    /* renamed from: f */
    private final ViewGroup f13740f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final qx2 f13741g;
    @GuardedBy("this")

    /* renamed from: h */
    private final is2 f13742h;
    /* access modifiers changed from: private */
    @GuardedBy("this")
    @Nullable

    /* renamed from: i */
    public cc3<AppOpenAd> f13743i;

    protected rm2(Context context, Executor executor, bw0 bw0, ep2<AppOpenRequestComponent, AppOpenAd> ep2, in2 in2, is2 is2) {
        this.f13735a = context;
        this.f13736b = executor;
        this.f13737c = bw0;
        this.f13739e = ep2;
        this.f13738d = in2;
        this.f13742h = is2;
        this.f13740f = new FrameLayout(context);
        this.f13741g = bw0.mo5597b();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final synchronized AppOpenRequestComponentBuilder m16338l(cp2 cp2) {
        qm2 qm2 = (qm2) cp2;
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10415W5)).booleanValue()) {
            q41 q41 = new q41(this.f13740f);
            fa1 fa1 = new fa1();
            fa1.mo7274c(this.f13735a);
            fa1.mo7277f(qm2.f13237a);
            ha1 g = fa1.mo7278g();
            mg1 mg1 = new mg1();
            mg1.mo9241f(this.f13738d, this.f13736b);
            mg1.mo9250o(this.f13738d, this.f13736b);
            return mo5884b(q41, g, mg1.mo9252q());
        }
        in2 c = in2.m11102c(this.f13738d);
        mg1 mg12 = new mg1();
        mg12.mo9240e(c, this.f13736b);
        mg12.mo9245j(c, this.f13736b);
        mg12.mo9246k(c, this.f13736b);
        mg12.mo9247l(c, this.f13736b);
        mg12.mo9241f(c, this.f13736b);
        mg12.mo9250o(c, this.f13736b);
        mg12.mo9251p(c);
        q41 q412 = new q41(this.f13740f);
        fa1 fa12 = new fa1();
        fa12.mo7274c(this.f13735a);
        fa12.mo7277f(qm2.f13237a);
        return mo5884b(q412, fa12.mo7278g(), mg12.mo9252q());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo6124a(com.google.android.gms.internal.ads.C1902kv r5, java.lang.String r6, com.google.android.gms.internal.ads.ad2 r7, com.google.android.gms.internal.ads.bd2<? super AppOpenAd> r8) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.content.Context r7 = r4.f13735a     // Catch:{ all -> 0x00a3 }
            r0 = 7
            com.google.android.gms.internal.ads.ox2 r7 = com.google.android.gms.internal.ads.ox2.m14693p(r7, r0, r0, r5)     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            p003a2.C0092o.m309e(r0)     // Catch:{ all -> 0x00a3 }
            r0 = 0
            if (r6 != 0) goto L_0x002f
            java.lang.String r5 = "Ad unit ID should not be null for app open ad."
            com.google.android.gms.internal.ads.io0.m11128d(r5)     // Catch:{ all -> 0x00a3 }
            java.util.concurrent.Executor r5 = r4.f13736b     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.mm2 r6 = new com.google.android.gms.internal.ads.mm2     // Catch:{ all -> 0x00a3 }
            r6.<init>(r4)     // Catch:{ all -> 0x00a3 }
            r5.execute(r6)     // Catch:{ all -> 0x00a3 }
            if (r7 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.qx2 r5 = r4.f13741g     // Catch:{ all -> 0x00a3 }
            r7.mo9883g(r0)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.px2 r6 = r7.mo9885i()     // Catch:{ all -> 0x00a3 }
            r5.mo10426a(r6)     // Catch:{ all -> 0x00a3 }
        L_0x002d:
            monitor-exit(r4)
            return r0
        L_0x002f:
            com.google.android.gms.internal.ads.cc3<AppOpenAd> r1 = r4.f13743i     // Catch:{ all -> 0x00a3 }
            if (r1 == 0) goto L_0x0043
            if (r7 == 0) goto L_0x0041
            com.google.android.gms.internal.ads.qx2 r5 = r4.f13741g     // Catch:{ all -> 0x00a3 }
            r7.mo9883g(r0)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.px2 r6 = r7.mo9885i()     // Catch:{ all -> 0x00a3 }
            r5.mo10426a(r6)     // Catch:{ all -> 0x00a3 }
        L_0x0041:
            monitor-exit(r4)
            return r0
        L_0x0043:
            android.content.Context r0 = r4.f13735a     // Catch:{ all -> 0x00a3 }
            boolean r1 = r5.f9672k     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.zs2.m20830a(r0, r1)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10240A6     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x00a3 }
            java.lang.Object r0 = r1.mo8579b(r0)     // Catch:{ all -> 0x00a3 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00a3 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00a3 }
            r1 = 1
            if (r0 == 0) goto L_0x006a
            boolean r0 = r5.f9672k     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x006a
            com.google.android.gms.internal.ads.bw0 r0 = r4.f13737c     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.uy1 r0 = r0.mo5611s()     // Catch:{ all -> 0x00a3 }
            r0.mo11341l(r1)     // Catch:{ all -> 0x00a3 }
        L_0x006a:
            com.google.android.gms.internal.ads.is2 r0 = r4.f13742h     // Catch:{ all -> 0x00a3 }
            r0.mo8253H(r6)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.pv r6 = com.google.android.gms.internal.ads.C2087pv.m15286d()     // Catch:{ all -> 0x00a3 }
            r0.mo8252G(r6)     // Catch:{ all -> 0x00a3 }
            r0.mo8264d(r5)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.ks2 r5 = r0.mo8266f()     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.qm2 r6 = new com.google.android.gms.internal.ads.qm2     // Catch:{ all -> 0x00a3 }
            r0 = 0
            r6.<init>(r0)     // Catch:{ all -> 0x00a3 }
            r6.f13237a = r5     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.ep2<AppOpenRequestComponent, AppOpenAd> r5 = r4.f13739e     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.fp2 r2 = new com.google.android.gms.internal.ads.fp2     // Catch:{ all -> 0x00a3 }
            r2.<init>(r6, r0)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.lm2 r3 = new com.google.android.gms.internal.ads.lm2     // Catch:{ all -> 0x00a3 }
            r3.<init>(r4)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.cc3 r5 = r5.mo7009a(r2, r3, r0)     // Catch:{ all -> 0x00a3 }
            r4.f13743i = r5     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.om2 r0 = new com.google.android.gms.internal.ads.om2     // Catch:{ all -> 0x00a3 }
            r0.<init>(r4, r8, r7, r6)     // Catch:{ all -> 0x00a3 }
            java.util.concurrent.Executor r6 = r4.f13736b     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.rb3.m16140r(r5, r0, r6)     // Catch:{ all -> 0x00a3 }
            monitor-exit(r4)
            return r1
        L_0x00a3:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rm2.mo6124a(com.google.android.gms.internal.ads.kv, java.lang.String, com.google.android.gms.internal.ads.ad2, com.google.android.gms.internal.ads.bd2):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AppOpenRequestComponentBuilder mo5884b(q41 q41, ha1 ha1, og1 og1);

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo10606j() {
        this.f13738d.mo7808d(dt2.m8099d(6, (String) null, (C1605cv) null));
    }

    /* renamed from: k */
    public final void mo10607k(C2309vv vvVar) {
        this.f13742h.mo8254I(vvVar);
    }

    public final boolean zza() {
        cc3<AppOpenAd> cc3 = this.f13743i;
        return cc3 != null && !cc3.isDone();
    }
}
