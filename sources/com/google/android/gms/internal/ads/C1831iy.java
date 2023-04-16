package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.iy */
public abstract class C1831iy extends C1514ae implements C1868jy {
    /* renamed from: z5 */
    public static C1868jy m11356z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return queryLocalInterface instanceof C1868jy ? (C1868jy) queryLocalInterface : new C1794hy(iBinder);
    }
}
