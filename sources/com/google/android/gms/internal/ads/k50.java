package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class k50 extends C1514ae implements l50 {
    /* renamed from: z5 */
    public static l50 m12022z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        return queryLocalInterface instanceof l50 ? (l50) queryLocalInterface : new j50(iBinder);
    }
}
