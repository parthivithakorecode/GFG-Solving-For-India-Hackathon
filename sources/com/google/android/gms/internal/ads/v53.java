package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

final class v53 extends t53 implements ListIterator {

    /* renamed from: i */
    final /* synthetic */ w53 f15918i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    v53(w53 w53) {
        super(w53);
        this.f15918i = w53;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v53(w53 w53, int i) {
        super(w53, ((List) w53.f15411g).listIterator(i));
        this.f15918i = w53;
    }

    public final void add(Object obj) {
        boolean isEmpty = this.f15918i.isEmpty();
        mo10939a();
        ((ListIterator) this.f14721f).add(obj);
        x53 x53 = this.f15918i.f16715k;
        x53.f17035j = x53.f17035j + 1;
        if (isEmpty) {
            this.f15918i.mo11170h();
        }
    }

    public final boolean hasPrevious() {
        mo10939a();
        return ((ListIterator) this.f14721f).hasPrevious();
    }

    public final int nextIndex() {
        mo10939a();
        return ((ListIterator) this.f14721f).nextIndex();
    }

    public final Object previous() {
        mo10939a();
        return ((ListIterator) this.f14721f).previous();
    }

    public final int previousIndex() {
        mo10939a();
        return ((ListIterator) this.f14721f).previousIndex();
    }

    public final void set(Object obj) {
        mo10939a();
        ((ListIterator) this.f14721f).set(obj);
    }
}
