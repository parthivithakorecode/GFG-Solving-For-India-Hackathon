package com.google.android.gms.internal.ads;

import java.util.Map;

public final class i12 implements kv3<h12> {

    /* renamed from: a */
    private final yv3<Map<String, yv3<j12>>> f8489a;

    /* renamed from: b */
    private final yv3<dc3> f8490b;

    /* renamed from: c */
    private final yv3<rd1> f8491c;

    public i12(yv3<Map<String, yv3<j12>>> yv3, yv3<dc3> yv32, yv3<rd1> yv33) {
        this.f8489a = yv3;
        this.f8490b = yv32;
        this.f8491c = yv33;
    }

    /* renamed from: b */
    public final h12 mo5051a() {
        Map d = ((rv3) this.f8489a).mo10678d();
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        return new h12(d, dc3, ((sd1) this.f8491c).mo5051a());
    }
}
