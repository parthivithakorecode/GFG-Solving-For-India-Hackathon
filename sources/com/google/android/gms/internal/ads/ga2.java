package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.hc1;

public final class ga2<AdT, AdapterT, ListenerT extends hc1> implements kv3<fa2<AdT, AdapterT, ListenerT>> {

    /* renamed from: a */
    private final yv3<nw2> f7329a;

    /* renamed from: b */
    private final yv3<dc3> f7330b;

    /* renamed from: c */
    private final yv3<c52<AdapterT, ListenerT>> f7331c;

    /* renamed from: d */
    private final yv3<j52<AdT, AdapterT, ListenerT>> f7332d;

    public ga2(yv3<nw2> yv3, yv3<dc3> yv32, yv3<c52<AdapterT, ListenerT>> yv33, yv3<j52<AdT, AdapterT, ListenerT>> yv34) {
        this.f7329a = yv3;
        this.f7330b = yv32;
        this.f7331c = yv33;
        this.f7332d = yv34;
    }

    /* renamed from: b */
    public final fa2<AdT, AdapterT, ListenerT> mo5051a() {
        return new fa2<>(this.f7329a.mo5051a(), this.f7330b.mo5051a(), this.f7331c.mo5051a(), this.f7332d.mo5051a());
    }
}
