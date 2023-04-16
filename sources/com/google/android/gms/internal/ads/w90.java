package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class w90 extends C2440zd implements y90 {
    w90(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    /* renamed from: C */
    public final void mo10147C(int i) {
        Parcel D = mo12207D();
        D.writeInt(i);
        mo12206C0(2, D);
    }

    /* renamed from: d */
    public final void mo10148d() {
        mo12206C0(1, mo12207D());
    }
}
