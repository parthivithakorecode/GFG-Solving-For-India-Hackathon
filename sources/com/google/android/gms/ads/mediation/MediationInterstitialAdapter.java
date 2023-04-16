package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import p083l1.C3448e;
import p083l1.C3449f;
import p083l1.C3457n;

@Deprecated
public interface MediationInterstitialAdapter extends C3449f {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(@RecentlyNonNull Context context, @RecentlyNonNull C3457n nVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull C3448e eVar, Bundle bundle2);

    void showInterstitial();
}
