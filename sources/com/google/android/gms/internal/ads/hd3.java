package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class hd3 {
    /* renamed from: a */
    public static gd3 m10485a(String str) {
        if (ee3.m8526j().containsKey(str)) {
            return ee3.m8526j().get(str);
        }
        throw new GeneralSecurityException(str.length() != 0 ? "cannot find key template: ".concat(str) : new String("cannot find key template: "));
    }
}
