package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class ih0 extends C1514ae implements jh0 {
    /* renamed from: z5 */
    public static jh0 m11031z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return queryLocalInterface instanceof jh0 ? (jh0) queryLocalInterface : new gh0(iBinder);
    }
}
