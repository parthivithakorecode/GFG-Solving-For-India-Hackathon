package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

abstract class v33<T> implements Iterator<T> {
    @CheckForNull

    /* renamed from: f */
    private T f15897f;

    /* renamed from: g */
    private int f15898g = 2;

    protected v33() {
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    /* renamed from: a */
    public abstract T mo11377a();

    /* access modifiers changed from: protected */
    @CheckForNull
    /* renamed from: b */
    public final T mo11378b() {
        this.f15898g = 3;
        return null;
    }

    public final boolean hasNext() {
        int i = this.f15898g;
        if (i != 4) {
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0) {
                return true;
            } else {
                if (i2 != 2) {
                    this.f15898g = 4;
                    this.f15897f = mo11377a();
                    if (this.f15898g != 3) {
                        this.f15898g = 1;
                        return true;
                    }
                }
                return false;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final T next() {
        if (hasNext()) {
            this.f15898g = 2;
            T t = this.f15897f;
            this.f15897f = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
