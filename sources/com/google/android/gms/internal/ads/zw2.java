package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class zw2 implements kv3<xw2> {

    /* renamed from: a */
    private final yv3<ex2> f18380a;

    /* renamed from: b */
    private final yv3<mx2> f18381b;

    /* renamed from: c */
    private final yv3<ScheduledExecutorService> f18382c;

    public zw2(yv3<ex2> yv3, yv3<mx2> yv32, yv3<ScheduledExecutorService> yv33) {
        this.f18380a = yv3;
        this.f18381b = yv32;
        this.f18382c = yv33;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        ev3<ex2> b = jv3.m11855b(this.f18380a);
        ev3<mx2> b2 = jv3.m11855b(this.f18381b);
        Object bx2 = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10601r6)).booleanValue() ? new bx2(b.mo7166a(), this.f18382c.mo5051a()) : b2.mo7166a();
        sv3.m16997b(bx2);
        return bx2;
    }
}
