package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class sp2 implements cd2<ij1> {

    /* renamed from: a */
    private final Context f14522a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f14523b;

    /* renamed from: c */
    private final bw0 f14524c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final lc2 f14525d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final tq2 f14526e;

    /* renamed from: f */
    private i20 f14527f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final qx2 f14528g;
    @GuardedBy("this")

    /* renamed from: h */
    private final is2 f14529h;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: i */
    public cc3<ij1> f14530i;

    public sp2(Context context, Executor executor, bw0 bw0, lc2 lc2, tq2 tq2, is2 is2) {
        this.f14522a = context;
        this.f14523b = executor;
        this.f14524c = bw0;
        this.f14525d = lc2;
        this.f14529h = is2;
        this.f14526e = tq2;
        this.f14528g = bw0.mo5597b();
    }

    /* renamed from: a */
    public final boolean mo6124a(C1902kv kvVar, String str, ad2 ad2, bd2<? super ij1> bd2) {
        gk1 gk1;
        ox2 p = ox2.m14693p(this.f14522a, 7, 4, kvVar);
        if (str == null) {
            io0.m11128d("Ad unit ID should not be null for interstitial ad.");
            this.f14523b.execute(new mp2(this));
            if (p != null) {
                qx2 qx2 = this.f14528g;
                p.mo9883g(false);
                qx2.mo10426a(p.mo9885i());
            }
            return false;
        } else if (zza()) {
            if (p != null) {
                qx2 qx22 = this.f14528g;
                p.mo9883g(false);
                qx22.mo10426a(p.mo9885i());
            }
            return false;
        } else {
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10240A6)).booleanValue() && kvVar.f9672k) {
                this.f14524c.mo5611s().mo11341l(true);
            }
            C2087pv pvVar = ((lp2) ad2).f10115a;
            is2 is2 = this.f14529h;
            is2.mo8253H(str);
            is2.mo8252G(pvVar);
            is2.mo8264d(kvVar);
            ks2 f = is2.mo8266f();
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10423X5)).booleanValue()) {
                fk1 n = this.f14524c.mo5606n();
                fa1 fa1 = new fa1();
                fa1.mo7274c(this.f14522a);
                fa1.mo7277f(f);
                n.mo6344t(fa1.mo7278g());
                mg1 mg1 = new mg1();
                mg1.mo9248m(this.f14525d, this.f14523b);
                mg1.mo9249n(this.f14525d, this.f14523b);
                n.mo6342j(mg1.mo9252q());
                n.mo6343k(new ua2(this.f14527f));
                gk1 = n.mo6341d();
            } else {
                mg1 mg12 = new mg1();
                tq2 tq2 = this.f14526e;
                if (tq2 != null) {
                    mg12.mo9243h(tq2, this.f14523b);
                    mg12.mo9244i(this.f14526e, this.f14523b);
                    mg12.mo9240e(this.f14526e, this.f14523b);
                }
                fk1 n2 = this.f14524c.mo5606n();
                fa1 fa12 = new fa1();
                fa12.mo7274c(this.f14522a);
                fa12.mo7277f(f);
                n2.mo6344t(fa12.mo7278g());
                mg12.mo9248m(this.f14525d, this.f14523b);
                mg12.mo9243h(this.f14525d, this.f14523b);
                mg12.mo9244i(this.f14525d, this.f14523b);
                mg12.mo9240e(this.f14525d, this.f14523b);
                mg12.mo9239d(this.f14525d, this.f14523b);
                mg12.mo9250o(this.f14525d, this.f14523b);
                mg12.mo9249n(this.f14525d, this.f14523b);
                mg12.mo9247l(this.f14525d, this.f14523b);
                mg12.mo9241f(this.f14525d, this.f14523b);
                n2.mo6342j(mg12.mo9252q());
                n2.mo6343k(new ua2(this.f14527f));
                gk1 = n2.mo6341d();
            }
            z71<ij1> a = gk1.mo7196a();
            cc3<ij1> h = a.mo12178h(a.mo12179i());
            this.f14530i = h;
            rb3.m16140r(h, new rp2(this, bd2, p, gk1), this.f14523b);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo10834g() {
        this.f14525d.mo7808d(dt2.m8099d(6, (String) null, (C1605cv) null));
    }

    /* renamed from: h */
    public final void mo10835h(i20 i20) {
        this.f14527f = i20;
    }

    public final boolean zza() {
        cc3<ij1> cc3 = this.f14530i;
        return cc3 != null && !cc3.isDone();
    }
}
