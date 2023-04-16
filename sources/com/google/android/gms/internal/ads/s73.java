package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

enum s73 implements Iterator<Object> {
    INSTANCE;

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        q43.m15464g(false, "no calls to next() since the last call to remove()");
    }
}
