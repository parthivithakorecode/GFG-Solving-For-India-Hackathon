package com.google.android.gms.internal.ads;

import java.util.Map;

public final /* synthetic */ class tt0 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ tq0 f15044f;

    /* renamed from: g */
    public final /* synthetic */ Map f15045g;

    public /* synthetic */ tt0(tq0 tq0, Map map) {
        this.f15044f = tq0;
        this.f15045g = map;
    }

    public final void run() {
        tq0 tq0 = this.f15044f;
        Map map = this.f15045g;
        int i = ut0.f15746A;
        tq0.mo6424t("onGcacheInfoEvent", map);
    }
}
