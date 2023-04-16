package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class j73 extends h93 {

    /* renamed from: f */
    final Iterator<? extends z63> f9022f;

    /* renamed from: g */
    Iterator f9023g = r73.f13529i;

    /* renamed from: h */
    final /* synthetic */ n73 f9024h;

    j73(n73 n73) {
        this.f9024h = n73;
        this.f9022f = ((e73) n73.f11341i.values()).listIterator(0);
    }

    public final boolean hasNext() {
        return this.f9023g.hasNext() || this.f9022f.hasNext();
    }

    public final Object next() {
        if (!this.f9023g.hasNext()) {
            this.f9023g = ((z63) this.f9022f.next()).iterator();
        }
        return this.f9023g.next();
    }
}
