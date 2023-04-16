package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class rf3 {

    /* renamed from: a */
    private static final Logger f13623a = Logger.getLogger(rf3.class.getName());

    /* renamed from: b */
    private static final AtomicBoolean f13624b = new AtomicBoolean(false);

    private rf3() {
    }

    /* renamed from: a */
    static Boolean m16176a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            f13623a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    /* renamed from: b */
    public static boolean m16177b() {
        return f13624b.get();
    }
}
