package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import p083l1.C3449f;
import p083l1.C3459p;
import p083l1.C3462s;

@Deprecated
public interface MediationNativeAdapter extends C3449f {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(@RecentlyNonNull Context context, @RecentlyNonNull C3459p pVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull C3462s sVar, Bundle bundle2);
}
