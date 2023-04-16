package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import p048g2.C2635a;

public final class lg0 extends C2440zd implements ng0 {
    lg0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    /* renamed from: G0 */
    public final void mo8942G0(Intent intent) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, intent);
        mo12206C0(1, D);
    }

    /* renamed from: d */
    public final void mo8943d() {
        mo12206C0(3, mo12207D());
    }

    /* renamed from: e5 */
    public final void mo8944e5(C2635a aVar, String str, String str2) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, aVar);
        D.writeString(str);
        D.writeString(str2);
        mo12206C0(2, D);
    }
}
