package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import p048g2.C2635a;

public final class i40 extends C2440zd implements k40 {
    i40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    /* renamed from: h */
    public final C2635a mo6512h() {
        Parcel n0 = mo12210n0(4, mo12207D());
        C2635a n02 = C2635a.C2636a.m21356n0(n0.readStrongBinder());
        n0.recycle();
        return n02;
    }
}
