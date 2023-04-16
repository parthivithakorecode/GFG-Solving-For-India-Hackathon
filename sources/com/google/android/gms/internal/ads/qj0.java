package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class qj0 extends C2440zd implements sj0 {
    qj0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    /* renamed from: A */
    public final void mo10291A(int i) {
        Parcel D = mo12207D();
        D.writeInt(i);
        mo12206C0(7, D);
    }

    /* renamed from: d */
    public final void mo10292d() {
        mo12206C0(4, mo12207D());
    }

    /* renamed from: f */
    public final void mo10293f() {
        mo12206C0(6, mo12207D());
    }

    /* renamed from: h */
    public final void mo10294h() {
        mo12206C0(1, mo12207D());
    }

    /* renamed from: i */
    public final void mo10295i() {
        mo12206C0(2, mo12207D());
    }

    /* renamed from: j */
    public final void mo10296j() {
        mo12206C0(8, mo12207D());
    }

    /* renamed from: k */
    public final void mo10297k() {
        mo12206C0(3, mo12207D());
    }

    /* renamed from: r3 */
    public final void mo10298r3(mj0 mj0) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, mj0);
        mo12206C0(5, D);
    }
}
