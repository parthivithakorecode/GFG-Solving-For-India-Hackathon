package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class mf3 extends jd3<em3, bm3> {

    /* renamed from: b */
    final /* synthetic */ nf3 f10831b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    mf3(nf3 nf3, Class cls) {
        super(cls);
        this.f10831b = nf3;
    }

    /* renamed from: a */
    public final /* synthetic */ kr3 mo5268a(uo3 uo3) {
        return em3.m8641H(uo3, mp3.m13445a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo5269c(kr3 kr3) {
        em3 em3 = (em3) kr3;
        am3 G = bm3.m6965G();
        G.mo5320s(0);
        G.mo5319r(uo3.m17968I(un3.m17961a(32)));
        return (bm3) G.mo11894o();
    }

    /* renamed from: d */
    public final Map<String, id3<em3>> mo5270d() {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new id3(em3.m8640G(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new id3(em3.m8640G(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo5271e(kr3 kr3) {
        em3 em3 = (em3) kr3;
    }
}
