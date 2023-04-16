package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

public final class x73 {
    /* renamed from: a */
    public static <E> ArrayList<E> m19391a(int i) {
        c63.m7234a(i, "initialArraySize");
        return new ArrayList<>(i);
    }

    /* renamed from: b */
    public static <F, T> List<T> m19392b(List<F> list, e43<? super F, ? extends T> e43) {
        return new w73(list, e43);
    }
}
