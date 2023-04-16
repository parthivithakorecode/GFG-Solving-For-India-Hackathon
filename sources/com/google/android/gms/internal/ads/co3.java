package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class co3<E> extends AbstractList<E> implements jq3<E> {

    /* renamed from: f */
    private boolean f5482f = true;

    co3() {
    }

    /* renamed from: a */
    public final void mo6244a() {
        this.f5482f = false;
    }

    public boolean add(E e) {
        mo6248h();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo6248h();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo6248h();
        return super.addAll(collection);
    }

    /* renamed from: c */
    public final boolean mo6246c() {
        return this.f5482f;
    }

    public void clear() {
        mo6248h();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo6248h() {
        if (!this.f5482f) {
            throw new UnsupportedOperationException();
        }
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public abstract E remove(int i);

    public final boolean remove(Object obj) {
        mo6248h();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        mo6248h();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        mo6248h();
        return super.retainAll(collection);
    }
}
