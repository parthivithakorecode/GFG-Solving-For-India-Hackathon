package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p048g2.C2635a;

public abstract class mg0 extends C1514ae implements ng0 {
    public mg0() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    /* renamed from: z5 */
    public static ng0 m13267z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return queryLocalInterface instanceof ng0 ? (ng0) queryLocalInterface : new lg0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo8942G0((Intent) C1551be.m6816a(parcel, Intent.CREATOR));
        } else if (i == 2) {
            mo8944e5(C2635a.C2636a.m21356n0(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
        } else if (i != 3) {
            return false;
        } else {
            mo8943d();
        }
        parcel2.writeNoException();
        return true;
    }
}
