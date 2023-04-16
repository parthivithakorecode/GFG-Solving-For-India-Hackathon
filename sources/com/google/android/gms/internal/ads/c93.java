package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Objects;

abstract class c93<E> extends AbstractSet<E> {
    c93() {
    }

    public boolean removeAll(Collection<?> collection) {
        return d93.m7782b(this, collection);
    }

    public boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        return super.retainAll(collection);
    }
}
