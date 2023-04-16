package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ea1;
import javax.annotation.concurrent.GuardedBy;

public final class to2<RequestComponentT extends ea1<AdT>, AdT> implements ep2<RequestComponentT, AdT> {

    /* renamed from: a */
    private final ep2<RequestComponentT, AdT> f14935a;
    @GuardedBy("this")

    /* renamed from: b */
    private RequestComponentT f14936b;

    public to2(ep2<RequestComponentT, AdT> ep2) {
        this.f14935a = ep2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cc3 mo7009a(fp2 fp2, dp2 dp2, Object obj) {
        return mo11045c(fp2, dp2, (ea1) null);
    }

    /* renamed from: b */
    public final synchronized RequestComponentT mo7012g() {
        return this.f14936b;
    }

    /* renamed from: c */
    public final synchronized cc3<AdT> mo11045c(fp2 fp2, dp2<RequestComponentT> dp2, RequestComponentT requestcomponentt) {
        this.f14936b = requestcomponentt;
        if (fp2.f6884a != null) {
            z71 a = requestcomponentt.mo6881a();
            return a.mo12178h(a.mo12180j(rb3.m16131i(fp2.f6884a)));
        }
        return ((so2) this.f14935a).mo10832c(fp2, dp2, requestcomponentt);
    }
}
