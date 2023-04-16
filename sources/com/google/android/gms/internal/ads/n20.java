package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

public final class n20 implements kv3<m20> {

    /* renamed from: a */
    private final yv3<Context> f11254a;

    /* renamed from: b */
    private final yv3<ScheduledExecutorService> f11255b;

    /* renamed from: c */
    private final yv3<o20> f11256c;

    public n20(yv3<Context> yv3, yv3<ScheduledExecutorService> yv32, yv3<o20> yv33) {
        this.f11254a = yv3;
        this.f11255b = yv32;
        this.f11256c = yv33;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5051a() {
        return new m20(((nt2) this.f11254a).mo9596b(), this.f11255b.mo5051a(), new o20(), (byte[]) null);
    }
}
