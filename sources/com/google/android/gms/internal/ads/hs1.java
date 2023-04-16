package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import p054h1.C2694t;
import p069j1.C3163g2;

public final class hs1 extends v61 {

    /* renamed from: i */
    private final Context f8396i;

    /* renamed from: j */
    private final WeakReference<eu0> f8397j;

    /* renamed from: k */
    private final pk1 f8398k;

    /* renamed from: l */
    private final yh1 f8399l;

    /* renamed from: m */
    private final jb1 f8400m;

    /* renamed from: n */
    private final rc1 f8401n;

    /* renamed from: o */
    private final q71 f8402o;

    /* renamed from: p */
    private final ck0 f8403p;

    /* renamed from: q */
    private final f13 f8404q;

    /* renamed from: r */
    private boolean f8405r = false;

    hs1(u61 u61, Context context, eu0 eu0, pk1 pk1, yh1 yh1, jb1 jb1, rc1 rc1, q71 q71, rr2 rr2, f13 f13) {
        super(u61);
        this.f8396i = context;
        this.f8398k = pk1;
        this.f8397j = new WeakReference<>(eu0);
        this.f8399l = yh1;
        this.f8400m = jb1;
        this.f8401n = rc1;
        this.f8402o = q71;
        this.f8404q = f13;
        yj0 yj0 = rr2.f13907m;
        this.f8403p = new wk0(yj0 != null ? yj0.f17763f : "", yj0 != null ? yj0.f17764g : 1);
    }

    public final void finalize() {
        try {
            eu0 eu0 = (eu0) this.f8397j.get();
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10501g5)).booleanValue()) {
                if (!this.f8405r && eu0 != null) {
                    wo0.f16890e.execute(new gs1(eu0));
                }
            } else if (eu0 != null) {
                eu0.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: h */
    public final Bundle mo8003h() {
        return this.f8401n.mo10502S0();
    }

    /* renamed from: i */
    public final ck0 mo8004i() {
        return this.f8403p;
    }

    /* renamed from: j */
    public final boolean mo8005j() {
        return this.f8402o.mo10252c();
    }

    /* renamed from: k */
    public final boolean mo8006k() {
        return this.f8405r;
    }

    /* renamed from: l */
    public final boolean mo8007l() {
        eu0 eu0 = (eu0) this.f8397j.get();
        return eu0 != null && !eu0.mo7108b1();
    }

    /* renamed from: m */
    public final boolean mo8008m(boolean z, Activity activity) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10620u0)).booleanValue()) {
            C2694t.m21608q();
            if (C3163g2.m23935k(this.f8396i)) {
                io0.m11131g("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f8400m.mo8023a();
                if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10628v0)).booleanValue()) {
                    this.f8404q.mo7215a(this.f15921a.f5904b.f5509b.f15729b);
                }
                return false;
            }
        }
        if (this.f8405r) {
            io0.m11131g("The rewarded ad have been showed.");
            this.f8400m.mo8025d(dt2.m8099d(10, (String) null, (C1605cv) null));
            return false;
        }
        this.f8405r = true;
        this.f8399l.mo12022a();
        Context context = activity;
        if (activity == null) {
            context = this.f8396i;
        }
        try {
            this.f8398k.mo6852a(z, context, this.f8400m);
            this.f8399l.zza();
            return true;
        } catch (ok1 e) {
            this.f8400m.mo8027q0(e);
            return false;
        }
    }
}
