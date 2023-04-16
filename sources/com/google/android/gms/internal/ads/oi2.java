package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p002a1.C0015b;
import p111p1.C3902h0;
import p111p1.C3912p;

public final class oi2 implements ij2<pi2> {

    /* renamed from: a */
    private final String f12054a;

    /* renamed from: b */
    private final dc3 f12055b;

    /* renamed from: c */
    private final ScheduledExecutorService f12056c;

    /* renamed from: d */
    private final Context f12057d;

    /* renamed from: e */
    private final ks2 f12058e;

    /* renamed from: f */
    private final bw0 f12059f;

    oi2(dc3 dc3, ScheduledExecutorService scheduledExecutorService, String str, Context context, ks2 ks2, bw0 bw0) {
        this.f12055b = dc3;
        this.f12056c = scheduledExecutorService;
        this.f12054a = str;
        this.f12057d = context;
        this.f12058e = ks2;
        this.f12059f = bw0;
    }

    /* renamed from: b */
    public static /* synthetic */ cc3 m14493b(oi2 oi2) {
        String str = oi2.f12054a;
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10625u5)).booleanValue()) {
            str = C0015b.UNKNOWN.name();
        }
        C3912p v = oi2.f12059f.mo5614v();
        fa1 fa1 = new fa1();
        fa1.mo7274c(oi2.f12057d);
        is2 is2 = new is2();
        is2.mo8253H("adUnitId");
        is2.mo8264d(oi2.f12058e.f9639d);
        is2.mo8252G(new C2087pv());
        fa1.mo7277f(is2.mo8266f());
        v.mo11556b(fa1.mo7278g());
        C3902h0 h0Var = new C3902h0();
        h0Var.mo15362a(str);
        v.mo11555a(h0Var.mo15363b());
        new mg1();
        return rb3.m16128f(rb3.m16135m((ib3) rb3.m16137o(ib3.m10985E(v.mo11557c().mo11934a()), ((Long) C2199sw.m17001c().mo8579b(m10.f10633v5)).longValue(), TimeUnit.MILLISECONDS, oi2.f12056c), ki2.f9543a, oi2.f12055b), Exception.class, li2.f10067a, oi2.f12055b);
    }

    /* renamed from: a */
    public final cc3<pi2> mo5813a() {
        return (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10617t5)).booleanValue() || "adUnitId".equals(this.f12058e.f9641f)) ? this.f12055b.mo6445C(ni2.f11497a) : rb3.m16134l(new mi2(this), this.f12055b);
    }
}
