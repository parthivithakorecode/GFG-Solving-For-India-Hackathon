package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

final class z53 extends AbstractCollection {

    /* renamed from: f */
    final /* synthetic */ a63 f18041f;

    z53(a63 a63) {
        this.f18041f = a63;
    }

    public final void clear() {
        this.f18041f.mo6871l();
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.f18041f.mo5143h(obj);
    }

    public final Iterator iterator() {
        return this.f18041f.mo5138d();
    }

    public final int size() {
        return this.f18041f.mo6870b();
    }
}
