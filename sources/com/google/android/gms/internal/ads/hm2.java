package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
import p003a2.C0092o;
import p048g2.C2635a;
import p048g2.C2637b;
import p054h1.C2694t;
import p061i1.C2802b;
import p061i1.C2820s;
import p061i1.C2821t;
import p069j1.C3163g2;

public final class hm2 extends C1978mx implements C2802b, C2007np, wc1 {

    /* renamed from: f */
    private final bw0 f8343f;

    /* renamed from: g */
    private final Context f8344g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ViewGroup f8345h;

    /* renamed from: i */
    private AtomicBoolean f8346i = new AtomicBoolean();

    /* renamed from: j */
    private final String f8347j;

    /* renamed from: k */
    private final bm2 f8348k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final in2 f8349l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final po0 f8350m;

    /* renamed from: n */
    private long f8351n = -1;

    /* renamed from: o */
    private n31 f8352o;
    @GuardedBy("this")

    /* renamed from: p */
    protected c41 f8353p;

    public hm2(bw0 bw0, Context context, String str, bm2 bm2, in2 in2, po0 po0) {
        this.f8345h = new FrameLayout(context);
        this.f8343f = bw0;
        this.f8344g = context;
        this.f8347j = str;
        this.f8348k = bm2;
        this.f8349l = in2;
        in2.mo8179h(this);
        this.f8350m = po0;
    }

    /* renamed from: B5 */
    static /* bridge */ /* synthetic */ C2821t m10621B5(hm2 hm2, c41 c41) {
        boolean o = c41.mo6051o();
        int intValue = ((Integer) C2199sw.m17001c().mo8579b(m10.f10623u3)).intValue();
        C2820s sVar = new C2820s();
        sVar.f19514d = 50;
        int i = 0;
        sVar.f19511a = true != o ? 0 : intValue;
        if (true != o) {
            i = intValue;
        }
        sVar.f19512b = i;
        sVar.f19513c = intValue;
        return new C2821t(hm2.f8344g, sVar, hm2);
    }

    /* renamed from: E5 */
    private final synchronized void m10624E5(int i) {
        if (this.f8346i.compareAndSet(false, true)) {
            c41 c41 = this.f8353p;
            if (!(c41 == null || c41.mo6053q() == null)) {
                this.f8349l.mo8176B(this.f8353p.mo6053q());
            }
            this.f8349l.mo8180i();
            this.f8345h.removeAllViews();
            n31 n31 = this.f8352o;
            if (n31 != null) {
                C2694t.m21594c().mo11042e(n31);
            }
            if (this.f8353p != null) {
                long j = -1;
                if (this.f8351n != -1) {
                    j = C2694t.m21592a().mo12463b() - this.f8351n;
                }
                this.f8353p.mo6052p(j, i);
            }
            mo7457M();
        }
    }

    /* renamed from: A0 */
    public final boolean mo7450A0() {
        return false;
    }

    /* renamed from: C0 */
    public final void mo7968C0() {
        m10624E5(4);
    }

    /* renamed from: C4 */
    public final void mo7451C4(C2341wp wpVar) {
        this.f8349l.mo8185y(wpVar);
    }

    /* renamed from: E4 */
    public final void mo7452E4(C2350wy wyVar) {
    }

    /* renamed from: F */
    public final synchronized void mo7453F() {
    }

    /* renamed from: G */
    public final synchronized void mo7454G() {
        C0092o.m309e("resume must be called on the main UI thread.");
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
        c41 c41 = this.f8353p;
        if (c41 != null) {
            c41.mo9123a();
        }
    }

    /* renamed from: M4 */
    public final void mo7458M4(C2163rx rxVar) {
    }

    /* renamed from: Q3 */
    public final synchronized void mo7459Q3(i20 i20) {
    }

    /* renamed from: R0 */
    public final void mo7460R0(C2635a aVar) {
    }

    /* renamed from: S2 */
    public final void mo7461S2(C2459zw zwVar) {
    }

    /* renamed from: S3 */
    public final void mo7462S3(C1795hz hzVar) {
    }

    /* renamed from: U */
    public final synchronized void mo7463U() {
        C0092o.m309e("pause must be called on the main UI thread.");
    }

    /* renamed from: U0 */
    public final void mo7464U0(C2348ww wwVar) {
    }

    /* renamed from: U3 */
    public final synchronized boolean mo7465U3() {
        return this.f8348k.zza();
    }

    /* renamed from: W3 */
    public final synchronized void mo7466W3(C2423yx yxVar) {
    }

    /* renamed from: X3 */
    public final synchronized boolean mo7467X3(C1902kv kvVar) {
        C0092o.m309e("loadAd must be called on the main UI thread.");
        C2694t.m21608q();
        if (C3163g2.m23936l(this.f8344g)) {
            if (kvVar.f9685x == null) {
                io0.m11128d("Failed to load the ad because app ID is missing.");
                this.f8349l.mo7808d(dt2.m8099d(4, (String) null, (C1605cv) null));
                return false;
            }
        }
        if (mo7465U3()) {
            return false;
        }
        this.f8346i = new AtomicBoolean();
        return this.f8348k.mo6124a(kvVar, this.f8347j, new fm2(this), new gm2(this));
    }

    /* renamed from: Y1 */
    public final void mo7468Y1(C1902kv kvVar, C1644dx dxVar) {
    }

    /* renamed from: b1 */
    public final void mo7469b1(String str) {
    }

    /* renamed from: b4 */
    public final void mo7470b4(C2309vv vvVar) {
        this.f8348k.mo10607k(vvVar);
    }

    /* renamed from: d2 */
    public final void mo7471d2(C1571by byVar) {
    }

    /* renamed from: e */
    public final synchronized C2087pv mo7472e() {
        C0092o.m309e("getAdSize must be called on the main UI thread.");
        c41 c41 = this.f8353p;
        if (c41 == null) {
            return null;
        }
        return os2.m14626a(this.f8344g, Collections.singletonList(c41.mo6046j()));
    }

    /* renamed from: f */
    public final void mo7915f() {
        if (this.f8353p != null) {
            this.f8351n = C2694t.m21592a().mo12463b();
            int h = this.f8353p.mo6044h();
            if (h > 0) {
                n31 n31 = new n31(this.f8343f.mo5600e(), C2694t.m21592a());
                this.f8352o = n31;
                n31.mo9410d(h, new em2(this));
            }
        }
    }

    /* renamed from: g */
    public final Bundle mo7473g() {
        return new Bundle();
    }

    /* renamed from: h */
    public final C2459zw mo7474h() {
        return null;
    }

    /* renamed from: i */
    public final C2274ux mo7475i() {
        return null;
    }

    /* renamed from: j */
    public final synchronized C2461zy mo7476j() {
        return null;
    }

    /* renamed from: k */
    public final synchronized C1609cz mo7477k() {
        return null;
    }

    /* renamed from: k2 */
    public final void mo7478k2(sj0 sj0) {
    }

    /* renamed from: k3 */
    public final void mo7479k3(boolean z) {
    }

    /* renamed from: l */
    public final void mo7969l() {
        C2125qw.m15897b();
        if (bo0.m6992p()) {
            m10624E5(5);
        } else {
            this.f8343f.mo5599d().execute(new dm2(this));
        }
    }

    /* renamed from: m */
    public final C2635a mo7480m() {
        C0092o.m309e("getAdFrame must be called on the main UI thread.");
        return C2637b.m21358Z2(this.f8345h);
    }

    /* renamed from: m5 */
    public final synchronized void mo7481m5(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo7970n() {
        m10624E5(5);
    }

    /* renamed from: n3 */
    public final void mo7482n3(C2274ux uxVar) {
    }

    /* renamed from: n5 */
    public final synchronized void mo7483n5(s00 s00) {
    }

    /* renamed from: o0 */
    public final void mo7484o0() {
    }

    /* renamed from: p */
    public final synchronized String mo7485p() {
        return null;
    }

    /* renamed from: q */
    public final synchronized String mo7486q() {
        return null;
    }

    /* renamed from: s3 */
    public final synchronized void mo7487s3(C2087pv pvVar) {
        C0092o.m309e("setAdSize must be called on the main UI thread.");
    }

    /* renamed from: t */
    public final synchronized String mo7488t() {
        return this.f8347j;
    }

    /* renamed from: y1 */
    public final void mo7489y1(mh0 mh0, String str) {
    }

    public final void zza() {
        m10624E5(3);
    }
}
