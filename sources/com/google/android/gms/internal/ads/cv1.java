package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class cv1 implements kv3<Set<hi1<ow2>>> {

    /* renamed from: a */
    private final yv3<String> f5534a;

    /* renamed from: b */
    private final yv3<Context> f5535b;

    /* renamed from: c */
    private final yv3<Executor> f5536c;

    /* renamed from: d */
    private final yv3<Map<gw2, ev1>> f5537d;

    public cv1(yv3<String> yv3, yv3<Context> yv32, yv3<Executor> yv33, yv3<Map<gw2, ev1>> yv34) {
        this.f5534a = yv3;
        this.f5535b = yv32;
        this.f5536c = yv33;
        this.f5537d = yv34;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5051a() {
        Set set;
        String b = ((nl2) this.f5534a).mo9549b();
        Context b2 = ((gw0) this.f5535b).mo7719b();
        dc3 dc3 = wo0.f16886a;
        sv3.m16997b(dc3);
        Map d = ((ov3) this.f5537d).mo5051a();
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10631v3)).booleanValue()) {
            C1527ar arVar = new C1527ar(new C1713fr(b2));
            arVar.mo5402b(new dv1(b));
            set = Collections.singleton(new hi1(new fv1(arVar, d), dc3));
        } else {
            set = Collections.emptySet();
        }
        sv3.m16997b(set);
        return set;
    }
}
