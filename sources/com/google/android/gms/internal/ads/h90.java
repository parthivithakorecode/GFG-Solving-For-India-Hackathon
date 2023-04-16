package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class h90 extends C2440zd implements j90 {
    h90(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    /* renamed from: u */
    public final void mo5993u(String str) {
        Parcel D = mo12207D();
        D.writeString(str);
        mo12206C0(3, D);
    }
}
