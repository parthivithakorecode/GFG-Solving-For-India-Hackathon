package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Mac;

public final class hn3 implements kn3<Mac> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6520a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
