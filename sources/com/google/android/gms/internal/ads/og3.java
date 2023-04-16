package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class og3 extends jd3<dh3, ah3> {
    og3(pg3 pg3, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* synthetic */ kr3 mo5268a(uo3 uo3) {
        return dh3.m7874I(uo3, mp3.m13445a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo5269c(kr3 kr3) {
        dh3 dh3 = (dh3) kr3;
        zg3 G = ah3.m6077G();
        G.mo12220t(0);
        G.mo12218r(uo3.m17968I(un3.m17961a(dh3.mo6477F())));
        G.mo12219s(dh3.mo6478J());
        return (ah3) G.mo11894o();
    }

    /* renamed from: d */
    public final Map<String, id3<dh3>> mo5270d() {
        HashMap hashMap = new HashMap();
        ch3 G = dh3.m7872G();
        G.mo6200r(32);
        fh3 G2 = gh3.m9786G();
        G2.mo7343r(16);
        G.mo6201s((gh3) G2.mo11894o());
        hashMap.put("AES_CMAC", new id3((dh3) G.mo11894o(), 1));
        ch3 G3 = dh3.m7872G();
        G3.mo6200r(32);
        fh3 G4 = gh3.m9786G();
        G4.mo7343r(16);
        G3.mo6201s((gh3) G4.mo11894o());
        hashMap.put("AES256_CMAC", new id3((dh3) G3.mo11894o(), 1));
        ch3 G5 = dh3.m7872G();
        G5.mo6200r(32);
        fh3 G6 = gh3.m9786G();
        G6.mo7343r(16);
        G5.mo6201s((gh3) G6.mo11894o());
        hashMap.put("AES256_CMAC_RAW", new id3((dh3) G5.mo11894o(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo5271e(kr3 kr3) {
        dh3 dh3 = (dh3) kr3;
        pg3.m15061m(dh3.mo6478J());
        pg3.m15062n(dh3.mo6477F());
    }
}
