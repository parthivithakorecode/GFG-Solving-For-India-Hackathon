package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class ya3<V> extends bb3<V, List<V>> {
    ya3(z63<? extends cc3<? extends V>> z63, boolean z) {
        super(z63, true);
        mo10004U();
    }

    /* renamed from: X */
    public final /* bridge */ /* synthetic */ Object mo5766X(List list) {
        ArrayList a = x73.m19391a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            za3 za3 = (za3) it.next();
            a.add(za3 != null ? za3.f18138a : null);
        }
        return Collections.unmodifiableList(a);
    }
}
