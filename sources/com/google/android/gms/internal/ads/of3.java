package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

final class of3 extends ThreadLocal<Cipher> {
    of3() {
    }

    /* renamed from: a */
    protected static final Cipher m14453a() {
        try {
            return cn3.f5466e.mo6236a("AES/GCM-SIV/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m14453a();
    }
}
