package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class li0 extends C2440zd implements ni0 {
    li0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* renamed from: F0 */
    public final void mo8959F0(vi0 vi0, ri0 ri0) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, vi0);
        C1551be.m6821f(D, ri0);
        mo12206C0(5, D);
    }

    /* renamed from: T0 */
    public final void mo8960T0(String str, ri0 ri0) {
        Parcel D = mo12207D();
        D.writeString(str);
        C1551be.m6821f(D, ri0);
        mo12206C0(7, D);
    }

    /* renamed from: T1 */
    public final void mo8961T1(vi0 vi0, ri0 ri0) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, vi0);
        C1551be.m6821f(D, ri0);
        mo12206C0(6, D);
    }

    /* renamed from: w4 */
    public final void mo8962w4(vi0 vi0, ri0 ri0) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, vi0);
        C1551be.m6821f(D, ri0);
        mo12206C0(4, D);
    }
}
