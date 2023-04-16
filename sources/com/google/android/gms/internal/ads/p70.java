package com.google.android.gms.internal.ads;

import java.util.Map;

final class p70 implements t70<eu0> {
    p70() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5150a(Object obj, Map map) {
        eu0 eu0 = (eu0) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            eu0.mo10847a1();
        } else if ("resume".equals(str)) {
            eu0.mo10848b0();
        }
    }
}
