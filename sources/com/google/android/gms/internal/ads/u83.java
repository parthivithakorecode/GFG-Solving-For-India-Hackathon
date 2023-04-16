package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Map;

final class u83 extends e73<Map.Entry> {

    /* renamed from: h */
    final /* synthetic */ v83 f15458h;

    u83(v83 v83) {
        this.f15458h = v83;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        q43.m15458a(i, this.f15458h.f15944j, "index");
        int i2 = i + i;
        Object obj = this.f15458h.f15943i[i2];
        obj.getClass();
        Object obj2 = this.f15458h.f15943i[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    /* renamed from: m */
    public final boolean mo6406m() {
        return true;
    }

    public final int size() {
        return this.f15458h.f15944j;
    }
}
