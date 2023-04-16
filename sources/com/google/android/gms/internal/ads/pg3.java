package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class pg3 extends ld3<ah3> {
    pg3() {
        super(ah3.class, new ng3(pd3.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static void m15061m(gh3 gh3) {
        if (gh3.mo7640F() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (gh3.mo7640F() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m15062n(int i) {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    /* renamed from: a */
    public final jd3<dh3, ah3> mo5279a() {
        return new og3(this, dh3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ kr3 mo5280b(uo3 uo3) {
        return ah3.m6079I(uo3, mp3.m13445a());
    }

    /* renamed from: f */
    public final String mo5281f() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo5282h(kr3 kr3) {
        ah3 ah3 = (ah3) kr3;
        wn3.m19070b(ah3.mo5293F(), 0);
        m15062n(ah3.mo5295K().mo6627p());
        m15061m(ah3.mo5294J());
    }

    /* renamed from: j */
    public final int mo5283j() {
        return 3;
    }
}
