package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

final class w83<K> extends p73<K> {

    /* renamed from: h */
    private final transient i73<K, ?> f16756h;

    /* renamed from: i */
    private final transient e73<K> f16757i;

    w83(i73<K, ?> i73, e73<K> e73) {
        this.f16756h = i73;
        this.f16757i = e73;
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.f16756h.get(obj) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo6858h(Object[] objArr, int i) {
        return this.f16757i.mo6858h(objArr, i);
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f16757i.listIterator(0);
    }

    /* renamed from: k */
    public final e73<K> mo6862k() {
        return this.f16757i;
    }

    /* renamed from: l */
    public final h93<K> mo6863l() {
        return this.f16757i.listIterator(0);
    }

    public final int size() {
        return this.f16756h.size();
    }
}
