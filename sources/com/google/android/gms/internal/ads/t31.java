package com.google.android.gms.internal.ads;

public final class t31 {

    /* renamed from: a */
    private final xw2 f14692a;

    /* renamed from: b */
    private final wv1 f14693b;

    /* renamed from: c */
    private final ds2 f14694c;

    public t31(wv1 wv1, ds2 ds2, xw2 xw2) {
        this.f14692a = xw2;
        this.f14693b = wv1;
        this.f14694c = ds2;
    }

    /* renamed from: b */
    private static String m17082b(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    /* renamed from: a */
    public final void mo10934a(long j, int i) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10592q6)).booleanValue()) {
            xw2 xw2 = this.f14692a;
            ww2 b = ww2.m19233b("ad_closed");
            b.mo11746g(this.f14694c.f5904b.f5509b);
            b.mo11742a("show_time", String.valueOf(j));
            b.mo11742a("ad_format", "app_open_ad");
            b.mo11742a("acr", m17082b(i));
            xw2.mo5981a(b);
            return;
        }
        vv1 a = this.f14693b.mo11740a();
        a.mo11535d(this.f14694c.f5904b.f5509b);
        a.mo11533b("action", "ad_closed");
        a.mo11533b("show_time", String.valueOf(j));
        a.mo11533b("ad_format", "app_open_ad");
        a.mo11533b("acr", m17082b(i));
        a.mo11537f();
    }
}
