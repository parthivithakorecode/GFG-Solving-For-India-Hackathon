package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

final class m53 implements Iterator {
    @CheckForNull

    /* renamed from: f */
    Map.Entry f10736f;

    /* renamed from: g */
    final /* synthetic */ Iterator f10737g;

    /* renamed from: h */
    final /* synthetic */ n53 f10738h;

    m53(n53 n53, Iterator it) {
        this.f10738h = n53;
        this.f10737g = it;
    }

    public final boolean hasNext() {
        return this.f10737g.hasNext();
    }

    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f10737g.next();
        this.f10736f = entry;
        return entry.getKey();
    }

    public final void remove() {
        q43.m15464g(this.f10736f != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f10736f.getValue();
        this.f10737g.remove();
        x53 x53 = this.f10738h.f11312g;
        x53.f17035j = x53.f17035j - collection.size();
        collection.clear();
        this.f10736f = null;
    }
}
