package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class od3 {

    /* renamed from: a */
    private static final CopyOnWriteArrayList<nd3> f11993a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public static nd3 m14437a(String str) {
        Iterator<nd3> it = f11993a.iterator();
        while (it.hasNext()) {
            nd3 next = it.next();
            if (next.zza()) {
                return next;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
