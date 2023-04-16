package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;
import javax.annotation.concurrent.GuardedBy;
import p003a2.C0092o;
import p048g2.C2635a;
import p048g2.C2637b;
import p054h1.C2694t;
import p069j1.C3163g2;

public final class sb2 extends C1978mx implements od1 {

    /* renamed from: f */
    private final Context f14390f;

    /* renamed from: g */
    private final wn2 f14391g;

    /* renamed from: h */
    private final String f14392h;

    /* renamed from: i */
    private final lc2 f14393i;

    /* renamed from: j */
    private C2087pv f14394j;
    @GuardedBy("this")

    /* renamed from: k */
    private final is2 f14395k;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: l */
    public t41 f14396l;

    public sb2(Context context, C2087pv pvVar, String str, wn2 wn2, lc2 lc2) {
        this.f14390f = context;
        this.f14391g = wn2;
        this.f14394j = pvVar;
        this.f14392h = str;
        this.f14393i = lc2;
        this.f14395k = wn2.mo11685g();
        wn2.mo11689n(this);
    }

    /* renamed from: B5 */
    private final synchronized void m16715B5(C2087pv pvVar) {
        this.f14395k.mo8252G(pvVar);
        this.f14395k.mo8257L(this.f14394j.f12817s);
    }

    /* renamed from: C5 */
    private final synchronized boolean m16716C5(C1902kv kvVar) {
        C0092o.m309e("loadAd must be called on the main UI thread.");
        C2694t.m21608q();
        if (!C3163g2.m23936l(this.f14390f) || kvVar.f9685x != null) {
            zs2.m20830a(this.f14390f, kvVar.f9672k);
            return this.f14391g.mo6124a(kvVar, this.f14392h, (ad2) null, new rb2(this));
        }
        io0.m11128d("Failed to load the ad because app ID is missing.");
        lc2 lc2 = this.f14393i;
        if (lc2 != null) {
            lc2.mo7808d(dt2.m8099d(4, (String) null, (C1605cv) null));
        }
        return false;
    }

    /* renamed from: A0 */
    public final boolean mo7450A0() {
        return false;
    }

    /* renamed from: C4 */
    public final void mo7451C4(C2341wp wpVar) {
    }

    /* renamed from: E4 */
    public final void mo7452E4(C2350wy wyVar) {
        C0092o.m309e("setPaidEventListener must be called on the main UI thread.");
        this.f14393i.mo8927z(wyVar);
    }

    /* renamed from: F */
    public final synchronized void mo7453F() {
        C0092o.m309e("recordManualImpression must be called on the main UI thread.");
        t41 t41 = this.f14396l;
        if (t41 != null) {
            t41.mo6848m();
        }
    }

    /* renamed from: G */
    public final synchronized void mo7454G() {
        C0092o.m309e("resume must be called on the main UI thread.");
        t41 t41 = this.f14396l;
        if (t41 != null) {
            t41.mo11410d().mo11444V0((Context) null);
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
        t41 t41 = this.f14396l;
        if (t41 != null) {
            t41.mo9123a();
        }
    }

    /* renamed from: M4 */
    public final void mo7458M4(C2163rx rxVar) {
        C0092o.m309e("setAdMetadataListener must be called on the main UI thread.");
    }

    /* renamed from: Q3 */
    public final synchronized void mo7459Q3(i20 i20) {
        C0092o.m309e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f14391g.mo11690o(i20);
    }

    /* renamed from: R0 */
    public final void mo7460R0(C2635a aVar) {
    }

    /* renamed from: S2 */
    public final void mo7461S2(C2459zw zwVar) {
        C0092o.m309e("setAdListener must be called on the main UI thread.");
        this.f14393i.mo8925f(zwVar);
    }

    /* renamed from: S3 */
    public final void mo7462S3(C1795hz hzVar) {
    }

    /* renamed from: U */
    public final synchronized void mo7463U() {
        C0092o.m309e("pause must be called on the main UI thread.");
        t41 t41 = this.f14396l;
        if (t41 != null) {
            t41.mo11410d().mo11443T0((Context) null);
        }
    }

    /* renamed from: U0 */
    public final void mo7464U0(C2348ww wwVar) {
        C0092o.m309e("setAdListener must be called on the main UI thread.");
        this.f14391g.mo11688m(wwVar);
    }

    /* renamed from: U3 */
    public final synchronized boolean mo7465U3() {
        return this.f14391g.zza();
    }

    /* renamed from: W3 */
    public final synchronized void mo7466W3(C2423yx yxVar) {
        C0092o.m309e("setCorrelationIdProvider must be called on the main UI thread");
        this.f14395k.mo8269o(yxVar);
    }

    /* renamed from: X3 */
    public final synchronized boolean mo7467X3(C1902kv kvVar) {
        m16715B5(this.f14394j);
        return m16716C5(kvVar);
    }

    /* renamed from: Y1 */
    public final void mo7468Y1(C1902kv kvVar, C1644dx dxVar) {
    }

    /* renamed from: b1 */
    public final void mo7469b1(String str) {
    }

    /* renamed from: b4 */
    public final void mo7470b4(C2309vv vvVar) {
    }

    /* renamed from: d2 */
    public final void mo7471d2(C1571by byVar) {
    }

    /* renamed from: e */
    public final synchronized C2087pv mo7472e() {
        C0092o.m309e("getAdSize must be called on the main UI thread.");
        t41 t41 = this.f14396l;
        if (t41 != null) {
            return os2.m14626a(this.f14390f, Collections.singletonList(t41.mo6846k()));
        }
        return this.f14395k.mo8271v();
    }

    /* renamed from: g */
    public final Bundle mo7473g() {
        C0092o.m309e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    /* renamed from: h */
    public final C2459zw mo7474h() {
        return this.f14393i.mo8923a();
    }

    /* renamed from: i */
    public final C2274ux mo7475i() {
        return this.f14393i.mo8924b();
    }

    /* renamed from: j */
    public final synchronized C2461zy mo7476j() {
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10519i5)).booleanValue()) {
            return null;
        }
        t41 t41 = this.f14396l;
        if (t41 == null) {
            return null;
        }
        return t41.mo11409c();
    }

    /* renamed from: k */
    public final synchronized C1609cz mo7477k() {
        C0092o.m309e("getVideoController must be called from the main thread.");
        t41 t41 = this.f14396l;
        if (t41 == null) {
            return null;
        }
        return t41.mo6845j();
    }

    /* renamed from: k2 */
    public final void mo7478k2(sj0 sj0) {
    }

    /* renamed from: k3 */
    public final void mo7479k3(boolean z) {
    }

    /* renamed from: m */
    public final C2635a mo7480m() {
        C0092o.m309e("destroy must be called on the main UI thread.");
        return C2637b.m21358Z2(this.f14391g.mo11684c());
    }

    /* renamed from: m5 */
    public final synchronized void mo7481m5(boolean z) {
        C0092o.m309e("setManualImpressionsEnabled must be called from the main thread.");
        this.f14395k.mo8258M(z);
    }

    /* renamed from: n3 */
    public final void mo7482n3(C2274ux uxVar) {
        C0092o.m309e("setAppEventListener must be called on the main UI thread.");
        this.f14393i.mo8921B(uxVar);
    }

    /* renamed from: n5 */
    public final synchronized void mo7483n5(s00 s00) {
        C0092o.m309e("setVideoOptions must be called on the main UI thread.");
        this.f14395k.mo8265e(s00);
    }

    /* renamed from: o0 */
    public final void mo7484o0() {
    }

    /* renamed from: p */
    public final synchronized String mo7485p() {
        t41 t41 = this.f14396l;
        if (t41 == null || t41.mo11409c() == null) {
            return null;
        }
        return this.f14396l.mo11409c().mo9702b();
    }

    /* renamed from: q */
    public final synchronized String mo7486q() {
        t41 t41 = this.f14396l;
        if (t41 == null || t41.mo11409c() == null) {
            return null;
        }
        return this.f14396l.mo11409c().mo9702b();
    }

    /* renamed from: s3 */
    public final synchronized void mo7487s3(C2087pv pvVar) {
        C0092o.m309e("setAdSize must be called on the main UI thread.");
        this.f14395k.mo8252G(pvVar);
        this.f14394j = pvVar;
        t41 t41 = this.f14396l;
        if (t41 != null) {
            t41.mo6849n(this.f14391g.mo11684c(), pvVar);
        }
    }

    /* renamed from: t */
    public final synchronized String mo7488t() {
        return this.f14392h;
    }

    /* renamed from: y1 */
    public final void mo7489y1(mh0 mh0, String str) {
    }

    public final synchronized void zza() {
        if (this.f14391g.mo11691p()) {
            C2087pv v = this.f14395k.mo8271v();
            t41 t41 = this.f14396l;
            if (!(t41 == null || t41.mo6847l() == null || !this.f14395k.mo8268m())) {
                v = os2.m14626a(this.f14390f, Collections.singletonList(this.f14396l.mo6847l()));
            }
            m16715B5(v);
            try {
                m16716C5(this.f14395k.mo8270t());
            } catch (RemoteException unused) {
                io0.m11131g("Failed to refresh the banner ad.");
            }
        } else {
            this.f14391g.mo11687l();
        }
    }
}
