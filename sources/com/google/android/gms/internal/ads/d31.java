package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class d31 implements kv3<w21> {

    /* renamed from: a */
    private final yv3<C2264un> f5632a;

    /* renamed from: b */
    private final yv3<lc0> f5633b;

    /* renamed from: c */
    private final yv3<Executor> f5634c;

    public d31(yv3<C2264un> yv3, yv3<lc0> yv32, yv3<Executor> yv33) {
        this.f5632a = yv3;
        this.f5633b = yv32;
        this.f5634c = yv33;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        dc3 a = yu2.m20323a();
        sv3.m16997b(a);
        return new w21(this.f5632a.mo5051a().mo11251c(), this.f5633b.mo5051a(), a);
    }
}
