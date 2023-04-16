package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class oh0 extends C1514ae implements ph0 {
    /* renamed from: z5 */
    public static ph0 m14489z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return queryLocalInterface instanceof ph0 ? (ph0) queryLocalInterface : new nh0(iBinder);
    }
}
