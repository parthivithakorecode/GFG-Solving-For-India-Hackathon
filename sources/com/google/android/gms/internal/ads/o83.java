package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class o83<K, V> extends f53<K, V> {

    /* renamed from: k */
    final transient c53<? extends List<V>> f11943k;

    o83(Map<K, Collection<V>> map, c53<? extends List<V>> c53) {
        super(map);
        this.f11943k = c53;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Map<K, Collection<V>> mo5139e() {
        return mo11769q();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final Set<K> mo5141f() {
        return mo11770r();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.Collection, java.lang.Object] */
    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ Collection mo9699i() {
        return this.f11943k.zza();
    }
}
