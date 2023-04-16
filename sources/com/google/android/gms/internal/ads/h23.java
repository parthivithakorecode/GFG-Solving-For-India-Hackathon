package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class h23 extends C2440zd {
    h23(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    /* renamed from: M3 */
    public final p23 mo7810M3(m23 m23) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, m23);
        Parcel n0 = mo12210n0(3, D);
        p23 p23 = (p23) C1551be.m6816a(n0, p23.CREATOR);
        n0.recycle();
        return p23;
    }

    /* renamed from: P4 */
    public final void mo7811P4(a23 a23) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, a23);
        mo12206C0(2, D);
    }

    /* renamed from: b3 */
    public final f23 mo7812b3(d23 d23) {
        Parcel D = mo12207D();
        C1551be.m6819d(D, d23);
        Parcel n0 = mo12210n0(1, D);
        f23 f23 = (f23) C1551be.m6816a(n0, f23.CREATOR);
        n0.recycle();
        return f23;
    }
}
