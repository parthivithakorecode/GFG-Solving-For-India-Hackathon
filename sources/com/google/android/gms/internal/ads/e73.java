package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

public abstract class e73<E> extends z63<E> implements List<E>, RandomAccess {

    /* renamed from: g */
    private static final i93<Object> f6117g = new c73(t83.f14783j, 0);

    e73() {
    }

    /* renamed from: B */
    public static <E> e73<E> m8340B(E e, E e2, E e3, E e4, E e5, E e6) {
        Object[] objArr = {e, e2, e3, e4, e5, e6};
        r83.m16100b(objArr, 6);
        return m8343r(objArr, 6);
    }

    /* renamed from: p */
    public static <E> b73<E> m8341p() {
        return new b73<>(4);
    }

    /* renamed from: q */
    static <E> e73<E> m8342q(Object[] objArr) {
        return m8343r(objArr, objArr.length);
    }

    /* renamed from: r */
    static <E> e73<E> m8343r(Object[] objArr, int i) {
        return i == 0 ? t83.f14783j : new t83(objArr, i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Collection, java.lang.Iterable<? extends E>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <E> com.google.android.gms.internal.ads.e73<E> m8344s(java.lang.Iterable<? extends E> r0) {
        /*
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.e73 r0 = m8345t(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.e73.m8344s(java.lang.Iterable):com.google.android.gms.internal.ads.e73");
    }

    /* renamed from: t */
    public static <E> e73<E> m8345t(Collection<? extends E> collection) {
        if (collection instanceof z63) {
            e73<E> k = ((z63) collection).mo6862k();
            if (!k.mo6406m()) {
                return k;
            }
            Object[] array = k.toArray();
            return m8343r(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        r83.m16100b(array2, length);
        return m8343r(array2, length);
    }

    /* renamed from: u */
    public static <E> e73<E> m8346u(E[] eArr) {
        Object[] objArr = (Object[]) eArr.clone();
        int length = objArr.length;
        r83.m16100b(objArr, length);
        return m8343r(objArr, length);
    }

    /* renamed from: v */
    public static <E> e73<E> m8347v() {
        return t83.f14783j;
    }

    /* renamed from: w */
    public static <E> e73<E> m8348w(E e) {
        Object[] objArr = {e};
        r83.m16100b(objArr, 1);
        return m8343r(objArr, 1);
    }

    /* renamed from: x */
    public static <E> e73<E> m8349x(E e, E e2) {
        Object[] objArr = {e, e2};
        r83.m16100b(objArr, 2);
        return m8343r(objArr, 2);
    }

    /* renamed from: y */
    public static <E> e73<E> m8350y(E e, E e2, E e3) {
        Object[] objArr = {"2011", "1009", "3010"};
        r83.m16100b(objArr, 3);
        return m8343r(objArr, 3);
    }

    /* renamed from: z */
    public static <E> e73<E> m8351z(E e, E e2, E e3, E e4, E e5) {
        Object[] objArr = {e, e2, e3, e4, e5};
        r83.m16100b(objArr, 5);
        return m8343r(objArr, 5);
    }

    /* renamed from: C */
    public final i93<E> listIterator(int i) {
        q43.m15459b(i, size(), "index");
        return isEmpty() ? f6117g : new c73(this, i);
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (m43.m13055a(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!m43.m13055a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo6858h(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Deprecated
    /* renamed from: k */
    public final e73<E> mo6862k() {
        return this;
    }

    /* renamed from: l */
    public final h93<E> mo6863l() {
        return listIterator(0);
    }

    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: o */
    public e73<E> subList(int i, int i2) {
        q43.m15463f(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? t83.f14783j : new d73(this, i, i3);
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }
}
