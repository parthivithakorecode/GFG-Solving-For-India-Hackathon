package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ly */
public abstract class C1942ly extends C1514ae implements C1979my {
    public C1942ly() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    /* renamed from: z5 */
    public static C1979my m12978z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return queryLocalInterface instanceof C1979my ? (C1979my) queryLocalInterface : new C1905ky(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y5 */
    public final boolean mo5080y5(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        if (i == 1) {
            str = mo8814b();
        } else if (i != 2) {
            return false;
        } else {
            str = mo8815d();
        }
        parcel2.writeNoException();
        parcel2.writeString(str);
        return true;
    }
}
