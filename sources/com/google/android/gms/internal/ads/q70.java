package com.google.android.gms.internal.ads;

import java.util.Map;

final class q70 implements t70<eu0> {
    q70() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5150a(Object obj, Map map) {
        eu0 eu0 = (eu0) obj;
        if (map.keySet().contains("start")) {
            eu0.mo7077D0().mo9051j();
        } else if (map.keySet().contains("stop")) {
            eu0.mo7077D0().mo9052k();
        } else if (map.keySet().contains("cancel")) {
            eu0.mo7077D0().mo9050i();
        }
    }
}
