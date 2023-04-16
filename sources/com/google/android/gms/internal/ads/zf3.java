package com.google.android.gms.internal.ads;

import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class zf3 extends jd3<nj3, tj3> {

    /* renamed from: b */
    final /* synthetic */ ag3 f18188b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zf3(ag3 ag3, Class cls) {
        super(cls);
        this.f18188b = ag3;
    }

    /* renamed from: a */
    public final /* synthetic */ kr3 mo5268a(uo3 uo3) {
        return nj3.m13954H(uo3, mp3.m13445a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo5269c(kr3 kr3) {
        nj3 nj3 = (nj3) kr3;
        KeyPair b = an3.m6134b(an3.m6137e(kg3.m12209c(nj3.mo9542I().mo10301J().mo12232K())));
        ECPoint w = ((ECPublicKey) b.getPublic()).getW();
        vj3 H = wj3.m19005H();
        H.mo11485s(0);
        H.mo11484r(nj3.mo9542I());
        H.mo11486t(uo3.m17968I(w.getAffineX().toByteArray()));
        H.mo11487u(uo3.m17968I(w.getAffineY().toByteArray()));
        sj3 G = tj3.m17288G();
        G.mo10804t(0);
        G.mo10803s((wj3) H.mo11894o());
        G.mo10802r(uo3.m17968I(((ECPrivateKey) b.getPrivate()).getS().toByteArray()));
        return (tj3) G.mo11894o();
    }

    /* renamed from: d */
    public final Map<String, id3<nj3>> mo5270d() {
        HashMap hashMap = new HashMap();
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", ag3.m6067l(4, 5, 3, hd3.m10485a("AES128_GCM"), ag3.f4101d, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", ag3.m6067l(4, 5, 3, hd3.m10485a("AES128_GCM"), ag3.f4101d, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", ag3.m6067l(4, 5, 4, hd3.m10485a("AES128_GCM"), ag3.f4101d, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", ag3.m6067l(4, 5, 4, hd3.m10485a("AES128_GCM"), ag3.f4101d, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", ag3.m6067l(4, 5, 4, hd3.m10485a("AES128_GCM"), ag3.f4101d, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", ag3.m6067l(4, 5, 3, hd3.m10485a("AES128_CTR_HMAC_SHA256"), ag3.f4101d, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", ag3.m6067l(4, 5, 3, hd3.m10485a("AES128_CTR_HMAC_SHA256"), ag3.f4101d, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", ag3.m6067l(4, 5, 4, hd3.m10485a("AES128_CTR_HMAC_SHA256"), ag3.f4101d, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", ag3.m6067l(4, 5, 4, hd3.m10485a("AES128_CTR_HMAC_SHA256"), ag3.f4101d, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo5271e(kr3 kr3) {
        kg3.m12207a(((nj3) kr3).mo9542I());
    }
}
