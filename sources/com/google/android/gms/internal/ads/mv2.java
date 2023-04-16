package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public final class mv2 implements kv3<ScheduledExecutorService> {

    /* renamed from: a */
    private final yv3<ThreadFactory> f11055a;

    public mv2(yv3<ThreadFactory> yv3) {
        this.f11055a = yv3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        r33.m16037a();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, this.f11055a.mo5051a()));
        sv3.m16997b(unconfigurableScheduledExecutorService);
        return unconfigurableScheduledExecutorService;
    }
}
