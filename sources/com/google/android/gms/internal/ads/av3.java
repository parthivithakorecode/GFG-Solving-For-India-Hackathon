package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

final class av3 implements Iterator {

    /* renamed from: f */
    int f4368f = 0;

    /* renamed from: g */
    final /* synthetic */ bv3 f4369g;

    av3(bv3 bv3) {
        this.f4369g = bv3;
    }

    public final boolean hasNext() {
        return this.f4368f < this.f4369g.f5061f.size() || this.f4369g.f5062g.hasNext();
    }

    public final Object next() {
        if (this.f4368f < this.f4369g.f5061f.size()) {
            List<E> list = this.f4369g.f5061f;
            int i = this.f4368f;
            this.f4368f = i + 1;
            return list.get(i);
        }
        bv3 bv3 = this.f4369g;
        bv3.f5061f.add(bv3.f5062g.next());
        return next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
