package com.google.android.gms.internal.ads;

import p102o.C3801a;

public final class no1 implements qb1 {

    /* renamed from: f */
    private final rm1 f11571f;

    /* renamed from: g */
    private final wm1 f11572g;

    public no1(rm1 rm1, wm1 wm1) {
        this.f11571f = rm1;
        this.f11572g = wm1;
    }

    /* renamed from: k */
    public final void mo5153k() {
        if (this.f11571f.mo10577c0() != null) {
            eu0 Y = this.f11571f.mo10571Y();
            eu0 Z = this.f11571f.mo10572Z();
            if (Y == null) {
                Y = Z != null ? Z : null;
            }
            if (this.f11572g.mo11495c() && Y != null) {
                Y.mo6424t("onSdkImpression", new C3801a());
            }
        }
    }
}
