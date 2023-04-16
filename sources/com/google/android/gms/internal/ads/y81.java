package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class y81 implements kv3<hi1<za1>> {

    /* renamed from: a */
    private final yv3<hv1> f17629a;

    /* renamed from: b */
    private final yv3<Executor> f17630b;

    /* renamed from: c */
    private final yv3<u22> f17631c;

    public y81(yv3<hv1> yv3, yv3<Executor> yv32, yv3<u22> yv33) {
        this.f17629a = yv3;
        this.f17630b = yv32;
        this.f17631c = yv33;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        hv1 a = this.f17629a.mo5051a();
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        return ((Boolean) C2199sw.m17001c().mo8579b(m10.f10592q6)).booleanValue() ? new hi1(this.f17631c.mo5051a(), dc3) : new hi1(a, dc3);
    }
}
