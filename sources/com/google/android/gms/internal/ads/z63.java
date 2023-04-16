package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import javax.annotation.CheckForNull;

public abstract class z63<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: f */
    private static final Object[] f18059f = new Object[0];

    z63() {
    }

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(@CheckForNull Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo6858h(Object[] objArr, int i) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo6404i() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo6405j() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: k */
    public e73<E> mo6862k() {
        return isEmpty() ? e73.m8347v() : e73.m8342q(toArray(f18059f));
    }

    /* renamed from: l */
    public abstract h93<E> iterator();

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract boolean mo6406m();

    /* access modifiers changed from: package-private */
    @CheckForNull
    /* renamed from: n */
    public Object[] mo6407n() {
        return null;
    }

    @Deprecated
    public final boolean remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f18059f);
    }

    public final <T> T[] toArray(T[] tArr) {
        Objects.requireNonNull(tArr);
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] n = mo6407n();
            if (n != null) {
                return Arrays.copyOfRange(n, mo6405j(), mo6404i(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (length > size) {
            tArr[size] = null;
        }
        mo6858h(tArr, 0);
        return tArr;
    }
}
