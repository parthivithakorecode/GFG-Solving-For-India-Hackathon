package com.google.android.gms.internal.ads;

import android.os.Parcel;
import p048g2.C2635a;

public abstract class pe0 extends C1514ae implements qe0 {
    public pe0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo9143z0(C2635a.C2636a.m21356n0(parcel.readStrongBinder()));
        } else if (i == 2) {
            mo9141u(parcel.readString());
        } else if (i == 3) {
            mo9142w((C1605cv) C1551be.m6816a(parcel, C1605cv.CREATOR));
        } else if (i != 4) {
            return false;
        } else {
            mo9140o5(ld0.m12690z5(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
