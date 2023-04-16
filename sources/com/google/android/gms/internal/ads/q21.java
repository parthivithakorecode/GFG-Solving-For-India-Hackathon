package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class q21 implements kv3<p21> {

    /* renamed from: a */
    private final yv3<Context> f13026a;

    /* renamed from: b */
    private final yv3<Executor> f13027b;

    /* renamed from: c */
    private final yv3<Executor> f13028c;

    /* renamed from: d */
    private final yv3<ScheduledExecutorService> f13029d;

    /* renamed from: e */
    private final yv3<ds2> f13030e;

    /* renamed from: f */
    private final yv3<rr2> f13031f;

    /* renamed from: g */
    private final yv3<zx2> f13032g;

    /* renamed from: h */
    private final yv3<ts2> f13033h;

    /* renamed from: i */
    private final yv3<View> f13034i;

    /* renamed from: j */
    private final yv3<C1734gb> f13035j;

    /* renamed from: k */
    private final yv3<m20> f13036k;

    /* renamed from: l */
    private final yv3<o20> f13037l;

    public q21(yv3<Context> yv3, yv3<Executor> yv32, yv3<Executor> yv33, yv3<ScheduledExecutorService> yv34, yv3<ds2> yv35, yv3<rr2> yv36, yv3<zx2> yv37, yv3<ts2> yv38, yv3<View> yv39, yv3<C1734gb> yv310, yv3<m20> yv311, yv3<o20> yv312) {
        this.f13026a = yv3;
        this.f13027b = yv32;
        this.f13028c = yv33;
        this.f13029d = yv34;
        this.f13030e = yv35;
        this.f13031f = yv36;
        this.f13032g = yv37;
        this.f13033h = yv38;
        this.f13034i = yv39;
        this.f13035j = yv310;
        this.f13036k = yv311;
        this.f13037l = yv312;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5051a() {
        Context b = ((nt2) this.f13026a).mo9596b();
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        return new p21(b, dc3, this.f13028c.mo5051a(), this.f13029d.mo5051a(), ((p71) this.f13030e).mo9989b(), ((m71) this.f13031f).mo9148b(), this.f13032g.mo5051a(), this.f13033h.mo5051a(), this.f13034i.mo5051a(), this.f13035j.mo5051a(), this.f13036k.mo5051a(), new o20(), (byte[]) null);
    }
}
