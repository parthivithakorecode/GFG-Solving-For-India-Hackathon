package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

public final /* synthetic */ class kj2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f9548a;

    /* renamed from: b */
    public final /* synthetic */ Object f9549b;

    public /* synthetic */ kj2(List list, Object obj) {
        this.f9548a = list;
        this.f9549b = obj;
    }

    public final Object call() {
        List<cc3> list = this.f9548a;
        Object obj = this.f9549b;
        for (cc3 cc3 : list) {
            hj2 hj2 = (hj2) cc3.get();
            if (hj2 != null) {
                hj2.mo5248c(obj);
            }
        }
        return obj;
    }
}
