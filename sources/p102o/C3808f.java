package p102o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: o.f */
abstract class C3808f<K, V> {

    /* renamed from: a */
    C3808f<K, V>.b f21763a;

    /* renamed from: b */
    C3808f<K, V>.c f21764b;

    /* renamed from: c */
    C3808f<K, V>.e f21765c;

    /* renamed from: o.f$a */
    final class C3809a<T> implements Iterator<T> {

        /* renamed from: f */
        final int f21766f;

        /* renamed from: g */
        int f21767g;

        /* renamed from: h */
        int f21768h;

        /* renamed from: i */
        boolean f21769i = false;

        C3809a(int i) {
            this.f21766f = i;
            this.f21767g = C3808f.this.mo15055d();
        }

        public boolean hasNext() {
            return this.f21768h < this.f21767g;
        }

        public T next() {
            if (hasNext()) {
                T b = C3808f.this.mo15053b(this.f21768h, this.f21766f);
                this.f21768h++;
                this.f21769i = true;
                return b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f21769i) {
                int i = this.f21768h - 1;
                this.f21768h = i;
                this.f21767g--;
                this.f21769i = false;
                C3808f.this.mo15059h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: o.f$b */
    final class C3810b implements Set<Map.Entry<K, V>> {
        C3810b() {
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d = C3808f.this.mo15055d();
            for (Map.Entry entry : collection) {
                C3808f.this.mo15058g(entry.getKey(), entry.getValue());
            }
            return d != C3808f.this.mo15055d();
        }

        public void clear() {
            C3808f.this.mo15052a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e = C3808f.this.mo15056e(entry.getKey());
            if (e < 0) {
                return false;
            }
            return C3805c.m25689c(C3808f.this.mo15053b(e, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C3808f.m25712k(this, obj);
        }

        /* renamed from: h */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public int hashCode() {
            int i = 0;
            for (int d = C3808f.this.mo15055d() - 1; d >= 0; d--) {
                Object b = C3808f.this.mo15053b(d, 0);
                Object b2 = C3808f.this.mo15053b(d, 1);
                i += (b == null ? 0 : b.hashCode()) ^ (b2 == null ? 0 : b2.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return C3808f.this.mo15055d() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C3812d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C3808f.this.mo15055d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o.f$c */
    final class C3811c implements Set<K> {
        C3811c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C3808f.this.mo15052a();
        }

        public boolean contains(Object obj) {
            return C3808f.this.mo15056e(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C3808f.m25711j(C3808f.this.mo15054c(), collection);
        }

        public boolean equals(Object obj) {
            return C3808f.m25712k(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int d = C3808f.this.mo15055d() - 1; d >= 0; d--) {
                Object b = C3808f.this.mo15053b(d, 0);
                i += b == null ? 0 : b.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return C3808f.this.mo15055d() == 0;
        }

        public Iterator<K> iterator() {
            return new C3809a(0);
        }

        public boolean remove(Object obj) {
            int e = C3808f.this.mo15056e(obj);
            if (e < 0) {
                return false;
            }
            C3808f.this.mo15059h(e);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C3808f.m25713o(C3808f.this.mo15054c(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C3808f.m25714p(C3808f.this.mo15054c(), collection);
        }

        public int size() {
            return C3808f.this.mo15055d();
        }

        public Object[] toArray() {
            return C3808f.this.mo15103q(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C3808f.this.mo15104r(tArr, 0);
        }
    }

    /* renamed from: o.f$d */
    final class C3812d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: f */
        int f21773f;

        /* renamed from: g */
        int f21774g;

        /* renamed from: h */
        boolean f21775h = false;

        C3812d() {
            this.f21773f = C3808f.this.mo15055d() - 1;
            this.f21774g = -1;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f21774g++;
                this.f21775h = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.f21775h) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return C3805c.m25689c(entry.getKey(), C3808f.this.mo15053b(this.f21774g, 0)) && C3805c.m25689c(entry.getValue(), C3808f.this.mo15053b(this.f21774g, 1));
            }
        }

        public K getKey() {
            if (this.f21775h) {
                return C3808f.this.mo15053b(this.f21774g, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f21775h) {
                return C3808f.this.mo15053b(this.f21774g, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f21774g < this.f21773f;
        }

        public int hashCode() {
            if (this.f21775h) {
                int i = 0;
                Object b = C3808f.this.mo15053b(this.f21774g, 0);
                Object b2 = C3808f.this.mo15053b(this.f21774g, 1);
                int hashCode = b == null ? 0 : b.hashCode();
                if (b2 != null) {
                    i = b2.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f21775h) {
                C3808f.this.mo15059h(this.f21774g);
                this.f21774g--;
                this.f21773f--;
                this.f21775h = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f21775h) {
                return C3808f.this.mo15060i(this.f21774g, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: o.f$e */
    final class C3813e implements Collection<V> {
        C3813e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C3808f.this.mo15052a();
        }

        public boolean contains(Object obj) {
            return C3808f.this.mo15057f(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C3808f.this.mo15055d() == 0;
        }

        public Iterator<V> iterator() {
            return new C3809a(1);
        }

        public boolean remove(Object obj) {
            int f = C3808f.this.mo15057f(obj);
            if (f < 0) {
                return false;
            }
            C3808f.this.mo15059h(f);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int d = C3808f.this.mo15055d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (collection.contains(C3808f.this.mo15053b(i, 1))) {
                    C3808f.this.mo15059h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int d = C3808f.this.mo15055d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (!collection.contains(C3808f.this.mo15053b(i, 1))) {
                    C3808f.this.mo15059h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C3808f.this.mo15055d();
        }

        public Object[] toArray() {
            return C3808f.this.mo15103q(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C3808f.this.mo15104r(tArr, 1);
        }
    }

    C3808f() {
    }

    /* renamed from: j */
    public static <K, V> boolean m25711j(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static <T> boolean m25712k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: o */
    public static <K, V> boolean m25713o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    /* renamed from: p */
    public static <K, V> boolean m25714p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo15052a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo15053b(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Map<K, V> mo15054c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo15055d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo15056e(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo15057f(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo15058g(K k, V v);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo15059h(int i);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract V mo15060i(int i, V v);

    /* renamed from: l */
    public Set<Map.Entry<K, V>> mo15100l() {
        if (this.f21763a == null) {
            this.f21763a = new C3810b();
        }
        return this.f21763a;
    }

    /* renamed from: m */
    public Set<K> mo15101m() {
        if (this.f21764b == null) {
            this.f21764b = new C3811c();
        }
        return this.f21764b;
    }

    /* renamed from: n */
    public Collection<V> mo15102n() {
        if (this.f21765c == null) {
            this.f21765c = new C3813e();
        }
        return this.f21765c;
    }

    /* renamed from: q */
    public Object[] mo15103q(int i) {
        int d = mo15055d();
        Object[] objArr = new Object[d];
        for (int i2 = 0; i2 < d; i2++) {
            objArr[i2] = mo15053b(i2, i);
        }
        return objArr;
    }

    /* renamed from: r */
    public <T> T[] mo15104r(T[] tArr, int i) {
        int d = mo15055d();
        if (tArr.length < d) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d);
        }
        for (int i2 = 0; i2 < d; i2++) {
            tArr[i2] = mo15053b(i2, i);
        }
        if (tArr.length > d) {
            tArr[d] = null;
        }
        return tArr;
    }
}
