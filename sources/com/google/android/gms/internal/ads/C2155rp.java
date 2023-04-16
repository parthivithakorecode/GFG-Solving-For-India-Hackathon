package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import p048g2.C2635a;

/* renamed from: com.google.android.gms.internal.ads.rp */
public final class C2155rp extends C2440zd implements C2229tp {
    C2155rp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    /* renamed from: H2 */
    public final void mo9423H2(C2350wy wyVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, wyVar);
        mo12206C0(7, D);
    }

    /* renamed from: X4 */
    public final void mo9424X4(boolean z) {
        Parcel D = mo12207D();
        C1551be.m6818c(D, z);
        mo12206C0(6, D);
    }

    /* renamed from: c2 */
    public final void mo9426c2(C2635a aVar, C1600cq cqVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        C1551be.m6821f(D, cqVar);
        mo12206C0(4, D);
    }

    /* renamed from: d */
    public final C2461zy mo9427d() {
        Parcel n0 = mo12210n0(5, mo12207D());
        C2461zy z5 = C2424yy.m20348z5(n0.readStrongBinder());
        n0.recycle();
        return z5;
    }
}
