package com.google.android.gms.internal.ads;

import java.util.Objects;

public final class sv3 {
    /* renamed from: a */
    public static <T> T m16996a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: b */
    public static <T> T m16997b(T t) {
        Objects.requireNonNull(t, "Cannot return null from a non-@Nullable @Provides method");
        return t;
    }

    /* renamed from: c */
    public static <T> void m16998c(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
