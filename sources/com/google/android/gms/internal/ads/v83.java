package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

final class v83<K, V> extends p73<Map.Entry<K, V>> {

    /* renamed from: h */
    private final transient i73<K, V> f15942h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final transient Object[] f15943i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final transient int f15944j;

    v83(i73<K, V> i73, Object[] objArr, int i, int i2) {
        this.f15942h = i73;
        this.f15943i = objArr;
        this.f15944j = i2;
    }

    public final boolean contains(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f15942h.get(key));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo6858h(Object[] objArr, int i) {
        return mo6862k().mo6858h(objArr, i);
    }

    public final /* synthetic */ Iterator iterator() {
        return mo6862k().listIterator(0);
    }

    /* renamed from: l */
    public final h93<Map.Entry<K, V>> mo6863l() {
        return mo6862k().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final e73<Map.Entry<K, V>> mo9992p() {
        return new u83(this);
    }

    public final int size() {
        return this.f15944j;
    }
}
