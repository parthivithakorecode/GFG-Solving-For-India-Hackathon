package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class lb1 implements kv3<jb1> {

    /* renamed from: a */
    private final yv3<ib1> f9980a;

    /* renamed from: b */
    private final yv3<Set<hi1<za1>>> f9981b;

    /* renamed from: c */
    private final yv3<Executor> f9982c;

    /* renamed from: d */
    private final yv3<ScheduledExecutorService> f9983d;

    public lb1(yv3<ib1> yv3, yv3<Set<hi1<za1>>> yv32, yv3<Executor> yv33, yv3<ScheduledExecutorService> yv34) {
        this.f9980a = yv3;
        this.f9981b = yv32;
        this.f9982c = yv33;
        this.f9983d = yv34;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        ib1 b = ((kb1) this.f9980a).mo5051a();
        Set c = ((wv3) this.f9981b).mo5051a();
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        return new jb1(b, c, dc3, this.f9983d.mo5051a());
    }
}
