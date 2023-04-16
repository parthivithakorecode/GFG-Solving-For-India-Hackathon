package com.google.android.gms.internal.ads;

public final class w22 implements td1, lc1, ya1, xd1 {

    /* renamed from: f */
    private final ww2 f16665f;

    /* renamed from: g */
    private final xw2 f16666g;

    /* renamed from: h */
    private final xn0 f16667h;

    public w22(ww2 ww2, xw2 xw2, xn0 xn0) {
        this.f16665f = ww2;
        this.f16666g = xw2;
        this.f16667h = xn0;
    }

    /* renamed from: d */
    public final void mo7808d(C1605cv cvVar) {
        ww2 ww2 = this.f16665f;
        ww2.mo11742a("action", "ftl");
        ww2.mo11742a("ftl", String.valueOf(cvVar.f5529f));
        ww2.mo11742a("ed", cvVar.f5531h);
        this.f16666g.mo5981a(this.f16665f);
    }

    /* renamed from: h */
    public final void mo8544h(boolean z) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10609s5)).booleanValue()) {
            this.f16665f.mo11742a("scar", "true");
        }
    }

    /* renamed from: m */
    public final void mo8445m() {
        xw2 xw2 = this.f16666g;
        ww2 ww2 = this.f16665f;
        ww2.mo11742a("action", "loaded");
        xw2.mo5981a(ww2);
    }

    /* renamed from: n0 */
    public final void mo6025n0(vi0 vi0) {
        this.f16665f.mo11748i(vi0.f16310f);
    }

    /* renamed from: q */
    public final void mo6026q(ds2 ds2) {
        this.f16665f.mo11747h(ds2, this.f16667h);
    }
}
