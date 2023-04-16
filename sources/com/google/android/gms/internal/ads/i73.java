package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class i73<K, V> implements Map<K, V>, Serializable {
    @CheckForNull

    /* renamed from: f */
    private transient p73<Map.Entry<K, V>> f8562f;
    @CheckForNull

    /* renamed from: g */
    private transient p73<K> f8563g;
    @CheckForNull

    /* renamed from: h */
    private transient z63<V> f8564h;

    i73() {
    }

    /* renamed from: c */
    public static <K, V> i73<K, V> m10946c(Map<? extends K, ? extends V> map) {
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        h73 h73 = new h73(entrySet instanceof Collection ? entrySet.size() : 4);
        h73.mo7860b(entrySet);
        return h73.mo7861c();
    }

    /* renamed from: d */
    public static <K, V> i73<K, V> m10947d() {
        return y83.f17633l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract z63<V> mo8094a();

    /* renamed from: b */
    public final z63<V> values() {
        z63<V> z63 = this.f8564h;
        if (z63 != null) {
            return z63;
        }
        z63<V> a = mo8094a();
        this.f8564h = a;
        return a;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract p73<Map.Entry<K, V>> mo8099e();

    public final boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract p73<K> mo8102f();

    /* renamed from: g */
    public final p73<Map.Entry<K, V>> entrySet() {
        p73<Map.Entry<K, V>> p73 = this.f8562f;
        if (p73 != null) {
            return p73;
        }
        p73<Map.Entry<K, V>> e = mo8099e();
        this.f8562f = e;
        return e;
    }

    @CheckForNull
    public abstract V get(@CheckForNull Object obj);

    @CheckForNull
    public final V getOrDefault(@CheckForNull Object obj, @CheckForNull V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public final int hashCode() {
        return d93.m7781a(entrySet());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        p73<K> p73 = this.f8563g;
        if (p73 != null) {
            return p73;
        }
        p73<K> f = mo8102f();
        this.f8563g = f;
        return f;
    }

    @CheckForNull
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @CheckForNull
    @Deprecated
    public final V remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        c63.m7234a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
