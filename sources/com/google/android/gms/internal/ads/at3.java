package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class at3 implements Iterator<String> {

    /* renamed from: f */
    final Iterator<String> f4343f;

    /* renamed from: g */
    final /* synthetic */ bt3 f4344g;

    at3(bt3 bt3) {
        this.f4344g = bt3;
        this.f4343f = bt3.f5037f.iterator();
    }

    public final boolean hasNext() {
        return this.f4343f.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f4343f.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
