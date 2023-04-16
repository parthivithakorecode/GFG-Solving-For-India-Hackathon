package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class xe3 extends jd3<si3, pi3> {

    /* renamed from: b */
    final /* synthetic */ ye3 f17181b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    xe3(ye3 ye3, Class cls) {
        super(cls);
        this.f17181b = ye3;
    }

    /* renamed from: a */
    public final /* synthetic */ kr3 mo5268a(uo3 uo3) {
        return si3.m16864I(uo3, mp3.m13445a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo5269c(kr3 kr3) {
        oi3 G = pi3.m15079G();
        G.mo9787r(uo3.m17968I(un3.m17961a(((si3) kr3).mo10799F())));
        G.mo9788s(0);
        return (pi3) G.mo11894o();
    }

    /* renamed from: d */
    public final Map<String, id3<si3>> mo5270d() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", ye3.m19987l(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", ye3.m19987l(16, 3));
        hashMap.put("AES256_GCM_SIV", ye3.m19987l(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", ye3.m19987l(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo5271e(kr3 kr3) {
        wn3.m19069a(((si3) kr3).mo10799F());
    }
}
