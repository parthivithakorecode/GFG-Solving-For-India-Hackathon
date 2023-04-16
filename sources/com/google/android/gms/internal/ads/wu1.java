package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

public final class wu1 {
    @Pure
    /* renamed from: a */
    public static int m19202a(int i, int i2, int i3) {
        if (i >= 0 && i < i3) {
            return i;
        }
        throw new IndexOutOfBoundsException();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: b */
    public static <T> T m19203b(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: c */
    public static String m19204c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    @Pure
    /* renamed from: d */
    public static void m19205d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    /* renamed from: e */
    public static void m19206e(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @Pure
    /* renamed from: f */
    public static void m19207f(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }
}
