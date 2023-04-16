package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

public final class kw0 implements kv3<Set<hi1<vh1>>> {

    /* renamed from: a */
    private final yv3<y22> f9695a;

    /* renamed from: b */
    private final yv3<Executor> f9696b;

    public kw0(yv3<y22> yv3, yv3<Executor> yv32) {
        this.f9695a = yv3;
        this.f9696b = yv32;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        Set set;
        y22 a = this.f9695a.mo5051a();
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10645x1)).booleanValue()) {
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10592q6)).booleanValue()) {
                set = Collections.singleton(new hi1(a, dc3));
                sv3.m16997b(set);
                return set;
            }
        }
        set = Collections.emptySet();
        sv3.m16997b(set);
        return set;
    }
}
