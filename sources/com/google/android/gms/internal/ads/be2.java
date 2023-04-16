package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

final class be2 implements ij2<hj2<Bundle>> {

    /* renamed from: a */
    private final Set<String> f4875a;

    be2(Set<String> set) {
        this.f4875a = set;
    }

    /* renamed from: a */
    public final cc3<hj2<Bundle>> mo5813a() {
        ArrayList arrayList = new ArrayList();
        for (String add : this.f4875a) {
            arrayList.add(add);
        }
        return rb3.m16131i(new ae2(arrayList));
    }
}
