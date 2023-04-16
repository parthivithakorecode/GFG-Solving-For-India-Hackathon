package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class aa0 extends C1514ae implements ba0 {
    /* renamed from: z5 */
    public static ba0 m5975z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        return queryLocalInterface instanceof ba0 ? (ba0) queryLocalInterface : new z90(iBinder);
    }
}
