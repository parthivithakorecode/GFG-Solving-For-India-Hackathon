package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

abstract class gv3<K, V, V2> implements kv3<Map<K, V2>> {

    /* renamed from: a */
    private final Map<K, yv3<V>> f7621a;

    gv3(Map<K, yv3<V>> map) {
        this.f7621a = Collections.unmodifiableMap(map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Map<K, yv3<V>> mo7718b() {
        return this.f7621a;
    }
}
