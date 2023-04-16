package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

final class fm3 extends ThreadLocal<Cipher> {
    fm3() {
    }

    /* renamed from: a */
    protected static final Cipher m9237a() {
        try {
            return cn3.f5466e.mo6236a("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m9237a();
    }
}
