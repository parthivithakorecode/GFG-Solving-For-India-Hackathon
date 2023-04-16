package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class cd0 extends C1514ae implements dd0 {
    public cd0() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* renamed from: z5 */
    public static dd0 m7312z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof dd0 ? (dd0) queryLocalInterface : new bd0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterface;
        boolean z;
        if (i != 1) {
            if (i == 2) {
                z = mo5243z(parcel.readString());
            } else if (i == 3) {
                iInterface = mo5240d0(parcel.readString());
            } else if (i != 4) {
                return false;
            } else {
                z = mo5242u(parcel.readString());
            }
            parcel2.writeNoException();
            C1551be.m6818c(parcel2, z);
            return true;
        }
        iInterface = mo5241s(parcel.readString());
        parcel2.writeNoException();
        C1551be.m6821f(parcel2, iInterface);
        return true;
    }
}
