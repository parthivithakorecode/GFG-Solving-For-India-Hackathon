package com.google.android.gms.internal.ads;

import java.util.Map;

public final /* synthetic */ class zr0 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ tq0 f18333f;

    /* renamed from: g */
    public final /* synthetic */ Map f18334g;

    public /* synthetic */ zr0(tq0 tq0, Map map) {
        this.f18333f = tq0;
        this.f18334g = map;
    }

    public final void run() {
        tq0 tq0 = this.f18333f;
        Map map = this.f18334g;
        int i = as0.f4314B;
        tq0.mo6424t("onGcacheInfoEvent", map);
    }
}
