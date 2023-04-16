package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

final class w73<F, T> extends AbstractSequentialList<T> implements Serializable {

    /* renamed from: f */
    final List<F> f16738f;

    /* renamed from: g */
    final e43<? super F, ? extends T> f16739g;

    w73(List<F> list, e43<? super F, ? extends T> e43) {
        this.f16738f = list;
        this.f16739g = e43;
    }

    public final void clear() {
        this.f16738f.clear();
    }

    public final ListIterator<T> listIterator(int i) {
        return new v73(this, this.f16738f.listIterator(i));
    }

    public final int size() {
        return this.f16738f.size();
    }
}
