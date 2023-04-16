package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class vl2 implements kv3<tl2> {

    /* renamed from: a */
    private final yv3<tn0> f16344a;

    /* renamed from: b */
    private final yv3<Boolean> f16345b;

    /* renamed from: c */
    private final yv3<jn0> f16346c;

    /* renamed from: d */
    private final yv3<dc3> f16347d;

    /* renamed from: e */
    private final yv3<String> f16348e;

    /* renamed from: f */
    private final yv3<ScheduledExecutorService> f16349f;

    public vl2(yv3<tn0> yv3, yv3<Boolean> yv32, yv3<jn0> yv33, yv3<dc3> yv34, yv3<String> yv35, yv3<ScheduledExecutorService> yv36) {
        this.f16344a = yv3;
        this.f16345b = yv32;
        this.f16346c = yv33;
        this.f16347d = yv34;
        this.f16348e = yv35;
        this.f16349f = yv36;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        boolean booleanValue = ((ml2) this.f16345b).mo5051a().booleanValue();
        jn0 jn0 = new jn0();
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        return new tl2(this.f16344a.mo5051a(), booleanValue, jn0, dc3, ((kl2) this.f16348e).mo8691b(), this.f16349f.mo5051a(), (byte[]) null);
    }
}
