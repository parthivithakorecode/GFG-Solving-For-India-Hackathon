package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class bh0 extends C1514ae implements ch0 {
    /* renamed from: z5 */
    public static ch0 m6920z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof ch0 ? (ch0) queryLocalInterface : new ah0(iBinder);
    }
}
