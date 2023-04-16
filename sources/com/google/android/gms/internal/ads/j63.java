package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

final class j63 extends AbstractSet {

    /* renamed from: f */
    final /* synthetic */ n63 f9005f;

    j63(n63 n63) {
        this.f9005f = n63;
    }

    public final void clear() {
        this.f9005f.clear();
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.f9005f.containsKey(obj);
    }

    public final Iterator iterator() {
        n63 n63 = this.f9005f;
        Map o = n63.mo9444o();
        return o != null ? o.keySet().iterator() : new d63(n63);
    }

    public final boolean remove(@CheckForNull Object obj) {
        Map o = this.f9005f.mo9444o();
        return o != null ? o.keySet().remove(obj) : this.f9005f.m13737B(obj) != n63.f11326o;
    }

    public final int size() {
        return this.f9005f.size();
    }
}
