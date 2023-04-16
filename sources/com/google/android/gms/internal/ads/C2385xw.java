package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.xw */
public final class C2385xw extends C2440zd implements C2459zw {
    C2385xw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* renamed from: C */
    public final void mo7157C(int i) {
        Parcel D = mo12207D();
        D.writeInt(i);
        mo12206C0(2, D);
    }

    /* renamed from: c */
    public final void mo7158c() {
        mo12206C0(6, mo12207D());
    }

    /* renamed from: e */
    public final void mo7159e() {
        mo12206C0(7, mo12207D());
    }

    /* renamed from: f */
    public final void mo7160f() {
        mo12206C0(3, mo12207D());
    }

    /* renamed from: g */
    public final void mo7161g() {
        mo12206C0(1, mo12207D());
    }

    /* renamed from: h */
    public final void mo7162h() {
        mo12206C0(4, mo12207D());
    }

    /* renamed from: i */
    public final void mo7163i() {
        mo12206C0(5, mo12207D());
    }

    /* renamed from: w */
    public final void mo7164w(C1605cv cvVar) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, cvVar);
        mo12206C0(8, D);
    }
}
