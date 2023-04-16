package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

public final class mu1 implements kv3<Set<hi1<ow2>>> {

    /* renamed from: a */
    private final yv3<Executor> f11048a;

    /* renamed from: b */
    private final yv3<fv1> f11049b;

    public mu1(yv3<Executor> yv3, yv3<fv1> yv32) {
        this.f11048a = yv3;
        this.f11049b = yv32;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        Set singleton = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10631v3)).booleanValue() ? Collections.singleton(new hi1(((gv1) this.f11049b).mo5051a(), dc3)) : Collections.emptySet();
        sv3.m16997b(singleton);
        return singleton;
    }
}
