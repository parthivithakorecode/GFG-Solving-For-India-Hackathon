package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.ads.t9 */
final class C2213t9 implements Runnable {
    /* synthetic */ C2213t9(C2176s9 s9Var) {
    }

    public final void run() {
        try {
            C2250u9.f15465b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
        } catch (Throwable th) {
            C2250u9.f15468e.countDown();
            throw th;
        }
        C2250u9.f15468e.countDown();
    }
}
