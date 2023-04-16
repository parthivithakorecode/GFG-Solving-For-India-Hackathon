package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import p048g2.C2635a;
import p054h1.C2694t;
import p061i1.C2818q;
import p102o.C3801a;

public final class qk1 implements lc1, C2818q {

    /* renamed from: f */
    private final Context f13217f;

    /* renamed from: g */
    private final eu0 f13218g;

    /* renamed from: h */
    private final rr2 f13219h;

    /* renamed from: i */
    private final po0 f13220i;

    /* renamed from: j */
    private final C1861jr f13221j;

    /* renamed from: k */
    C2635a f13222k;

    public qk1(Context context, eu0 eu0, rr2 rr2, po0 po0, C1861jr jrVar) {
        this.f13217f = context;
        this.f13218g = eu0;
        this.f13219h = rr2;
        this.f13220i = po0;
        this.f13221j = jrVar;
    }

    /* renamed from: D */
    public final void mo5643D(int i) {
        this.f13222k = null;
    }

    /* renamed from: M3 */
    public final void mo5644M3() {
    }

    /* renamed from: Z2 */
    public final void mo5645Z2() {
    }

    /* renamed from: a */
    public final void mo5646a() {
        eu0 eu0;
        if (this.f13222k != null && (eu0 = this.f13218g) != null) {
            eu0.mo6424t("onSdkImpression", new C3801a());
        }
    }

    /* renamed from: b */
    public final void mo5647b() {
    }

    /* renamed from: m */
    public final void mo8445m() {
        ug0 ug0;
        vg0 vg0;
        C1861jr jrVar = this.f13221j;
        if ((jrVar == C1861jr.REWARD_BASED_VIDEO_AD || jrVar == C1861jr.INTERSTITIAL || jrVar == C1861jr.APP_OPEN) && this.f13219h.f13874Q && this.f13218g != null && C2694t.m21600i().mo10791V(this.f13217f)) {
            po0 po0 = this.f13220i;
            int i = po0.f12730g;
            int i2 = po0.f12731h;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            String sb2 = sb.toString();
            String a = this.f13219h.f13876S.mo9591a();
            if (this.f13219h.f13876S.mo9592b() == 1) {
                ug0 = ug0.VIDEO;
                vg0 = vg0.DEFINED_BY_JAVASCRIPT;
            } else {
                vg0 = this.f13219h.f13879V == 2 ? vg0.UNSPECIFIED : vg0.BEGIN_TO_RENDER;
                ug0 = ug0.HTML_DISPLAY;
            }
            C2635a S = C2694t.m21600i().mo10788S(sb2, this.f13218g.mo7150w(), "", "javascript", a, vg0, ug0, this.f13219h.f13903j0);
            this.f13222k = S;
            if (S != null) {
                C2694t.m21600i().mo10790U(this.f13222k, (View) this.f13218g);
                this.f13218g.mo7095N0(this.f13222k);
                C2694t.m21600i().mo10785P(this.f13222k);
                this.f13218g.mo6424t("onSdkLoaded", new C3801a());
            }
        }
    }

    /* renamed from: u5 */
    public final void mo5655u5() {
    }
}
