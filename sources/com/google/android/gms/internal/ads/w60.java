package com.google.android.gms.internal.ads;

import java.util.Map;

public final /* synthetic */ class w60 implements t70 {

    /* renamed from: a */
    public final /* synthetic */ pi1 f16720a;

    public /* synthetic */ w60(pi1 pi1) {
        this.f16720a = pi1;
    }

    /* renamed from: a */
    public final void mo5150a(Object obj, Map map) {
        eu0 eu0 = (eu0) obj;
        s70.m16643d(map, this.f16720a);
        String str = (String) map.get("u");
        if (str == null) {
            io0.m11131g("URL missing from click GMSG.");
        } else {
            rb3.m16140r(s70.m16641b(eu0, str), new j70(eu0), wo0.f16886a);
        }
    }
}
