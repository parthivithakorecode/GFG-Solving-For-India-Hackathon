package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class wm0 extends C2440zd implements ym0 {
    wm0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    /* renamed from: E2 */
    public final void mo10283E2(String str, String str2, Bundle bundle) {
        Parcel D = mo12207D();
        D.writeString(str);
        D.writeString(str2);
        C1551be.m6819d(D, bundle);
        mo12206C0(3, D);
    }

    /* renamed from: s */
    public final void mo10284s(String str) {
        Parcel D = mo12207D();
        D.writeString(str);
        mo12206C0(2, D);
    }
}
