package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.yp */
public final class C2415yp extends C2440zd implements C1600cq {
    C2415yp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    /* renamed from: a */
    public final void mo6253a() {
        mo12206C0(5, mo12207D());
    }

    /* renamed from: b */
    public final void mo6254b() {
        mo12206C0(4, mo12207D());
    }

    /* renamed from: c */
    public final void mo6255c() {
        mo12206C0(2, mo12207D());
    }

    /* renamed from: d */
    public final void mo6256d() {
        mo12206C0(1, mo12207D());
    }

    /* renamed from: t0 */
    public final void mo6257t0(C1605cv cvVar) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, cvVar);
        mo12206C0(3, D);
    }
}
