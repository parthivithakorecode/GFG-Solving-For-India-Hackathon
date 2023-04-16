package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class rg3 extends jd3<jk3, gk3> {

    /* renamed from: b */
    final /* synthetic */ sg3 f13640b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    rg3(sg3 sg3, Class cls) {
        super(cls);
        this.f13640b = sg3;
    }

    /* renamed from: a */
    public final /* synthetic */ kr3 mo5268a(uo3 uo3) {
        return jk3.m11703J(uo3, mp3.m13445a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo5269c(kr3 kr3) {
        jk3 jk3 = (jk3) kr3;
        fk3 G = gk3.m9817G();
        G.mo7364t(0);
        G.mo7363s(jk3.mo8481K());
        G.mo7362r(uo3.m17968I(un3.m17961a(jk3.mo8480F())));
        return (gk3) G.mo11894o();
    }

    /* renamed from: d */
    public final Map<String, id3<jk3>> mo5270d() {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", sg3.m16847m(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", sg3.m16847m(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", sg3.m16847m(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", sg3.m16847m(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", sg3.m16847m(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", sg3.m16847m(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", sg3.m16847m(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", sg3.m16847m(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", sg3.m16847m(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", sg3.m16847m(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo5271e(kr3 kr3) {
        jk3 jk3 = (jk3) kr3;
        if (jk3.mo8480F() >= 16) {
            sg3.m16848n(jk3.mo8481K());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
