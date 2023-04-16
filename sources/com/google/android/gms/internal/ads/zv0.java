package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zv0 extends C1514ae implements aw0 {
    /* renamed from: z5 */
    public static aw0 m20849z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return queryLocalInterface instanceof aw0 ? (aw0) queryLocalInterface : new yv0(iBinder);
    }
}
