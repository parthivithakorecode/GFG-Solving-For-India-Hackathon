package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;
import p003a2.C0092o;
import p048g2.C2635a;
import p048g2.C2637b;
import p054h1.C2694t;

public final class or2 extends oj0 {

    /* renamed from: f */
    private final er2 f12171f;

    /* renamed from: g */
    private final tq2 f12172g;

    /* renamed from: h */
    private final fs2 f12173h;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: i */
    public hs1 f12174i;
    @GuardedBy("this")

    /* renamed from: j */
    private boolean f12175j = false;

    public or2(er2 er2, tq2 tq2, fs2 fs2) {
        this.f12171f = er2;
        this.f12172g = tq2;
        this.f12173h = fs2;
    }

    /* renamed from: B5 */
    private final synchronized boolean m14591B5() {
        hs1 hs1;
        hs1 = this.f12174i;
        return hs1 != null && !hs1.mo8005j();
    }

    /* renamed from: D0 */
    public final synchronized void mo9841D0(String str) {
        C0092o.m309e("#008 Must be called on the main UI thread.: setCustomData");
        this.f12173h.f6906b = str;
    }

    /* renamed from: I2 */
    public final synchronized void mo9842I2(boolean z) {
        C0092o.m309e("setImmersiveMode must be called on the main UI thread.");
        this.f12175j = z;
    }

    /* renamed from: T */
    public final synchronized void mo9843T(C2635a aVar) {
        C0092o.m309e("pause must be called on the main UI thread.");
        if (this.f12174i != null) {
            this.f12174i.mo11410d().mo11443T0(aVar == null ? null : (Context) C2637b.m21357C0(aVar));
        }
    }

    /* renamed from: V3 */
    public final synchronized void mo9844V3(tj0 tj0) {
        C0092o.m309e("loadAd must be called on the main UI thread.");
        String str = tj0.f14878g;
        String str2 = (String) C2199sw.m17001c().mo8579b(m10.f10365Q3);
        if (!(str2 == null || str == null)) {
            try {
                if (Pattern.matches(str2, str)) {
                    return;
                }
            } catch (RuntimeException e) {
                C2694t.m21607p().mo11034s(e, "NonagonUtil.isPatternMatched");
            }
        }
        if (m14591B5()) {
            if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10381S3)).booleanValue()) {
                return;
            }
        }
        vq2 vq2 = new vq2((String) null);
        this.f12174i = null;
        this.f12171f.mo7040i(1);
        this.f12171f.mo6124a(tj0.f14877f, tj0.f14878g, vq2, new mr2(this));
    }

    /* renamed from: a */
    public final Bundle mo9845a() {
        C0092o.m309e("getAdMetadata can only be called from the UI thread.");
        hs1 hs1 = this.f12174i;
        return hs1 != null ? hs1.mo8003h() : new Bundle();
    }

    /* renamed from: b */
    public final void mo9846b() {
        mo9859r0((C2635a) null);
    }

    /* renamed from: c */
    public final synchronized C2461zy mo9847c() {
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10519i5)).booleanValue()) {
            return null;
        }
        hs1 hs1 = this.f12174i;
        if (hs1 == null) {
            return null;
        }
        return hs1.mo11409c();
    }

    /* renamed from: c0 */
    public final synchronized void mo9848c0(String str) {
        C0092o.m309e("setUserId must be called on the main UI thread.");
        this.f12173h.f6905a = str;
    }

    /* renamed from: f */
    public final void mo9849f() {
        mo9843T((C2635a) null);
    }

    /* renamed from: g */
    public final synchronized String mo9850g() {
        hs1 hs1 = this.f12174i;
        if (hs1 == null || hs1.mo11409c() == null) {
            return null;
        }
        return this.f12174i.mo11409c().mo9702b();
    }

    /* renamed from: i */
    public final void mo9851i() {
        mo9860y0((C2635a) null);
    }

    /* renamed from: j5 */
    public final void mo9852j5(sj0 sj0) {
        C0092o.m309e("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f12172g.mo11096U(sj0);
    }

    /* renamed from: l5 */
    public final void mo9853l5(C2163rx rxVar) {
        C0092o.m309e("setAdMetadataListener can only be called from the UI thread.");
        if (rxVar == null) {
            this.f12172g.mo11099z((o03) null);
        } else {
            this.f12172g.mo11099z(new nr2(this, rxVar));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.app.Activity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo9854m0(p048g2.C2635a r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "showAd must be called on the main UI thread."
            p003a2.C0092o.m309e(r0)     // Catch:{ all -> 0x0024 }
            com.google.android.gms.internal.ads.hs1 r0 = r2.f12174i     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            r0 = 0
            if (r3 != 0) goto L_0x000e
            goto L_0x0019
        L_0x000e:
            java.lang.Object r3 = p048g2.C2637b.m21357C0(r3)     // Catch:{ all -> 0x0024 }
            boolean r1 = r3 instanceof android.app.Activity     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0019
            r0 = r3
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ all -> 0x0024 }
        L_0x0019:
            com.google.android.gms.internal.ads.hs1 r3 = r2.f12174i     // Catch:{ all -> 0x0024 }
            boolean r1 = r2.f12175j     // Catch:{ all -> 0x0024 }
            r3.mo8008m(r1, r0)     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return
        L_0x0022:
            monitor-exit(r2)
            return
        L_0x0024:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.or2.mo9854m0(g2.a):void");
    }

    /* renamed from: o3 */
    public final void mo9855o3(nj0 nj0) {
        C0092o.m309e("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f12172g.mo11097W(nj0);
    }

    /* renamed from: p */
    public final boolean mo9856p() {
        C0092o.m309e("isLoaded must be called on the main UI thread.");
        return m14591B5();
    }

    /* renamed from: q */
    public final boolean mo9857q() {
        hs1 hs1 = this.f12174i;
        return hs1 != null && hs1.mo8007l();
    }

    /* renamed from: r */
    public final synchronized void mo9858r() {
        mo9854m0((C2635a) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.content.Context} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: r0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo9859r0(p048g2.C2635a r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "destroy must be called on the main UI thread."
            p003a2.C0092o.m309e(r0)     // Catch:{ all -> 0x0027 }
            com.google.android.gms.internal.ads.tq2 r0 = r2.f12172g     // Catch:{ all -> 0x0027 }
            r1 = 0
            r0.mo11099z(r1)     // Catch:{ all -> 0x0027 }
            com.google.android.gms.internal.ads.hs1 r0 = r2.f12174i     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0025
            if (r3 != 0) goto L_0x0013
            goto L_0x001a
        L_0x0013:
            java.lang.Object r3 = p048g2.C2637b.m21357C0(r3)     // Catch:{ all -> 0x0027 }
            r1 = r3
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ all -> 0x0027 }
        L_0x001a:
            com.google.android.gms.internal.ads.hs1 r3 = r2.f12174i     // Catch:{ all -> 0x0027 }
            com.google.android.gms.internal.ads.vb1 r3 = r3.mo11410d()     // Catch:{ all -> 0x0027 }
            r3.mo11442S0(r1)     // Catch:{ all -> 0x0027 }
            monitor-exit(r2)
            return
        L_0x0025:
            monitor-exit(r2)
            return
        L_0x0027:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.or2.mo9859r0(g2.a):void");
    }

    /* renamed from: y0 */
    public final synchronized void mo9860y0(C2635a aVar) {
        C0092o.m309e("resume must be called on the main UI thread.");
        if (this.f12174i != null) {
            this.f12174i.mo11410d().mo11444V0(aVar == null ? null : (Context) C2637b.m21357C0(aVar));
        }
    }
}
