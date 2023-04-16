package com.google.android.gms.internal.ads;

import android.content.Context;
import p034e2.C2547d;
import p069j1.C3208t1;

public final class wl0 extends qm0 {

    /* renamed from: b */
    private final C2547d f16845b;

    /* renamed from: c */
    private final wl0 f16846c = this;

    /* renamed from: d */
    private final yv3<Context> f16847d;

    /* renamed from: e */
    private final yv3<C3208t1> f16848e;

    /* renamed from: f */
    private final yv3<pm0> f16849f;

    /* renamed from: g */
    private final yv3<nl0> f16850g;

    /* renamed from: h */
    private final yv3<C2547d> f16851h;

    /* renamed from: i */
    private final yv3<pl0> f16852i;

    /* renamed from: j */
    private final yv3<rl0> f16853j;

    /* renamed from: k */
    private final yv3<um0> f16854k;

    /* synthetic */ wl0(Context context, C2547d dVar, C3208t1 t1Var, pm0 pm0, vl0 vl0) {
        this.f16845b = dVar;
        kv3 b = lv3.m12941b(context);
        this.f16847d = b;
        kv3 b2 = lv3.m12941b(t1Var);
        this.f16848e = b2;
        kv3 b3 = lv3.m12941b(pm0);
        this.f16849f = b3;
        this.f16850g = jv3.m11856c(new ol0(b, b2, b3));
        kv3 b4 = lv3.m12941b(dVar);
        this.f16851h = b4;
        yv3<pl0> c = jv3.m11856c(new ql0(b4, b2, b3));
        this.f16852i = c;
        sl0 sl0 = new sl0(b4, c);
        this.f16853j = sl0;
        this.f16854k = jv3.m11856c(new vm0(b, sl0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final nl0 mo10324a() {
        return this.f16850g.mo5051a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final rl0 mo10325b() {
        return new rl0(this.f16845b, this.f16852i.mo5051a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final um0 mo10326c() {
        return this.f16854k.mo5051a();
    }
}
