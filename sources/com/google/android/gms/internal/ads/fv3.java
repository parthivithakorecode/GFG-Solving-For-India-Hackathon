package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

public class fv3<K, V, V2> {

    /* renamed from: a */
    final LinkedHashMap<K, yv3<V>> f6965a;

    fv3(int i) {
        this.f6965a = hv3.m10800b(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final fv3<K, V, V2> mo7411a(K k, yv3<V> yv3) {
        LinkedHashMap<K, yv3<V>> linkedHashMap = this.f6965a;
        sv3.m16996a(k, "key");
        sv3.m16996a(yv3, "provider");
        linkedHashMap.put(k, yv3);
        return this;
    }
}
