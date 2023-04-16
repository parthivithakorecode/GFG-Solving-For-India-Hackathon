package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

abstract class a63<K, V> implements e83<K, V> {
    @CheckForNull

    /* renamed from: f */
    private transient Set<K> f3989f;
    @CheckForNull

    /* renamed from: g */
    private transient Collection<V> f3990g;
    @CheckForNull

    /* renamed from: h */
    private transient Map<K, Collection<V>> f3991h;

    a63() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract Collection<V> mo5137c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Iterator<V> mo5138d() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract Map<K, Collection<V>> mo5139e();

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e83)) {
            return false;
        }
        return mo5145p().equals(((e83) obj).mo5145p());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract Set<K> mo5141f();

    /* renamed from: g */
    public final Set<K> mo5142g() {
        Set<K> set = this.f3989f;
        if (set != null) {
            return set;
        }
        Set<K> f = mo5141f();
        this.f3989f = f;
        return f;
    }

    /* renamed from: h */
    public boolean mo5143h(@CheckForNull Object obj) {
        for (Collection contains : mo5145p().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return mo5145p().hashCode();
    }

    /* renamed from: p */
    public Map<K, Collection<V>> mo5145p() {
        Map<K, Collection<V>> map = this.f3991h;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> e = mo5139e();
        this.f3991h = e;
        return e;
    }

    /* renamed from: t */
    public Collection<V> mo5146t() {
        Collection<V> collection = this.f3990g;
        if (collection != null) {
            return collection;
        }
        Collection<V> c = mo5137c();
        this.f3990g = c;
        return c;
    }

    public final String toString() {
        return mo5145p().toString();
    }
}
