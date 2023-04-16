package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

public final class hv3 {
    /* renamed from: a */
    static <T> HashSet<T> m10799a(int i) {
        return new HashSet<>(m10802d(i));
    }

    /* renamed from: b */
    public static <K, V> LinkedHashMap<K, V> m10800b(int i) {
        return new LinkedHashMap<>(m10802d(i));
    }

    /* renamed from: c */
    public static <T> List<T> m10801c(int i) {
        return i == 0 ? Collections.emptyList() : new ArrayList(i);
    }

    /* renamed from: d */
    private static int m10802d(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
