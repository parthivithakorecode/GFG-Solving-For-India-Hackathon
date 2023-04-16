package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class ag3 extends xd3<tj3, wj3> {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final byte[] f4101d = new byte[0];

    ag3() {
        super(tj3.class, wj3.class, new yf3(ad3.class));
    }

    /* renamed from: l */
    static /* bridge */ /* synthetic */ id3 m6067l(int i, int i2, int i3, gd3 gd3, byte[] bArr, int i4) {
        mj3 F = nj3.m13952F();
        yj3 F2 = zj3.m20696F();
        int i5 = 4;
        F2.mo12043s(4);
        F2.mo12044t(5);
        F2.mo12042r(uo3.m17968I(bArr));
        zj3 zj3 = (zj3) F2.mo11894o();
        sk3 F3 = tk3.m17323F();
        F3.mo10806r(gd3.mo7590a());
        F3.mo10807s(uo3.m17968I(gd3.mo7591b()));
        int c = gd3.mo7592c() - 1;
        if (c == 0) {
            i5 = 3;
        } else if (c != 1) {
            i5 = c != 2 ? 6 : 5;
        }
        F3.mo10808t(i5);
        ij3 F4 = kj3.m12226F();
        F4.mo8151r((tk3) F3.mo11894o());
        pj3 G = qj3.m15654G();
        G.mo10071s(zj3);
        G.mo10070r((kj3) F4.mo11894o());
        G.mo10072t(i3);
        F.mo9271r((qj3) G.mo11894o());
        return new id3((nj3) F.mo11894o(), i4);
    }

    /* renamed from: a */
    public final jd3<nj3, tj3> mo5279a() {
        return new zf3(this, nj3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ kr3 mo5280b(uo3 uo3) {
        return tj3.m17290I(uo3, mp3.m13445a());
    }

    /* renamed from: f */
    public final String mo5281f() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo5282h(kr3 kr3) {
        tj3 tj3 = (tj3) kr3;
        if (!tj3.mo10999K().mo11271k()) {
            wn3.m19070b(tj3.mo10997F(), 0);
            kg3.m12207a(tj3.mo10998J().mo11663G());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    /* renamed from: j */
    public final int mo5283j() {
        return 4;
    }
}
