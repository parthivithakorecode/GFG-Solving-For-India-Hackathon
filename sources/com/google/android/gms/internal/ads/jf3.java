package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class jf3 extends jd3<tl3, ql3> {

    /* renamed from: b */
    final /* synthetic */ kf3 f9128b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    jf3(kf3 kf3, Class cls) {
        super(cls);
        this.f9128b = kf3;
    }

    /* renamed from: a */
    public final /* synthetic */ kr3 mo5268a(uo3 uo3) {
        return tl3.m17343I(uo3, mp3.m13445a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo5269c(kr3 kr3) {
        pl3 G = ql3.m15698G();
        G.mo10087r((tl3) kr3);
        G.mo10088s(0);
        return (ql3) G.mo11894o();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo5271e(kr3 kr3) {
        tl3 tl3 = (tl3) kr3;
        if (tl3.mo11017J().isEmpty() || !tl3.mo11018K()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
