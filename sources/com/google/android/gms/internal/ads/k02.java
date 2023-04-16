package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class k02 implements kv3<j02> {

    /* renamed from: a */
    private final yv3<ks2> f9326a;

    /* renamed from: b */
    private final yv3<jz1> f9327b;

    /* renamed from: c */
    private final yv3<dc3> f9328c;

    /* renamed from: d */
    private final yv3<ScheduledExecutorService> f9329d;

    /* renamed from: e */
    private final yv3<r32> f9330e;

    public k02(yv3<ks2> yv3, yv3<jz1> yv32, yv3<dc3> yv33, yv3<ScheduledExecutorService> yv34, yv3<r32> yv35) {
        this.f9326a = yv3;
        this.f9327b = yv32;
        this.f9328c = yv33;
        this.f9329d = yv34;
        this.f9330e = yv35;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        ks2 b = ((ma1) this.f9326a).mo9153b();
        jz1 b2 = ((kz1) this.f9327b).mo5051a();
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        return new j02(b, b2, dc3, this.f9329d.mo5051a(), this.f9330e.mo5051a());
    }
}
