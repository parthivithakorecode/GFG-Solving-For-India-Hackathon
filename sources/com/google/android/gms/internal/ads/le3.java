package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class le3 extends jd3<nh3, kh3> {

    /* renamed from: b */
    final /* synthetic */ me3 f10020b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    le3(me3 me3, Class cls) {
        super(cls);
        this.f10020b = me3;
    }

    /* renamed from: a */
    public final /* synthetic */ kr3 mo5268a(uo3 uo3) {
        return nh3.m13926H(uo3, mp3.m13445a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo5269c(kr3 kr3) {
        nh3 nh3 = (nh3) kr3;
        new pe3();
        qh3 g = oe3.m14444g(nh3.mo9529I());
        Object c = new sg3().mo5279a().mo5269c(nh3.mo9530J());
        jh3 G = kh3.m12212G();
        G.mo8462r(g);
        G.mo8463s((gk3) c);
        G.mo8464t(0);
        return (kh3) G.mo11894o();
    }

    /* renamed from: d */
    public final Map<String, id3<nh3>> mo5270d() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", me3.m13230k(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", me3.m13230k(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", me3.m13230k(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", me3.m13230k(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo5271e(kr3 kr3) {
        nh3 nh3 = (nh3) kr3;
        ((oe3) new pe3().mo5279a()).mo5271e(nh3.mo9529I());
        new sg3().mo5279a().mo5271e(nh3.mo9530J());
        wn3.m19069a(nh3.mo9529I().mo10988F());
    }
}
