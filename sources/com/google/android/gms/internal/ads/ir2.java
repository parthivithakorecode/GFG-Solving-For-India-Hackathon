package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import javax.annotation.concurrent.GuardedBy;
import p003a2.C0092o;
import p048g2.C2635a;
import p048g2.C2637b;
import p054h1.C2694t;
import p069j1.C3163g2;

public final class ir2 extends ek0 {

    /* renamed from: f */
    private final er2 f8766f;

    /* renamed from: g */
    private final tq2 f8767g;

    /* renamed from: h */
    private final String f8768h;

    /* renamed from: i */
    private final fs2 f8769i;

    /* renamed from: j */
    private final Context f8770j;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: k */
    public hs1 f8771k;
    @GuardedBy("this")

    /* renamed from: l */
    private boolean f8772l = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10636w0)).booleanValue();

    public ir2(String str, er2 er2, Context context, tq2 tq2, fs2 fs2) {
        this.f8768h = str;
        this.f8766f = er2;
        this.f8767g = tq2;
        this.f8769i = fs2;
        this.f8770j = context;
    }

    /* renamed from: C5 */
    private final synchronized void m11208C5(C1902kv kvVar, nk0 nk0, int i) {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        this.f8767g.mo11095R(nk0);
        C2694t.m21608q();
        if (C3163g2.m23936l(this.f8770j)) {
            if (kvVar.f9685x == null) {
                io0.m11128d("Failed to load the ad because app ID is missing.");
                this.f8767g.mo7808d(dt2.m8099d(4, (String) null, (C1605cv) null));
                return;
            }
        }
        if (this.f8771k == null) {
            vq2 vq2 = new vq2((String) null);
            this.f8766f.mo7040i(i);
            this.f8766f.mo6124a(kvVar, this.f8768h, vq2, new hr2(this));
        }
    }

    /* renamed from: B1 */
    public final synchronized void mo6485B1(C2635a aVar) {
        mo7356E1(aVar, this.f8772l);
    }

    /* renamed from: B3 */
    public final void mo6486B3(C2238ty tyVar) {
        if (tyVar == null) {
            this.f8767g.mo11099z((o03) null);
        } else {
            this.f8767g.mo11099z(new gr2(this, tyVar));
        }
    }

    /* renamed from: D2 */
    public final synchronized void mo6487D2(C1902kv kvVar, nk0 nk0) {
        m11208C5(kvVar, nk0, 2);
    }

    /* renamed from: E1 */
    public final synchronized void mo7356E1(C2635a aVar, boolean z) {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        if (this.f8771k == null) {
            io0.m11131g("Rewarded can not be shown before loaded");
            this.f8767g.mo8177B0(dt2.m8099d(9, (String) null, (C1605cv) null));
            return;
        }
        this.f8771k.mo8008m(z, (Activity) C2637b.m21357C0(aVar));
    }

    /* renamed from: M1 */
    public final synchronized void mo6488M1(uk0 uk0) {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        fs2 fs2 = this.f8769i;
        fs2.f6905a = uk0.f15613f;
        fs2.f6906b = uk0.f15614g;
    }

    /* renamed from: P3 */
    public final void mo7357P3(ok0 ok0) {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        this.f8767g.mo11098X(ok0);
    }

    /* renamed from: Y3 */
    public final synchronized void mo6489Y3(C1902kv kvVar, nk0 nk0) {
        m11208C5(kvVar, nk0, 3);
    }

    /* renamed from: Z4 */
    public final void mo6490Z4(C2350wy wyVar) {
        C0092o.m309e("setOnPaidEventListener must be called on the main UI thread.");
        this.f8767g.mo11093B(wyVar);
    }

    /* renamed from: a */
    public final Bundle mo7358a() {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        hs1 hs1 = this.f8771k;
        return hs1 != null ? hs1.mo8003h() : new Bundle();
    }

    /* renamed from: b */
    public final synchronized String mo7359b() {
        hs1 hs1 = this.f8771k;
        if (hs1 == null || hs1.mo11409c() == null) {
            return null;
        }
        return this.f8771k.mo11409c().mo9702b();
    }

    /* renamed from: c */
    public final C2461zy mo6491c() {
        hs1 hs1;
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10519i5)).booleanValue() && (hs1 = this.f8771k) != null) {
            return hs1.mo11409c();
        }
        return null;
    }

    /* renamed from: f0 */
    public final synchronized void mo6492f0(boolean z) {
        C0092o.m309e("setImmersiveMode must be called on the main UI thread.");
        this.f8772l = z;
    }

    /* renamed from: g */
    public final ck0 mo7360g() {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        hs1 hs1 = this.f8771k;
        if (hs1 != null) {
            return hs1.mo8004i();
        }
        return null;
    }

    /* renamed from: n */
    public final boolean mo7361n() {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        hs1 hs1 = this.f8771k;
        return hs1 != null && !hs1.mo8006k();
    }

    /* renamed from: y4 */
    public final void mo6493y4(jk0 jk0) {
        C0092o.m309e("#008 Must be called on the main UI thread.");
        this.f8767g.mo11094Q(jk0);
    }
}
