package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

abstract class c83<K, V> extends AbstractMap<K, V> {
    @CheckForNull

    /* renamed from: f */
    private transient Set<Map.Entry<K, V>> f5336f;
    @CheckForNull

    /* renamed from: g */
    private transient Collection<V> f5337g;

    c83() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Set<Map.Entry<K, V>> mo6083a();

    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f5336f;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> a = mo6083a();
        this.f5336f = a;
        return a;
    }

    public final Collection<V> values() {
        Collection<V> collection = this.f5337g;
        if (collection != null) {
            return collection;
        }
        b83 b83 = new b83(this);
        this.f5337g = b83;
        return b83;
    }
}
