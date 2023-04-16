package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import p002a1.C0024h;
import p083l1.C3448e;
import p083l1.C3449f;
import p083l1.C3452i;

@Deprecated
public interface MediationBannerAdapter extends C3449f {
    @RecentlyNonNull
    View getBannerView();

    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(@RecentlyNonNull Context context, @RecentlyNonNull C3452i iVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull C0024h hVar, @RecentlyNonNull C3448e eVar, Bundle bundle2);
}
