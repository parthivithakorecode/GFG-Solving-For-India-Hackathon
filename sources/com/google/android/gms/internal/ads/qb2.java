package com.google.android.gms.internal.ads;

import android.content.Context;

public final class qb2 extends C1719fx {

    /* renamed from: f */
    private final xc2 f13118f;

    public qb2(Context context, bw0 bw0, is2 is2, cn1 cn1, C2459zw zwVar) {
        zc2 zc2 = new zc2(cn1, bw0.mo5596D());
        zc2.mo12205e(zwVar);
        this.f13118f = new xc2(new jd2(bw0, context, zc2, is2), is2.mo8267h());
    }

    /* renamed from: N1 */
    public final void mo6010N1(C1902kv kvVar) {
        this.f13118f.mo11796d(kvVar, 1);
    }

    /* renamed from: b */
    public final synchronized String mo6011b() {
        return this.f13118f.mo11794a();
    }

    /* renamed from: d */
    public final synchronized String mo6012d() {
        return this.f13118f.mo11795b();
    }

    /* renamed from: h */
    public final synchronized boolean mo6013h() {
        return this.f13118f.mo11797e();
    }

    /* renamed from: i1 */
    public final synchronized void mo6014i1(C1902kv kvVar, int i) {
        this.f13118f.mo11796d(kvVar, i);
    }
}
