package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class q02 implements kv3<p02> {

    /* renamed from: a */
    private final yv3<bw0> f12976a;

    /* renamed from: b */
    private final yv3<Context> f12977b;

    /* renamed from: c */
    private final yv3<po0> f12978c;

    /* renamed from: d */
    private final yv3<ks2> f12979d;

    /* renamed from: e */
    private final yv3<Executor> f12980e;

    /* renamed from: f */
    private final yv3<String> f12981f;

    /* renamed from: g */
    private final yv3<rd1> f12982g;

    /* renamed from: h */
    private final yv3<vd1> f12983h;

    public q02(yv3<bw0> yv3, yv3<Context> yv32, yv3<po0> yv33, yv3<ks2> yv34, yv3<Executor> yv35, yv3<String> yv36, yv3<rd1> yv37, yv3<vd1> yv38) {
        this.f12976a = yv3;
        this.f12977b = yv32;
        this.f12978c = yv33;
        this.f12979d = yv34;
        this.f12980e = yv35;
        this.f12981f = yv36;
        this.f12982g = yv37;
        this.f12983h = yv38;
    }

    /* renamed from: b */
    public final p02 mo5051a() {
        Context b = ((nt2) this.f12977b).mo9596b();
        po0 b2 = ((rw0) this.f12978c).mo10680b();
        ks2 b3 = ((ma1) this.f12979d).mo9153b();
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        return new p02(this.f12976a.mo5051a(), b, b2, b3, dc3, this.f12981f.mo5051a(), ((sd1) this.f12982g).mo5051a(), ((wd1) this.f12983h).mo5051a());
    }
}
