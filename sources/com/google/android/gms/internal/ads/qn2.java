package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
import p003a2.C0092o;
import p048g2.C2635a;
import p054h1.C2694t;
import p061i1.C2818q;
import p069j1.C3163g2;

public final class qn2 extends C1978mx implements C2818q, C2007np {

    /* renamed from: f */
    private final bw0 f13243f;

    /* renamed from: g */
    private final Context f13244g;

    /* renamed from: h */
    private AtomicBoolean f13245h = new AtomicBoolean();

    /* renamed from: i */
    private final String f13246i;

    /* renamed from: j */
    private final kn2 f13247j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final in2 f13248k;
    @GuardedBy("this")

    /* renamed from: l */
    private long f13249l = -1;
    @GuardedBy("this")

    /* renamed from: m */
    private n31 f13250m;
    @GuardedBy("this")

    /* renamed from: n */
    protected m41 f13251n;

    public qn2(bw0 bw0, Context context, String str, kn2 kn2, in2 in2) {
        this.f13243f = bw0;
        this.f13244g = context;
        this.f13246i = str;
        this.f13247j = kn2;
        this.f13248k = in2;
        in2.mo8181m(this);
    }

    /* renamed from: A5 */
    private final synchronized void m15730A5(int i) {
        if (this.f13245h.compareAndSet(false, true)) {
            this.f13248k.mo8180i();
            n31 n31 = this.f13250m;
            if (n31 != null) {
                C2694t.m21594c().mo11042e(n31);
            }
            if (this.f13251n != null) {
                long j = -1;
                if (this.f13249l != -1) {
                    j = C2694t.m21592a().mo12463b() - this.f13249l;
                }
                this.f13251n.mo9127k(j, i);
            }
            mo7457M();
        }
    }

    /* renamed from: A0 */
    public final boolean mo7450A0() {
        return false;
    }

    /* renamed from: C4 */
    public final void mo7451C4(C2341wp wpVar) {
        this.f13248k.mo8185y(wpVar);
    }

    /* renamed from: D */
    public final void mo5643D(int i) {
        int i2;
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i3 != 0) {
            if (i3 == 1) {
                i2 = 4;
            } else if (i3 == 2) {
                m15730A5(3);
                return;
            } else if (i3 == 3) {
                i2 = 6;
            } else {
                return;
            }
            m15730A5(i2);
        } else {
            m15730A5(2);
        }
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
        m41 m41 = this.f13251n;
        if (m41 != null) {
            m41.mo9123a();
        }
    }

    /* renamed from: M3 */
    public final void mo5644M3() {
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
        return this.f13247j.zza();
    }

    /* renamed from: W3 */
    public final synchronized void mo7466W3(C2423yx yxVar) {
    }

    /* renamed from: X3 */
    public final synchronized boolean mo7467X3(C1902kv kvVar) {
        C0092o.m309e("loadAd must be called on the main UI thread.");
        C2694t.m21608q();
        if (C3163g2.m23936l(this.f13244g)) {
            if (kvVar.f9685x == null) {
                io0.m11128d("Failed to load the ad because app ID is missing.");
                this.f13248k.mo7808d(dt2.m8099d(4, (String) null, (C1605cv) null));
                return false;
            }
        }
        if (mo7465U3()) {
            return false;
        }
        this.f13245h = new AtomicBoolean();
        return this.f13247j.mo6124a(kvVar, this.f13246i, new on2(this), new pn2(this));
    }

    /* renamed from: Y1 */
    public final void mo7468Y1(C1902kv kvVar, C1644dx dxVar) {
    }

    /* renamed from: Z2 */
    public final void mo5645Z2() {
    }

    /* renamed from: a */
    public final synchronized void mo5646a() {
        if (this.f13251n != null) {
            this.f13249l = C2694t.m21592a().mo12463b();
            int h = this.f13251n.mo9124h();
            if (h > 0) {
                n31 n31 = new n31(this.f13243f.mo5600e(), C2694t.m21592a());
                this.f13250m = n31;
                n31.mo9410d(h, new nn2(this));
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo5647b() {
        m41 m41 = this.f13251n;
        if (m41 != null) {
            m41.mo9127k(C2694t.m21592a().mo12463b() - this.f13249l, 1);
        }
    }

    /* renamed from: b1 */
    public final void mo7469b1(String str) {
    }

    /* renamed from: b4 */
    public final void mo7470b4(C2309vv vvVar) {
        this.f13247j.mo10607k(vvVar);
    }

    /* renamed from: d2 */
    public final void mo7471d2(C1571by byVar) {
    }

    /* renamed from: e */
    public final synchronized C2087pv mo7472e() {
        return null;
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

    /* renamed from: m */
    public final C2635a mo7480m() {
        return null;
    }

    /* renamed from: m5 */
    public final synchronized void mo7481m5(boolean z) {
    }

    /* renamed from: n */
    public final void mo10330n() {
        this.f13243f.mo5599d().execute(new mn2(this));
    }

    /* renamed from: n3 */
    public final void mo7482n3(C2274ux uxVar) {
    }

    /* renamed from: n5 */
    public final synchronized void mo7483n5(s00 s00) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo10331o() {
        m15730A5(5);
    }

    /* renamed from: o0 */
    public final synchronized void mo7484o0() {
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
        return this.f13246i;
    }

    /* renamed from: u5 */
    public final void mo5655u5() {
    }

    /* renamed from: y1 */
    public final void mo7489y1(mh0 mh0, String str) {
    }

    public final void zza() {
        m15730A5(3);
    }
}
