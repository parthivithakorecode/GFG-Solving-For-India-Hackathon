package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

public final class se2 implements ij2<hj2<Bundle>> {

    /* renamed from: a */
    private final Executor f14418a;

    /* renamed from: b */
    private final tn0 f14419b;

    se2(Executor executor, tn0 tn0) {
        this.f14418a = executor;
        this.f14419b = tn0;
    }

    /* renamed from: a */
    public final cc3<hj2<Bundle>> mo5813a() {
        return ((Boolean) C2199sw.m17001c().mo8579b(m10.f10387T1)).booleanValue() ? rb3.m16131i(null) : rb3.m16135m(this.f14419b.mo11026j(), re2.f13617a, this.f14418a);
    }
}
