package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class sg3 extends ld3<gk3> {
    public sg3() {
        super(gk3.class, new qg3(pd3.class));
    }

    /* renamed from: l */
    public static final void m16846l(gk3 gk3) {
        wn3.m19070b(gk3.mo7656F(), 0);
        if (gk3.mo7658L().mo6627p() >= 16) {
            m16848n(gk3.mo7657K());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* renamed from: m */
    static /* bridge */ /* synthetic */ id3 m16847m(int i, int i2, int i3, int i4) {
        ik3 G = jk3.m11700G();
        mk3 G2 = nk3.m13963G();
        G2.mo9273s(i3);
        G2.mo9272r(i2);
        G.mo8153s((nk3) G2.mo11894o());
        G.mo8152r(i);
        return new id3((jk3) G.mo11894o(), i4);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m16848n(nk3 nk3) {
        if (nk3.mo9544F() >= 10) {
            int K = nk3.mo9545K() - 2;
            if (K != 1) {
                if (K != 2) {
                    if (K != 3) {
                        if (K != 4) {
                            if (K != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            } else if (nk3.mo9544F() > 28) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        } else if (nk3.mo9544F() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (nk3.mo9544F() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (nk3.mo9544F() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (nk3.mo9544F() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    /* renamed from: a */
    public final jd3<jk3, gk3> mo5279a() {
        return new rg3(this, jk3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ kr3 mo5280b(uo3 uo3) {
        return gk3.m9820J(uo3, mp3.m13445a());
    }

    /* renamed from: f */
    public final String mo5281f() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo5282h(kr3 kr3) {
        m16846l((gk3) kr3);
    }

    /* renamed from: i */
    public final int mo8934i() {
        return 2;
    }

    /* renamed from: j */
    public final int mo5283j() {
        return 3;
    }
}
