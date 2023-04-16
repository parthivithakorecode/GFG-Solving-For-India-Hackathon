package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class lh0 extends C1514ae implements mh0 {
    /* renamed from: z5 */
    public static mh0 m12748z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return queryLocalInterface instanceof mh0 ? (mh0) queryLocalInterface : new kh0(iBinder);
    }
}
