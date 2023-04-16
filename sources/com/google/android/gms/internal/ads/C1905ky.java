package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ky */
public final class C1905ky extends C2440zd implements C1979my {
    C1905ky(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    /* renamed from: b */
    public final String mo8814b() {
        Parcel n0 = mo12210n0(1, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }

    /* renamed from: d */
    public final String mo8815d() {
        Parcel n0 = mo12210n0(2, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }
}
