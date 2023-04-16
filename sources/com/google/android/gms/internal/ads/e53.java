package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

abstract class e53<E> extends i93<E> {

    /* renamed from: f */
    private final int f6095f;

    /* renamed from: g */
    private int f6096g;

    protected e53(int i, int i2) {
        q43.m15459b(i2, i, "index");
        this.f6095f = i;
        this.f6096g = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract E mo6077a(int i);

    public final boolean hasNext() {
        return this.f6096g < this.f6095f;
    }

    public final boolean hasPrevious() {
        return this.f6096g > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f6096g;
            this.f6096g = i + 1;
            return mo6077a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f6096g;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f6096g - 1;
            this.f6096g = i;
            return mo6077a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f6096g - 1;
    }
}
