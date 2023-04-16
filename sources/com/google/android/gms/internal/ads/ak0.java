package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class ak0 extends C2440zd implements ck0 {
    ak0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    /* renamed from: b */
    public final int mo5306b() {
        Parcel n0 = mo12210n0(2, mo12207D());
        int readInt = n0.readInt();
        n0.recycle();
        return readInt;
    }

    /* renamed from: d */
    public final String mo5307d() {
        Parcel n0 = mo12210n0(1, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }
}
