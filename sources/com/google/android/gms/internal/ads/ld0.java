package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p048g2.C2635a;

public abstract class ld0 extends C1514ae implements md0 {
    public ld0() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    /* renamed from: z5 */
    public static md0 m12690z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return queryLocalInterface instanceof md0 ? (md0) queryLocalInterface : new kd0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            C2635a b = mo6460b();
            parcel2.writeNoException();
            C1551be.m6821f(parcel2, b);
        } else if (i != 2) {
            return false;
        } else {
            boolean d = mo6461d();
            parcel2.writeNoException();
            C1551be.m6818c(parcel2, d);
        }
        return true;
    }
}
