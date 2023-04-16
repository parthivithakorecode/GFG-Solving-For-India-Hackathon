package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class nf3 extends ld3<bm3> {
    nf3() {
        super(bm3.class, new lf3(wc3.class));
    }

    /* renamed from: a */
    public final jd3<em3, bm3> mo5279a() {
        return new mf3(this, em3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ kr3 mo5280b(uo3 uo3) {
        return bm3.m6967I(uo3, mp3.m13445a());
    }

    /* renamed from: f */
    public final String mo5281f() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo5282h(kr3 kr3) {
        bm3 bm3 = (bm3) kr3;
        wn3.m19070b(bm3.mo5885F(), 0);
        if (bm3.mo5886J().mo6627p() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    /* renamed from: j */
    public final int mo5283j() {
        return 3;
    }
}
