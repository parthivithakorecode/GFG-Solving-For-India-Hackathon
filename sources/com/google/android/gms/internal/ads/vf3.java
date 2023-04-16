package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class vf3 {

    /* renamed from: a */
    public static final String f16218a = "type.googleapis.com/google.crypto.tink.AesSivKey";
    @Deprecated

    /* renamed from: b */
    public static final yl3 f16219b = yl3.m20076G();
    @Deprecated

    /* renamed from: c */
    public static final yl3 f16220c = yl3.m20076G();

    static {
        new uf3();
        try {
            ee3.m8530n(new xf3());
            if (!rf3.m16177b()) {
                ee3.m8529m(new uf3(), true);
            }
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
