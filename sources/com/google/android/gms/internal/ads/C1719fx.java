package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.fx */
public abstract class C1719fx extends C1514ae implements C1756gx {
    public C1719fx() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        if (i != 1) {
            if (i == 2) {
                str = mo6011b();
            } else if (i == 3) {
                boolean h = mo6013h();
                parcel2.writeNoException();
                C1551be.m6818c(parcel2, h);
                return true;
            } else if (i == 4) {
                str = mo6012d();
            } else if (i != 5) {
                return false;
            } else {
                mo6014i1((C1902kv) C1551be.m6816a(parcel, C1902kv.CREATOR), parcel.readInt());
            }
            parcel2.writeNoException();
            parcel2.writeString(str);
            return true;
        }
        mo6010N1((C1902kv) C1551be.m6816a(parcel, C1902kv.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
