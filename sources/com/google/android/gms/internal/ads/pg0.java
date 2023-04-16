package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class pg0 extends C1514ae implements qg0 {
    /* renamed from: z5 */
    public static qg0 m15056z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        return queryLocalInterface instanceof qg0 ? (qg0) queryLocalInterface : new og0(iBinder);
    }
}
