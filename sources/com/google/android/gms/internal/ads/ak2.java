package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class ak2 implements kv3<yj2> {

    /* renamed from: a */
    private final yv3<ln0> f4230a;

    /* renamed from: b */
    private final yv3<Context> f4231b;

    /* renamed from: c */
    private final yv3<ScheduledExecutorService> f4232c;

    /* renamed from: d */
    private final yv3<Executor> f4233d;

    /* renamed from: e */
    private final yv3<Integer> f4234e;

    public ak2(yv3<ln0> yv3, yv3<Context> yv32, yv3<ScheduledExecutorService> yv33, yv3<Executor> yv34, yv3<Integer> yv35) {
        this.f4230a = yv3;
        this.f4231b = yv32;
        this.f4232c = yv33;
        this.f4233d = yv34;
        this.f4234e = yv35;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        return new yj2(new ln0(), ((gw0) this.f4231b).mo7719b(), this.f4232c.mo5051a(), dc3, ((ll2) this.f4234e).mo5051a().intValue(), (byte[]) null);
    }
}
