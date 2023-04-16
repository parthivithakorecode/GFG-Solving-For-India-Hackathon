package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class bv3<E> extends AbstractList<E> {

    /* renamed from: h */
    private static final cv3 f5060h = cv3.m7583b(bv3.class);

    /* renamed from: f */
    final List<E> f5061f;

    /* renamed from: g */
    final Iterator<E> f5062g;

    public bv3(List<E> list, Iterator<E> it) {
        this.f5061f = list;
        this.f5062g = it;
    }

    public final E get(int i) {
        if (this.f5061f.size() > i) {
            return this.f5061f.get(i);
        }
        if (this.f5062g.hasNext()) {
            this.f5061f.add(this.f5062g.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    public final Iterator<E> iterator() {
        return new av3(this);
    }

    public final int size() {
        cv3 cv3 = f5060h;
        cv3.mo6309a("potentially expensive size() call");
        cv3.mo6309a("blowup running");
        while (this.f5062g.hasNext()) {
            this.f5061f.add(this.f5062g.next());
        }
        return this.f5061f.size();
    }
}
