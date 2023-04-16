package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.bp */
public abstract class C1562bp {

    /* renamed from: b */
    private static MessageDigest f4997b;

    /* renamed from: a */
    protected final Object f4998a = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final MessageDigest mo5903a() {
        synchronized (this.f4998a) {
            MessageDigest messageDigest = f4997b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f4997b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            MessageDigest messageDigest2 = f4997b;
            return messageDigest2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract byte[] mo5904b(String str);
}
