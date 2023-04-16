package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class pe3 extends ld3<qh3> {
    pe3() {
        super(qh3.class, new ne3(mn3.class));
    }

    /* renamed from: l */
    public static final void m15027l(qh3 qh3) {
        wn3.m19070b(qh3.mo10285F(), 0);
        wn3.m19069a(qh3.mo10287L().mo6627p());
        m15028m(qh3.mo10286K());
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m15028m(wh3 wh3) {
        if (wh3.mo11655F() < 12 || wh3.mo11655F() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* renamed from: a */
    public final jd3<th3, qh3> mo5279a() {
        return new oe3(this, th3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ kr3 mo5280b(uo3 uo3) {
        return qh3.m15624J(uo3, mp3.m13445a());
    }

    /* renamed from: f */
    public final String mo5281f() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo5282h(kr3 kr3) {
        m15027l((qh3) kr3);
    }

    /* renamed from: j */
    public final int mo5283j() {
        return 3;
    }
}
