package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import p002a1.C0024h;
import p083l1.C3448e;
import p090m1.C3668a;
import p090m1.C3669b;

@Deprecated
public interface CustomEventBanner extends C3668a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(@RecentlyNonNull Context context, @RecentlyNonNull C3669b bVar, String str, @RecentlyNonNull C0024h hVar, @RecentlyNonNull C3448e eVar, Bundle bundle);
}
