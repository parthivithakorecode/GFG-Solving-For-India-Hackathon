package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class f02 implements kv3<e02> {

    /* renamed from: a */
    private final yv3<ScheduledExecutorService> f6641a;

    /* renamed from: b */
    private final yv3<dc3> f6642b;

    /* renamed from: c */
    private final yv3<w02> f6643c;

    /* renamed from: d */
    private final yv3<m22> f6644d;

    public f02(yv3<ScheduledExecutorService> yv3, yv3<dc3> yv32, yv3<w02> yv33, yv3<m22> yv34) {
        this.f6641a = yv3;
        this.f6642b = yv32;
        this.f6643c = yv33;
        this.f6644d = yv34;
    }

    /* renamed from: b */
    public final e02 mo5051a() {
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        return new e02(this.f6641a.mo5051a(), dc3, ((x02) this.f6643c).mo5051a(), jv3.m11855b(this.f6644d));
    }
}
