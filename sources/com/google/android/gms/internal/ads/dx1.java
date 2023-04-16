package com.google.android.gms.internal.ads;

public final class dx1 {

    /* renamed from: a */
    private final n80 f5963a;

    dx1(n80 n80) {
        this.f5963a = n80;
    }

    /* renamed from: s */
    private final void m8133s(cx1 cx1) {
        String a = cx1.m7593a(cx1);
        io0.m11130f(a.length() != 0 ? "Dispatching AFMA event on publisher webview: ".concat(a) : new String("Dispatching AFMA event on publisher webview: "));
        this.f5963a.mo8904s(a);
    }

    /* renamed from: a */
    public final void mo6690a() {
        m8133s(new cx1("initialize", (bx1) null));
    }

    /* renamed from: b */
    public final void mo6691b(long j) {
        cx1 cx1 = new cx1("interstitial", (bx1) null);
        cx1.f5547a = Long.valueOf(j);
        cx1.f5549c = "onAdClicked";
        this.f5963a.mo8904s(cx1.m7593a(cx1));
    }

    /* renamed from: c */
    public final void mo6692c(long j) {
        cx1 cx1 = new cx1("interstitial", (bx1) null);
        cx1.f5547a = Long.valueOf(j);
        cx1.f5549c = "onAdClosed";
        m8133s(cx1);
    }

    /* renamed from: d */
    public final void mo6693d(long j, int i) {
        cx1 cx1 = new cx1("interstitial", (bx1) null);
        cx1.f5547a = Long.valueOf(j);
        cx1.f5549c = "onAdFailedToLoad";
        cx1.f5550d = Integer.valueOf(i);
        m8133s(cx1);
    }

    /* renamed from: e */
    public final void mo6694e(long j) {
        cx1 cx1 = new cx1("interstitial", (bx1) null);
        cx1.f5547a = Long.valueOf(j);
        cx1.f5549c = "onAdLoaded";
        m8133s(cx1);
    }

    /* renamed from: f */
    public final void mo6695f(long j) {
        cx1 cx1 = new cx1("interstitial", (bx1) null);
        cx1.f5547a = Long.valueOf(j);
        cx1.f5549c = "onNativeAdObjectNotAvailable";
        m8133s(cx1);
    }

    /* renamed from: g */
    public final void mo6696g(long j) {
        cx1 cx1 = new cx1("interstitial", (bx1) null);
        cx1.f5547a = Long.valueOf(j);
        cx1.f5549c = "onAdOpened";
        m8133s(cx1);
    }

    /* renamed from: h */
    public final void mo6697h(long j) {
        cx1 cx1 = new cx1("creation", (bx1) null);
        cx1.f5547a = Long.valueOf(j);
        cx1.f5549c = "nativeObjectCreated";
        m8133s(cx1);
    }

    /* renamed from: i */
    public final void mo6698i(long j) {
        cx1 cx1 = new cx1("creation", (bx1) null);
        cx1.f5547a = Long.valueOf(j);
        cx1.f5549c = "nativeObjectNotCreated";
        m8133s(cx1);
    }

    /* renamed from: j */
    public final void mo6699j(long j) {
        cx1 cx1 = new cx1("rewarded", (bx1) null);
        cx1.f5547a = Long.valueOf(j);
        cx1.f5549c = "onAdClicked";
        m8133s(cx1);
    }

    /* renamed from: k */
    public final void mo6700k(long j) {
        cx1 cx1 = new cx1("rewarded", (bx1) null);
        cx1.f5547a = Long.valueOf(j);
        cx1.f5549c = "onRewardedAdClosed";
        m8133s(cx1);
    }

    /* renamed from: l */
    public final void mo6701l(long j, ck0 ck0) {
        cx1 cx1 = new cx1("rewarded", (bx1) null);
        cx1.f5547a = Long.valueOf(j);
        cx1.f5549c = "onUserEarnedReward";
        cx1.f5551e = ck0.mo5307d();
        cx1.f5552f = Integer.valueOf(ck0.mo5306b());
        m8133s(cx1);
    }

    /* renamed from: m */
    public final void mo6702m(long j, int i) {
        cx1 cx1 = new cx1("rewarded", (bx1) null);
        cx1.f5547a = Long.valueOf(j);
        cx1.f5549c = "onRewardedAdFailedToLoad";
        cx1.f5550d = Integer.valueOf(i);
        m8133s(cx1);
    }

    /* renamed from: n */
    public final void mo6703n(long j, int i) {
        cx1 cx1 = new cx1("rewarded", (bx1) null);
        cx1.f5547a = Long.valueOf(j);
        cx1.f5549c = "onRewardedAdFailedToShow";
        cx1.f5550d = Integer.valueOf(i);
        m8133s(cx1);
    }

    /* renamed from: o */
    public final void mo6704o(long j) {
        cx1 cx1 = new cx1("rewarded", (bx1) null);
        cx1.f5547a = Long.valueOf(j);
        cx1.f5549c = "onAdImpression";
        m8133s(cx1);
    }

    /* renamed from: p */
    public final void mo6705p(long j) {
        cx1 cx1 = new cx1("rewarded", (bx1) null);
        cx1.f5547a = Long.valueOf(j);
        cx1.f5549c = "onRewardedAdLoaded";
        m8133s(cx1);
    }

    /* renamed from: q */
    public final void mo6706q(long j) {
        cx1 cx1 = new cx1("rewarded", (bx1) null);
        cx1.f5547a = Long.valueOf(j);
        cx1.f5549c = "onNativeAdObjectNotAvailable";
        m8133s(cx1);
    }

    /* renamed from: r */
    public final void mo6707r(long j) {
        cx1 cx1 = new cx1("rewarded", (bx1) null);
        cx1.f5547a = Long.valueOf(j);
        cx1.f5549c = "onRewardedAdOpened";
        m8133s(cx1);
    }
}
