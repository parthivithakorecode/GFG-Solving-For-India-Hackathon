package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class m50 extends C2440zd implements o50 {
    m50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    /* renamed from: F2 */
    public final void mo9131F2(e50 e50, String str) {
        Parcel D = mo12207D();
        C1551be.m6821f(D, e50);
        D.writeString(str);
        mo12206C0(1, D);
    }
}
