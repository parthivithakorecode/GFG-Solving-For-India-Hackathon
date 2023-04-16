package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

class a83<K, V> extends c93<K> {

    /* renamed from: f */
    final Map<K, V> f4020f;

    a83(Map<K, V> map) {
        Objects.requireNonNull(map);
        this.f4020f = map;
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.f4020f.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.f4020f.isEmpty();
    }

    public Iterator<K> iterator() {
        throw null;
    }

    public final int size() {
        return this.f4020f.size();
    }
}
