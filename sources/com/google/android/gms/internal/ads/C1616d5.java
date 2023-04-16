package com.google.android.gms.internal.ads;

import java.security.cert.X509Certificate;

/* renamed from: com.google.android.gms.internal.ads.d5 */
final class C1616d5 extends C1653e5 {

    /* renamed from: g */
    private final byte[] f5644g;

    public C1616d5(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f5644g = bArr;
    }

    public final byte[] getEncoded() {
        return this.f5644g;
    }
}
