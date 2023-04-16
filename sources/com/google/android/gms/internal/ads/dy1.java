package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class dy1 implements kv3<cy1> {

    /* renamed from: a */
    private final yv3<Executor> f5978a;

    /* renamed from: b */
    private final yv3<Context> f5979b;

    /* renamed from: c */
    private final yv3<WeakReference<Context>> f5980c;

    /* renamed from: d */
    private final yv3<Executor> f5981d;

    /* renamed from: e */
    private final yv3<rt1> f5982e;

    /* renamed from: f */
    private final yv3<ScheduledExecutorService> f5983f;

    /* renamed from: g */
    private final yv3<gw1> f5984g;

    /* renamed from: h */
    private final yv3<po0> f5985h;

    /* renamed from: i */
    private final yv3<th1> f5986i;

    public dy1(yv3<Executor> yv3, yv3<Context> yv32, yv3<WeakReference<Context>> yv33, yv3<Executor> yv34, yv3<rt1> yv35, yv3<ScheduledExecutorService> yv36, yv3<gw1> yv37, yv3<po0> yv38, yv3<th1> yv39) {
        this.f5978a = yv3;
        this.f5979b = yv32;
        this.f5980c = yv33;
        this.f5981d = yv34;
        this.f5982e = yv35;
        this.f5983f = yv36;
        this.f5984g = yv37;
        this.f5985h = yv38;
        this.f5986i = yv39;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        Context b = ((gw0) this.f5979b).mo7719b();
        WeakReference<Context> b2 = ((hw0) this.f5980c).mo8030b();
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        return new cy1(this.f5978a.mo5051a(), b, b2, dc3, this.f5982e.mo5051a(), this.f5983f.mo5051a(), this.f5984g.mo5051a(), ((rw0) this.f5985h).mo10680b(), ((uh1) this.f5986i).mo5051a());
    }
}
