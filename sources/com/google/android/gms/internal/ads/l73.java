package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

final class l73<K, V> extends z63<V> {

    /* renamed from: g */
    private final transient n73<K, V> f9931g;

    l73(n73<K, V> n73) {
        this.f9931g = n73;
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.f9931g.mo5143h(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo6858h(Object[] objArr, int i) {
        i93 C = ((e73) this.f9931g.f11341i.values()).listIterator(0);
        while (C.hasNext()) {
            i = ((z63) C.next()).mo6858h(objArr, i);
        }
        return i;
    }

    public final /* synthetic */ Iterator iterator() {
        return new j73(this.f9931g);
    }

    /* renamed from: l */
    public final h93<V> mo6863l() {
        return new j73(this.f9931g);
    }

    public final int size() {
        return this.f9931g.f11342j;
    }
}
