package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import p034e2.C2555l;
import p054h1.C2694t;
import p061i1.C2807f;
import p061i1.C2824w;
import p061i1.C2826y;
import p069j1.C3163g2;
import p083l1.C3448e;
import p083l1.C3457n;
import p095n.C3742c;

public final class zzcaf implements MediationInterstitialAdapter {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Activity f18504a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3457n f18505b;

    /* renamed from: c */
    private Uri f18506c;

    public final void onDestroy() {
        io0.m11126b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    public final void onPause() {
        io0.m11126b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public final void onResume() {
        io0.m11126b("Resuming AdMobCustomTabsAdapter adapter.");
    }

    public final void requestInterstitialAd(Context context, C3457n nVar, Bundle bundle, C3448e eVar, Bundle bundle2) {
        this.f18505b = nVar;
        if (nVar == null) {
            io0.m11131g("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            io0.m11131g("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f18505b.mo6920c(this, 0);
        } else if (!C2555l.m21207a() || !l20.m12506g(context)) {
            io0.m11131g("Default browser does not support custom tabs. Bailing out.");
            this.f18505b.mo6920c(this, 0);
        } else {
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                io0.m11131g("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.f18505b.mo6920c(this, 0);
                return;
            }
            this.f18504a = (Activity) context;
            this.f18506c = Uri.parse(string);
            this.f18505b.mo6929l(this);
        }
    }

    public final void showInterstitial() {
        C3742c a = new C3742c.C3743a().mo14951a();
        a.f21577a.setData(this.f18506c);
        C3163g2.f20465i.post(new tf0(this, new AdOverlayInfoParcel(new C2807f(a.f21577a, (C2824w) null), (C2420yu) null, new sf0(this), (C2826y) null, new po0(0, 0, false, false, false), (eu0) null, (pi1) null)));
        C2694t.m21607p().mo11029n();
    }
}
