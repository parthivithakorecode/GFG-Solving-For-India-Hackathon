package com.google.ads.mediation;

import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.C1461e;

@Deprecated
/* renamed from: com.google.ads.mediation.b */
public interface C1456b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS extends C1461e> {
    void destroy();

    @RecentlyNonNull
    Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    @RecentlyNonNull
    Class<SERVER_PARAMETERS> getServerParametersType();
}
