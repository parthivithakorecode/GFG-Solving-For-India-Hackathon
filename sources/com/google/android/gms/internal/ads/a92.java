package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class a92 implements kv3<z82> {

    /* renamed from: a */
    private final yv3<Context> f4026a;

    /* renamed from: b */
    private final yv3<Executor> f4027b;

    /* renamed from: c */
    private final yv3<ms1> f4028c;

    public a92(yv3<Context> yv3, yv3<Executor> yv32, yv3<ms1> yv33) {
        this.f4026a = yv3;
        this.f4027b = yv32;
        this.f4028c = yv33;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        return new z82(this.f4026a.mo5051a(), this.f4027b.mo5051a(), this.f4028c.mo5051a());
    }
}
