package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import p048g2.C2635a;

public final class z50 extends C2440zd implements b60 {
    z50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    /* renamed from: s0 */
    public final boolean mo5726s0(C2635a aVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        Parcel n0 = mo12210n0(2, D);
        boolean g = C1551be.m6822g(n0);
        n0.recycle();
        return g;
    }
}
