package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class ue3 extends jd3<mi3, ji3> {

    /* renamed from: b */
    final /* synthetic */ ve3 f15533b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ue3(ve3 ve3, Class cls) {
        super(cls);
        this.f15533b = ve3;
    }

    /* renamed from: a */
    public final /* synthetic */ kr3 mo5268a(uo3 uo3) {
        return mi3.m13317I(uo3, mp3.m13445a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo5269c(kr3 kr3) {
        hi3 G = ji3.m11661G();
        G.mo7947r(uo3.m17968I(un3.m17961a(((mi3) kr3).mo9257F())));
        G.mo7948s(0);
        return (ji3) G.mo11894o();
    }

    /* renamed from: d */
    public final Map<String, id3<mi3>> mo5270d() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", ve3.m18508k(16, 1));
        hashMap.put("AES128_GCM_RAW", ve3.m18508k(16, 3));
        hashMap.put("AES256_GCM", ve3.m18508k(32, 1));
        hashMap.put("AES256_GCM_RAW", ve3.m18508k(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo5271e(kr3 kr3) {
        wn3.m19069a(((mi3) kr3).mo9257F());
    }
}
