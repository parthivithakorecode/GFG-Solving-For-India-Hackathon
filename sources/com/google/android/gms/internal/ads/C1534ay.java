package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ay */
public abstract class C1534ay extends C1514ae implements C1571by {
    public C1534ay() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo5987t0((C1605cv) C1551be.m6816a(parcel, C1605cv.CREATOR));
        } else if (i == 2) {
            mo5986d();
        } else if (i == 3) {
            mo5985c();
        } else if (i == 4) {
            mo5984b();
        } else if (i != 5) {
            return false;
        } else {
            mo5983a();
        }
        parcel2.writeNoException();
        return true;
    }
}
