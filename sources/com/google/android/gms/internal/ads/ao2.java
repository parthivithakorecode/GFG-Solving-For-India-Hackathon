package com.google.android.gms.internal.ads;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;

final class ao2 extends PhoneStateListener {

    /* renamed from: a */
    final /* synthetic */ bp2 f4278a;

    /* synthetic */ ao2(bp2 bp2, ym2 ym2) {
        this.f4278a = bp2;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        bp2.m7018c(this.f4278a, true != (overrideNetworkType == 3 || overrideNetworkType == 4) ? 5 : 10);
    }

    public final void onServiceStateChanged(ServiceState serviceState) {
        String serviceState2 = serviceState == null ? "" : serviceState.toString();
        bp2.m7018c(this.f4278a, true != (serviceState2.contains("nrState=CONNECTED") || serviceState2.contains("nrState=NOT_RESTRICTED")) ? 5 : 10);
    }
}
