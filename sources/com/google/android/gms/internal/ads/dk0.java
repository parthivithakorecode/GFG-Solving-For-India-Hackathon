package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import p048g2.C2635a;

public final class dk0 extends C2440zd implements fk0 {
    dk0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    /* renamed from: B1 */
    public final void mo6485B1(C2635a aVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        mo12206C0(5, D);
    }

    /* renamed from: B3 */
    public final void mo6486B3(C2238ty tyVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, tyVar);
        mo12206C0(8, D);
    }

    /* renamed from: D2 */
    public final void mo6487D2(C1902kv kvVar, nk0 nk0) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, kvVar);
        C1551be.m6821f(D, nk0);
        mo12206C0(1, D);
    }

    /* renamed from: M1 */
    public final void mo6488M1(uk0 uk0) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, uk0);
        mo12206C0(7, D);
    }

    /* renamed from: Y3 */
    public final void mo6489Y3(C1902kv kvVar, nk0 nk0) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, kvVar);
        C1551be.m6821f(D, nk0);
        mo12206C0(14, D);
    }

    /* renamed from: Z4 */
    public final void mo6490Z4(C2350wy wyVar) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, wyVar);
        mo12206C0(13, D);
    }

    /* renamed from: c */
    public final C2461zy mo6491c() {
        Parcel n0 = mo12210n0(12, mo12207D());
        C2461zy z5 = C2424yy.m20348z5(n0.readStrongBinder());
        n0.recycle();
        return z5;
    }

    /* renamed from: f0 */
    public final void mo6492f0(boolean z) {
        Parcel D = mo12207D();
        C1551be.m6818c(D, z);
        mo12206C0(15, D);
    }

    /* renamed from: y4 */
    public final void mo6493y4(jk0 jk0) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, jk0);
        mo12206C0(2, D);
    }
}
