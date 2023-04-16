package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class i31 implements kv3<Set<hi1<C2450zn>>> {

    /* renamed from: a */
    private final yv3<b31> f8521a;

    /* renamed from: b */
    private final yv3<Executor> f8522b;

    /* renamed from: c */
    private final yv3<JSONObject> f8523c;

    public i31(yv3<b31> yv3, yv3<Executor> yv32, yv3<JSONObject> yv33) {
        this.f8521a = yv3;
        this.f8522b = yv32;
        this.f8523c = yv33;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        b31 a = this.f8521a.mo5051a();
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        Set emptySet = this.f8523c.mo5051a() == null ? Collections.emptySet() : Collections.singleton(new hi1(a, dc3));
        sv3.m16997b(emptySet);
        return emptySet;
    }
}
