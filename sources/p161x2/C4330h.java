package p161x2;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* renamed from: x2.h */
public final class C4330h<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: m */
    private static final Comparator<Comparable> f22662m = new C4331a();

    /* renamed from: f */
    Comparator<? super K> f22663f;

    /* renamed from: g */
    C4337e<K, V> f22664g;

    /* renamed from: h */
    int f22665h;

    /* renamed from: i */
    int f22666i;

    /* renamed from: j */
    final C4337e<K, V> f22667j;

    /* renamed from: k */
    private C4330h<K, V>.b f22668k;

    /* renamed from: l */
    private C4330h<K, V>.c f22669l;

    /* renamed from: x2.h$a */
    class C4331a implements Comparator<Comparable> {
        C4331a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: x2.h$b */
    class C4332b extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: x2.h$b$a */
        class C4333a extends C4330h<K, V>.d<Map.Entry<K, V>> {
            C4333a() {
                super();
            }

            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return mo15942a();
            }
        }

        C4332b() {
        }

        public void clear() {
            C4330h.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C4330h.this.mo15915c((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C4333a();
        }

        public boolean remove(Object obj) {
            C4337e c;
            if (!(obj instanceof Map.Entry) || (c = C4330h.this.mo15915c((Map.Entry) obj)) == null) {
                return false;
            }
            C4330h.this.mo15920f(c, true);
            return true;
        }

        public int size() {
            return C4330h.this.f22665h;
        }
    }

    /* renamed from: x2.h$c */
    final class C4334c extends AbstractSet<K> {

        /* renamed from: x2.h$c$a */
        class C4335a extends C4330h<K, V>.d<K> {
            C4335a() {
                super();
            }

            public K next() {
                return mo15942a().f22683k;
            }
        }

        C4334c() {
        }

        public void clear() {
            C4330h.this.clear();
        }

        public boolean contains(Object obj) {
            return C4330h.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C4335a();
        }

        public boolean remove(Object obj) {
            return C4330h.this.mo15921g(obj) != null;
        }

        public int size() {
            return C4330h.this.f22665h;
        }
    }

    /* renamed from: x2.h$d */
    private abstract class C4336d<T> implements Iterator<T> {

        /* renamed from: f */
        C4337e<K, V> f22674f;

        /* renamed from: g */
        C4337e<K, V> f22675g = null;

        /* renamed from: h */
        int f22676h;

        C4336d() {
            this.f22674f = C4330h.this.f22667j.f22681i;
            this.f22676h = C4330h.this.f22666i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C4337e<K, V> mo15942a() {
            C4337e<K, V> eVar = this.f22674f;
            C4330h hVar = C4330h.this;
            if (eVar == hVar.f22667j) {
                throw new NoSuchElementException();
            } else if (hVar.f22666i == this.f22676h) {
                this.f22674f = eVar.f22681i;
                this.f22675g = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f22674f != C4330h.this.f22667j;
        }

        public final void remove() {
            C4337e<K, V> eVar = this.f22675g;
            if (eVar != null) {
                C4330h.this.mo15920f(eVar, true);
                this.f22675g = null;
                this.f22676h = C4330h.this.f22666i;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: x2.h$e */
    static final class C4337e<K, V> implements Map.Entry<K, V> {

        /* renamed from: f */
        C4337e<K, V> f22678f;

        /* renamed from: g */
        C4337e<K, V> f22679g;

        /* renamed from: h */
        C4337e<K, V> f22680h;

        /* renamed from: i */
        C4337e<K, V> f22681i;

        /* renamed from: j */
        C4337e<K, V> f22682j;

        /* renamed from: k */
        final K f22683k;

        /* renamed from: l */
        V f22684l;

        /* renamed from: m */
        int f22685m;

        C4337e() {
            this.f22683k = null;
            this.f22682j = this;
            this.f22681i = this;
        }

        C4337e(C4337e<K, V> eVar, K k, C4337e<K, V> eVar2, C4337e<K, V> eVar3) {
            this.f22678f = eVar;
            this.f22683k = k;
            this.f22685m = 1;
            this.f22681i = eVar2;
            this.f22682j = eVar3;
            eVar3.f22681i = this;
            eVar2.f22682j = this;
        }

        /* renamed from: a */
        public C4337e<K, V> mo15945a() {
            C4337e<K, V> eVar = this;
            for (C4337e<K, V> eVar2 = this.f22679g; eVar2 != null; eVar2 = eVar2.f22679g) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* renamed from: b */
        public C4337e<K, V> mo15946b() {
            C4337e<K, V> eVar = this;
            for (C4337e<K, V> eVar2 = this.f22680h; eVar2 != null; eVar2 = eVar2.f22680h) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x002e
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f22683k
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x002e
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x002e
            L_0x001c:
                V r0 = r3.f22684l
                java.lang.Object r4 = r4.getValue()
                if (r0 != 0) goto L_0x0027
                if (r4 != 0) goto L_0x002e
                goto L_0x002d
            L_0x0027:
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x002e
            L_0x002d:
                r1 = 1
            L_0x002e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p161x2.C4330h.C4337e.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f22683k;
        }

        public V getValue() {
            return this.f22684l;
        }

        public int hashCode() {
            K k = this.f22683k;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f22684l;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f22684l;
            this.f22684l = v;
            return v2;
        }

        public String toString() {
            return this.f22683k + "=" + this.f22684l;
        }
    }

    static {
        Class<C4330h> cls = C4330h.class;
    }

    public C4330h() {
        this(f22662m);
    }

    public C4330h(Comparator<? super K> comparator) {
        this.f22665h = 0;
        this.f22666i = 0;
        this.f22667j = new C4337e<>();
        this.f22663f = comparator == null ? f22662m : comparator;
    }

    /* renamed from: a */
    private boolean m26944a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: e */
    private void m26945e(C4337e<K, V> eVar, boolean z) {
        while (eVar != null) {
            C4337e<K, V> eVar2 = eVar.f22679g;
            C4337e<K, V> eVar3 = eVar.f22680h;
            int i = 0;
            int i2 = eVar2 != null ? eVar2.f22685m : 0;
            int i3 = eVar3 != null ? eVar3.f22685m : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C4337e<K, V> eVar4 = eVar3.f22679g;
                C4337e<K, V> eVar5 = eVar3.f22680h;
                int i5 = eVar5 != null ? eVar5.f22685m : 0;
                if (eVar4 != null) {
                    i = eVar4.f22685m;
                }
                int i6 = i - i5;
                if (i6 != -1 && (i6 != 0 || z)) {
                    m26948j(eVar3);
                }
                m26947i(eVar);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C4337e<K, V> eVar6 = eVar2.f22679g;
                C4337e<K, V> eVar7 = eVar2.f22680h;
                int i7 = eVar7 != null ? eVar7.f22685m : 0;
                if (eVar6 != null) {
                    i = eVar6.f22685m;
                }
                int i8 = i - i7;
                if (i8 != 1 && (i8 != 0 || z)) {
                    m26947i(eVar2);
                }
                m26948j(eVar);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.f22685m = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f22685m = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f22678f;
        }
    }

    /* renamed from: h */
    private void m26946h(C4337e<K, V> eVar, C4337e<K, V> eVar2) {
        C4337e<K, V> eVar3 = eVar.f22678f;
        eVar.f22678f = null;
        if (eVar2 != null) {
            eVar2.f22678f = eVar3;
        }
        if (eVar3 == null) {
            this.f22664g = eVar2;
        } else if (eVar3.f22679g == eVar) {
            eVar3.f22679g = eVar2;
        } else {
            eVar3.f22680h = eVar2;
        }
    }

    /* renamed from: i */
    private void m26947i(C4337e<K, V> eVar) {
        C4337e<K, V> eVar2 = eVar.f22679g;
        C4337e<K, V> eVar3 = eVar.f22680h;
        C4337e<K, V> eVar4 = eVar3.f22679g;
        C4337e<K, V> eVar5 = eVar3.f22680h;
        eVar.f22680h = eVar4;
        if (eVar4 != null) {
            eVar4.f22678f = eVar;
        }
        m26946h(eVar, eVar3);
        eVar3.f22679g = eVar;
        eVar.f22678f = eVar3;
        int i = 0;
        int max = Math.max(eVar2 != null ? eVar2.f22685m : 0, eVar4 != null ? eVar4.f22685m : 0) + 1;
        eVar.f22685m = max;
        if (eVar5 != null) {
            i = eVar5.f22685m;
        }
        eVar3.f22685m = Math.max(max, i) + 1;
    }

    /* renamed from: j */
    private void m26948j(C4337e<K, V> eVar) {
        C4337e<K, V> eVar2 = eVar.f22679g;
        C4337e<K, V> eVar3 = eVar.f22680h;
        C4337e<K, V> eVar4 = eVar2.f22679g;
        C4337e<K, V> eVar5 = eVar2.f22680h;
        eVar.f22679g = eVar5;
        if (eVar5 != null) {
            eVar5.f22678f = eVar;
        }
        m26946h(eVar, eVar2);
        eVar2.f22680h = eVar;
        eVar.f22678f = eVar2;
        int i = 0;
        int max = Math.max(eVar3 != null ? eVar3.f22685m : 0, eVar5 != null ? eVar5.f22685m : 0) + 1;
        eVar.f22685m = max;
        if (eVar4 != null) {
            i = eVar4.f22685m;
        }
        eVar2.f22685m = Math.max(max, i) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C4337e<K, V> mo15914b(K k, boolean z) {
        int i;
        C4337e<K, V> eVar;
        Comparator<? super K> comparator = this.f22663f;
        C4337e<K, V> eVar2 = this.f22664g;
        if (eVar2 != null) {
            Comparable comparable = comparator == f22662m ? (Comparable) k : null;
            while (true) {
                K k2 = eVar2.f22683k;
                i = comparable != null ? comparable.compareTo(k2) : comparator.compare(k, k2);
                if (i == 0) {
                    return eVar2;
                }
                C4337e<K, V> eVar3 = i < 0 ? eVar2.f22679g : eVar2.f22680h;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C4337e<K, V> eVar4 = this.f22667j;
        if (eVar2 != null) {
            eVar = new C4337e<>(eVar2, k, eVar4, eVar4.f22682j);
            if (i < 0) {
                eVar2.f22679g = eVar;
            } else {
                eVar2.f22680h = eVar;
            }
            m26945e(eVar2, true);
        } else if (comparator != f22662m || (k instanceof Comparable)) {
            eVar = new C4337e<>(eVar2, k, eVar4, eVar4.f22682j);
            this.f22664g = eVar;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        this.f22665h++;
        this.f22666i++;
        return eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C4337e<K, V> mo15915c(Map.Entry<?, ?> entry) {
        C4337e<K, V> d = mo15918d(entry.getKey());
        if (d != null && m26944a(d.f22684l, entry.getValue())) {
            return d;
        }
        return null;
    }

    public void clear() {
        this.f22664g = null;
        this.f22665h = 0;
        this.f22666i++;
        C4337e<K, V> eVar = this.f22667j;
        eVar.f22682j = eVar;
        eVar.f22681i = eVar;
    }

    public boolean containsKey(Object obj) {
        return mo15918d(obj) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C4337e<K, V> mo15918d(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo15914b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        C4330h<K, V>.b bVar = this.f22668k;
        if (bVar != null) {
            return bVar;
        }
        C4330h<K, V>.b bVar2 = new C4332b();
        this.f22668k = bVar2;
        return bVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo15920f(C4337e<K, V> eVar, boolean z) {
        int i;
        if (z) {
            C4337e<K, V> eVar2 = eVar.f22682j;
            eVar2.f22681i = eVar.f22681i;
            eVar.f22681i.f22682j = eVar2;
        }
        C4337e<K, V> eVar3 = eVar.f22679g;
        C4337e<K, V> eVar4 = eVar.f22680h;
        C4337e<K, V> eVar5 = eVar.f22678f;
        int i2 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                m26946h(eVar, eVar3);
                eVar.f22679g = null;
            } else if (eVar4 != null) {
                m26946h(eVar, eVar4);
                eVar.f22680h = null;
            } else {
                m26946h(eVar, (C4337e<K, V>) null);
            }
            m26945e(eVar5, false);
            this.f22665h--;
            this.f22666i++;
            return;
        }
        C4337e<K, V> b = eVar3.f22685m > eVar4.f22685m ? eVar3.mo15946b() : eVar4.mo15945a();
        mo15920f(b, false);
        C4337e<K, V> eVar6 = eVar.f22679g;
        if (eVar6 != null) {
            i = eVar6.f22685m;
            b.f22679g = eVar6;
            eVar6.f22678f = b;
            eVar.f22679g = null;
        } else {
            i = 0;
        }
        C4337e<K, V> eVar7 = eVar.f22680h;
        if (eVar7 != null) {
            i2 = eVar7.f22685m;
            b.f22680h = eVar7;
            eVar7.f22678f = b;
            eVar.f22680h = null;
        }
        b.f22685m = Math.max(i, i2) + 1;
        m26946h(eVar, b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C4337e<K, V> mo15921g(Object obj) {
        C4337e<K, V> d = mo15918d(obj);
        if (d != null) {
            mo15920f(d, true);
        }
        return d;
    }

    public V get(Object obj) {
        C4337e d = mo15918d(obj);
        if (d != null) {
            return d.f22684l;
        }
        return null;
    }

    public Set<K> keySet() {
        C4330h<K, V>.c cVar = this.f22669l;
        if (cVar != null) {
            return cVar;
        }
        C4330h<K, V>.c cVar2 = new C4334c();
        this.f22669l = cVar2;
        return cVar2;
    }

    public V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        C4337e b = mo15914b(k, true);
        V v2 = b.f22684l;
        b.f22684l = v;
        return v2;
    }

    public V remove(Object obj) {
        C4337e g = mo15921g(obj);
        if (g != null) {
            return g.f22684l;
        }
        return null;
    }

    public int size() {
        return this.f22665h;
    }
}
