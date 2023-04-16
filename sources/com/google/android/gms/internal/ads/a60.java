package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class a60 extends C1514ae implements b60 {
    /* renamed from: z5 */
    public static b60 m5870z5(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return queryLocalInterface instanceof b60 ? (b60) queryLocalInterface : new z50(iBinder);
    }
}
