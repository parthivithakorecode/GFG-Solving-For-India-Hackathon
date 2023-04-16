package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class h62 implements kv3<g62> {

    /* renamed from: a */
    private final yv3<Context> f8056a;

    /* renamed from: b */
    private final yv3<r51> f8057b;

    /* renamed from: c */
    private final yv3<Executor> f8058c;

    public h62(yv3<Context> yv3, yv3<r51> yv32, yv3<Executor> yv33) {
        this.f8056a = yv3;
        this.f8057b = yv32;
        this.f8058c = yv33;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        return new g62(this.f8056a.mo5051a(), this.f8057b.mo5051a(), this.f8058c.mo5051a());
    }
}
