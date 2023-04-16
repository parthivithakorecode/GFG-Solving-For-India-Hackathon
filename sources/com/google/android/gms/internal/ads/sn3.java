package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;

public final class sn3 implements pd3 {

    /* renamed from: a */
    private final xg3 f14512a;

    /* renamed from: b */
    private final int f14513b;

    public sn3(xg3 xg3, int i) {
        this.f14512a = xg3;
        this.f14513b = i;
        if (i >= 10) {
            xg3.mo10112a(new byte[0], i);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    /* renamed from: a */
    public final byte[] mo10038a(byte[] bArr) {
        return this.f14512a.mo10112a(bArr, this.f14513b);
    }
}
