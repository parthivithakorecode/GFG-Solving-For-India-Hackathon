package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class g91 implements kv3<hi1<vf1>> {

    /* renamed from: a */
    private final yv3<hv1> f7310a;

    /* renamed from: b */
    private final yv3<Executor> f7311b;

    /* renamed from: c */
    private final yv3<u22> f7312c;

    public g91(yv3<hv1> yv3, yv3<Executor> yv32, yv3<u22> yv33) {
        this.f7310a = yv3;
        this.f7311b = yv32;
        this.f7312c = yv33;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        hv1 a = this.f7310a.mo5051a();
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        return ((Boolean) C2199sw.m17001c().mo8579b(m10.f10592q6)).booleanValue() ? new hi1(this.f7312c.mo5051a(), dc3) : new hi1(a, dc3);
    }
}
