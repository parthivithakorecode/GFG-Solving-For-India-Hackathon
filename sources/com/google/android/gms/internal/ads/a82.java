package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class a82 implements kv3<z72> {

    /* renamed from: a */
    private final yv3<Context> f4017a;

    /* renamed from: b */
    private final yv3<dl1> f4018b;

    /* renamed from: c */
    private final yv3<Executor> f4019c;

    public a82(yv3<Context> yv3, yv3<dl1> yv32, yv3<Executor> yv33) {
        this.f4017a = yv3;
        this.f4018b = yv32;
        this.f4019c = yv33;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        return new z72(this.f4017a.mo5051a(), this.f4018b.mo5051a(), this.f4019c.mo5051a());
    }
}
