package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;
import p054h1.C2694t;

public final class f31 implements kv3<C2264un> {

    /* renamed from: a */
    private final yv3<rr2> f6673a;

    /* renamed from: b */
    private final yv3<po0> f6674b;

    /* renamed from: c */
    private final yv3<JSONObject> f6675c;

    /* renamed from: d */
    private final yv3<String> f6676d;

    public f31(yv3<rr2> yv3, yv3<po0> yv32, yv3<JSONObject> yv33, yv3<String> yv34) {
        this.f6673a = yv3;
        this.f6674b = yv32;
        this.f6675c = yv33;
        this.f6676d = yv34;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        ((m71) this.f6673a).mo9148b();
        String a = this.f6676d.mo5051a();
        boolean equals = "native".equals(a);
        C2694t.m21608q();
        return new C2264un(UUID.randomUUID().toString(), ((rw0) this.f6674b).mo10680b(), a, this.f6675c.mo5051a(), false, equals);
    }
}
