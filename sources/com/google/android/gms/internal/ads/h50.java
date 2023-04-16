package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class h50 extends C1514ae implements i50 {
    /* renamed from: z5 */
    public static i50 m10274z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        return queryLocalInterface instanceof i50 ? (i50) queryLocalInterface : new g50(iBinder);
    }
}
