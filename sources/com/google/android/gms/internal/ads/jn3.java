package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Signature;

public final class jn3 implements kn3<Signature> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6520a(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
