package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

public final class w70 {

    /* renamed from: a */
    private boolean f16727a = false;

    /* renamed from: b */
    private boolean f16728b = false;

    /* renamed from: c */
    private float f16729c = 0.0f;

    /* renamed from: d */
    private final AtomicBoolean f16730d = new AtomicBoolean(false);

    /* renamed from: a */
    public final synchronized float mo11584a() {
        return this.f16729c;
    }

    /* renamed from: b */
    public final synchronized void mo11585b(boolean z, float f) {
        this.f16728b = z;
        this.f16729c = f;
    }

    /* renamed from: c */
    public final synchronized void mo11586c(boolean z) {
        this.f16727a = z;
        this.f16730d.set(true);
    }

    /* renamed from: d */
    public final synchronized boolean mo11587d() {
        return this.f16728b;
    }

    /* renamed from: e */
    public final synchronized boolean mo11588e(boolean z) {
        if (!this.f16730d.get()) {
            return z;
        }
        return this.f16727a;
    }
}
