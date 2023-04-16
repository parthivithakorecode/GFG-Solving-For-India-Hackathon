package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class hk0 extends C2440zd implements jk0 {
    hk0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    /* renamed from: N */
    public final void mo7951N(int i) {
        Parcel D = mo12207D();
        D.writeInt(i);
        mo12206C0(4, D);
    }

    /* renamed from: b */
    public final void mo7952b() {
        mo12206C0(7, mo12207D());
    }

    /* renamed from: d */
    public final void mo7953d() {
        mo12206C0(6, mo12207D());
    }

    /* renamed from: e */
    public final void mo7954e() {
        mo12206C0(2, mo12207D());
    }

    /* renamed from: f2 */
    public final void mo7955f2(C1605cv cvVar) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, cvVar);
        mo12206C0(5, D);
    }

    /* renamed from: h2 */
    public final void mo7956h2(ck0 ck0) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, ck0);
        mo12206C0(3, D);
    }

    /* renamed from: i */
    public final void mo7957i() {
        mo12206C0(1, mo12207D());
    }
}
