package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.sx */
public final class C2200sx extends C2440zd implements C2274ux {
    C2200sx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    /* renamed from: q0 */
    public final void mo9569q0(String str, String str2) {
        Parcel D = mo12207D();
        D.writeString(str);
        D.writeString(str2);
        mo12206C0(1, D);
    }
}
