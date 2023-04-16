package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class tf3 extends jd3<yi3, vi3> {

    /* renamed from: b */
    final /* synthetic */ uf3 f14839b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    tf3(uf3 uf3, Class cls) {
        super(cls);
        this.f14839b = uf3;
    }

    /* renamed from: a */
    public final /* synthetic */ kr3 mo5268a(uo3 uo3) {
        return yi3.m20044I(uo3, mp3.m13445a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo5269c(kr3 kr3) {
        ui3 G = vi3.m18566G();
        G.mo11229r(uo3.m17968I(un3.m17961a(((yi3) kr3).mo12036F())));
        G.mo11230s(0);
        return (vi3) G.mo11894o();
    }

    /* renamed from: d */
    public final Map<String, id3<yi3>> mo5270d() {
        HashMap hashMap = new HashMap();
        xi3 G = yi3.m20042G();
        G.mo11855r(64);
        hashMap.put("AES256_SIV", new id3((yi3) G.mo11894o(), 1));
        xi3 G2 = yi3.m20042G();
        G2.mo11855r(64);
        hashMap.put("AES256_SIV_RAW", new id3((yi3) G2.mo11894o(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo5271e(kr3 kr3) {
        yi3 yi3 = (yi3) kr3;
        if (yi3.mo12036F() != 64) {
            int F = yi3.mo12036F();
            StringBuilder sb = new StringBuilder(61);
            sb.append("invalid key size: ");
            sb.append(F);
            sb.append(". Valid keys must have 64 bytes.");
            throw new InvalidAlgorithmParameterException(sb.toString());
        }
    }
}
