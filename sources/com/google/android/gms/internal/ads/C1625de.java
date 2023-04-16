package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.de */
public abstract class C1625de extends C1514ae implements C1663ee {
    /* renamed from: z5 */
    public static C1663ee m7850z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return queryLocalInterface instanceof C1663ee ? (C1663ee) queryLocalInterface : new C1588ce(iBinder);
    }
}
