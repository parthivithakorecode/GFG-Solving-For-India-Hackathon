package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class x62 implements kv3<w62> {

    /* renamed from: a */
    private final yv3<r51> f17046a;

    /* renamed from: b */
    private final yv3<c62> f17047b;

    /* renamed from: c */
    private final yv3<xa1> f17048c;

    /* renamed from: d */
    private final yv3<ScheduledExecutorService> f17049d;

    /* renamed from: e */
    private final yv3<dc3> f17050e;

    public x62(yv3<r51> yv3, yv3<c62> yv32, yv3<xa1> yv33, yv3<ScheduledExecutorService> yv34, yv3<dc3> yv35) {
        this.f17046a = yv3;
        this.f17047b = yv32;
        this.f17048c = yv33;
        this.f17049d = yv34;
        this.f17050e = yv35;
    }

    /* renamed from: b */
    public final w62 mo5051a() {
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        return new w62(this.f17046a.mo5051a(), ((d62) this.f17047b).mo5051a(), this.f17048c.mo5051a(), this.f17049d.mo5051a(), dc3);
    }
}
