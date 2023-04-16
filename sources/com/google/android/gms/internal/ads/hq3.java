package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

public final class hq3<F, T> extends AbstractList<T> {

    /* renamed from: f */
    private final List<F> f8389f;

    /* renamed from: g */
    private final gq3<F, T> f8390g;

    public hq3(List<F> list, gq3<F, T> gq3) {
        this.f8389f = list;
        this.f8390g = gq3;
    }

    public final T get(int i) {
        T b = C2380xr.m19632b(((Integer) this.f8389f.get(i)).intValue());
        return b == null ? C2380xr.AD_FORMAT_TYPE_UNSPECIFIED : b;
    }

    public final int size() {
        return this.f8389f.size();
    }
}
