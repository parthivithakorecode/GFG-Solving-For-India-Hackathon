package com.google.android.gms.internal.ads;

import android.os.StrictMode;

public final class o10 {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static <T> T m14207a(c53<T> c53) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            T zza = c53.zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return zza;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }
}
