package com.google.android.gms.internal.ads;

import java.util.ListIterator;

abstract class g93<F, T> extends f93<F, T> implements ListIterator<T> {
    g93(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    public final void add(T t) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasPrevious() {
        return ((ListIterator) this.f6765f).hasPrevious();
    }

    public final int nextIndex() {
        return ((ListIterator) this.f6765f).nextIndex();
    }

    public final T previous() {
        return mo7268a(((ListIterator) this.f6765f).previous());
    }

    public final int previousIndex() {
        return ((ListIterator) this.f6765f).previousIndex();
    }

    public final void set(T t) {
        throw new UnsupportedOperationException();
    }
}
