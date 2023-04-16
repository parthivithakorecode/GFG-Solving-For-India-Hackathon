package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class dn0 extends C1514ae implements en0 {
    /* renamed from: z5 */
    public static en0 m7931z5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        return queryLocalInterface instanceof en0 ? (en0) queryLocalInterface : new cn0(iBinder);
    }
}
