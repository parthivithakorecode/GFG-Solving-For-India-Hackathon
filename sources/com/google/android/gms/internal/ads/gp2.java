package com.google.android.gms.internal.ads;

import android.content.Context;
import p054h1.C2694t;

public final class gp2 {
    /* renamed from: a */
    static ep2<h41, m41> m9859a(Context context, pt2 pt2, iu2 iu2) {
        return m9861c(context, pt2, iu2);
    }

    /* renamed from: b */
    static ep2<v31, c41> m9860b(Context context, pt2 pt2, iu2 iu2) {
        return m9861c(context, pt2, iu2);
    }

    /* renamed from: c */
    private static <AppOpenAdRequestComponent extends ea1<AppOpenAd>, AppOpenAd extends v61> ep2<AppOpenAdRequestComponent, AppOpenAd> m9861c(Context context, pt2 pt2, iu2 iu2) {
        on0 e = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10334M4)).booleanValue() ? C2694t.m21607p().mo11025h().mo14084e() : C2694t.m21607p().mo11025h().mo14085f();
        boolean z = false;
        if (e != null && e.mo9806h()) {
            z = true;
        }
        if (((Integer) C2199sw.m17001c().mo8579b(m10.f10465c5)).intValue() > 0) {
            if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10326L4)).booleanValue() || z) {
                hu2 a = iu2.mo8282a(xt2.AppOpen, context, pt2, new ho2(new eo2()));
                to2 to2 = new to2(new so2());
                tt2 tt2 = a.f8427a;
                dc3 dc3 = wo0.f16886a;
                return new jo2(to2, new po2(tt2, dc3), a.f8428b, a.f8427a.zza().f4357m, dc3);
            }
        }
        return new so2();
    }
}
