package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import javax.annotation.concurrent.GuardedBy;
import p003a2.C0092o;
import p048g2.C2635a;
import p048g2.C2637b;

public final class uc2 extends C1978mx {

    /* renamed from: f */
    private final C2087pv f15501f;

    /* renamed from: g */
    private final Context f15502g;

    /* renamed from: h */
    private final sp2 f15503h;

    /* renamed from: i */
    private final String f15504i;

    /* renamed from: j */
    private final lc2 f15505j;

    /* renamed from: k */
    private final tq2 f15506k;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: l */
    public ij1 f15507l;
    @GuardedBy("this")

    /* renamed from: m */
    private boolean f15508m = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10636w0)).booleanValue();

    public uc2(Context context, C2087pv pvVar, String str, sp2 sp2, lc2 lc2, tq2 tq2) {
        this.f15501f = pvVar;
        this.f15504i = str;
        this.f15502g = context;
        this.f15503h = sp2;
        this.f15505j = lc2;
        this.f15506k = tq2;
    }

    /* renamed from: B5 */
    private final synchronized boolean m17803B5() {
        ij1 ij1;
        ij1 = this.f15507l;
        return ij1 != null && !ij1.mo8149h();
    }

    /* renamed from: A0 */
    public final synchronized boolean mo7450A0() {
        C0092o.m309e("isLoaded must be called on the main UI thread.");
        return m17803B5();
    }

    /* renamed from: C4 */
    public final void mo7451C4(C2341wp wpVar) {
    }

    /* renamed from: E4 */
    public final void mo7452E4(C2350wy wyVar) {
        C0092o.m309e("setPaidEventListener must be called on the main UI thread.");
        this.f15505j.mo8927z(wyVar);
    }

    /* renamed from: F */
    public final void mo7453F() {
    }

    /* renamed from: G */
    public final synchronized void mo7454G() {
        C0092o.m309e("resume must be called on the main UI thread.");
        ij1 ij1 = this.f15507l;
        if (ij1 != null) {
            ij1.mo11410d().mo11444V0((Context) null);
        }
    }

    /* renamed from: I3 */
    public final void mo7455I3(String str) {
    }

    /* renamed from: K4 */
    public final void mo7456K4(jh0 jh0) {
    }

    /* renamed from: M */
    public final synchronized void mo7457M() {
        C0092o.m309e("destroy must be called on the main UI thread.");
        ij1 ij1 = this.f15507l;
        if (ij1 != null) {
            ij1.mo11410d().mo11442S0((Context) null);
        }
    }

    /* renamed from: M4 */
    public final void mo7458M4(C2163rx rxVar) {
        C0092o.m309e("setAdMetadataListener must be called on the main UI thread.");
    }

    /* renamed from: Q3 */
    public final synchronized void mo7459Q3(i20 i20) {
        C0092o.m309e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f15503h.mo10835h(i20);
    }

    /* renamed from: R0 */
    public final synchronized void mo7460R0(C2635a aVar) {
        if (this.f15507l == null) {
            io0.m11131g("Interstitial can not be shown before loaded.");
            this.f15505j.mo8177B0(dt2.m8099d(9, (String) null, (C1605cv) null));
            return;
        }
        this.f15507l.mo8150i(this.f15508m, (Activity) C2637b.m21357C0(aVar));
    }

    /* renamed from: S2 */
    public final void mo7461S2(C2459zw zwVar) {
        C0092o.m309e("setAdListener must be called on the main UI thread.");
        this.f15505j.mo8925f(zwVar);
    }

    /* renamed from: S3 */
    public final void mo7462S3(C1795hz hzVar) {
    }

    /* renamed from: U */
    public final synchronized void mo7463U() {
        C0092o.m309e("pause must be called on the main UI thread.");
        ij1 ij1 = this.f15507l;
        if (ij1 != null) {
            ij1.mo11410d().mo11443T0((Context) null);
        }
    }

    /* renamed from: U0 */
    public final void mo7464U0(C2348ww wwVar) {
    }

    /* renamed from: U3 */
    public final synchronized boolean mo7465U3() {
        return this.f15503h.zza();
    }

    /* renamed from: W3 */
    public final void mo7466W3(C2423yx yxVar) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        return false;
     */
    /* renamed from: X3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo7467X3(com.google.android.gms.internal.ads.C1902kv r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            p003a2.C0092o.m309e(r0)     // Catch:{ all -> 0x0051 }
            p054h1.C2694t.m21608q()     // Catch:{ all -> 0x0051 }
            android.content.Context r0 = r4.f15502g     // Catch:{ all -> 0x0051 }
            boolean r0 = p069j1.C3163g2.m23936l(r0)     // Catch:{ all -> 0x0051 }
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x002a
            com.google.android.gms.internal.ads.av r0 = r5.f9685x     // Catch:{ all -> 0x0051 }
            if (r0 != 0) goto L_0x002a
            java.lang.String r5 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.io0.m11128d(r5)     // Catch:{ all -> 0x0051 }
            com.google.android.gms.internal.ads.lc2 r5 = r4.f15505j     // Catch:{ all -> 0x0051 }
            if (r5 == 0) goto L_0x0028
            r0 = 4
            com.google.android.gms.internal.ads.cv r0 = com.google.android.gms.internal.ads.dt2.m8099d(r0, r2, r2)     // Catch:{ all -> 0x0051 }
            r5.mo7808d(r0)     // Catch:{ all -> 0x0051 }
        L_0x0028:
            monitor-exit(r4)
            return r1
        L_0x002a:
            boolean r0 = r4.m17803B5()     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x0032
            monitor-exit(r4)
            return r1
        L_0x0032:
            android.content.Context r0 = r4.f15502g     // Catch:{ all -> 0x0051 }
            boolean r1 = r5.f9672k     // Catch:{ all -> 0x0051 }
            com.google.android.gms.internal.ads.zs2.m20830a(r0, r1)     // Catch:{ all -> 0x0051 }
            r4.f15507l = r2     // Catch:{ all -> 0x0051 }
            com.google.android.gms.internal.ads.sp2 r0 = r4.f15503h     // Catch:{ all -> 0x0051 }
            java.lang.String r1 = r4.f15504i     // Catch:{ all -> 0x0051 }
            com.google.android.gms.internal.ads.lp2 r2 = new com.google.android.gms.internal.ads.lp2     // Catch:{ all -> 0x0051 }
            com.google.android.gms.internal.ads.pv r3 = r4.f15501f     // Catch:{ all -> 0x0051 }
            r2.<init>(r3)     // Catch:{ all -> 0x0051 }
            com.google.android.gms.internal.ads.tc2 r3 = new com.google.android.gms.internal.ads.tc2     // Catch:{ all -> 0x0051 }
            r3.<init>(r4)     // Catch:{ all -> 0x0051 }
            boolean r5 = r0.mo6124a(r5, r1, r2, r3)     // Catch:{ all -> 0x0051 }
            monitor-exit(r4)
            return r5
        L_0x0051:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uc2.mo7467X3(com.google.android.gms.internal.ads.kv):boolean");
    }

    /* renamed from: Y1 */
    public final void mo7468Y1(C1902kv kvVar, C1644dx dxVar) {
        this.f15505j.mo8926y(dxVar);
        mo7467X3(kvVar);
    }

    /* renamed from: b1 */
    public final void mo7469b1(String str) {
    }

    /* renamed from: b4 */
    public final void mo7470b4(C2309vv vvVar) {
    }

    /* renamed from: d2 */
    public final void mo7471d2(C1571by byVar) {
        this.f15505j.mo8922D(byVar);
    }

    /* renamed from: e */
    public final C2087pv mo7472e() {
        return null;
    }

    /* renamed from: g */
    public final Bundle mo7473g() {
        C0092o.m309e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    /* renamed from: h */
    public final C2459zw mo7474h() {
        return this.f15505j.mo8923a();
    }

    /* renamed from: i */
    public final C2274ux mo7475i() {
        return this.f15505j.mo8924b();
    }

    /* renamed from: j */
    public final synchronized C2461zy mo7476j() {
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10519i5)).booleanValue()) {
            return null;
        }
        ij1 ij1 = this.f15507l;
        if (ij1 == null) {
            return null;
        }
        return ij1.mo11409c();
    }

    /* renamed from: k */
    public final C1609cz mo7477k() {
        return null;
    }

    /* renamed from: k2 */
    public final void mo7478k2(sj0 sj0) {
        this.f15506k.mo11096U(sj0);
    }

    /* renamed from: k3 */
    public final synchronized void mo7479k3(boolean z) {
        C0092o.m309e("setImmersiveMode must be called on the main UI thread.");
        this.f15508m = z;
    }

    /* renamed from: m */
    public final C2635a mo7480m() {
        return null;
    }

    /* renamed from: m5 */
    public final void mo7481m5(boolean z) {
    }

    /* renamed from: n3 */
    public final void mo7482n3(C2274ux uxVar) {
        C0092o.m309e("setAppEventListener must be called on the main UI thread.");
        this.f15505j.mo8921B(uxVar);
    }

    /* renamed from: n5 */
    public final void mo7483n5(s00 s00) {
    }

    /* renamed from: o0 */
    public final synchronized void mo7484o0() {
        C0092o.m309e("showInterstitial must be called on the main UI thread.");
        ij1 ij1 = this.f15507l;
        if (ij1 == null) {
            io0.m11131g("Interstitial can not be shown before loaded.");
            this.f15505j.mo8177B0(dt2.m8099d(9, (String) null, (C1605cv) null));
            return;
        }
        ij1.mo8150i(this.f15508m, (Activity) null);
    }

    /* renamed from: p */
    public final synchronized String mo7485p() {
        ij1 ij1 = this.f15507l;
        if (ij1 == null || ij1.mo11409c() == null) {
            return null;
        }
        return this.f15507l.mo11409c().mo9702b();
    }

    /* renamed from: q */
    public final synchronized String mo7486q() {
        ij1 ij1 = this.f15507l;
        if (ij1 == null || ij1.mo11409c() == null) {
            return null;
        }
        return this.f15507l.mo11409c().mo9702b();
    }

    /* renamed from: s3 */
    public final void mo7487s3(C2087pv pvVar) {
    }

    /* renamed from: t */
    public final synchronized String mo7488t() {
        return this.f15504i;
    }

    /* renamed from: y1 */
    public final void mo7489y1(mh0 mh0, String str) {
    }
}
