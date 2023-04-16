package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

final class yf3 extends kd3<ad3, tj3> {
    yf3(Class cls) {
        super(cls);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo5851b(Object obj) {
        tj3 tj3 = (tj3) obj;
        qj3 G = tj3.mo10998J().mo11663G();
        zj3 J = G.mo10301J();
        int c = kg3.m12209c(J.mo12232K());
        byte[] l = tj3.mo10999K().mo11272l();
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, l), an3.m6137e(c));
        return new vm3((ECPrivateKey) cn3.f5472k.mo6236a("EC").generatePrivate(eCPrivateKeySpec), J.mo12231I().mo11272l(), kg3.m12208b(J.mo12233L()), kg3.m12210d(G.mo10302M()), new lg3(G.mo10300F().mo8684I()));
    }
}
