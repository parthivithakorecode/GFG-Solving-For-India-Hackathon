package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

public final class il2 implements kv3<gl2> {

    /* renamed from: a */
    private final yv3<dh0> f8681a;

    /* renamed from: b */
    private final yv3<ScheduledExecutorService> f8682b;

    /* renamed from: c */
    private final yv3<Context> f8683c;

    public il2(yv3<dh0> yv3, yv3<ScheduledExecutorService> yv32, yv3<Context> yv33) {
        this.f8681a = yv3;
        this.f8682b = yv32;
        this.f8683c = yv33;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        return new gl2(new dh0(), this.f8682b.mo5051a(), ((gw0) this.f8683c).mo7719b(), (byte[]) null);
    }
}
