package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class h20 extends C1514ae implements i20 {
    /* renamed from: z5 */
    public static i20 m10217z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        return queryLocalInterface instanceof i20 ? (i20) queryLocalInterface : new g20(iBinder);
    }
}
