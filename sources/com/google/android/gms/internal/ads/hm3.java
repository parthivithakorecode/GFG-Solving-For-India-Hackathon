package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

final class hm3 extends ThreadLocal<Cipher> {
    hm3() {
    }

    /* renamed from: a */
    protected static final Cipher m10670a() {
        try {
            return cn3.f5466e.mo6236a("AES/ECB/NOPADDING");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m10670a();
    }
}
