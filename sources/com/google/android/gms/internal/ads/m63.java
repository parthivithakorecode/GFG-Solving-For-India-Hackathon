package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

final class m63 extends AbstractCollection {

    /* renamed from: f */
    final /* synthetic */ n63 f10752f;

    m63(n63 n63) {
        this.f10752f = n63;
    }

    public final void clear() {
        this.f10752f.clear();
    }

    public final Iterator iterator() {
        n63 n63 = this.f10752f;
        Map o = n63.mo9444o();
        return o != null ? o.values().iterator() : new f63(n63);
    }

    public final int size() {
        return this.f10752f.size();
    }
}
