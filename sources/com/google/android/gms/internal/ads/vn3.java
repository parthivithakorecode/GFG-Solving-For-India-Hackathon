package com.google.android.gms.internal.ads;

public final class vn3 {
    /* renamed from: a */
    public static int m18610a() {
        try {
            return Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").getInt((Object) null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static boolean m18611b() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }
}
