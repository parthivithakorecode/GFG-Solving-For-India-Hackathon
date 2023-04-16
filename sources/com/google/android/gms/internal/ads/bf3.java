package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class bf3 extends ld3<bj3> {
    bf3() {
        super(bj3.class, new ze3(wc3.class));
    }

    /* renamed from: a */
    public final jd3<ej3, bj3> mo5279a() {
        return new af3(this, ej3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ kr3 mo5280b(uo3 uo3) {
        return bj3.m6933I(uo3, mp3.m13445a());
    }

    /* renamed from: f */
    public final String mo5281f() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo5282h(kr3 kr3) {
        bj3 bj3 = (bj3) kr3;
        wn3.m19070b(bj3.mo5868F(), 0);
        if (bj3.mo5869J().mo6627p() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    /* renamed from: j */
    public final int mo5283j() {
        return 3;
    }
}
