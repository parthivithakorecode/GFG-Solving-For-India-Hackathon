package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.xy */
public final class C2387xy extends C2440zd implements C2461zy {
    C2387xy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    /* renamed from: b */
    public final String mo9702b() {
        Parcel n0 = mo12210n0(1, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }

    /* renamed from: d */
    public final String mo9704d() {
        Parcel n0 = mo12210n0(2, mo12207D());
        String readString = n0.readString();
        n0.recycle();
        return readString;
    }

    /* renamed from: e */
    public final List<C2235tv> mo9705e() {
        Parcel n0 = mo12210n0(3, mo12207D());
        ArrayList<C2235tv> createTypedArrayList = n0.createTypedArrayList(C2235tv.CREATOR);
        n0.recycle();
        return createTypedArrayList;
    }
}
