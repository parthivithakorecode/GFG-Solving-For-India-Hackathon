package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class m80 extends C1514ae implements n80 {
    /* renamed from: z5 */
    public static n80 m13089z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
        return queryLocalInterface instanceof n80 ? (n80) queryLocalInterface : new l80(iBinder);
    }
}
