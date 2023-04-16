package com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.C1461e;
import com.google.ads.mediation.C1464f;
import p165y0.C4364c;

@Deprecated
public interface MediationBannerAdapter<ADDITIONAL_PARAMETERS extends C1464f, SERVER_PARAMETERS extends C1461e> extends C1456b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    /* synthetic */ void destroy();

    @RecentlyNonNull
    /* synthetic */ Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    @RecentlyNonNull
    View getBannerView();

    @RecentlyNonNull
    /* synthetic */ Class<SERVER_PARAMETERS> getServerParametersType();

    void requestBannerAd(@RecentlyNonNull C1457c cVar, @RecentlyNonNull Activity activity, @RecentlyNonNull SERVER_PARAMETERS server_parameters, @RecentlyNonNull C4364c cVar2, @RecentlyNonNull C1455a aVar, @RecentlyNonNull ADDITIONAL_PARAMETERS additional_parameters);
}
