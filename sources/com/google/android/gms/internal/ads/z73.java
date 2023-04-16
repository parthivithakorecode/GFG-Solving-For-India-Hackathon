package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

abstract class z73<K, V> extends c93<Map.Entry<K, V>> {
    z73() {
    }

    public final void clear() {
        mo7851h().clear();
    }

    public abstract boolean contains(@CheckForNull Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Map<K, V> mo7851h();

    public final boolean isEmpty() {
        return mo7851h().isEmpty();
    }

    public final boolean removeAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        try {
            return d93.m7782b(this, collection);
        } catch (UnsupportedOperationException unused) {
            return d93.m7783c(this, collection.iterator());
        }
    }

    public final boolean retainAll(Collection<?> collection) {
        int i;
        Objects.requireNonNull(collection);
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                c63.m7234a(size, "expectedSize");
                i = size + 1;
            } else {
                i = size < 1073741824 ? (int) ((((float) size) / 0.75f) + 1.0f) : Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i);
            for (Object next : collection) {
                if (contains(next) && (next instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) next).getKey());
                }
            }
            return mo7851h().keySet().retainAll(hashSet);
        }
    }

    public final int size() {
        return mo7851h().size();
    }
}
