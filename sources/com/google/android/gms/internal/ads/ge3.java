package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class ge3 {

    /* renamed from: a */
    public static final String f7404a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";

    /* renamed from: b */
    public static final String f7405b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
    @Deprecated

    /* renamed from: c */
    public static final yl3 f7406c;
    @Deprecated

    /* renamed from: d */
    public static final yl3 f7407d;
    @Deprecated

    /* renamed from: e */
    public static final yl3 f7408e;

    static {
        new me3();
        new ve3();
        new ye3();
        new se3();
        new gf3();
        new kf3();
        new bf3();
        new nf3();
        yl3 G = yl3.m20076G();
        f7406c = G;
        f7407d = G;
        f7408e = G;
        try {
            m9738a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m9738a() {
        ee3.m8530n(new je3());
        tg3.m17262a();
        ee3.m8529m(new me3(), true);
        ee3.m8529m(new ve3(), true);
        if (!rf3.m16177b()) {
            ee3.m8529m(new se3(), true);
            ye3.m19986k(true);
            ee3.m8529m(new bf3(), true);
            ee3.m8529m(new gf3(), true);
            ee3.m8529m(new kf3(), true);
            ee3.m8529m(new nf3(), true);
        }
    }
}
