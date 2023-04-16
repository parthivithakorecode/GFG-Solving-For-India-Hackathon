package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;

public final class vv3<T> {

    /* renamed from: a */
    private final List<yv3<T>> f16425a;

    /* renamed from: b */
    private final List<yv3<Collection<T>>> f16426b;

    /* synthetic */ vv3(int i, int i2, uv3 uv3) {
        this.f16425a = hv3.m10801c(i);
        this.f16426b = hv3.m10801c(i2);
    }

    /* renamed from: a */
    public final vv3<T> mo11540a(yv3<? extends Collection<? extends T>> yv3) {
        this.f16426b.add(yv3);
        return this;
    }

    /* renamed from: b */
    public final vv3<T> mo11541b(yv3<? extends T> yv3) {
        this.f16425a.add(yv3);
        return this;
    }

    /* renamed from: c */
    public final wv3<T> mo11542c() {
        return new wv3<>(this.f16425a, this.f16426b, (uv3) null);
    }
}
