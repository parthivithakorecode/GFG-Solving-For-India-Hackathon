package com.google.android.gms.internal.ads;

import java.security.interfaces.ECPrivateKey;

public final class vm3 implements ad3 {

    /* renamed from: a */
    private final ECPrivateKey f16360a;

    /* renamed from: b */
    private final xm3 f16361b;

    /* renamed from: c */
    private final String f16362c;

    /* renamed from: d */
    private final byte[] f16363d;

    /* renamed from: e */
    private final um3 f16364e;

    public vm3(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i, um3 um3) {
        this.f16360a = eCPrivateKey;
        this.f16361b = new xm3(eCPrivateKey);
        this.f16363d = bArr;
        this.f16362c = str;
        this.f16364e = um3;
    }
}
