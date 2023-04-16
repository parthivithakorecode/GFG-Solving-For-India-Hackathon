package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

final class qg3 extends kd3<pd3, gk3> {
    qg3(Class cls) {
        super(cls);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo5851b(Object obj) {
        gk3 gk3 = (gk3) obj;
        int K = gk3.mo7657K().mo9545K();
        SecretKeySpec secretKeySpec = new SecretKeySpec(gk3.mo7658L().mo11272l(), "HMAC");
        int F = gk3.mo7657K().mo9544F();
        int i = K - 2;
        if (i == 1) {
            return new sn3(new rn3("HMACSHA1", secretKeySpec), F);
        }
        if (i == 2) {
            return new sn3(new rn3("HMACSHA384", secretKeySpec), F);
        }
        if (i == 3) {
            return new sn3(new rn3("HMACSHA256", secretKeySpec), F);
        }
        if (i == 4) {
            return new sn3(new rn3("HMACSHA512", secretKeySpec), F);
        }
        if (i == 5) {
            return new sn3(new rn3("HMACSHA224", secretKeySpec), F);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
