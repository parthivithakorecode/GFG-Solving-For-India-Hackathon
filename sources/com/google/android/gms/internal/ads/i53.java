package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

final class i53 implements Iterator<Map.Entry> {

    /* renamed from: f */
    final Iterator<Map.Entry> f8543f;
    @CheckForNull

    /* renamed from: g */
    Collection f8544g;

    /* renamed from: h */
    final /* synthetic */ j53 f8545h;

    i53(j53 j53) {
        this.f8545h = j53;
        this.f8543f = j53.f8993h.entrySet().iterator();
    }

    public final boolean hasNext() {
        return this.f8543f.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry next = this.f8543f.next();
        this.f8544g = (Collection) next.getValue();
        return this.f8545h.mo8346b(next);
    }

    public final void remove() {
        q43.m15464g(this.f8544g != null, "no calls to next() since the last call to remove()");
        this.f8543f.remove();
        x53 x53 = this.f8545h.f8994i;
        x53.f17035j = x53.f17035j - this.f8544g.size();
        this.f8544g.clear();
        this.f8544g = null;
    }
}
