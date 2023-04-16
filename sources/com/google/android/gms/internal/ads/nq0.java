package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;
import p069j1.C3163g2;

@TargetApi(14)
public final class nq0 {

    /* renamed from: a */
    private final long f11581a = TimeUnit.MILLISECONDS.toNanos(((Long) C2199sw.m17001c().mo8579b(m10.f10651y)).longValue());

    /* renamed from: b */
    private long f11582b;

    /* renamed from: c */
    private boolean f11583c = true;

    nq0() {
    }

    /* renamed from: a */
    public final void mo9584a(SurfaceTexture surfaceTexture, yp0 yp0) {
        if (yp0 != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.f11583c || Math.abs(timestamp - this.f11582b) >= this.f11581a) {
                this.f11583c = false;
                this.f11582b = timestamp;
                C3163g2.f20465i.post(new mq0(this, yp0));
            }
        }
    }

    /* renamed from: b */
    public final void mo9585b() {
        this.f11583c = true;
    }
}
