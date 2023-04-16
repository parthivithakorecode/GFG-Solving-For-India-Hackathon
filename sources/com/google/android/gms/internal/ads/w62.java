package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class w62 implements a52<t41> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final r51 f16721a;

    /* renamed from: b */
    private final c62 f16722b;

    /* renamed from: c */
    private final dc3 f16723c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final xa1 f16724d;

    /* renamed from: e */
    private final ScheduledExecutorService f16725e;

    public w62(r51 r51, c62 c62, xa1 xa1, ScheduledExecutorService scheduledExecutorService, dc3 dc3) {
        this.f16721a = r51;
        this.f16722b = c62;
        this.f16724d = xa1;
        this.f16725e = scheduledExecutorService;
        this.f16723c = dc3;
    }

    /* renamed from: a */
    public final cc3<t41> mo5105a(ds2 ds2, rr2 rr2) {
        return this.f16723c.mo6445C(new u62(this, ds2, rr2));
    }

    /* renamed from: b */
    public final boolean mo5106b(ds2 ds2, rr2 rr2) {
        return ds2.f5903a.f4336a.mo8784a() != null && this.f16722b.mo5106b(ds2, rr2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ t41 mo11582c(ds2 ds2, rr2 rr2) {
        return this.f16721a.mo7441b(new l71(ds2, rr2, (String) null), new g61(ds2.f5903a.f4336a.mo8784a(), new t62(this, ds2, rr2))).zza();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo11583f(ds2 ds2, rr2 rr2) {
        rb3.m16140r(rb3.m16137o(this.f16722b.mo5105a(ds2, rr2), (long) rr2.f13872O, TimeUnit.SECONDS, this.f16725e), new v62(this), this.f16723c);
    }
}
