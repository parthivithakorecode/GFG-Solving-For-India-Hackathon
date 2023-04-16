package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

abstract class f93<F, T> implements Iterator<T> {

    /* renamed from: f */
    final Iterator<? extends F> f6765f;

    f93(Iterator<? extends F> it) {
        Objects.requireNonNull(it);
        this.f6765f = it;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo7268a(F f);

    public final boolean hasNext() {
        return this.f6765f.hasNext();
    }

    public final T next() {
        return mo7268a(this.f6765f.next());
    }

    public final void remove() {
        this.f6765f.remove();
    }
}
