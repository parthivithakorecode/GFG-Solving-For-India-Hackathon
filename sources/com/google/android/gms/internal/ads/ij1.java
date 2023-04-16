package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;
import p054h1.C2694t;
import p069j1.C3163g2;

public final class ij1 extends v61 {

    /* renamed from: i */
    private final Context f8666i;

    /* renamed from: j */
    private final WeakReference<eu0> f8667j;

    /* renamed from: k */
    private final yh1 f8668k;

    /* renamed from: l */
    private final pk1 f8669l;

    /* renamed from: m */
    private final q71 f8670m;

    /* renamed from: n */
    private final f13 f8671n;

    /* renamed from: o */
    private final jb1 f8672o;

    /* renamed from: p */
    private boolean f8673p = false;

    ij1(u61 u61, Context context, @Nullable eu0 eu0, yh1 yh1, pk1 pk1, q71 q71, f13 f13, jb1 jb1) {
        super(u61);
        this.f8666i = context;
        this.f8667j = new WeakReference<>(eu0);
        this.f8668k = yh1;
        this.f8669l = pk1;
        this.f8670m = q71;
        this.f8671n = f13;
        this.f8672o = jb1;
    }

    public final void finalize() {
        try {
            eu0 eu0 = (eu0) this.f8667j.get();
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10501g5)).booleanValue()) {
                if (!this.f8673p && eu0 != null) {
                    wo0.f16890e.execute(new hj1(eu0));
                }
            } else if (eu0 != null) {
                eu0.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: h */
    public final boolean mo8149h() {
        return this.f8670m.mo10252c();
    }

    /* renamed from: i */
    public final boolean mo8150i(boolean z, @Nullable Activity activity) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10620u0)).booleanValue()) {
            C2694t.m21608q();
            if (C3163g2.m23935k(this.f8666i)) {
                io0.m11131g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f8672o.mo8023a();
                if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10628v0)).booleanValue()) {
                    this.f8671n.mo7215a(this.f15921a.f5904b.f5509b.f15729b);
                }
                return false;
            }
        }
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10521i7)).booleanValue() && this.f8673p) {
            io0.m11131g("The interstitial ad has been showed.");
            this.f8672o.mo8025d(dt2.m8099d(10, (String) null, (C1605cv) null));
        }
        if (!this.f8673p) {
            this.f8668k.mo12022a();
            Context context = activity;
            if (activity == null) {
                context = this.f8666i;
            }
            try {
                this.f8669l.mo6852a(z, context, this.f8672o);
                this.f8668k.zza();
                this.f8673p = true;
                return true;
            } catch (ok1 e) {
                this.f8672o.mo8027q0(e);
            }
        }
        return false;
    }
}
