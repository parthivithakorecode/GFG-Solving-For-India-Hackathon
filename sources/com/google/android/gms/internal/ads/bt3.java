package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class bt3 extends AbstractList<String> implements RandomAccess, sq3 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final sq3 f5037f;

    public bt3(sq3 sq3) {
        this.f5037f = sq3;
    }

    /* renamed from: D */
    public final Object mo5946D(int i) {
        return this.f5037f.mo5946D(i);
    }

    /* renamed from: b */
    public final sq3 mo5947b() {
        return this;
    }

    /* renamed from: f */
    public final List<?> mo5948f() {
        return this.f5037f.mo5948f();
    }

    /* renamed from: g */
    public final void mo5949g(uo3 uo3) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((rq3) this.f5037f).get(i);
    }

    public final Iterator<String> iterator() {
        return new at3(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new zs3(this, i);
    }

    public final int size() {
        return this.f5037f.size();
    }
}
