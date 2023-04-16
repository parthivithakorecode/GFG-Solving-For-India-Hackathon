package p074k;

import java.util.HashMap;
import java.util.Map;
import p074k.C3286b;

/* renamed from: k.a */
public class C3285a<K, V> extends C3286b<K, V> {

    /* renamed from: j */
    private HashMap<K, C3286b.C3289c<K, V>> f20758j = new HashMap<>();

    public boolean contains(K k) {
        return this.f20758j.containsKey(k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C3286b.C3289c<K, V> mo14271i(K k) {
        return this.f20758j.get(k);
    }

    /* renamed from: m */
    public V mo14272m(K k, V v) {
        C3286b.C3289c i = mo14271i(k);
        if (i != null) {
            return i.f20764g;
        }
        this.f20758j.put(k, mo14282l(k, v));
        return null;
    }

    /* renamed from: n */
    public V mo14273n(K k) {
        V n = super.mo14273n(k);
        this.f20758j.remove(k);
        return n;
    }

    /* renamed from: o */
    public Map.Entry<K, V> mo14274o(K k) {
        if (contains(k)) {
            return this.f20758j.get(k).f20766i;
        }
        return null;
    }
}
