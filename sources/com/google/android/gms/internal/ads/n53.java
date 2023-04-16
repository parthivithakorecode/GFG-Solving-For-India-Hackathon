package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

class n53 extends a83 {

    /* renamed from: g */
    final /* synthetic */ x53 f11312g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    n53(x53 x53, Map map) {
        super(map);
        this.f11312g = x53;
    }

    public final void clear() {
        t73.m17180b(iterator());
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.f4020f.keySet().containsAll(collection);
    }

    public final boolean equals(@CheckForNull Object obj) {
        return this == obj || this.f4020f.keySet().equals(obj);
    }

    public final int hashCode() {
        return this.f4020f.keySet().hashCode();
    }

    public final Iterator iterator() {
        return new m53(this, this.f4020f.entrySet().iterator());
    }

    public final boolean remove(@CheckForNull Object obj) {
        Collection collection = (Collection) this.f4020f.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        x53 x53 = this.f11312g;
        x53.f17035j = x53.f17035j - size;
        return size > 0;
    }
}
