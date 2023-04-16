package com.google.android.gms.internal.ads;

import android.content.Context;

final class iz0 implements vp2 {

    /* renamed from: a */
    private final b01 f8871a;

    /* renamed from: b */
    private final iz0 f8872b = this;

    /* renamed from: c */
    private final yv3<Context> f8873c;

    /* renamed from: d */
    private final yv3<C2087pv> f8874d;

    /* renamed from: e */
    private final yv3<String> f8875e;

    /* renamed from: f */
    private final yv3<lc2> f8876f;

    /* renamed from: g */
    private final yv3<tq2> f8877g;

    /* renamed from: h */
    private final yv3<sp2> f8878h;

    /* renamed from: i */
    private final yv3<uc2> f8879i;

    /* synthetic */ iz0(b01 b01, Context context, String str, C2087pv pvVar, hz0 hz0) {
        this.f8871a = b01;
        kv3 b = lv3.m12941b(context);
        this.f8873c = b;
        kv3 b2 = lv3.m12941b(pvVar);
        this.f8874d = b2;
        kv3 b3 = lv3.m12941b(str);
        this.f8875e = b3;
        yv3<lc2> c = jv3.m11856c(new mc2(b01.f4604p));
        this.f8876f = c;
        yv3<tq2> c2 = jv3.m11856c(new uq2(b01.f4617v0));
        this.f8877g = c2;
        kv3 kv3 = b;
        yv3<sp2> c3 = jv3.m11856c(new tp2(kv3, b01.f4606q, b01.f4564P, c, c2, ms2.m13476b()));
        this.f8878h = c3;
        this.f8879i = jv3.m11856c(new vc2(kv3, b2, b3, c3, c, c2));
    }

    public final uc2 zza() {
        return this.f8879i.mo5051a();
    }
}
