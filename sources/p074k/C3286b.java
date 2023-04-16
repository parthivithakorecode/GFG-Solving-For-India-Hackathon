package p074k;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: k.b */
public class C3286b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: f */
    C3289c<K, V> f20759f;

    /* renamed from: g */
    private C3289c<K, V> f20760g;

    /* renamed from: h */
    private WeakHashMap<C3292f<K, V>, Boolean> f20761h = new WeakHashMap<>();

    /* renamed from: i */
    private int f20762i = 0;

    /* renamed from: k.b$a */
    static class C3287a<K, V> extends C3291e<K, V> {
        C3287a(C3289c<K, V> cVar, C3289c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C3289c<K, V> mo14285b(C3289c<K, V> cVar) {
            return cVar.f20766i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C3289c<K, V> mo14286c(C3289c<K, V> cVar) {
            return cVar.f20765h;
        }
    }

    /* renamed from: k.b$b */
    private static class C3288b<K, V> extends C3291e<K, V> {
        C3288b(C3289c<K, V> cVar, C3289c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C3289c<K, V> mo14285b(C3289c<K, V> cVar) {
            return cVar.f20765h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C3289c<K, V> mo14286c(C3289c<K, V> cVar) {
            return cVar.f20766i;
        }
    }

    /* renamed from: k.b$c */
    static class C3289c<K, V> implements Map.Entry<K, V> {

        /* renamed from: f */
        final K f20763f;

        /* renamed from: g */
        final V f20764g;

        /* renamed from: h */
        C3289c<K, V> f20765h;

        /* renamed from: i */
        C3289c<K, V> f20766i;

        C3289c(K k, V v) {
            this.f20763f = k;
            this.f20764g = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C3289c)) {
                return false;
            }
            C3289c cVar = (C3289c) obj;
            return this.f20763f.equals(cVar.f20763f) && this.f20764g.equals(cVar.f20764g);
        }

        public K getKey() {
            return this.f20763f;
        }

        public V getValue() {
            return this.f20764g;
        }

        public int hashCode() {
            return this.f20763f.hashCode() ^ this.f20764g.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f20763f + "=" + this.f20764g;
        }
    }

    /* renamed from: k.b$d */
    private class C3290d implements Iterator<Map.Entry<K, V>>, C3292f<K, V> {

        /* renamed from: f */
        private C3289c<K, V> f20767f;

        /* renamed from: g */
        private boolean f20768g = true;

        C3290d() {
        }

        /* renamed from: a */
        public void mo14293a(C3289c<K, V> cVar) {
            C3289c<K, V> cVar2 = this.f20767f;
            if (cVar == cVar2) {
                C3289c<K, V> cVar3 = cVar2.f20766i;
                this.f20767f = cVar3;
                this.f20768g = cVar3 == null;
            }
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            C3289c<K, V> cVar;
            if (this.f20768g) {
                this.f20768g = false;
                cVar = C3286b.this.f20759f;
            } else {
                C3289c<K, V> cVar2 = this.f20767f;
                cVar = cVar2 != null ? cVar2.f20765h : null;
            }
            this.f20767f = cVar;
            return this.f20767f;
        }

        public boolean hasNext() {
            if (this.f20768g) {
                return C3286b.this.f20759f != null;
            }
            C3289c<K, V> cVar = this.f20767f;
            return (cVar == null || cVar.f20765h == null) ? false : true;
        }
    }

    /* renamed from: k.b$e */
    private static abstract class C3291e<K, V> implements Iterator<Map.Entry<K, V>>, C3292f<K, V> {

        /* renamed from: f */
        C3289c<K, V> f20770f;

        /* renamed from: g */
        C3289c<K, V> f20771g;

        C3291e(C3289c<K, V> cVar, C3289c<K, V> cVar2) {
            this.f20770f = cVar2;
            this.f20771g = cVar;
        }

        /* renamed from: e */
        private C3289c<K, V> m24356e() {
            C3289c<K, V> cVar = this.f20771g;
            C3289c<K, V> cVar2 = this.f20770f;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo14286c(cVar);
        }

        /* renamed from: a */
        public void mo14293a(C3289c<K, V> cVar) {
            if (this.f20770f == cVar && cVar == this.f20771g) {
                this.f20771g = null;
                this.f20770f = null;
            }
            C3289c<K, V> cVar2 = this.f20770f;
            if (cVar2 == cVar) {
                this.f20770f = mo14285b(cVar2);
            }
            if (this.f20771g == cVar) {
                this.f20771g = m24356e();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C3289c<K, V> mo14285b(C3289c<K, V> cVar);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract C3289c<K, V> mo14286c(C3289c<K, V> cVar);

        /* renamed from: d */
        public Map.Entry<K, V> next() {
            C3289c<K, V> cVar = this.f20771g;
            this.f20771g = m24356e();
            return cVar;
        }

        public boolean hasNext() {
            return this.f20771g != null;
        }
    }

    /* renamed from: k.b$f */
    interface C3292f<K, V> {
        /* renamed from: a */
        void mo14293a(C3289c<K, V> cVar);
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C3288b bVar = new C3288b(this.f20760g, this.f20759f);
        this.f20761h.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3286b)) {
            return false;
        }
        C3286b bVar = (C3286b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    /* renamed from: h */
    public Map.Entry<K, V> mo14277h() {
        return this.f20759f;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map.Entry) it.next()).hashCode();
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C3289c<K, V> mo14271i(K k) {
        C3289c<K, V> cVar = this.f20759f;
        while (cVar != null && !cVar.f20763f.equals(k)) {
            cVar = cVar.f20765h;
        }
        return cVar;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        C3287a aVar = new C3287a(this.f20759f, this.f20760g);
        this.f20761h.put(aVar, Boolean.FALSE);
        return aVar;
    }

    /* renamed from: j */
    public C3286b<K, V>.d mo14280j() {
        C3286b<K, V>.d dVar = new C3290d();
        this.f20761h.put(dVar, Boolean.FALSE);
        return dVar;
    }

    /* renamed from: k */
    public Map.Entry<K, V> mo14281k() {
        return this.f20760g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C3289c<K, V> mo14282l(K k, V v) {
        C3289c<K, V> cVar = new C3289c<>(k, v);
        this.f20762i++;
        C3289c<K, V> cVar2 = this.f20760g;
        if (cVar2 == null) {
            this.f20759f = cVar;
        } else {
            cVar2.f20765h = cVar;
            cVar.f20766i = cVar2;
        }
        this.f20760g = cVar;
        return cVar;
    }

    /* renamed from: m */
    public V mo14272m(K k, V v) {
        C3289c i = mo14271i(k);
        if (i != null) {
            return i.f20764g;
        }
        mo14282l(k, v);
        return null;
    }

    /* renamed from: n */
    public V mo14273n(K k) {
        C3289c i = mo14271i(k);
        if (i == null) {
            return null;
        }
        this.f20762i--;
        if (!this.f20761h.isEmpty()) {
            for (C3292f<K, V> a : this.f20761h.keySet()) {
                a.mo14293a(i);
            }
        }
        C3289c<K, V> cVar = i.f20766i;
        C3289c<K, V> cVar2 = i.f20765h;
        if (cVar != null) {
            cVar.f20765h = cVar2;
        } else {
            this.f20759f = cVar2;
        }
        C3289c<K, V> cVar3 = i.f20765h;
        if (cVar3 != null) {
            cVar3.f20766i = cVar;
        } else {
            this.f20760g = cVar;
        }
        i.f20765h = null;
        i.f20766i = null;
        return i.f20764g;
    }

    public int size() {
        return this.f20762i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
