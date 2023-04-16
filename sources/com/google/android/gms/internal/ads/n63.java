package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

final class n63<K, V> extends AbstractMap<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final Object f11326o = new Object();
    @CheckForNull

    /* renamed from: f */
    private transient Object f11327f;
    @CheckForNull

    /* renamed from: g */
    transient int[] f11328g;
    @CheckForNull

    /* renamed from: h */
    transient Object[] f11329h;
    @CheckForNull

    /* renamed from: i */
    transient Object[] f11330i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public transient int f11331j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public transient int f11332k;
    @CheckForNull

    /* renamed from: l */
    private transient Set<K> f11333l;
    @CheckForNull

    /* renamed from: m */
    private transient Set<Map.Entry<K, V>> f11334m;
    @CheckForNull

    /* renamed from: n */
    private transient Collection<V> f11335n;

    n63() {
        mo9448s(3);
    }

    n63(int i) {
        mo9448s(8);
    }

    /* renamed from: A */
    private final int m13736A(int i, int i2, int i3, int i4) {
        Object d = o63.m14329d(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            o63.m14330e(d, i3 & i5, i4 + 1);
        }
        Object obj = this.f11327f;
        obj.getClass();
        int[] a = m13739a();
        for (int i6 = 0; i6 <= i; i6++) {
            int c = o63.m14328c(obj, i6);
            while (c != 0) {
                int i7 = c - 1;
                int i8 = a[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int c2 = o63.m14328c(d, i10);
                o63.m14330e(d, i10, c);
                a[i7] = ((~i5) & i9) | (c2 & i5);
                c = i8 & i;
            }
        }
        this.f11327f = d;
        m13738C(i5);
        return i5;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final Object m13737B(@CheckForNull Object obj) {
        if (mo9451u()) {
            return f11326o;
        }
        int y = m13756y();
        Object obj2 = this.f11327f;
        obj2.getClass();
        int b = o63.m14327b(obj, (Object) null, y, obj2, m13739a(), m13740b(), (Object[]) null);
        if (b == -1) {
            return f11326o;
        }
        Object obj3 = m13741c()[b];
        mo9450t(b, y);
        this.f11332k--;
        mo9446r();
        return obj3;
    }

    /* renamed from: C */
    private final void m13738C(int i) {
        this.f11331j = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.f11331j & -32);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final int[] m13739a() {
        int[] iArr = this.f11328g;
        iArr.getClass();
        return iArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Object[] m13740b() {
        Object[] objArr = this.f11329h;
        objArr.getClass();
        return objArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final Object[] m13741c() {
        Object[] objArr = this.f11330i;
        objArr.getClass();
        return objArr;
    }

    /* renamed from: j */
    static /* synthetic */ Object m13746j(n63 n63, int i) {
        return n63.m13740b()[i];
    }

    /* renamed from: l */
    static /* synthetic */ Object m13748l(n63 n63) {
        Object obj = n63.f11327f;
        obj.getClass();
        return obj;
    }

    /* renamed from: m */
    static /* synthetic */ Object m13749m(n63 n63, int i) {
        return n63.m13741c()[i];
    }

    /* renamed from: q */
    static /* synthetic */ void m13752q(n63 n63, int i, Object obj) {
        n63.m13741c()[i] = obj;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final int m13756y() {
        return (1 << (this.f11331j & 31)) - 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final int m13757z(@CheckForNull Object obj) {
        if (mo9451u()) {
            return -1;
        }
        int b = w63.m18896b(obj);
        int y = m13756y();
        Object obj2 = this.f11327f;
        obj2.getClass();
        int c = o63.m14328c(obj2, b & y);
        if (c != 0) {
            int i = ~y;
            int i2 = b & i;
            do {
                int i3 = c - 1;
                int i4 = m13739a()[i3];
                if ((i4 & i) == i2 && m43.m13055a(obj, m13740b()[i3])) {
                    return i3;
                }
                c = i4 & y;
            } while (c != 0);
        }
        return -1;
    }

    public final void clear() {
        if (!mo9451u()) {
            mo9446r();
            Map o = mo9444o();
            if (o != null) {
                this.f11331j = o93.m14372a(size(), 3, 1073741823);
                o.clear();
                this.f11327f = null;
            } else {
                Arrays.fill(m13740b(), 0, this.f11332k, (Object) null);
                Arrays.fill(m13741c(), 0, this.f11332k, (Object) null);
                Object obj = this.f11327f;
                obj.getClass();
                if (obj instanceof byte[]) {
                    Arrays.fill((byte[]) obj, (byte) 0);
                } else if (obj instanceof short[]) {
                    Arrays.fill((short[]) obj, 0);
                } else {
                    Arrays.fill((int[]) obj, 0);
                }
                Arrays.fill(m13739a(), 0, this.f11332k, 0);
            }
            this.f11332k = 0;
        }
    }

    public final boolean containsKey(@CheckForNull Object obj) {
        Map o = mo9444o();
        return o != null ? o.containsKey(obj) : m13757z(obj) != -1;
    }

    public final boolean containsValue(@CheckForNull Object obj) {
        Map o = mo9444o();
        if (o != null) {
            return o.containsValue(obj);
        }
        for (int i = 0; i < this.f11332k; i++) {
            if (m43.m13055a(obj, m13741c()[i])) {
                return true;
            }
        }
        return false;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f11334m;
        if (set != null) {
            return set;
        }
        g63 g63 = new g63(this);
        this.f11334m = g63;
        return g63;
    }

    @CheckForNull
    public final V get(@CheckForNull Object obj) {
        Map o = mo9444o();
        if (o != null) {
            return o.get(obj);
        }
        int z = m13757z(obj);
        if (z == -1) {
            return null;
        }
        return m13741c()[z];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo9440h() {
        return isEmpty() ? -1 : 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final int mo9441i(int i) {
        int i2 = i + 1;
        if (i2 < this.f11332k) {
            return i2;
        }
        return -1;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Set<K> keySet() {
        Set<K> set = this.f11333l;
        if (set != null) {
            return set;
        }
        j63 j63 = new j63(this);
        this.f11333l = j63;
        return j63;
    }

    /* access modifiers changed from: package-private */
    @CheckForNull
    /* renamed from: o */
    public final Map<K, V> mo9444o() {
        Object obj = this.f11327f;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @CheckForNull
    public final V put(K k, V v) {
        int min;
        K k2 = k;
        V v2 = v;
        if (mo9451u()) {
            q43.m15464g(mo9451u(), "Arrays already allocated");
            int i = this.f11331j;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) ((double) highestOneBit)) && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f11327f = o63.m14329d(max2);
            m13738C(max2 - 1);
            this.f11328g = new int[i];
            this.f11329h = new Object[i];
            this.f11330i = new Object[i];
        }
        Map o = mo9444o();
        if (o != null) {
            return o.put(k2, v2);
        }
        int[] a = m13739a();
        Object[] b = m13740b();
        V[] c = m13741c();
        int i2 = this.f11332k;
        int i3 = i2 + 1;
        int b2 = w63.m18896b(k);
        int y = m13756y();
        int i4 = b2 & y;
        Object obj = this.f11327f;
        obj.getClass();
        int c2 = o63.m14328c(obj, i4);
        if (c2 != 0) {
            int i5 = ~y;
            int i6 = b2 & i5;
            int i7 = 0;
            while (true) {
                int i8 = c2 - 1;
                int i9 = a[i8];
                int i10 = i9 & i5;
                if (i10 != i6 || !m43.m13055a(k2, b[i8])) {
                    int i11 = i9 & y;
                    i7++;
                    if (i11 != 0) {
                        c2 = i11;
                    } else if (i7 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(m13756y() + 1, 1.0f);
                        for (int h = mo9440h(); h >= 0; h = mo9441i(h)) {
                            linkedHashMap.put(m13740b()[h], m13741c()[h]);
                        }
                        this.f11327f = linkedHashMap;
                        this.f11328g = null;
                        this.f11329h = null;
                        this.f11330i = null;
                        mo9446r();
                        return linkedHashMap.put(k2, v2);
                    } else if (i3 <= y) {
                        a[i8] = (i3 & y) | i10;
                    }
                } else {
                    V v3 = c[i8];
                    c[i8] = v2;
                    return v3;
                }
            }
            int length = m13739a().length;
            this.f11328g = Arrays.copyOf(m13739a(), min);
            this.f11329h = Arrays.copyOf(m13740b(), min);
            this.f11330i = Arrays.copyOf(m13741c(), min);
            m13739a()[i2] = (~y) & b2;
            m13740b()[i2] = k2;
            m13741c()[i2] = v2;
            this.f11332k = i3;
            mo9446r();
            return null;
        } else if (i3 <= y) {
            Object obj2 = this.f11327f;
            obj2.getClass();
            o63.m14330e(obj2, i4, i3);
            int length2 = m13739a().length;
            if (i3 > length2 && (min = Math.min(1073741823, (Math.max(1, length2 >>> 1) + length2) | 1)) != length2) {
                this.f11328g = Arrays.copyOf(m13739a(), min);
                this.f11329h = Arrays.copyOf(m13740b(), min);
                this.f11330i = Arrays.copyOf(m13741c(), min);
            }
            m13739a()[i2] = (~y) & b2;
            m13740b()[i2] = k2;
            m13741c()[i2] = v2;
            this.f11332k = i3;
            mo9446r();
            return null;
        }
        y = m13736A(y, o63.m14326a(y), b2, i2);
        int length22 = m13739a().length;
        this.f11328g = Arrays.copyOf(m13739a(), min);
        this.f11329h = Arrays.copyOf(m13740b(), min);
        this.f11330i = Arrays.copyOf(m13741c(), min);
        m13739a()[i2] = (~y) & b2;
        m13740b()[i2] = k2;
        m13741c()[i2] = v2;
        this.f11332k = i3;
        mo9446r();
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo9446r() {
        this.f11331j += 32;
    }

    @CheckForNull
    public final V remove(@CheckForNull Object obj) {
        Map o = mo9444o();
        if (o != null) {
            return o.remove(obj);
        }
        V B = m13737B(obj);
        if (B == f11326o) {
            return null;
        }
        return B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo9448s(int i) {
        this.f11331j = o93.m14372a(i, 1, 1073741823);
    }

    public final int size() {
        Map o = mo9444o();
        return o != null ? o.size() : this.f11332k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo9450t(int i, int i2) {
        Object obj = this.f11327f;
        obj.getClass();
        int[] a = m13739a();
        Object[] b = m13740b();
        Object[] c = m13741c();
        int size = size() - 1;
        if (i < size) {
            Object obj2 = b[size];
            b[i] = obj2;
            c[i] = c[size];
            b[size] = null;
            c[size] = null;
            a[i] = a[size];
            a[size] = 0;
            int b2 = w63.m18896b(obj2) & i2;
            int c2 = o63.m14328c(obj, b2);
            int i3 = size + 1;
            if (c2 != i3) {
                while (true) {
                    int i4 = c2 - 1;
                    int i5 = a[i4];
                    int i6 = i5 & i2;
                    if (i6 != i3) {
                        c2 = i6;
                    } else {
                        a[i4] = ((i + 1) & i2) | (i5 & (~i2));
                        return;
                    }
                }
            } else {
                o63.m14330e(obj, b2, i + 1);
            }
        } else {
            b[i] = null;
            c[i] = null;
            a[i] = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean mo9451u() {
        return this.f11327f == null;
    }

    public final Collection<V> values() {
        Collection<V> collection = this.f11335n;
        if (collection != null) {
            return collection;
        }
        m63 m63 = new m63(this);
        this.f11335n = m63;
        return m63;
    }
}
