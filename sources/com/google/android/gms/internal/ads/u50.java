package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class u50 extends C1514ae implements v50 {
    /* renamed from: z5 */
    public static v50 m17721z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return queryLocalInterface instanceof v50 ? (v50) queryLocalInterface : new t50(iBinder);
    }
}
