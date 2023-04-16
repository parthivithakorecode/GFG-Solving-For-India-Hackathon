package com.google.android.gms.internal.ads;

import java.io.Serializable;

final class a73<K, V> extends y53<K, V> implements Serializable {

    /* renamed from: f */
    final K f3998f;

    /* renamed from: g */
    final V f3999g;

    a73(K k, V v) {
        this.f3998f = k;
        this.f3999g = v;
    }

    public final K getKey() {
        return this.f3998f;
    }

    public final V getValue() {
        return this.f3999g;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
