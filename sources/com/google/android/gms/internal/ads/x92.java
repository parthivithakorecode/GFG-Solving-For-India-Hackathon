package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class x92 implements kv3<w92> {

    /* renamed from: a */
    private final yv3<Context> f17088a;

    /* renamed from: b */
    private final yv3<Executor> f17089b;

    /* renamed from: c */
    private final yv3<ms1> f17090c;

    public x92(yv3<Context> yv3, yv3<Executor> yv32, yv3<ms1> yv33) {
        this.f17088a = yv3;
        this.f17089b = yv32;
        this.f17090c = yv33;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        return new w92(this.f17088a.mo5051a(), this.f17089b.mo5051a(), this.f17090c.mo5051a());
    }
}
