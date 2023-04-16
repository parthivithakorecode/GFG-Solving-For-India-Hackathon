package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

class t53 implements Iterator {

    /* renamed from: f */
    final Iterator f14721f;

    /* renamed from: g */
    final Collection f14722g;

    /* renamed from: h */
    final /* synthetic */ u53 f14723h;

    t53(u53 u53) {
        this.f14723h = u53;
        Collection collection = u53.f15411g;
        this.f14722g = collection;
        this.f14721f = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    t53(u53 u53, Iterator it) {
        this.f14723h = u53;
        this.f14722g = u53.f15411g;
        this.f14721f = it;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10939a() {
        this.f14723h.mo11163a();
        if (this.f14723h.f15411g != this.f14722g) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        mo10939a();
        return this.f14721f.hasNext();
    }

    public final Object next() {
        mo10939a();
        return this.f14721f.next();
    }

    public final void remove() {
        this.f14721f.remove();
        x53 x53 = this.f14723h.f15414j;
        x53.f17035j = x53.f17035j - 1;
        this.f14723h.mo11172i();
    }
}
