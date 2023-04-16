package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

final class im3 extends ThreadLocal<Cipher> {
    im3() {
    }

    /* renamed from: a */
    protected static final Cipher m11071a() {
        try {
            return cn3.f5466e.mo6236a("AES/CTR/NOPADDING");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m11071a();
    }
}
