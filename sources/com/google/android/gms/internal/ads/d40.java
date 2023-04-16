package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public final class d40 extends C2440zd implements g40 {
    d40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* renamed from: e */
    public final String mo6381e() {
        Parcel n0 = mo12210n0(2, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }

    /* renamed from: f */
    public final List<n40> mo6382f() {
        Parcel n0 = mo12210n0(3, mo12207D());
        ArrayList b = C1551be.m6817b(n0);
        n0.recycle();
        return b;
    }
}
