package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.zp */
public abstract class C2452zp extends C1514ae implements C1600cq {
    public C2452zp() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo6256d();
        } else if (i == 2) {
            mo6255c();
        } else if (i == 3) {
            mo6257t0((C1605cv) C1551be.m6816a(parcel, C1605cv.CREATOR));
        } else if (i == 4) {
            mo6254b();
        } else if (i != 5) {
            return false;
        } else {
            mo6253a();
        }
        parcel2.writeNoException();
        return true;
    }
}
