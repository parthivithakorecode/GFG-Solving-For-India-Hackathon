package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class x82<AdT> implements kv3<w82<AdT>> {

    /* renamed from: a */
    private final yv3<nw2> f17069a;

    /* renamed from: b */
    private final yv3<r82> f17070b;

    /* renamed from: c */
    private final yv3<xa1> f17071c;

    /* renamed from: d */
    private final yv3<zx2> f17072d;

    /* renamed from: e */
    private final yv3<cy2> f17073e;

    /* renamed from: f */
    private final yv3<y61<AdT>> f17074f;

    /* renamed from: g */
    private final yv3<Executor> f17075g;

    /* renamed from: h */
    private final yv3<ScheduledExecutorService> f17076h;

    /* renamed from: i */
    private final yv3<f52> f17077i;

    public x82(yv3<nw2> yv3, yv3<r82> yv32, yv3<xa1> yv33, yv3<zx2> yv34, yv3<cy2> yv35, yv3<y61<AdT>> yv36, yv3<Executor> yv37, yv3<ScheduledExecutorService> yv38, yv3<f52> yv39) {
        this.f17069a = yv3;
        this.f17070b = yv32;
        this.f17071c = yv33;
        this.f17072d = yv34;
        this.f17073e = yv35;
        this.f17074f = yv36;
        this.f17075g = yv37;
        this.f17076h = yv38;
        this.f17077i = yv39;
    }

    /* renamed from: b */
    public final w82<AdT> mo5051a() {
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        return new w82(this.f17069a.mo5051a(), this.f17070b.mo5051a(), this.f17071c.mo5051a(), this.f17072d.mo5051a(), this.f17073e.mo5051a(), this.f17074f.mo5051a(), dc3, this.f17076h.mo5051a(), this.f17077i.mo5051a());
    }
}
