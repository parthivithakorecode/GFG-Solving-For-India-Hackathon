package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import p048g2.C2635a;

public final class t50 extends C2440zd implements v50 {
    t50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    /* renamed from: D4 */
    public final void mo10938D4(C2015nx nxVar, C2635a aVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, nxVar);
        C1551be.m6821f(D, aVar);
        mo12206C0(1, D);
    }
}
