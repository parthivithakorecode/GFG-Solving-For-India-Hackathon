package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ea1;
import com.google.android.gms.internal.ads.v61;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class jo2<R extends ea1<AdT>, AdT extends v61> implements ep2<R, AdT> {

    /* renamed from: a */
    private final ep2<R, AdT> f9210a;

    /* renamed from: b */
    private final ep2<R, oo2<R, AdT>> f9211b;

    /* renamed from: c */
    private final qu2<R, AdT> f9212c;

    /* renamed from: d */
    private final String f9213d;
    @GuardedBy("this")

    /* renamed from: e */
    private R f9214e;

    /* renamed from: f */
    private final Executor f9215f;

    public jo2(ep2<R, AdT> ep2, ep2<R, oo2<R, AdT>> ep22, qu2<R, AdT> qu2, String str, Executor executor) {
        this.f9210a = ep2;
        this.f9211b = ep22;
        this.f9212c = qu2;
        this.f9213d = str;
        this.f9215f = executor;
    }

    /* renamed from: f */
    private final cc3<AdT> m11749f(cu2<R, AdT> cu2, fp2 fp2) {
        R r = cu2.f5525a;
        this.f9214e = r;
        if (cu2.f5527c != null) {
            if (r.mo6882d() != null) {
                cu2.f5527c.mo11412f().mo5356q(cu2.f5525a.mo6882d());
            }
            return rb3.m16131i(cu2.f5527c);
        }
        r.mo6881a().mo12181k(cu2.f5526b);
        return ((to2) this.f9210a).mo11045c(fp2, (dp2) null, cu2.f5525a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cc3 mo7009a(fp2 fp2, dp2 dp2, Object obj) {
        return mo8504e(fp2, dp2, (ea1) null);
    }

    /* renamed from: b */
    public final synchronized R mo7012g() {
        return this.f9214e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ cc3 mo8502c(fp2 fp2, io2 io2, dp2 dp2, ea1 ea1, oo2 oo2) {
        if (oo2 != null) {
            io2 io22 = new io2(io2.f8734a, io2.f8735b, io2.f8736c, io2.f8737d, io2.f8738e, io2.f8739f, oo2.f12133a);
            if (oo2.f12135c != null) {
                this.f9214e = null;
                this.f9212c.mo10396e(io22);
                return m11749f(oo2.f12135c, fp2);
            }
            cc3<nu2<R, AdT>> a = this.f9212c.mo10395a(io22);
            if (a != null) {
                this.f9214e = null;
                return rb3.m16136n(a, new fo2(this), this.f9215f);
            }
            this.f9212c.mo10396e(io22);
            fp2 = new fp2(fp2.f6885b, oo2.f12134b);
        }
        cc3 c = ((to2) this.f9210a).mo11045c(fp2, dp2, ea1);
        this.f9214e = ea1;
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ cc3 mo8503d(nu2 nu2) {
        pu2<U, A> pu2;
        if (nu2 == null || nu2.f11716a == null || (pu2 = nu2.f11717b) == null) {
            throw new fz1(1, "Empty prefetch");
        }
        C2046or F = C2268ur.m18022F();
        C1972mr F2 = C2009nr.m14029F();
        F2.mo9357u(2);
        F2.mo9355s(C2157rr.m16410H());
        F.mo9838r(F2);
        nu2.f11716a.f5525a.mo6881a().mo12173c().mo7333B((C2268ur) F.mo11894o());
        return m11749f(nu2.f11716a, ((io2) pu2).f8735b);
    }

    /* renamed from: e */
    public final synchronized cc3<AdT> mo8504e(fp2 fp2, dp2<R> dp2, R r) {
        fp2 fp22 = fp2;
        dp2<R> dp22 = dp2;
        synchronized (this) {
            ca1<R> a = dp22.mo6523a(fp22.f6885b);
            a.mo6108o(new ko2(this.f9213d));
            R r2 = (ea1) a.mo6106f();
            r2.mo6883e();
            r2.mo6883e();
            C1902kv kvVar = r2.mo6883e().f9639d;
            if (kvVar.f9685x == null) {
                if (kvVar.f9666C == null) {
                    ks2 e = r2.mo6883e();
                    dp2<R> dp23 = dp2;
                    fp2 fp23 = fp2;
                    cc3<AdT> n = rb3.m16136n(ib3.m10985E(((po2) this.f9211b).mo10142c(fp22, dp22, r2)), new go2(this, fp2, new io2(dp23, fp23, e.f9639d, e.f9641f, this.f9215f, e.f9645j, (du2) null), dp2, r2), this.f9215f);
                    return n;
                }
            }
            this.f9214e = r2;
            cc3<AdT> c = ((to2) this.f9210a).mo11045c(fp22, dp22, r2);
            return c;
        }
    }
}
