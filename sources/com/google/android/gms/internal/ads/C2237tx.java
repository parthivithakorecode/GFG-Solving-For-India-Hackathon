package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.tx */
public abstract class C2237tx extends C1514ae implements C2274ux {
    public C2237tx() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    /* renamed from: z5 */
    public static C2274ux m17545z5(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return queryLocalInterface instanceof C2274ux ? (C2274ux) queryLocalInterface : new C2200sx(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo9569q0(parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
