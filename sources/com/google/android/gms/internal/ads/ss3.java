package com.google.android.gms.internal.ads;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class ss3<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: f */
    private final int f14576f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public List<ls3> f14577g = Collections.emptyList();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Map<K, V> f14578h = Collections.emptyMap();

    /* renamed from: i */
    private boolean f14579i;

    /* renamed from: j */
    private volatile ps3 f14580j;

    /* renamed from: k */
    private Map<K, V> f14581k = Collections.emptyMap();

    /* synthetic */ ss3(int i, rs3 rs3) {
        this.f14576f = i;
    }

    /* renamed from: k */
    private final int m16962k(K k) {
        int size = this.f14577g.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f14577g.get(size).mo9017b());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f14577g.get(i2).mo9017b());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final V m16963l(int i) {
        m16965n();
        V value = this.f14577g.remove(i).getValue();
        if (!this.f14578h.isEmpty()) {
            Iterator it = m16964m().entrySet().iterator();
            List<ls3> list = this.f14577g;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new ls3(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: m */
    private final SortedMap<K, V> m16964m() {
        m16965n();
        if (this.f14578h.isEmpty() && !(this.f14578h instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f14578h = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f14581k = treeMap.descendingMap();
        }
        return (SortedMap) this.f14578h;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m16965n() {
        if (this.f14579i) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public void mo8009a() {
        if (!this.f14579i) {
            this.f14578h = this.f14578h.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f14578h);
            this.f14581k = this.f14581k.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f14581k);
            this.f14579i = true;
        }
    }

    /* renamed from: b */
    public final int mo10849b() {
        return this.f14577g.size();
    }

    /* renamed from: c */
    public final Iterable<Map.Entry<K, V>> mo10850c() {
        return this.f14578h.isEmpty() ? ks3.m12382a() : this.f14578h.entrySet();
    }

    public final void clear() {
        m16965n();
        if (!this.f14577g.isEmpty()) {
            this.f14577g.clear();
        }
        if (!this.f14578h.isEmpty()) {
            this.f14578h.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m16962k(comparable) >= 0 || this.f14578h.containsKey(comparable);
    }

    /* renamed from: e */
    public final V put(K k, V v) {
        m16965n();
        int k2 = m16962k(k);
        if (k2 >= 0) {
            return this.f14577g.get(k2).setValue(v);
        }
        m16965n();
        if (this.f14577g.isEmpty() && !(this.f14577g instanceof ArrayList)) {
            this.f14577g = new ArrayList(this.f14576f);
        }
        int i = -(k2 + 1);
        if (i >= this.f14576f) {
            return m16964m().put(k, v);
        }
        int size = this.f14577g.size();
        int i2 = this.f14576f;
        if (size == i2) {
            ls3 remove = this.f14577g.remove(i2 - 1);
            m16964m().put(remove.mo9017b(), remove.getValue());
        }
        this.f14577g.add(i, new ls3(this, k, v));
        return null;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f14580j == null) {
            this.f14580j = new ps3(this, (os3) null);
        }
        return this.f14580j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss3)) {
            return super.equals(obj);
        }
        ss3 ss3 = (ss3) obj;
        int size = size();
        if (size != ss3.size()) {
            return false;
        }
        int b = mo10849b();
        if (b != ss3.mo10849b()) {
            return entrySet().equals(ss3.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!mo10856g(i).equals(ss3.mo10856g(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.f14578h.equals(ss3.f14578h);
        }
        return true;
    }

    /* renamed from: g */
    public final Map.Entry<K, V> mo10856g(int i) {
        return this.f14577g.get(i);
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int k = m16962k(comparable);
        return k >= 0 ? this.f14577g.get(k).getValue() : this.f14578h.get(comparable);
    }

    public final int hashCode() {
        int b = mo10849b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += this.f14577g.get(i2).hashCode();
        }
        return this.f14578h.size() > 0 ? i + this.f14578h.hashCode() : i;
    }

    /* renamed from: j */
    public final boolean mo10859j() {
        return this.f14579i;
    }

    public final V remove(Object obj) {
        m16965n();
        Comparable comparable = (Comparable) obj;
        int k = m16962k(comparable);
        if (k >= 0) {
            return m16963l(k);
        }
        if (this.f14578h.isEmpty()) {
            return null;
        }
        return this.f14578h.remove(comparable);
    }

    public final int size() {
        return this.f14577g.size() + this.f14578h.size();
    }
}
