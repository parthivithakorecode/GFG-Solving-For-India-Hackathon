package com.google.android.gms.internal.ads;

import java.util.Map;

public final class h12 implements j12 {

    /* renamed from: a */
    private final Map<String, yv3<j12>> f7949a;

    /* renamed from: b */
    private final dc3 f7950b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final rd1 f7951c;

    public h12(Map<String, yv3<j12>> map, dc3 dc3, rd1 rd1) {
        this.f7949a = map;
        this.f7950b = dc3;
        this.f7951c = rd1;
    }

    /* renamed from: a */
    public final cc3<ds2> mo7780a(vi0 vi0) {
        this.f7951c.mo6025n0(vi0);
        cc3<ds2> h = rb3.m16130h(new fz1(3));
        for (String trim : ((String) C2199sw.m17001c().mo8579b(m10.f10431Y5)).split(",")) {
            yv3 yv3 = this.f7949a.get(trim.trim());
            if (yv3 != null) {
                h = rb3.m16129g(h, fz1.class, new f12(yv3, vi0), this.f7950b);
            }
        }
        rb3.m16140r(h, new g12(this), wo0.f16891f);
        return h;
    }
}
