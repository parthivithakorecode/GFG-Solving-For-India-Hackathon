package p102o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o.a */
public class C3801a<K, V> extends C3814g<K, V> implements Map<K, V> {

    /* renamed from: m */
    C3808f<K, V> f21734m;

    /* renamed from: o.a$a */
    class C3802a extends C3808f<K, V> {
        C3802a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo15052a() {
            C3801a.this.clear();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo15053b(int i, int i2) {
            return C3801a.this.f21783g[(i << 1) + i2];
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Map<K, V> mo15054c() {
            return C3801a.this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public int mo15055d() {
            return C3801a.this.f21784h;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public int mo15056e(Object obj) {
            return C3801a.this.mo15168f(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public int mo15057f(Object obj) {
            return C3801a.this.mo15172h(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo15058g(K k, V v) {
            C3801a.this.put(k, v);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo15059h(int i) {
            C3801a.this.mo15177k(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public V mo15060i(int i, V v) {
            return C3801a.this.mo15178l(i, v);
        }
    }

    public C3801a() {
    }

    public C3801a(int i) {
        super(i);
    }

    /* renamed from: n */
    private C3808f<K, V> m25659n() {
        if (this.f21734m == null) {
            this.f21734m = new C3802a();
        }
        return this.f21734m;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return m25659n().mo15100l();
    }

    public Set<K> keySet() {
        return m25659n().mo15101m();
    }

    /* renamed from: o */
    public boolean mo15049o(Collection<?> collection) {
        return C3808f.m25714p(this, collection);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo15162c(this.f21784h + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        return m25659n().mo15102n();
    }
}
