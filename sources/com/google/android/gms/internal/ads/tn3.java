package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

final class tn3 extends ThreadLocal<SecureRandom> {
    tn3() {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
