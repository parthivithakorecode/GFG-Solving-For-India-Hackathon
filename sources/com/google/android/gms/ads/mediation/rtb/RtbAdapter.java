package com.google.android.gms.ads.mediation.rtb;

import androidx.annotation.RecentlyNonNull;
import javax.annotation.ParametersAreNonnullByDefault;
import p002a1.C0013a;
import p083l1.C3444a;
import p083l1.C3447d;
import p083l1.C3450g;
import p083l1.C3451h;
import p083l1.C3454k;
import p083l1.C3455l;
import p083l1.C3456m;
import p083l1.C3458o;
import p083l1.C3460q;
import p083l1.C3461r;
import p083l1.C3465v;
import p097n1.C3761a;
import p097n1.C3762b;

@ParametersAreNonnullByDefault
public abstract class RtbAdapter extends C3444a {
    public abstract void collectSignals(@RecentlyNonNull C3761a aVar, @RecentlyNonNull C3762b bVar);

    public void loadRtbBannerAd(@RecentlyNonNull C3451h hVar, @RecentlyNonNull C3447d<C3450g, Object> dVar) {
        loadBannerAd(hVar, dVar);
    }

    public void loadRtbInterscrollerAd(@RecentlyNonNull C3451h hVar, @RecentlyNonNull C3447d<C3454k, Object> dVar) {
        dVar.mo5246a(new C0013a(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadRtbInterstitialAd(@RecentlyNonNull C3456m mVar, @RecentlyNonNull C3447d<C3455l, Object> dVar) {
        loadInterstitialAd(mVar, dVar);
    }

    public void loadRtbNativeAd(@RecentlyNonNull C3458o oVar, @RecentlyNonNull C3447d<C3465v, Object> dVar) {
        loadNativeAd(oVar, dVar);
    }

    public void loadRtbRewardedAd(@RecentlyNonNull C3461r rVar, @RecentlyNonNull C3447d<C3460q, Object> dVar) {
        loadRewardedAd(rVar, dVar);
    }

    public void loadRtbRewardedInterstitialAd(@RecentlyNonNull C3461r rVar, @RecentlyNonNull C3447d<C3460q, Object> dVar) {
        loadRewardedInterstitialAd(rVar, dVar);
    }
}
