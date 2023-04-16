package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class tl2 implements ij2<ul2> {

    /* renamed from: a */
    private final tn0 f14903a;

    /* renamed from: b */
    private final boolean f14904b;

    /* renamed from: c */
    private final ScheduledExecutorService f14905c;

    /* renamed from: d */
    private final dc3 f14906d;

    /* renamed from: e */
    private final String f14907e;

    /* renamed from: f */
    private final jn0 f14908f;

    tl2(tn0 tn0, boolean z, jn0 jn0, dc3 dc3, String str, ScheduledExecutorService scheduledExecutorService, byte[] bArr) {
        this.f14903a = tn0;
        this.f14904b = z;
        this.f14908f = jn0;
        this.f14906d = dc3;
        this.f14907e = str;
        this.f14905c = scheduledExecutorService;
    }

    /* renamed from: a */
    public final cc3<ul2> mo5813a() {
        if (!o30.f11866a.mo9928e().booleanValue() && !this.f14904b) {
            return rb3.m16131i(null);
        }
        return rb3.m16128f(rb3.m16137o(rb3.m16135m(rb3.m16131i(null), sl2.f14489a, this.f14906d), o30.f11868c.mo9928e().longValue(), TimeUnit.MILLISECONDS, this.f14905c), Exception.class, new rl2(this), this.f14906d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ ul2 mo11015b(Exception exc) {
        this.f14903a.mo11034s(exc, "TrustlessTokenSignal");
        return null;
    }
}
