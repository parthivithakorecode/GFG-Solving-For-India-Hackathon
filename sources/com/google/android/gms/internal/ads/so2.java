package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ea1;
import javax.annotation.concurrent.GuardedBy;

public final class so2<RequestComponentT extends ea1<AdT>, AdT> implements ep2<RequestComponentT, AdT> {
    @GuardedBy("this")

    /* renamed from: a */
    private RequestComponentT f14519a;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cc3 mo7009a(fp2 fp2, dp2 dp2, Object obj) {
        return mo10832c(fp2, dp2, (ea1) null);
    }

    /* renamed from: b */
    public final synchronized RequestComponentT mo7012g() {
        return this.f14519a;
    }

    /* renamed from: c */
    public final synchronized cc3<AdT> mo10832c(fp2 fp2, dp2<RequestComponentT> dp2, RequestComponentT requestcomponentt) {
        z71 a;
        if (requestcomponentt != null) {
            this.f14519a = requestcomponentt;
        } else {
            this.f14519a = (ea1) dp2.mo6523a(fp2.f6885b).mo6106f();
        }
        a = this.f14519a.mo6881a();
        return a.mo12178h(a.mo12179i());
    }
}
