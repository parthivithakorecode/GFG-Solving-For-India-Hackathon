package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public final class k90 extends C2440zd implements m90 {
    k90(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    /* renamed from: K2 */
    public final void mo8642K2(List<f90> list) {
        Parcel D = mo12207D();
        D.writeTypedList(list);
        mo12206C0(1, D);
    }
}
