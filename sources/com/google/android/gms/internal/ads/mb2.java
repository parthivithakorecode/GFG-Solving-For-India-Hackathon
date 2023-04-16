package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;
import p003a2.C0092o;
import p048g2.C2635a;
import p048g2.C2637b;
import p054h1.C2694t;

public final class mb2 extends C1978mx {

    /* renamed from: f */
    private final Context f10795f;

    /* renamed from: g */
    private final C2459zw f10796g;

    /* renamed from: h */
    private final ks2 f10797h;

    /* renamed from: i */
    private final t41 f10798i;

    /* renamed from: j */
    private final ViewGroup f10799j;

    public mb2(Context context, C2459zw zwVar, ks2 ks2, t41 t41) {
        this.f10795f = context;
        this.f10796g = zwVar;
        this.f10797h = ks2;
        this.f10798i = t41;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        frameLayout.addView(t41.mo6844i(), C2694t.m21609r().mo14005j());
        frameLayout.setMinimumHeight(mo7472e().f12806h);
        frameLayout.setMinimumWidth(mo7472e().f12809k);
        this.f10799j = frameLayout;
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
        io0.m11130f("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: F */
    public final void mo7453F() {
        this.f10798i.mo6848m();
    }

    /* renamed from: G */
    public final void mo7454G() {
        C0092o.m309e("destroy must be called on the main UI thread.");
        this.f10798i.mo11410d().mo11444V0((Context) null);
    }

    /* renamed from: I3 */
    public final void mo7455I3(String str) {
    }

    /* renamed from: K4 */
    public final void mo7456K4(jh0 jh0) {
    }

    /* renamed from: M */
    public final void mo7457M() {
        C0092o.m309e("destroy must be called on the main UI thread.");
        this.f10798i.mo9123a();
    }

    /* renamed from: M4 */
    public final void mo7458M4(C2163rx rxVar) {
        io0.m11130f("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: Q3 */
    public final void mo7459Q3(i20 i20) {
        io0.m11130f("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: R0 */
    public final void mo7460R0(C2635a aVar) {
    }

    /* renamed from: S2 */
    public final void mo7461S2(C2459zw zwVar) {
        io0.m11130f("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: S3 */
    public final void mo7462S3(C1795hz hzVar) {
    }

    /* renamed from: U */
    public final void mo7463U() {
        C0092o.m309e("destroy must be called on the main UI thread.");
        this.f10798i.mo11410d().mo11443T0((Context) null);
    }

    /* renamed from: U0 */
    public final void mo7464U0(C2348ww wwVar) {
        io0.m11130f("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: U3 */
    public final boolean mo7465U3() {
        return false;
    }

    /* renamed from: W3 */
    public final void mo7466W3(C2423yx yxVar) {
        io0.m11130f("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: X3 */
    public final boolean mo7467X3(C1902kv kvVar) {
        io0.m11130f("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
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
    public final C2087pv mo7472e() {
        C0092o.m309e("getAdSize must be called on the main UI thread.");
        return os2.m14626a(this.f10795f, Collections.singletonList(this.f10798i.mo6846k()));
    }

    /* renamed from: g */
    public final Bundle mo7473g() {
        io0.m11130f("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    /* renamed from: h */
    public final C2459zw mo7474h() {
        return this.f10796g;
    }

    /* renamed from: i */
    public final C2274ux mo7475i() {
        return this.f10797h.f9649n;
    }

    /* renamed from: j */
    public final C2461zy mo7476j() {
        return this.f10798i.mo11409c();
    }

    /* renamed from: k */
    public final C1609cz mo7477k() {
        return this.f10798i.mo6845j();
    }

    /* renamed from: k2 */
    public final void mo7478k2(sj0 sj0) {
    }

    /* renamed from: k3 */
    public final void mo7479k3(boolean z) {
    }

    /* renamed from: m */
    public final C2635a mo7480m() {
        return C2637b.m21358Z2(this.f10799j);
    }

    /* renamed from: m5 */
    public final void mo7481m5(boolean z) {
        io0.m11130f("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: n3 */
    public final void mo7482n3(C2274ux uxVar) {
        lc2 lc2 = this.f10797h.f9638c;
        if (lc2 != null) {
            lc2.mo8921B(uxVar);
        }
    }

    /* renamed from: n5 */
    public final void mo7483n5(s00 s00) {
        io0.m11130f("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: o0 */
    public final void mo7484o0() {
    }

    /* renamed from: p */
    public final String mo7485p() {
        if (this.f10798i.mo11409c() != null) {
            return this.f10798i.mo11409c().mo9702b();
        }
        return null;
    }

    /* renamed from: q */
    public final String mo7486q() {
        if (this.f10798i.mo11409c() != null) {
            return this.f10798i.mo11409c().mo9702b();
        }
        return null;
    }

    /* renamed from: s3 */
    public final void mo7487s3(C2087pv pvVar) {
        C0092o.m309e("setAdSize must be called on the main UI thread.");
        t41 t41 = this.f10798i;
        if (t41 != null) {
            t41.mo6849n(this.f10799j, pvVar);
        }
    }

    /* renamed from: t */
    public final String mo7488t() {
        return this.f10797h.f9641f;
    }

    /* renamed from: y1 */
    public final void mo7489y1(mh0 mh0, String str) {
    }
}
