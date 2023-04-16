package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class mj2<T> implements kv3<lj2<T>> {

    /* renamed from: a */
    private final yv3<Executor> f10917a;

    /* renamed from: b */
    private final yv3<Set<ij2<? extends hj2<T>>>> f10918b;

    public mj2(yv3<Executor> yv3, yv3<Set<ij2<? extends hj2<T>>>> yv32) {
        this.f10917a = yv3;
        this.f10918b = yv32;
    }

    /* renamed from: b */
    public final lj2<T> mo5051a() {
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        return new lj2<>(dc3, ((wv3) this.f10918b).mo5051a());
    }
}
