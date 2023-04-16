package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

abstract class x53<K, V> extends a63<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public transient Map<K, Collection<V>> f17034i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public transient int f17035j;

    protected x53(Map<K, Collection<V>> map) {
        if (map.isEmpty()) {
            this.f17034i = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: u */
    static /* bridge */ /* synthetic */ void m19341u(x53 x53, Object obj) {
        Collection<V> collection;
        Map<K, Collection<V>> map = x53.f17034i;
        Objects.requireNonNull(map);
        try {
            collection = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            collection = null;
        }
        Collection collection2 = collection;
        if (collection2 != null) {
            int size = collection2.size();
            collection2.clear();
            x53.f17035j -= size;
        }
    }

    /* renamed from: a */
    public final boolean mo6869a(K k, V v) {
        Collection collection = this.f17034i.get(k);
        if (collection == null) {
            Collection i = mo9699i();
            if (i.add(v)) {
                this.f17035j++;
                this.f17034i.put(k, i);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.f17035j++;
            return true;
        }
    }

    /* renamed from: b */
    public final int mo6870b() {
        return this.f17035j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Collection<V> mo5137c() {
        return new z53(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Iterator<V> mo5138d() {
        return new g53(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract Collection<V> mo9699i();

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract <E> Collection<E> mo7239j(Collection<E> collection);

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract Collection<V> mo7240k(K k, Collection<V> collection);

    /* renamed from: l */
    public final void mo6871l() {
        for (Collection<V> clear : this.f17034i.values()) {
            clear.clear();
        }
        this.f17034i.clear();
        this.f17035j = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final List<V> mo11768n(K k, List<V> list, @CheckForNull u53 u53) {
        return list instanceof RandomAccess ? new q53(this, k, list, u53) : new w53(this, k, list, u53);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final Map<K, Collection<V>> mo11769q() {
        Map<K, Collection<V>> map = this.f17034i;
        return map instanceof NavigableMap ? new o53(this, (NavigableMap) map) : map instanceof SortedMap ? new r53(this, (SortedMap) map) : new j53(this, map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final Set<K> mo11770r() {
        Map<K, Collection<V>> map = this.f17034i;
        return map instanceof NavigableMap ? new p53(this, (NavigableMap) map) : map instanceof SortedMap ? new s53(this, (SortedMap) map) : new n53(this, map);
    }
}
