package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

final class q73 extends h93 {

    /* renamed from: f */
    boolean f13084f;

    /* renamed from: g */
    final /* synthetic */ Object f13085g;

    q73(Object obj) {
        this.f13085g = obj;
    }

    public final boolean hasNext() {
        return !this.f13084f;
    }

    public final Object next() {
        if (!this.f13084f) {
            this.f13084f = true;
            return this.f13085g;
        }
        throw new NoSuchElementException();
    }
}
