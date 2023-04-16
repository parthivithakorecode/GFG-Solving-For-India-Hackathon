package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import p083l1.C3462s;
import p090m1.C3668a;
import p090m1.C3672e;

@Deprecated
public interface CustomEventNative extends C3668a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(@RecentlyNonNull Context context, @RecentlyNonNull C3672e eVar, String str, @RecentlyNonNull C3462s sVar, Bundle bundle);
}
