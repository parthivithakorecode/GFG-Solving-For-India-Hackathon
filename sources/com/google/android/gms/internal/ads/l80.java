package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class l80 extends C2440zd implements n80 {
    l80(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    /* renamed from: s */
    public final void mo8904s(String str) {
        Parcel D = mo12207D();
        D.writeString(str);
        mo12206C0(1, D);
    }
}
