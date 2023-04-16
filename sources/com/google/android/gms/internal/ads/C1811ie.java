package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.ie */
public final class C1811ie extends Exception {
    private C1811ie(int i, String str, Throwable th, int i2) {
        super((String) null, th);
    }

    /* renamed from: a */
    public static C1811ie m11004a(Exception exc, int i) {
        return new C1811ie(1, (String) null, exc, i);
    }

    /* renamed from: b */
    public static C1811ie m11005b(IOException iOException) {
        return new C1811ie(0, (String) null, iOException, -1);
    }

    /* renamed from: c */
    static C1811ie m11006c(RuntimeException runtimeException) {
        return new C1811ie(2, (String) null, runtimeException, -1);
    }
}
