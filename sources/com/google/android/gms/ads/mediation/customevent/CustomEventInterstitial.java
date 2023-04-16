package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import p083l1.C3448e;
import p090m1.C3668a;
import p090m1.C3671d;

@Deprecated
public interface CustomEventInterstitial extends C3668a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(@RecentlyNonNull Context context, @RecentlyNonNull C3671d dVar, String str, @RecentlyNonNull C3448e eVar, Bundle bundle);

    void showInterstitial();
}
