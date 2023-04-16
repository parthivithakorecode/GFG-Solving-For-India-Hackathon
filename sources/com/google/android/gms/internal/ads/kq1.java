package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

public final class kq1 {

    /* renamed from: a */
    private final Executor f9601a;

    /* renamed from: b */
    private final l31 f9602b;

    /* renamed from: c */
    private final ji1 f9603c;

    kq1(Executor executor, l31 l31, ji1 ji1) {
        this.f9601a = executor;
        this.f9603c = ji1;
        this.f9602b = l31;
    }

    /* renamed from: a */
    public final void mo8729a(eu0 eu0) {
        if (eu0 != null) {
            this.f9603c.mo8466S0(eu0.mo7105Y());
            this.f9603c.mo8945B0(new gq1(eu0), this.f9601a);
            this.f9603c.mo8945B0(new hq1(eu0), this.f9601a);
            this.f9603c.mo8945B0(this.f9602b, this.f9601a);
            this.f9602b.mo8862e(eu0);
            eu0.mo7080F0("/trackActiveViewUnit", new iq1(this));
            eu0.mo7080F0("/untrackActiveViewUnit", new jq1(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo8730b(eu0 eu0, Map map) {
        this.f9602b.mo8859b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo8731c(eu0 eu0, Map map) {
        this.f9602b.mo8858a();
    }
}
