package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import p054h1.C2694t;
import p069j1.C3163g2;

public final class wn2 implements cd2<t41> {

    /* renamed from: a */
    private final Context f16868a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f16869b;

    /* renamed from: c */
    private final bw0 f16870c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final lc2 f16871d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final qc2 f16872e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ViewGroup f16873f;

    /* renamed from: g */
    private i20 f16874g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final nd1 f16875h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final qx2 f16876i;
    @GuardedBy("this")

    /* renamed from: j */
    private final is2 f16877j;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: k */
    public cc3<t41> f16878k;

    public wn2(Context context, Executor executor, C2087pv pvVar, bw0 bw0, lc2 lc2, qc2 qc2, is2 is2) {
        this.f16868a = context;
        this.f16869b = executor;
        this.f16870c = bw0;
        this.f16871d = lc2;
        this.f16872e = qc2;
        this.f16877j = is2;
        this.f16875h = bw0.mo5605m();
        this.f16876i = bw0.mo5597b();
        this.f16873f = new FrameLayout(context);
        is2.mo8252G(pvVar);
    }

    /* renamed from: a */
    public final boolean mo6124a(C1902kv kvVar, String str, ad2 ad2, bd2<? super t41> bd2) {
        q51 q51;
        q41 q41;
        ox2 p = ox2.m14693p(this.f16868a, 7, 3, kvVar);
        if (str == null) {
            io0.m11128d("Ad unit ID should not be null for banner ad.");
            this.f16869b.execute(new sn2(this));
            if (p != null) {
                qx2 qx2 = this.f16876i;
                p.mo9883g(false);
                qx2.mo10426a(p.mo9885i());
            }
            return false;
        } else if (zza()) {
            if (p != null) {
                qx2 qx22 = this.f16876i;
                p.mo9883g(false);
                qx22.mo10426a(p.mo9885i());
            }
            return false;
        } else {
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10240A6)).booleanValue() && kvVar.f9672k) {
                this.f16870c.mo5611s().mo11341l(true);
            }
            is2 is2 = this.f16877j;
            is2.mo8253H(str);
            is2.mo8264d(kvVar);
            ks2 f = is2.mo8266f();
            if (!g30.f7256c.mo9928e().booleanValue() || !this.f16877j.mo8271v().f12814p) {
                if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10407V5)).booleanValue()) {
                    q51 = this.f16870c.mo5604l();
                    fa1 fa1 = new fa1();
                    fa1.mo7274c(this.f16868a);
                    fa1.mo7277f(f);
                    q51.mo6724p(fa1.mo7278g());
                    mg1 mg1 = new mg1();
                    mg1.mo9248m(this.f16871d, this.f16869b);
                    mg1.mo9249n(this.f16871d, this.f16869b);
                    q51.mo6726s(mg1.mo9252q());
                    q51.mo6725q(new ua2(this.f16874g));
                    q51.mo6720g(new yk1(cn1.f5454h, (C2459zw) null));
                    q51.mo6723m(new p61(this.f16875h));
                    q41 = new q41(this.f16873f);
                } else {
                    q51 = this.f16870c.mo5604l();
                    fa1 fa12 = new fa1();
                    fa12.mo7274c(this.f16868a);
                    fa12.mo7277f(f);
                    q51.mo6724p(fa12.mo7278g());
                    mg1 mg12 = new mg1();
                    mg12.mo9248m(this.f16871d, this.f16869b);
                    mg12.mo9239d(this.f16871d, this.f16869b);
                    mg12.mo9239d(this.f16872e, this.f16869b);
                    mg12.mo9250o(this.f16871d, this.f16869b);
                    mg12.mo9242g(this.f16871d, this.f16869b);
                    mg12.mo9243h(this.f16871d, this.f16869b);
                    mg12.mo9244i(this.f16871d, this.f16869b);
                    mg12.mo9240e(this.f16871d, this.f16869b);
                    mg12.mo9249n(this.f16871d, this.f16869b);
                    mg12.mo9247l(this.f16871d, this.f16869b);
                    q51.mo6726s(mg12.mo9252q());
                    q51.mo6725q(new ua2(this.f16874g));
                    q51.mo6720g(new yk1(cn1.f5454h, (C2459zw) null));
                    q51.mo6723m(new p61(this.f16875h));
                    q41 = new q41(this.f16873f);
                }
                q51.mo6721h(q41);
                r51 i = q51.mo6722i();
                z71<t41> d = i.mo7443d();
                cc3<t41> h = d.mo12178h(d.mo12179i());
                this.f16878k = h;
                rb3.m16140r(h, new vn2(this, bd2, p, i), this.f16869b);
                return true;
            }
            lc2 lc2 = this.f16871d;
            if (lc2 != null) {
                lc2.mo7808d(dt2.m8099d(7, (String) null, (C1605cv) null));
            }
            if (p != null) {
                qx2 qx23 = this.f16876i;
                p.mo9883g(false);
                qx23.mo10426a(p.mo9885i());
            }
            return false;
        }
    }

    /* renamed from: c */
    public final ViewGroup mo11684c() {
        return this.f16873f;
    }

    /* renamed from: g */
    public final is2 mo11685g() {
        return this.f16877j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo11686k() {
        this.f16871d.mo7808d(dt2.m8099d(6, (String) null, (C1605cv) null));
    }

    /* renamed from: l */
    public final void mo11687l() {
        this.f16875h.mo9508S0(60);
    }

    /* renamed from: m */
    public final void mo11688m(C2348ww wwVar) {
        this.f16872e.mo10267a(wwVar);
    }

    /* renamed from: n */
    public final void mo11689n(od1 od1) {
        this.f16875h.mo8945B0(od1, this.f16869b);
    }

    /* renamed from: o */
    public final void mo11690o(i20 i20) {
        this.f16874g = i20;
    }

    /* renamed from: p */
    public final boolean mo11691p() {
        ViewParent parent = this.f16873f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        C2694t.m21608q();
        return C3163g2.m23905B(view, view.getContext());
    }

    public final boolean zza() {
        cc3<t41> cc3 = this.f16878k;
        return cc3 != null && !cc3.isDone();
    }
}
