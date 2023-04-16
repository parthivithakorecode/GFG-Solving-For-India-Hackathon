package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

final class b83<K, V> extends AbstractCollection<V> {

    /* renamed from: f */
    final Map<K, V> f4795f;

    b83(Map<K, V> map) {
        this.f4795f = map;
    }

    public final void clear() {
        this.f4795f.clear();
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.f4795f.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.f4795f.isEmpty();
    }

    public final Iterator<V> iterator() {
        return new y73(this.f4795f.entrySet().iterator());
    }

    public final boolean remove(@CheckForNull Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry next : this.f4795f.entrySet()) {
                if (m43.m13055a(obj, next.getValue())) {
                    this.f4795f.remove(next.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean removeAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        try {
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry next : this.f4795f.entrySet()) {
                if (collection.contains(next.getValue())) {
                    hashSet.add(next.getKey());
                }
            }
            return this.f4795f.keySet().removeAll(hashSet);
        }
    }

    public final boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry next : this.f4795f.entrySet()) {
                if (collection.contains(next.getValue())) {
                    hashSet.add(next.getKey());
                }
            }
            return this.f4795f.keySet().retainAll(hashSet);
        }
    }

    public final int size() {
        return this.f4795f.size();
    }
}
