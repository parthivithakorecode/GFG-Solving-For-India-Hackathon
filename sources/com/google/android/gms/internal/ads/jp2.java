package com.google.android.gms.internal.ads;

import android.content.Context;
import p054h1.C2694t;

public final class jp2 implements kv3<ep2<ms1, hs1>> {

    /* renamed from: a */
    private final yv3<Context> f9217a;

    /* renamed from: b */
    private final yv3<pt2> f9218b;

    /* renamed from: c */
    private final yv3<iu2> f9219c;

    public jp2(yv3<Context> yv3, yv3<pt2> yv32, yv3<iu2> yv33) {
        this.f9217a = yv3;
        this.f9218b = yv32;
        this.f9219c = yv33;
    }

    /* renamed from: b */
    public final ep2<ms1, hs1> mo5051a() {
        Context a = this.f9217a.mo5051a();
        pt2 a2 = this.f9218b.mo5051a();
        iu2 a3 = this.f9219c.mo5051a();
        on0 e = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10334M4)).booleanValue() ? C2694t.m21607p().mo11025h().mo14084e() : C2694t.m21607p().mo11025h().mo14085f();
        boolean z = false;
        if (e != null && e.mo9806h()) {
            z = true;
        }
        if (((Integer) C2199sw.m17001c().mo8579b(m10.f10350O4)).intValue() > 0) {
            if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10326L4)).booleanValue() || z) {
                hu2 a4 = a3.mo8282a(xt2.Rewarded, a, a2, new ho2(new eo2()));
                to2 to2 = new to2(new so2());
                tt2 tt2 = a4.f8427a;
                dc3 dc3 = wo0.f16886a;
                return new jo2(to2, new po2(tt2, dc3), a4.f8428b, a4.f8427a.zza().f4357m, dc3);
            }
        }
        return new so2();
    }
}
