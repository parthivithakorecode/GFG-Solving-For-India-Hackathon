package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import p048g2.C2635a;
import p077k2.C3298a;
import p077k2.C3300c;

/* renamed from: com.google.android.gms.dynamite.p */
public final class C1498p extends C3298a {
    C1498p(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: C0 */
    public final C2635a mo5038C0(C2635a aVar, String str, int i, C2635a aVar2) {
        Parcel n0 = mo14302n0();
        C3300c.m24386c(n0, aVar);
        n0.writeString(str);
        n0.writeInt(i);
        C3300c.m24386c(n0, aVar2);
        Parcel D = mo14300D(2, n0);
        C2635a n02 = C2635a.C2636a.m21356n0(D.readStrongBinder());
        D.recycle();
        return n02;
    }

    /* renamed from: Z2 */
    public final C2635a mo5039Z2(C2635a aVar, String str, int i, C2635a aVar2) {
        Parcel n0 = mo14302n0();
        C3300c.m24386c(n0, aVar);
        n0.writeString(str);
        n0.writeInt(i);
        C3300c.m24386c(n0, aVar2);
        Parcel D = mo14300D(3, n0);
        C2635a n02 = C2635a.C2636a.m21356n0(D.readStrongBinder());
        D.recycle();
        return n02;
    }
}
