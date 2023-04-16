package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.CheckForNull;

class w53 extends u53 implements List {

    /* renamed from: k */
    final /* synthetic */ x53 f16715k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    w53(x53 x53, Object obj, @CheckForNull List list, u53 u53) {
        super(x53, obj, list, u53);
        this.f16715k = x53;
    }

    public final void add(int i, Object obj) {
        mo11163a();
        boolean isEmpty = this.f15411g.isEmpty();
        ((List) this.f15411g).add(i, obj);
        x53 x53 = this.f16715k;
        x53.f17035j = x53.f17035j + 1;
        if (isEmpty) {
            mo11170h();
        }
    }

    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f15411g).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f15411g.size();
        x53 x53 = this.f16715k;
        x53.f17035j = x53.f17035j + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        mo11170h();
        return true;
    }

    public final Object get(int i) {
        mo11163a();
        return ((List) this.f15411g).get(i);
    }

    public final int indexOf(@CheckForNull Object obj) {
        mo11163a();
        return ((List) this.f15411g).indexOf(obj);
    }

    public final int lastIndexOf(@CheckForNull Object obj) {
        mo11163a();
        return ((List) this.f15411g).lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        mo11163a();
        return new v53(this);
    }

    public final ListIterator listIterator(int i) {
        mo11163a();
        return new v53(this, i);
    }

    public final Object remove(int i) {
        mo11163a();
        Object remove = ((List) this.f15411g).remove(i);
        x53 x53 = this.f16715k;
        x53.f17035j = x53.f17035j - 1;
        mo11172i();
        return remove;
    }

    public final Object set(int i, Object obj) {
        mo11163a();
        return ((List) this.f15411g).set(i, obj);
    }

    public final List subList(int i, int i2) {
        mo11163a();
        x53 x53 = this.f16715k;
        Object obj = this.f15410f;
        List subList = ((List) this.f15411g).subList(i, i2);
        u53 u53 = this.f15412h;
        if (u53 == null) {
            u53 = this;
        }
        return x53.mo11768n(obj, subList, u53);
    }
}
