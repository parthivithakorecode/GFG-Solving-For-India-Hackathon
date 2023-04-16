package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

class l53<T> implements Iterator<T> {

    /* renamed from: f */
    final Iterator<Map.Entry> f9898f;
    @CheckForNull

    /* renamed from: g */
    Object f9899g = null;
    @CheckForNull

    /* renamed from: h */
    Collection f9900h = null;

    /* renamed from: i */
    Iterator f9901i = s73.INSTANCE;

    /* renamed from: j */
    final /* synthetic */ x53 f9902j;

    l53(x53 x53) {
        this.f9902j = x53;
        this.f9898f = x53.f17034i.entrySet().iterator();
    }

    public final boolean hasNext() {
        return this.f9898f.hasNext() || this.f9901i.hasNext();
    }

    public final T next() {
        if (!this.f9901i.hasNext()) {
            Map.Entry next = this.f9898f.next();
            this.f9899g = next.getKey();
            Collection collection = (Collection) next.getValue();
            this.f9900h = collection;
            this.f9901i = collection.iterator();
        }
        return this.f9901i.next();
    }

    public final void remove() {
        this.f9901i.remove();
        Collection collection = this.f9900h;
        collection.getClass();
        if (collection.isEmpty()) {
            this.f9898f.remove();
        }
        x53 x53 = this.f9902j;
        x53.f17035j = x53.f17035j - 1;
    }
}
