package com.google.android.gms.internal.ads;

import android.content.Context;

public final class ra1 implements kv3<ml0> {

    /* renamed from: a */
    private final qa1 f13569a;

    /* renamed from: b */
    private final yv3<Context> f13570b;

    /* renamed from: c */
    private final yv3<po0> f13571c;

    /* renamed from: d */
    private final yv3<rr2> f13572d;

    /* renamed from: e */
    private final yv3<il0> f13573e;

    public ra1(qa1 qa1, yv3<Context> yv3, yv3<po0> yv32, yv3<rr2> yv33, yv3<il0> yv34) {
        this.f13569a = qa1;
        this.f13570b = yv3;
        this.f13571c = yv32;
        this.f13572d = yv33;
        this.f13573e = yv34;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5051a() {
        Context a = this.f13570b.mo5051a();
        po0 b = ((rw0) this.f13571c).mo10680b();
        rr2 b2 = ((m71) this.f13572d).mo9148b();
        il0 il0 = new il0();
        jl0 jl0 = b2.f13859B;
        if (jl0 != null) {
            return new fl0(a, b, jl0, b2.f13914t.f16919b, il0, (byte[]) null);
        }
        return null;
    }
}
