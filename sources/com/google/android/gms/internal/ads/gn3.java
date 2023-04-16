package com.google.android.gms.internal.ads;

import java.security.KeyPairGenerator;
import java.security.Provider;

public final class gn3 implements kn3<KeyPairGenerator> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6520a(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
