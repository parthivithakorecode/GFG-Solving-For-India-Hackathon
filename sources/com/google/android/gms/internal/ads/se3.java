package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class se3 extends ld3<zh3> {
    se3() {
        super(zh3.class, new qe3(wc3.class));
    }

    /* renamed from: k */
    static /* bridge */ /* synthetic */ id3 m16818k(int i, int i2, int i3) {
        bi3 G = ci3.m7439G();
        G.mo5865r(i);
        ei3 G2 = fi3.m9177G();
        G2.mo6971r(16);
        G.mo5866s((fi3) G2.mo11894o());
        return new id3((ci3) G.mo11894o(), i3);
    }

    /* renamed from: a */
    public final jd3<ci3, zh3> mo5279a() {
        return new re3(this, ci3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ kr3 mo5280b(uo3 uo3) {
        return zh3.m20654I(uo3, mp3.m13445a());
    }

    /* renamed from: f */
    public final String mo5281f() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo5282h(kr3 kr3) {
        zh3 zh3 = (zh3) kr3;
        wn3.m19070b(zh3.mo12221F(), 0);
        wn3.m19069a(zh3.mo12223K().mo6627p());
        if (zh3.mo12222J().mo7346F() != 12 && zh3.mo12222J().mo7346F() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    /* renamed from: j */
    public final int mo5283j() {
        return 3;
    }
}
