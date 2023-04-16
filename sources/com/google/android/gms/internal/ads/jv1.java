package com.google.android.gms.internal.ads;

public final class jv1 implements td1, lc1, ya1, xd1 {

    /* renamed from: f */
    private final sv1 f9270f;

    /* renamed from: g */
    private final cw1 f9271g;

    public jv1(sv1 sv1, cw1 cw1) {
        this.f9270f = sv1;
        this.f9271g = cw1;
    }

    /* renamed from: d */
    public final void mo7808d(C1605cv cvVar) {
        this.f9270f.mo10883a().put("action", "ftl");
        this.f9270f.mo10883a().put("ftl", String.valueOf(cvVar.f5529f));
        this.f9270f.mo10883a().put("ed", cvVar.f5531h);
        this.f9271g.mo7174b(this.f9270f.mo10883a());
    }

    /* renamed from: h */
    public final void mo8544h(boolean z) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10609s5)).booleanValue()) {
            this.f9270f.mo10883a().put("scar", "true");
        }
    }

    /* renamed from: m */
    public final void mo8445m() {
        this.f9270f.mo10883a().put("action", "loaded");
        this.f9271g.mo7174b(this.f9270f.mo10883a());
    }

    /* renamed from: n0 */
    public final void mo6025n0(vi0 vi0) {
        this.f9270f.mo10885c(vi0.f16310f);
    }

    /* renamed from: q */
    public final void mo6026q(ds2 ds2) {
        this.f9270f.mo10884b(ds2);
    }
}
