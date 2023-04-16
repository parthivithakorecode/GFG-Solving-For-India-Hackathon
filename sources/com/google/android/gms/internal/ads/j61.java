package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class j61 implements kv3<e61> {

    /* renamed from: a */
    private final yv3<u61> f9000a;

    /* renamed from: b */
    private final yv3<b60> f9001b;

    /* renamed from: c */
    private final yv3<Runnable> f9002c;

    /* renamed from: d */
    private final yv3<Executor> f9003d;

    public j61(yv3<u61> yv3, yv3<b60> yv32, yv3<Runnable> yv33, yv3<Executor> yv34) {
        this.f9000a = yv3;
        this.f9001b = yv32;
        this.f9002c = yv33;
        this.f9003d = yv34;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        return new e61(((s81) this.f9000a).mo5051a(), ((i61) this.f9001b).mo8089b(), ((h61) this.f9002c).mo7854b(), this.f9003d.mo5051a());
    }
}
