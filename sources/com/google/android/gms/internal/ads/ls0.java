package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ls0 implements Iterable<ks0> {

    /* renamed from: f */
    private final List<ks0> f10136f = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final ks0 mo9009h(tq0 tq0) {
        Iterator<ks0> it = iterator();
        while (it.hasNext()) {
            ks0 next = it.next();
            if (next.f9632c == tq0) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    public final void mo9010i(ks0 ks0) {
        this.f10136f.add(ks0);
    }

    public final Iterator<ks0> iterator() {
        return this.f10136f.iterator();
    }

    /* renamed from: j */
    public final void mo9012j(ks0 ks0) {
        this.f10136f.remove(ks0);
    }

    /* renamed from: k */
    public final boolean mo9013k(tq0 tq0) {
        ArrayList<ks0> arrayList = new ArrayList<>();
        Iterator<ks0> it = iterator();
        while (it.hasNext()) {
            ks0 next = it.next();
            if (next.f9632c == tq0) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (ks0 ks0 : arrayList) {
            ks0.f9633d.mo6288g();
        }
        return true;
    }
}
