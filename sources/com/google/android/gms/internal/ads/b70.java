package com.google.android.gms.internal.ads;

import java.util.Map;
import p069j1.C3158f1;

public final /* synthetic */ class b70 implements t70 {

    /* renamed from: a */
    public static final /* synthetic */ b70 f4779a = new b70();

    private /* synthetic */ b70() {
    }

    /* renamed from: a */
    public final void mo5150a(Object obj, Map map) {
        gv0 gv0 = (gv0) obj;
        t70<eu0> t70 = s70.f14292a;
        String str = (String) map.get("u");
        if (str == null) {
            io0.m11131g("URL missing from httpTrack GMSG.");
        } else {
            new C3158f1(gv0.getContext(), ((ov0) gv0).mo7129l().f12729f, str).mo8781b();
        }
    }
}
