package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

public final class es1 implements j80 {

    /* renamed from: f */
    private final dc1 f6350f;

    /* renamed from: g */
    private final yj0 f6351g;

    /* renamed from: h */
    private final String f6352h;

    /* renamed from: i */
    private final String f6353i;

    public es1(dc1 dc1, rr2 rr2) {
        this.f6350f = dc1;
        this.f6351g = rr2.f13907m;
        this.f6352h = rr2.f13904k;
        this.f6353i = rr2.f13906l;
    }

    /* renamed from: a */
    public final void mo7052a() {
        this.f6350f.mo6442b();
    }

    /* renamed from: c */
    public final void mo7053c() {
        this.f6350f.mo6440T0();
    }

    @ParametersAreNonnullByDefault
    /* renamed from: p0 */
    public final void mo7054p0(yj0 yj0) {
        int i;
        String str;
        yj0 yj02 = this.f6351g;
        if (yj02 != null) {
            yj0 = yj02;
        }
        if (yj0 != null) {
            str = yj0.f17763f;
            i = yj0.f17764g;
        } else {
            i = 1;
            str = "";
        }
        this.f6350f.mo6439S0(new jj0(str, i), this.f6352h, this.f6353i);
    }
}
