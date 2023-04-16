package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class pk2 implements kv3<nk2> {

    /* renamed from: a */
    private final yv3<ln0> f12685a;

    /* renamed from: b */
    private final yv3<Integer> f12686b;

    /* renamed from: c */
    private final yv3<Context> f12687c;

    /* renamed from: d */
    private final yv3<tn0> f12688d;

    /* renamed from: e */
    private final yv3<ScheduledExecutorService> f12689e;

    /* renamed from: f */
    private final yv3<Executor> f12690f;

    /* renamed from: g */
    private final yv3<String> f12691g;

    public pk2(yv3<ln0> yv3, yv3<Integer> yv32, yv3<Context> yv33, yv3<tn0> yv34, yv3<ScheduledExecutorService> yv35, yv3<Executor> yv36, yv3<String> yv37) {
        this.f12685a = yv3;
        this.f12686b = yv32;
        this.f12687c = yv33;
        this.f12688d = yv34;
        this.f12689e = yv35;
        this.f12690f = yv36;
        this.f12691g = yv37;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        return new nk2(new ln0(), ((ll2) this.f12686b).mo5051a().intValue(), ((gw0) this.f12687c).mo7719b(), this.f12688d.mo5051a(), this.f12689e.mo5051a(), dc3, ((kl2) this.f12691g).mo8691b(), (byte[]) null);
    }
}
