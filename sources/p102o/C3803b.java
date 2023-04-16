package p102o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: o.b */
public final class C3803b<E> implements Collection<E>, Set<E> {

    /* renamed from: j */
    private static final int[] f21736j = new int[0];

    /* renamed from: k */
    private static final Object[] f21737k = new Object[0];

    /* renamed from: l */
    private static Object[] f21738l;

    /* renamed from: m */
    private static int f21739m;

    /* renamed from: n */
    private static Object[] f21740n;

    /* renamed from: o */
    private static int f21741o;

    /* renamed from: f */
    private int[] f21742f;

    /* renamed from: g */
    Object[] f21743g;

    /* renamed from: h */
    int f21744h;

    /* renamed from: i */
    private C3808f<E, E> f21745i;

    /* renamed from: o.b$a */
    class C3804a extends C3808f<E, E> {
        C3804a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo15052a() {
            C3803b.this.clear();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo15053b(int i, int i2) {
            return C3803b.this.f21743g[i];
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Map<E, E> mo15054c() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public int mo15055d() {
            return C3803b.this.f21744h;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public int mo15056e(Object obj) {
            return C3803b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public int mo15057f(Object obj) {
            return C3803b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo15058g(E e, E e2) {
            C3803b.this.add(e);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo15059h(int i) {
            C3803b.this.mo15072n(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public E mo15060i(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C3803b() {
        this(0);
    }

    public C3803b(int i) {
        if (i == 0) {
            this.f21742f = f21736j;
            this.f21743g = f21737k;
        } else {
            m25670h(i);
        }
        this.f21744h = 0;
    }

    /* renamed from: h */
    private void m25670h(int i) {
        if (i == 8) {
            synchronized (C3803b.class) {
                Object[] objArr = f21740n;
                if (objArr != null) {
                    this.f21743g = objArr;
                    f21740n = (Object[]) objArr[0];
                    this.f21742f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f21741o--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C3803b.class) {
                Object[] objArr2 = f21738l;
                if (objArr2 != null) {
                    this.f21743g = objArr2;
                    f21738l = (Object[]) objArr2[0];
                    this.f21742f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f21739m--;
                    return;
                }
            }
        }
        this.f21742f = new int[i];
        this.f21743g = new Object[i];
    }

    /* renamed from: j */
    private static void m25671j(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C3803b.class) {
                if (f21741o < 10) {
                    objArr[0] = f21740n;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f21740n = objArr;
                    f21741o++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C3803b.class) {
                if (f21739m < 10) {
                    objArr[0] = f21738l;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f21738l = objArr;
                    f21739m++;
                }
            }
        }
    }

    /* renamed from: k */
    private C3808f<E, E> m25672k() {
        if (this.f21745i == null) {
            this.f21745i = new C3804a();
        }
        return this.f21745i;
    }

    /* renamed from: l */
    private int m25673l(Object obj, int i) {
        int i2 = this.f21744h;
        if (i2 == 0) {
            return -1;
        }
        int a = C3805c.m25687a(this.f21742f, i2, i);
        if (a < 0 || obj.equals(this.f21743g[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f21742f[i3] == i) {
            if (obj.equals(this.f21743g[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f21742f[i4] == i) {
            if (obj.equals(this.f21743g[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* renamed from: m */
    private int m25674m() {
        int i = this.f21744h;
        if (i == 0) {
            return -1;
        }
        int a = C3805c.m25687a(this.f21742f, i, 0);
        if (a < 0 || this.f21743g[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f21742f[i2] == 0) {
            if (this.f21743g[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f21742f[i3] == 0) {
            if (this.f21743g[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m25674m();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m25673l(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.f21744h;
        int[] iArr = this.f21742f;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f21743g;
            m25670h(i5);
            int[] iArr2 = this.f21742f;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f21743g, 0, objArr.length);
            }
            m25671j(iArr, objArr, this.f21744h);
        }
        int i6 = this.f21744h;
        if (i3 < i6) {
            int[] iArr3 = this.f21742f;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f21743g;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f21744h - i3);
        }
        this.f21742f[i3] = i;
        this.f21743g[i3] = e;
        this.f21744h++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo15068i(this.f21744h + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public void clear() {
        int i = this.f21744h;
        if (i != 0) {
            m25671j(this.f21742f, this.f21743g, i);
            this.f21742f = f21736j;
            this.f21743g = f21737k;
            this.f21744h = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
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
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f21744h) {
                try {
                    if (!set.contains(mo15073o(i))) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f21742f;
        int i = this.f21744h;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    /* renamed from: i */
    public void mo15068i(int i) {
        int[] iArr = this.f21742f;
        if (iArr.length < i) {
            Object[] objArr = this.f21743g;
            m25670h(i);
            int i2 = this.f21744h;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f21742f, 0, i2);
                System.arraycopy(objArr, 0, this.f21743g, 0, this.f21744h);
            }
            m25671j(iArr, objArr, this.f21744h);
        }
    }

    public int indexOf(Object obj) {
        return obj == null ? m25674m() : m25673l(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f21744h <= 0;
    }

    public Iterator<E> iterator() {
        return m25672k().mo15101m().iterator();
    }

    /* renamed from: n */
    public E mo15072n(int i) {
        E[] eArr = this.f21743g;
        E e = eArr[i];
        int i2 = this.f21744h;
        if (i2 <= 1) {
            m25671j(this.f21742f, eArr, i2);
            this.f21742f = f21736j;
            this.f21743g = f21737k;
            this.f21744h = 0;
        } else {
            int[] iArr = this.f21742f;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = i2 - 1;
                this.f21744h = i4;
                if (i < i4) {
                    int i5 = i + 1;
                    System.arraycopy(iArr, i5, iArr, i, i4 - i);
                    Object[] objArr = this.f21743g;
                    System.arraycopy(objArr, i5, objArr, i, this.f21744h - i);
                }
                this.f21743g[this.f21744h] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                m25670h(i3);
                this.f21744h--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f21742f, 0, i);
                    System.arraycopy(eArr, 0, this.f21743g, 0, i);
                }
                int i6 = this.f21744h;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr, i7, this.f21742f, i, i6 - i);
                    System.arraycopy(eArr, i7, this.f21743g, i, this.f21744h - i);
                }
            }
        }
        return e;
    }

    /* renamed from: o */
    public E mo15073o(int i) {
        return this.f21743g[i];
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        mo15072n(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f21744h - 1; i >= 0; i--) {
            if (!collection.contains(this.f21743g[i])) {
                mo15072n(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f21744h;
    }

    public Object[] toArray() {
        int i = this.f21744h;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f21743g, 0, objArr, 0, i);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f21744h) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f21744h);
        }
        System.arraycopy(this.f21743g, 0, tArr, 0, this.f21744h);
        int length = tArr.length;
        int i = this.f21744h;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f21744h * 14);
        sb.append('{');
        for (int i = 0; i < this.f21744h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object o = mo15073o(i);
            if (o != this) {
                sb.append(o);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
