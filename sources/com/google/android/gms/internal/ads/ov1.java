package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class ov1 implements kv3<hi1<lc1>> {

    /* renamed from: a */
    private final yv3<jv1> f12213a;

    /* renamed from: b */
    private final yv3<Executor> f12214b;

    /* renamed from: c */
    private final yv3<w22> f12215c;

    public ov1(yv3<jv1> yv3, yv3<Executor> yv32, yv3<w22> yv33) {
        this.f12213a = yv3;
        this.f12214b = yv32;
        this.f12215c = yv33;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        jv1 a = this.f12213a.mo5051a();
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        return ((Boolean) C2199sw.m17001c().mo8579b(m10.f10592q6)).booleanValue() ? new hi1(this.f12215c.mo5051a(), dc3) : new hi1(a, dc3);
    }
}
