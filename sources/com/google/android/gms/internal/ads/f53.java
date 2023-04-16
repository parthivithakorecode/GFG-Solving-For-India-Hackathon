package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;

class f53<K, V> extends x53<K, V> implements u73<K, V> {
    protected f53(Map<K, Collection<V>> map) {
        super(map);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List, java.util.Collection<E>] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E> java.util.Collection<E> mo7239j(java.util.Collection<E> r1) {
        /*
            r0 = this;
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f53.mo7239j(java.util.Collection):java.util.Collection");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final Collection<V> mo7240k(K k, Collection<V> collection) {
        return mo11768n(k, (List) collection, (u53) null);
    }
}
