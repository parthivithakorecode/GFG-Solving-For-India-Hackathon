package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.vy */
public abstract class C2312vy extends C1514ae implements C2350wy {
    public C2312vy() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    /* renamed from: z5 */
    public static C2350wy m18781z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof C2350wy ? (C2350wy) queryLocalInterface : new C2275uy(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo9103G4((C2161rv) C1551be.m6816a(parcel, C2161rv.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
