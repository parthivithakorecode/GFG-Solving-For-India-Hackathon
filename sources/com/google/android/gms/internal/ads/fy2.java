package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class fy2 extends C1514ae implements gy2 {
    /* renamed from: z5 */
    public static gy2 m9438z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.omid.IOmid");
        return queryLocalInterface instanceof gy2 ? (gy2) queryLocalInterface : new ey2(iBinder);
    }
}
