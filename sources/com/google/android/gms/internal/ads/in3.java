package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.Provider;

public final class in3 implements kn3<MessageDigest> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6520a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
