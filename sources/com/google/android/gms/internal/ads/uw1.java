package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import p054h1.C2694t;
import p069j1.C3202r1;

public final class uw1 implements td1, C2420yu, va1, qb1, rb1, lc1, ya1, C1700fe, ow2 {

    /* renamed from: f */
    private final List<Object> f15784f;

    /* renamed from: g */
    private final iw1 f15785g;

    /* renamed from: h */
    private long f15786h;

    public uw1(iw1 iw1, bw0 bw0) {
        this.f15785g = iw1;
        this.f15784f = Collections.singletonList(bw0);
    }

    /* renamed from: B */
    private final void m18192B(Class<?> cls, String str, Object... objArr) {
        iw1 iw1 = this.f15785g;
        List<Object> list = this.f15784f;
        String simpleName = cls.getSimpleName();
        iw1.mo8285a(list, simpleName.length() != 0 ? "Event-".concat(simpleName) : new String("Event-"), str, objArr);
    }

    /* renamed from: L */
    public final void mo25L() {
        m18192B(C2420yu.class, "onAdClicked", new Object[0]);
    }

    /* renamed from: a */
    public final void mo5536a(gw2 gw2, String str) {
        m18192B(fw2.class, "onTaskSucceeded", str);
    }

    /* renamed from: b */
    public final void mo5537b(gw2 gw2, String str) {
        m18192B(fw2.class, "onTaskCreated", str);
    }

    /* renamed from: c */
    public final void mo7303c(String str, String str2) {
        m18192B(C1700fe.class, "onAppEvent", str, str2);
    }

    /* renamed from: d */
    public final void mo7808d(C1605cv cvVar) {
        m18192B(ya1.class, "onAdFailedToLoad", Integer.valueOf(cvVar.f5529f), cvVar.f5530g, cvVar.f5531h);
    }

    /* renamed from: e */
    public final void mo5297e() {
        m18192B(va1.class, "onRewardedVideoCompleted", new Object[0]);
    }

    /* renamed from: f */
    public final void mo5651f(Context context) {
        m18192B(rb1.class, "onResume", context);
    }

    @ParametersAreNonnullByDefault
    /* renamed from: h */
    public final void mo5298h(mj0 mj0, String str, String str2) {
        m18192B(va1.class, "onRewarded", mj0, str, str2);
    }

    /* renamed from: i */
    public final void mo5299i() {
        m18192B(va1.class, "onAdClosed", new Object[0]);
    }

    /* renamed from: k */
    public final void mo5153k() {
        m18192B(qb1.class, "onAdImpression", new Object[0]);
    }

    /* renamed from: m */
    public final void mo8445m() {
        long b = C2694t.m21592a().mo12463b();
        long j = this.f15786h;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Ad Request Latency : ");
        sb.append(b - j);
        C3202r1.m24015k(sb.toString());
        m18192B(lc1.class, "onAdLoaded", new Object[0]);
    }

    /* renamed from: n */
    public final void mo5300n() {
        m18192B(va1.class, "onAdOpened", new Object[0]);
    }

    /* renamed from: n0 */
    public final void mo6025n0(vi0 vi0) {
        this.f15786h = C2694t.m21592a().mo12463b();
        m18192B(td1.class, "onAdRequest", new Object[0]);
    }

    /* renamed from: o */
    public final void mo5301o() {
        m18192B(va1.class, "onAdLeftApplication", new Object[0]);
    }

    /* renamed from: q */
    public final void mo6026q(ds2 ds2) {
    }

    /* renamed from: r */
    public final void mo5654r(Context context) {
        m18192B(rb1.class, "onPause", context);
    }

    /* renamed from: s */
    public final void mo5538s(gw2 gw2, String str) {
        m18192B(fw2.class, "onTaskStarted", str);
    }

    /* renamed from: t */
    public final void mo5302t() {
        m18192B(va1.class, "onRewardedVideoStarted", new Object[0]);
    }

    /* renamed from: y */
    public final void mo5656y(Context context) {
        m18192B(rb1.class, "onDestroy", context);
    }

    /* renamed from: z */
    public final void mo5539z(gw2 gw2, String str, Throwable th) {
        m18192B(fw2.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }
}
