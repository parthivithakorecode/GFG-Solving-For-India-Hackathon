package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class er3<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: g */
    private static final er3 f6348g;

    /* renamed from: f */
    private boolean f6349f = true;

    static {
        er3 er3 = new er3();
        f6348g = er3;
        er3.f6349f = false;
    }

    private er3() {
    }

    private er3(Map<K, V> map) {
        super(map);
    }

    /* renamed from: a */
    public static <K, V> er3<K, V> m8691a() {
        return f6348g;
    }

    /* renamed from: f */
    private static int m8692f(Object obj) {
        if (obj instanceof byte[]) {
            return kq3.m12301b((byte[]) obj);
        }
        if (!(obj instanceof cq3)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    private final void m8693g() {
        if (!this.f6349f) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final er3<K, V> mo7041b() {
        return isEmpty() ? new er3<>() : new er3<>(this);
    }

    /* renamed from: c */
    public final void mo7042c() {
        this.f6349f = false;
    }

    public final void clear() {
        m8693g();
        super.clear();
    }

    /* renamed from: d */
    public final void mo7044d(er3<K, V> er3) {
        m8693g();
        if (!er3.isEmpty()) {
            putAll(er3);
        }
    }

    /* renamed from: e */
    public final boolean mo7045e() {
        return this.f6349f;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z = value.equals(obj2);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m8692f(entry.getValue()) ^ m8692f(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        m8693g();
        kq3.m12304e(k);
        kq3.m12304e(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m8693g();
        for (Object next : map.keySet()) {
            kq3.m12304e(next);
            kq3.m12304e(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m8693g();
        return super.remove(obj);
    }
}
