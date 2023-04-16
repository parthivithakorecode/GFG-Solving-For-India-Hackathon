package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.qx */
public abstract class C2126qx extends C1514ae implements C2163rx {
    /* renamed from: z5 */
    public static C2163rx m15944z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return queryLocalInterface instanceof C2163rx ? (C2163rx) queryLocalInterface : new C2089px(iBinder);
    }
}
