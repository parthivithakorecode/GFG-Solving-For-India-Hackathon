package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

class u53 extends AbstractCollection {

    /* renamed from: f */
    final Object f15410f;

    /* renamed from: g */
    Collection f15411g;
    @CheckForNull

    /* renamed from: h */
    final u53 f15412h;
    @CheckForNull

    /* renamed from: i */
    final Collection f15413i;

    /* renamed from: j */
    final /* synthetic */ x53 f15414j;

    u53(x53 x53, Object obj, @CheckForNull Collection collection, u53 u53) {
        this.f15414j = x53;
        this.f15410f = obj;
        this.f15411g = collection;
        this.f15412h = u53;
        this.f15413i = u53 == null ? null : u53.f15411g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11163a() {
        Collection collection;
        u53 u53 = this.f15412h;
        if (u53 != null) {
            u53.mo11163a();
            if (this.f15412h.f15411g != this.f15413i) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f15411g.isEmpty() && (collection = (Collection) this.f15414j.f17034i.get(this.f15410f)) != null) {
            this.f15411g = collection;
        }
    }

    public final boolean add(Object obj) {
        mo11163a();
        boolean isEmpty = this.f15411g.isEmpty();
        boolean add = this.f15411g.add(obj);
        if (add) {
            x53 x53 = this.f15414j;
            x53.f17035j = x53.f17035j + 1;
            if (isEmpty) {
                mo11170h();
                return true;
            }
        }
        return add;
    }

    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f15411g.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f15411g.size();
        x53 x53 = this.f15414j;
        x53.f17035j = x53.f17035j + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        mo11170h();
        return true;
    }

    public final void clear() {
        int size = size();
        if (size != 0) {
            this.f15411g.clear();
            x53 x53 = this.f15414j;
            x53.f17035j = x53.f17035j - size;
            mo11172i();
        }
    }

    public final boolean contains(@CheckForNull Object obj) {
        mo11163a();
        return this.f15411g.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        mo11163a();
        return this.f15411g.containsAll(collection);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        mo11163a();
        return this.f15411g.equals(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo11170h() {
        u53 u53 = this.f15412h;
        if (u53 != null) {
            u53.mo11170h();
        } else {
            this.f15414j.f17034i.put(this.f15410f, this.f15411g);
        }
    }

    public final int hashCode() {
        mo11163a();
        return this.f15411g.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo11172i() {
        u53 u53 = this.f15412h;
        if (u53 != null) {
            u53.mo11172i();
        } else if (this.f15411g.isEmpty()) {
            this.f15414j.f17034i.remove(this.f15410f);
        }
    }

    public final Iterator iterator() {
        mo11163a();
        return new t53(this);
    }

    public final boolean remove(@CheckForNull Object obj) {
        mo11163a();
        boolean remove = this.f15411g.remove(obj);
        if (remove) {
            x53 x53 = this.f15414j;
            x53.f17035j = x53.f17035j - 1;
            mo11172i();
        }
        return remove;
    }

    public final boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f15411g.removeAll(collection);
        if (removeAll) {
            int size2 = this.f15411g.size();
            x53 x53 = this.f15414j;
            x53.f17035j = x53.f17035j + (size2 - size);
            mo11172i();
        }
        return removeAll;
    }

    public final boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        int size = size();
        boolean retainAll = this.f15411g.retainAll(collection);
        if (retainAll) {
            int size2 = this.f15411g.size();
            x53 x53 = this.f15414j;
            x53.f17035j = x53.f17035j + (size2 - size);
            mo11172i();
        }
        return retainAll;
    }

    public final int size() {
        mo11163a();
        return this.f15411g.size();
    }

    public final String toString() {
        mo11163a();
        return this.f15411g.toString();
    }
}
