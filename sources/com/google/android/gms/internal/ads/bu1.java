package com.google.android.gms.internal.ads;

import android.content.Context;

public final class bu1 implements kv3<C1527ar> {

    /* renamed from: a */
    private final yv3<Context> f5040a;

    /* renamed from: b */
    private final yv3<String> f5041b;

    /* renamed from: c */
    private final yv3<po0> f5042c;

    /* renamed from: d */
    private final yv3<C1861jr> f5043d;

    /* renamed from: e */
    private final yv3<String> f5044e;

    public bu1(yv3<Context> yv3, yv3<String> yv32, yv3<po0> yv33, yv3<C1861jr> yv34, yv3<String> yv35) {
        this.f5040a = yv3;
        this.f5041b = yv32;
        this.f5042c = yv33;
        this.f5043d = yv34;
        this.f5044e = yv35;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        Context b = ((gw0) this.f5040a).mo7719b();
        String b2 = ((xz1) this.f5041b).mo5051a();
        po0 b3 = ((rw0) this.f5042c).mo10680b();
        C1861jr a = this.f5043d.mo5051a();
        String a2 = this.f5044e.mo5051a();
        C1527ar arVar = new C1527ar(new C1713fr(b));
        C1530au F = C1567bu.m7053F();
        F.mo5523r(b3.f12730g);
        F.mo5525t(b3.f12731h);
        F.mo5524s(true != b3.f12732i ? 2 : 0);
        arVar.mo5402b(new au1(a, b2, (C1567bu) F.mo11894o(), a2));
        return arVar;
    }
}
