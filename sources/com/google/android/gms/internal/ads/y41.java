package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

public final class y41 implements kv3<w41> {

    /* renamed from: a */
    private final yv3<u61> f17592a;

    /* renamed from: b */
    private final yv3<Context> f17593b;

    /* renamed from: c */
    private final yv3<sr2> f17594c;

    /* renamed from: d */
    private final yv3<View> f17595d;

    /* renamed from: e */
    private final yv3<eu0> f17596e;

    /* renamed from: f */
    private final yv3<t61> f17597f;

    /* renamed from: g */
    private final yv3<cn1> f17598g;

    /* renamed from: h */
    private final yv3<ri1> f17599h;

    /* renamed from: i */
    private final yv3<mb2> f17600i;

    /* renamed from: j */
    private final yv3<Executor> f17601j;

    public y41(yv3<u61> yv3, yv3<Context> yv32, yv3<sr2> yv33, yv3<View> yv34, yv3<eu0> yv35, yv3<t61> yv36, yv3<cn1> yv37, yv3<ri1> yv38, yv3<mb2> yv39, yv3<Executor> yv310) {
        this.f17592a = yv3;
        this.f17593b = yv32;
        this.f17594c = yv33;
        this.f17595d = yv34;
        this.f17596e = yv35;
        this.f17597f = yv36;
        this.f17598g = yv37;
        this.f17599h = yv38;
        this.f17600i = yv39;
        this.f17601j = yv310;
    }

    /* renamed from: c */
    public static w41 m19856c(u61 u61, Context context, sr2 sr2, View view, eu0 eu0, t61 t61, cn1 cn1, ri1 ri1, ev3<mb2> ev3, Executor executor) {
        return new w41(u61, context, sr2, view, eu0, t61, cn1, ri1, ev3, executor);
    }

    /* renamed from: b */
    public final w41 mo5051a() {
        return new w41(((s81) this.f17592a).mo5051a(), this.f17593b.mo5051a(), ((e51) this.f17594c).mo6828b(), ((d51) this.f17595d).mo6384b(), ((p51) this.f17596e).mo9963b(), ((f51) this.f17597f).mo7233b(), ((bl1) this.f17598g).mo5878b(), this.f17599h.mo5051a(), jv3.m11855b(this.f17600i), this.f17601j.mo5051a());
    }
}
