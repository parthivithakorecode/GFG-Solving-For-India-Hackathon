package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ax */
public final class C1533ax extends C2440zd implements C1644dx {
    C1533ax(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    /* renamed from: c */
    public final void mo5543c() {
        mo12206C0(1, mo12207D());
    }

    /* renamed from: j0 */
    public final void mo5544j0(C1605cv cvVar) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, cvVar);
        mo12206C0(2, D);
    }
}
