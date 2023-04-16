package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Cipher;

public final class dn3 implements kn3<Cipher> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6520a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
