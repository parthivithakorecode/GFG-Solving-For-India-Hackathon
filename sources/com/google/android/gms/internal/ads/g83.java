package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

final class g83 extends k83 {

    /* renamed from: a */
    final /* synthetic */ Comparator f7307a;

    g83(Comparator comparator) {
        this.f7307a = comparator;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <K, V> Map<K, Collection<V>> mo7259a() {
        return new TreeMap(this.f7307a);
    }
}
