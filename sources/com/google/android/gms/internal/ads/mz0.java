package com.google.android.gms.internal.ads;

import android.content.Context;

final class mz0 implements lr2 {

    /* renamed from: a */
    private final b01 f11196a;

    /* renamed from: b */
    private final mz0 f11197b = this;

    /* renamed from: c */
    private final yv3<Context> f11198c;

    /* renamed from: d */
    private final yv3<ep2<ms1, hs1>> f11199d;

    /* renamed from: e */
    private final yv3<tq2> f11200e;

    /* renamed from: f */
    private final yv3<fs2> f11201f;

    /* renamed from: g */
    private final yv3<er2> f11202g;

    /* renamed from: h */
    private final yv3<or2> f11203h;

    /* renamed from: i */
    private final yv3<String> f11204i;

    /* renamed from: j */
    private final yv3<ir2> f11205j;

    /* synthetic */ mz0(b01 b01, Context context, String str, lz0 lz0) {
        this.f11196a = b01;
        kv3 b = lv3.m12941b(context);
        this.f11198c = b;
        jp2 jp2 = new jp2(b, b01.f4617v0, b01.f4619w0);
        this.f11199d = jp2;
        yv3<tq2> c = jv3.m11856c(new uq2(b01.f4617v0));
        this.f11200e = c;
        yv3<fs2> c2 = jv3.m11856c(hs2.m10758b());
        this.f11201f = c2;
        yv3<er2> c3 = jv3.m11856c(new fr2(b, b01.f4606q, b01.f4564P, jp2, c, ms2.m13476b(), c2));
        this.f11202g = c3;
        this.f11203h = jv3.m11856c(new pr2(c3, c, c2));
        kv3 c4 = lv3.m12942c(str);
        this.f11204i = c4;
        this.f11205j = jv3.m11856c(new jr2(c4, c3, b, c, c2));
    }

    /* renamed from: a */
    public final or2 mo9007a() {
        return this.f11203h.mo5051a();
    }

    public final ir2 zza() {
        return this.f11205j.mo5051a();
    }
}
