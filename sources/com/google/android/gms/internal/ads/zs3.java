package com.google.android.gms.internal.ads;

import java.util.ListIterator;

final class zs3 implements ListIterator<String> {

    /* renamed from: f */
    final ListIterator<String> f18357f;

    /* renamed from: g */
    final /* synthetic */ int f18358g;

    /* renamed from: h */
    final /* synthetic */ bt3 f18359h;

    zs3(bt3 bt3, int i) {
        this.f18359h = bt3;
        this.f18358g = i;
        this.f18357f = bt3.f5037f.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f18357f.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f18357f.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f18357f.next();
    }

    public final int nextIndex() {
        return this.f18357f.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return this.f18357f.previous();
    }

    public final int previousIndex() {
        return this.f18357f.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
