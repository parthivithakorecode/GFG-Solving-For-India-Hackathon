package p102o;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: o.g */
public class C3814g<K, V> {

    /* renamed from: i */
    static Object[] f21778i;

    /* renamed from: j */
    static int f21779j;

    /* renamed from: k */
    static Object[] f21780k;

    /* renamed from: l */
    static int f21781l;

    /* renamed from: f */
    int[] f21782f;

    /* renamed from: g */
    Object[] f21783g;

    /* renamed from: h */
    int f21784h;

    public C3814g() {
        this.f21782f = C3805c.f21747a;
        this.f21783g = C3805c.f21749c;
        this.f21784h = 0;
    }

    public C3814g(int i) {
        if (i == 0) {
            this.f21782f = C3805c.f21747a;
            this.f21783g = C3805c.f21749c;
        } else {
            m25731a(i);
        }
        this.f21784h = 0;
    }

    public C3814g(C3814g<K, V> gVar) {
        this();
        if (gVar != null) {
            mo15176j(gVar);
        }
    }

    /* renamed from: a */
    private void m25731a(int i) {
        Class<C3814g> cls = C3814g.class;
        if (i == 8) {
            synchronized (cls) {
                Object[] objArr = f21780k;
                if (objArr != null) {
                    this.f21783g = objArr;
                    f21780k = (Object[]) objArr[0];
                    this.f21782f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f21781l--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                Object[] objArr2 = f21778i;
                if (objArr2 != null) {
                    this.f21783g = objArr2;
                    f21778i = (Object[]) objArr2[0];
                    this.f21782f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f21779j--;
                    return;
                }
            }
        }
        this.f21782f = new int[i];
        this.f21783g = new Object[(i << 1)];
    }

    /* renamed from: b */
    private static int m25732b(int[] iArr, int i, int i2) {
        try {
            return C3805c.m25687a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: d */
    private static void m25733d(int[] iArr, Object[] objArr, int i) {
        Class<C3814g> cls = C3814g.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f21781l < 10) {
                    objArr[0] = f21780k;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f21780k = objArr;
                    f21781l++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f21779j < 10) {
                    objArr[0] = f21778i;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f21778i = objArr;
                    f21779j++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo15162c(int i) {
        int i2 = this.f21784h;
        int[] iArr = this.f21782f;
        if (iArr.length < i) {
            Object[] objArr = this.f21783g;
            m25731a(i);
            if (this.f21784h > 0) {
                System.arraycopy(iArr, 0, this.f21782f, 0, i2);
                System.arraycopy(objArr, 0, this.f21783g, 0, i2 << 1);
            }
            m25733d(iArr, objArr, i2);
        }
        if (this.f21784h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f21784h;
        if (i > 0) {
            int[] iArr = this.f21782f;
            Object[] objArr = this.f21783g;
            this.f21782f = C3805c.f21747a;
            this.f21783g = C3805c.f21749c;
            this.f21784h = 0;
            m25733d(iArr, objArr, i);
        }
        if (this.f21784h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo15168f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo15172h(obj) >= 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo15166e(Object obj, int i) {
        int i2 = this.f21784h;
        if (i2 == 0) {
            return -1;
        }
        int b = m25732b(this.f21782f, i2, i);
        if (b < 0 || obj.equals(this.f21783g[b << 1])) {
            return b;
        }
        int i3 = b + 1;
        while (i3 < i2 && this.f21782f[i3] == i) {
            if (obj.equals(this.f21783g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = b - 1;
        while (i4 >= 0 && this.f21782f[i4] == i) {
            if (obj.equals(this.f21783g[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3814g) {
            C3814g gVar = (C3814g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f21784h) {
                try {
                    Object i2 = mo15174i(i);
                    Object m = mo15179m(i);
                    Object obj2 = gVar.get(i2);
                    if (m == null) {
                        if (obj2 != null || !gVar.containsKey(i2)) {
                            return false;
                        }
                    } else if (!m.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i3 = 0;
            while (i3 < this.f21784h) {
                try {
                    Object i4 = mo15174i(i3);
                    Object m2 = mo15179m(i3);
                    Object obj3 = map.get(i4);
                    if (m2 == null) {
                        if (obj3 != null || !map.containsKey(i4)) {
                            return false;
                        }
                    } else if (!m2.equals(obj3)) {
                        return false;
                    }
                    i3++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int mo15168f(Object obj) {
        return obj == null ? mo15169g() : mo15166e(obj, obj.hashCode());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo15169g() {
        int i = this.f21784h;
        if (i == 0) {
            return -1;
        }
        int b = m25732b(this.f21782f, i, 0);
        if (b < 0 || this.f21783g[b << 1] == null) {
            return b;
        }
        int i2 = b + 1;
        while (i2 < i && this.f21782f[i2] == 0) {
            if (this.f21783g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = b - 1;
        while (i3 >= 0 && this.f21782f[i3] == 0) {
            if (this.f21783g[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v) {
        int f = mo15168f(obj);
        return f >= 0 ? this.f21783g[(f << 1) + 1] : v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo15172h(Object obj) {
        int i = this.f21784h * 2;
        Object[] objArr = this.f21783g;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f21782f;
        Object[] objArr = this.f21783g;
        int i = this.f21784h;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* renamed from: i */
    public K mo15174i(int i) {
        return this.f21783g[i << 1];
    }

    public boolean isEmpty() {
        return this.f21784h <= 0;
    }

    /* renamed from: j */
    public void mo15176j(C3814g<? extends K, ? extends V> gVar) {
        int i = gVar.f21784h;
        mo15162c(this.f21784h + i);
        if (this.f21784h != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(gVar.mo15174i(i2), gVar.mo15179m(i2));
            }
        } else if (i > 0) {
            System.arraycopy(gVar.f21782f, 0, this.f21782f, 0, i);
            System.arraycopy(gVar.f21783g, 0, this.f21783g, 0, i << 1);
            this.f21784h = i;
        }
    }

    /* renamed from: k */
    public V mo15177k(int i) {
        V[] vArr = this.f21783g;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this.f21784h;
        int i4 = 0;
        if (i3 <= 1) {
            m25733d(this.f21782f, vArr, i3);
            this.f21782f = C3805c.f21747a;
            this.f21783g = C3805c.f21749c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f21782f;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr = this.f21783g;
                    System.arraycopy(objArr, i7 << 1, objArr, i2, i8 << 1);
                }
                Object[] objArr2 = this.f21783g;
                int i9 = i5 << 1;
                objArr2[i9] = null;
                objArr2[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                m25731a(i6);
                if (i3 == this.f21784h) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f21782f, 0, i);
                        System.arraycopy(vArr, 0, this.f21783g, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.f21782f, i, i11);
                        System.arraycopy(vArr, i10 << 1, this.f21783g, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f21784h) {
            this.f21784h = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: l */
    public V mo15178l(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f21783g;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* renamed from: m */
    public V mo15179m(int i) {
        return this.f21783g[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f21784h;
        if (k == null) {
            i2 = mo15169g();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo15166e(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f21783g;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        int[] iArr = this.f21782f;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.f21783g;
            m25731a(i6);
            if (i3 == this.f21784h) {
                int[] iArr2 = this.f21782f;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f21783g, 0, objArr.length);
                }
                m25733d(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f21782f;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f21783g;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f21784h - i5) << 1);
        }
        int i8 = this.f21784h;
        if (i3 == i8) {
            int[] iArr4 = this.f21782f;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f21783g;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f21784h = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int f = mo15168f(obj);
        if (f >= 0) {
            return mo15177k(f);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int f = mo15168f(obj);
        if (f < 0) {
            return false;
        }
        Object m = mo15179m(f);
        if (obj2 != m && (obj2 == null || !obj2.equals(m))) {
            return false;
        }
        mo15177k(f);
        return true;
    }

    public V replace(K k, V v) {
        int f = mo15168f(k);
        if (f >= 0) {
            return mo15178l(f, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int f = mo15168f(k);
        if (f < 0) {
            return false;
        }
        V m = mo15179m(f);
        if (m != v && (v == null || !v.equals(m))) {
            return false;
        }
        mo15178l(f, v2);
        return true;
    }

    public int size() {
        return this.f21784h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f21784h * 28);
        sb.append('{');
        for (int i = 0; i < this.f21784h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object i2 = mo15174i(i);
            if (i2 != this) {
                sb.append(i2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object m = mo15179m(i);
            if (m != this) {
                sb.append(m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
