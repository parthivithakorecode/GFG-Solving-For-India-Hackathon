package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;
import p054h1.C2694t;

public final class am1 implements kv3<C2264un> {

    /* renamed from: a */
    private final yv3<po0> f4247a;

    /* renamed from: b */
    private final yv3<String> f4248b;

    public am1(yv3<po0> yv3, yv3<String> yv32) {
        this.f4247a = yv3;
        this.f4248b = yv32;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        po0 b = ((rw0) this.f4247a).mo10680b();
        C2694t.m21608q();
        return new C2264un(UUID.randomUUID().toString(), b, "native", new JSONObject(), false, true);
    }
}
