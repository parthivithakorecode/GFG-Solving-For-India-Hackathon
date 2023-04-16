package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class pv1 implements kv3<hi1<ow2>> {

    /* renamed from: a */
    private final yv3<aw1> f12819a;

    /* renamed from: b */
    private final yv3<Executor> f12820b;

    /* renamed from: c */
    private final yv3<d32> f12821c;

    public pv1(yv3<aw1> yv3, yv3<Executor> yv32, yv3<d32> yv33) {
        this.f12819a = yv3;
        this.f12820b = yv32;
        this.f12821c = yv33;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        aw1 a = this.f12819a.mo5051a();
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        return ((Boolean) C2199sw.m17001c().mo8579b(m10.f10592q6)).booleanValue() ? new hi1(this.f12821c.mo5051a(), dc3) : new hi1(a, dc3);
    }
}
