package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

public final class iu2 {

    /* renamed from: a */
    private final HashMap<xt2, hu2<?, ?>> f8805a = new HashMap<>();

    /* renamed from: a */
    public final <R extends ea1<AdT>, AdT extends v61> hu2<R, AdT> mo8282a(xt2 xt2, Context context, pt2 pt2, ou2<R, AdT> ou2) {
        hu2<R, AdT> hu2 = this.f8805a.get(xt2);
        if (hu2 != null) {
            return hu2;
        }
        ut2 ut2 = new ut2(au2.m6357c(xt2, context));
        hu2<R, AdT> hu22 = new hu2<>(ut2, new qu2(ut2, pt2, ou2));
        this.f8805a.put(xt2, hu22);
        return hu22;
    }
}
