package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class re3 extends jd3<ci3, zh3> {

    /* renamed from: b */
    final /* synthetic */ se3 f13618b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    re3(se3 se3, Class cls) {
        super(cls);
        this.f13618b = se3;
    }

    /* renamed from: a */
    public final /* synthetic */ kr3 mo5268a(uo3 uo3) {
        return ci3.m7441I(uo3, mp3.m13445a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo5269c(kr3 kr3) {
        ci3 ci3 = (ci3) kr3;
        yh3 G = zh3.m20652G();
        G.mo12024r(uo3.m17968I(un3.m17961a(ci3.mo6206F())));
        G.mo12025s(ci3.mo6207J());
        G.mo12026t(0);
        return (zh3) G.mo11894o();
    }

    /* renamed from: d */
    public final Map<String, id3<ci3>> mo5270d() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", se3.m16818k(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", se3.m16818k(16, 16, 3));
        hashMap.put("AES256_EAX", se3.m16818k(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", se3.m16818k(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo5271e(kr3 kr3) {
        ci3 ci3 = (ci3) kr3;
        wn3.m19069a(ci3.mo6206F());
        if (ci3.mo6207J().mo7346F() != 12 && ci3.mo6207J().mo7346F() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
