package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class v91 implements kv3<u91> {

    /* renamed from: a */
    private final yv3<ob1> f15947a;

    /* renamed from: b */
    private final yv3<rr2> f15948b;

    /* renamed from: c */
    private final yv3<ScheduledExecutorService> f15949c;

    /* renamed from: d */
    private final yv3<Executor> f15950d;

    public v91(yv3<ob1> yv3, yv3<rr2> yv32, yv3<ScheduledExecutorService> yv33, yv3<Executor> yv34) {
        this.f15947a = yv3;
        this.f15948b = yv32;
        this.f15949c = yv33;
        this.f15950d = yv34;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        return new u91(this.f15947a.mo5051a(), ((m71) this.f15948b).mo9148b(), this.f15949c.mo5051a(), dc3);
    }
}
