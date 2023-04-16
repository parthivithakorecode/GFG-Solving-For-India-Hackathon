package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class i90 extends C1514ae implements j90 {
    public i90() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    /* renamed from: z5 */
    public static j90 m10967z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return queryLocalInterface instanceof j90 ? (j90) queryLocalInterface : new h90(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            mo5992d();
        } else if (i != 3) {
            return false;
        } else {
            mo5993u(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
