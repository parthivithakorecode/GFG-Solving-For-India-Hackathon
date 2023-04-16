package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

public final class un3 {

    /* renamed from: a */
    private static final ThreadLocal<SecureRandom> f15662a = new tn3();

    /* renamed from: a */
    public static byte[] m17961a(int i) {
        byte[] bArr = new byte[i];
        f15662a.get().nextBytes(bArr);
        return bArr;
    }
}
