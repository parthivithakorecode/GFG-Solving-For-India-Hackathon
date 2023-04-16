package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class l72 implements kv3<k72> {

    /* renamed from: a */
    private final yv3<Context> f9927a;

    /* renamed from: b */
    private final yv3<po0> f9928b;

    /* renamed from: c */
    private final yv3<gk1> f9929c;

    /* renamed from: d */
    private final yv3<Executor> f9930d;

    public l72(yv3<Context> yv3, yv3<po0> yv32, yv3<gk1> yv33, yv3<Executor> yv34) {
        this.f9927a = yv3;
        this.f9928b = yv32;
        this.f9929c = yv33;
        this.f9930d = yv34;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        return new k72(this.f9927a.mo5051a(), ((rw0) this.f9928b).mo10680b(), this.f9929c.mo5051a(), dc3);
    }
}
