package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class gl2 implements ij2<hl2> {

    /* renamed from: a */
    final ScheduledExecutorService f7521a;

    /* renamed from: b */
    final Context f7522b;

    /* renamed from: c */
    final dh0 f7523c;

    public gl2(dh0 dh0, ScheduledExecutorService scheduledExecutorService, Context context, byte[] bArr) {
        this.f7523c = dh0;
        this.f7521a = scheduledExecutorService;
        this.f7522b = context;
    }

    /* renamed from: a */
    public final cc3<hl2> mo5813a() {
        return rb3.m16135m(rb3.m16137o(rb3.m16131i(new Bundle()), ((Long) C2199sw.m17001c().mo8579b(m10.f10276F2)).longValue(), TimeUnit.MILLISECONDS, this.f7521a), fl2.f6865a, wo0.f16886a);
    }
}
