package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.Provider;

public final class fn3 implements kn3<KeyFactory> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6520a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
