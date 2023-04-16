package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class h31 implements kv3<Set<hi1<rb1>>> {

    /* renamed from: a */
    private final yv3<b31> f8031a;

    /* renamed from: b */
    private final yv3<Executor> f8032b;

    /* renamed from: c */
    private final yv3<JSONObject> f8033c;

    public h31(yv3<b31> yv3, yv3<Executor> yv32, yv3<JSONObject> yv33) {
        this.f8031a = yv3;
        this.f8032b = yv32;
        this.f8033c = yv33;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        b31 a = this.f8031a.mo5051a();
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        Set emptySet = this.f8033c.mo5051a() == null ? Collections.emptySet() : Collections.singleton(new hi1(a, dc3));
        sv3.m16997b(emptySet);
        return emptySet;
    }
}
