package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class i91 implements kv3<hi1<qb1>> {

    /* renamed from: a */
    private final yv3<hv1> f8578a;

    /* renamed from: b */
    private final yv3<Executor> f8579b;

    /* renamed from: c */
    private final yv3<u22> f8580c;

    public i91(yv3<hv1> yv3, yv3<Executor> yv32, yv3<u22> yv33) {
        this.f8578a = yv3;
        this.f8579b = yv32;
        this.f8580c = yv33;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        hv1 a = this.f8578a.mo5051a();
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        return ((Boolean) C2199sw.m17001c().mo8579b(m10.f10592q6)).booleanValue() ? new hi1(this.f8580c.mo5051a(), dc3) : new hi1(a, dc3);
    }
}
