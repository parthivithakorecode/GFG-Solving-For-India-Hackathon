package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class af3 extends jd3<ej3, bj3> {

    /* renamed from: b */
    final /* synthetic */ bf3 f4088b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    af3(bf3 bf3, Class cls) {
        super(cls);
        this.f4088b = bf3;
    }

    /* renamed from: a */
    public final /* synthetic */ kr3 mo5268a(uo3 uo3) {
        return ej3.m8579H(uo3, mp3.m13445a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo5269c(kr3 kr3) {
        ej3 ej3 = (ej3) kr3;
        aj3 G = bj3.m6931G();
        G.mo5304s(0);
        G.mo5303r(uo3.m17968I(un3.m17961a(32)));
        return (bj3) G.mo11894o();
    }

    /* renamed from: d */
    public final Map<String, id3<ej3>> mo5270d() {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new id3(ej3.m8578G(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new id3(ej3.m8578G(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo5271e(kr3 kr3) {
        ej3 ej3 = (ej3) kr3;
    }
}
