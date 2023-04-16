package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p054h1.C2676b;
import p054h1.C2694t;

public final class lq1 {

    /* renamed from: a */
    private final ks2 f10119a;

    /* renamed from: b */
    private final Executor f10120b;

    /* renamed from: c */
    private final et1 f10121c;

    /* renamed from: d */
    private final yr1 f10122d;

    /* renamed from: e */
    private final Context f10123e;

    /* renamed from: f */
    private final wv1 f10124f;

    /* renamed from: g */
    private final xw2 f10125g;

    /* renamed from: h */
    private final cy2 f10126h;

    /* renamed from: i */
    private final o42 f10127i;

    public lq1(ks2 ks2, Executor executor, et1 et1, Context context, wv1 wv1, xw2 xw2, cy2 cy2, o42 o42, yr1 yr1) {
        this.f10119a = ks2;
        this.f10120b = executor;
        this.f10121c = et1;
        this.f10123e = context;
        this.f10124f = wv1;
        this.f10125g = xw2;
        this.f10126h = cy2;
        this.f10127i = o42;
        this.f10122d = yr1;
    }

    /* renamed from: h */
    private final void m12813h(eu0 eu0) {
        m12814i(eu0);
        eu0.mo7080F0("/video", s70.f14303l);
        eu0.mo7080F0("/videoMeta", s70.f14304m);
        eu0.mo7080F0("/precache", new us0());
        eu0.mo7080F0("/delayPageLoaded", s70.f14307p);
        eu0.mo7080F0("/instrument", s70.f14305n);
        eu0.mo7080F0("/log", s70.f14298g);
        eu0.mo7080F0("/click", s70.m16640a((pi1) null));
        if (this.f10119a.f9637b != null) {
            eu0.mo7077D0().mo9066t0(true);
            eu0.mo7080F0("/open", new f80((C2676b) null, (yf0) null, (o42) null, (wv1) null, (xw2) null));
        } else {
            eu0.mo7077D0().mo9066t0(false);
        }
        if (C2694t.m21606o().mo10109z(eu0.getContext())) {
            eu0.mo7080F0("/logScionEvent", new z70(eu0.getContext()));
        }
    }

    /* renamed from: i */
    private static final void m12814i(eu0 eu0) {
        eu0.mo7080F0("/videoClicked", s70.f14299h);
        eu0.mo7077D0().mo9035U0(true);
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10597r2)).booleanValue()) {
            eu0.mo7080F0("/getNativeAdViewSignals", s70.f14310s);
        }
        eu0.mo7080F0("/getNativeClickMeta", s70.f14311t);
    }

    /* renamed from: a */
    public final cc3<eu0> mo8990a(JSONObject jSONObject) {
        return rb3.m16136n(rb3.m16136n(rb3.m16131i(null), new dq1(this), this.f10120b), new fq1(this, jSONObject), this.f10120b);
    }

    /* renamed from: b */
    public final cc3<eu0> mo8991b(String str, String str2, rr2 rr2, ur2 ur2, C2087pv pvVar) {
        return rb3.m16136n(rb3.m16131i(null), new eq1(this, pvVar, rr2, ur2, str, str2), this.f10120b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ cc3 mo8992c(JSONObject jSONObject, eu0 eu0) {
        ap0 g = ap0.m6161g(eu0);
        eu0.mo7115g0(this.f10119a.f9637b != null ? vv0.m18689d() : vv0.m18690e());
        eu0.mo7077D0().mo9048f1(new aq1(this, eu0, g));
        eu0.mo9998c1("google.afma.nativeAds.renderVideo", jSONObject);
        return g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ cc3 mo8993d(C2087pv pvVar, rr2 rr2, ur2 ur2, String str, String str2, Object obj) {
        eu0 a = this.f10121c.mo7072a(pvVar, rr2, ur2);
        ap0 g = ap0.m6161g(a);
        if (this.f10119a.f9637b != null) {
            m12813h(a);
            a.mo7115g0(vv0.m18689d());
        } else {
            vr1 b = this.f10122d.mo12079b();
            vr1 vr1 = b;
            tv0 D0 = a.mo7077D0();
            C2676b bVar = r3;
            C2676b bVar2 = new C2676b(this.f10123e, (ml0) null, (ji0) null);
            D0.mo9053k0(b, vr1, b, b, b, false, (w70) null, bVar, (fg0) null, (ml0) null, this.f10127i, this.f10126h, this.f10124f, this.f10125g, (u70) null, b);
            m12814i(a);
        }
        a.mo7077D0().mo9048f1(new bq1(this, a, g));
        a.mo7098P(str, str2, (String) null);
        return g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ cc3 mo8994e(Object obj) {
        eu0 a = this.f10121c.mo7072a(C2087pv.m15287e(), (rr2) null, (ur2) null);
        ap0 g = ap0.m6161g(a);
        m12813h(a);
        a.mo7077D0().mo9039Z0(new cq1(g));
        a.loadUrl((String) C2199sw.m17001c().mo8579b(m10.f10588q2));
        return g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo8995f(eu0 eu0, ap0 ap0, boolean z) {
        if (!(this.f10119a.f9636a == null || eu0.mo7139p() == null)) {
            eu0.mo7139p().mo5962D5(this.f10119a.f9636a);
        }
        ap0.mo5355h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo8996g(eu0 eu0, ap0 ap0, boolean z) {
        if (z) {
            if (!(this.f10119a.f9636a == null || eu0.mo7139p() == null)) {
                eu0.mo7139p().mo5962D5(this.f10119a.f9636a);
            }
            ap0.mo5355h();
            return;
        }
        ap0.mo5908f(new u82(1, "Html video Web View failed to load."));
    }
}
